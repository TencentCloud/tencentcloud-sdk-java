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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KillTaskInstancesAsyncRequest extends AbstractModel {

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 实例id列表,可以从ListInstances中获取
    */
    @SerializedName("InstanceKeyList")
    @Expose
    private String [] InstanceKeyList;

    /**
     * Get 项目Id 
     * @return ProjectId 项目Id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目Id
     * @param ProjectId 项目Id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 实例id列表,可以从ListInstances中获取 
     * @return InstanceKeyList 实例id列表,可以从ListInstances中获取
     */
    public String [] getInstanceKeyList() {
        return this.InstanceKeyList;
    }

    /**
     * Set 实例id列表,可以从ListInstances中获取
     * @param InstanceKeyList 实例id列表,可以从ListInstances中获取
     */
    public void setInstanceKeyList(String [] InstanceKeyList) {
        this.InstanceKeyList = InstanceKeyList;
    }

    public KillTaskInstancesAsyncRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KillTaskInstancesAsyncRequest(KillTaskInstancesAsyncRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.InstanceKeyList != null) {
            this.InstanceKeyList = new String[source.InstanceKeyList.length];
            for (int i = 0; i < source.InstanceKeyList.length; i++) {
                this.InstanceKeyList[i] = new String(source.InstanceKeyList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "InstanceKeyList.", this.InstanceKeyList);

    }
}

