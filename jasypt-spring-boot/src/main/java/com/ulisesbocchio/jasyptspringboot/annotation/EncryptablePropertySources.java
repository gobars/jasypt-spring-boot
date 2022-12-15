package com.ulisesbocchio.jasyptspringboot.annotation;

import com.ulisesbocchio.jasyptspringboot.configuration.EncryptablePropertySourceConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Container annotation that aggregates several {@link com.ulisesbocchio.jasyptspringboot.annotation.EncryptablePropertySource} annotations.
 *
 * <p>Can be used natively, declaring several nested {@link com.ulisesbocchio.jasyptspringboot.annotation.EncryptablePropertySource} annotations.
 * Can also be used in conjunction with Java 8's support for <em>repeatable annotations</em>,
 * where {@link com.ulisesbocchio.jasyptspringboot.annotation.EncryptablePropertySource} can simply be declared several times on the same
 * {@linkplain ElementType#TYPE type}, implicitly generating this container annotation.
 *
 * @author Ulises Bocchio
 * @see EncryptablePropertySource
 * @version $Id: $Id
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(EncryptablePropertySourceConfiguration.class)
public @interface EncryptablePropertySources {
    EncryptablePropertySource[] value();
}
