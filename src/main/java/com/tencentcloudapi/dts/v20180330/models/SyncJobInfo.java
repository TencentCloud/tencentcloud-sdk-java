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

public class SyncJobInfo  extends AbstractModel{

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
    private Integer Status;

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
     * 获取灾备任务id
     * @return JobId 灾备任务id
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * 设置灾备任务id
     * @param JobId 灾备任务id
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * 获取灾备任务名
     * @return JobName 灾备任务名
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * 设置灾备任务名
     * @param JobName 灾备任务名
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * 获取任务同步
     * @return SyncOption 任务同步
     */
    public SyncOption getSyncOption() {
        return this.SyncOption;
    }

    /**
     * 设置任务同步
     * @param SyncOption 任务同步
     */
    public void setSyncOption(SyncOption SyncOption) {
        this.SyncOption = SyncOption;
    }

    /**
     * 获取源接入类型
     * @return SrcAccessType 源接入类型
     */
    public String getSrcAccessType() {
        return this.SrcAccessType;
    }

    /**
     * 设置源接入类型
     * @param SrcAccessType 源接入类型
     */
    public void setSrcAccessType(String SrcAccessType) {
        this.SrcAccessType = SrcAccessType;
    }

    /**
     * 获取源数据类型
     * @return SrcDatabaseType 源数据类型
     */
    public String getSrcDatabaseType() {
        return this.SrcDatabaseType;
    }

    /**
     * 设置源数据类型
     * @param SrcDatabaseType 源数据类型
     */
    public void setSrcDatabaseType(String SrcDatabaseType) {
        this.SrcDatabaseType = SrcDatabaseType;
    }

    /**
     * 获取源实例信息
     * @return SrcInfo 源实例信息
     */
    public SyncInstanceInfo getSrcInfo() {
        return this.SrcInfo;
    }

    /**
     * 设置源实例信息
     * @param SrcInfo 源实例信息
     */
    public void setSrcInfo(SyncInstanceInfo SrcInfo) {
        this.SrcInfo = SrcInfo;
    }

    /**
     * 获取灾备接入类型
     * @return DstAccessType 灾备接入类型
     */
    public String getDstAccessType() {
        return this.DstAccessType;
    }

    /**
     * 设置灾备接入类型
     * @param DstAccessType 灾备接入类型
     */
    public void setDstAccessType(String DstAccessType) {
        this.DstAccessType = DstAccessType;
    }

    /**
     * 获取灾备数据类型
     * @return DstDatabaseType 灾备数据类型
     */
    public String getDstDatabaseType() {
        return this.DstDatabaseType;
    }

    /**
     * 设置灾备数据类型
     * @param DstDatabaseType 灾备数据类型
     */
    public void setDstDatabaseType(String DstDatabaseType) {
        this.DstDatabaseType = DstDatabaseType;
    }

    /**
     * 获取灾备实例信息
     * @return DstInfo 灾备实例信息
     */
    public SyncInstanceInfo getDstInfo() {
        return this.DstInfo;
    }

    /**
     * 设置灾备实例信息
     * @param DstInfo 灾备实例信息
     */
    public void setDstInfo(SyncInstanceInfo DstInfo) {
        this.DstInfo = DstInfo;
    }

    /**
     * 获取任务信息
     * @return Detail 任务信息
     */
    public SyncDetailInfo getDetail() {
        return this.Detail;
    }

    /**
     * 设置任务信息
     * @param Detail 任务信息
     */
    public void setDetail(SyncDetailInfo Detail) {
        this.Detail = Detail;
    }

    /**
     * 获取任务状态
     * @return Status 任务状态
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * 设置任务状态
     * @param Status 任务状态
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    /**
     * 获取迁移库表
     * @return DatabaseInfo 迁移库表
     */
    public String getDatabaseInfo() {
        return this.DatabaseInfo;
    }

    /**
     * 设置迁移库表
     * @param DatabaseInfo 迁移库表
     */
    public void setDatabaseInfo(String DatabaseInfo) {
        this.DatabaseInfo = DatabaseInfo;
    }

    /**
     * 获取创建时间
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取开始时间
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * 设置开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * 获取结束时间
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * 设置结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * 内部实现，用户禁止调用
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

