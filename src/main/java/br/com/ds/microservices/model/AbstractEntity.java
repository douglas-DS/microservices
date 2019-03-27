package br.com.ds.microservices.model;

import java.io.Serializable;

/**
 * @author Douglas Souza on 27/03/2019
 */
public interface AbstractEntity extends Serializable {
    Long getId();
}
