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

public class DescribeOperateOpsTaskDatasourceRequest extends AbstractModel{

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 任务类型ID
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * 数据源来源/去向
    */
    @SerializedName("ServiceKind")
    @Expose
    private String ServiceKind;

    /**
    * 数据源类型
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

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
     * Get 任务类型ID 
     * @return TaskType 任务类型ID
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型ID
     * @param TaskType 任务类型ID
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 数据源来源/去向 
     * @return ServiceKind 数据源来源/去向
     */
    public String getServiceKind() {
        return this.ServiceKind;
    }

    /**
     * Set 数据源来源/去向
     * @param ServiceKind 数据源来源/去向
     */
    public void setServiceKind(String ServiceKind) {
        this.ServiceKind = ServiceKind;
    }

    /**
     * Get 数据源类型 
     * @return ServiceType 数据源类型
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 数据源类型
     * @param ServiceType 数据源类型
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    public DescribeOperateOpsTaskDatasourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOperateOpsTaskDatasourceRequest(DescribeOperateOpsTaskDatasourceRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.ServiceKind != null) {
            this.ServiceKind = new String(source.ServiceKind);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "ServiceKind", this.ServiceKind);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);

    }
}

