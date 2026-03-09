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
package com.tencentcloudapi.cetcd.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EtcdSecuritySettings extends AbstractModel {

    /**
    * 是否启用https
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Https")
    @Expose
    private Boolean Https;

    /**
    * 启用客户端证书认证
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientCertAuth")
    @Expose
    private Boolean ClientCertAuth;

    /**
     * Get 是否启用https
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Https 是否启用https
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getHttps() {
        return this.Https;
    }

    /**
     * Set 是否启用https
注意：此字段可能返回 null，表示取不到有效值。
     * @param Https 是否启用https
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttps(Boolean Https) {
        this.Https = Https;
    }

    /**
     * Get 启用客户端证书认证
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClientCertAuth 启用客户端证书认证
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getClientCertAuth() {
        return this.ClientCertAuth;
    }

    /**
     * Set 启用客户端证书认证
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientCertAuth 启用客户端证书认证
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientCertAuth(Boolean ClientCertAuth) {
        this.ClientCertAuth = ClientCertAuth;
    }

    public EtcdSecuritySettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EtcdSecuritySettings(EtcdSecuritySettings source) {
        if (source.Https != null) {
            this.Https = new Boolean(source.Https);
        }
        if (source.ClientCertAuth != null) {
            this.ClientCertAuth = new Boolean(source.ClientCertAuth);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Https", this.Https);
        this.setParamSimple(map, prefix + "ClientCertAuth", this.ClientCertAuth);

    }
}

