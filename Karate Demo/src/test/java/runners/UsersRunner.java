package runners;

import com.intuit.karate.junit5.Karate;

class UsersRunner {
//    @Karate.Test
//    Karate runUsers(){
//        return  Karate.run("classpath:features/users.feature");
//    }

//    @Karate.Test
//    Karate runUsersCsv(){
//        return Karate.run("classpath:features/usresCSV.feature");
//    }

//    @Karate.Test
//    Karate runUsersJson(){
//        return Karate.run("classpath:features/usersJSON.feature");
//    }

//    @Karate.Test
//    Karate runUsers(){
//        return  Karate.run("classpath:features");
//    }

//    @Karate.Test
//    Karate testTagsSmoke() {
//        return Karate.run("classpath:features")
//                .tags("@smoke");
//    }


    @Karate.Test
    Karate testTagsRegression() {
        return Karate.run("classpath:features")
                .tags("@regression");
    }

}
