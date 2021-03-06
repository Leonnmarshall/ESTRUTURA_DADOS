// Criação da classe Árvore Binária, utilizando o onstrutor e a função insere() 
public class ArvoreBinaria
{
  private No raiz;
  Integer contador = 0;
  String espaco = "\t";
  
  public ArvoreBinaria() 
  {
    this.raiz = null; // iniciando a Árvore Binária vazia
  }
  //inserindo elementos
  public void insere(long id, Object elemento) 
  {
    No novoNo = new No(id,elemento,null,null);
    if (raiz == null) {
      raiz = novoNo;
    } else {
      
      No atual = raiz; No pai;
      while (true) {
        
        pai = atual;
        // inserindo  valores à esquerda
        if (id < atual.getId()) { 
          atual = atual.getEsq();
          // análisando presença de valores nulos
          if (atual == null) { 
            pai.setEsq(novoNo);
            return;
          } 
        } else { 
          // inserindo valores à direita
          atual = atual.getDir();
          
          if (atual == null) { 
            pai.setDir(novoNo);
            return;
          }
        }
      }
    }
  } 

  private void preFixado(No atual) // inicio de caminho pré-fixado da Árvore Binária
  {
//criando objeto para somar e subtrair os valores da variável contador
	String repete = new String(new char[contador]).replace("\0", espaco);

    if (atual != null) {
	  contador++;
//determinando as posições da raiz
      System.out.println(repete + atual.getId());
      preFixado(atual.getEsq());	  
      preFixado(atual.getDir());
	  contador--;
    }
	if(atual == null){
		System.out.println(repete + "-");
	}

  } 
// imprimindo valores dos elementos da árvore
  public void imprimeElementosArvore() 
  {
    preFixado(raiz);
  } 
  // calculando altura da Árvore
  private long calcAltura(No atual, long a) 
  {
    if (atual != null) {
        long e, d;
        e = calcAltura(atual.getEsq(),a) + 1;
        d = calcAltura(atual.getDir(),a) + 1;
      if (e > d) {
        return a + e;
      } else {
        return a + d;
      }
    }
    return a;
  } 
// calculando o alinahmento da esquerda
  private long calcEsq(No atual, long a) 
  {
    if (atual != null) {
        long e, d;
        e = calcEsq(atual.getEsq(),a)+1;
        return a+e;

    }
    return a;
}
  
  
  public long alturaArvore()
  {
    long a = 0;
	System.out.println("  ");
    return calcAltura(raiz,a);
  } 
		
  public long totalEsquerda(){
		
		long es = 0;
		return calcEsq(raiz, es);
  }

  
}
