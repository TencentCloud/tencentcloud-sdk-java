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

public class ModifyGovernanceInstancesRequest extends AbstractModel {

    /**
    * <p>tse实例id。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>服务实例信息。</p>
    */
    @SerializedName("GovernanceInstances")
    @Expose
    private GovernanceInstanceUpdate [] GovernanceInstances;

    /**
     * Get <p>tse实例id。</p> 
     * @return InstanceId <p>tse实例id。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>tse实例id。</p>
     * @param InstanceId <p>tse实例id。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>服务实例信息。</p> 
     * @return GovernanceInstances <p>服务实例信息。</p>
     */
    public GovernanceInstanceUpdate [] getGovernanceInstances() {
        return this.GovernanceInstances;
    }

    /**
     * Set <p>服务实例信息。</p>
     * @param GovernanceInstances <p>服务实例信息。</p>
     */
    public void setGovernanceInstances(GovernanceInstanceUpdate [] GovernanceInstances) {
        this.GovernanceInstances = GovernanceInstances;
    }

    public ModifyGovernanceInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyGovernanceInstancesRequest(ModifyGovernanceInstancesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.GovernanceInstances != null) {
            this.GovernanceInstances = new GovernanceInstanceUpdate[source.GovernanceInstances.length];
            for (int i = 0; i < source.GovernanceInstances.length; i++) {
                this.GovernanceInstances[i] = new GovernanceInstanceUpdate(source.GovernanceInstances[i]);
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

