package sistemavendas;

import org.hibernate.Session;

public class conecta {
	public static void main(String[] args) {
		Session sessao = null;
		try {
			sessao = HibernateUtil.getSession().openSession();
			System.out.println("Conectou!");
			
		}finally{
			sessao.close();
			System.out.println("Fechou conexão!");
			
		}
		
	}

}
