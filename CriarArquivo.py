
try: 
    nome_arquivo = input('Informe o nome e o formato do arquivo: ')
    arquivo = open(nome_do_arquivo, '+r')
  
except FileNotFoundError:
   arquivo = open(nome_arquivo, 'w+')
   arquivo.writelines(u)
  
arquivo.write(input('Linha 1: ')+"\n") #Usuário digita na linha 
arquivo.write(input('Linha 2: ')+"\n") #Usuário digita na linha 
arquivo.write(input('Linha 3: ')+"\n") #Usuário digita na linha 
arquivo.write(input('Linha 4: ')+"\n") #Usuário digita na linha 
arquivo.write(input('Linha 5: ')+"\n") #Usuário digita na linha 

arquivo.close()
