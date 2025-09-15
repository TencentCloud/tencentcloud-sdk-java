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
package com.tencentcloudapi.tdai.v20250717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContinueAgentWorkRequest extends AbstractModel {

    /**
    * 实例ID，为空时查询所有，如果填写则会根据InstanceId筛选
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Agent任务类型
    */
    @SerializedName("AgentTaskType")
    @Expose
    private String AgentTaskType;

    /**
     * Get 实例ID，为空时查询所有，如果填写则会根据InstanceId筛选 
     * @return InstanceId 实例ID，为空时查询所有，如果填写则会根据InstanceId筛选
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID，为空时查询所有，如果填写则会根据InstanceId筛选
     * @param InstanceId 实例ID，为空时查询所有，如果填写则会根据InstanceId筛选
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Agent任务类型 
     * @return AgentTaskType Agent任务类型
     */
    public String getAgentTaskType() {
        return this.AgentTaskType;
    }

    /**
     * Set Agent任务类型
     * @param AgentTaskType Agent任务类型
     */
    public void setAgentTaskType(String AgentTaskType) {
        this.AgentTaskType = AgentTaskType;
    }

    public ContinueAgentWorkRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContinueAgentWorkRequest(ContinueAgentWorkRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AgentTaskType != null) {
            this.AgentTaskType = new String(source.AgentTaskType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AgentTaskType", this.AgentTaskType);

    }
}

