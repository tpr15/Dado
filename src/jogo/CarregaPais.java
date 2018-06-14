package jogo;
/** CarregaPais existe o método carregaPais que instancia todos os 24 países para 
 * serem sorteados depois.  */ 
public class CarregaPais {
	public Territorio carregaPais(){
		
		//criando America do sul----------------------------
		
	Pais brasil = new Pais();
	Territorio m = new Territorio();
	
	brasil.setNome("brasil");
	brasil.addString("colombia");
	brasil.addString("argentina");
	brasil.addString("venezuela");
	brasil.setLigacaoMaritima("0");
	brasil.setCor("null");
	brasil.setSoldados(0);
	
	m.addPaises(brasil);
	
	Pais argentina = new Pais();
	
	
	argentina.setNome("argentina");
	argentina.addString("colombia");
	argentina.addString("brasil");
	argentina.addString("venezuela");
	argentina.setLigacaoMaritima("0");
	argentina.setCor("null");
	argentina.setSoldados(0);
	
	m.addPaises(argentina);
	
	
	Pais colombia = new Pais();
	
	
	colombia.setNome("colombia");
	colombia.addString("argentina");
	colombia.addString("brasil");
	colombia.addString("venezuela");
	colombia.setLigacaoMaritima("0");
	colombia.setCor("null");
	colombia.setSoldados(0);
	
	m.addPaises(colombia);
	
	Pais venezuela = new Pais();
	
	
	venezuela.setNome("venezuela");
	venezuela.addString("colombia");
	venezuela.addString("brasil");
	venezuela.addString("argentina");
	venezuela.setLigacaoMaritima("mexico");
	venezuela.setCor("null");
	venezuela.setSoldados(0);
	
	m.addPaises(venezuela);
	
	
	//criando America do norte----------------------------
	
	Pais estadosUnidos = new Pais();
	
	
	estadosUnidos.setNome("estadosUnidos");
	estadosUnidos.addString("mexico");
	estadosUnidos.addString("canada");
	estadosUnidos.addString("groelandia");
	estadosUnidos.setLigacaoMaritima("china");
	estadosUnidos.setCor("null");
	estadosUnidos.setSoldados(0);
	
	m.addPaises(estadosUnidos);
	
	
	Pais groelandia = new Pais();

	
	groelandia.setNome("groelandia");
	groelandia.addString("mexico");
	groelandia.addString("canada");
	groelandia.addString("estadosUnidos");
	groelandia.setLigacaoMaritima("inglaterra");
	groelandia.setCor("null");
	groelandia.setSoldados(0);
	
	m.addPaises(groelandia);
	
	Pais mexico = new Pais();
	
	
	mexico.setNome("mexico");
	mexico.addString("groelandia");
	mexico.addString("canada");
	mexico.addString("estadosUnidos");
	mexico.setLigacaoMaritima("venezuela");
	mexico.setCor("null");
	mexico.setSoldados(0);
	
	m.addPaises(mexico);
	
	
	Pais canada = new Pais();

	
	canada.setNome("canada");
	canada.addString("groelandia");
	canada.addString("mexico");
	canada.addString("estadosUnidos");
	canada.setLigacaoMaritima("0");
	canada.setCor("null");
	canada.setSoldados(0);
	
	m.addPaises(canada);
	
	//criando Europa----------------------------
	
	Pais inglaterra = new Pais();

	
	inglaterra.setNome("inglaterra");
	inglaterra.addString("alemanha");
	inglaterra.addString("ucrania");
	inglaterra.addString("espanha");
	inglaterra.setLigacaoMaritima("groelandia");
	inglaterra.setCor("null");
	inglaterra.setSoldados(0);
	
	m.addPaises(inglaterra);
	
	Pais alemanha = new Pais();

	
	alemanha.setNome("alemanha");
	alemanha.addString("inglaterra");
	alemanha.addString("ucrania");
	alemanha.addString("espanha");
	alemanha.setLigacaoMaritima("0");
	alemanha.setCor("null");
	alemanha.setSoldados(0);
	
	m.addPaises(alemanha);
	
	Pais ucrania = new Pais();
	
	
	ucrania.setNome("ucrania");
	ucrania.addString("inglaterra");
	ucrania.addString("alemanha");
	ucrania.addString("espanha");
	ucrania.setLigacaoMaritima("russia");
	ucrania.setCor("null");
	ucrania.setSoldados(0);
	
	m.addPaises(ucrania);
	
	Pais espanha = new Pais();

	
	espanha.setNome("espanha");
	espanha.addString("inglaterra");
	espanha.addString("alemanha");
	espanha.addString("ucrania");
	espanha.setLigacaoMaritima("marrocos");
	espanha.setCor("null");
	espanha.setSoldados(0);
	
	m.addPaises(espanha);
	
	
	//criando Africa----------------------------
	
	Pais marrocos = new Pais();
	
	marrocos.setNome("marrocos");
	marrocos.addString("argelia");
	marrocos.addString("libia");
	marrocos.addString("egito");
	marrocos.setLigacaoMaritima("espanha");
	marrocos.setCor("null");
	marrocos.setSoldados(0);
	
	m.addPaises(marrocos);
	
	Pais argelia = new Pais();
	
	argelia.setNome("argelia");
	argelia.addString("marrocos");
	argelia.addString("libia");
	argelia.addString("egito");
	argelia.setLigacaoMaritima("0");
	argelia.setCor("null");
	argelia.setSoldados(0);
	
	m.addPaises(argelia);
	
	Pais libia = new Pais();
	
	libia.setNome("libia");
	libia.addString("marrocos");
	libia.addString("argelia");
	libia.addString("egito");
	libia.setLigacaoMaritima("0");
	libia.setCor("null");
	libia.setSoldados(0);
	
	m.addPaises(libia);
	
	Pais egito = new Pais();
	
	egito.setNome("egito");
	egito.addString("marrocos");
	egito.addString("argelia");
	egito.addString("libia");
	egito.setLigacaoMaritima("0");
	egito.setCor("null");
	egito.setSoldados(0);
	
	m.addPaises(egito);
	
	//CRIANDO ASIA------------------
Pais mongolia = new Pais();
	
	mongolia.setNome("mongolia");
	mongolia.addString("india");
	mongolia.addString("siberia");
	mongolia.addString("china");
	mongolia.setLigacaoMaritima("0");
	mongolia.setCor("null");
	mongolia.setSoldados(0);
	
	m.addPaises(mongolia);
	
Pais china = new Pais();
	
	china.setNome("china");
	china.addString("mongolia");
	china.addString("india");
	china.addString("siberia");
	china.setLigacaoMaritima("estadosUnidos");
	china.setCor("null");
	china.setSoldados(0);
	
	m.addPaises(china);
	
Pais india = new Pais();
	
	india.setNome("india");
	india.addString("mongolia");
	india.addString("china");
	india.addString("siberia");
	india.setLigacaoMaritima("borneu");
	india.setCor("null");
	india.setSoldados(0);
	
	m.addPaises(india);
	
Pais siberia = new Pais();
	
	siberia.setNome("siberia");
	siberia.addString("mongolia");
	siberia.addString("china");
	siberia.addString("india");
	siberia.setLigacaoMaritima("0");
	siberia.setCor("null");
	siberia.setSoldados(0);
	
	m.addPaises(siberia);
	
	//criando sul da asia
Pais sumatra = new Pais();
	
	sumatra.setNome("sumatra");
	sumatra.addString("australia");
	sumatra.addString("novaGuine");
	sumatra.addString("borneu");
	sumatra.setLigacaoMaritima("india");
	sumatra.setCor("null");
	sumatra.setSoldados(0);
	
	m.addPaises(sumatra);
	
Pais borneu = new Pais();
	
	borneu.setNome("borneu");
	borneu.addString("australia");
	borneu.addString("novaGuine");
	borneu.addString("sumatra");
	borneu.setLigacaoMaritima("0");
	borneu.setCor("null");
	borneu.setSoldados(0);
	
	m.addPaises(borneu);
	
Pais novaGuine = new Pais();
	
	novaGuine.setNome("novaGuine");
	novaGuine.addString("australia");
	novaGuine.addString("borneu");
	novaGuine.addString("sumatra");
	novaGuine.setLigacaoMaritima("0");
	novaGuine.setCor("null");
	novaGuine.setSoldados(0);
	
	m.addPaises(novaGuine);
	
Pais australia = new Pais();
	
	australia.setNome("australia");
	australia.addString("novaGuine");
	australia.addString("borneu");
	australia.addString("sumatra");
	australia.setLigacaoMaritima("india");
	australia.setCor("null");
	australia.setSoldados(0);
	
	m.addPaises(australia);
	
	
	
	
	return m;

	 
	}
	

}
