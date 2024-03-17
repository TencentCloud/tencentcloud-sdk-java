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

public class DeleteGovernanceAliasesRequest extends AbstractModel {

    /**
    * tse实例id。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 服务别名列表
    */
    @SerializedName("GovernanceAliases")
    @Expose
    private GovernanceAlias [] GovernanceAliases;

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
     * Get 服务别名列表 
     * @return GovernanceAliases 服务别名列表
     */
    public GovernanceAlias [] getGovernanceAliases() {
        return this.GovernanceAliases;
    }

    /**
     * Set 服务别名列表
     * @param GovernanceAliases 服务别名列表
     */
    public void setGovernanceAliases(GovernanceAlias [] GovernanceAliases) {
        this.GovernanceAliases = GovernanceAliases;
    }

    public DeleteGovernanceAliasesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteGovernanceAliasesRequest(DeleteGovernanceAliasesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.GovernanceAliases != null) {
            this.GovernanceAliases = new GovernanceAlias[source.GovernanceAliases.length];
            for (int i = 0; i < source.GovernanceAliases.length; i++) {
                this.GovernanceAliases[i] = new GovernanceAlias(source.GovernanceAliases[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "GovernanceAliases.", this.GovernanceAliases);

    }
}

