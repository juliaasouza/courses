package exercicios;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Maps {
	public static void populacoes() {
		Map<String, Integer> populacoes = new HashMap<String, Integer>(){{
			put("PE", 9616621);
			put("AL", 3351543);
			put("CE", 9187103);
			put("RN", 3534265);		
		}};
		
		System.out.println(populacoes);
		
		System.out.println("Substituindo a populacao do RN:");
		populacoes.put("RN", 3534165);
		System.out.println(populacoes);
		
		System.out.println("O estado da PB esta no dicionario? " + populacoes.containsKey("PB"));
		System.out.println("Adicionando o estado PB.");
		populacoes.put("PB", 4039277);
		System.out.println(populacoes);
		
		System.out.println("Populacao de PE: " + populacoes.get("PE"));
		
		System.out.println("Estados e populacoes em ordem de insercao:");
		Map<String, Integer> populacoesInsercao = new LinkedHashMap<String, Integer>(){{
			put("PE", 9616621);
			put("AL", 3351543);
			put("CE", 9187103);
			put("RN", 3534265);
			put("PB", 4039277);
		}};		
		System.out.println(populacoesInsercao);
		
		System.out.println("Estados e populacoes em ordem alfabetica:");
		TreeMap<String, Integer> populacoesOrdenado = new TreeMap<String, Integer>(populacoes);
		System.out.println(populacoesOrdenado);
		
		int menor = Collections.min(populacoes.values());
		String estadoMenor = "";
		Set<Entry<String, Integer>> entries = populacoes.entrySet();
		for(Entry<String, Integer> entry : entries) {
			if(entry.getValue().equals(menor)) {
				estadoMenor = entry.getKey();
			}
		}		
		System.out.println("Estado com a menor populacao: " + estadoMenor + " - " + menor);
		
		int maior = Collections.max(populacoes.values());
		String estadoMaior = "";
		Set<Entry<String, Integer>> entries2 = populacoes.entrySet();
		for(Entry<String, Integer> entry : entries2) {
			if(entry.getValue().equals(maior)) {
				estadoMaior = entry.getKey();
			}
		}		
		System.out.println("Estado com a maior populacao: " + estadoMaior + " - " + maior);
		
		Collection<Integer> quantidades = populacoes.values();
		int acumulador = 0;
		for(int q : quantidades) {
			acumulador += q;
		}
		System.out.println("Soma de todas as populacoes: " + acumulador);
		
		System.out.println("Media das populacoes: " + acumulador/populacoes.size());
		
		System.out.println("Removendo os estados com populacao inferior a 4.000.000:");
		Iterator<Integer> it = populacoes.values().iterator();
		while(it.hasNext()) {
			if(it.next() <= 4000000) {
				it.remove();
			}
		}
		System.out.println(populacoes);
		
		System.out.println("Esvaziando o map:");
		populacoes.clear();
		
		System.out.println("O map esta vazio? " + populacoes.isEmpty());
		
		
		
	}

}
