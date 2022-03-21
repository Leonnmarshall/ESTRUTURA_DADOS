class Main {
  public static void main(String[] args) {
    // iniciando criação da Árvore Binária
     ArvoreBinaria a = new ArvoreBinaria(); 
      a.insere(10,"A");
      a.insere(5,"B"); 
      a.insere(9,"C"); 
      a.insere(2,"D");
      a.insere(7,"E");
      a.insere(12,"F"); 
      a.insere(6,"G");
      a.insere(8,"H");
      a.insere(15,"F"); 
      a.insere(4,"G");
      a.insere(1,"H");
      a.imprimeElementosArvore();
	  System.out.println("Quantidade de nós à esquerda: "+ a.totalEsquerda());
  }
}