public interface Subject {

	public void registerObserver(Observer o);

	public void removeObserver(Observer o);

	public void notifyObservers();

	/* setters and getters! in the interface? */
	// public void getState();
	// public void setState();
}