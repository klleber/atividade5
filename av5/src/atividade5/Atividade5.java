package atividade5;


public class Atividade5 {

    
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[4];
        
        
        Estudante a1 = new Estudante("Joao","Rua guimaraes");
        a1.addCursoNota("Marketing", 9);
        a1.addCursoNota("Administracao", 8);
        pessoas[0] = a1;
        
        Estudante a2 = new Estudante("Maria","Rua joao");
        a2.addCursoNota("Marketing", 9);
        a2.addCursoNota("Direito", 8);
        pessoas[1] = a2;
        
        Professor p1 = new Professor("Geraldo", "Rua Escola");
        p1.addCurso("Marketing");
        p1.addCurso("Direito");
        pessoas[2] = p1;
        
        Professor p2 = new Professor("Mecanica", "Rua Universitaria");
        p2.addCurso("Administracao");
        p2.addCurso("Medicina");
        pessoas[3] = p2;
        
        for(Pessoa p : pessoas){
            System.out.println(p.toString());
        }
        
        
        System.out.println(retornaCurso(pessoas));
        
        
    }
    
    
    static String retornaCurso(Pessoa[] pessoas){
        
        String texto = "";
        
        for (Pessoa p : pessoas){
            
            if(p.getClass().getName().indexOf("Professor") != -1){
                Professor prof = (Professor) p;
                
                for(String curso : prof.cursos){
                    
                    texto += "\nCurso: "+curso;
                    texto += "\nProfessor: "+prof.getNome();
                    texto += "\nAlunos: ";
                   
                    for (Pessoa p2 : pessoas){
                        if(p2.getClass().getName().indexOf("Estudante") != -1){
                            Estudante estud = (Estudante) p2;
                            for(String curso2 : estud.cursos){
                                if(curso2 == curso){
                                    
                                    texto += "\n"+estud.getNome();
                                    break;
                                }
                            }
                        }
                    }
                    
                    texto += "\n";
                }
            }
        }
        
        return texto;
    }
    
}
