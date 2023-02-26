package com.example.demo.reactive.streams;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ReactiveStreamPrimitivesTest {

	@Test
	public void shouldStreamSingleValue() {
		Mono.just("hello")
			.map(String::toUpperCase)
			.doOnSubscribe(subscription -> System.out.println("==Subscribed"))
			.doOnRequest(request -> System.out.println("==Requested"))
			.doOnSuccess(complete -> System.out.println("==Stream completed"))
			.log()
			.subscribe();
	}
	
	@Test
	public void shouldStremFromGenerator() {
		Flux.just("a","b","c")
			.concatWith(Flux.just("d","e","a"))
			.distinct()
			.log()
			.subscribe();
	}
	
	@Test
	public void shouldStreamFromIterable() {
		Flux.fromIterable(Arrays.asList("a","b","c","d"))
			.repeat(3)
			.filter("a"::equals)
			.map(String::toUpperCase)
			.log()
			.subscribe();
	}
}
