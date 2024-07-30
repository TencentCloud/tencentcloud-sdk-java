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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateWorkloadGroupRequest extends AbstractModel {

    /**
    * 集群id	
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 资源组配置
    */
    @SerializedName("WorkloadGroup")
    @Expose
    private WorkloadGroupConfig WorkloadGroup;

    /**
     * Get 集群id	 
     * @return InstanceId 集群id	
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群id	
     * @param InstanceId 集群id	
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 资源组配置 
     * @return WorkloadGroup 资源组配置
     */
    public WorkloadGroupConfig getWorkloadGroup() {
        return this.WorkloadGroup;
    }

    /**
     * Set 资源组配置
     * @param WorkloadGroup 资源组配置
     */
    public void setWorkloadGroup(WorkloadGroupConfig WorkloadGroup) {
        this.WorkloadGroup = WorkloadGroup;
    }

    public CreateWorkloadGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateWorkloadGroupRequest(CreateWorkloadGroupRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.WorkloadGroup != null) {
            this.WorkloadGroup = new WorkloadGroupConfig(source.WorkloadGroup);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamObj(map, prefix + "WorkloadGroup.", this.WorkloadGroup);

    }
}

