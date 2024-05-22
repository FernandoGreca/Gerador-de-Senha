from flask import Flask, render_template
import random

app = Flask(__name__)

@app.route("/")
def index():
    return render_template("index.html")

@app.route("/gerar", methods=["POST"])
def gerar():
    quant = 10

    vet = [0 for x in range(quant)]
    tev = [0 for x in range(quant)]

    caracteres_evevitados = [34, 39, 40, 44, 46, 41, 47, 58, 91, 92, 93, 94, 96]

    for i in range(0, quant):
        vet[i] = random.randint(33, 122)
        while vet[i] == caracteres_evevitados:
            vet[i] = random.randint(33, 122)
    

    for i in range(0, quant):
        tev[i] = chr(vet[i])
    
    return render_template("index.html", msg=tev)

app.run(debug=True)






