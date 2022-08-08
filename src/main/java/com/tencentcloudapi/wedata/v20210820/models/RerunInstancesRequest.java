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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RerunInstancesRequest extends AbstractModel{

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 实例嵌套集合
    */
    @SerializedName("Instances")
    @Expose
    private InstanceInfo [] Instances;

    /**
    * 检查父任务类型, true: 检查父任务; false: 不检查父任务
    */
    @SerializedName("CheckFather")
    @Expose
    private Boolean CheckFather;

    /**
    * 重跑类型, 1: 自身; 3: 孩子; 2: 自身以及孩子
    */
    @SerializedName("RerunType")
    @Expose
    private String RerunType;

    /**
    * 实例依赖方式, 1: 自依赖; 2: 任务依赖; 3: 自依赖及父子依赖
    */
    @SerializedName("DependentWay")
    @Expose
    private String DependentWay;

    /**
    * 重跑忽略事件监听与否
    */
    @SerializedName("SkipEventListening")
    @Expose
    private Boolean SkipEventListening;

    /**
    * 下游实例范围 1: 所在工作流 2: 所在项目 3: 所有跨工作流依赖的项目
    */
    @SerializedName("SonInstanceType")
    @Expose
    private String SonInstanceType;

    /**
     * Get 项目Id 
     * @return ProjectId 项目Id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目Id
     * @param ProjectId 项目Id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 实例嵌套集合 
     * @return Instances 实例嵌套集合
     */
    public InstanceInfo [] getInstances() {
        return this.Instances;
    }

    /**
     * Set 实例嵌套集合
     * @param Instances 实例嵌套集合
     */
    public void setInstances(InstanceInfo [] Instances) {
        this.Instances = Instances;
    }

    /**
     * Get 检查父任务类型, true: 检查父任务; false: 不检查父任务 
     * @return CheckFather 检查父任务类型, true: 检查父任务; false: 不检查父任务
     */
    public Boolean getCheckFather() {
        return this.CheckFather;
    }

    /**
     * Set 检查父任务类型, true: 检查父任务; false: 不检查父任务
     * @param CheckFather 检查父任务类型, true: 检查父任务; false: 不检查父任务
     */
    public void setCheckFather(Boolean CheckFather) {
        this.CheckFather = CheckFather;
    }

    /**
     * Get 重跑类型, 1: 自身; 3: 孩子; 2: 自身以及孩子 
     * @return RerunType 重跑类型, 1: 自身; 3: 孩子; 2: 自身以及孩子
     */
    public String getRerunType() {
        return this.RerunType;
    }

    /**
     * Set 重跑类型, 1: 自身; 3: 孩子; 2: 自身以及孩子
     * @param RerunType 重跑类型, 1: 自身; 3: 孩子; 2: 自身以及孩子
     */
    public void setRerunType(String RerunType) {
        this.RerunType = RerunType;
    }

    /**
     * Get 实例依赖方式, 1: 自依赖; 2: 任务依赖; 3: 自依赖及父子依赖 
     * @return DependentWay 实例依赖方式, 1: 自依赖; 2: 任务依赖; 3: 自依赖及父子依赖
     */
    public String getDependentWay() {
        return this.DependentWay;
    }

    /**
     * Set 实例依赖方式, 1: 自依赖; 2: 任务依赖; 3: 自依赖及父子依赖
     * @param DependentWay 实例依赖方式, 1: 自依赖; 2: 任务依赖; 3: 自依赖及父子依赖
     */
    public void setDependentWay(String DependentWay) {
        this.DependentWay = DependentWay;
    }

    /**
     * Get 重跑忽略事件监听与否 
     * @return SkipEventListening 重跑忽略事件监听与否
     */
    public Boolean getSkipEventListening() {
        return this.SkipEventListening;
    }

    /**
     * Set 重跑忽略事件监听与否
     * @param SkipEventListening 重跑忽略事件监听与否
     */
    public void setSkipEventListening(Boolean SkipEventListening) {
        this.SkipEventListening = SkipEventListening;
    }

    /**
     * Get 下游实例范围 1: 所在工作流 2: 所在项目 3: 所有跨工作流依赖的项目 
     * @return SonInstanceType 下游实例范围 1: 所在工作流 2: 所在项目 3: 所有跨工作流依赖的项目
     */
    public String getSonInstanceType() {
        return this.SonInstanceType;
    }

    /**
     * Set 下游实例范围 1: 所在工作流 2: 所在项目 3: 所有跨工作流依赖的项目
     * @param SonInstanceType 下游实例范围 1: 所在工作流 2: 所在项目 3: 所有跨工作流依赖的项目
     */
    public void setSonInstanceType(String SonInstanceType) {
        this.SonInstanceType = SonInstanceType;
    }

    public RerunInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RerunInstancesRequest(RerunInstancesRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Instances != null) {
            this.Instances = new InstanceInfo[source.Instances.length];
            for (int i = 0; i < source.Instances.length; i++) {
                this.Instances[i] = new InstanceInfo(source.Instances[i]);
            }
        }
        if (source.CheckFather != null) {
            this.CheckFather = new Boolean(source.CheckFather);
        }
        if (source.RerunType != null) {
            this.RerunType = new String(source.RerunType);
        }
        if (source.DependentWay != null) {
            this.DependentWay = new String(source.DependentWay);
        }
        if (source.SkipEventListening != null) {
            this.SkipEventListening = new Boolean(source.SkipEventListening);
        }
        if (source.SonInstanceType != null) {
            this.SonInstanceType = new String(source.SonInstanceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "Instances.", this.Instances);
        this.setParamSimple(map, prefix + "CheckFather", this.CheckFather);
        this.setParamSimple(map, prefix + "RerunType", this.RerunType);
        this.setParamSimple(map, prefix + "DependentWay", this.DependentWay);
        this.setParamSimple(map, prefix + "SkipEventListening", this.SkipEventListening);
        this.setParamSimple(map, prefix + "SonInstanceType", this.SonInstanceType);

    }
}

