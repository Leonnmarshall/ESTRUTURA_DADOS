class Main {
//criando a Árvore Binária
  public static void main(String[] args) {
     ArvoreBinaria a = new ArvoreBinaria(); 
      a.insere(555,"A");
      a.insere(333,"B"); 
      a.insere(111,"C"); 
      a.insere(444,"D");
      a.insere(888,"E");
      a.insere(999,"F"); 

    a.imprimeElementosArvore();
    System.out.println("Altura da Árvore: " + a.alturaArvore());
	System.out.println("Alinhamento à Esquerda: "+ a.totalEsquerda());
  }
}