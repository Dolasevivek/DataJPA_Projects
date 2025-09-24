package com.vk.entity;


import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

//..............................................................................
@Entity
@Data
@Table(name="Tbl_JobSeeker")
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
//..............................................................................


public class JobSeeker {
   
	@Column(name="Id")
    @Id // ... Taking Id Column as primary key column ....
   //  @GeneratedValue(strategy = GenerationType.AUTO)// it will generate id value 1,2,52
   // @SequenceGenerator(name="gen1",sequenceName="JSID_SEQUENCE1",initialValue = 1000,allocationSize = 1)
	//@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	@GeneratedValue(strategy = GenerationType.IDENTITY)// it works only when autogeneration is possible
	
	private Integer id;
    
    @NonNull
    @Column(name="name",length=30) 
    private String name;
    
    @NonNull
    @Column(name="address",length=30)
    private String address;
    
    @NonNull
    @Transient // It will not participate in any persistance operation
    @Column(name="qualification")
    private String qualification;
    
    @NonNull
    @Column(name="mobile")
    private Long mobile;
    
    @NonNull
    @Column(name="salary")
    private double salary;
    
}
