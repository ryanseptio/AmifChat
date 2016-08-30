package com.badoo.amif.data.repo.annotations;

import com.badoo.amif.data.repo.DelegatingRepository;
import com.badoo.amif.data.repo.Query;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Used to annotated methods on a data source so they can be registered on a {@link com.badoo.amif.data.repo.DelegatingRepository} using
 * {@link HandlesUtil#processClass(DelegatingRepository, Class, Object)}.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Handles {

    Class<? extends Query> value();
}
