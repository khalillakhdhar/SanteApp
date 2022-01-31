package sante;

public class SanteImplement extends SanteModel implements SanteInterface {
	@Override
	public int imc() {
		// TODO Auto-generated method stub
		 return Math.round(this.getPoids()/(this.getTaille()*this.getTaille()));
	}

	@Override
	public String glycemie() {
		// TODO Auto-generated method stub
		if(this.getIndiceG()>1.6)
			return "hyperglycémie";
		else if(this.getIndiceG()<0.6)
			return "hypoglycémie";
		else
			return "normale";
	}

	@Override
	public String interpretation() {
		// TODO Auto-generated method stub
		if(this.imc()>25)
			return "surpoids";
		else if(this.imc()<20)
			return "maigre";
		else
			return "idéale";
		
	}

}
