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

public class UpdateTriggerWorkflowPartiallyRequest extends AbstractModel {

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 工作流ID
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 责任人ID
    */
    @SerializedName("NewSetting")
    @Expose
    private UpdateTriggerWorkflowPartially NewSetting;

    /**
    * 删除字段内容，采用属性路径的形式标识，删除的值以":"分割，多个值以","分割
 // 删除调度参数中 ParamKey 为 aa,bb 的属性 "WorkflowParams:aa,bb"
 // 删除配置的 TriggerId 为 da46d950-d5ca-4cfb-a5a9-f3c2eeea1bf0 的调度配置"TriggerWorkflowSchedulerConfigurations :da46d950-d5ca-4cfb-a5a9-f3c2eeea1bf0" 
// 删除spark sql通用参数 "GeneralTaskParams: SPARK_SQL" 

    */
    @SerializedName("FieldToRemoveList")
    @Expose
    private String [] FieldToRemoveList;

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 工作流ID 
     * @return WorkflowId 工作流ID
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 工作流ID
     * @param WorkflowId 工作流ID
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get 责任人ID 
     * @return NewSetting 责任人ID
     */
    public UpdateTriggerWorkflowPartially getNewSetting() {
        return this.NewSetting;
    }

    /**
     * Set 责任人ID
     * @param NewSetting 责任人ID
     */
    public void setNewSetting(UpdateTriggerWorkflowPartially NewSetting) {
        this.NewSetting = NewSetting;
    }

    /**
     * Get 删除字段内容，采用属性路径的形式标识，删除的值以":"分割，多个值以","分割
 // 删除调度参数中 ParamKey 为 aa,bb 的属性 "WorkflowParams:aa,bb"
 // 删除配置的 TriggerId 为 da46d950-d5ca-4cfb-a5a9-f3c2eeea1bf0 的调度配置"TriggerWorkflowSchedulerConfigurations :da46d950-d5ca-4cfb-a5a9-f3c2eeea1bf0" 
// 删除spark sql通用参数 "GeneralTaskParams: SPARK_SQL" 
 
     * @return FieldToRemoveList 删除字段内容，采用属性路径的形式标识，删除的值以":"分割，多个值以","分割
 // 删除调度参数中 ParamKey 为 aa,bb 的属性 "WorkflowParams:aa,bb"
 // 删除配置的 TriggerId 为 da46d950-d5ca-4cfb-a5a9-f3c2eeea1bf0 的调度配置"TriggerWorkflowSchedulerConfigurations :da46d950-d5ca-4cfb-a5a9-f3c2eeea1bf0" 
// 删除spark sql通用参数 "GeneralTaskParams: SPARK_SQL" 

     */
    public String [] getFieldToRemoveList() {
        return this.FieldToRemoveList;
    }

    /**
     * Set 删除字段内容，采用属性路径的形式标识，删除的值以":"分割，多个值以","分割
 // 删除调度参数中 ParamKey 为 aa,bb 的属性 "WorkflowParams:aa,bb"
 // 删除配置的 TriggerId 为 da46d950-d5ca-4cfb-a5a9-f3c2eeea1bf0 的调度配置"TriggerWorkflowSchedulerConfigurations :da46d950-d5ca-4cfb-a5a9-f3c2eeea1bf0" 
// 删除spark sql通用参数 "GeneralTaskParams: SPARK_SQL" 

     * @param FieldToRemoveList 删除字段内容，采用属性路径的形式标识，删除的值以":"分割，多个值以","分割
 // 删除调度参数中 ParamKey 为 aa,bb 的属性 "WorkflowParams:aa,bb"
 // 删除配置的 TriggerId 为 da46d950-d5ca-4cfb-a5a9-f3c2eeea1bf0 的调度配置"TriggerWorkflowSchedulerConfigurations :da46d950-d5ca-4cfb-a5a9-f3c2eeea1bf0" 
// 删除spark sql通用参数 "GeneralTaskParams: SPARK_SQL" 

     */
    public void setFieldToRemoveList(String [] FieldToRemoveList) {
        this.FieldToRemoveList = FieldToRemoveList;
    }

    public UpdateTriggerWorkflowPartiallyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateTriggerWorkflowPartiallyRequest(UpdateTriggerWorkflowPartiallyRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.NewSetting != null) {
            this.NewSetting = new UpdateTriggerWorkflowPartially(source.NewSetting);
        }
        if (source.FieldToRemoveList != null) {
            this.FieldToRemoveList = new String[source.FieldToRemoveList.length];
            for (int i = 0; i < source.FieldToRemoveList.length; i++) {
                this.FieldToRemoveList[i] = new String(source.FieldToRemoveList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamObj(map, prefix + "NewSetting.", this.NewSetting);
        this.setParamArraySimple(map, prefix + "FieldToRemoveList.", this.FieldToRemoveList);

    }
}

