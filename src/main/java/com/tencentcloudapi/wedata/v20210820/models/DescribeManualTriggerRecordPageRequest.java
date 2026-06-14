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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeManualTriggerRecordPageRequest extends AbstractModel {

    /**
    * <p>项目ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>触发运行名称</p>
    */
    @SerializedName("TriggerName")
    @Expose
    private String TriggerName;

    /**
    * <p>工作流过滤关键字，工作流名称 or 工作流ID</p>
    */
    @SerializedName("WorkflowKeyword")
    @Expose
    private String WorkflowKeyword;

    /**
    * <p>触发运行提交人过滤，多个提交人用英文逗号分割</p>
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * <p>触发提交创建时间过滤，起始时间</p>
    */
    @SerializedName("TriggerStartTime")
    @Expose
    private String TriggerStartTime;

    /**
    * <p>触发提交创建时间过滤，结束时间</p>
    */
    @SerializedName("TriggerEndTime")
    @Expose
    private String TriggerEndTime;

    /**
    * <p>页码，整型</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>每页数目，整型</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>触发ID</p>
    */
    @SerializedName("TriggerId")
    @Expose
    private String TriggerId;

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
     * Get <p>触发运行名称</p> 
     * @return TriggerName <p>触发运行名称</p>
     */
    public String getTriggerName() {
        return this.TriggerName;
    }

    /**
     * Set <p>触发运行名称</p>
     * @param TriggerName <p>触发运行名称</p>
     */
    public void setTriggerName(String TriggerName) {
        this.TriggerName = TriggerName;
    }

    /**
     * Get <p>工作流过滤关键字，工作流名称 or 工作流ID</p> 
     * @return WorkflowKeyword <p>工作流过滤关键字，工作流名称 or 工作流ID</p>
     */
    public String getWorkflowKeyword() {
        return this.WorkflowKeyword;
    }

    /**
     * Set <p>工作流过滤关键字，工作流名称 or 工作流ID</p>
     * @param WorkflowKeyword <p>工作流过滤关键字，工作流名称 or 工作流ID</p>
     */
    public void setWorkflowKeyword(String WorkflowKeyword) {
        this.WorkflowKeyword = WorkflowKeyword;
    }

    /**
     * Get <p>触发运行提交人过滤，多个提交人用英文逗号分割</p> 
     * @return Creator <p>触发运行提交人过滤，多个提交人用英文逗号分割</p>
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set <p>触发运行提交人过滤，多个提交人用英文逗号分割</p>
     * @param Creator <p>触发运行提交人过滤，多个提交人用英文逗号分割</p>
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get <p>触发提交创建时间过滤，起始时间</p> 
     * @return TriggerStartTime <p>触发提交创建时间过滤，起始时间</p>
     */
    public String getTriggerStartTime() {
        return this.TriggerStartTime;
    }

    /**
     * Set <p>触发提交创建时间过滤，起始时间</p>
     * @param TriggerStartTime <p>触发提交创建时间过滤，起始时间</p>
     */
    public void setTriggerStartTime(String TriggerStartTime) {
        this.TriggerStartTime = TriggerStartTime;
    }

    /**
     * Get <p>触发提交创建时间过滤，结束时间</p> 
     * @return TriggerEndTime <p>触发提交创建时间过滤，结束时间</p>
     */
    public String getTriggerEndTime() {
        return this.TriggerEndTime;
    }

    /**
     * Set <p>触发提交创建时间过滤，结束时间</p>
     * @param TriggerEndTime <p>触发提交创建时间过滤，结束时间</p>
     */
    public void setTriggerEndTime(String TriggerEndTime) {
        this.TriggerEndTime = TriggerEndTime;
    }

    /**
     * Get <p>页码，整型</p> 
     * @return PageNumber <p>页码，整型</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>页码，整型</p>
     * @param PageNumber <p>页码，整型</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>每页数目，整型</p> 
     * @return PageSize <p>每页数目，整型</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页数目，整型</p>
     * @param PageSize <p>每页数目，整型</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>触发ID</p> 
     * @return TriggerId <p>触发ID</p>
     */
    public String getTriggerId() {
        return this.TriggerId;
    }

    /**
     * Set <p>触发ID</p>
     * @param TriggerId <p>触发ID</p>
     */
    public void setTriggerId(String TriggerId) {
        this.TriggerId = TriggerId;
    }

    public DescribeManualTriggerRecordPageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeManualTriggerRecordPageRequest(DescribeManualTriggerRecordPageRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TriggerName != null) {
            this.TriggerName = new String(source.TriggerName);
        }
        if (source.WorkflowKeyword != null) {
            this.WorkflowKeyword = new String(source.WorkflowKeyword);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.TriggerStartTime != null) {
            this.TriggerStartTime = new String(source.TriggerStartTime);
        }
        if (source.TriggerEndTime != null) {
            this.TriggerEndTime = new String(source.TriggerEndTime);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.TriggerId != null) {
            this.TriggerId = new String(source.TriggerId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TriggerName", this.TriggerName);
        this.setParamSimple(map, prefix + "WorkflowKeyword", this.WorkflowKeyword);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "TriggerStartTime", this.TriggerStartTime);
        this.setParamSimple(map, prefix + "TriggerEndTime", this.TriggerEndTime);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "TriggerId", this.TriggerId);

    }
}

