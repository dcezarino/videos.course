package br.com.exerciciosaulab14;

public class Video implements AcoesVideo {

	private String titulo;
	private int avaliacao;
	private int views;
	private int curtidas;
	private boolean reproduzinho;

	public Video(String titulo) {
		this.titulo = titulo;
		this.avaliacao = 1;
		this.views = 0;
		this.curtidas = 0;
		this.reproduzinho = false;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public int getViews() {
		return views;
	}

	public int getCurtidas() {
		return curtidas;
	}

	public boolean isReproduzinho() {
		return reproduzinho;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAvaliacao(int avaliacao) {
		int nova;
		nova = (int) ((this.avaliacao + avaliacao)/this.views);
		this.avaliacao = nova;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}

	public void setReproduzinho(boolean reproduzinho) {
		this.reproduzinho = reproduzinho;
	}

	@Override
	public void play() {
		this.reproduzinho = true;
	}

	@Override
	public void pause() {
		this.reproduzinho = false;
	}

	@Override
	public void like() {
		this.curtidas++;
	}

	// Sobrepondo um metodo que ja esta acima
	@Override
	public String toString() {
		return "Video [titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas
				+ ", reproduzinho=" + reproduzinho + "]";
	}

}
