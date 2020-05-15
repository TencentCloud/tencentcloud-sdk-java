/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.msp.v20180319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegisterMigrationTaskRequest extends AbstractModel{

    /**
    * 任务类型，取值database（数据库迁移）、file（文件迁移）、host（主机迁移）
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 任务名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 服务提供商名称
    */
    @SerializedName("ServiceSupplier")
    @Expose
    private String ServiceSupplier;

    /**
    * 迁移任务创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 迁移任务更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 迁移类别，如数据库迁移中mysql:mysql代表从mysql迁移到mysql，文件迁移中oss:cos代表从阿里云oss迁移到腾讯云cos
    */
    @SerializedName("MigrateClass")
    @Expose
    private String MigrateClass;

    /**
    * 迁移任务源信息
    */
    @SerializedName("SrcInfo")
    @Expose
    private SrcInfo SrcInfo;

    /**
    * 迁移任务目的信息
    */
    @SerializedName("DstInfo")
    @Expose
    private DstInfo DstInfo;

    /**
    * 源实例接入类型，数据库迁移时填写值为：extranet(外网),cvm(cvm自建实例),dcg(专线接入的实例),vpncloud(云vpn接入的实例),vpnselfbuild(自建vpn接入的实例)，cdb(云上cdb实例)
    */
    @SerializedName("SrcAccessType")
    @Expose
    private String SrcAccessType;

    /**
    * 源实例数据库类型，数据库迁移时填写，取值为mysql,redis,percona,mongodb,postgresql,sqlserver,mariadb 之一
    */
    @SerializedName("SrcDatabaseType")
    @Expose
    private String SrcDatabaseType;

    /**
    * 目标实例接入类型，数据库迁移时填写值为：extranet(外网),cvm(cvm自建实例),dcg(专线接入的实例),vpncloud(云vpn接入的实例),vpnselfbuild(自建vpn接入的实例)，cdb(云上cdb实例)
    */
    @SerializedName("DstAccessType")
    @Expose
    private String DstAccessType;

    /**
    * 目标实例数据库类型,数据库迁移时填写，取值为mysql,redis,percona,mongodb,postgresql,sqlserver,mariadb 之一
    */
    @SerializedName("DstDatabaseType")
    @Expose
    private String DstDatabaseType;

    /**
     * Get 任务类型，取值database（数据库迁移）、file（文件迁移）、host（主机迁移） 
     * @return TaskType 任务类型，取值database（数据库迁移）、file（文件迁移）、host（主机迁移）
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型，取值database（数据库迁移）、file（文件迁移）、host（主机迁移）
     * @param TaskType 任务类型，取值database（数据库迁移）、file（文件迁移）、host（主机迁移）
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 任务名称 
     * @return TaskName 任务名称
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称
     * @param TaskName 任务名称
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 服务提供商名称 
     * @return ServiceSupplier 服务提供商名称
     */
    public String getServiceSupplier() {
        return this.ServiceSupplier;
    }

    /**
     * Set 服务提供商名称
     * @param ServiceSupplier 服务提供商名称
     */
    public void setServiceSupplier(String ServiceSupplier) {
        this.ServiceSupplier = ServiceSupplier;
    }

    /**
     * Get 迁移任务创建时间 
     * @return CreateTime 迁移任务创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 迁移任务创建时间
     * @param CreateTime 迁移任务创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 迁移任务更新时间 
     * @return UpdateTime 迁移任务更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 迁移任务更新时间
     * @param UpdateTime 迁移任务更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 迁移类别，如数据库迁移中mysql:mysql代表从mysql迁移到mysql，文件迁移中oss:cos代表从阿里云oss迁移到腾讯云cos 
     * @return MigrateClass 迁移类别，如数据库迁移中mysql:mysql代表从mysql迁移到mysql，文件迁移中oss:cos代表从阿里云oss迁移到腾讯云cos
     */
    public String getMigrateClass() {
        return this.MigrateClass;
    }

    /**
     * Set 迁移类别，如数据库迁移中mysql:mysql代表从mysql迁移到mysql，文件迁移中oss:cos代表从阿里云oss迁移到腾讯云cos
     * @param MigrateClass 迁移类别，如数据库迁移中mysql:mysql代表从mysql迁移到mysql，文件迁移中oss:cos代表从阿里云oss迁移到腾讯云cos
     */
    public void setMigrateClass(String MigrateClass) {
        this.MigrateClass = MigrateClass;
    }

    /**
     * Get 迁移任务源信息 
     * @return SrcInfo 迁移任务源信息
     */
    public SrcInfo getSrcInfo() {
        return this.SrcInfo;
    }

    /**
     * Set 迁移任务源信息
     * @param SrcInfo 迁移任务源信息
     */
    public void setSrcInfo(SrcInfo SrcInfo) {
        this.SrcInfo = SrcInfo;
    }

    /**
     * Get 迁移任务目的信息 
     * @return DstInfo 迁移任务目的信息
     */
    public DstInfo getDstInfo() {
        return this.DstInfo;
    }

    /**
     * Set 迁移任务目的信息
     * @param DstInfo 迁移任务目的信息
     */
    public void setDstInfo(DstInfo DstInfo) {
        this.DstInfo = DstInfo;
    }

    /**
     * Get 源实例接入类型，数据库迁移时填写值为：extranet(外网),cvm(cvm自建实例),dcg(专线接入的实例),vpncloud(云vpn接入的实例),vpnselfbuild(自建vpn接入的实例)，cdb(云上cdb实例) 
     * @return SrcAccessType 源实例接入类型，数据库迁移时填写值为：extranet(外网),cvm(cvm自建实例),dcg(专线接入的实例),vpncloud(云vpn接入的实例),vpnselfbuild(自建vpn接入的实例)，cdb(云上cdb实例)
     */
    public String getSrcAccessType() {
        return this.SrcAccessType;
    }

    /**
     * Set 源实例接入类型，数据库迁移时填写值为：extranet(外网),cvm(cvm自建实例),dcg(专线接入的实例),vpncloud(云vpn接入的实例),vpnselfbuild(自建vpn接入的实例)，cdb(云上cdb实例)
     * @param SrcAccessType 源实例接入类型，数据库迁移时填写值为：extranet(外网),cvm(cvm自建实例),dcg(专线接入的实例),vpncloud(云vpn接入的实例),vpnselfbuild(自建vpn接入的实例)，cdb(云上cdb实例)
     */
    public void setSrcAccessType(String SrcAccessType) {
        this.SrcAccessType = SrcAccessType;
    }

    /**
     * Get 源实例数据库类型，数据库迁移时填写，取值为mysql,redis,percona,mongodb,postgresql,sqlserver,mariadb 之一 
     * @return SrcDatabaseType 源实例数据库类型，数据库迁移时填写，取值为mysql,redis,percona,mongodb,postgresql,sqlserver,mariadb 之一
     */
    public String getSrcDatabaseType() {
        return this.SrcDatabaseType;
    }

    /**
     * Set 源实例数据库类型，数据库迁移时填写，取值为mysql,redis,percona,mongodb,postgresql,sqlserver,mariadb 之一
     * @param SrcDatabaseType 源实例数据库类型，数据库迁移时填写，取值为mysql,redis,percona,mongodb,postgresql,sqlserver,mariadb 之一
     */
    public void setSrcDatabaseType(String SrcDatabaseType) {
        this.SrcDatabaseType = SrcDatabaseType;
    }

    /**
     * Get 目标实例接入类型，数据库迁移时填写值为：extranet(外网),cvm(cvm自建实例),dcg(专线接入的实例),vpncloud(云vpn接入的实例),vpnselfbuild(自建vpn接入的实例)，cdb(云上cdb实例) 
     * @return DstAccessType 目标实例接入类型，数据库迁移时填写值为：extranet(外网),cvm(cvm自建实例),dcg(专线接入的实例),vpncloud(云vpn接入的实例),vpnselfbuild(自建vpn接入的实例)，cdb(云上cdb实例)
     */
    public String getDstAccessType() {
        return this.DstAccessType;
    }

    /**
     * Set 目标实例接入类型，数据库迁移时填写值为：extranet(外网),cvm(cvm自建实例),dcg(专线接入的实例),vpncloud(云vpn接入的实例),vpnselfbuild(自建vpn接入的实例)，cdb(云上cdb实例)
     * @param DstAccessType 目标实例接入类型，数据库迁移时填写值为：extranet(外网),cvm(cvm自建实例),dcg(专线接入的实例),vpncloud(云vpn接入的实例),vpnselfbuild(自建vpn接入的实例)，cdb(云上cdb实例)
     */
    public void setDstAccessType(String DstAccessType) {
        this.DstAccessType = DstAccessType;
    }

    /**
     * Get 目标实例数据库类型,数据库迁移时填写，取值为mysql,redis,percona,mongodb,postgresql,sqlserver,mariadb 之一 
     * @return DstDatabaseType 目标实例数据库类型,数据库迁移时填写，取值为mysql,redis,percona,mongodb,postgresql,sqlserver,mariadb 之一
     */
    public String getDstDatabaseType() {
        return this.DstDatabaseType;
    }

    /**
     * Set 目标实例数据库类型,数据库迁移时填写，取值为mysql,redis,percona,mongodb,postgresql,sqlserver,mariadb 之一
     * @param DstDatabaseType 目标实例数据库类型,数据库迁移时填写，取值为mysql,redis,percona,mongodb,postgresql,sqlserver,mariadb 之一
     */
    public void setDstDatabaseType(String DstDatabaseType) {
        this.DstDatabaseType = DstDatabaseType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "ServiceSupplier", this.ServiceSupplier);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "MigrateClass", this.MigrateClass);
        this.setParamObj(map, prefix + "SrcInfo.", this.SrcInfo);
        this.setParamObj(map, prefix + "DstInfo.", this.DstInfo);
        this.setParamSimple(map, prefix + "SrcAccessType", this.SrcAccessType);
        this.setParamSimple(map, prefix + "SrcDatabaseType", this.SrcDatabaseType);
        this.setParamSimple(map, prefix + "DstAccessType", this.DstAccessType);
        this.setParamSimple(map, prefix + "DstDatabaseType", this.DstDatabaseType);

    }
}

