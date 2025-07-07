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
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 触发运行名称
    */
    @SerializedName("TriggerName")
    @Expose
    private String TriggerName;

    /**
    * 工作流过滤关键字，工作流名称 or 工作流ID
    */
    @SerializedName("WorkflowKeyword")
    @Expose
    private String WorkflowKeyword;

    /**
    * 触发运行提交人过滤，多个提交人用英文逗号分割
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * 触发提交创建时间过滤，起始时间
    */
    @SerializedName("TriggerStartTime")
    @Expose
    private String TriggerStartTime;

    /**
    * 触发提交创建时间过滤，结束时间
    */
    @SerializedName("TriggerEndTime")
    @Expose
    private String TriggerEndTime;

    /**
    * 页码，整型
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页数目，整型
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

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
     * Get 触发运行名称 
     * @return TriggerName 触发运行名称
     */
    public String getTriggerName() {
        return this.TriggerName;
    }

    /**
     * Set 触发运行名称
     * @param TriggerName 触发运行名称
     */
    public void setTriggerName(String TriggerName) {
        this.TriggerName = TriggerName;
    }

    /**
     * Get 工作流过滤关键字，工作流名称 or 工作流ID 
     * @return WorkflowKeyword 工作流过滤关键字，工作流名称 or 工作流ID
     */
    public String getWorkflowKeyword() {
        return this.WorkflowKeyword;
    }

    /**
     * Set 工作流过滤关键字，工作流名称 or 工作流ID
     * @param WorkflowKeyword 工作流过滤关键字，工作流名称 or 工作流ID
     */
    public void setWorkflowKeyword(String WorkflowKeyword) {
        this.WorkflowKeyword = WorkflowKeyword;
    }

    /**
     * Get 触发运行提交人过滤，多个提交人用英文逗号分割 
     * @return Creator 触发运行提交人过滤，多个提交人用英文逗号分割
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 触发运行提交人过滤，多个提交人用英文逗号分割
     * @param Creator 触发运行提交人过滤，多个提交人用英文逗号分割
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get 触发提交创建时间过滤，起始时间 
     * @return TriggerStartTime 触发提交创建时间过滤，起始时间
     */
    public String getTriggerStartTime() {
        return this.TriggerStartTime;
    }

    /**
     * Set 触发提交创建时间过滤，起始时间
     * @param TriggerStartTime 触发提交创建时间过滤，起始时间
     */
    public void setTriggerStartTime(String TriggerStartTime) {
        this.TriggerStartTime = TriggerStartTime;
    }

    /**
     * Get 触发提交创建时间过滤，结束时间 
     * @return TriggerEndTime 触发提交创建时间过滤，结束时间
     */
    public String getTriggerEndTime() {
        return this.TriggerEndTime;
    }

    /**
     * Set 触发提交创建时间过滤，结束时间
     * @param TriggerEndTime 触发提交创建时间过滤，结束时间
     */
    public void setTriggerEndTime(String TriggerEndTime) {
        this.TriggerEndTime = TriggerEndTime;
    }

    /**
     * Get 页码，整型 
     * @return PageNumber 页码，整型
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码，整型
     * @param PageNumber 页码，整型
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页数目，整型 
     * @return PageSize 每页数目，整型
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页数目，整型
     * @param PageSize 每页数目，整型
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
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

    }
}

