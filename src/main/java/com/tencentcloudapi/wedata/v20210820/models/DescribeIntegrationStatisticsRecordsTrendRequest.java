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

public class DescribeIntegrationStatisticsRecordsTrendRequest extends AbstractModel{

    /**
    * 任务类型（实时：201，离线：202）
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 查询日期
    */
    @SerializedName("QueryDate")
    @Expose
    private String QueryDate;

    /**
     * Get 任务类型（实时：201，离线：202） 
     * @return TaskType 任务类型（实时：201，离线：202）
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型（实时：201，离线：202）
     * @param TaskType 任务类型（实时：201，离线：202）
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

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
     * Get 查询日期 
     * @return QueryDate 查询日期
     */
    public String getQueryDate() {
        return this.QueryDate;
    }

    /**
     * Set 查询日期
     * @param QueryDate 查询日期
     */
    public void setQueryDate(String QueryDate) {
        this.QueryDate = QueryDate;
    }

    public DescribeIntegrationStatisticsRecordsTrendRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIntegrationStatisticsRecordsTrendRequest(DescribeIntegrationStatisticsRecordsTrendRequest source) {
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.QueryDate != null) {
            this.QueryDate = new String(source.QueryDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "QueryDate", this.QueryDate);

    }
}

