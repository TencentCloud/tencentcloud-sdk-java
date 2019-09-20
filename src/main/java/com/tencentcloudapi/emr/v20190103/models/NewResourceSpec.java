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

public class NewResourceSpec  extends AbstractModel{

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
    private Integer MasterCount;

    /**
    * Core节点数量
    */
    @SerializedName("CoreCount")
    @Expose
    private Integer CoreCount;

    /**
    * Task节点数量
    */
    @SerializedName("TaskCount")
    @Expose
    private Integer TaskCount;

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
    private Integer CommonCount;

    /**
     * 获取描述Master节点资源
     * @return MasterResourceSpec 描述Master节点资源
     */
    public Resource getMasterResourceSpec() {
        return this.MasterResourceSpec;
    }

    /**
     * 设置描述Master节点资源
     * @param MasterResourceSpec 描述Master节点资源
     */
    public void setMasterResourceSpec(Resource MasterResourceSpec) {
        this.MasterResourceSpec = MasterResourceSpec;
    }

    /**
     * 获取描述Core节点资源
     * @return CoreResourceSpec 描述Core节点资源
     */
    public Resource getCoreResourceSpec() {
        return this.CoreResourceSpec;
    }

    /**
     * 设置描述Core节点资源
     * @param CoreResourceSpec 描述Core节点资源
     */
    public void setCoreResourceSpec(Resource CoreResourceSpec) {
        this.CoreResourceSpec = CoreResourceSpec;
    }

    /**
     * 获取描述Task节点资源
     * @return TaskResourceSpec 描述Task节点资源
     */
    public Resource getTaskResourceSpec() {
        return this.TaskResourceSpec;
    }

    /**
     * 设置描述Task节点资源
     * @param TaskResourceSpec 描述Task节点资源
     */
    public void setTaskResourceSpec(Resource TaskResourceSpec) {
        this.TaskResourceSpec = TaskResourceSpec;
    }

    /**
     * 获取Master节点数量
     * @return MasterCount Master节点数量
     */
    public Integer getMasterCount() {
        return this.MasterCount;
    }

    /**
     * 设置Master节点数量
     * @param MasterCount Master节点数量
     */
    public void setMasterCount(Integer MasterCount) {
        this.MasterCount = MasterCount;
    }

    /**
     * 获取Core节点数量
     * @return CoreCount Core节点数量
     */
    public Integer getCoreCount() {
        return this.CoreCount;
    }

    /**
     * 设置Core节点数量
     * @param CoreCount Core节点数量
     */
    public void setCoreCount(Integer CoreCount) {
        this.CoreCount = CoreCount;
    }

    /**
     * 获取Task节点数量
     * @return TaskCount Task节点数量
     */
    public Integer getTaskCount() {
        return this.TaskCount;
    }

    /**
     * 设置Task节点数量
     * @param TaskCount Task节点数量
     */
    public void setTaskCount(Integer TaskCount) {
        this.TaskCount = TaskCount;
    }

    /**
     * 获取描述Common节点资源
     * @return CommonResourceSpec 描述Common节点资源
     */
    public Resource getCommonResourceSpec() {
        return this.CommonResourceSpec;
    }

    /**
     * 设置描述Common节点资源
     * @param CommonResourceSpec 描述Common节点资源
     */
    public void setCommonResourceSpec(Resource CommonResourceSpec) {
        this.CommonResourceSpec = CommonResourceSpec;
    }

    /**
     * 获取Common节点数量
     * @return CommonCount Common节点数量
     */
    public Integer getCommonCount() {
        return this.CommonCount;
    }

    /**
     * 设置Common节点数量
     * @param CommonCount Common节点数量
     */
    public void setCommonCount(Integer CommonCount) {
        this.CommonCount = CommonCount;
    }

    /**
     * 内部实现，用户禁止调用
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

