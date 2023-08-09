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

public class DescribeSchedulerTaskCntByStatusRequest extends AbstractModel{

    /**
    * 1
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * Y
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * 111
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 1
    */
    @SerializedName("InCharge")
    @Expose
    private String InCharge;

    /**
     * Get 1 
     * @return TaskType 1
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 1
     * @param TaskType 1
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Y 
     * @return TypeName Y
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * Set Y
     * @param TypeName Y
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    /**
     * Get 111 
     * @return ProjectId 111
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 111
     * @param ProjectId 111
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 1 
     * @return InCharge 1
     */
    public String getInCharge() {
        return this.InCharge;
    }

    /**
     * Set 1
     * @param InCharge 1
     */
    public void setInCharge(String InCharge) {
        this.InCharge = InCharge;
    }

    public DescribeSchedulerTaskCntByStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSchedulerTaskCntByStatusRequest(DescribeSchedulerTaskCntByStatusRequest source) {
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.TypeName != null) {
            this.TypeName = new String(source.TypeName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.InCharge != null) {
            this.InCharge = new String(source.InCharge);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "TypeName", this.TypeName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "InCharge", this.InCharge);

    }
}

