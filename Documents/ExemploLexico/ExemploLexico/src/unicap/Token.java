package unicap;

public class Token {

	private String codigo;
	private String lexema;

	public Token() {
	}

	public Token(String lexema) {
		this.lexema = lexema;
	}

	public Token(String codigo, String lexema) {
		this.codigo = String.valueOf(codigo);
		this.lexema = lexema;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo =String.valueOf( codigo);
	}
        public void setCodigo(Integer codigo) {
		this.codigo =String.valueOf( codigo);
	}

	public String getLexema() {
		return lexema;
	}

	public void setLexema(String lexema) {
		this.lexema = lexema;
	}

	@Override
	public String toString() {

		StringBuffer sb = new StringBuffer();

		sb.append("******\n");
		sb.append("<");
		sb.append(this.getCodigo());
		sb.append(", ");
		sb.append(this.getLexema());
                sb.append("  >");
		sb.append("\n******\n");

		return sb.toString();
	}

}
