// Implementando a classe Nó da Árvore Binária 
public class No
{
  private long id; // identificação do elemento
  private Object elemento; // armazenamento do elemento de cada Nó
  private No esq; // direcionamento filhos à esquerda do Nó
  private No dir; // direcionamento filhos à direita do Nó

  public No(long id, Object elemento, No esq, No dir) 
  {
    this.id = id;
    this.elemento = elemento; 
    this.esq = esq;
    this.dir = dir;
  }
  // alterando o identificador do Nó
  public void setId(long id) 
  {
    this.id = id;
  }
  // recebendo o identificador do Nó
  public long getId() 
  {
    return this.id;
  }
  // Alterando o elemento
  public void setElemento(Object elemento) 
  {
    this.elemento = elemento;
  }
 // recebendo os elementos de cada Nó
  public Object getElemento() 
  {
    return elemento;
  }
  // alterando o filho esquerdo do Nó
  public void setEsq(No esq) 
  {
    this.esq = esq;
  }
  // recebendo o filho esquerdo do Nó
  public No getEsq() 
  {
    return esq;
  }
  // alterando o filho direito do Nó
  public void setDir(No dir) 
  {
    this.dir = dir;
  }
  // recebendo o filho direito do Nó
  public No getDir() 
  {
    return dir;
  }
  
}
