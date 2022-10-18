package com.CABT.Service.CABT.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.hibernate.type.descriptor.sql.VarcharTypeDescriptor;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;

@Data
@Entity
@Table(name ="Bundles")
@NoArgsConstructor
@AutoConfiguration
public class Bundles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id",length=36,unique = true)
    private String id;

    @Column(name="BundleUid",length=36,nullable = false)
    private String bundleUid;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String scopeId;

    @Column(name="ScopeName",nullable = false)
    private String scopeName;

    @Column(name="BundleUid",nullable = false)
    private String bundleAlias;

    @Column(name="BundleName",nullable = false)
    private String bundleName;

    @Column(name="BundleSummary",nullable = false)
    private String bundleSummary;

    @Column(name="StratificationCriteria",nullable = false)
    private String stratificationCriteria;

    @Column(name="IdentificationCriteria",nullable = false,columnDefinition = "Json")
    private String identificationCriteria;

    @Column(name="ExclusionCriteria",nullable = false,columnDefinition = "Json")
    private String exclusionCriteria;

    @Column(name="StatementGroupId",nullable = false,unique = true,length = 36)
    private String statementGroupUid;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="MeasureUid",nullable = false)
    private String measureUid;

    @Column(name="Status",nullable = false,columnDefinition = "enum")
    private String status;

    @Column(name="Version",nullable = false)
    private String version;

    @Column(name="Author",nullable = false,length = 36)
    private String author;

    @CreatedDate
    @Column(name="CreatedAt",nullable = false,columnDefinition = "DATETIME")
    private String createdAt;


    @CreatedBy
    @Column(name="CreatedBy",nullable = false)
    private String createdBy;

    @LastModifiedDate
    @Column(name="UpdatedAt",nullable = true,columnDefinition = "DATETIME")
    private String updatedAt;

    @LastModifiedBy
    @Column(name="UpdatedBy",nullable = true)
    private String updatedBy;

    public Bundles(String id, String bundleUid, String scopeId, String scopeName, String bundleAlias, String bundleName,
                   String bundleSummary, String stratificationCriteria, String identificationCriteria,
                   String exclusionCriteria, String statementGroupUid, String measureUid, String status, String version,
                   String author, String createdAt, String createdBy, String updatedAt, String updatedBy) {
        this.id = id;
        this.bundleUid = bundleUid;
        this.scopeId = scopeId;
        this.scopeName = scopeName;
        this.bundleAlias = bundleAlias;
        this.bundleName = bundleName;
        this.bundleSummary = bundleSummary;
        this.stratificationCriteria = stratificationCriteria;
        this.identificationCriteria = identificationCriteria;
        this.exclusionCriteria = exclusionCriteria;
        this.statementGroupUid = statementGroupUid;
        this.measureUid = measureUid;
        this.status = status;
        this.version = version;
        this.author = author;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBundleUid() {
        return bundleUid;
    }

    public void setBundleUid(String bundleUid) {
        this.bundleUid = bundleUid;
    }

    public String getScopeId() {
        return scopeId;
    }

    public void setScopeId(String scopeId) {
        this.scopeId = scopeId;
    }

    public String getScopeName() {
        return scopeName;
    }

    public void setScopeName(String scopeName) {
        this.scopeName = scopeName;
    }

    public String getBundleAlias() {
        return bundleAlias;
    }

    public void setBundleAlias(String bundleAlias) {
        this.bundleAlias = bundleAlias;
    }

    public String getBundleName() {
        return bundleName;
    }

    public void setBundleName(String bundleName) {
        this.bundleName = bundleName;
    }

    public String getBundleSummary() {
        return bundleSummary;
    }

    public void setBundleSummary(String bundleSummary) {
        this.bundleSummary = bundleSummary;
    }

    public String getStratificationCriteria() {
        return stratificationCriteria;
    }

    public void setStratificationCriteria(String stratificationCriteria) {
        this.stratificationCriteria = stratificationCriteria;
    }

    public String getIdentificationCriteria() {
        return identificationCriteria;
    }

    public void setIdentificationCriteria(String identificationCriteria) {
        this.identificationCriteria = identificationCriteria;
    }

    public String getExclusionCriteria() {
        return exclusionCriteria;
    }

    public void setExclusionCriteria(String exclusionCriteria) {
        this.exclusionCriteria = exclusionCriteria;
    }

    public String getStatementGroupUid() {
        return statementGroupUid;
    }

    public void setStatementGroupUid(String statementGroupUid) {
        this.statementGroupUid = statementGroupUid;
    }

    public String getMeasureUid() {
        return measureUid;
    }

    public void setMeasureUid(String measureUid) {
        this.measureUid = measureUid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }



    public void Bundles(){
        bundleUid = id+version+status;
        scopeId = scopeId+bundleUid;

    }



}

