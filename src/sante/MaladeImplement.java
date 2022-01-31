package sante;

public abstract  class MaladeImplement extends SanteModel implements SanteInterface {

	

	@Override
	public String glycemie() {
		// TODO Auto-generated method stub
		if(this.getIndiceG()>2)
			return "hyperglycémie";
		else if(this.getIndiceG()<1)
			return "hypoglycémie";
		else
			return "normale";
	}

	@Override
	public String interpretation() {
		// TODO Auto-generated method stub
				if(this.imc()>30)
					return "surpoids";
				else if(this.imc()<20)
					return "maigre";
				else
					return "idéale";
	}

}
