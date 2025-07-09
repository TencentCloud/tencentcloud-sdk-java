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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BotManagement extends AbstractModel {

    /**
    * 客户端认证规则的定义列表。该功能内测中，如需使用，请提工单或联系智能客服。
    */
    @SerializedName("ClientAttestationRules")
    @Expose
    private ClientAttestationRules ClientAttestationRules;

    /**
     * Get 客户端认证规则的定义列表。该功能内测中，如需使用，请提工单或联系智能客服。 
     * @return ClientAttestationRules 客户端认证规则的定义列表。该功能内测中，如需使用，请提工单或联系智能客服。
     */
    public ClientAttestationRules getClientAttestationRules() {
        return this.ClientAttestationRules;
    }

    /**
     * Set 客户端认证规则的定义列表。该功能内测中，如需使用，请提工单或联系智能客服。
     * @param ClientAttestationRules 客户端认证规则的定义列表。该功能内测中，如需使用，请提工单或联系智能客服。
     */
    public void setClientAttestationRules(ClientAttestationRules ClientAttestationRules) {
        this.ClientAttestationRules = ClientAttestationRules;
    }

    public BotManagement() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotManagement(BotManagement source) {
        if (source.ClientAttestationRules != null) {
            this.ClientAttestationRules = new ClientAttestationRules(source.ClientAttestationRules);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ClientAttestationRules.", this.ClientAttestationRules);

    }
}

