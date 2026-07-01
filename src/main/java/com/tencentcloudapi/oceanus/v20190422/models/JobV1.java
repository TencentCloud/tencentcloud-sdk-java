/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JobV1 extends AbstractModel {

    /**
    * <p>作业ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>可用区</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>用户AppId</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>用户UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * <p>创建者UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatorUin")
    @Expose
    private String CreatorUin;

    /**
    * <p>作业名字</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>作业类型，1：sql作业，2：Jar作业</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobType")
    @Expose
    private Long JobType;

    /**
    * <p>作业状态，1：未初始化，2：未发布，3：操作中，4：运行中，5：停止，6：暂停，-1：故障</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>作业创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>作业启动时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>作业停止时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StopTime")
    @Expose
    private String StopTime;

    /**
    * <p>作业更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>作业累计运行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalRunMillis")
    @Expose
    private Long TotalRunMillis;

    /**
    * <p>备注信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>操作错误提示信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastOpResult")
    @Expose
    private String LastOpResult;

    /**
    * <p>集群名字</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>最新配置版本号，包括已经删除的版本</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestJobConfigVersion")
    @Expose
    private Long LatestJobConfigVersion;

    /**
    * <p>最新的版本号，不包括已经删除的版本号</p>
    */
    @SerializedName("LatestValidJobConfigVersion")
    @Expose
    private Long LatestValidJobConfigVersion;

    /**
    * <p>已发布的配置版本</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublishedJobConfigVersion")
    @Expose
    private Long PublishedJobConfigVersion;

    /**
    * <p>运行的CU数量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunningCuNum")
    @Expose
    private Long RunningCuNum;

    /**
    * <p>作业内存规格</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CuMem")
    @Expose
    private Long CuMem;

    /**
    * <p>作业状态描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * <p>运行状态时表示单次运行时间</p><p>单位：毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurrentRunMillis")
    @Expose
    private Long CurrentRunMillis;

    /**
    * <p>作业所在的集群ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>作业管理WEB UI 入口</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WebUIUrl")
    @Expose
    private String WebUIUrl;

    /**
    * <p>作业所在集群类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchedulerType")
    @Expose
    private Long SchedulerType;

    /**
    * <p>作业所在集群状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterStatus")
    @Expose
    private Long ClusterStatus;

    /**
    * <p>细粒度下的运行的CU数量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunningCu")
    @Expose
    private Float RunningCu;

    /**
    * <p>作业运行的 Flink 版本</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlinkVersion")
    @Expose
    private String FlinkVersion;

    /**
    * <p>工作空间 SerialId</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkSpaceId")
    @Expose
    private String WorkSpaceId;

    /**
    * <p>工作空间名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkSpaceName")
    @Expose
    private String WorkSpaceName;

    /**
    * <p>作业标签</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>作业异常事件信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventInfo")
    @Expose
    private JobEventInfo EventInfo;

    /**
    * <p>描述信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>0:代表没开启调优任务，1:开启智能调优，2:代表定时调优</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScalingType")
    @Expose
    private Long ScalingType;

    /**
    * <p>使用CPU数目</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunningCpu")
    @Expose
    private Float RunningCpu;

    /**
    * <p>使用内存数量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunningMem")
    @Expose
    private Float RunningMem;

    /**
    * <p>是否开了默认告警</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OpenJobDefaultAlarm")
    @Expose
    private Long OpenJobDefaultAlarm;

    /**
    * <p>操作中描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProgressDesc")
    @Expose
    private String ProgressDesc;

    /**
    * <p>停止持续告警</p>
    */
    @SerializedName("ContinueAlarm")
    @Expose
    private Long ContinueAlarm;

    /**
    * <p>作业重启次数</p>
    */
    @SerializedName("RestartCount")
    @Expose
    private Long RestartCount;

    /**
    * <p>期望是开启默认告警</p>
    */
    @SerializedName("ExpectJobDefaultAlarmStatus")
    @Expose
    private Long ExpectJobDefaultAlarmStatus;

    /**
    * <p>jdk版本</p>
    */
    @SerializedName("JdkVersion")
    @Expose
    private String JdkVersion;

    /**
    * <p>状态桶名字</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StateCOSBucket")
    @Expose
    private String StateCOSBucket;

    /**
    * <p>新的状态桶名字</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NewStateCOSBucket")
    @Expose
    private String NewStateCOSBucket;

    /**
    * <p>同类型</p><p>枚举值：</p><ul><li>0： 普通桶</li><li>1： 加速桶</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StateCOSBucketType")
    @Expose
    private Long StateCOSBucketType;

    /**
    * <p>新的桶类型</p><p>枚举值：</p><ul><li>0： 普通桶</li><li>1： 加速桶</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NewStateCOSBucketType")
    @Expose
    private Long NewStateCOSBucketType;

    /**
     * Get <p>作业ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobId <p>作业ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set <p>作业ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobId <p>作业ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>可用区</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Zone <p>可用区</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Zone <p>可用区</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>用户AppId</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId <p>用户AppId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>用户AppId</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId <p>用户AppId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>用户UIN</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerUin <p>用户UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>用户UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerUin <p>用户UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>创建者UIN</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatorUin <p>创建者UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set <p>创建者UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatorUin <p>创建者UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatorUin(String CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * Get <p>作业名字</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>作业名字</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>作业名字</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>作业名字</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>作业类型，1：sql作业，2：Jar作业</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobType <p>作业类型，1：sql作业，2：Jar作业</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getJobType() {
        return this.JobType;
    }

    /**
     * Set <p>作业类型，1：sql作业，2：Jar作业</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobType <p>作业类型，1：sql作业，2：Jar作业</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobType(Long JobType) {
        this.JobType = JobType;
    }

    /**
     * Get <p>作业状态，1：未初始化，2：未发布，3：操作中，4：运行中，5：停止，6：暂停，-1：故障</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>作业状态，1：未初始化，2：未发布，3：操作中，4：运行中，5：停止，6：暂停，-1：故障</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>作业状态，1：未初始化，2：未发布，3：操作中，4：运行中，5：停止，6：暂停，-1：故障</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>作业状态，1：未初始化，2：未发布，3：操作中，4：运行中，5：停止，6：暂停，-1：故障</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>作业创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>作业创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>作业创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>作业创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>作业启动时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime <p>作业启动时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>作业启动时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime <p>作业启动时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>作业停止时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StopTime <p>作业停止时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStopTime() {
        return this.StopTime;
    }

    /**
     * Set <p>作业停止时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StopTime <p>作业停止时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStopTime(String StopTime) {
        this.StopTime = StopTime;
    }

    /**
     * Get <p>作业更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime <p>作业更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>作业更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime <p>作业更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>作业累计运行时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalRunMillis <p>作业累计运行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalRunMillis() {
        return this.TotalRunMillis;
    }

    /**
     * Set <p>作业累计运行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalRunMillis <p>作业累计运行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalRunMillis(Long TotalRunMillis) {
        this.TotalRunMillis = TotalRunMillis;
    }

    /**
     * Get <p>备注信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark <p>备注信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark <p>备注信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>操作错误提示信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastOpResult <p>操作错误提示信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastOpResult() {
        return this.LastOpResult;
    }

    /**
     * Set <p>操作错误提示信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastOpResult <p>操作错误提示信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastOpResult(String LastOpResult) {
        this.LastOpResult = LastOpResult;
    }

    /**
     * Get <p>集群名字</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterName <p>集群名字</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>集群名字</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterName <p>集群名字</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>最新配置版本号，包括已经删除的版本</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestJobConfigVersion <p>最新配置版本号，包括已经删除的版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLatestJobConfigVersion() {
        return this.LatestJobConfigVersion;
    }

    /**
     * Set <p>最新配置版本号，包括已经删除的版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestJobConfigVersion <p>最新配置版本号，包括已经删除的版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestJobConfigVersion(Long LatestJobConfigVersion) {
        this.LatestJobConfigVersion = LatestJobConfigVersion;
    }

    /**
     * Get <p>最新的版本号，不包括已经删除的版本号</p> 
     * @return LatestValidJobConfigVersion <p>最新的版本号，不包括已经删除的版本号</p>
     */
    public Long getLatestValidJobConfigVersion() {
        return this.LatestValidJobConfigVersion;
    }

    /**
     * Set <p>最新的版本号，不包括已经删除的版本号</p>
     * @param LatestValidJobConfigVersion <p>最新的版本号，不包括已经删除的版本号</p>
     */
    public void setLatestValidJobConfigVersion(Long LatestValidJobConfigVersion) {
        this.LatestValidJobConfigVersion = LatestValidJobConfigVersion;
    }

    /**
     * Get <p>已发布的配置版本</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublishedJobConfigVersion <p>已发布的配置版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPublishedJobConfigVersion() {
        return this.PublishedJobConfigVersion;
    }

    /**
     * Set <p>已发布的配置版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublishedJobConfigVersion <p>已发布的配置版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublishedJobConfigVersion(Long PublishedJobConfigVersion) {
        this.PublishedJobConfigVersion = PublishedJobConfigVersion;
    }

    /**
     * Get <p>运行的CU数量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunningCuNum <p>运行的CU数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRunningCuNum() {
        return this.RunningCuNum;
    }

    /**
     * Set <p>运行的CU数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunningCuNum <p>运行的CU数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunningCuNum(Long RunningCuNum) {
        this.RunningCuNum = RunningCuNum;
    }

    /**
     * Get <p>作业内存规格</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CuMem <p>作业内存规格</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCuMem() {
        return this.CuMem;
    }

    /**
     * Set <p>作业内存规格</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CuMem <p>作业内存规格</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCuMem(Long CuMem) {
        this.CuMem = CuMem;
    }

    /**
     * Get <p>作业状态描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusDesc <p>作业状态描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set <p>作业状态描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusDesc <p>作业状态描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get <p>运行状态时表示单次运行时间</p><p>单位：毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurrentRunMillis <p>运行状态时表示单次运行时间</p><p>单位：毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCurrentRunMillis() {
        return this.CurrentRunMillis;
    }

    /**
     * Set <p>运行状态时表示单次运行时间</p><p>单位：毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurrentRunMillis <p>运行状态时表示单次运行时间</p><p>单位：毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurrentRunMillis(Long CurrentRunMillis) {
        this.CurrentRunMillis = CurrentRunMillis;
    }

    /**
     * Get <p>作业所在的集群ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId <p>作业所在的集群ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>作业所在的集群ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId <p>作业所在的集群ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>作业管理WEB UI 入口</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WebUIUrl <p>作业管理WEB UI 入口</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWebUIUrl() {
        return this.WebUIUrl;
    }

    /**
     * Set <p>作业管理WEB UI 入口</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WebUIUrl <p>作业管理WEB UI 入口</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebUIUrl(String WebUIUrl) {
        this.WebUIUrl = WebUIUrl;
    }

    /**
     * Get <p>作业所在集群类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchedulerType <p>作业所在集群类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSchedulerType() {
        return this.SchedulerType;
    }

    /**
     * Set <p>作业所在集群类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchedulerType <p>作业所在集群类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchedulerType(Long SchedulerType) {
        this.SchedulerType = SchedulerType;
    }

    /**
     * Get <p>作业所在集群状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterStatus <p>作业所在集群状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getClusterStatus() {
        return this.ClusterStatus;
    }

    /**
     * Set <p>作业所在集群状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterStatus <p>作业所在集群状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterStatus(Long ClusterStatus) {
        this.ClusterStatus = ClusterStatus;
    }

    /**
     * Get <p>细粒度下的运行的CU数量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunningCu <p>细粒度下的运行的CU数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getRunningCu() {
        return this.RunningCu;
    }

    /**
     * Set <p>细粒度下的运行的CU数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunningCu <p>细粒度下的运行的CU数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunningCu(Float RunningCu) {
        this.RunningCu = RunningCu;
    }

    /**
     * Get <p>作业运行的 Flink 版本</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlinkVersion <p>作业运行的 Flink 版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlinkVersion() {
        return this.FlinkVersion;
    }

    /**
     * Set <p>作业运行的 Flink 版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlinkVersion <p>作业运行的 Flink 版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlinkVersion(String FlinkVersion) {
        this.FlinkVersion = FlinkVersion;
    }

    /**
     * Get <p>工作空间 SerialId</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkSpaceId <p>工作空间 SerialId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkSpaceId() {
        return this.WorkSpaceId;
    }

    /**
     * Set <p>工作空间 SerialId</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkSpaceId <p>工作空间 SerialId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkSpaceId(String WorkSpaceId) {
        this.WorkSpaceId = WorkSpaceId;
    }

    /**
     * Get <p>工作空间名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkSpaceName <p>工作空间名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkSpaceName() {
        return this.WorkSpaceName;
    }

    /**
     * Set <p>工作空间名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkSpaceName <p>工作空间名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkSpaceName(String WorkSpaceName) {
        this.WorkSpaceName = WorkSpaceName;
    }

    /**
     * Get <p>作业标签</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags <p>作业标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>作业标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags <p>作业标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>作业异常事件信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventInfo <p>作业异常事件信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public JobEventInfo getEventInfo() {
        return this.EventInfo;
    }

    /**
     * Set <p>作业异常事件信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventInfo <p>作业异常事件信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventInfo(JobEventInfo EventInfo) {
        this.EventInfo = EventInfo;
    }

    /**
     * Get <p>描述信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>描述信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>描述信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>0:代表没开启调优任务，1:开启智能调优，2:代表定时调优</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScalingType <p>0:代表没开启调优任务，1:开启智能调优，2:代表定时调优</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScalingType() {
        return this.ScalingType;
    }

    /**
     * Set <p>0:代表没开启调优任务，1:开启智能调优，2:代表定时调优</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScalingType <p>0:代表没开启调优任务，1:开启智能调优，2:代表定时调优</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScalingType(Long ScalingType) {
        this.ScalingType = ScalingType;
    }

    /**
     * Get <p>使用CPU数目</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunningCpu <p>使用CPU数目</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getRunningCpu() {
        return this.RunningCpu;
    }

    /**
     * Set <p>使用CPU数目</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunningCpu <p>使用CPU数目</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunningCpu(Float RunningCpu) {
        this.RunningCpu = RunningCpu;
    }

    /**
     * Get <p>使用内存数量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunningMem <p>使用内存数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getRunningMem() {
        return this.RunningMem;
    }

    /**
     * Set <p>使用内存数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunningMem <p>使用内存数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunningMem(Float RunningMem) {
        this.RunningMem = RunningMem;
    }

    /**
     * Get <p>是否开了默认告警</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OpenJobDefaultAlarm <p>是否开了默认告警</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOpenJobDefaultAlarm() {
        return this.OpenJobDefaultAlarm;
    }

    /**
     * Set <p>是否开了默认告警</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OpenJobDefaultAlarm <p>是否开了默认告警</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOpenJobDefaultAlarm(Long OpenJobDefaultAlarm) {
        this.OpenJobDefaultAlarm = OpenJobDefaultAlarm;
    }

    /**
     * Get <p>操作中描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProgressDesc <p>操作中描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProgressDesc() {
        return this.ProgressDesc;
    }

    /**
     * Set <p>操作中描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProgressDesc <p>操作中描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProgressDesc(String ProgressDesc) {
        this.ProgressDesc = ProgressDesc;
    }

    /**
     * Get <p>停止持续告警</p> 
     * @return ContinueAlarm <p>停止持续告警</p>
     */
    public Long getContinueAlarm() {
        return this.ContinueAlarm;
    }

    /**
     * Set <p>停止持续告警</p>
     * @param ContinueAlarm <p>停止持续告警</p>
     */
    public void setContinueAlarm(Long ContinueAlarm) {
        this.ContinueAlarm = ContinueAlarm;
    }

    /**
     * Get <p>作业重启次数</p> 
     * @return RestartCount <p>作业重启次数</p>
     */
    public Long getRestartCount() {
        return this.RestartCount;
    }

    /**
     * Set <p>作业重启次数</p>
     * @param RestartCount <p>作业重启次数</p>
     */
    public void setRestartCount(Long RestartCount) {
        this.RestartCount = RestartCount;
    }

    /**
     * Get <p>期望是开启默认告警</p> 
     * @return ExpectJobDefaultAlarmStatus <p>期望是开启默认告警</p>
     */
    public Long getExpectJobDefaultAlarmStatus() {
        return this.ExpectJobDefaultAlarmStatus;
    }

    /**
     * Set <p>期望是开启默认告警</p>
     * @param ExpectJobDefaultAlarmStatus <p>期望是开启默认告警</p>
     */
    public void setExpectJobDefaultAlarmStatus(Long ExpectJobDefaultAlarmStatus) {
        this.ExpectJobDefaultAlarmStatus = ExpectJobDefaultAlarmStatus;
    }

    /**
     * Get <p>jdk版本</p> 
     * @return JdkVersion <p>jdk版本</p>
     */
    public String getJdkVersion() {
        return this.JdkVersion;
    }

    /**
     * Set <p>jdk版本</p>
     * @param JdkVersion <p>jdk版本</p>
     */
    public void setJdkVersion(String JdkVersion) {
        this.JdkVersion = JdkVersion;
    }

    /**
     * Get <p>状态桶名字</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StateCOSBucket <p>状态桶名字</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStateCOSBucket() {
        return this.StateCOSBucket;
    }

    /**
     * Set <p>状态桶名字</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StateCOSBucket <p>状态桶名字</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStateCOSBucket(String StateCOSBucket) {
        this.StateCOSBucket = StateCOSBucket;
    }

    /**
     * Get <p>新的状态桶名字</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NewStateCOSBucket <p>新的状态桶名字</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNewStateCOSBucket() {
        return this.NewStateCOSBucket;
    }

    /**
     * Set <p>新的状态桶名字</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NewStateCOSBucket <p>新的状态桶名字</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNewStateCOSBucket(String NewStateCOSBucket) {
        this.NewStateCOSBucket = NewStateCOSBucket;
    }

    /**
     * Get <p>同类型</p><p>枚举值：</p><ul><li>0： 普通桶</li><li>1： 加速桶</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StateCOSBucketType <p>同类型</p><p>枚举值：</p><ul><li>0： 普通桶</li><li>1： 加速桶</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStateCOSBucketType() {
        return this.StateCOSBucketType;
    }

    /**
     * Set <p>同类型</p><p>枚举值：</p><ul><li>0： 普通桶</li><li>1： 加速桶</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StateCOSBucketType <p>同类型</p><p>枚举值：</p><ul><li>0： 普通桶</li><li>1： 加速桶</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStateCOSBucketType(Long StateCOSBucketType) {
        this.StateCOSBucketType = StateCOSBucketType;
    }

    /**
     * Get <p>新的桶类型</p><p>枚举值：</p><ul><li>0： 普通桶</li><li>1： 加速桶</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NewStateCOSBucketType <p>新的桶类型</p><p>枚举值：</p><ul><li>0： 普通桶</li><li>1： 加速桶</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNewStateCOSBucketType() {
        return this.NewStateCOSBucketType;
    }

    /**
     * Set <p>新的桶类型</p><p>枚举值：</p><ul><li>0： 普通桶</li><li>1： 加速桶</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NewStateCOSBucketType <p>新的桶类型</p><p>枚举值：</p><ul><li>0： 普通桶</li><li>1： 加速桶</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNewStateCOSBucketType(Long NewStateCOSBucketType) {
        this.NewStateCOSBucketType = NewStateCOSBucketType;
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
        if (source.LatestValidJobConfigVersion != null) {
            this.LatestValidJobConfigVersion = new Long(source.LatestValidJobConfigVersion);
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
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.EventInfo != null) {
            this.EventInfo = new JobEventInfo(source.EventInfo);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ScalingType != null) {
            this.ScalingType = new Long(source.ScalingType);
        }
        if (source.RunningCpu != null) {
            this.RunningCpu = new Float(source.RunningCpu);
        }
        if (source.RunningMem != null) {
            this.RunningMem = new Float(source.RunningMem);
        }
        if (source.OpenJobDefaultAlarm != null) {
            this.OpenJobDefaultAlarm = new Long(source.OpenJobDefaultAlarm);
        }
        if (source.ProgressDesc != null) {
            this.ProgressDesc = new String(source.ProgressDesc);
        }
        if (source.ContinueAlarm != null) {
            this.ContinueAlarm = new Long(source.ContinueAlarm);
        }
        if (source.RestartCount != null) {
            this.RestartCount = new Long(source.RestartCount);
        }
        if (source.ExpectJobDefaultAlarmStatus != null) {
            this.ExpectJobDefaultAlarmStatus = new Long(source.ExpectJobDefaultAlarmStatus);
        }
        if (source.JdkVersion != null) {
            this.JdkVersion = new String(source.JdkVersion);
        }
        if (source.StateCOSBucket != null) {
            this.StateCOSBucket = new String(source.StateCOSBucket);
        }
        if (source.NewStateCOSBucket != null) {
            this.NewStateCOSBucket = new String(source.NewStateCOSBucket);
        }
        if (source.StateCOSBucketType != null) {
            this.StateCOSBucketType = new Long(source.StateCOSBucketType);
        }
        if (source.NewStateCOSBucketType != null) {
            this.NewStateCOSBucketType = new Long(source.NewStateCOSBucketType);
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
        this.setParamSimple(map, prefix + "LatestValidJobConfigVersion", this.LatestValidJobConfigVersion);
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
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "EventInfo.", this.EventInfo);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ScalingType", this.ScalingType);
        this.setParamSimple(map, prefix + "RunningCpu", this.RunningCpu);
        this.setParamSimple(map, prefix + "RunningMem", this.RunningMem);
        this.setParamSimple(map, prefix + "OpenJobDefaultAlarm", this.OpenJobDefaultAlarm);
        this.setParamSimple(map, prefix + "ProgressDesc", this.ProgressDesc);
        this.setParamSimple(map, prefix + "ContinueAlarm", this.ContinueAlarm);
        this.setParamSimple(map, prefix + "RestartCount", this.RestartCount);
        this.setParamSimple(map, prefix + "ExpectJobDefaultAlarmStatus", this.ExpectJobDefaultAlarmStatus);
        this.setParamSimple(map, prefix + "JdkVersion", this.JdkVersion);
        this.setParamSimple(map, prefix + "StateCOSBucket", this.StateCOSBucket);
        this.setParamSimple(map, prefix + "NewStateCOSBucket", this.NewStateCOSBucket);
        this.setParamSimple(map, prefix + "StateCOSBucketType", this.StateCOSBucketType);
        this.setParamSimple(map, prefix + "NewStateCOSBucketType", this.NewStateCOSBucketType);

    }
}

