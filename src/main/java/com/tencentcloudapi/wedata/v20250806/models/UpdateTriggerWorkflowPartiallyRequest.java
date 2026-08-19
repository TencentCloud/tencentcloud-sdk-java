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
    * <p>项目ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>工作流ID</p>
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * <p>责任人ID</p>
    */
    @SerializedName("NewSetting")
    @Expose
    private UpdateTriggerWorkflowPartially NewSetting;

    /**
    * <p>删除字段内容，采用属性路径的形式标识，删除的值以&quot;:&quot;分割，多个值以&quot;,&quot;分割<br> // 删除调度参数中 ParamKey 为 aa,bb 的属性 &quot;WorkflowParams:aa,bb&quot;<br> // 删除配置的 TriggerId 为 da46d950-d5ca-4cfb-a5a9-f3c2eeea1bf0 的调度配置&quot;TriggerWorkflowSchedulerConfigurations :da46d950-d5ca-4cfb-a5a9-f3c2eeea1bf0&quot;<br>// 删除spark sql通用参数 &quot;GeneralTaskParams: SPARK_SQL&quot;</p>
    */
    @SerializedName("FieldToRemoveList")
    @Expose
    private String [] FieldToRemoveList;

    /**
     * Get <p>项目ID</p> 
     * @return ProjectId <p>项目ID</p>
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID</p>
     * @param ProjectId <p>项目ID</p>
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>工作流ID</p> 
     * @return WorkflowId <p>工作流ID</p>
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set <p>工作流ID</p>
     * @param WorkflowId <p>工作流ID</p>
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get <p>责任人ID</p> 
     * @return NewSetting <p>责任人ID</p>
     */
    public UpdateTriggerWorkflowPartially getNewSetting() {
        return this.NewSetting;
    }

    /**
     * Set <p>责任人ID</p>
     * @param NewSetting <p>责任人ID</p>
     */
    public void setNewSetting(UpdateTriggerWorkflowPartially NewSetting) {
        this.NewSetting = NewSetting;
    }

    /**
     * Get <p>删除字段内容，采用属性路径的形式标识，删除的值以&quot;:&quot;分割，多个值以&quot;,&quot;分割<br> // 删除调度参数中 ParamKey 为 aa,bb 的属性 &quot;WorkflowParams:aa,bb&quot;<br> // 删除配置的 TriggerId 为 da46d950-d5ca-4cfb-a5a9-f3c2eeea1bf0 的调度配置&quot;TriggerWorkflowSchedulerConfigurations :da46d950-d5ca-4cfb-a5a9-f3c2eeea1bf0&quot;<br>// 删除spark sql通用参数 &quot;GeneralTaskParams: SPARK_SQL&quot;</p> 
     * @return FieldToRemoveList <p>删除字段内容，采用属性路径的形式标识，删除的值以&quot;:&quot;分割，多个值以&quot;,&quot;分割<br> // 删除调度参数中 ParamKey 为 aa,bb 的属性 &quot;WorkflowParams:aa,bb&quot;<br> // 删除配置的 TriggerId 为 da46d950-d5ca-4cfb-a5a9-f3c2eeea1bf0 的调度配置&quot;TriggerWorkflowSchedulerConfigurations :da46d950-d5ca-4cfb-a5a9-f3c2eeea1bf0&quot;<br>// 删除spark sql通用参数 &quot;GeneralTaskParams: SPARK_SQL&quot;</p>
     */
    public String [] getFieldToRemoveList() {
        return this.FieldToRemoveList;
    }

    /**
     * Set <p>删除字段内容，采用属性路径的形式标识，删除的值以&quot;:&quot;分割，多个值以&quot;,&quot;分割<br> // 删除调度参数中 ParamKey 为 aa,bb 的属性 &quot;WorkflowParams:aa,bb&quot;<br> // 删除配置的 TriggerId 为 da46d950-d5ca-4cfb-a5a9-f3c2eeea1bf0 的调度配置&quot;TriggerWorkflowSchedulerConfigurations :da46d950-d5ca-4cfb-a5a9-f3c2eeea1bf0&quot;<br>// 删除spark sql通用参数 &quot;GeneralTaskParams: SPARK_SQL&quot;</p>
     * @param FieldToRemoveList <p>删除字段内容，采用属性路径的形式标识，删除的值以&quot;:&quot;分割，多个值以&quot;,&quot;分割<br> // 删除调度参数中 ParamKey 为 aa,bb 的属性 &quot;WorkflowParams:aa,bb&quot;<br> // 删除配置的 TriggerId 为 da46d950-d5ca-4cfb-a5a9-f3c2eeea1bf0 的调度配置&quot;TriggerWorkflowSchedulerConfigurations :da46d950-d5ca-4cfb-a5a9-f3c2eeea1bf0&quot;<br>// 删除spark sql通用参数 &quot;GeneralTaskParams: SPARK_SQL&quot;</p>
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

