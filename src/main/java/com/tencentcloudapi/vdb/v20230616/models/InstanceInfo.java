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
package com.tencentcloudapi.vdb.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceInfo extends AbstractModel {

    /**
    * 实例ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例自定义名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 用户APPID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 地域。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 可用区。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 产品。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 网络信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Networks")
    @Expose
    private Network [] Networks;

    /**
    * 分片信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShardNum")
    @Expose
    private Long ShardNum;

    /**
    * 副本数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReplicaNum")
    @Expose
    private Long ReplicaNum;

    /**
    * CPU.
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cpu")
    @Expose
    private Float Cpu;

    /**
    * 内存。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Memory")
    @Expose
    private Float Memory;

    /**
    * 磁盘。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Disk")
    @Expose
    private Long Disk;

    /**
    * 健康得分。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HealthScore")
    @Expose
    private Float HealthScore;

    /**
    * 异常告警。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Warning")
    @Expose
    private Long Warning;

    /**
    * 所属项目。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Project")
    @Expose
    private String Project;

    /**
    * 所属标签。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceTags")
    @Expose
    private Tag [] ResourceTags;

    /**
    * 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 资源状态。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 引擎名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineName")
    @Expose
    private String EngineName;

    /**
    * 引擎版本。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * 计费模式。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 差异化扩展信息, json格式。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Extend")
    @Expose
    private String Extend;

    /**
    * 过期时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpiredAt")
    @Expose
    private String ExpiredAt;

    /**
    * 是否不过期(永久)。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsNoExpired")
    @Expose
    private Boolean IsNoExpired;

    /**
    * 外网地址。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WanAddress")
    @Expose
    private String WanAddress;

    /**
     * Get 实例ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例自定义名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 实例自定义名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 实例自定义名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 实例自定义名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 用户APPID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId 用户APPID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户APPID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId 用户APPID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 地域。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 地域。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 地域。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 可用区。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Zone 可用区。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Zone 可用区。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 产品。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Product 产品。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 产品。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Product 产品。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 网络信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Networks 网络信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Network [] getNetworks() {
        return this.Networks;
    }

    /**
     * Set 网络信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Networks 网络信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetworks(Network [] Networks) {
        this.Networks = Networks;
    }

    /**
     * Get 分片信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShardNum 分片信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getShardNum() {
        return this.ShardNum;
    }

    /**
     * Set 分片信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShardNum 分片信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShardNum(Long ShardNum) {
        this.ShardNum = ShardNum;
    }

    /**
     * Get 副本数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReplicaNum 副本数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReplicaNum() {
        return this.ReplicaNum;
    }

    /**
     * Set 副本数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReplicaNum 副本数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplicaNum(Long ReplicaNum) {
        this.ReplicaNum = ReplicaNum;
    }

    /**
     * Get CPU.
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cpu CPU.
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getCpu() {
        return this.Cpu;
    }

    /**
     * Set CPU.
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cpu CPU.
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpu(Float Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Memory 内存。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Memory 内存。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemory(Float Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 磁盘。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Disk 磁盘。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDisk() {
        return this.Disk;
    }

    /**
     * Set 磁盘。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Disk 磁盘。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisk(Long Disk) {
        this.Disk = Disk;
    }

    /**
     * Get 健康得分。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HealthScore 健康得分。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getHealthScore() {
        return this.HealthScore;
    }

    /**
     * Set 健康得分。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HealthScore 健康得分。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHealthScore(Float HealthScore) {
        this.HealthScore = HealthScore;
    }

    /**
     * Get 异常告警。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Warning 异常告警。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWarning() {
        return this.Warning;
    }

    /**
     * Set 异常告警。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Warning 异常告警。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWarning(Long Warning) {
        this.Warning = Warning;
    }

    /**
     * Get 所属项目。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Project 所属项目。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProject() {
        return this.Project;
    }

    /**
     * Set 所属项目。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Project 所属项目。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProject(String Project) {
        this.Project = Project;
    }

    /**
     * Get 所属标签。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceTags 所属标签。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set 所属标签。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceTags 所属标签。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceTags(Tag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get 创建时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedAt 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedAt 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 资源状态。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 资源状态。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 资源状态。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 资源状态。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 引擎名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineName 引擎名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngineName() {
        return this.EngineName;
    }

    /**
     * Set 引擎名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineName 引擎名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineName(String EngineName) {
        this.EngineName = EngineName;
    }

    /**
     * Get 引擎版本。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineVersion 引擎版本。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set 引擎版本。
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineVersion 引擎版本。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get 计费模式。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayMode 计费模式。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 计费模式。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayMode 计费模式。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 差异化扩展信息, json格式。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Extend 差异化扩展信息, json格式。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtend() {
        return this.Extend;
    }

    /**
     * Set 差异化扩展信息, json格式。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Extend 差异化扩展信息, json格式。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtend(String Extend) {
        this.Extend = Extend;
    }

    /**
     * Get 过期时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpiredAt 过期时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpiredAt() {
        return this.ExpiredAt;
    }

    /**
     * Set 过期时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpiredAt 过期时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpiredAt(String ExpiredAt) {
        this.ExpiredAt = ExpiredAt;
    }

    /**
     * Get 是否不过期(永久)。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsNoExpired 是否不过期(永久)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsNoExpired() {
        return this.IsNoExpired;
    }

    /**
     * Set 是否不过期(永久)。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsNoExpired 是否不过期(永久)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsNoExpired(Boolean IsNoExpired) {
        this.IsNoExpired = IsNoExpired;
    }

    /**
     * Get 外网地址。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WanAddress 外网地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWanAddress() {
        return this.WanAddress;
    }

    /**
     * Set 外网地址。
注意：此字段可能返回 null，表示取不到有效值。
     * @param WanAddress 外网地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWanAddress(String WanAddress) {
        this.WanAddress = WanAddress;
    }

    public InstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceInfo(InstanceInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.Networks != null) {
            this.Networks = new Network[source.Networks.length];
            for (int i = 0; i < source.Networks.length; i++) {
                this.Networks[i] = new Network(source.Networks[i]);
            }
        }
        if (source.ShardNum != null) {
            this.ShardNum = new Long(source.ShardNum);
        }
        if (source.ReplicaNum != null) {
            this.ReplicaNum = new Long(source.ReplicaNum);
        }
        if (source.Cpu != null) {
            this.Cpu = new Float(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Float(source.Memory);
        }
        if (source.Disk != null) {
            this.Disk = new Long(source.Disk);
        }
        if (source.HealthScore != null) {
            this.HealthScore = new Float(source.HealthScore);
        }
        if (source.Warning != null) {
            this.Warning = new Long(source.Warning);
        }
        if (source.Project != null) {
            this.Project = new String(source.Project);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new Tag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new Tag(source.ResourceTags[i]);
            }
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.EngineName != null) {
            this.EngineName = new String(source.EngineName);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new String(source.EngineVersion);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.Extend != null) {
            this.Extend = new String(source.Extend);
        }
        if (source.ExpiredAt != null) {
            this.ExpiredAt = new String(source.ExpiredAt);
        }
        if (source.IsNoExpired != null) {
            this.IsNoExpired = new Boolean(source.IsNoExpired);
        }
        if (source.WanAddress != null) {
            this.WanAddress = new String(source.WanAddress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamArrayObj(map, prefix + "Networks.", this.Networks);
        this.setParamSimple(map, prefix + "ShardNum", this.ShardNum);
        this.setParamSimple(map, prefix + "ReplicaNum", this.ReplicaNum);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Disk", this.Disk);
        this.setParamSimple(map, prefix + "HealthScore", this.HealthScore);
        this.setParamSimple(map, prefix + "Warning", this.Warning);
        this.setParamSimple(map, prefix + "Project", this.Project);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "EngineName", this.EngineName);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "Extend", this.Extend);
        this.setParamSimple(map, prefix + "ExpiredAt", this.ExpiredAt);
        this.setParamSimple(map, prefix + "IsNoExpired", this.IsNoExpired);
        this.setParamSimple(map, prefix + "WanAddress", this.WanAddress);

    }
}

