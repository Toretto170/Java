/**
 *
 */
class Bollettino {
    constructor(causale,codiceBollettino,codiceContoDestinatario,importo,nomePagatore,numeroCarta) {
        this._codiceBollettino = codiceBollettino;
        this._importo = importo;
        this._causale = causale;
        this._codiceContoDestinatario = codiceContoDestinatario;
        this._nomePagatore = nomePagatore;
        this._numeroCarta = numeroCarta;
    }

    get causale() {
        return this._causale;
    }

    set causale(value) {
        this._causale = value;
    }

    get codiceBollettino() {
        return this._codiceBollettino;
    }

    set codiceBollettino(value) {
        this._codiceBollettino = value;
    }

    get codiceContoDestinatario() {
        return this._codiceContoDestinatario;
    }

    set codiceContoDestinatario(value) {
        this._codiceContoDestinatario = value;
    }

    get importo() {
        return this._importo;
    }

    set importo(value) {
        this._importo = value;
    }

    get nomePagatore() {
        return this._nomePagatore;
    }

    set nomePagatore(value) {
        this._nomePagatore = value;
    }

    get numeroCarta() {
        return this._numeroCarta;
    }

    set numeroCarta(value) {
        this._numeroCarta = value;
    }

    toJSON(){
        return {
            "codiceBollettino": this.codiceBollettino,
            "importo": this.importo,
            "causale": this.causale,
            "codiceContoDestinatario": this.codiceContoDestinatario,
            "nomePagatore": this.nomePagatore,
            "numeroCarta": this.numeroCarta
        }
    }
}

let checkButton = document.getElementById('button-check');
let div = document.getElementById('dati-bollettino');
checkButton.addEventListener('click', () => {
    let b = new Bollettino();
    b.codiceBollettino = document.getElementById('cps-input').value;
    b.importo = Number(document.getElementById('importo-input').value);
    b.causale = document.getElementById('causale-input').value;
    b.codiceContoDestinatario = Number(document.getElementById('cc-input').value);
    fetch(`http://localhost:9022/api/conticorrenti/${b.codiceContoDestinatario}`)
        .then((response) => {
            if (response.status === 404) {
                alert("Il conto non esiste");
                location.reload();
                delete b;
            } else if (response.status === 200) {
                checkButton.remove();
                document.getElementById('cc-input').disabled = true;
                document.getElementById('cps-input').disabled = true;
                document.getElementById('causale-input').disabled = true;
                document.getElementById('importo-input').disabled = true;
                let labelNomePagatore = document.createElement('label');
                let inputNome = document.createElement("input");
                let labelNumeroCarta = document.createElement('label');
                let inputNumeroCarta = document.createElement("input");
                let addBollettino = document.createElement("button");
                addBollettino.type = "button";
                addBollettino.textContent = "Invia Pagamento";
                labelNumeroCarta.textContent = "Numero Carta";
                labelNomePagatore.textContent = "Nome Pagatore";
                inputNome.size = 2;
                inputNumeroCarta.size = 2;
                div.appendChild(labelNomePagatore);
                div.appendChild(inputNome);
                div.appendChild(labelNumeroCarta);
                div.appendChild(inputNumeroCarta);
                div.appendChild(addBollettino);
                addBollettino.addEventListener('click', () => {
                    b.nomePagatore = inputNome.value;
                    b.numeroCarta = Number(inputNumeroCarta.value);
                    console.log(b);
                    console.log(JSON.stringify(b));
                    const options = {
                        method: "POST",
                        headers: {
                            "Content-Type": "application/json"
                        },
                        body:JSON.stringify(b)
                    };
                    fetch(`http://localhost:9022/api/bollettino/add`, options)
                        .then((response) => {
                            if (response.ok) {
                                return response.json();
                            } else {
                                throw new Error("Errore nella richiesta POST");
                            }
                        })
                        .then(() => {
                            let successH1 = document.createElement('h3');
                            successH1.textContent = "Bollettino Aggiunto con successo, Esco dalla pagina";
                            div.appendChild(successH1);
                            setTimeout(() => {
                                location.reload();
                            }, 6000);
                        })
                        .catch((errP) => {
                            console.log('Pfetch problem: ' + errP.message);
                        });
                });
            }
        })
        .catch((err) => {
            console.log('fetch problem: ' + err.message);
        });
});

