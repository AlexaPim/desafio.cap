def anagrama(comparar):
    x=0
    print (comparar)
    for i in range (len(comparar)):
        for y in range (i+1, len(comparar)):
            for h in range (1,len(comparar)):
                p1 = list(comparar[y:(y+h)])
                p1.sort()
                str(p1)
                p2 = list(comparar[i:(i+h)])
                p2.sort()
                str(p2)
                if p1 == p2:                    
                    x+=1

    print (x)

palavra= "ifailuhkqq"
anagrama(palavra)