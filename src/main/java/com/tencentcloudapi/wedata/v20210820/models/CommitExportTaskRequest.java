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

public class CommitExportTaskRequest extends AbstractModel{

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 规则执行Id
    */
    @SerializedName("RuleExecId")
    @Expose
    private Long RuleExecId;

    /**
    * 导出类型(1.全部,2.触发行,3.通过行)
    */
    @SerializedName("ExportType")
    @Expose
    private Long ExportType;

    /**
    * 执行资源组id
    */
    @SerializedName("ExecutorGroupId")
    @Expose
    private String ExecutorGroupId;

    /**
    * 计算资源队列
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 规则执行Id 
     * @return RuleExecId 规则执行Id
     */
    public Long getRuleExecId() {
        return this.RuleExecId;
    }

    /**
     * Set 规则执行Id
     * @param RuleExecId 规则执行Id
     */
    public void setRuleExecId(Long RuleExecId) {
        this.RuleExecId = RuleExecId;
    }

    /**
     * Get 导出类型(1.全部,2.触发行,3.通过行) 
     * @return ExportType 导出类型(1.全部,2.触发行,3.通过行)
     */
    public Long getExportType() {
        return this.ExportType;
    }

    /**
     * Set 导出类型(1.全部,2.触发行,3.通过行)
     * @param ExportType 导出类型(1.全部,2.触发行,3.通过行)
     */
    public void setExportType(Long ExportType) {
        this.ExportType = ExportType;
    }

    /**
     * Get 执行资源组id 
     * @return ExecutorGroupId 执行资源组id
     */
    public String getExecutorGroupId() {
        return this.ExecutorGroupId;
    }

    /**
     * Set 执行资源组id
     * @param ExecutorGroupId 执行资源组id
     */
    public void setExecutorGroupId(String ExecutorGroupId) {
        this.ExecutorGroupId = ExecutorGroupId;
    }

    /**
     * Get 计算资源队列 
     * @return QueueName 计算资源队列
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set 计算资源队列
     * @param QueueName 计算资源队列
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    public CommitExportTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CommitExportTaskRequest(CommitExportTaskRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.RuleExecId != null) {
            this.RuleExecId = new Long(source.RuleExecId);
        }
        if (source.ExportType != null) {
            this.ExportType = new Long(source.ExportType);
        }
        if (source.ExecutorGroupId != null) {
            this.ExecutorGroupId = new String(source.ExecutorGroupId);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "RuleExecId", this.RuleExecId);
        this.setParamSimple(map, prefix + "ExportType", this.ExportType);
        this.setParamSimple(map, prefix + "ExecutorGroupId", this.ExecutorGroupId);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);

    }
}

