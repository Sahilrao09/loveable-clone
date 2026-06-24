package com.example.lovable_clone.entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Builder
@Table(name="projects")
public class Project {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false)
    String name;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    User owner;

    Boolean isPublic;

    @CreationTimestamp
    Instant createdAt;
    @UpdateTimestamp
    Instant deletedAt;
    Instant updatedAt;
}
