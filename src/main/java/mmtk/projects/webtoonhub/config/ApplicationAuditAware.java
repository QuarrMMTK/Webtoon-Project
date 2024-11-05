package mmtk.projects.webtoonhub.config;

import mmtk.projects.webtoonhub.user.User;
import org.springframework.data.domain.AuditorAware;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Optional;

/**
 * Author : Name
 * Created At : 05/11/2024, Nov ,08, 36
 * Project Name : WebtoonHub
 **/
public class ApplicationAuditAware implements AuditorAware<Integer> {

    @Override
    public Optional<Integer> getCurrentAuditor() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication instanceof AnonymousAuthenticationToken
                || authentication == null
                || !authentication.isAuthenticated()) {
            return Optional.empty();
        }
        User userPrinciple = (User) authentication.getPrincipal();
        return Optional.ofNullable(userPrinciple.getId());
    }

}
