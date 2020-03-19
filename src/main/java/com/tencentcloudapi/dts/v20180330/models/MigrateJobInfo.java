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
package com.tencentcloudapi.dts.v20180330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MigrateJobInfo extends AbstractModel{

    /**
    * 数据迁移任务ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 数据迁移任务名称
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * 迁移任务配置选项
    */
    @SerializedName("MigrateOption")
    @Expose
    private MigrateOption MigrateOption;

    /**
    * 源实例数据库类型:mysql，redis，mongodb，postgresql，mariadb，percona
    */
    @SerializedName("SrcDatabaseType")
    @Expose
    private String SrcDatabaseType;

    /**
    * 源实例接入类型，值包括：extranet(外网),cvm(cvm自建实例),dcg(专线接入的实例),vpncloud(云vpn接入的实例),cdb(腾讯云数据库实例),ccn(云联网实例)
    */
    @SerializedName("SrcAccessType")
    @Expose
    private String SrcAccessType;

    /**
    * 源实例信息，具体内容跟迁移任务类型相关
    */
    @SerializedName("SrcInfo")
    @Expose
    private SrcInfo SrcInfo;

    /**
    * 目标实例数据库类型:mysql，redis，mongodb，postgresql，mariadb，percona
    */
    @SerializedName("DstDatabaseType")
    @Expose
    private String DstDatabaseType;

    /**
    * 目标实例接入类型，目前支持：cdb(腾讯云数据库实例)
    */
    @SerializedName("DstAccessType")
    @Expose
    private String DstAccessType;

    /**
    * 目标实例信息
    */
    @SerializedName("DstInfo")
    @Expose
    private DstInfo DstInfo;

    /**
    * 需要迁移的源数据库表信息，如果需要迁移的是整个实例，该字段为[]
    */
    @SerializedName("DatabaseInfo")
    @Expose
    private String DatabaseInfo;

    /**
    * 任务创建(提交)时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 任务开始执行时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 任务执行结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 任务状态,取值为：1-创建中(Creating),3-校验中(Checking)4-校验通过(CheckPass),5-校验不通过（CheckNotPass）,7-任务运行(Running),8-准备完成（ReadyComplete）,9-任务成功（Success）,10-任务失败（Failed）,11-撤销中（Stopping）,12-完成中（Completing）
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 任务详情
    */
    @SerializedName("Detail")
    @Expose
    private MigrateDetailInfo Detail;

    /**
    * 任务错误信息提示，当任务发生错误时，不为null或者空值
    */
    @SerializedName("ErrorInfo")
    @Expose
    private ErrorInfo [] ErrorInfo;

    /**
     * Get 数据迁移任务ID 
     * @return JobId 数据迁移任务ID
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 数据迁移任务ID
     * @param JobId 数据迁移任务ID
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 数据迁移任务名称 
     * @return JobName 数据迁移任务名称
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set 数据迁移任务名称
     * @param JobName 数据迁移任务名称
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get 迁移任务配置选项 
     * @return MigrateOption 迁移任务配置选项
     */
    public MigrateOption getMigrateOption() {
        return this.MigrateOption;
    }

    /**
     * Set 迁移任务配置选项
     * @param MigrateOption 迁移任务配置选项
     */
    public void setMigrateOption(MigrateOption MigrateOption) {
        this.MigrateOption = MigrateOption;
    }

    /**
     * Get 源实例数据库类型:mysql，redis，mongodb，postgresql，mariadb，percona 
     * @return SrcDatabaseType 源实例数据库类型:mysql，redis，mongodb，postgresql，mariadb，percona
     */
    public String getSrcDatabaseType() {
        return this.SrcDatabaseType;
    }

    /**
     * Set 源实例数据库类型:mysql，redis，mongodb，postgresql，mariadb，percona
     * @param SrcDatabaseType 源实例数据库类型:mysql，redis，mongodb，postgresql，mariadb，percona
     */
    public void setSrcDatabaseType(String SrcDatabaseType) {
        this.SrcDatabaseType = SrcDatabaseType;
    }

    /**
     * Get 源实例接入类型，值包括：extranet(外网),cvm(cvm自建实例),dcg(专线接入的实例),vpncloud(云vpn接入的实例),cdb(腾讯云数据库实例),ccn(云联网实例) 
     * @return SrcAccessType 源实例接入类型，值包括：extranet(外网),cvm(cvm自建实例),dcg(专线接入的实例),vpncloud(云vpn接入的实例),cdb(腾讯云数据库实例),ccn(云联网实例)
     */
    public String getSrcAccessType() {
        return this.SrcAccessType;
    }

    /**
     * Set 源实例接入类型，值包括：extranet(外网),cvm(cvm自建实例),dcg(专线接入的实例),vpncloud(云vpn接入的实例),cdb(腾讯云数据库实例),ccn(云联网实例)
     * @param SrcAccessType 源实例接入类型，值包括：extranet(外网),cvm(cvm自建实例),dcg(专线接入的实例),vpncloud(云vpn接入的实例),cdb(腾讯云数据库实例),ccn(云联网实例)
     */
    public void setSrcAccessType(String SrcAccessType) {
        this.SrcAccessType = SrcAccessType;
    }

    /**
     * Get 源实例信息，具体内容跟迁移任务类型相关 
     * @return SrcInfo 源实例信息，具体内容跟迁移任务类型相关
     */
    public SrcInfo getSrcInfo() {
        return this.SrcInfo;
    }

    /**
     * Set 源实例信息，具体内容跟迁移任务类型相关
     * @param SrcInfo 源实例信息，具体内容跟迁移任务类型相关
     */
    public void setSrcInfo(SrcInfo SrcInfo) {
        this.SrcInfo = SrcInfo;
    }

    /**
     * Get 目标实例数据库类型:mysql，redis，mongodb，postgresql，mariadb，percona 
     * @return DstDatabaseType 目标实例数据库类型:mysql，redis，mongodb，postgresql，mariadb，percona
     */
    public String getDstDatabaseType() {
        return this.DstDatabaseType;
    }

    /**
     * Set 目标实例数据库类型:mysql，redis，mongodb，postgresql，mariadb，percona
     * @param DstDatabaseType 目标实例数据库类型:mysql，redis，mongodb，postgresql，mariadb，percona
     */
    public void setDstDatabaseType(String DstDatabaseType) {
        this.DstDatabaseType = DstDatabaseType;
    }

    /**
     * Get 目标实例接入类型，目前支持：cdb(腾讯云数据库实例) 
     * @return DstAccessType 目标实例接入类型，目前支持：cdb(腾讯云数据库实例)
     */
    public String getDstAccessType() {
        return this.DstAccessType;
    }

    /**
     * Set 目标实例接入类型，目前支持：cdb(腾讯云数据库实例)
     * @param DstAccessType 目标实例接入类型，目前支持：cdb(腾讯云数据库实例)
     */
    public void setDstAccessType(String DstAccessType) {
        this.DstAccessType = DstAccessType;
    }

    /**
     * Get 目标实例信息 
     * @return DstInfo 目标实例信息
     */
    public DstInfo getDstInfo() {
        return this.DstInfo;
    }

    /**
     * Set 目标实例信息
     * @param DstInfo 目标实例信息
     */
    public void setDstInfo(DstInfo DstInfo) {
        this.DstInfo = DstInfo;
    }

    /**
     * Get 需要迁移的源数据库表信息，如果需要迁移的是整个实例，该字段为[] 
     * @return DatabaseInfo 需要迁移的源数据库表信息，如果需要迁移的是整个实例，该字段为[]
     */
    public String getDatabaseInfo() {
        return this.DatabaseInfo;
    }

    /**
     * Set 需要迁移的源数据库表信息，如果需要迁移的是整个实例，该字段为[]
     * @param DatabaseInfo 需要迁移的源数据库表信息，如果需要迁移的是整个实例，该字段为[]
     */
    public void setDatabaseInfo(String DatabaseInfo) {
        this.DatabaseInfo = DatabaseInfo;
    }

    /**
     * Get 任务创建(提交)时间 
     * @return CreateTime 任务创建(提交)时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 任务创建(提交)时间
     * @param CreateTime 任务创建(提交)时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 任务开始执行时间 
     * @return StartTime 任务开始执行时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 任务开始执行时间
     * @param StartTime 任务开始执行时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 任务执行结束时间 
     * @return EndTime 任务执行结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 任务执行结束时间
     * @param EndTime 任务执行结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 任务状态,取值为：1-创建中(Creating),3-校验中(Checking)4-校验通过(CheckPass),5-校验不通过（CheckNotPass）,7-任务运行(Running),8-准备完成（ReadyComplete）,9-任务成功（Success）,10-任务失败（Failed）,11-撤销中（Stopping）,12-完成中（Completing） 
     * @return Status 任务状态,取值为：1-创建中(Creating),3-校验中(Checking)4-校验通过(CheckPass),5-校验不通过（CheckNotPass）,7-任务运行(Running),8-准备完成（ReadyComplete）,9-任务成功（Success）,10-任务失败（Failed）,11-撤销中（Stopping）,12-完成中（Completing）
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态,取值为：1-创建中(Creating),3-校验中(Checking)4-校验通过(CheckPass),5-校验不通过（CheckNotPass）,7-任务运行(Running),8-准备完成（ReadyComplete）,9-任务成功（Success）,10-任务失败（Failed）,11-撤销中（Stopping）,12-完成中（Completing）
     * @param Status 任务状态,取值为：1-创建中(Creating),3-校验中(Checking)4-校验通过(CheckPass),5-校验不通过（CheckNotPass）,7-任务运行(Running),8-准备完成（ReadyComplete）,9-任务成功（Success）,10-任务失败（Failed）,11-撤销中（Stopping）,12-完成中（Completing）
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 任务详情 
     * @return Detail 任务详情
     */
    public MigrateDetailInfo getDetail() {
        return this.Detail;
    }

    /**
     * Set 任务详情
     * @param Detail 任务详情
     */
    public void setDetail(MigrateDetailInfo Detail) {
        this.Detail = Detail;
    }

    /**
     * Get 任务错误信息提示，当任务发生错误时，不为null或者空值 
     * @return ErrorInfo 任务错误信息提示，当任务发生错误时，不为null或者空值
     */
    public ErrorInfo [] getErrorInfo() {
        return this.ErrorInfo;
    }

    /**
     * Set 任务错误信息提示，当任务发生错误时，不为null或者空值
     * @param ErrorInfo 任务错误信息提示，当任务发生错误时，不为null或者空值
     */
    public void setErrorInfo(ErrorInfo [] ErrorInfo) {
        this.ErrorInfo = ErrorInfo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamObj(map, prefix + "MigrateOption.", this.MigrateOption);
        this.setParamSimple(map, prefix + "SrcDatabaseType", this.SrcDatabaseType);
        this.setParamSimple(map, prefix + "SrcAccessType", this.SrcAccessType);
        this.setParamObj(map, prefix + "SrcInfo.", this.SrcInfo);
        this.setParamSimple(map, prefix + "DstDatabaseType", this.DstDatabaseType);
        this.setParamSimple(map, prefix + "DstAccessType", this.DstAccessType);
        this.setParamObj(map, prefix + "DstInfo.", this.DstInfo);
        this.setParamSimple(map, prefix + "DatabaseInfo", this.DatabaseInfo);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "Detail.", this.Detail);
        this.setParamArrayObj(map, prefix + "ErrorInfo.", this.ErrorInfo);

    }
}

