import java.util.Scanner;

public class Admin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner entry = new Scanner (System.in);
		Scanner entryText= new Scanner(System.in);
		int []contador=new int[5];
		Aluno []A = new Aluno[5];
		Professor[]P = new Professor[8];
		Curso [] curVet = new Curso[5];
		boolean controle = true;
		int cont = 0;
		int op;
		int checaCurso;
		int mat;
		String reg;
		curVet[0]= new Curso();
		curVet[0].setCodigo(1);
		curVet[0].setNome("Matando Bill: cinco pontos de pressão para " +
				"explosão do coração");
		
		curVet[1]= new Curso();
		curVet[1].setCodigo(2);
		curVet[1].setNome("Magia não é coisa de moleque!");
		
		
		curVet[2]= new Curso();
		curVet[2].setCodigo(3);
		curVet[2].setNome("Jedi? Nunca será!");;
		
		
		curVet[3]= new Curso();
		curVet[3].setCodigo(4);
		curVet[3].setNome("Kung-Fu for dummies... a garça e outras técnicas");
		
		curVet[4]= new Curso();
		curVet[4].setCodigo(5);
		curVet[4].setNome("Sou mutante e agora!?");
		
		
		
		P[0]= new Professor();
		P[0].setCodigo(1);
		P[0].setNome("Professor Pai Mei");
		P[0].setTitulacao("Mestre");
		
		P[1]= new Professor();
		P[1].setCodigo(2);
		P[1].setNome("Professor Dumbledore");
		P[1].setTitulacao("Especialista");
		
		P[2]= new Professor();
		P[2].setCodigo(3);
		P[2].setNome("Professor Yoda");
		P[2].setTitulacao("Mestre");
		
		P[3]= new Professor();
		P[3].setCodigo(4);
		P[3].setNome("Professor Miyagi");
		P[3].setTitulacao("Mestre");
		
		P[4]= new Professor();
		P[4].setCodigo(5);
		P[4].setNome("Professor Xavier");
		P[4].setTitulacao("Doutor");
		
		P[5]= new Professor();
		P[5].setCodigo(6);
		P[5].setNome("Professor Snape");
		P[5].setTitulacao("Especialista");
		
		P[6]= new Professor();
		P[6].setCodigo(7);
		P[6].setNome("Professor Qui-Gon Jinn");
		P[6].setTitulacao("Mestre");
		
		P[7]= new Professor();
		P[7].setCodigo(8);
		P[7].setNome("Professor Wolverine");
		P[7].setTitulacao("Especialista");
		
		A[0]= new Aluno();
		A[1]= new Aluno();		
		A[2]= new Aluno();
		A[3]= new Aluno();	
		A[4]= new Aluno();
		
	do{
			System.out.println("Qual operação deseja realizar?" +
					"\n 1- Checar Curso" +
					"\n 2- Registrar aluno(*instável)"+
					"\n 3- Listar professores(crescente)" +
					"\n 4- Listar professores(decrescente)" +
					"\n 0- Sair do sistema");
			op = entry.nextInt();
		
			switch (op){
			
			case 1:
				
				int i=0;
				System.out.println("Digite um número de 1 a 5");
				checaCurso = entry.nextInt();
				
				if(checaCurso == 1)
					System.out.println(curVet[0]);		
				if (checaCurso == 2)
					System.out.println(curVet[1]);
				if (checaCurso == 3)
					System.out.println(curVet[2]);
				if (checaCurso == 4)
					System.out.println(curVet[3]);
				if (checaCurso ==5)
					System.out.println(curVet[4]);
				else
					System.out.println("Opção Inválida!");
				do{
					if(curVet[i].checaCodigo(checaCurso)==false){
						System.out.println("Codigo não existente, digite um número de 1 a 5:");
						checaCurso=entry.nextInt();
						}
					}while(curVet[i].checaCodigo(checaCurso)==false);
		
				break;
				
			case 2:
				for (int i1=0; i1<5; i1++){
					
				System.out.println("Digite seu nome");
				String recNome = entryText.nextLine();
				/*A[i1].setNome(entry.nextLine());
					 do{
							if(A[i1].checkName(recNome)==false){
								System.out.println("Seu nome deve ter entre 4 e 30 digitos.");
								recNome=entryText.next();
								}
							}while(A[i1].checkName(recNome)==false);			
					A[i1].setNome(entryText.next(recNome));*/
					
				 System.out.println("Digite seu CPF");
				 String reCpf = entry.next();
				 	do{
				 			if(A[i1].checaCpf(reCpf)==false){
				 				System.out.println("Seu CPF deve ter 11 digitos:");
				 				reCpf=entry.next();
				 				}
							}while(A[i1].checaCpf(reCpf)==false);
				 A[i1].setCpf(entry.next());				
				
				 System.out.println("Digite o código do curso para matricula "+A[i1].getNome());
				 mat = entry.nextInt();				 
				 Curso temp=new Curso();
					for(i1=0;i1<4;i1++){
						if(mat==curVet[i1].getCodigo())
							temp.setNome(curVet[i1].getNome());
							temp.setCodigo(curVet[i1].getCodigo());
				}
					 A[i1].setCurso(temp);
					 //teste de registro...
					 System.out.println("Você se matriculou em: "+temp.getNome());
					 	cont ++;		
					 	System.out.println("Alunos matriculados"+cont);
				}
				break;
			case 3:
				for (int i1=0; i1<8; i1++){
					System.out.println(P[i1]);
				}
				break;
			case 4 :
				for (int i1=7; i1>=0; i1--){
					System.out.println(P[i1]);
				}
				
			case 0:
				System.out.println("'O aprendizado é uma ação contínua.'");
				break;
			default:
				System.out.println("Opção Inválida!");
			}
				System.out.println();
			}while(op!=0);
		System.out.println("Nossa lista de cursos:");
		for (int i=0; i<5; i++){
			System.out.println(curVet[i]);
		}		
		System.out.println("\nObrigado por escolher nossa instituição.");
		
	}
}
	