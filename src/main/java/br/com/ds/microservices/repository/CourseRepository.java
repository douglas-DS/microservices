package br.com.ds.microservices.repository;

import br.com.ds.microservices.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author Douglas Souza on 27/03/2019
 */
public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {
}
