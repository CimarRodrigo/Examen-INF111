def mostrar(n):
    for i in range(len(n)):
        for j in range(len(n[i])):
            print(n[i][j], end=" ")
        print()
    print()

# matriz caracol desde el centro
tam = int(input("Ingrese el tamaño de la matriz: "))

n = []

for i in range(tam):
    n.append([])
    for j in range(tam):
        n[i].append(0)




numeroElementos = tam * tam

posicionColumna = tam - 1
posicionFila = 0


topeIzquierda = 0
topeAbajo = tam - 1
topeDerecha = tam - 1
topeArriba = 1
sw = 0
contador = numeroElementos
for i in range(numeroElementos):
    if sw == 0:
        n[posicionFila][posicionColumna] = contador
        contador -= 1
        if posicionColumna == topeIzquierda:
            sw = 1
            topeIzquierda += 1
            posicionFila += 1
        else:
            posicionColumna -= 1
        continue
    if sw == 1:
        n[posicionFila][posicionColumna] = contador
        contador -= 1
        if posicionFila == topeAbajo:
            sw = 2
            posicionColumna += 1
            topeAbajo -= 1
        else:
            posicionFila += 1
        continue
    if sw == 2:
        n[posicionFila][posicionColumna] = contador
        contador -= 1
        if posicionColumna == topeDerecha:
            sw = 3
            posicionFila -= 1
            topeDerecha -= 1
        else:
            posicionColumna += 1
        continue
    if sw == 3:
        n[posicionFila][posicionColumna] = contador
        contador -= 1
        if posicionFila == topeArriba:
            sw = 0
            posicionColumna -= 1
            topeArriba += 1

        else:
            posicionFila -= 1
        continue

mostrar(n)