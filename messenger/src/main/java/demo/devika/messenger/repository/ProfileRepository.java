/**
 * 
 */
package demo.devika.messenger.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.devika.messenger.model.Profile;

/**
 * @author abc
 *
 */
public interface ProfileRepository extends JpaRepository<Profile, Long> {

}
