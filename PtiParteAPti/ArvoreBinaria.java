public class ArvoreBinaria
{
  private No raiz;
//contando os valores das posições à esquerda
  Integer esquerda = 0;
  
  public void insere(long id, Object elemento) // inserindo elementos
  {
    No novoNo = new No(id,elemento,null,null);
    if (raiz == null) {
      raiz = novoNo;
    } else {
      
      No atual = raiz; No pai;
      while (true) {
        
        pai = atual;
       // iniciando inserção à esqueda
        if (id < atual.getId()) { 
          atual = atual.getEsq();
          // verificando valores nulos
          if (atual == null) { 
            pai.setEsq(novoNo);
            return;
          } 
        //iniciando inserção à direita
        } else { 
          
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
    if (atual != null) {
      System.out.println("Id: " + atual.getId()+" Elemento: " + atual.getElemento());
      preFixado(atual.getDir());
	  preFixado(atual.getEsq());
		if(atual.getEsq() != null)
		{		
			 esquerda++;
		}		
    }
  }
//iniciando função para contabilizar o número de raiz à esquerda
private long calcEsquerda(No atual, long a)
  {
    if (atual != null) {
		
        long e;
        e = calcEsquerda(atual.getEsq(),a) + 1;
        return a + e;
    }
    return a;
  } 
  // imprimindo os valores dos elementos da árvore
  public void imprimeElementosArvore() 
  {
    preFixado(raiz);
	System.out.println("Número de nós à esquerda: " + esquerda);
  } 

	  public long totalEsquerda(){
		
		long a = 0;
		return calcEsquerda(raiz, a);
  }
  
} 
