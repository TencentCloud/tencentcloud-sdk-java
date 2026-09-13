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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListWorkflowRunsRequest extends AbstractModel {

    /**
    * <p>工作空间ID，可通过 ListWorkspaces 获取。必填</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>分页页码，从 1 开始。非必填，默认 1</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>每页大小。非必填，默认 10，取值范围 [10, 200]</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>工作流ID，精确匹配。非必填，单值</p>
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * <p>工作流名称关键字，对 WorkflowName 做模糊匹配。非必填，单值</p>
    */
    @SerializedName("WorkflowNameKeyword")
    @Expose
    private String WorkflowNameKeyword;

    /**
    * <p>运行创建时间下界，范围匹配（CreateTime &gt;= 本值），单位：毫秒时间戳。<br>非必填，单值，对应出参 WorkflowRun.CreateTime</p>
    */
    @SerializedName("CreateStartTime")
    @Expose
    private String CreateStartTime;

    /**
    * <p>运行创建时间上界，范围匹配（CreateTime &lt;= 本值），单位：毫秒时间戳。<br>非必填，单值，对应出参 WorkflowRun.CreateTime</p>
    */
    @SerializedName("CreateEndTime")
    @Expose
    private String CreateEndTime;

    /**
    * <p>运行状态，精确匹配。非必填，多选（多个值之间为 OR 关系）。</p><p>可填 SUCCESS / FAILED 等，具体参考本接口出参 WorkflowRun.RunState 字段返回值。</p>
    */
    @SerializedName("RunStates")
    @Expose
    private String [] RunStates;

    /**
    * <p>错误码，精确匹配。非必填，多选（多个值之间为 OR 关系）</p>
    */
    @SerializedName("ErrorCodeStrings")
    @Expose
    private String [] ErrorCodeStrings;

    /**
    * <p>运行人UIN，精确匹配。非必填，多选（多个值之间为 OR 关系）</p>
    */
    @SerializedName("RunUserUins")
    @Expose
    private String [] RunUserUins;

    /**
    * <p>标签名称ID，精确匹配，可通过标签相关接口获取。非必填，多选（多个值之间为 OR 关系）</p>
    */
    @SerializedName("LabelKeyIds")
    @Expose
    private String [] LabelKeyIds;

    /**
    * <p>标签值ID，精确匹配，可通过标签相关接口获取。非必填，多选（多个值之间为 OR 关系）</p>
    */
    @SerializedName("LabelValueIds")
    @Expose
    private String [] LabelValueIds;

    /**
    * <p>排序条件，多个之间按数组顺序表示优先级。非必填，默认按 CreateTime Desc。<br>可排序字段白名单：CreateTime、EndTime、RunCostTime</p>
    */
    @SerializedName("OrderBys")
    @Expose
    private OrderBy [] OrderBys;

    /**
     * Get <p>工作空间ID，可通过 ListWorkspaces 获取。必填</p> 
     * @return WorkspaceId <p>工作空间ID，可通过 ListWorkspaces 获取。必填</p>
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>工作空间ID，可通过 ListWorkspaces 获取。必填</p>
     * @param WorkspaceId <p>工作空间ID，可通过 ListWorkspaces 获取。必填</p>
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>分页页码，从 1 开始。非必填，默认 1</p> 
     * @return PageNumber <p>分页页码，从 1 开始。非必填，默认 1</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>分页页码，从 1 开始。非必填，默认 1</p>
     * @param PageNumber <p>分页页码，从 1 开始。非必填，默认 1</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>每页大小。非必填，默认 10，取值范围 [10, 200]</p> 
     * @return PageSize <p>每页大小。非必填，默认 10，取值范围 [10, 200]</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页大小。非必填，默认 10，取值范围 [10, 200]</p>
     * @param PageSize <p>每页大小。非必填，默认 10，取值范围 [10, 200]</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>工作流ID，精确匹配。非必填，单值</p> 
     * @return WorkflowId <p>工作流ID，精确匹配。非必填，单值</p>
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set <p>工作流ID，精确匹配。非必填，单值</p>
     * @param WorkflowId <p>工作流ID，精确匹配。非必填，单值</p>
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get <p>工作流名称关键字，对 WorkflowName 做模糊匹配。非必填，单值</p> 
     * @return WorkflowNameKeyword <p>工作流名称关键字，对 WorkflowName 做模糊匹配。非必填，单值</p>
     */
    public String getWorkflowNameKeyword() {
        return this.WorkflowNameKeyword;
    }

    /**
     * Set <p>工作流名称关键字，对 WorkflowName 做模糊匹配。非必填，单值</p>
     * @param WorkflowNameKeyword <p>工作流名称关键字，对 WorkflowName 做模糊匹配。非必填，单值</p>
     */
    public void setWorkflowNameKeyword(String WorkflowNameKeyword) {
        this.WorkflowNameKeyword = WorkflowNameKeyword;
    }

    /**
     * Get <p>运行创建时间下界，范围匹配（CreateTime &gt;= 本值），单位：毫秒时间戳。<br>非必填，单值，对应出参 WorkflowRun.CreateTime</p> 
     * @return CreateStartTime <p>运行创建时间下界，范围匹配（CreateTime &gt;= 本值），单位：毫秒时间戳。<br>非必填，单值，对应出参 WorkflowRun.CreateTime</p>
     */
    public String getCreateStartTime() {
        return this.CreateStartTime;
    }

    /**
     * Set <p>运行创建时间下界，范围匹配（CreateTime &gt;= 本值），单位：毫秒时间戳。<br>非必填，单值，对应出参 WorkflowRun.CreateTime</p>
     * @param CreateStartTime <p>运行创建时间下界，范围匹配（CreateTime &gt;= 本值），单位：毫秒时间戳。<br>非必填，单值，对应出参 WorkflowRun.CreateTime</p>
     */
    public void setCreateStartTime(String CreateStartTime) {
        this.CreateStartTime = CreateStartTime;
    }

    /**
     * Get <p>运行创建时间上界，范围匹配（CreateTime &lt;= 本值），单位：毫秒时间戳。<br>非必填，单值，对应出参 WorkflowRun.CreateTime</p> 
     * @return CreateEndTime <p>运行创建时间上界，范围匹配（CreateTime &lt;= 本值），单位：毫秒时间戳。<br>非必填，单值，对应出参 WorkflowRun.CreateTime</p>
     */
    public String getCreateEndTime() {
        return this.CreateEndTime;
    }

    /**
     * Set <p>运行创建时间上界，范围匹配（CreateTime &lt;= 本值），单位：毫秒时间戳。<br>非必填，单值，对应出参 WorkflowRun.CreateTime</p>
     * @param CreateEndTime <p>运行创建时间上界，范围匹配（CreateTime &lt;= 本值），单位：毫秒时间戳。<br>非必填，单值，对应出参 WorkflowRun.CreateTime</p>
     */
    public void setCreateEndTime(String CreateEndTime) {
        this.CreateEndTime = CreateEndTime;
    }

    /**
     * Get <p>运行状态，精确匹配。非必填，多选（多个值之间为 OR 关系）。</p><p>可填 SUCCESS / FAILED 等，具体参考本接口出参 WorkflowRun.RunState 字段返回值。</p> 
     * @return RunStates <p>运行状态，精确匹配。非必填，多选（多个值之间为 OR 关系）。</p><p>可填 SUCCESS / FAILED 等，具体参考本接口出参 WorkflowRun.RunState 字段返回值。</p>
     */
    public String [] getRunStates() {
        return this.RunStates;
    }

    /**
     * Set <p>运行状态，精确匹配。非必填，多选（多个值之间为 OR 关系）。</p><p>可填 SUCCESS / FAILED 等，具体参考本接口出参 WorkflowRun.RunState 字段返回值。</p>
     * @param RunStates <p>运行状态，精确匹配。非必填，多选（多个值之间为 OR 关系）。</p><p>可填 SUCCESS / FAILED 等，具体参考本接口出参 WorkflowRun.RunState 字段返回值。</p>
     */
    public void setRunStates(String [] RunStates) {
        this.RunStates = RunStates;
    }

    /**
     * Get <p>错误码，精确匹配。非必填，多选（多个值之间为 OR 关系）</p> 
     * @return ErrorCodeStrings <p>错误码，精确匹配。非必填，多选（多个值之间为 OR 关系）</p>
     */
    public String [] getErrorCodeStrings() {
        return this.ErrorCodeStrings;
    }

    /**
     * Set <p>错误码，精确匹配。非必填，多选（多个值之间为 OR 关系）</p>
     * @param ErrorCodeStrings <p>错误码，精确匹配。非必填，多选（多个值之间为 OR 关系）</p>
     */
    public void setErrorCodeStrings(String [] ErrorCodeStrings) {
        this.ErrorCodeStrings = ErrorCodeStrings;
    }

    /**
     * Get <p>运行人UIN，精确匹配。非必填，多选（多个值之间为 OR 关系）</p> 
     * @return RunUserUins <p>运行人UIN，精确匹配。非必填，多选（多个值之间为 OR 关系）</p>
     */
    public String [] getRunUserUins() {
        return this.RunUserUins;
    }

    /**
     * Set <p>运行人UIN，精确匹配。非必填，多选（多个值之间为 OR 关系）</p>
     * @param RunUserUins <p>运行人UIN，精确匹配。非必填，多选（多个值之间为 OR 关系）</p>
     */
    public void setRunUserUins(String [] RunUserUins) {
        this.RunUserUins = RunUserUins;
    }

    /**
     * Get <p>标签名称ID，精确匹配，可通过标签相关接口获取。非必填，多选（多个值之间为 OR 关系）</p> 
     * @return LabelKeyIds <p>标签名称ID，精确匹配，可通过标签相关接口获取。非必填，多选（多个值之间为 OR 关系）</p>
     */
    public String [] getLabelKeyIds() {
        return this.LabelKeyIds;
    }

    /**
     * Set <p>标签名称ID，精确匹配，可通过标签相关接口获取。非必填，多选（多个值之间为 OR 关系）</p>
     * @param LabelKeyIds <p>标签名称ID，精确匹配，可通过标签相关接口获取。非必填，多选（多个值之间为 OR 关系）</p>
     */
    public void setLabelKeyIds(String [] LabelKeyIds) {
        this.LabelKeyIds = LabelKeyIds;
    }

    /**
     * Get <p>标签值ID，精确匹配，可通过标签相关接口获取。非必填，多选（多个值之间为 OR 关系）</p> 
     * @return LabelValueIds <p>标签值ID，精确匹配，可通过标签相关接口获取。非必填，多选（多个值之间为 OR 关系）</p>
     */
    public String [] getLabelValueIds() {
        return this.LabelValueIds;
    }

    /**
     * Set <p>标签值ID，精确匹配，可通过标签相关接口获取。非必填，多选（多个值之间为 OR 关系）</p>
     * @param LabelValueIds <p>标签值ID，精确匹配，可通过标签相关接口获取。非必填，多选（多个值之间为 OR 关系）</p>
     */
    public void setLabelValueIds(String [] LabelValueIds) {
        this.LabelValueIds = LabelValueIds;
    }

    /**
     * Get <p>排序条件，多个之间按数组顺序表示优先级。非必填，默认按 CreateTime Desc。<br>可排序字段白名单：CreateTime、EndTime、RunCostTime</p> 
     * @return OrderBys <p>排序条件，多个之间按数组顺序表示优先级。非必填，默认按 CreateTime Desc。<br>可排序字段白名单：CreateTime、EndTime、RunCostTime</p>
     */
    public OrderBy [] getOrderBys() {
        return this.OrderBys;
    }

    /**
     * Set <p>排序条件，多个之间按数组顺序表示优先级。非必填，默认按 CreateTime Desc。<br>可排序字段白名单：CreateTime、EndTime、RunCostTime</p>
     * @param OrderBys <p>排序条件，多个之间按数组顺序表示优先级。非必填，默认按 CreateTime Desc。<br>可排序字段白名单：CreateTime、EndTime、RunCostTime</p>
     */
    public void setOrderBys(OrderBy [] OrderBys) {
        this.OrderBys = OrderBys;
    }

    public ListWorkflowRunsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListWorkflowRunsRequest(ListWorkflowRunsRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowNameKeyword != null) {
            this.WorkflowNameKeyword = new String(source.WorkflowNameKeyword);
        }
        if (source.CreateStartTime != null) {
            this.CreateStartTime = new String(source.CreateStartTime);
        }
        if (source.CreateEndTime != null) {
            this.CreateEndTime = new String(source.CreateEndTime);
        }
        if (source.RunStates != null) {
            this.RunStates = new String[source.RunStates.length];
            for (int i = 0; i < source.RunStates.length; i++) {
                this.RunStates[i] = new String(source.RunStates[i]);
            }
        }
        if (source.ErrorCodeStrings != null) {
            this.ErrorCodeStrings = new String[source.ErrorCodeStrings.length];
            for (int i = 0; i < source.ErrorCodeStrings.length; i++) {
                this.ErrorCodeStrings[i] = new String(source.ErrorCodeStrings[i]);
            }
        }
        if (source.RunUserUins != null) {
            this.RunUserUins = new String[source.RunUserUins.length];
            for (int i = 0; i < source.RunUserUins.length; i++) {
                this.RunUserUins[i] = new String(source.RunUserUins[i]);
            }
        }
        if (source.LabelKeyIds != null) {
            this.LabelKeyIds = new String[source.LabelKeyIds.length];
            for (int i = 0; i < source.LabelKeyIds.length; i++) {
                this.LabelKeyIds[i] = new String(source.LabelKeyIds[i]);
            }
        }
        if (source.LabelValueIds != null) {
            this.LabelValueIds = new String[source.LabelValueIds.length];
            for (int i = 0; i < source.LabelValueIds.length; i++) {
                this.LabelValueIds[i] = new String(source.LabelValueIds[i]);
            }
        }
        if (source.OrderBys != null) {
            this.OrderBys = new OrderBy[source.OrderBys.length];
            for (int i = 0; i < source.OrderBys.length; i++) {
                this.OrderBys[i] = new OrderBy(source.OrderBys[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowNameKeyword", this.WorkflowNameKeyword);
        this.setParamSimple(map, prefix + "CreateStartTime", this.CreateStartTime);
        this.setParamSimple(map, prefix + "CreateEndTime", this.CreateEndTime);
        this.setParamArraySimple(map, prefix + "RunStates.", this.RunStates);
        this.setParamArraySimple(map, prefix + "ErrorCodeStrings.", this.ErrorCodeStrings);
        this.setParamArraySimple(map, prefix + "RunUserUins.", this.RunUserUins);
        this.setParamArraySimple(map, prefix + "LabelKeyIds.", this.LabelKeyIds);
        this.setParamArraySimple(map, prefix + "LabelValueIds.", this.LabelValueIds);
        this.setParamArrayObj(map, prefix + "OrderBys.", this.OrderBys);

    }
}

