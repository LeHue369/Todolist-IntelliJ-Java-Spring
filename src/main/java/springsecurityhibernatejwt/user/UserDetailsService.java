package springsecurityhibernatejwt.user;

public interface UserDetailsService {
    UserDetails loadUserByUsername(String username);
}
