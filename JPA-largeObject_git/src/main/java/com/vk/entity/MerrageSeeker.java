package com.vk.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

//........................................................................

@Data
@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Table(name="Tbl_MerrageSeeker")

//........................................................................

public class MerrageSeeker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
  //  @Column(name="id")
	private Integer id;
    
    @Nonnull
    @Column(name="name", length=30)
    private String name;
    
    @Nonnull
    @Column(name="address",length=30)
    private String address;
    
    @Nonnull
    @Lob
    @Column(name = "photo", columnDefinition = "LONGBLOB")
    private byte[] photo;
    
   
    @Nonnull
    @Lob
    @Column(name = "biodata", columnDefinition = "LONGTEXT")
    private char[] biodata;
    
    @Nonnull
    @Column(name="is_Indian")
    private boolean is_indian;
}
