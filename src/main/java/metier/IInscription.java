package metier;

import java.util.List;

public interface IInscription {

	public int add(Inscription inscription, int idUser);
	public int delete(int id);
	public int update(Inscription inscription);
	public Inscription findById(int id);
	public List<Inscription> findAll();
}
