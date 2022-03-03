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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JobV1 extends AbstractModel{

    /**
    * 作业ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 可用区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 用户AppId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 用户UIN
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 创建者UIN
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatorUin")
    @Expose
    private String CreatorUin;

    /**
    * 作业名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 作业类型，1：sql作业，2：Jar作业
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobType")
    @Expose
    private Long JobType;

    /**
    * 作业状态，1：未初始化，2：未发布，3：操作中，4：运行中，5：停止，6：暂停，-1：故障
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 作业创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 作业启动时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 作业停止时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StopTime")
    @Expose
    private String StopTime;

    /**
    * 作业更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 作业累计运行时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalRunMillis")
    @Expose
    private Long TotalRunMillis;

    /**
    * 备注信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 操作错误提示信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastOpResult")
    @Expose
    private String LastOpResult;

    /**
    * 集群名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 最新配置版本号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestJobConfigVersion")
    @Expose
    private Long LatestJobConfigVersion;

    /**
    * 已发布的配置版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublishedJobConfigVersion")
    @Expose
    private Long PublishedJobConfigVersion;

    /**
    * 运行的CU数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunningCuNum")
    @Expose
    private Long RunningCuNum;

    /**
    * 作业内存规格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CuMem")
    @Expose
    private Long CuMem;

    /**
    * 作业状态描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * 运行状态时表示单次运行时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurrentRunMillis")
    @Expose
    private Long CurrentRunMillis;

    /**
    * 作业所在的集群ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 作业管理WEB UI 入口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WebUIUrl")
    @Expose
    private String WebUIUrl;

    /**
    * 作业所在集群类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchedulerType")
    @Expose
    private Long SchedulerType;

    /**
    * 作业所在集群状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterStatus")
    @Expose
    private Long ClusterStatus;

    /**
    * 细粒度下的运行的CU数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunningCu")
    @Expose
    private Float RunningCu;

    /**
    * 作业运行的 Flink 版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlinkVersion")
    @Expose
    private String FlinkVersion;

    /**
    * 工作空间 SerialId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkSpaceId")
    @Expose
    private String WorkSpaceId;

    /**
    * 工作空间名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkSpaceName")
    @Expose
    private String WorkSpaceName;

    /**
     * Get 作业ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobId 作业ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 作业ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobId 作业ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 可用区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Zone 可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
注意：此字段可能返回 null，表示取不到有效值。
     * @param Zone 可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 用户AppId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId 用户AppId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户AppId
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId 用户AppId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 用户UIN
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerUin 用户UIN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 用户UIN
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerUin 用户UIN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 创建者UIN
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatorUin 创建者UIN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set 创建者UIN
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatorUin 创建者UIN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatorUin(String CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * Get 作业名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 作业名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 作业名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 作业名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 作业类型，1：sql作业，2：Jar作业
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobType 作业类型，1：sql作业，2：Jar作业
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getJobType() {
        return this.JobType;
    }

    /**
     * Set 作业类型，1：sql作业，2：Jar作业
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobType 作业类型，1：sql作业，2：Jar作业
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobType(Long JobType) {
        this.JobType = JobType;
    }

    /**
     * Get 作业状态，1：未初始化，2：未发布，3：操作中，4：运行中，5：停止，6：暂停，-1：故障
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 作业状态，1：未初始化，2：未发布，3：操作中，4：运行中，5：停止，6：暂停，-1：故障
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 作业状态，1：未初始化，2：未发布，3：操作中，4：运行中，5：停止，6：暂停，-1：故障
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 作业状态，1：未初始化，2：未发布，3：操作中，4：运行中，5：停止，6：暂停，-1：故障
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 作业创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 作业创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 作业创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 作业创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 作业启动时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 作业启动时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 作业启动时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 作业启动时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 作业停止时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StopTime 作业停止时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStopTime() {
        return this.StopTime;
    }

    /**
     * Set 作业停止时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StopTime 作业停止时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStopTime(String StopTime) {
        this.StopTime = StopTime;
    }

    /**
     * Get 作业更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 作业更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 作业更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 作业更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 作业累计运行时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalRunMillis 作业累计运行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalRunMillis() {
        return this.TotalRunMillis;
    }

    /**
     * Set 作业累计运行时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalRunMillis 作业累计运行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalRunMillis(Long TotalRunMillis) {
        this.TotalRunMillis = TotalRunMillis;
    }

    /**
     * Get 备注信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 备注信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 备注信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 操作错误提示信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastOpResult 操作错误提示信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastOpResult() {
        return this.LastOpResult;
    }

    /**
     * Set 操作错误提示信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastOpResult 操作错误提示信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastOpResult(String LastOpResult) {
        this.LastOpResult = LastOpResult;
    }

    /**
     * Get 集群名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterName 集群名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterName 集群名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 最新配置版本号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestJobConfigVersion 最新配置版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLatestJobConfigVersion() {
        return this.LatestJobConfigVersion;
    }

    /**
     * Set 最新配置版本号
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestJobConfigVersion 最新配置版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestJobConfigVersion(Long LatestJobConfigVersion) {
        this.LatestJobConfigVersion = LatestJobConfigVersion;
    }

    /**
     * Get 已发布的配置版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublishedJobConfigVersion 已发布的配置版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPublishedJobConfigVersion() {
        return this.PublishedJobConfigVersion;
    }

    /**
     * Set 已发布的配置版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublishedJobConfigVersion 已发布的配置版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublishedJobConfigVersion(Long PublishedJobConfigVersion) {
        this.PublishedJobConfigVersion = PublishedJobConfigVersion;
    }

    /**
     * Get 运行的CU数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunningCuNum 运行的CU数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRunningCuNum() {
        return this.RunningCuNum;
    }

    /**
     * Set 运行的CU数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunningCuNum 运行的CU数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunningCuNum(Long RunningCuNum) {
        this.RunningCuNum = RunningCuNum;
    }

    /**
     * Get 作业内存规格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CuMem 作业内存规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCuMem() {
        return this.CuMem;
    }

    /**
     * Set 作业内存规格
注意：此字段可能返回 null，表示取不到有效值。
     * @param CuMem 作业内存规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCuMem(Long CuMem) {
        this.CuMem = CuMem;
    }

    /**
     * Get 作业状态描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusDesc 作业状态描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set 作业状态描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusDesc 作业状态描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get 运行状态时表示单次运行时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurrentRunMillis 运行状态时表示单次运行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCurrentRunMillis() {
        return this.CurrentRunMillis;
    }

    /**
     * Set 运行状态时表示单次运行时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurrentRunMillis 运行状态时表示单次运行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurrentRunMillis(Long CurrentRunMillis) {
        this.CurrentRunMillis = CurrentRunMillis;
    }

    /**
     * Get 作业所在的集群ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId 作业所在的集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 作业所在的集群ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId 作业所在的集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 作业管理WEB UI 入口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WebUIUrl 作业管理WEB UI 入口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWebUIUrl() {
        return this.WebUIUrl;
    }

    /**
     * Set 作业管理WEB UI 入口
注意：此字段可能返回 null，表示取不到有效值。
     * @param WebUIUrl 作业管理WEB UI 入口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebUIUrl(String WebUIUrl) {
        this.WebUIUrl = WebUIUrl;
    }

    /**
     * Get 作业所在集群类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchedulerType 作业所在集群类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSchedulerType() {
        return this.SchedulerType;
    }

    /**
     * Set 作业所在集群类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchedulerType 作业所在集群类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchedulerType(Long SchedulerType) {
        this.SchedulerType = SchedulerType;
    }

    /**
     * Get 作业所在集群状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterStatus 作业所在集群状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getClusterStatus() {
        return this.ClusterStatus;
    }

    /**
     * Set 作业所在集群状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterStatus 作业所在集群状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterStatus(Long ClusterStatus) {
        this.ClusterStatus = ClusterStatus;
    }

    /**
     * Get 细粒度下的运行的CU数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunningCu 细粒度下的运行的CU数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getRunningCu() {
        return this.RunningCu;
    }

    /**
     * Set 细粒度下的运行的CU数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunningCu 细粒度下的运行的CU数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunningCu(Float RunningCu) {
        this.RunningCu = RunningCu;
    }

    /**
     * Get 作业运行的 Flink 版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlinkVersion 作业运行的 Flink 版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlinkVersion() {
        return this.FlinkVersion;
    }

    /**
     * Set 作业运行的 Flink 版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlinkVersion 作业运行的 Flink 版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlinkVersion(String FlinkVersion) {
        this.FlinkVersion = FlinkVersion;
    }

    /**
     * Get 工作空间 SerialId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkSpaceId 工作空间 SerialId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkSpaceId() {
        return this.WorkSpaceId;
    }

    /**
     * Set 工作空间 SerialId
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkSpaceId 工作空间 SerialId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkSpaceId(String WorkSpaceId) {
        this.WorkSpaceId = WorkSpaceId;
    }

    /**
     * Get 工作空间名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkSpaceName 工作空间名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkSpaceName() {
        return this.WorkSpaceName;
    }

    /**
     * Set 工作空间名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkSpaceName 工作空间名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkSpaceName(String WorkSpaceName) {
        this.WorkSpaceName = WorkSpaceName;
    }

    public JobV1() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JobV1(JobV1 source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.CreatorUin != null) {
            this.CreatorUin = new String(source.CreatorUin);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.JobType != null) {
            this.JobType = new Long(source.JobType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.StopTime != null) {
            this.StopTime = new String(source.StopTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.TotalRunMillis != null) {
            this.TotalRunMillis = new Long(source.TotalRunMillis);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.LastOpResult != null) {
            this.LastOpResult = new String(source.LastOpResult);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.LatestJobConfigVersion != null) {
            this.LatestJobConfigVersion = new Long(source.LatestJobConfigVersion);
        }
        if (source.PublishedJobConfigVersion != null) {
            this.PublishedJobConfigVersion = new Long(source.PublishedJobConfigVersion);
        }
        if (source.RunningCuNum != null) {
            this.RunningCuNum = new Long(source.RunningCuNum);
        }
        if (source.CuMem != null) {
            this.CuMem = new Long(source.CuMem);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.CurrentRunMillis != null) {
            this.CurrentRunMillis = new Long(source.CurrentRunMillis);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.WebUIUrl != null) {
            this.WebUIUrl = new String(source.WebUIUrl);
        }
        if (source.SchedulerType != null) {
            this.SchedulerType = new Long(source.SchedulerType);
        }
        if (source.ClusterStatus != null) {
            this.ClusterStatus = new Long(source.ClusterStatus);
        }
        if (source.RunningCu != null) {
            this.RunningCu = new Float(source.RunningCu);
        }
        if (source.FlinkVersion != null) {
            this.FlinkVersion = new String(source.FlinkVersion);
        }
        if (source.WorkSpaceId != null) {
            this.WorkSpaceId = new String(source.WorkSpaceId);
        }
        if (source.WorkSpaceName != null) {
            this.WorkSpaceName = new String(source.WorkSpaceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "CreatorUin", this.CreatorUin);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "JobType", this.JobType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "StopTime", this.StopTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "TotalRunMillis", this.TotalRunMillis);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "LastOpResult", this.LastOpResult);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "LatestJobConfigVersion", this.LatestJobConfigVersion);
        this.setParamSimple(map, prefix + "PublishedJobConfigVersion", this.PublishedJobConfigVersion);
        this.setParamSimple(map, prefix + "RunningCuNum", this.RunningCuNum);
        this.setParamSimple(map, prefix + "CuMem", this.CuMem);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "CurrentRunMillis", this.CurrentRunMillis);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "WebUIUrl", this.WebUIUrl);
        this.setParamSimple(map, prefix + "SchedulerType", this.SchedulerType);
        this.setParamSimple(map, prefix + "ClusterStatus", this.ClusterStatus);
        this.setParamSimple(map, prefix + "RunningCu", this.RunningCu);
        this.setParamSimple(map, prefix + "FlinkVersion", this.FlinkVersion);
        this.setParamSimple(map, prefix + "WorkSpaceId", this.WorkSpaceId);
        this.setParamSimple(map, prefix + "WorkSpaceName", this.WorkSpaceName);

    }
}

