package first.minproject;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class MinprojectController{
   ArrayList<Student> studentArrayList=new ArrayList<>();
   @PostMapping("/create")
   public Student create(@RequestBody Student student){
      boolean flag=studentArrayList.add(student);
      return flag?student:null;
   }
   @GetMapping("/getAll")
   public ArrayList<Student> getAll(){
      return studentArrayList;
   }
   @PutMapping("/update")
   public String update(@RequestParam String rollNo,@RequestParam boolean present){
      for(Student student:studentArrayList){
         if(student.getRollNO().equals(rollNo)){
            student.setPresent(present);
            return "updated";
         }
      }
      return "rollno not found";
   }

}