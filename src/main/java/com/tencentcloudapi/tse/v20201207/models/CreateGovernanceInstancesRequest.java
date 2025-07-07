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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateGovernanceInstancesRequest extends AbstractModel {

    /**
    * tse实例id。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 服务实例信息。
    */
    @SerializedName("GovernanceInstances")
    @Expose
    private GovernanceInstanceInput [] GovernanceInstances;

    /**
     * Get tse实例id。 
     * @return InstanceId tse实例id。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set tse实例id。
     * @param InstanceId tse实例id。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 服务实例信息。 
     * @return GovernanceInstances 服务实例信息。
     */
    public GovernanceInstanceInput [] getGovernanceInstances() {
        return this.GovernanceInstances;
    }

    /**
     * Set 服务实例信息。
     * @param GovernanceInstances 服务实例信息。
     */
    public void setGovernanceInstances(GovernanceInstanceInput [] GovernanceInstances) {
        this.GovernanceInstances = GovernanceInstances;
    }

    public CreateGovernanceInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateGovernanceInstancesRequest(CreateGovernanceInstancesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.GovernanceInstances != null) {
            this.GovernanceInstances = new GovernanceInstanceInput[source.GovernanceInstances.length];
            for (int i = 0; i < source.GovernanceInstances.length; i++) {
                this.GovernanceInstances[i] = new GovernanceInstanceInput(source.GovernanceInstances[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "GovernanceInstances.", this.GovernanceInstances);

    }
}

