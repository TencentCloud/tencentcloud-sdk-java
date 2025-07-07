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

public class ModifyGovernanceServicesRequest extends AbstractModel {

    /**
    * tse 实例 id。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 服务信息。
    */
    @SerializedName("GovernanceServices")
    @Expose
    private GovernanceServiceInput [] GovernanceServices;

    /**
     * Get tse 实例 id。 
     * @return InstanceId tse 实例 id。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set tse 实例 id。
     * @param InstanceId tse 实例 id。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 服务信息。 
     * @return GovernanceServices 服务信息。
     */
    public GovernanceServiceInput [] getGovernanceServices() {
        return this.GovernanceServices;
    }

    /**
     * Set 服务信息。
     * @param GovernanceServices 服务信息。
     */
    public void setGovernanceServices(GovernanceServiceInput [] GovernanceServices) {
        this.GovernanceServices = GovernanceServices;
    }

    public ModifyGovernanceServicesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyGovernanceServicesRequest(ModifyGovernanceServicesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.GovernanceServices != null) {
            this.GovernanceServices = new GovernanceServiceInput[source.GovernanceServices.length];
            for (int i = 0; i < source.GovernanceServices.length; i++) {
                this.GovernanceServices[i] = new GovernanceServiceInput(source.GovernanceServices[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "GovernanceServices.", this.GovernanceServices);

    }
}

