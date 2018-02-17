package br.com.exercicios.aulab09;

public class Livro implements Publicacao {

	// Atributos
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;

	// Construtor
	public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.pagAtual = 0;
		this.aberto = false;
		this.leitor = leitor;
	}

	// Exibit detalhes do livro e autor
	public String detalhes() {
		return "Livro [titulo=" + titulo + "\n, autor=" + autor + "\n, totPaginas=" + totPaginas + "\n, pagAtual="
				+ pagAtual + "\n, aberto=" + aberto + "\n, leitor=" + leitor.getNome() + "\n, idade="
				+ leitor.getIdade() + "\n, sexo=" + leitor.getSexo() + "]";
	}

	// Metodos Especiais
	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getTotPaginas() {
		return totPaginas;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public boolean isAberto() {
		return aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	@Override
	public void abrir() {
		this.aberto = true;
	}

	@Override
	public void fechar() {
		this.aberto = false;
	}

	@Override
	public void folhear(int p) {
		if (p > this.totPaginas) {
			this.pagAtual = 0;

		} else {
			this.pagAtual = p;
		}

	}

	@Override
	public void avancarPag() {
		if (this.pagAtual < this.totPaginas) {
			this.pagAtual++;
		} else {
			this.pagAtual = 0;

		}

	}

	@Override
	public void voltarPag() {
		if (this.pagAtual <= 0) {
			this.pagAtual = 0;
		} else {
			this.pagAtual--;
		}
	}

}
