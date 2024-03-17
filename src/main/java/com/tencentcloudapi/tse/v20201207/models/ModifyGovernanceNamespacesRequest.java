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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyGovernanceNamespacesRequest extends AbstractModel {

    /**
    * tse实例id。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 命名空间信息。
    */
    @SerializedName("GovernanceNamespaces")
    @Expose
    private GovernanceNamespaceInput [] GovernanceNamespaces;

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
     * Get 命名空间信息。 
     * @return GovernanceNamespaces 命名空间信息。
     */
    public GovernanceNamespaceInput [] getGovernanceNamespaces() {
        return this.GovernanceNamespaces;
    }

    /**
     * Set 命名空间信息。
     * @param GovernanceNamespaces 命名空间信息。
     */
    public void setGovernanceNamespaces(GovernanceNamespaceInput [] GovernanceNamespaces) {
        this.GovernanceNamespaces = GovernanceNamespaces;
    }

    public ModifyGovernanceNamespacesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyGovernanceNamespacesRequest(ModifyGovernanceNamespacesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.GovernanceNamespaces != null) {
            this.GovernanceNamespaces = new GovernanceNamespaceInput[source.GovernanceNamespaces.length];
            for (int i = 0; i < source.GovernanceNamespaces.length; i++) {
                this.GovernanceNamespaces[i] = new GovernanceNamespaceInput(source.GovernanceNamespaces[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "GovernanceNamespaces.", this.GovernanceNamespaces);

    }
}

