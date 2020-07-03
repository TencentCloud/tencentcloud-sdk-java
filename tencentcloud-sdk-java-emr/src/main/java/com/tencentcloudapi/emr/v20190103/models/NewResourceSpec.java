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

public class NewResourceSpec extends AbstractModel{

    /**
    * 描述Master节点资源
    */
    @SerializedName("MasterResourceSpec")
    @Expose
    private Resource MasterResourceSpec;

    /**
    * 描述Core节点资源
    */
    @SerializedName("CoreResourceSpec")
    @Expose
    private Resource CoreResourceSpec;

    /**
    * 描述Task节点资源
    */
    @SerializedName("TaskResourceSpec")
    @Expose
    private Resource TaskResourceSpec;

    /**
    * Master节点数量
    */
    @SerializedName("MasterCount")
    @Expose
    private Long MasterCount;

    /**
    * Core节点数量
    */
    @SerializedName("CoreCount")
    @Expose
    private Long CoreCount;

    /**
    * Task节点数量
    */
    @SerializedName("TaskCount")
    @Expose
    private Long TaskCount;

    /**
    * 描述Common节点资源
    */
    @SerializedName("CommonResourceSpec")
    @Expose
    private Resource CommonResourceSpec;

    /**
    * Common节点数量
    */
    @SerializedName("CommonCount")
    @Expose
    private Long CommonCount;

    /**
     * Get 描述Master节点资源 
     * @return MasterResourceSpec 描述Master节点资源
     */
    public Resource getMasterResourceSpec() {
        return this.MasterResourceSpec;
    }

    /**
     * Set 描述Master节点资源
     * @param MasterResourceSpec 描述Master节点资源
     */
    public void setMasterResourceSpec(Resource MasterResourceSpec) {
        this.MasterResourceSpec = MasterResourceSpec;
    }

    /**
     * Get 描述Core节点资源 
     * @return CoreResourceSpec 描述Core节点资源
     */
    public Resource getCoreResourceSpec() {
        return this.CoreResourceSpec;
    }

    /**
     * Set 描述Core节点资源
     * @param CoreResourceSpec 描述Core节点资源
     */
    public void setCoreResourceSpec(Resource CoreResourceSpec) {
        this.CoreResourceSpec = CoreResourceSpec;
    }

    /**
     * Get 描述Task节点资源 
     * @return TaskResourceSpec 描述Task节点资源
     */
    public Resource getTaskResourceSpec() {
        return this.TaskResourceSpec;
    }

    /**
     * Set 描述Task节点资源
     * @param TaskResourceSpec 描述Task节点资源
     */
    public void setTaskResourceSpec(Resource TaskResourceSpec) {
        this.TaskResourceSpec = TaskResourceSpec;
    }

    /**
     * Get Master节点数量 
     * @return MasterCount Master节点数量
     */
    public Long getMasterCount() {
        return this.MasterCount;
    }

    /**
     * Set Master节点数量
     * @param MasterCount Master节点数量
     */
    public void setMasterCount(Long MasterCount) {
        this.MasterCount = MasterCount;
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
     * Get Task节点数量 
     * @return TaskCount Task节点数量
     */
    public Long getTaskCount() {
        return this.TaskCount;
    }

    /**
     * Set Task节点数量
     * @param TaskCount Task节点数量
     */
    public void setTaskCount(Long TaskCount) {
        this.TaskCount = TaskCount;
    }

    /**
     * Get 描述Common节点资源 
     * @return CommonResourceSpec 描述Common节点资源
     */
    public Resource getCommonResourceSpec() {
        return this.CommonResourceSpec;
    }

    /**
     * Set 描述Common节点资源
     * @param CommonResourceSpec 描述Common节点资源
     */
    public void setCommonResourceSpec(Resource CommonResourceSpec) {
        this.CommonResourceSpec = CommonResourceSpec;
    }

    /**
     * Get Common节点数量 
     * @return CommonCount Common节点数量
     */
    public Long getCommonCount() {
        return this.CommonCount;
    }

    /**
     * Set Common节点数量
     * @param CommonCount Common节点数量
     */
    public void setCommonCount(Long CommonCount) {
        this.CommonCount = CommonCount;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "MasterResourceSpec.", this.MasterResourceSpec);
        this.setParamObj(map, prefix + "CoreResourceSpec.", this.CoreResourceSpec);
        this.setParamObj(map, prefix + "TaskResourceSpec.", this.TaskResourceSpec);
        this.setParamSimple(map, prefix + "MasterCount", this.MasterCount);
        this.setParamSimple(map, prefix + "CoreCount", this.CoreCount);
        this.setParamSimple(map, prefix + "TaskCount", this.TaskCount);
        this.setParamObj(map, prefix + "CommonResourceSpec.", this.CommonResourceSpec);
        this.setParamSimple(map, prefix + "CommonCount", this.CommonCount);

    }
}

