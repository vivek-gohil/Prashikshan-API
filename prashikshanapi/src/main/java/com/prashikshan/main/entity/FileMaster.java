package com.prashikshan.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "files_master")
public class FileMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer filesId;

    private String fileContentType;
    private String fileName;

    @Lob
    private byte[] contentFile;
}