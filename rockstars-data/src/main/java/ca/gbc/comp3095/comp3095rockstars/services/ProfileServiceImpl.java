package ca.gbc.comp3095.comp3095rockstars.services;

import ca.gbc.comp3095.comp3095rockstars.model.Profile;
import ca.gbc.comp3095.comp3095rockstars.repository.ProfileRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class ProfileServiceImpl implements ProfileService{

    private final ProfileRepository profileRepository;

    public ProfileServiceImpl(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @Override
    public Set<Profile> findAll() {

        Set<Profile> profiles = new HashSet<>(profileRepository.findAll());
        return profiles;
    }

    @Override
    public Profile findById(Long aLong) {
        return null;
    }

    @Override
    public void delete(Profile object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}