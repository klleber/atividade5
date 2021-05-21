package atividade5;

public class Estudante extends Pessoa{
    
    int numCursos;
    String cursos[];
    int notas[];
    
    public Estudante(String nome, String endereco) {
        super(nome, endereco);
        this.numCursos = 0;
    }
    
    public boolean addCursoNota(String curso, int nota){ 
        if(nota < 0)
            return false;
         if(curso.isEmpty())
            return false;
         
        if(this.numCursos == 0){
            
            this.cursos = new String[1];
            this.notas = new int[1];
            this.cursos[this.numCursos] = curso;
            this.notas[this.numCursos] = nota;
            this.numCursos += 1;
            
            return true;
        }else{
            
            this.numCursos += 1;
            
            String[] tempCursos = new String[this.numCursos];
            int[] tempNotas = new int[this.numCursos];
           
            for(int i = 0; i< this.numCursos-1; i++){
                tempCursos[i] = this.cursos[i];
                tempNotas[i] = this.notas[i];
            }
            
            this.cursos = new String[this.numCursos];
            this.notas = new int[this.numCursos];
            
           
            for(int i =0; i< this.numCursos-1; i++){
                this.cursos[i] = tempCursos[i];
                this.notas[i] = tempNotas[i];
            }
            
            
            this.cursos[this.numCursos-1] = curso;
            this.notas[this.numCursos-1] = nota;
            
            return true;
        }
    }
    
    public void imprimirNotas(){
        System.out.println("Notas:");
        for(int nota : this.notas){
            System.out.println(nota);
        }
    }
    
    public double getMediaNota(){
        double media = 0;
        for(int nota : this.notas){
            media += nota;
        }
        media /= this.numCursos;
        
        return media;
    }
    
    public String toString(){
        return this.getClass()+" {Nome: "+this.nome+" | Endereco: "+this.endereco+"}";
    }
    
}
