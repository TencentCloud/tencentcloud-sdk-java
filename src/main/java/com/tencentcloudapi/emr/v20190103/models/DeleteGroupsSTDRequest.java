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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteGroupsSTDRequest extends AbstractModel {

    /**
    * <p>集群名称</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>用户组名称数组</p>
    */
    @SerializedName("GroupNames")
    @Expose
    private String [] GroupNames;

    /**
     * Get <p>集群名称</p> 
     * @return InstanceId <p>集群名称</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>集群名称</p>
     * @param InstanceId <p>集群名称</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>用户组名称数组</p> 
     * @return GroupNames <p>用户组名称数组</p>
     */
    public String [] getGroupNames() {
        return this.GroupNames;
    }

    /**
     * Set <p>用户组名称数组</p>
     * @param GroupNames <p>用户组名称数组</p>
     */
    public void setGroupNames(String [] GroupNames) {
        this.GroupNames = GroupNames;
    }

    public DeleteGroupsSTDRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteGroupsSTDRequest(DeleteGroupsSTDRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.GroupNames != null) {
            this.GroupNames = new String[source.GroupNames.length];
            for (int i = 0; i < source.GroupNames.length; i++) {
                this.GroupNames[i] = new String(source.GroupNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "GroupNames.", this.GroupNames);

    }
}

