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

public class CreateJobConfigRequest extends AbstractModel{

    /**
    * 作业Id
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 主类
    */
    @SerializedName("EntrypointClass")
    @Expose
    private String EntrypointClass;

    /**
    * 主类入参
    */
    @SerializedName("ProgramArgs")
    @Expose
    private String ProgramArgs;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 资源引用数组
    */
    @SerializedName("ResourceRefs")
    @Expose
    private ResourceRef [] ResourceRefs;

    /**
    * 作业默认并行度
    */
    @SerializedName("DefaultParallelism")
    @Expose
    private Long DefaultParallelism;

    /**
    * 系统参数
    */
    @SerializedName("Properties")
    @Expose
    private Property [] Properties;

    /**
    * 1: 作业配置达到上限之后，自动删除可删除的最早版本
    */
    @SerializedName("AutoDelete")
    @Expose
    private Long AutoDelete;

    /**
    * 作业使用的 COS 存储桶名
    */
    @SerializedName("COSBucket")
    @Expose
    private String COSBucket;

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
     * @return EntrypointClass 主类
     */
    public String getEntrypointClass() {
        return this.EntrypointClass;
    }

    /**
     * Set 主类
     * @param EntrypointClass 主类
     */
    public void setEntrypointClass(String EntrypointClass) {
        this.EntrypointClass = EntrypointClass;
    }

    /**
     * Get 主类入参 
     * @return ProgramArgs 主类入参
     */
    public String getProgramArgs() {
        return this.ProgramArgs;
    }

    /**
     * Set 主类入参
     * @param ProgramArgs 主类入参
     */
    public void setProgramArgs(String ProgramArgs) {
        this.ProgramArgs = ProgramArgs;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 资源引用数组 
     * @return ResourceRefs 资源引用数组
     */
    public ResourceRef [] getResourceRefs() {
        return this.ResourceRefs;
    }

    /**
     * Set 资源引用数组
     * @param ResourceRefs 资源引用数组
     */
    public void setResourceRefs(ResourceRef [] ResourceRefs) {
        this.ResourceRefs = ResourceRefs;
    }

    /**
     * Get 作业默认并行度 
     * @return DefaultParallelism 作业默认并行度
     */
    public Long getDefaultParallelism() {
        return this.DefaultParallelism;
    }

    /**
     * Set 作业默认并行度
     * @param DefaultParallelism 作业默认并行度
     */
    public void setDefaultParallelism(Long DefaultParallelism) {
        this.DefaultParallelism = DefaultParallelism;
    }

    /**
     * Get 系统参数 
     * @return Properties 系统参数
     */
    public Property [] getProperties() {
        return this.Properties;
    }

    /**
     * Set 系统参数
     * @param Properties 系统参数
     */
    public void setProperties(Property [] Properties) {
        this.Properties = Properties;
    }

    /**
     * Get 1: 作业配置达到上限之后，自动删除可删除的最早版本 
     * @return AutoDelete 1: 作业配置达到上限之后，自动删除可删除的最早版本
     */
    public Long getAutoDelete() {
        return this.AutoDelete;
    }

    /**
     * Set 1: 作业配置达到上限之后，自动删除可删除的最早版本
     * @param AutoDelete 1: 作业配置达到上限之后，自动删除可删除的最早版本
     */
    public void setAutoDelete(Long AutoDelete) {
        this.AutoDelete = AutoDelete;
    }

    /**
     * Get 作业使用的 COS 存储桶名 
     * @return COSBucket 作业使用的 COS 存储桶名
     */
    public String getCOSBucket() {
        return this.COSBucket;
    }

    /**
     * Set 作业使用的 COS 存储桶名
     * @param COSBucket 作业使用的 COS 存储桶名
     */
    public void setCOSBucket(String COSBucket) {
        this.COSBucket = COSBucket;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "EntrypointClass", this.EntrypointClass);
        this.setParamSimple(map, prefix + "ProgramArgs", this.ProgramArgs);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArrayObj(map, prefix + "ResourceRefs.", this.ResourceRefs);
        this.setParamSimple(map, prefix + "DefaultParallelism", this.DefaultParallelism);
        this.setParamArrayObj(map, prefix + "Properties.", this.Properties);
        this.setParamSimple(map, prefix + "AutoDelete", this.AutoDelete);
        this.setParamSimple(map, prefix + "COSBucket", this.COSBucket);

    }
}

