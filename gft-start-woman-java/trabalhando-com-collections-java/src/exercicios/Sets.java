package exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
	public static void arcoIris() {
		Set<String> cores = new HashSet<>() {{
			add("Amarelo");
			add("Laranja");
			add("Vermelho");
			add("Violeta");
			add("Verde");
			add("Azul");
			add("Anil");
		}};
		
		Iterator<String> it = cores.iterator(); // A
		System.out.println("Cores do arco-iris:");
		while(it.hasNext()) {
			String next = it.next();
			System.out.println(next);
		}
		
		System.out.println("O arco iris tem " + cores.size() + " cores."); // B
		
		System.out.println("Cores em ordem alfabetica:"); // C
		Set<String> coresOrdenadas = new TreeSet<>(cores);
		Iterator<String> itOrdenado = coresOrdenadas.iterator();
		while(itOrdenado.hasNext()) {
			String next = itOrdenado.next();
			System.out.println(next);
		}
		
		System.out.println("Cores na ordem inversa que foi informada:"); // D
		Set<String> coresInsercao = new LinkedHashSet<String>() {{
			add("Amarelo");
			add("Laranja");
			add("Vermelho");
			add("Violeta");
			add("Verde");
			add("Azul");
			add("Anil");
		}};
		
		List<String> coresLista = new ArrayList<>(coresInsercao);
		Collections.reverse(coresLista);
		Iterator<String> itLista = coresLista.iterator();
		while(itLista.hasNext()) {
			String next = itLista.next();
			System.out.println(next);
		}
		
		System.out.println("Cores que comecam com v:"); // E
		for(String cor : cores) {
			if(cor.startsWith("V")) { // meu v e maiusculo pelo jeito q estao as strings
				System.out.println(cor);
			}
		}
		
		System.out.println("Deletando cores que nao comecam com v:"); // F
		Iterator<String> it2 = cores.iterator();
		while(it2.hasNext()) {
			if(!it2.next().startsWith("V")) { // meu v e maiusculo pelo jeito q estao as strings
				it2.remove();
			}	
		}
		System.out.println(cores); // teste
		
		System.out.println("Limpando os conjuntos."); // G
		cores.clear();
		coresOrdenadas.clear();
		coresInsercao.clear();
		
		System.out.println("O conjunto 1 esta vazio? " + cores.isEmpty()); // H
		System.out.println("O conjunto 2 esta vazio? " + coresOrdenadas.isEmpty());
		System.out.println("O conjunto 3 esta vazio? " + coresInsercao.isEmpty());
		
	}

	public static void linguagem() {
		Set<LinguagemFavorita> linguagens = new HashSet<>() {{	
			add(new LinguagemFavorita("Python", 1991, "Pycharm"));
			add(new LinguagemFavorita("JavaScript", 1995, "IntelliJ"));
			add(new LinguagemFavorita("Java", 1991, "Visual Studio Code"));
		}};
		
		System.out.println("Ordem de insercao:"); // A
		Set<LinguagemFavorita> linguagensOrd = new LinkedHashSet<>();
		linguagensOrd.add(new LinguagemFavorita("Python", 1991, "Pycharm"));
		linguagensOrd.add(new LinguagemFavorita("JavaScript", 1995, "IntelliJ"));
		linguagensOrd.add(new LinguagemFavorita("Java", 1991, "Visual Studio Code"));
		
		for(LinguagemFavorita l : linguagensOrd) {
			System.out.println(l);
		}
		
		System.out.println("Ordem natural:"); // B
		Set<LinguagemFavorita> linguagensTree = new TreeSet<>();
		linguagensTree.add(new LinguagemFavorita("Python", 1991, "Pycharm"));
		linguagensTree.add(new LinguagemFavorita("JavaScript", 1995, "IntelliJ"));
		linguagensTree.add(new LinguagemFavorita("Java", 1991, "Visual Studio Code"));
		
		for(LinguagemFavorita l : linguagensTree) {
			System.out.println(l);
		}
		
		System.out.println("Ordem IDE:"); // C
		Set<LinguagemFavorita> linguagensIde = new TreeSet<>(new ComparatorIde());
		linguagensIde.add(new LinguagemFavorita("Python", 1991, "Pycharm"));
		linguagensIde.add(new LinguagemFavorita("JavaScript", 1995, "IntelliJ"));
		linguagensIde.add(new LinguagemFavorita("Java", 1991, "Visual Studio Code"));
		
		for(LinguagemFavorita l : linguagensIde) {
			System.out.println(l);
		}
		
		System.out.println("Ordem Ano e Nome:"); // D
		Set<LinguagemFavorita> linguagensAnoNome = new TreeSet<>(new ComparatorAnoNome());
		linguagensAnoNome.add(new LinguagemFavorita("Python", 1991, "Pycharm"));
		linguagensAnoNome.add(new LinguagemFavorita("JavaScript", 1995, "IntelliJ"));
		linguagensAnoNome.add(new LinguagemFavorita("Java", 1991, "Visual Studio Code"));
		
		for(LinguagemFavorita l : linguagensAnoNome) {
			System.out.println(l);
		}
		
		System.out.println("Ordem Nome, Ano, IDE:"); // E
		Set<LinguagemFavorita> linguagensNomeAnoIde = new TreeSet<>(new ComparatorNomeAnoIde());
		linguagensNomeAnoIde.add(new LinguagemFavorita("Python", 1991, "Pycharm"));
		linguagensNomeAnoIde.add(new LinguagemFavorita("JavaScript", 1995, "IntelliJ"));
		linguagensNomeAnoIde.add(new LinguagemFavorita("Java", 1991, "Visual Studio Code"));
		
		for(LinguagemFavorita l : linguagensNomeAnoIde) {
			System.out.println(l);
		}
		
		
	}	
	
}

class LinguagemFavorita implements Comparable<LinguagemFavorita>{
	public String nome;
	public int anoDeCriacao;
	public String ide;
	
	public LinguagemFavorita(String nome, int anoDeCriacao, String ide) {
		this.nome = nome;
		this.anoDeCriacao = anoDeCriacao;
		this.ide = ide;
	}

	 @Override
	 public String toString() {
		 return "{" +
	     "nome='" + nome + '\'' +
	     ", anoDeCriacao=" + anoDeCriacao +
	     ", ide='" + ide + '\'' +
	     '}';
	 }

	 public int compareTo(LinguagemFavorita linguagemFavorita) {
	        return this.nome.compareTo(linguagemFavorita.nome);
	    }

	 @Override
	 public boolean equals(Object o) {
	     if (this == o) return true;
	     if (o == null || getClass() != o.getClass()) return false;
	     LinguagemFavorita that = (LinguagemFavorita) o;
	     return nome.equals(that.nome);
	 }

	 @Override
	 public int hashCode() {
	     return Objects.hash(nome);
	 }
}

class ComparatorIde implements Comparator<LinguagemFavorita>{
		@Override
		public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
			return lf2.ide.compareToIgnoreCase(lf2.ide);
		}
}

class ComparatorAnoNome implements Comparator<LinguagemFavorita>{
	@Override
	public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
		int ano = Integer.compare(lf1.anoDeCriacao, lf2.anoDeCriacao);
		
		if(ano != 0) {
			return ano;
		}
		
		return lf1.nome.compareToIgnoreCase(lf2.nome);
	}
}

class ComparatorNomeAnoIde implements Comparator<LinguagemFavorita>{
	@Override
	public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
		int nome = lf1.nome.compareToIgnoreCase(lf2.nome);
		int ano = Integer.compare(lf1.anoDeCriacao,  lf2.anoDeCriacao);
		
		if (nome != 0) {
			return nome;
		}
		
		if(ano != 0) {
			return ano;
		}
		return lf2.ide.compareToIgnoreCase(lf2.ide);
	}
}