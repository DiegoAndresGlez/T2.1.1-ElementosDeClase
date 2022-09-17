public class Ecosystem {

	private String name;

	public static void main(String[] args){
		Ecosystem ecosystem = new Ecosystem();
		Animal animal = new Animal();
		GeographicArea area = new GeographicArea();
		Biome biome = new Biome();
		Plant plant = new Plant();

		ecosystem.setName("Acuatico");
		System.out.println(ecosystem.getName());

		animal.setEspecie("Ballena");
		System.out.println(animal.getEspecie());
		animal.setColor("Azul");
		System.out.println(animal.getColor());
		animal.setPeso(130000);
		System.out.println(""+animal.getPeso()+" kg");
		animal.setTamano(24);
		System.out.println(""+animal.getTamano()+" m");
		
		area.setArea("Hemisferio sur");
		System.out.println(area.getArea());

		biome.setBiome("Oceano");
		System.out.println(biome.getBiome());

		plant.setColor("Blanco");
		System.out.println(plant.getColor());
		plant.setEspecie("Daisy");
		System.out.println(plant.getEspecie());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}