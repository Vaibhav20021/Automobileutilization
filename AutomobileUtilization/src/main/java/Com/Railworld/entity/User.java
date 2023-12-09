package Com.Railworld.entity;

import javax.persistence.Entity;

import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name = "users")

public class User {

		


	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "user_id")
	    private Long userId;

	    @Column(name = "name", unique = true, nullable = false)
	    private String name;

	    @Column(name = "password", nullable = false)
	    private String password;

	    @Column(name = "email", nullable = false)
	    private String email;
	    
	    @Column(name = "mobile", nullable = false)
	    private int mobile;
	    // Getters and setters, and other necessary methods
	    
	    

//	    @Override
//	    public boolean equals(Object o) {
//	        if (this == o) return true;
//	        if (o == null || getClass() != o.getClass()) return false;
//	        User user = (User) o;
//	        return Objects.equals(userId, user.userId);
//	    }

	    public User() {
			super();
			// TODO Auto-generated constructor stub
		}


		
		public User(Long userId, String name, String password, String email, int mobile) {
			super();
			this.userId = userId;
			this.name = name;
			this.password = password;
			this.email = email;
			this.mobile = mobile;
		}

        


		public Long getUserId() {
			return userId;
		}



		public void setUserId(Long userId) {
			this.userId = userId;
		}



		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public String getPassword() {
			return password;
		}



		public void setPassword(String password) {
			this.password = password;
		}



		public String getEmail() {
			return email;
		}



		public void setEmail(String email) {
			this.email = email;
		}



		public int getMobile() {
			return mobile;
		}



		public void setMobile(int mobile) {
			this.mobile = mobile;
		}



		@Override
	    public int hashCode() {
	        return Objects.hash(userId);
	    }
	}

	

