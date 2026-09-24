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

public class ModifyJobDefinitionRequest extends AbstractModel {

    /**
    * <p>作业定义 ID。必填。</p>
    */
    @SerializedName("JobDefinitionId")
    @Expose
    private String JobDefinitionId;

    /**
    * <p>作业定义名称。创建后不可修改：仅接受与当前名称相同的值（回显），传不同值报错；不传表示不修改。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>修改后的作业定义描述。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>引擎大类（当前仅支持 SPARK）。</p>
    */
    @SerializedName("MajorType")
    @Expose
    private String MajorType;

    /**
    * <p>作业子类型，SPARK_SQL / SPARK_BATCH / SPARK_STREAM；非必填。</p>
    */
    @SerializedName("MinorType")
    @Expose
    private String MinorType;

    /**
    * <p>流作业 checkpoint 路径（如 cosn://bucket/path/checkpoint），非必填，传了即覆盖。SPARK_STREAM 定义必须非空；变更等于重置消费进度。</p>
    */
    @SerializedName("CheckpointLocation")
    @Expose
    private String CheckpointLocation;

    /**
    * <p>资源分区代码，仅目标 RunMode=JOB 可传（QueueName 非空时必填）；目标 RunMode=WAREHOUSE 时禁止传。</p>
    */
    @SerializedName("PartitionCode")
    @Expose
    private String PartitionCode;

    /**
    * <p>队列名称，仅目标 RunMode=JOB 可传且须与 PartitionCode 成对；目标 RunMode=WAREHOUSE 时禁止传。</p>
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * <p>运行时/镜像编码，可选（null=沿用当前值）。仅对 JOB 模式定义生效；目标 RunMode=WAREHOUSE 时禁止传。</p>
    */
    @SerializedName("RuntimeCode")
    @Expose
    private String RuntimeCode;

    /**
    * <p>内置 Catalog 版本码（取值为 DescribeSysCatalogList 返回的目录子类型），可选（null=沿用当前值）。</p>
    */
    @SerializedName("SysCatalogVersion")
    @Expose
    private String SysCatalogVersion;

    /**
    * <p>自定义 Spark conf（JSON 字符串，亦接受多行 key=value 文本，归一化为 JSON 存储、出参恒为 JSON），非必填，传了即整串覆盖。</p>
    */
    @SerializedName("CustomProperties")
    @Expose
    private String CustomProperties;

    /**
    * <p>环境变量（KEY=VALUE）列表，非必填，传了即整体覆盖。仅对 JOB 模式定义生效；目标 RunMode=WAREHOUSE 时禁止传。</p>
    */
    @SerializedName("EnvVars")
    @Expose
    private KVPair [] EnvVars;

    /**
    * <p>目标运行模式：WAREHOUSE / JOB；未传=保持不变。切换模式时两种模式的参数集严格隔离（切换 WAREHOUSE 须提供 WarehouseId 且禁传 JOB 模式专属字段，反之亦然）。</p>
    */
    @SerializedName("RunMode")
    @Expose
    private String RunMode;

    /**
    * <p>计算仓库 ID。仅目标 RunMode=WAREHOUSE 时可传（必填）；未传 RunMode 或目标为 JOB 时禁止传。</p>
    */
    @SerializedName("WarehouseId")
    @Expose
    private String WarehouseId;

    /**
     * Get <p>作业定义 ID。必填。</p> 
     * @return JobDefinitionId <p>作业定义 ID。必填。</p>
     */
    public String getJobDefinitionId() {
        return this.JobDefinitionId;
    }

    /**
     * Set <p>作业定义 ID。必填。</p>
     * @param JobDefinitionId <p>作业定义 ID。必填。</p>
     */
    public void setJobDefinitionId(String JobDefinitionId) {
        this.JobDefinitionId = JobDefinitionId;
    }

    /**
     * Get <p>作业定义名称。创建后不可修改：仅接受与当前名称相同的值（回显），传不同值报错；不传表示不修改。</p> 
     * @return Name <p>作业定义名称。创建后不可修改：仅接受与当前名称相同的值（回显），传不同值报错；不传表示不修改。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>作业定义名称。创建后不可修改：仅接受与当前名称相同的值（回显），传不同值报错；不传表示不修改。</p>
     * @param Name <p>作业定义名称。创建后不可修改：仅接受与当前名称相同的值（回显），传不同值报错；不传表示不修改。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>修改后的作业定义描述。</p> 
     * @return Description <p>修改后的作业定义描述。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>修改后的作业定义描述。</p>
     * @param Description <p>修改后的作业定义描述。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>引擎大类（当前仅支持 SPARK）。</p> 
     * @return MajorType <p>引擎大类（当前仅支持 SPARK）。</p>
     */
    public String getMajorType() {
        return this.MajorType;
    }

    /**
     * Set <p>引擎大类（当前仅支持 SPARK）。</p>
     * @param MajorType <p>引擎大类（当前仅支持 SPARK）。</p>
     */
    public void setMajorType(String MajorType) {
        this.MajorType = MajorType;
    }

    /**
     * Get <p>作业子类型，SPARK_SQL / SPARK_BATCH / SPARK_STREAM；非必填。</p> 
     * @return MinorType <p>作业子类型，SPARK_SQL / SPARK_BATCH / SPARK_STREAM；非必填。</p>
     */
    public String getMinorType() {
        return this.MinorType;
    }

    /**
     * Set <p>作业子类型，SPARK_SQL / SPARK_BATCH / SPARK_STREAM；非必填。</p>
     * @param MinorType <p>作业子类型，SPARK_SQL / SPARK_BATCH / SPARK_STREAM；非必填。</p>
     */
    public void setMinorType(String MinorType) {
        this.MinorType = MinorType;
    }

    /**
     * Get <p>流作业 checkpoint 路径（如 cosn://bucket/path/checkpoint），非必填，传了即覆盖。SPARK_STREAM 定义必须非空；变更等于重置消费进度。</p> 
     * @return CheckpointLocation <p>流作业 checkpoint 路径（如 cosn://bucket/path/checkpoint），非必填，传了即覆盖。SPARK_STREAM 定义必须非空；变更等于重置消费进度。</p>
     */
    public String getCheckpointLocation() {
        return this.CheckpointLocation;
    }

    /**
     * Set <p>流作业 checkpoint 路径（如 cosn://bucket/path/checkpoint），非必填，传了即覆盖。SPARK_STREAM 定义必须非空；变更等于重置消费进度。</p>
     * @param CheckpointLocation <p>流作业 checkpoint 路径（如 cosn://bucket/path/checkpoint），非必填，传了即覆盖。SPARK_STREAM 定义必须非空；变更等于重置消费进度。</p>
     */
    public void setCheckpointLocation(String CheckpointLocation) {
        this.CheckpointLocation = CheckpointLocation;
    }

    /**
     * Get <p>资源分区代码，仅目标 RunMode=JOB 可传（QueueName 非空时必填）；目标 RunMode=WAREHOUSE 时禁止传。</p> 
     * @return PartitionCode <p>资源分区代码，仅目标 RunMode=JOB 可传（QueueName 非空时必填）；目标 RunMode=WAREHOUSE 时禁止传。</p>
     */
    public String getPartitionCode() {
        return this.PartitionCode;
    }

    /**
     * Set <p>资源分区代码，仅目标 RunMode=JOB 可传（QueueName 非空时必填）；目标 RunMode=WAREHOUSE 时禁止传。</p>
     * @param PartitionCode <p>资源分区代码，仅目标 RunMode=JOB 可传（QueueName 非空时必填）；目标 RunMode=WAREHOUSE 时禁止传。</p>
     */
    public void setPartitionCode(String PartitionCode) {
        this.PartitionCode = PartitionCode;
    }

    /**
     * Get <p>队列名称，仅目标 RunMode=JOB 可传且须与 PartitionCode 成对；目标 RunMode=WAREHOUSE 时禁止传。</p> 
     * @return QueueName <p>队列名称，仅目标 RunMode=JOB 可传且须与 PartitionCode 成对；目标 RunMode=WAREHOUSE 时禁止传。</p>
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set <p>队列名称，仅目标 RunMode=JOB 可传且须与 PartitionCode 成对；目标 RunMode=WAREHOUSE 时禁止传。</p>
     * @param QueueName <p>队列名称，仅目标 RunMode=JOB 可传且须与 PartitionCode 成对；目标 RunMode=WAREHOUSE 时禁止传。</p>
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get <p>运行时/镜像编码，可选（null=沿用当前值）。仅对 JOB 模式定义生效；目标 RunMode=WAREHOUSE 时禁止传。</p> 
     * @return RuntimeCode <p>运行时/镜像编码，可选（null=沿用当前值）。仅对 JOB 模式定义生效；目标 RunMode=WAREHOUSE 时禁止传。</p>
     */
    public String getRuntimeCode() {
        return this.RuntimeCode;
    }

    /**
     * Set <p>运行时/镜像编码，可选（null=沿用当前值）。仅对 JOB 模式定义生效；目标 RunMode=WAREHOUSE 时禁止传。</p>
     * @param RuntimeCode <p>运行时/镜像编码，可选（null=沿用当前值）。仅对 JOB 模式定义生效；目标 RunMode=WAREHOUSE 时禁止传。</p>
     */
    public void setRuntimeCode(String RuntimeCode) {
        this.RuntimeCode = RuntimeCode;
    }

    /**
     * Get <p>内置 Catalog 版本码（取值为 DescribeSysCatalogList 返回的目录子类型），可选（null=沿用当前值）。</p> 
     * @return SysCatalogVersion <p>内置 Catalog 版本码（取值为 DescribeSysCatalogList 返回的目录子类型），可选（null=沿用当前值）。</p>
     */
    public String getSysCatalogVersion() {
        return this.SysCatalogVersion;
    }

    /**
     * Set <p>内置 Catalog 版本码（取值为 DescribeSysCatalogList 返回的目录子类型），可选（null=沿用当前值）。</p>
     * @param SysCatalogVersion <p>内置 Catalog 版本码（取值为 DescribeSysCatalogList 返回的目录子类型），可选（null=沿用当前值）。</p>
     */
    public void setSysCatalogVersion(String SysCatalogVersion) {
        this.SysCatalogVersion = SysCatalogVersion;
    }

    /**
     * Get <p>自定义 Spark conf（JSON 字符串，亦接受多行 key=value 文本，归一化为 JSON 存储、出参恒为 JSON），非必填，传了即整串覆盖。</p> 
     * @return CustomProperties <p>自定义 Spark conf（JSON 字符串，亦接受多行 key=value 文本，归一化为 JSON 存储、出参恒为 JSON），非必填，传了即整串覆盖。</p>
     */
    public String getCustomProperties() {
        return this.CustomProperties;
    }

    /**
     * Set <p>自定义 Spark conf（JSON 字符串，亦接受多行 key=value 文本，归一化为 JSON 存储、出参恒为 JSON），非必填，传了即整串覆盖。</p>
     * @param CustomProperties <p>自定义 Spark conf（JSON 字符串，亦接受多行 key=value 文本，归一化为 JSON 存储、出参恒为 JSON），非必填，传了即整串覆盖。</p>
     */
    public void setCustomProperties(String CustomProperties) {
        this.CustomProperties = CustomProperties;
    }

    /**
     * Get <p>环境变量（KEY=VALUE）列表，非必填，传了即整体覆盖。仅对 JOB 模式定义生效；目标 RunMode=WAREHOUSE 时禁止传。</p> 
     * @return EnvVars <p>环境变量（KEY=VALUE）列表，非必填，传了即整体覆盖。仅对 JOB 模式定义生效；目标 RunMode=WAREHOUSE 时禁止传。</p>
     */
    public KVPair [] getEnvVars() {
        return this.EnvVars;
    }

    /**
     * Set <p>环境变量（KEY=VALUE）列表，非必填，传了即整体覆盖。仅对 JOB 模式定义生效；目标 RunMode=WAREHOUSE 时禁止传。</p>
     * @param EnvVars <p>环境变量（KEY=VALUE）列表，非必填，传了即整体覆盖。仅对 JOB 模式定义生效；目标 RunMode=WAREHOUSE 时禁止传。</p>
     */
    public void setEnvVars(KVPair [] EnvVars) {
        this.EnvVars = EnvVars;
    }

    /**
     * Get <p>目标运行模式：WAREHOUSE / JOB；未传=保持不变。切换模式时两种模式的参数集严格隔离（切换 WAREHOUSE 须提供 WarehouseId 且禁传 JOB 模式专属字段，反之亦然）。</p> 
     * @return RunMode <p>目标运行模式：WAREHOUSE / JOB；未传=保持不变。切换模式时两种模式的参数集严格隔离（切换 WAREHOUSE 须提供 WarehouseId 且禁传 JOB 模式专属字段，反之亦然）。</p>
     */
    public String getRunMode() {
        return this.RunMode;
    }

    /**
     * Set <p>目标运行模式：WAREHOUSE / JOB；未传=保持不变。切换模式时两种模式的参数集严格隔离（切换 WAREHOUSE 须提供 WarehouseId 且禁传 JOB 模式专属字段，反之亦然）。</p>
     * @param RunMode <p>目标运行模式：WAREHOUSE / JOB；未传=保持不变。切换模式时两种模式的参数集严格隔离（切换 WAREHOUSE 须提供 WarehouseId 且禁传 JOB 模式专属字段，反之亦然）。</p>
     */
    public void setRunMode(String RunMode) {
        this.RunMode = RunMode;
    }

    /**
     * Get <p>计算仓库 ID。仅目标 RunMode=WAREHOUSE 时可传（必填）；未传 RunMode 或目标为 JOB 时禁止传。</p> 
     * @return WarehouseId <p>计算仓库 ID。仅目标 RunMode=WAREHOUSE 时可传（必填）；未传 RunMode 或目标为 JOB 时禁止传。</p>
     */
    public String getWarehouseId() {
        return this.WarehouseId;
    }

    /**
     * Set <p>计算仓库 ID。仅目标 RunMode=WAREHOUSE 时可传（必填）；未传 RunMode 或目标为 JOB 时禁止传。</p>
     * @param WarehouseId <p>计算仓库 ID。仅目标 RunMode=WAREHOUSE 时可传（必填）；未传 RunMode 或目标为 JOB 时禁止传。</p>
     */
    public void setWarehouseId(String WarehouseId) {
        this.WarehouseId = WarehouseId;
    }

    public ModifyJobDefinitionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyJobDefinitionRequest(ModifyJobDefinitionRequest source) {
        if (source.JobDefinitionId != null) {
            this.JobDefinitionId = new String(source.JobDefinitionId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.MajorType != null) {
            this.MajorType = new String(source.MajorType);
        }
        if (source.MinorType != null) {
            this.MinorType = new String(source.MinorType);
        }
        if (source.CheckpointLocation != null) {
            this.CheckpointLocation = new String(source.CheckpointLocation);
        }
        if (source.PartitionCode != null) {
            this.PartitionCode = new String(source.PartitionCode);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.RuntimeCode != null) {
            this.RuntimeCode = new String(source.RuntimeCode);
        }
        if (source.SysCatalogVersion != null) {
            this.SysCatalogVersion = new String(source.SysCatalogVersion);
        }
        if (source.CustomProperties != null) {
            this.CustomProperties = new String(source.CustomProperties);
        }
        if (source.EnvVars != null) {
            this.EnvVars = new KVPair[source.EnvVars.length];
            for (int i = 0; i < source.EnvVars.length; i++) {
                this.EnvVars[i] = new KVPair(source.EnvVars[i]);
            }
        }
        if (source.RunMode != null) {
            this.RunMode = new String(source.RunMode);
        }
        if (source.WarehouseId != null) {
            this.WarehouseId = new String(source.WarehouseId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobDefinitionId", this.JobDefinitionId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "MajorType", this.MajorType);
        this.setParamSimple(map, prefix + "MinorType", this.MinorType);
        this.setParamSimple(map, prefix + "CheckpointLocation", this.CheckpointLocation);
        this.setParamSimple(map, prefix + "PartitionCode", this.PartitionCode);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "RuntimeCode", this.RuntimeCode);
        this.setParamSimple(map, prefix + "SysCatalogVersion", this.SysCatalogVersion);
        this.setParamSimple(map, prefix + "CustomProperties", this.CustomProperties);
        this.setParamArrayObj(map, prefix + "EnvVars.", this.EnvVars);
        this.setParamSimple(map, prefix + "RunMode", this.RunMode);
        this.setParamSimple(map, prefix + "WarehouseId", this.WarehouseId);

    }
}

