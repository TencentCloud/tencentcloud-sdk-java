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
package com.tencentcloudapi.vdb.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceInfo extends AbstractModel {

    /**
    * <p>实例ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例自定义名称。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>用户APPID。</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>地域。</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>可用区。</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>产品。</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * <p>网络信息。</p>
    */
    @SerializedName("Networks")
    @Expose
    private Network [] Networks;

    /**
    * <p>分片信息。</p>
    */
    @SerializedName("ShardNum")
    @Expose
    private Long ShardNum;

    /**
    * <p>副本数。</p>
    */
    @SerializedName("ReplicaNum")
    @Expose
    private Long ReplicaNum;

    /**
    * <p>CPU.</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Float Cpu;

    /**
    * <p>内存。</p>
    */
    @SerializedName("Memory")
    @Expose
    private Float Memory;

    /**
    * <p>磁盘。</p>
    */
    @SerializedName("Disk")
    @Expose
    private Long Disk;

    /**
    * <p>健康得分。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HealthScore")
    @Expose
    private Float HealthScore;

    /**
    * <p>异常告警。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Warning")
    @Expose
    private Long Warning;

    /**
    * <p>所属项目。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Project")
    @Expose
    private String Project;

    /**
    * <p>所属标签。</p>
    */
    @SerializedName("ResourceTags")
    @Expose
    private Tag [] ResourceTags;

    /**
    * <p>创建时间。</p>
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * <p>资源状态。</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>引擎名称。</p>
    */
    @SerializedName("EngineName")
    @Expose
    private String EngineName;

    /**
    * <p>引擎版本。</p>
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * <p>api版本</p>
    */
    @SerializedName("ApiVersion")
    @Expose
    private String ApiVersion;

    /**
    * <p>计费模式。</p>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>差异化扩展信息, json格式。</p>
    */
    @SerializedName("Extend")
    @Expose
    private String Extend;

    /**
    * <p>过期时间。</p>
    */
    @SerializedName("ExpiredAt")
    @Expose
    private String ExpiredAt;

    /**
    * <p>是否不过期(永久)。</p>
    */
    @SerializedName("IsNoExpired")
    @Expose
    private Boolean IsNoExpired;

    /**
    * <p>产品版本，0-标准版，1-容量增强版</p>
    */
    @SerializedName("ProductType")
    @Expose
    private Long ProductType;

    /**
    * <p>实例类型</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>节点类型</p>
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * <p>外网地址。</p>
    */
    @SerializedName("WanAddress")
    @Expose
    private String WanAddress;

    /**
    * <p>隔离时间</p>
    */
    @SerializedName("IsolateAt")
    @Expose
    private String IsolateAt;

    /**
    * <p>是否自动续费。0: 不自动续费(可以支持特权不停服)；1:自动续费；2:到期不续费.</p>
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * <p>任务状态：0-无任务；1-待执行任务；2-密钥更新中；3-网络变更中；4-参数变更中；5-embedding变更中；6-ai套件变更中；7-滚动升级中；8-纵向扩容中；9-纵向缩容中；10-横向扩容中；11-横向缩容中</p>
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long TaskStatus;

    /**
    * <p>绑定的安全组id</p>
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * <p>可升级版本号</p>
    */
    @SerializedName("UpgradeVersion")
    @Expose
    private String UpgradeVersion;

    /**
    * <p>是否为内部实例</p>
    */
    @SerializedName("IsInternal")
    @Expose
    private Boolean IsInternal;

    /**
     * Get <p>实例ID。</p> 
     * @return InstanceId <p>实例ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID。</p>
     * @param InstanceId <p>实例ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例自定义名称。</p> 
     * @return Name <p>实例自定义名称。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>实例自定义名称。</p>
     * @param Name <p>实例自定义名称。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>用户APPID。</p> 
     * @return AppId <p>用户APPID。</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>用户APPID。</p>
     * @param AppId <p>用户APPID。</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>地域。</p> 
     * @return Region <p>地域。</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域。</p>
     * @param Region <p>地域。</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>可用区。</p> 
     * @return Zone <p>可用区。</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区。</p>
     * @param Zone <p>可用区。</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>产品。</p> 
     * @return Product <p>产品。</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>产品。</p>
     * @param Product <p>产品。</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get <p>网络信息。</p> 
     * @return Networks <p>网络信息。</p>
     */
    public Network [] getNetworks() {
        return this.Networks;
    }

    /**
     * Set <p>网络信息。</p>
     * @param Networks <p>网络信息。</p>
     */
    public void setNetworks(Network [] Networks) {
        this.Networks = Networks;
    }

    /**
     * Get <p>分片信息。</p> 
     * @return ShardNum <p>分片信息。</p>
     */
    public Long getShardNum() {
        return this.ShardNum;
    }

    /**
     * Set <p>分片信息。</p>
     * @param ShardNum <p>分片信息。</p>
     */
    public void setShardNum(Long ShardNum) {
        this.ShardNum = ShardNum;
    }

    /**
     * Get <p>副本数。</p> 
     * @return ReplicaNum <p>副本数。</p>
     */
    public Long getReplicaNum() {
        return this.ReplicaNum;
    }

    /**
     * Set <p>副本数。</p>
     * @param ReplicaNum <p>副本数。</p>
     */
    public void setReplicaNum(Long ReplicaNum) {
        this.ReplicaNum = ReplicaNum;
    }

    /**
     * Get <p>CPU.</p> 
     * @return Cpu <p>CPU.</p>
     */
    public Float getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>CPU.</p>
     * @param Cpu <p>CPU.</p>
     */
    public void setCpu(Float Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>内存。</p> 
     * @return Memory <p>内存。</p>
     */
    public Float getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>内存。</p>
     * @param Memory <p>内存。</p>
     */
    public void setMemory(Float Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>磁盘。</p> 
     * @return Disk <p>磁盘。</p>
     */
    public Long getDisk() {
        return this.Disk;
    }

    /**
     * Set <p>磁盘。</p>
     * @param Disk <p>磁盘。</p>
     */
    public void setDisk(Long Disk) {
        this.Disk = Disk;
    }

    /**
     * Get <p>健康得分。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HealthScore <p>健康得分。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public Float getHealthScore() {
        return this.HealthScore;
    }

    /**
     * Set <p>健康得分。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HealthScore <p>健康得分。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setHealthScore(Float HealthScore) {
        this.HealthScore = HealthScore;
    }

    /**
     * Get <p>异常告警。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Warning <p>异常告警。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public Long getWarning() {
        return this.Warning;
    }

    /**
     * Set <p>异常告警。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Warning <p>异常告警。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setWarning(Long Warning) {
        this.Warning = Warning;
    }

    /**
     * Get <p>所属项目。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Project <p>所属项目。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String getProject() {
        return this.Project;
    }

    /**
     * Set <p>所属项目。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Project <p>所属项目。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setProject(String Project) {
        this.Project = Project;
    }

    /**
     * Get <p>所属标签。</p> 
     * @return ResourceTags <p>所属标签。</p>
     */
    public Tag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set <p>所属标签。</p>
     * @param ResourceTags <p>所属标签。</p>
     */
    public void setResourceTags(Tag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get <p>创建时间。</p> 
     * @return CreatedAt <p>创建时间。</p>
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set <p>创建时间。</p>
     * @param CreatedAt <p>创建时间。</p>
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get <p>资源状态。</p> 
     * @return Status <p>资源状态。</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>资源状态。</p>
     * @param Status <p>资源状态。</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>引擎名称。</p> 
     * @return EngineName <p>引擎名称。</p>
     */
    public String getEngineName() {
        return this.EngineName;
    }

    /**
     * Set <p>引擎名称。</p>
     * @param EngineName <p>引擎名称。</p>
     */
    public void setEngineName(String EngineName) {
        this.EngineName = EngineName;
    }

    /**
     * Get <p>引擎版本。</p> 
     * @return EngineVersion <p>引擎版本。</p>
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set <p>引擎版本。</p>
     * @param EngineVersion <p>引擎版本。</p>
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get <p>api版本</p> 
     * @return ApiVersion <p>api版本</p>
     */
    public String getApiVersion() {
        return this.ApiVersion;
    }

    /**
     * Set <p>api版本</p>
     * @param ApiVersion <p>api版本</p>
     */
    public void setApiVersion(String ApiVersion) {
        this.ApiVersion = ApiVersion;
    }

    /**
     * Get <p>计费模式。</p> 
     * @return PayMode <p>计费模式。</p>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>计费模式。</p>
     * @param PayMode <p>计费模式。</p>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>差异化扩展信息, json格式。</p> 
     * @return Extend <p>差异化扩展信息, json格式。</p>
     */
    public String getExtend() {
        return this.Extend;
    }

    /**
     * Set <p>差异化扩展信息, json格式。</p>
     * @param Extend <p>差异化扩展信息, json格式。</p>
     */
    public void setExtend(String Extend) {
        this.Extend = Extend;
    }

    /**
     * Get <p>过期时间。</p> 
     * @return ExpiredAt <p>过期时间。</p>
     */
    public String getExpiredAt() {
        return this.ExpiredAt;
    }

    /**
     * Set <p>过期时间。</p>
     * @param ExpiredAt <p>过期时间。</p>
     */
    public void setExpiredAt(String ExpiredAt) {
        this.ExpiredAt = ExpiredAt;
    }

    /**
     * Get <p>是否不过期(永久)。</p> 
     * @return IsNoExpired <p>是否不过期(永久)。</p>
     */
    public Boolean getIsNoExpired() {
        return this.IsNoExpired;
    }

    /**
     * Set <p>是否不过期(永久)。</p>
     * @param IsNoExpired <p>是否不过期(永久)。</p>
     */
    public void setIsNoExpired(Boolean IsNoExpired) {
        this.IsNoExpired = IsNoExpired;
    }

    /**
     * Get <p>产品版本，0-标准版，1-容量增强版</p> 
     * @return ProductType <p>产品版本，0-标准版，1-容量增强版</p>
     */
    public Long getProductType() {
        return this.ProductType;
    }

    /**
     * Set <p>产品版本，0-标准版，1-容量增强版</p>
     * @param ProductType <p>产品版本，0-标准版，1-容量增强版</p>
     */
    public void setProductType(Long ProductType) {
        this.ProductType = ProductType;
    }

    /**
     * Get <p>实例类型</p> 
     * @return InstanceType <p>实例类型</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>实例类型</p>
     * @param InstanceType <p>实例类型</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>节点类型</p> 
     * @return NodeType <p>节点类型</p>
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set <p>节点类型</p>
     * @param NodeType <p>节点类型</p>
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get <p>外网地址。</p> 
     * @return WanAddress <p>外网地址。</p>
     */
    public String getWanAddress() {
        return this.WanAddress;
    }

    /**
     * Set <p>外网地址。</p>
     * @param WanAddress <p>外网地址。</p>
     */
    public void setWanAddress(String WanAddress) {
        this.WanAddress = WanAddress;
    }

    /**
     * Get <p>隔离时间</p> 
     * @return IsolateAt <p>隔离时间</p>
     */
    public String getIsolateAt() {
        return this.IsolateAt;
    }

    /**
     * Set <p>隔离时间</p>
     * @param IsolateAt <p>隔离时间</p>
     */
    public void setIsolateAt(String IsolateAt) {
        this.IsolateAt = IsolateAt;
    }

    /**
     * Get <p>是否自动续费。0: 不自动续费(可以支持特权不停服)；1:自动续费；2:到期不续费.</p> 
     * @return AutoRenew <p>是否自动续费。0: 不自动续费(可以支持特权不停服)；1:自动续费；2:到期不续费.</p>
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set <p>是否自动续费。0: 不自动续费(可以支持特权不停服)；1:自动续费；2:到期不续费.</p>
     * @param AutoRenew <p>是否自动续费。0: 不自动续费(可以支持特权不停服)；1:自动续费；2:到期不续费.</p>
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get <p>任务状态：0-无任务；1-待执行任务；2-密钥更新中；3-网络变更中；4-参数变更中；5-embedding变更中；6-ai套件变更中；7-滚动升级中；8-纵向扩容中；9-纵向缩容中；10-横向扩容中；11-横向缩容中</p> 
     * @return TaskStatus <p>任务状态：0-无任务；1-待执行任务；2-密钥更新中；3-网络变更中；4-参数变更中；5-embedding变更中；6-ai套件变更中；7-滚动升级中；8-纵向扩容中；9-纵向缩容中；10-横向扩容中；11-横向缩容中</p>
     */
    public Long getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set <p>任务状态：0-无任务；1-待执行任务；2-密钥更新中；3-网络变更中；4-参数变更中；5-embedding变更中；6-ai套件变更中；7-滚动升级中；8-纵向扩容中；9-纵向缩容中；10-横向扩容中；11-横向缩容中</p>
     * @param TaskStatus <p>任务状态：0-无任务；1-待执行任务；2-密钥更新中；3-网络变更中；4-参数变更中；5-embedding变更中；6-ai套件变更中；7-滚动升级中；8-纵向扩容中；9-纵向缩容中；10-横向扩容中；11-横向缩容中</p>
     */
    public void setTaskStatus(Long TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get <p>绑定的安全组id</p> 
     * @return SecurityGroupIds <p>绑定的安全组id</p>
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set <p>绑定的安全组id</p>
     * @param SecurityGroupIds <p>绑定的安全组id</p>
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get <p>可升级版本号</p> 
     * @return UpgradeVersion <p>可升级版本号</p>
     */
    public String getUpgradeVersion() {
        return this.UpgradeVersion;
    }

    /**
     * Set <p>可升级版本号</p>
     * @param UpgradeVersion <p>可升级版本号</p>
     */
    public void setUpgradeVersion(String UpgradeVersion) {
        this.UpgradeVersion = UpgradeVersion;
    }

    /**
     * Get <p>是否为内部实例</p> 
     * @return IsInternal <p>是否为内部实例</p>
     */
    public Boolean getIsInternal() {
        return this.IsInternal;
    }

    /**
     * Set <p>是否为内部实例</p>
     * @param IsInternal <p>是否为内部实例</p>
     */
    public void setIsInternal(Boolean IsInternal) {
        this.IsInternal = IsInternal;
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
        if (source.ApiVersion != null) {
            this.ApiVersion = new String(source.ApiVersion);
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
        if (source.ProductType != null) {
            this.ProductType = new Long(source.ProductType);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.WanAddress != null) {
            this.WanAddress = new String(source.WanAddress);
        }
        if (source.IsolateAt != null) {
            this.IsolateAt = new String(source.IsolateAt);
        }
        if (source.AutoRenew != null) {
            this.AutoRenew = new Long(source.AutoRenew);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new Long(source.TaskStatus);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.UpgradeVersion != null) {
            this.UpgradeVersion = new String(source.UpgradeVersion);
        }
        if (source.IsInternal != null) {
            this.IsInternal = new Boolean(source.IsInternal);
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
        this.setParamSimple(map, prefix + "ApiVersion", this.ApiVersion);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "Extend", this.Extend);
        this.setParamSimple(map, prefix + "ExpiredAt", this.ExpiredAt);
        this.setParamSimple(map, prefix + "IsNoExpired", this.IsNoExpired);
        this.setParamSimple(map, prefix + "ProductType", this.ProductType);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "WanAddress", this.WanAddress);
        this.setParamSimple(map, prefix + "IsolateAt", this.IsolateAt);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "UpgradeVersion", this.UpgradeVersion);
        this.setParamSimple(map, prefix + "IsInternal", this.IsInternal);

    }
}

