try{
    if( arquivo.createNewFile() ){
        System.out.println("O arquivo foi criado");
    }else{
        System.out.println("O arquivo não foi criado, talvez ele já exista");
    }
}catch(IOException ex){
    ex.printStackTrace();
}

////////////////////////////////////////////////////////////////////////////////////////

import java.io.File;
 
...
 
File arquivo = new File("texto.txt");
 
if( ! arquivo.exists() ){
    System.out.println("até aqui não foi criado um arquivo");
}

///////////////////////////////////////////////////////////////////////////////////////

File diretorio = new File("pasta");
 
if( diretorio.mkdir() ){
    System.out.println("diretório criado com sucesso");
}else{
    System.out.println("não foi possível criar o diretorio");
}
 
File sub = new File("pasta2"+File.separator+"subpasta");
sub.mkdirs();

//////////////////////////////////////////////////////////////////////////////////////////

File dir = new File( "dir");
 
if( dir.mkdir() ){
    System.out.println("Diretório criado");
}else{
    System.out.println("Diretório não criado");
}
try{
    File file = new File(dir, "file.txt");
    if( file.createNewFile() ){
        System.out.println("Arquivo criado");
    }else{
        System.out.println("Arquivo não criado");
    }       
}catch(IOException ex){
    ex.printStackTrace();
}

/////////////////////////////////////////////////////////////////////////////////////////

File dir = new File("pasta");
if( dir.isDirectory() ){
    String[] arqs = dir.list();
    for(String nome : arqs){
        System.out.println(nome);
    }
}

////////////////////////////////////////////////////////////////////////////////////////

if( arquivo.delete() ){
    System.out.println("O arquivo foi deletado");
}else{
    System.out.println("O arquivo não foi deletado");
}

/////////////////////////////////////////////////////////////////////////////////////////

File novoNome = new File("pasta_renomeada");
diretorio.renameTo( novoNome );

////////////////////////////////////////////////////////////////////////////////////////

File arquivo  new File("texto.txt");
System.out.println( arquivo.getAbsoluteFile() );

/////////////////////////////////////////////////////////////////////////////////////////
