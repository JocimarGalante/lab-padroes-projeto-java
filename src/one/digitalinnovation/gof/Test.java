package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.Robo;
import one.digitalinnovation.gof.visitor.Circulo;
import one.digitalinnovation.gof.visitor.Forma;
import one.digitalinnovation.gof.visitor.FormaComposta;
import one.digitalinnovation.gof.visitor.Ponto;
import one.digitalinnovation.gof.visitor.Retangulo;
import one.digitalinnovation.gof.visitor.XMLExportVisitor;

public class Test {

	public static void main(String[] args) {

		// Singleton

		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);

		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);

		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);

		// Strategy

		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();

		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();

		// Facade

		Facade facade = new Facade();
		facade.migrarCliente("Venilton", "14801788");

		// Visitor
		Ponto ponto = new Ponto(1, 10, 55);
		Circulo circulo = new Circulo(2, 23, 15, 10);
		Retangulo retangulo = new Retangulo(3, 10, 17, 20, 30);

		FormaComposta formaComposta = new FormaComposta(4);
		formaComposta.add(ponto);
		formaComposta.add(circulo);
		formaComposta.add(retangulo);

		FormaComposta c = new FormaComposta(5);
		c.add(ponto);
		formaComposta.add(c);

		export(circulo, formaComposta);
	}

	private static void export(Forma... formas) {
		XMLExportVisitor exportVisitor = new XMLExportVisitor();
		System.out.println(exportVisitor.export(formas));
	}
}
