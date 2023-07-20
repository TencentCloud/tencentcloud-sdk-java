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

public class BatchRunOpsTaskRequest extends AbstractModel{

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 是否补录中间实例,0不补录;1补录
    */
    @SerializedName("EnableMakeUp")
    @Expose
    private Long EnableMakeUp;

    /**
    * 任务id列表
    */
    @SerializedName("Tasks")
    @Expose
    private String [] Tasks;

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
     * Get 是否补录中间实例,0不补录;1补录 
     * @return EnableMakeUp 是否补录中间实例,0不补录;1补录
     */
    public Long getEnableMakeUp() {
        return this.EnableMakeUp;
    }

    /**
     * Set 是否补录中间实例,0不补录;1补录
     * @param EnableMakeUp 是否补录中间实例,0不补录;1补录
     */
    public void setEnableMakeUp(Long EnableMakeUp) {
        this.EnableMakeUp = EnableMakeUp;
    }

    /**
     * Get 任务id列表 
     * @return Tasks 任务id列表
     */
    public String [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set 任务id列表
     * @param Tasks 任务id列表
     */
    public void setTasks(String [] Tasks) {
        this.Tasks = Tasks;
    }

    public BatchRunOpsTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchRunOpsTaskRequest(BatchRunOpsTaskRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.EnableMakeUp != null) {
            this.EnableMakeUp = new Long(source.EnableMakeUp);
        }
        if (source.Tasks != null) {
            this.Tasks = new String[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new String(source.Tasks[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "EnableMakeUp", this.EnableMakeUp);
        this.setParamArraySimple(map, prefix + "Tasks.", this.Tasks);

    }
}

