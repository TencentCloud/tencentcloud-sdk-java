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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RerunTaskInstancesAsyncRequest extends AbstractModel {

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 实例id列表,可以从ListInstances中获取
    */
    @SerializedName("InstanceKeyList")
    @Expose
    private String [] InstanceKeyList;

    /**
    * 重跑类型, 1: 自身; 3: 孩子; 2: 自身以及孩子，默认1
    */
    @SerializedName("RerunType")
    @Expose
    private String RerunType;

    /**
    * 是否检查上游任务： ALL（全部）、 MAKE_SCOPE（选中）、NONE （全部不检查），默认NONE
    */
    @SerializedName("CheckParentType")
    @Expose
    private String CheckParentType;

    /**
    * 下游实例范围 WORKFLOW: 所在工作流 PROJECT: 所在项目 ALL: 所有跨工作流依赖的项目，默认WORKFLOW
    */
    @SerializedName("SonRangeType")
    @Expose
    private String SonRangeType;

    /**
    * 重跑是否忽略事件监听
    */
    @SerializedName("SkipEventListening")
    @Expose
    private Boolean SkipEventListening;

    /**
    * 自定义实例运行并发度, 如果不配置，则使用任务原有自依赖
    */
    @SerializedName("RedefineParallelNum")
    @Expose
    private Long RedefineParallelNum;

    /**
    * 自定义的工作流自依赖: yes开启，no关闭，如果不配置，则使用工作流原有自依赖
    */
    @SerializedName("RedefineSelfWorkflowDependency")
    @Expose
    private String RedefineSelfWorkflowDependency;

    /**
    * 重跑实例自定义参数
    */
    @SerializedName("RedefineParamList")
    @Expose
    private KVMap RedefineParamList;

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
     * Get 实例id列表,可以从ListInstances中获取 
     * @return InstanceKeyList 实例id列表,可以从ListInstances中获取
     */
    public String [] getInstanceKeyList() {
        return this.InstanceKeyList;
    }

    /**
     * Set 实例id列表,可以从ListInstances中获取
     * @param InstanceKeyList 实例id列表,可以从ListInstances中获取
     */
    public void setInstanceKeyList(String [] InstanceKeyList) {
        this.InstanceKeyList = InstanceKeyList;
    }

    /**
     * Get 重跑类型, 1: 自身; 3: 孩子; 2: 自身以及孩子，默认1 
     * @return RerunType 重跑类型, 1: 自身; 3: 孩子; 2: 自身以及孩子，默认1
     */
    public String getRerunType() {
        return this.RerunType;
    }

    /**
     * Set 重跑类型, 1: 自身; 3: 孩子; 2: 自身以及孩子，默认1
     * @param RerunType 重跑类型, 1: 自身; 3: 孩子; 2: 自身以及孩子，默认1
     */
    public void setRerunType(String RerunType) {
        this.RerunType = RerunType;
    }

    /**
     * Get 是否检查上游任务： ALL（全部）、 MAKE_SCOPE（选中）、NONE （全部不检查），默认NONE 
     * @return CheckParentType 是否检查上游任务： ALL（全部）、 MAKE_SCOPE（选中）、NONE （全部不检查），默认NONE
     */
    public String getCheckParentType() {
        return this.CheckParentType;
    }

    /**
     * Set 是否检查上游任务： ALL（全部）、 MAKE_SCOPE（选中）、NONE （全部不检查），默认NONE
     * @param CheckParentType 是否检查上游任务： ALL（全部）、 MAKE_SCOPE（选中）、NONE （全部不检查），默认NONE
     */
    public void setCheckParentType(String CheckParentType) {
        this.CheckParentType = CheckParentType;
    }

    /**
     * Get 下游实例范围 WORKFLOW: 所在工作流 PROJECT: 所在项目 ALL: 所有跨工作流依赖的项目，默认WORKFLOW 
     * @return SonRangeType 下游实例范围 WORKFLOW: 所在工作流 PROJECT: 所在项目 ALL: 所有跨工作流依赖的项目，默认WORKFLOW
     */
    public String getSonRangeType() {
        return this.SonRangeType;
    }

    /**
     * Set 下游实例范围 WORKFLOW: 所在工作流 PROJECT: 所在项目 ALL: 所有跨工作流依赖的项目，默认WORKFLOW
     * @param SonRangeType 下游实例范围 WORKFLOW: 所在工作流 PROJECT: 所在项目 ALL: 所有跨工作流依赖的项目，默认WORKFLOW
     */
    public void setSonRangeType(String SonRangeType) {
        this.SonRangeType = SonRangeType;
    }

    /**
     * Get 重跑是否忽略事件监听 
     * @return SkipEventListening 重跑是否忽略事件监听
     */
    public Boolean getSkipEventListening() {
        return this.SkipEventListening;
    }

    /**
     * Set 重跑是否忽略事件监听
     * @param SkipEventListening 重跑是否忽略事件监听
     */
    public void setSkipEventListening(Boolean SkipEventListening) {
        this.SkipEventListening = SkipEventListening;
    }

    /**
     * Get 自定义实例运行并发度, 如果不配置，则使用任务原有自依赖 
     * @return RedefineParallelNum 自定义实例运行并发度, 如果不配置，则使用任务原有自依赖
     */
    public Long getRedefineParallelNum() {
        return this.RedefineParallelNum;
    }

    /**
     * Set 自定义实例运行并发度, 如果不配置，则使用任务原有自依赖
     * @param RedefineParallelNum 自定义实例运行并发度, 如果不配置，则使用任务原有自依赖
     */
    public void setRedefineParallelNum(Long RedefineParallelNum) {
        this.RedefineParallelNum = RedefineParallelNum;
    }

    /**
     * Get 自定义的工作流自依赖: yes开启，no关闭，如果不配置，则使用工作流原有自依赖 
     * @return RedefineSelfWorkflowDependency 自定义的工作流自依赖: yes开启，no关闭，如果不配置，则使用工作流原有自依赖
     */
    public String getRedefineSelfWorkflowDependency() {
        return this.RedefineSelfWorkflowDependency;
    }

    /**
     * Set 自定义的工作流自依赖: yes开启，no关闭，如果不配置，则使用工作流原有自依赖
     * @param RedefineSelfWorkflowDependency 自定义的工作流自依赖: yes开启，no关闭，如果不配置，则使用工作流原有自依赖
     */
    public void setRedefineSelfWorkflowDependency(String RedefineSelfWorkflowDependency) {
        this.RedefineSelfWorkflowDependency = RedefineSelfWorkflowDependency;
    }

    /**
     * Get 重跑实例自定义参数 
     * @return RedefineParamList 重跑实例自定义参数
     */
    public KVMap getRedefineParamList() {
        return this.RedefineParamList;
    }

    /**
     * Set 重跑实例自定义参数
     * @param RedefineParamList 重跑实例自定义参数
     */
    public void setRedefineParamList(KVMap RedefineParamList) {
        this.RedefineParamList = RedefineParamList;
    }

    public RerunTaskInstancesAsyncRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RerunTaskInstancesAsyncRequest(RerunTaskInstancesAsyncRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.InstanceKeyList != null) {
            this.InstanceKeyList = new String[source.InstanceKeyList.length];
            for (int i = 0; i < source.InstanceKeyList.length; i++) {
                this.InstanceKeyList[i] = new String(source.InstanceKeyList[i]);
            }
        }
        if (source.RerunType != null) {
            this.RerunType = new String(source.RerunType);
        }
        if (source.CheckParentType != null) {
            this.CheckParentType = new String(source.CheckParentType);
        }
        if (source.SonRangeType != null) {
            this.SonRangeType = new String(source.SonRangeType);
        }
        if (source.SkipEventListening != null) {
            this.SkipEventListening = new Boolean(source.SkipEventListening);
        }
        if (source.RedefineParallelNum != null) {
            this.RedefineParallelNum = new Long(source.RedefineParallelNum);
        }
        if (source.RedefineSelfWorkflowDependency != null) {
            this.RedefineSelfWorkflowDependency = new String(source.RedefineSelfWorkflowDependency);
        }
        if (source.RedefineParamList != null) {
            this.RedefineParamList = new KVMap(source.RedefineParamList);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "InstanceKeyList.", this.InstanceKeyList);
        this.setParamSimple(map, prefix + "RerunType", this.RerunType);
        this.setParamSimple(map, prefix + "CheckParentType", this.CheckParentType);
        this.setParamSimple(map, prefix + "SonRangeType", this.SonRangeType);
        this.setParamSimple(map, prefix + "SkipEventListening", this.SkipEventListening);
        this.setParamSimple(map, prefix + "RedefineParallelNum", this.RedefineParallelNum);
        this.setParamSimple(map, prefix + "RedefineSelfWorkflowDependency", this.RedefineSelfWorkflowDependency);
        this.setParamObj(map, prefix + "RedefineParamList.", this.RedefineParamList);

    }
}

