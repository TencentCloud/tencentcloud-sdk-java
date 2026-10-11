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

public class ClusterSession extends AbstractModel {

    /**
    * <p>集群SerialId</p>
    */
    @SerializedName("ClusterGroupSerialId")
    @Expose
    private String ClusterGroupSerialId;

    /**
    * <p>创建者appId</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>创建者主账号</p>
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * <p>创建者账号</p>
    */
    @SerializedName("CreatorUin")
    @Expose
    private String CreatorUin;

    /**
    * <p>区域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>zone</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>Session集群状态</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Session集群消耗的cu数量</p>
    */
    @SerializedName("CuNum")
    @Expose
    private Float CuNum;

    /**
    * <p>Session集群的Flink版本</p>
    */
    @SerializedName("FlinkVersion")
    @Expose
    private String FlinkVersion;

    /**
    * <p>session集群FlinkUi地址</p>
    */
    @SerializedName("WebUIUrl")
    @Expose
    private String WebUIUrl;

    /**
    * <p>session集群高级参数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Properties")
    @Expose
    private Property [] Properties;

    /**
    * <p>引用资源</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceRefs")
    @Expose
    private SessionClusterRefItem [] ResourceRefs;

    /**
    * <p>JobManager的规格</p>
    */
    @SerializedName("JobManagerCuSpec")
    @Expose
    private Float JobManagerCuSpec;

    /**
    * <p>TaskManager的规格</p>
    */
    @SerializedName("TaskManagerCuSpec")
    @Expose
    private Float TaskManagerCuSpec;

    /**
    * <p>TaskManager启动的数量</p>
    */
    @SerializedName("TaskManagerNum")
    @Expose
    private Long TaskManagerNum;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>JobManagerCpu</p>
    */
    @SerializedName("JobManagerCpu")
    @Expose
    private Float JobManagerCpu;

    /**
    * <p>JobManagerMem</p>
    */
    @SerializedName("JobManagerMem")
    @Expose
    private Float JobManagerMem;

    /**
    * <p>TaskManagerCpu</p>
    */
    @SerializedName("TaskManagerCpu")
    @Expose
    private Float TaskManagerCpu;

    /**
    * <p>TaskManagerMem</p>
    */
    @SerializedName("TaskManagerMem")
    @Expose
    private Float TaskManagerMem;

    /**
    * <p>jdk版本</p>
    */
    @SerializedName("JdkVersion")
    @Expose
    private String JdkVersion;

    /**
    * <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>session集群SerialId</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SerialId")
    @Expose
    private String SerialId;

    /**
    * <p>集群名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterGroupName")
    @Expose
    private String ClusterGroupName;

    /**
    * <p>cu</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCpu")
    @Expose
    private Float TotalCpu;

    /**
    * <p>使用Mem</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalMem")
    @Expose
    private Float TotalMem;

    /**
    * <p>空间Id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkSpaceId")
    @Expose
    private String WorkSpaceId;

    /**
    * <p>空间名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkSpaceName")
    @Expose
    private String WorkSpaceName;

    /**
    * <p>标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>采集日志配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogConfig")
    @Expose
    private String LogConfig;

    /**
    * <p>更新用户</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateUin")
    @Expose
    private String UpdateUin;

    /**
     * Get <p>集群SerialId</p> 
     * @return ClusterGroupSerialId <p>集群SerialId</p>
     */
    public String getClusterGroupSerialId() {
        return this.ClusterGroupSerialId;
    }

    /**
     * Set <p>集群SerialId</p>
     * @param ClusterGroupSerialId <p>集群SerialId</p>
     */
    public void setClusterGroupSerialId(String ClusterGroupSerialId) {
        this.ClusterGroupSerialId = ClusterGroupSerialId;
    }

    /**
     * Get <p>创建者appId</p> 
     * @return AppId <p>创建者appId</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>创建者appId</p>
     * @param AppId <p>创建者appId</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>创建者主账号</p> 
     * @return OwnerUin <p>创建者主账号</p>
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>创建者主账号</p>
     * @param OwnerUin <p>创建者主账号</p>
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>创建者账号</p> 
     * @return CreatorUin <p>创建者账号</p>
     */
    public String getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set <p>创建者账号</p>
     * @param CreatorUin <p>创建者账号</p>
     */
    public void setCreatorUin(String CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * Get <p>区域</p> 
     * @return Region <p>区域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>区域</p>
     * @param Region <p>区域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>zone</p> 
     * @return Zone <p>zone</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>zone</p>
     * @param Zone <p>zone</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>Session集群状态</p> 
     * @return Status <p>Session集群状态</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Session集群状态</p>
     * @param Status <p>Session集群状态</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Session集群消耗的cu数量</p> 
     * @return CuNum <p>Session集群消耗的cu数量</p>
     */
    public Float getCuNum() {
        return this.CuNum;
    }

    /**
     * Set <p>Session集群消耗的cu数量</p>
     * @param CuNum <p>Session集群消耗的cu数量</p>
     */
    public void setCuNum(Float CuNum) {
        this.CuNum = CuNum;
    }

    /**
     * Get <p>Session集群的Flink版本</p> 
     * @return FlinkVersion <p>Session集群的Flink版本</p>
     */
    public String getFlinkVersion() {
        return this.FlinkVersion;
    }

    /**
     * Set <p>Session集群的Flink版本</p>
     * @param FlinkVersion <p>Session集群的Flink版本</p>
     */
    public void setFlinkVersion(String FlinkVersion) {
        this.FlinkVersion = FlinkVersion;
    }

    /**
     * Get <p>session集群FlinkUi地址</p> 
     * @return WebUIUrl <p>session集群FlinkUi地址</p>
     */
    public String getWebUIUrl() {
        return this.WebUIUrl;
    }

    /**
     * Set <p>session集群FlinkUi地址</p>
     * @param WebUIUrl <p>session集群FlinkUi地址</p>
     */
    public void setWebUIUrl(String WebUIUrl) {
        this.WebUIUrl = WebUIUrl;
    }

    /**
     * Get <p>session集群高级参数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Properties <p>session集群高级参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Property [] getProperties() {
        return this.Properties;
    }

    /**
     * Set <p>session集群高级参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Properties <p>session集群高级参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProperties(Property [] Properties) {
        this.Properties = Properties;
    }

    /**
     * Get <p>引用资源</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceRefs <p>引用资源</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SessionClusterRefItem [] getResourceRefs() {
        return this.ResourceRefs;
    }

    /**
     * Set <p>引用资源</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceRefs <p>引用资源</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceRefs(SessionClusterRefItem [] ResourceRefs) {
        this.ResourceRefs = ResourceRefs;
    }

    /**
     * Get <p>JobManager的规格</p> 
     * @return JobManagerCuSpec <p>JobManager的规格</p>
     */
    public Float getJobManagerCuSpec() {
        return this.JobManagerCuSpec;
    }

    /**
     * Set <p>JobManager的规格</p>
     * @param JobManagerCuSpec <p>JobManager的规格</p>
     */
    public void setJobManagerCuSpec(Float JobManagerCuSpec) {
        this.JobManagerCuSpec = JobManagerCuSpec;
    }

    /**
     * Get <p>TaskManager的规格</p> 
     * @return TaskManagerCuSpec <p>TaskManager的规格</p>
     */
    public Float getTaskManagerCuSpec() {
        return this.TaskManagerCuSpec;
    }

    /**
     * Set <p>TaskManager的规格</p>
     * @param TaskManagerCuSpec <p>TaskManager的规格</p>
     */
    public void setTaskManagerCuSpec(Float TaskManagerCuSpec) {
        this.TaskManagerCuSpec = TaskManagerCuSpec;
    }

    /**
     * Get <p>TaskManager启动的数量</p> 
     * @return TaskManagerNum <p>TaskManager启动的数量</p>
     */
    public Long getTaskManagerNum() {
        return this.TaskManagerNum;
    }

    /**
     * Set <p>TaskManager启动的数量</p>
     * @param TaskManagerNum <p>TaskManager启动的数量</p>
     */
    public void setTaskManagerNum(Long TaskManagerNum) {
        this.TaskManagerNum = TaskManagerNum;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdateTime <p>更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateTime <p>更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>JobManagerCpu</p> 
     * @return JobManagerCpu <p>JobManagerCpu</p>
     */
    public Float getJobManagerCpu() {
        return this.JobManagerCpu;
    }

    /**
     * Set <p>JobManagerCpu</p>
     * @param JobManagerCpu <p>JobManagerCpu</p>
     */
    public void setJobManagerCpu(Float JobManagerCpu) {
        this.JobManagerCpu = JobManagerCpu;
    }

    /**
     * Get <p>JobManagerMem</p> 
     * @return JobManagerMem <p>JobManagerMem</p>
     */
    public Float getJobManagerMem() {
        return this.JobManagerMem;
    }

    /**
     * Set <p>JobManagerMem</p>
     * @param JobManagerMem <p>JobManagerMem</p>
     */
    public void setJobManagerMem(Float JobManagerMem) {
        this.JobManagerMem = JobManagerMem;
    }

    /**
     * Get <p>TaskManagerCpu</p> 
     * @return TaskManagerCpu <p>TaskManagerCpu</p>
     */
    public Float getTaskManagerCpu() {
        return this.TaskManagerCpu;
    }

    /**
     * Set <p>TaskManagerCpu</p>
     * @param TaskManagerCpu <p>TaskManagerCpu</p>
     */
    public void setTaskManagerCpu(Float TaskManagerCpu) {
        this.TaskManagerCpu = TaskManagerCpu;
    }

    /**
     * Get <p>TaskManagerMem</p> 
     * @return TaskManagerMem <p>TaskManagerMem</p>
     */
    public Float getTaskManagerMem() {
        return this.TaskManagerMem;
    }

    /**
     * Set <p>TaskManagerMem</p>
     * @param TaskManagerMem <p>TaskManagerMem</p>
     */
    public void setTaskManagerMem(Float TaskManagerMem) {
        this.TaskManagerMem = TaskManagerMem;
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
     * Get <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>session集群SerialId</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SerialId <p>session集群SerialId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSerialId() {
        return this.SerialId;
    }

    /**
     * Set <p>session集群SerialId</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SerialId <p>session集群SerialId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSerialId(String SerialId) {
        this.SerialId = SerialId;
    }

    /**
     * Get <p>集群名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterGroupName <p>集群名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterGroupName() {
        return this.ClusterGroupName;
    }

    /**
     * Set <p>集群名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterGroupName <p>集群名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterGroupName(String ClusterGroupName) {
        this.ClusterGroupName = ClusterGroupName;
    }

    /**
     * Get <p>cu</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCpu <p>cu</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTotalCpu() {
        return this.TotalCpu;
    }

    /**
     * Set <p>cu</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCpu <p>cu</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCpu(Float TotalCpu) {
        this.TotalCpu = TotalCpu;
    }

    /**
     * Get <p>使用Mem</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalMem <p>使用Mem</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTotalMem() {
        return this.TotalMem;
    }

    /**
     * Set <p>使用Mem</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalMem <p>使用Mem</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalMem(Float TotalMem) {
        this.TotalMem = TotalMem;
    }

    /**
     * Get <p>空间Id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkSpaceId <p>空间Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkSpaceId() {
        return this.WorkSpaceId;
    }

    /**
     * Set <p>空间Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkSpaceId <p>空间Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkSpaceId(String WorkSpaceId) {
        this.WorkSpaceId = WorkSpaceId;
    }

    /**
     * Get <p>空间名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkSpaceName <p>空间名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkSpaceName() {
        return this.WorkSpaceName;
    }

    /**
     * Set <p>空间名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkSpaceName <p>空间名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkSpaceName(String WorkSpaceName) {
        this.WorkSpaceName = WorkSpaceName;
    }

    /**
     * Get <p>标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags <p>标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags <p>标签列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>采集日志配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogConfig <p>采集日志配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogConfig() {
        return this.LogConfig;
    }

    /**
     * Set <p>采集日志配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogConfig <p>采集日志配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogConfig(String LogConfig) {
        this.LogConfig = LogConfig;
    }

    /**
     * Get <p>更新用户</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateUin <p>更新用户</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateUin() {
        return this.UpdateUin;
    }

    /**
     * Set <p>更新用户</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateUin <p>更新用户</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateUin(String UpdateUin) {
        this.UpdateUin = UpdateUin;
    }

    public ClusterSession() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterSession(ClusterSession source) {
        if (source.ClusterGroupSerialId != null) {
            this.ClusterGroupSerialId = new String(source.ClusterGroupSerialId);
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
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CuNum != null) {
            this.CuNum = new Float(source.CuNum);
        }
        if (source.FlinkVersion != null) {
            this.FlinkVersion = new String(source.FlinkVersion);
        }
        if (source.WebUIUrl != null) {
            this.WebUIUrl = new String(source.WebUIUrl);
        }
        if (source.Properties != null) {
            this.Properties = new Property[source.Properties.length];
            for (int i = 0; i < source.Properties.length; i++) {
                this.Properties[i] = new Property(source.Properties[i]);
            }
        }
        if (source.ResourceRefs != null) {
            this.ResourceRefs = new SessionClusterRefItem[source.ResourceRefs.length];
            for (int i = 0; i < source.ResourceRefs.length; i++) {
                this.ResourceRefs[i] = new SessionClusterRefItem(source.ResourceRefs[i]);
            }
        }
        if (source.JobManagerCuSpec != null) {
            this.JobManagerCuSpec = new Float(source.JobManagerCuSpec);
        }
        if (source.TaskManagerCuSpec != null) {
            this.TaskManagerCuSpec = new Float(source.TaskManagerCuSpec);
        }
        if (source.TaskManagerNum != null) {
            this.TaskManagerNum = new Long(source.TaskManagerNum);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.JobManagerCpu != null) {
            this.JobManagerCpu = new Float(source.JobManagerCpu);
        }
        if (source.JobManagerMem != null) {
            this.JobManagerMem = new Float(source.JobManagerMem);
        }
        if (source.TaskManagerCpu != null) {
            this.TaskManagerCpu = new Float(source.TaskManagerCpu);
        }
        if (source.TaskManagerMem != null) {
            this.TaskManagerMem = new Float(source.TaskManagerMem);
        }
        if (source.JdkVersion != null) {
            this.JdkVersion = new String(source.JdkVersion);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SerialId != null) {
            this.SerialId = new String(source.SerialId);
        }
        if (source.ClusterGroupName != null) {
            this.ClusterGroupName = new String(source.ClusterGroupName);
        }
        if (source.TotalCpu != null) {
            this.TotalCpu = new Float(source.TotalCpu);
        }
        if (source.TotalMem != null) {
            this.TotalMem = new Float(source.TotalMem);
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
        if (source.LogConfig != null) {
            this.LogConfig = new String(source.LogConfig);
        }
        if (source.UpdateUin != null) {
            this.UpdateUin = new String(source.UpdateUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterGroupSerialId", this.ClusterGroupSerialId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "CreatorUin", this.CreatorUin);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CuNum", this.CuNum);
        this.setParamSimple(map, prefix + "FlinkVersion", this.FlinkVersion);
        this.setParamSimple(map, prefix + "WebUIUrl", this.WebUIUrl);
        this.setParamArrayObj(map, prefix + "Properties.", this.Properties);
        this.setParamArrayObj(map, prefix + "ResourceRefs.", this.ResourceRefs);
        this.setParamSimple(map, prefix + "JobManagerCuSpec", this.JobManagerCuSpec);
        this.setParamSimple(map, prefix + "TaskManagerCuSpec", this.TaskManagerCuSpec);
        this.setParamSimple(map, prefix + "TaskManagerNum", this.TaskManagerNum);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "JobManagerCpu", this.JobManagerCpu);
        this.setParamSimple(map, prefix + "JobManagerMem", this.JobManagerMem);
        this.setParamSimple(map, prefix + "TaskManagerCpu", this.TaskManagerCpu);
        this.setParamSimple(map, prefix + "TaskManagerMem", this.TaskManagerMem);
        this.setParamSimple(map, prefix + "JdkVersion", this.JdkVersion);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SerialId", this.SerialId);
        this.setParamSimple(map, prefix + "ClusterGroupName", this.ClusterGroupName);
        this.setParamSimple(map, prefix + "TotalCpu", this.TotalCpu);
        this.setParamSimple(map, prefix + "TotalMem", this.TotalMem);
        this.setParamSimple(map, prefix + "WorkSpaceId", this.WorkSpaceId);
        this.setParamSimple(map, prefix + "WorkSpaceName", this.WorkSpaceName);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "LogConfig", this.LogConfig);
        this.setParamSimple(map, prefix + "UpdateUin", this.UpdateUin);

    }
}

