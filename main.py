
from random  import randint

vector = list()
arreglopar = list()
def generateVector():

    for i in range(1,50000):
        vector.append(randint(1,50000))


def getDif():

    generateVector()
    mayor = vector[0]
    menor = vector[0]
    diferencia = 0

    for i in vector:
        if mayor<i:
         mayor = i
        elif menor>i:
            menor = i
    

    diferencia = mayor-menor
    arreglopar.append(mayor)
    arreglopar.append(menor)
    print(arreglopar)
    print(diferencia)
    

getDif()
