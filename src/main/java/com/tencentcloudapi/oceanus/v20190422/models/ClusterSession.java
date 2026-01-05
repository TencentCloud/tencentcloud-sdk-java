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
    * 集群SerialId
    */
    @SerializedName("ClusterGroupSerialId")
    @Expose
    private String ClusterGroupSerialId;

    /**
    * 创建者appId
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 创建者主账号
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 创建者账号
    */
    @SerializedName("CreatorUin")
    @Expose
    private String CreatorUin;

    /**
    * 区域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * zone
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Session集群状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Session集群消耗的cu数量
    */
    @SerializedName("CuNum")
    @Expose
    private Float CuNum;

    /**
    * Session集群的Flink版本
    */
    @SerializedName("FlinkVersion")
    @Expose
    private String FlinkVersion;

    /**
    * session集群FlinkUi地址
    */
    @SerializedName("WebUIUrl")
    @Expose
    private String WebUIUrl;

    /**
    * session集群高级参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Properties")
    @Expose
    private Property [] Properties;

    /**
    * 引用资源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceRefs")
    @Expose
    private SessionClusterRefItem [] ResourceRefs;

    /**
    * JobManager的规格
    */
    @SerializedName("JobManagerCuSpec")
    @Expose
    private Float JobManagerCuSpec;

    /**
    * TaskManager的规格
    */
    @SerializedName("TaskManagerCuSpec")
    @Expose
    private Float TaskManagerCuSpec;

    /**
    * TaskManager启动的数量
    */
    @SerializedName("TaskManagerNum")
    @Expose
    private Long TaskManagerNum;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * JobManagerCpu
    */
    @SerializedName("JobManagerCpu")
    @Expose
    private Float JobManagerCpu;

    /**
    * JobManagerMem
    */
    @SerializedName("JobManagerMem")
    @Expose
    private Float JobManagerMem;

    /**
    * TaskManagerCpu
    */
    @SerializedName("TaskManagerCpu")
    @Expose
    private Float TaskManagerCpu;

    /**
    * TaskManagerMem
    */
    @SerializedName("TaskManagerMem")
    @Expose
    private Float TaskManagerMem;

    /**
    * jdk版本
    */
    @SerializedName("JdkVersion")
    @Expose
    private String JdkVersion;

    /**
     * Get 集群SerialId 
     * @return ClusterGroupSerialId 集群SerialId
     */
    public String getClusterGroupSerialId() {
        return this.ClusterGroupSerialId;
    }

    /**
     * Set 集群SerialId
     * @param ClusterGroupSerialId 集群SerialId
     */
    public void setClusterGroupSerialId(String ClusterGroupSerialId) {
        this.ClusterGroupSerialId = ClusterGroupSerialId;
    }

    /**
     * Get 创建者appId 
     * @return AppId 创建者appId
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 创建者appId
     * @param AppId 创建者appId
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 创建者主账号 
     * @return OwnerUin 创建者主账号
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 创建者主账号
     * @param OwnerUin 创建者主账号
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 创建者账号 
     * @return CreatorUin 创建者账号
     */
    public String getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set 创建者账号
     * @param CreatorUin 创建者账号
     */
    public void setCreatorUin(String CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * Get 区域 
     * @return Region 区域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 区域
     * @param Region 区域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get zone 
     * @return Zone zone
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set zone
     * @param Zone zone
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Session集群状态 
     * @return Status Session集群状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Session集群状态
     * @param Status Session集群状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Session集群消耗的cu数量 
     * @return CuNum Session集群消耗的cu数量
     */
    public Float getCuNum() {
        return this.CuNum;
    }

    /**
     * Set Session集群消耗的cu数量
     * @param CuNum Session集群消耗的cu数量
     */
    public void setCuNum(Float CuNum) {
        this.CuNum = CuNum;
    }

    /**
     * Get Session集群的Flink版本 
     * @return FlinkVersion Session集群的Flink版本
     */
    public String getFlinkVersion() {
        return this.FlinkVersion;
    }

    /**
     * Set Session集群的Flink版本
     * @param FlinkVersion Session集群的Flink版本
     */
    public void setFlinkVersion(String FlinkVersion) {
        this.FlinkVersion = FlinkVersion;
    }

    /**
     * Get session集群FlinkUi地址 
     * @return WebUIUrl session集群FlinkUi地址
     */
    public String getWebUIUrl() {
        return this.WebUIUrl;
    }

    /**
     * Set session集群FlinkUi地址
     * @param WebUIUrl session集群FlinkUi地址
     */
    public void setWebUIUrl(String WebUIUrl) {
        this.WebUIUrl = WebUIUrl;
    }

    /**
     * Get session集群高级参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Properties session集群高级参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Property [] getProperties() {
        return this.Properties;
    }

    /**
     * Set session集群高级参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Properties session集群高级参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProperties(Property [] Properties) {
        this.Properties = Properties;
    }

    /**
     * Get 引用资源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceRefs 引用资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SessionClusterRefItem [] getResourceRefs() {
        return this.ResourceRefs;
    }

    /**
     * Set 引用资源
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceRefs 引用资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceRefs(SessionClusterRefItem [] ResourceRefs) {
        this.ResourceRefs = ResourceRefs;
    }

    /**
     * Get JobManager的规格 
     * @return JobManagerCuSpec JobManager的规格
     */
    public Float getJobManagerCuSpec() {
        return this.JobManagerCuSpec;
    }

    /**
     * Set JobManager的规格
     * @param JobManagerCuSpec JobManager的规格
     */
    public void setJobManagerCuSpec(Float JobManagerCuSpec) {
        this.JobManagerCuSpec = JobManagerCuSpec;
    }

    /**
     * Get TaskManager的规格 
     * @return TaskManagerCuSpec TaskManager的规格
     */
    public Float getTaskManagerCuSpec() {
        return this.TaskManagerCuSpec;
    }

    /**
     * Set TaskManager的规格
     * @param TaskManagerCuSpec TaskManager的规格
     */
    public void setTaskManagerCuSpec(Float TaskManagerCuSpec) {
        this.TaskManagerCuSpec = TaskManagerCuSpec;
    }

    /**
     * Get TaskManager启动的数量 
     * @return TaskManagerNum TaskManager启动的数量
     */
    public Long getTaskManagerNum() {
        return this.TaskManagerNum;
    }

    /**
     * Set TaskManager启动的数量
     * @param TaskManagerNum TaskManager启动的数量
     */
    public void setTaskManagerNum(Long TaskManagerNum) {
        this.TaskManagerNum = TaskManagerNum;
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
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get JobManagerCpu 
     * @return JobManagerCpu JobManagerCpu
     */
    public Float getJobManagerCpu() {
        return this.JobManagerCpu;
    }

    /**
     * Set JobManagerCpu
     * @param JobManagerCpu JobManagerCpu
     */
    public void setJobManagerCpu(Float JobManagerCpu) {
        this.JobManagerCpu = JobManagerCpu;
    }

    /**
     * Get JobManagerMem 
     * @return JobManagerMem JobManagerMem
     */
    public Float getJobManagerMem() {
        return this.JobManagerMem;
    }

    /**
     * Set JobManagerMem
     * @param JobManagerMem JobManagerMem
     */
    public void setJobManagerMem(Float JobManagerMem) {
        this.JobManagerMem = JobManagerMem;
    }

    /**
     * Get TaskManagerCpu 
     * @return TaskManagerCpu TaskManagerCpu
     */
    public Float getTaskManagerCpu() {
        return this.TaskManagerCpu;
    }

    /**
     * Set TaskManagerCpu
     * @param TaskManagerCpu TaskManagerCpu
     */
    public void setTaskManagerCpu(Float TaskManagerCpu) {
        this.TaskManagerCpu = TaskManagerCpu;
    }

    /**
     * Get TaskManagerMem 
     * @return TaskManagerMem TaskManagerMem
     */
    public Float getTaskManagerMem() {
        return this.TaskManagerMem;
    }

    /**
     * Set TaskManagerMem
     * @param TaskManagerMem TaskManagerMem
     */
    public void setTaskManagerMem(Float TaskManagerMem) {
        this.TaskManagerMem = TaskManagerMem;
    }

    /**
     * Get jdk版本 
     * @return JdkVersion jdk版本
     */
    public String getJdkVersion() {
        return this.JdkVersion;
    }

    /**
     * Set jdk版本
     * @param JdkVersion jdk版本
     */
    public void setJdkVersion(String JdkVersion) {
        this.JdkVersion = JdkVersion;
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

    }
}

