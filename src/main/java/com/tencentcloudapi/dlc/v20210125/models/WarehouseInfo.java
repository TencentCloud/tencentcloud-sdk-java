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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WarehouseInfo extends AbstractModel {

    /**
    * <p>仓库 id（格式 "dlc-wh-xxxxxxxx"）.</p>
    */
    @SerializedName("WarehouseId")
    @Expose
    private String WarehouseId;

    /**
    * <p>仓库名称，租户内唯一。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>创建者子账号 UIN。</p>
    */
    @SerializedName("CreatorSubUin")
    @Expose
    private String CreatorSubUin;

    /**
    * <p>仓库描述信息。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>fermion 合并后的单一状态。取值：STARTING / RUNNING / STOPPING / STOPPED / UPDATING / UNAVAILABLE / DESTROYING（销毁中，只读：不接受任何生命周期操作）。</p>
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * <p>资源池编码.</p>
    */
    @SerializedName("PartitionCode")
    @Expose
    private String PartitionCode;

    /**
    * <p>资源池展示名（解析不到时为空）.</p>
    */
    @SerializedName("PartitionName")
    @Expose
    private String PartitionName;

    /**
    * <p>资源组/队列名。</p>
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * <p>创建时间（毫秒时间戳）。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>最后更新时间（毫秒时间戳）。</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * <p>活跃集群数（describe 与 list 均返回）。集群明细等完整快照仅 DescribeWarehouseDetail 的 Observability 返回。</p>
    */
    @SerializedName("ActiveClusters")
    @Expose
    private Long ActiveClusters;

    /**
    * <p>最小集群数（即最小实例数下限；describe 与 list 均返回）.</p>
    */
    @SerializedName("MinClusters")
    @Expose
    private Long MinClusters;

    /**
    * <p>最大集群数（即最大实例数上限；describe 与 list 均返回）.</p>
    */
    @SerializedName("MaxClusters")
    @Expose
    private Long MaxClusters;

    /**
    * <p>运行时/镜像.</p>
    */
    @SerializedName("RuntimeCode")
    @Expose
    private String RuntimeCode;

    /**
    * <p>运行时展示名（如 Spark 3.5.5），与 RuntimeCode 配套；解析不到时为空.</p>
    */
    @SerializedName("RuntimeName")
    @Expose
    private String RuntimeName;

    /**
    * <p>Catalog 版本码.</p>
    */
    @SerializedName("SysCatalogVersion")
    @Expose
    private String SysCatalogVersion;

    /**
    * <p>环境变量.</p>
    */
    @SerializedName("EnvVars")
    @Expose
    private KVPair [] EnvVars;

    /**
    * <p>静态运行参数（RuntimeConf）：spark.* KV 的 JSON 字符串（如 "{\"spark.sql.shuffle.partitions\":\"400\"}"），spark-submit 时生效。</p>
    */
    @SerializedName("RuntimeConf")
    @Expose
    private String RuntimeConf;

    /**
    * <p>动态参数（DynamicProperties）：spark.* KV 的 JSON 字符串，运行期生效（会话级，openSession 弱注入，即改即生效）。</p>
    */
    @SerializedName("DynamicProperties")
    @Expose
    private String DynamicProperties;

    /**
     * Get <p>仓库 id（格式 "dlc-wh-xxxxxxxx"）.</p> 
     * @return WarehouseId <p>仓库 id（格式 "dlc-wh-xxxxxxxx"）.</p>
     */
    public String getWarehouseId() {
        return this.WarehouseId;
    }

    /**
     * Set <p>仓库 id（格式 "dlc-wh-xxxxxxxx"）.</p>
     * @param WarehouseId <p>仓库 id（格式 "dlc-wh-xxxxxxxx"）.</p>
     */
    public void setWarehouseId(String WarehouseId) {
        this.WarehouseId = WarehouseId;
    }

    /**
     * Get <p>仓库名称，租户内唯一。</p> 
     * @return Name <p>仓库名称，租户内唯一。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>仓库名称，租户内唯一。</p>
     * @param Name <p>仓库名称，租户内唯一。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>创建者子账号 UIN。</p> 
     * @return CreatorSubUin <p>创建者子账号 UIN。</p>
     */
    public String getCreatorSubUin() {
        return this.CreatorSubUin;
    }

    /**
     * Set <p>创建者子账号 UIN。</p>
     * @param CreatorSubUin <p>创建者子账号 UIN。</p>
     */
    public void setCreatorSubUin(String CreatorSubUin) {
        this.CreatorSubUin = CreatorSubUin;
    }

    /**
     * Get <p>仓库描述信息。</p> 
     * @return Description <p>仓库描述信息。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>仓库描述信息。</p>
     * @param Description <p>仓库描述信息。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>fermion 合并后的单一状态。取值：STARTING / RUNNING / STOPPING / STOPPED / UPDATING / UNAVAILABLE / DESTROYING（销毁中，只读：不接受任何生命周期操作）。</p> 
     * @return State <p>fermion 合并后的单一状态。取值：STARTING / RUNNING / STOPPING / STOPPED / UPDATING / UNAVAILABLE / DESTROYING（销毁中，只读：不接受任何生命周期操作）。</p>
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set <p>fermion 合并后的单一状态。取值：STARTING / RUNNING / STOPPING / STOPPED / UPDATING / UNAVAILABLE / DESTROYING（销毁中，只读：不接受任何生命周期操作）。</p>
     * @param State <p>fermion 合并后的单一状态。取值：STARTING / RUNNING / STOPPING / STOPPED / UPDATING / UNAVAILABLE / DESTROYING（销毁中，只读：不接受任何生命周期操作）。</p>
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get <p>资源池编码.</p> 
     * @return PartitionCode <p>资源池编码.</p>
     */
    public String getPartitionCode() {
        return this.PartitionCode;
    }

    /**
     * Set <p>资源池编码.</p>
     * @param PartitionCode <p>资源池编码.</p>
     */
    public void setPartitionCode(String PartitionCode) {
        this.PartitionCode = PartitionCode;
    }

    /**
     * Get <p>资源池展示名（解析不到时为空）.</p> 
     * @return PartitionName <p>资源池展示名（解析不到时为空）.</p>
     */
    public String getPartitionName() {
        return this.PartitionName;
    }

    /**
     * Set <p>资源池展示名（解析不到时为空）.</p>
     * @param PartitionName <p>资源池展示名（解析不到时为空）.</p>
     */
    public void setPartitionName(String PartitionName) {
        this.PartitionName = PartitionName;
    }

    /**
     * Get <p>资源组/队列名。</p> 
     * @return QueueName <p>资源组/队列名。</p>
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set <p>资源组/队列名。</p>
     * @param QueueName <p>资源组/队列名。</p>
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get <p>创建时间（毫秒时间戳）。</p> 
     * @return CreateTime <p>创建时间（毫秒时间戳）。</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间（毫秒时间戳）。</p>
     * @param CreateTime <p>创建时间（毫秒时间戳）。</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>最后更新时间（毫秒时间戳）。</p> 
     * @return UpdateTime <p>最后更新时间（毫秒时间戳）。</p>
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>最后更新时间（毫秒时间戳）。</p>
     * @param UpdateTime <p>最后更新时间（毫秒时间戳）。</p>
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>活跃集群数（describe 与 list 均返回）。集群明细等完整快照仅 DescribeWarehouseDetail 的 Observability 返回。</p> 
     * @return ActiveClusters <p>活跃集群数（describe 与 list 均返回）。集群明细等完整快照仅 DescribeWarehouseDetail 的 Observability 返回。</p>
     */
    public Long getActiveClusters() {
        return this.ActiveClusters;
    }

    /**
     * Set <p>活跃集群数（describe 与 list 均返回）。集群明细等完整快照仅 DescribeWarehouseDetail 的 Observability 返回。</p>
     * @param ActiveClusters <p>活跃集群数（describe 与 list 均返回）。集群明细等完整快照仅 DescribeWarehouseDetail 的 Observability 返回。</p>
     */
    public void setActiveClusters(Long ActiveClusters) {
        this.ActiveClusters = ActiveClusters;
    }

    /**
     * Get <p>最小集群数（即最小实例数下限；describe 与 list 均返回）.</p> 
     * @return MinClusters <p>最小集群数（即最小实例数下限；describe 与 list 均返回）.</p>
     */
    public Long getMinClusters() {
        return this.MinClusters;
    }

    /**
     * Set <p>最小集群数（即最小实例数下限；describe 与 list 均返回）.</p>
     * @param MinClusters <p>最小集群数（即最小实例数下限；describe 与 list 均返回）.</p>
     */
    public void setMinClusters(Long MinClusters) {
        this.MinClusters = MinClusters;
    }

    /**
     * Get <p>最大集群数（即最大实例数上限；describe 与 list 均返回）.</p> 
     * @return MaxClusters <p>最大集群数（即最大实例数上限；describe 与 list 均返回）.</p>
     */
    public Long getMaxClusters() {
        return this.MaxClusters;
    }

    /**
     * Set <p>最大集群数（即最大实例数上限；describe 与 list 均返回）.</p>
     * @param MaxClusters <p>最大集群数（即最大实例数上限；describe 与 list 均返回）.</p>
     */
    public void setMaxClusters(Long MaxClusters) {
        this.MaxClusters = MaxClusters;
    }

    /**
     * Get <p>运行时/镜像.</p> 
     * @return RuntimeCode <p>运行时/镜像.</p>
     */
    public String getRuntimeCode() {
        return this.RuntimeCode;
    }

    /**
     * Set <p>运行时/镜像.</p>
     * @param RuntimeCode <p>运行时/镜像.</p>
     */
    public void setRuntimeCode(String RuntimeCode) {
        this.RuntimeCode = RuntimeCode;
    }

    /**
     * Get <p>运行时展示名（如 Spark 3.5.5），与 RuntimeCode 配套；解析不到时为空.</p> 
     * @return RuntimeName <p>运行时展示名（如 Spark 3.5.5），与 RuntimeCode 配套；解析不到时为空.</p>
     */
    public String getRuntimeName() {
        return this.RuntimeName;
    }

    /**
     * Set <p>运行时展示名（如 Spark 3.5.5），与 RuntimeCode 配套；解析不到时为空.</p>
     * @param RuntimeName <p>运行时展示名（如 Spark 3.5.5），与 RuntimeCode 配套；解析不到时为空.</p>
     */
    public void setRuntimeName(String RuntimeName) {
        this.RuntimeName = RuntimeName;
    }

    /**
     * Get <p>Catalog 版本码.</p> 
     * @return SysCatalogVersion <p>Catalog 版本码.</p>
     */
    public String getSysCatalogVersion() {
        return this.SysCatalogVersion;
    }

    /**
     * Set <p>Catalog 版本码.</p>
     * @param SysCatalogVersion <p>Catalog 版本码.</p>
     */
    public void setSysCatalogVersion(String SysCatalogVersion) {
        this.SysCatalogVersion = SysCatalogVersion;
    }

    /**
     * Get <p>环境变量.</p> 
     * @return EnvVars <p>环境变量.</p>
     */
    public KVPair [] getEnvVars() {
        return this.EnvVars;
    }

    /**
     * Set <p>环境变量.</p>
     * @param EnvVars <p>环境变量.</p>
     */
    public void setEnvVars(KVPair [] EnvVars) {
        this.EnvVars = EnvVars;
    }

    /**
     * Get <p>静态运行参数（RuntimeConf）：spark.* KV 的 JSON 字符串（如 "{\"spark.sql.shuffle.partitions\":\"400\"}"），spark-submit 时生效。</p> 
     * @return RuntimeConf <p>静态运行参数（RuntimeConf）：spark.* KV 的 JSON 字符串（如 "{\"spark.sql.shuffle.partitions\":\"400\"}"），spark-submit 时生效。</p>
     */
    public String getRuntimeConf() {
        return this.RuntimeConf;
    }

    /**
     * Set <p>静态运行参数（RuntimeConf）：spark.* KV 的 JSON 字符串（如 "{\"spark.sql.shuffle.partitions\":\"400\"}"），spark-submit 时生效。</p>
     * @param RuntimeConf <p>静态运行参数（RuntimeConf）：spark.* KV 的 JSON 字符串（如 "{\"spark.sql.shuffle.partitions\":\"400\"}"），spark-submit 时生效。</p>
     */
    public void setRuntimeConf(String RuntimeConf) {
        this.RuntimeConf = RuntimeConf;
    }

    /**
     * Get <p>动态参数（DynamicProperties）：spark.* KV 的 JSON 字符串，运行期生效（会话级，openSession 弱注入，即改即生效）。</p> 
     * @return DynamicProperties <p>动态参数（DynamicProperties）：spark.* KV 的 JSON 字符串，运行期生效（会话级，openSession 弱注入，即改即生效）。</p>
     */
    public String getDynamicProperties() {
        return this.DynamicProperties;
    }

    /**
     * Set <p>动态参数（DynamicProperties）：spark.* KV 的 JSON 字符串，运行期生效（会话级，openSession 弱注入，即改即生效）。</p>
     * @param DynamicProperties <p>动态参数（DynamicProperties）：spark.* KV 的 JSON 字符串，运行期生效（会话级，openSession 弱注入，即改即生效）。</p>
     */
    public void setDynamicProperties(String DynamicProperties) {
        this.DynamicProperties = DynamicProperties;
    }

    public WarehouseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WarehouseInfo(WarehouseInfo source) {
        if (source.WarehouseId != null) {
            this.WarehouseId = new String(source.WarehouseId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CreatorSubUin != null) {
            this.CreatorSubUin = new String(source.CreatorSubUin);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.PartitionCode != null) {
            this.PartitionCode = new String(source.PartitionCode);
        }
        if (source.PartitionName != null) {
            this.PartitionName = new String(source.PartitionName);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.ActiveClusters != null) {
            this.ActiveClusters = new Long(source.ActiveClusters);
        }
        if (source.MinClusters != null) {
            this.MinClusters = new Long(source.MinClusters);
        }
        if (source.MaxClusters != null) {
            this.MaxClusters = new Long(source.MaxClusters);
        }
        if (source.RuntimeCode != null) {
            this.RuntimeCode = new String(source.RuntimeCode);
        }
        if (source.RuntimeName != null) {
            this.RuntimeName = new String(source.RuntimeName);
        }
        if (source.SysCatalogVersion != null) {
            this.SysCatalogVersion = new String(source.SysCatalogVersion);
        }
        if (source.EnvVars != null) {
            this.EnvVars = new KVPair[source.EnvVars.length];
            for (int i = 0; i < source.EnvVars.length; i++) {
                this.EnvVars[i] = new KVPair(source.EnvVars[i]);
            }
        }
        if (source.RuntimeConf != null) {
            this.RuntimeConf = new String(source.RuntimeConf);
        }
        if (source.DynamicProperties != null) {
            this.DynamicProperties = new String(source.DynamicProperties);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WarehouseId", this.WarehouseId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CreatorSubUin", this.CreatorSubUin);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "PartitionCode", this.PartitionCode);
        this.setParamSimple(map, prefix + "PartitionName", this.PartitionName);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ActiveClusters", this.ActiveClusters);
        this.setParamSimple(map, prefix + "MinClusters", this.MinClusters);
        this.setParamSimple(map, prefix + "MaxClusters", this.MaxClusters);
        this.setParamSimple(map, prefix + "RuntimeCode", this.RuntimeCode);
        this.setParamSimple(map, prefix + "RuntimeName", this.RuntimeName);
        this.setParamSimple(map, prefix + "SysCatalogVersion", this.SysCatalogVersion);
        this.setParamArrayObj(map, prefix + "EnvVars.", this.EnvVars);
        this.setParamSimple(map, prefix + "RuntimeConf", this.RuntimeConf);
        this.setParamSimple(map, prefix + "DynamicProperties", this.DynamicProperties);

    }
}

