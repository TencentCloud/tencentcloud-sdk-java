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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListAIWorkbenchExecutionsRequest extends AbstractModel {

    /**
    * <p>每页数量</p>
    */
    @SerializedName("PerPage")
    @Expose
    private Long PerPage;

    /**
    * <p>页码</p>
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * <p>按 Agent 筛选</p>
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * <p>按状态筛选</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>执行 ID 列表筛选</p>
    */
    @SerializedName("ExecutionIds")
    @Expose
    private String [] ExecutionIds;

    /**
    * <p>任务id</p>
    */
    @SerializedName("TaskIds")
    @Expose
    private String [] TaskIds;

    /**
    * <p>触发方式</p>
    */
    @SerializedName("TriggerType")
    @Expose
    private String TriggerType;

    /**
    * <p>关键值</p>
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * <p>是否启用</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
     * Get <p>每页数量</p> 
     * @return PerPage <p>每页数量</p>
     */
    public Long getPerPage() {
        return this.PerPage;
    }

    /**
     * Set <p>每页数量</p>
     * @param PerPage <p>每页数量</p>
     */
    public void setPerPage(Long PerPage) {
        this.PerPage = PerPage;
    }

    /**
     * Get <p>页码</p> 
     * @return PageNo <p>页码</p>
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set <p>页码</p>
     * @param PageNo <p>页码</p>
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get <p>按 Agent 筛选</p> 
     * @return AgentId <p>按 Agent 筛选</p>
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set <p>按 Agent 筛选</p>
     * @param AgentId <p>按 Agent 筛选</p>
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get <p>按状态筛选</p> 
     * @return Status <p>按状态筛选</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>按状态筛选</p>
     * @param Status <p>按状态筛选</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>执行 ID 列表筛选</p> 
     * @return ExecutionIds <p>执行 ID 列表筛选</p>
     */
    public String [] getExecutionIds() {
        return this.ExecutionIds;
    }

    /**
     * Set <p>执行 ID 列表筛选</p>
     * @param ExecutionIds <p>执行 ID 列表筛选</p>
     */
    public void setExecutionIds(String [] ExecutionIds) {
        this.ExecutionIds = ExecutionIds;
    }

    /**
     * Get <p>任务id</p> 
     * @return TaskIds <p>任务id</p>
     */
    public String [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set <p>任务id</p>
     * @param TaskIds <p>任务id</p>
     */
    public void setTaskIds(String [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    /**
     * Get <p>触发方式</p> 
     * @return TriggerType <p>触发方式</p>
     */
    public String getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set <p>触发方式</p>
     * @param TriggerType <p>触发方式</p>
     */
    public void setTriggerType(String TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get <p>关键值</p> 
     * @return Keyword <p>关键值</p>
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set <p>关键值</p>
     * @param Keyword <p>关键值</p>
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get <p>是否启用</p> 
     * @return Enabled <p>是否启用</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>是否启用</p>
     * @param Enabled <p>是否启用</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    public ListAIWorkbenchExecutionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListAIWorkbenchExecutionsRequest(ListAIWorkbenchExecutionsRequest source) {
        if (source.PerPage != null) {
            this.PerPage = new Long(source.PerPage);
        }
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ExecutionIds != null) {
            this.ExecutionIds = new String[source.ExecutionIds.length];
            for (int i = 0; i < source.ExecutionIds.length; i++) {
                this.ExecutionIds[i] = new String(source.ExecutionIds[i]);
            }
        }
        if (source.TaskIds != null) {
            this.TaskIds = new String[source.TaskIds.length];
            for (int i = 0; i < source.TaskIds.length; i++) {
                this.TaskIds[i] = new String(source.TaskIds[i]);
            }
        }
        if (source.TriggerType != null) {
            this.TriggerType = new String(source.TriggerType);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PerPage", this.PerPage);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "ExecutionIds.", this.ExecutionIds);
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}

