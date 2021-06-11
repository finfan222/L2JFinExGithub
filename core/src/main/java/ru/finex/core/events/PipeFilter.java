package ru.finex.core.events;

import lombok.RequiredArgsConstructor;

import java.util.function.Predicate;

/**
 * EventFilter.java
 *
 * @author zcxv
 * @date 23.03.2018
 */
@RequiredArgsConstructor
class PipeFilter<Input> implements IEventPipe<Input, Input> {

	private final Predicate<Input> predicate;

	@Override
	public Input process(Input object) {
		return predicate.test(object) ? object : null;
	}

}