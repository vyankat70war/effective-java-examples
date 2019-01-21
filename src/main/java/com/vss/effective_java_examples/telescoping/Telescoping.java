package com.vss.effective_java_examples.telescoping;

public class Telescoping {
	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbs;

	public Telescoping(int servingSize, int servings){
		this(servingSize,servings,0);
	}

	public Telescoping(int servingSize, int servings, int calories) {
		this(servingSize,servings,calories,0);
	}

	public Telescoping(int servingSize, int servings, int calories, int fat) {
		this(servingSize,servings,calories,fat,0);
	}

	public Telescoping(int servingSize, int servings, int calories, int fat, int sodium) {
		this(servingSize,servings,calories,fat,sodium,0);
	}

	public Telescoping(int servingSize, int servings, int calories, int fat, int sodium, int carbs) {
		this.servingSize = servingSize;
		this.servings = servings;
		this.calories = calories;
		this.fat = fat;
		this.sodium = sodium;
		this.carbs = carbs;
	}
}
