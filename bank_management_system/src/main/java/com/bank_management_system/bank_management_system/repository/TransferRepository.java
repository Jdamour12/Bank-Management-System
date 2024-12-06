package com.bank_management_system.bank_management_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank_management_system.bank_management_system.entity.Transfer;

public interface TransferRepository extends JpaRepository<Transfer, Long> {

}
