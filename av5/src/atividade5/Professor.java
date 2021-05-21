package atividade5;


public class Professor extends Pessoa{
    
    int numCursos;
    String cursos[];
    
    public Professor(String nome, String endereco) {
        super(nome, endereco);
        this.numCursos = 0;
    }
    
    public boolean addCurso(String curso){ 

         if(curso.isEmpty())
            return false;
         
        if(this.numCursos == 0){
            this.cursos = new String[1];
            this.cursos[0] = curso;
            this.numCursos += 1;
            return true;
        }else{
            this.numCursos += 1;
            
            
            String[] tempCursos = new String[this.numCursos];
            
             for(int i =0; i< this.numCursos-1; i++){
                tempCursos[i] = this.cursos[i];
            }
            
            
            this.cursos = new String[this.numCursos];
            
           
            for(int i =0; i< this.numCursos-1; i++){
                this.cursos[i] = tempCursos[i];
            }
            
            this.cursos[this.numCursos-1] = curso;
            
            return true;
        }
    }
    
    public boolean removeCurso(String curso){ 
        
        int posicao = -1;
        
        for(int i = 0; i<this.numCursos; i++){
            if(this.cursos[i] == curso){
                posicao = i;
                break;
            }
        }
        if(posicao == -1){
            return false;
        }
      
        this.numCursos -= 1;
        String[] tempCursos = new String[this.numCursos];
        
        
        int validador = 0;
        for(int i = 0; i<this.numCursos; i++){
            
            if(i == posicao){
                validador += 1;
            }
           
            tempCursos[i] = this.cursos[i+validador];
        }
        
        this.cursos = tempCursos;
        
        return true;
        
    }
    
    public String toString(){
        return this.getClass()+" {Nome: "+this.nome+" | Endereço: "+this.endereco+"}";
    }
}
