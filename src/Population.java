
public class Population {
	
	Individual individuals;
	
	public Population(int populationSize) {
		individuals = new Individual[populationSize];
		
		for (int i = 0; i < size(); i++) {
			Individual newIndividual = new Individual();
			newIndividual.generateIndividual();
			saveIndividual(i, newIndividual);
		}
	}
	
	public Individual getIndividual(int index) {
		return individuals[index];
	}
	
	public Individual getFittest() {
		Individual fittest = individuals[0];
		
		for (int i = 0; i < size(); i++) {
			if (fittest.getFitness() <= getIndividual(i).getFitness()) {
                fittest = getIndividual(i);
            }
		}
		return fittest;
	}
	public int size() {
        return individuals.length;
    }

    // Save individual
    public void saveIndividual(int index, Individual indiv) {
        individuals[index] = indiv;
    }
}
