package com.platform.demeter.dao.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "subscription")
public class SubscriptionEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "user_id", nullable = false)
  private UserEntity user;

  private String communicationMethod;

  private String foodPreferences;

  private boolean isActivated;

  private double latitude;

  private double longitude;
}
