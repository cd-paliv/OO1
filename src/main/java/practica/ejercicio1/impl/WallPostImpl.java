package practica.ejercicio1.impl;

import practica.ejercicio1.WallPost;

/**
 * Completar esta clase de acuerdo a lo especificado en el cuadernillo
 *
 */
public class WallPostImpl implements WallPost {
	
	private String text;
	private int likes;
	private boolean destacado;
	
	
	/*
	 * Este mensaje se utiliza para que una instancia de Wallpost se muestre de forma adecuada
	 */
    @Override
    public String toString() {
        return "WallPost {" +
            "text: " + getText() +
            ", likes: '" + getLikes() + "'" +
            ", featured: '" + isFeatured() + "'" +
            "}";
    }

	@Override
	public String getText() {
		return this.text;
	}

	@Override
	public void setText(String text) {
		this.text = text;
	}

	@Override
	public WallPost text(String text) {
		this.setText(text);
		return this;
	}

	@Override
	public int getLikes() {
		return likes;
	}

	@Override
	public WallPost like() {
		likes++;
		return this;
	}

	@Override
	public WallPost dislike() {
		if(likes > 0) likes--;
		return this;
	}

	@Override
	public boolean isFeatured() {
		return destacado;
	}

	@Override
	public WallPost toggleFeatured() {
		destacado = ! destacado;
		return this;
	}
}
