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

public class DescribeDrSonInstanceRequest extends AbstractModel{

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 任务来源 ADHOC || WORKFLOW
    */
    @SerializedName("TaskSource")
    @Expose
    private String TaskSource;

    /**
    * 试运行记录id
    */
    @SerializedName("RecordId")
    @Expose
    private Long RecordId;

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
     * Get 任务来源 ADHOC || WORKFLOW 
     * @return TaskSource 任务来源 ADHOC || WORKFLOW
     */
    public String getTaskSource() {
        return this.TaskSource;
    }

    /**
     * Set 任务来源 ADHOC || WORKFLOW
     * @param TaskSource 任务来源 ADHOC || WORKFLOW
     */
    public void setTaskSource(String TaskSource) {
        this.TaskSource = TaskSource;
    }

    /**
     * Get 试运行记录id 
     * @return RecordId 试运行记录id
     */
    public Long getRecordId() {
        return this.RecordId;
    }

    /**
     * Set 试运行记录id
     * @param RecordId 试运行记录id
     */
    public void setRecordId(Long RecordId) {
        this.RecordId = RecordId;
    }

    public DescribeDrSonInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDrSonInstanceRequest(DescribeDrSonInstanceRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskSource != null) {
            this.TaskSource = new String(source.TaskSource);
        }
        if (source.RecordId != null) {
            this.RecordId = new Long(source.RecordId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskSource", this.TaskSource);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);

    }
}

