package almeida.fernando.fitmeapp.enums;

public enum TipoExercicio {

	AEROBICO("Aeróbico"),
	CONDICIONAMENTO("Condicionamento Físico"),
	FORCA("Força");
	
	private String descricao;
	
	private TipoExercicio(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
