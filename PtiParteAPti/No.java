// Criação da Classe Nó da Árvore Binária 
public class No
{
  private long id; // identificação dos elementos
  private Object elemento; // armazenamento dos elementos de cada Nó
  private No esq; // direcionamento filhos à esquerda do Nó
  private No dir; // direcionamento filhos à direita do Nó

  // construindo a classe Nó
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
  // recebendo os identificadores de cada Nó
  public long getId() 
  {
    return this.id;
  }
  // alterando o elemento
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
