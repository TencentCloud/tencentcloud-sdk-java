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

public class JobConfig extends AbstractModel{

    /**
    * 作业Id
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 主类
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EntrypointClass")
    @Expose
    private String EntrypointClass;

    /**
    * 主类入参
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProgramArgs")
    @Expose
    private String ProgramArgs;

    /**
    * 备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 作业配置创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 作业配置的版本号
    */
    @SerializedName("Version")
    @Expose
    private Long Version;

    /**
    * 作业默认并行度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultParallelism")
    @Expose
    private Long DefaultParallelism;

    /**
    * 系统参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Properties")
    @Expose
    private Property [] Properties;

    /**
    * 引用资源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceRefDetails")
    @Expose
    private ResourceRefDetail [] ResourceRefDetails;

    /**
    * 创建者uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatorUin")
    @Expose
    private String CreatorUin;

    /**
    * 作业配置上次启动时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 作业绑定的存储桶
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("COSBucket")
    @Expose
    private String COSBucket;

    /**
    * 是否启用日志收集，0-未启用，1-已启用，2-历史集群未设置日志集，3-历史集群已开启
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogCollect")
    @Expose
    private Long LogCollect;

    /**
     * Get 作业Id 
     * @return JobId 作业Id
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 作业Id
     * @param JobId 作业Id
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 主类
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EntrypointClass 主类
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEntrypointClass() {
        return this.EntrypointClass;
    }

    /**
     * Set 主类
注意：此字段可能返回 null，表示取不到有效值。
     * @param EntrypointClass 主类
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEntrypointClass(String EntrypointClass) {
        this.EntrypointClass = EntrypointClass;
    }

    /**
     * Get 主类入参
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProgramArgs 主类入参
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProgramArgs() {
        return this.ProgramArgs;
    }

    /**
     * Set 主类入参
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProgramArgs 主类入参
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProgramArgs(String ProgramArgs) {
        this.ProgramArgs = ProgramArgs;
    }

    /**
     * Get 备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 作业配置创建时间 
     * @return CreateTime 作业配置创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 作业配置创建时间
     * @param CreateTime 作业配置创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 作业配置的版本号 
     * @return Version 作业配置的版本号
     */
    public Long getVersion() {
        return this.Version;
    }

    /**
     * Set 作业配置的版本号
     * @param Version 作业配置的版本号
     */
    public void setVersion(Long Version) {
        this.Version = Version;
    }

    /**
     * Get 作业默认并行度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultParallelism 作业默认并行度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDefaultParallelism() {
        return this.DefaultParallelism;
    }

    /**
     * Set 作业默认并行度
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultParallelism 作业默认并行度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultParallelism(Long DefaultParallelism) {
        this.DefaultParallelism = DefaultParallelism;
    }

    /**
     * Get 系统参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Properties 系统参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Property [] getProperties() {
        return this.Properties;
    }

    /**
     * Set 系统参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Properties 系统参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProperties(Property [] Properties) {
        this.Properties = Properties;
    }

    /**
     * Get 引用资源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceRefDetails 引用资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceRefDetail [] getResourceRefDetails() {
        return this.ResourceRefDetails;
    }

    /**
     * Set 引用资源
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceRefDetails 引用资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceRefDetails(ResourceRefDetail [] ResourceRefDetails) {
        this.ResourceRefDetails = ResourceRefDetails;
    }

    /**
     * Get 创建者uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatorUin 创建者uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set 创建者uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatorUin 创建者uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatorUin(String CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * Get 作业配置上次启动时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 作业配置上次启动时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 作业配置上次启动时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 作业配置上次启动时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 作业绑定的存储桶
注意：此字段可能返回 null，表示取不到有效值。 
     * @return COSBucket 作业绑定的存储桶
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCOSBucket() {
        return this.COSBucket;
    }

    /**
     * Set 作业绑定的存储桶
注意：此字段可能返回 null，表示取不到有效值。
     * @param COSBucket 作业绑定的存储桶
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCOSBucket(String COSBucket) {
        this.COSBucket = COSBucket;
    }

    /**
     * Get 是否启用日志收集，0-未启用，1-已启用，2-历史集群未设置日志集，3-历史集群已开启
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogCollect 是否启用日志收集，0-未启用，1-已启用，2-历史集群未设置日志集，3-历史集群已开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLogCollect() {
        return this.LogCollect;
    }

    /**
     * Set 是否启用日志收集，0-未启用，1-已启用，2-历史集群未设置日志集，3-历史集群已开启
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogCollect 是否启用日志收集，0-未启用，1-已启用，2-历史集群未设置日志集，3-历史集群已开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogCollect(Long LogCollect) {
        this.LogCollect = LogCollect;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "EntrypointClass", this.EntrypointClass);
        this.setParamSimple(map, prefix + "ProgramArgs", this.ProgramArgs);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "DefaultParallelism", this.DefaultParallelism);
        this.setParamArrayObj(map, prefix + "Properties.", this.Properties);
        this.setParamArrayObj(map, prefix + "ResourceRefDetails.", this.ResourceRefDetails);
        this.setParamSimple(map, prefix + "CreatorUin", this.CreatorUin);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "COSBucket", this.COSBucket);
        this.setParamSimple(map, prefix + "LogCollect", this.LogCollect);

    }
}

