package jogo;

public class SorteiaDado {
	
		private int dado1;
		private int dado2;
		private int dado3;
		
		
		public int getDado1() {
			 dado1 = (int) (Math.random() * 6 + 1);
			 return dado1;
		}

		public int getDado2() {
			dado2 = (int) (Math.random() * 6 + 1);
			return dado2;
		}

		public int getDado3() {
			dado3 = (int) (Math.random() * 6 + 1);
			return dado3;
		}
		
}
