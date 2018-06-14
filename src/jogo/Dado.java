package jogo;

public class Dado {
	SorteiaDado d = new SorteiaDado();
	int dado1 = d.getDado1();
	int dado2 = d.getDado2();
	int dado3 = d.getDado3();
	int a;
	int b;
	int c;
	
	public int getDado1() {
		return dado1;
	}

	public int getDado2() {
		return dado2;
	}

	public int getDado3() {
		return dado3;
	}
	
	public void setDado1(int dado1) {
		this.dado1 = dado1;
	}

	public void setDado2(int dado2) {
		this.dado2 = dado2;
	}

	public void setDado3(int dado3) {
		this.dado3 = dado3;
	}

	public Dado comparando(Dado x) {
		if(x.getDado1() >= x.getDado2() && x.getDado1() >= x.getDado3()) {
			 a = x.getDado1();
			 if(x.getDado2() >= x.getDado3()) {
				 b = x.getDado2();
				 c = x.getDado3();
				 x.setDado1(a);
				 x.setDado2(b);
				 x.setDado3(c);
				 
			 }
			 else if(x.getDado3() >= x.getDado2()) {
				 b = x.getDado3();
				 c = x.getDado2();
				 x.setDado1(a);
				 x.setDado2(b);
				 x.setDado3(c);
			 }
			 
			return x;
		}
		else if(x.getDado2() >= x.getDado1() && x.getDado2() >= x.getDado3()) {
			 a = x.getDado2();
			 if(x.getDado1() >= x.getDado3()) {
				 b = x.getDado1();
				 c = x.getDado3();
				 x.setDado1(a);
				 x.setDado2(b);
				 x.setDado3(c);
				 
			 }
			 else if(x.getDado3() >= x.getDado1()) {
				 b = x.getDado3();
				 c = x.getDado1();
				 x.setDado1(a);
				 x.setDado2(b);
				 x.setDado3(c);
			 }
			 
			return x;
		}
		else if(x.getDado3() >= x.getDado2() && x.getDado3() >= x.getDado1()) {
			 a = x.getDado3();
			 if(x.getDado1() >= x.getDado2()) {
				 b = x.getDado1();
				 c = x.getDado2();
				 x.setDado1(a);
				 x.setDado2(b);
				 x.setDado3(c);
				 
			 }
			 else if(x.getDado2() >= x.getDado1()) {
				 b = x.getDado2();
				 c = x.getDado1();
				 x.setDado1(a);
				 x.setDado2(b);
				 x.setDado3(c);
			 }
			 
			return x;
		}
		
		return x;
		
	}

}
