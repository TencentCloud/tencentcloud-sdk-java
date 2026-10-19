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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkflowRunMetadata extends AbstractModel {

    /**
    * 用户的输入
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 主模型名称
    */
    @SerializedName("MainModelName")
    @Expose
    private String MainModelName;

    /**
    * API参数配置
    */
    @SerializedName("CustomVariableList")
    @Expose
    private CustomVariable [] CustomVariableList;

    /**
    * 工作流的流程图
    */
    @SerializedName("WorkflowGraph")
    @Expose
    private String WorkflowGraph;

    /**
     * Get 用户的输入 
     * @return Query 用户的输入
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 用户的输入
     * @param Query 用户的输入
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get 主模型名称 
     * @return MainModelName 主模型名称
     */
    public String getMainModelName() {
        return this.MainModelName;
    }

    /**
     * Set 主模型名称
     * @param MainModelName 主模型名称
     */
    public void setMainModelName(String MainModelName) {
        this.MainModelName = MainModelName;
    }

    /**
     * Get API参数配置 
     * @return CustomVariableList API参数配置
     */
    public CustomVariable [] getCustomVariableList() {
        return this.CustomVariableList;
    }

    /**
     * Set API参数配置
     * @param CustomVariableList API参数配置
     */
    public void setCustomVariableList(CustomVariable [] CustomVariableList) {
        this.CustomVariableList = CustomVariableList;
    }

    /**
     * Get 工作流的流程图 
     * @return WorkflowGraph 工作流的流程图
     */
    public String getWorkflowGraph() {
        return this.WorkflowGraph;
    }

    /**
     * Set 工作流的流程图
     * @param WorkflowGraph 工作流的流程图
     */
    public void setWorkflowGraph(String WorkflowGraph) {
        this.WorkflowGraph = WorkflowGraph;
    }

    public WorkflowRunMetadata() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowRunMetadata(WorkflowRunMetadata source) {
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.MainModelName != null) {
            this.MainModelName = new String(source.MainModelName);
        }
        if (source.CustomVariableList != null) {
            this.CustomVariableList = new CustomVariable[source.CustomVariableList.length];
            for (int i = 0; i < source.CustomVariableList.length; i++) {
                this.CustomVariableList[i] = new CustomVariable(source.CustomVariableList[i]);
            }
        }
        if (source.WorkflowGraph != null) {
            this.WorkflowGraph = new String(source.WorkflowGraph);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "MainModelName", this.MainModelName);
        this.setParamArrayObj(map, prefix + "CustomVariableList.", this.CustomVariableList);
        this.setParamSimple(map, prefix + "WorkflowGraph", this.WorkflowGraph);

    }
}

