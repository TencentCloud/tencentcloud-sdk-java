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

public class SyncJobInfo extends AbstractModel{

    /**
    * 灾备任务id
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 灾备任务名
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * 任务同步
    */
    @SerializedName("SyncOption")
    @Expose
    private SyncOption SyncOption;

    /**
    * 源接入类型
    */
    @SerializedName("SrcAccessType")
    @Expose
    private String SrcAccessType;

    /**
    * 源数据类型
    */
    @SerializedName("SrcDatabaseType")
    @Expose
    private String SrcDatabaseType;

    /**
    * 源实例信息
    */
    @SerializedName("SrcInfo")
    @Expose
    private SyncInstanceInfo SrcInfo;

    /**
    * 灾备接入类型
    */
    @SerializedName("DstAccessType")
    @Expose
    private String DstAccessType;

    /**
    * 灾备数据类型
    */
    @SerializedName("DstDatabaseType")
    @Expose
    private String DstDatabaseType;

    /**
    * 灾备实例信息
    */
    @SerializedName("DstInfo")
    @Expose
    private SyncInstanceInfo DstInfo;

    /**
    * 任务信息
    */
    @SerializedName("Detail")
    @Expose
    private SyncDetailInfo Detail;

    /**
    * 任务状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 迁移库表
    */
    @SerializedName("DatabaseInfo")
    @Expose
    private String DatabaseInfo;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 灾备任务id 
     * @return JobId 灾备任务id
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 灾备任务id
     * @param JobId 灾备任务id
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 灾备任务名 
     * @return JobName 灾备任务名
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set 灾备任务名
     * @param JobName 灾备任务名
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get 任务同步 
     * @return SyncOption 任务同步
     */
    public SyncOption getSyncOption() {
        return this.SyncOption;
    }

    /**
     * Set 任务同步
     * @param SyncOption 任务同步
     */
    public void setSyncOption(SyncOption SyncOption) {
        this.SyncOption = SyncOption;
    }

    /**
     * Get 源接入类型 
     * @return SrcAccessType 源接入类型
     */
    public String getSrcAccessType() {
        return this.SrcAccessType;
    }

    /**
     * Set 源接入类型
     * @param SrcAccessType 源接入类型
     */
    public void setSrcAccessType(String SrcAccessType) {
        this.SrcAccessType = SrcAccessType;
    }

    /**
     * Get 源数据类型 
     * @return SrcDatabaseType 源数据类型
     */
    public String getSrcDatabaseType() {
        return this.SrcDatabaseType;
    }

    /**
     * Set 源数据类型
     * @param SrcDatabaseType 源数据类型
     */
    public void setSrcDatabaseType(String SrcDatabaseType) {
        this.SrcDatabaseType = SrcDatabaseType;
    }

    /**
     * Get 源实例信息 
     * @return SrcInfo 源实例信息
     */
    public SyncInstanceInfo getSrcInfo() {
        return this.SrcInfo;
    }

    /**
     * Set 源实例信息
     * @param SrcInfo 源实例信息
     */
    public void setSrcInfo(SyncInstanceInfo SrcInfo) {
        this.SrcInfo = SrcInfo;
    }

    /**
     * Get 灾备接入类型 
     * @return DstAccessType 灾备接入类型
     */
    public String getDstAccessType() {
        return this.DstAccessType;
    }

    /**
     * Set 灾备接入类型
     * @param DstAccessType 灾备接入类型
     */
    public void setDstAccessType(String DstAccessType) {
        this.DstAccessType = DstAccessType;
    }

    /**
     * Get 灾备数据类型 
     * @return DstDatabaseType 灾备数据类型
     */
    public String getDstDatabaseType() {
        return this.DstDatabaseType;
    }

    /**
     * Set 灾备数据类型
     * @param DstDatabaseType 灾备数据类型
     */
    public void setDstDatabaseType(String DstDatabaseType) {
        this.DstDatabaseType = DstDatabaseType;
    }

    /**
     * Get 灾备实例信息 
     * @return DstInfo 灾备实例信息
     */
    public SyncInstanceInfo getDstInfo() {
        return this.DstInfo;
    }

    /**
     * Set 灾备实例信息
     * @param DstInfo 灾备实例信息
     */
    public void setDstInfo(SyncInstanceInfo DstInfo) {
        this.DstInfo = DstInfo;
    }

    /**
     * Get 任务信息 
     * @return Detail 任务信息
     */
    public SyncDetailInfo getDetail() {
        return this.Detail;
    }

    /**
     * Set 任务信息
     * @param Detail 任务信息
     */
    public void setDetail(SyncDetailInfo Detail) {
        this.Detail = Detail;
    }

    /**
     * Get 任务状态 
     * @return Status 任务状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态
     * @param Status 任务状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 迁移库表 
     * @return DatabaseInfo 迁移库表
     */
    public String getDatabaseInfo() {
        return this.DatabaseInfo;
    }

    /**
     * Set 迁移库表
     * @param DatabaseInfo 迁移库表
     */
    public void setDatabaseInfo(String DatabaseInfo) {
        this.DatabaseInfo = DatabaseInfo;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamObj(map, prefix + "SyncOption.", this.SyncOption);
        this.setParamSimple(map, prefix + "SrcAccessType", this.SrcAccessType);
        this.setParamSimple(map, prefix + "SrcDatabaseType", this.SrcDatabaseType);
        this.setParamObj(map, prefix + "SrcInfo.", this.SrcInfo);
        this.setParamSimple(map, prefix + "DstAccessType", this.DstAccessType);
        this.setParamSimple(map, prefix + "DstDatabaseType", this.DstDatabaseType);
        this.setParamObj(map, prefix + "DstInfo.", this.DstInfo);
        this.setParamObj(map, prefix + "Detail.", this.Detail);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DatabaseInfo", this.DatabaseInfo);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

