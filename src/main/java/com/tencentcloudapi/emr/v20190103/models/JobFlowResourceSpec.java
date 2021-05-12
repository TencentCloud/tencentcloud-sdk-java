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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JobFlowResourceSpec extends AbstractModel{

    /**
    * 主节点数量。
    */
    @SerializedName("MasterCount")
    @Expose
    private Long MasterCount;

    /**
    * 主节点配置。
    */
    @SerializedName("MasterResourceSpec")
    @Expose
    private JobFlowResource MasterResourceSpec;

    /**
    * Core节点数量
    */
    @SerializedName("CoreCount")
    @Expose
    private Long CoreCount;

    /**
    * Core节点配置。
    */
    @SerializedName("CoreResourceSpec")
    @Expose
    private JobFlowResource CoreResourceSpec;

    /**
    * Task节点数量。
    */
    @SerializedName("TaskCount")
    @Expose
    private Long TaskCount;

    /**
    * Common节点数量。
    */
    @SerializedName("CommonCount")
    @Expose
    private Long CommonCount;

    /**
    * Task节点配置。
    */
    @SerializedName("TaskResourceSpec")
    @Expose
    private JobFlowResource TaskResourceSpec;

    /**
    * Common节点配置。
    */
    @SerializedName("CommonResourceSpec")
    @Expose
    private JobFlowResource CommonResourceSpec;

    /**
     * Get 主节点数量。 
     * @return MasterCount 主节点数量。
     */
    public Long getMasterCount() {
        return this.MasterCount;
    }

    /**
     * Set 主节点数量。
     * @param MasterCount 主节点数量。
     */
    public void setMasterCount(Long MasterCount) {
        this.MasterCount = MasterCount;
    }

    /**
     * Get 主节点配置。 
     * @return MasterResourceSpec 主节点配置。
     */
    public JobFlowResource getMasterResourceSpec() {
        return this.MasterResourceSpec;
    }

    /**
     * Set 主节点配置。
     * @param MasterResourceSpec 主节点配置。
     */
    public void setMasterResourceSpec(JobFlowResource MasterResourceSpec) {
        this.MasterResourceSpec = MasterResourceSpec;
    }

    /**
     * Get Core节点数量 
     * @return CoreCount Core节点数量
     */
    public Long getCoreCount() {
        return this.CoreCount;
    }

    /**
     * Set Core节点数量
     * @param CoreCount Core节点数量
     */
    public void setCoreCount(Long CoreCount) {
        this.CoreCount = CoreCount;
    }

    /**
     * Get Core节点配置。 
     * @return CoreResourceSpec Core节点配置。
     */
    public JobFlowResource getCoreResourceSpec() {
        return this.CoreResourceSpec;
    }

    /**
     * Set Core节点配置。
     * @param CoreResourceSpec Core节点配置。
     */
    public void setCoreResourceSpec(JobFlowResource CoreResourceSpec) {
        this.CoreResourceSpec = CoreResourceSpec;
    }

    /**
     * Get Task节点数量。 
     * @return TaskCount Task节点数量。
     */
    public Long getTaskCount() {
        return this.TaskCount;
    }

    /**
     * Set Task节点数量。
     * @param TaskCount Task节点数量。
     */
    public void setTaskCount(Long TaskCount) {
        this.TaskCount = TaskCount;
    }

    /**
     * Get Common节点数量。 
     * @return CommonCount Common节点数量。
     */
    public Long getCommonCount() {
        return this.CommonCount;
    }

    /**
     * Set Common节点数量。
     * @param CommonCount Common节点数量。
     */
    public void setCommonCount(Long CommonCount) {
        this.CommonCount = CommonCount;
    }

    /**
     * Get Task节点配置。 
     * @return TaskResourceSpec Task节点配置。
     */
    public JobFlowResource getTaskResourceSpec() {
        return this.TaskResourceSpec;
    }

    /**
     * Set Task节点配置。
     * @param TaskResourceSpec Task节点配置。
     */
    public void setTaskResourceSpec(JobFlowResource TaskResourceSpec) {
        this.TaskResourceSpec = TaskResourceSpec;
    }

    /**
     * Get Common节点配置。 
     * @return CommonResourceSpec Common节点配置。
     */
    public JobFlowResource getCommonResourceSpec() {
        return this.CommonResourceSpec;
    }

    /**
     * Set Common节点配置。
     * @param CommonResourceSpec Common节点配置。
     */
    public void setCommonResourceSpec(JobFlowResource CommonResourceSpec) {
        this.CommonResourceSpec = CommonResourceSpec;
    }

    public JobFlowResourceSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JobFlowResourceSpec(JobFlowResourceSpec source) {
        if (source.MasterCount != null) {
            this.MasterCount = new Long(source.MasterCount);
        }
        if (source.MasterResourceSpec != null) {
            this.MasterResourceSpec = new JobFlowResource(source.MasterResourceSpec);
        }
        if (source.CoreCount != null) {
            this.CoreCount = new Long(source.CoreCount);
        }
        if (source.CoreResourceSpec != null) {
            this.CoreResourceSpec = new JobFlowResource(source.CoreResourceSpec);
        }
        if (source.TaskCount != null) {
            this.TaskCount = new Long(source.TaskCount);
        }
        if (source.CommonCount != null) {
            this.CommonCount = new Long(source.CommonCount);
        }
        if (source.TaskResourceSpec != null) {
            this.TaskResourceSpec = new JobFlowResource(source.TaskResourceSpec);
        }
        if (source.CommonResourceSpec != null) {
            this.CommonResourceSpec = new JobFlowResource(source.CommonResourceSpec);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MasterCount", this.MasterCount);
        this.setParamObj(map, prefix + "MasterResourceSpec.", this.MasterResourceSpec);
        this.setParamSimple(map, prefix + "CoreCount", this.CoreCount);
        this.setParamObj(map, prefix + "CoreResourceSpec.", this.CoreResourceSpec);
        this.setParamSimple(map, prefix + "TaskCount", this.TaskCount);
        this.setParamSimple(map, prefix + "CommonCount", this.CommonCount);
        this.setParamObj(map, prefix + "TaskResourceSpec.", this.TaskResourceSpec);
        this.setParamObj(map, prefix + "CommonResourceSpec.", this.CommonResourceSpec);

    }
}

