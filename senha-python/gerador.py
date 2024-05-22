import random


quant = int(input("Quantos digitos deve possuir sua senha ? "))

vet = [0 for x in range(quant)]

caracteres_evevitados = [34, 39, 40, 44, 46, 41, 47, 58, 91, 92, 93, 94, 96]

for i in range(0, quant):
    vet[i] = random.randint(33, 122)
    while vet[i] == caracteres_evevitados:
        vet[i] = random.randint(33, 122)
    

print("Senha gerada: ", end="")

for i in range(0, quant):
    print(chr(vet[i]), end="")

