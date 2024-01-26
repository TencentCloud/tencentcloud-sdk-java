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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetTestRunTaskInstancesStatusInfoRequest extends AbstractModel {

    /**
    * 任务列表
    */
    @SerializedName("Tasks")
    @Expose
    private ParamGetTestRunTaskInstancesStatusInfoTask [] Tasks;

    /**
    * 是否开发空间
    */
    @SerializedName("IsDevSpace")
    @Expose
    private Boolean IsDevSpace;

    /**
     * Get 任务列表 
     * @return Tasks 任务列表
     */
    public ParamGetTestRunTaskInstancesStatusInfoTask [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set 任务列表
     * @param Tasks 任务列表
     */
    public void setTasks(ParamGetTestRunTaskInstancesStatusInfoTask [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get 是否开发空间 
     * @return IsDevSpace 是否开发空间
     */
    public Boolean getIsDevSpace() {
        return this.IsDevSpace;
    }

    /**
     * Set 是否开发空间
     * @param IsDevSpace 是否开发空间
     */
    public void setIsDevSpace(Boolean IsDevSpace) {
        this.IsDevSpace = IsDevSpace;
    }

    public GetTestRunTaskInstancesStatusInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetTestRunTaskInstancesStatusInfoRequest(GetTestRunTaskInstancesStatusInfoRequest source) {
        if (source.Tasks != null) {
            this.Tasks = new ParamGetTestRunTaskInstancesStatusInfoTask[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new ParamGetTestRunTaskInstancesStatusInfoTask(source.Tasks[i]);
            }
        }
        if (source.IsDevSpace != null) {
            this.IsDevSpace = new Boolean(source.IsDevSpace);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "IsDevSpace", this.IsDevSpace);

    }
}

