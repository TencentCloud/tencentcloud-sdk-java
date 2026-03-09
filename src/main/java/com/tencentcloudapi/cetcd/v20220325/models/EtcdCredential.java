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

public class EtcdCredential extends AbstractModel {

    /**
    * CA证书
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CACert")
    @Expose
    private String CACert;

    /**
    * 证书
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cert")
    @Expose
    private String Cert;

    /**
    * 私钥
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
     * Get CA证书
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CACert CA证书
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCACert() {
        return this.CACert;
    }

    /**
     * Set CA证书
注意：此字段可能返回 null，表示取不到有效值。
     * @param CACert CA证书
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCACert(String CACert) {
        this.CACert = CACert;
    }

    /**
     * Get 证书
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cert 证书
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCert() {
        return this.Cert;
    }

    /**
     * Set 证书
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cert 证书
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCert(String Cert) {
        this.Cert = Cert;
    }

    /**
     * Get 私钥
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Key 私钥
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 私钥
注意：此字段可能返回 null，表示取不到有效值。
     * @param Key 私钥
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    public EtcdCredential() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EtcdCredential(EtcdCredential source) {
        if (source.CACert != null) {
            this.CACert = new String(source.CACert);
        }
        if (source.Cert != null) {
            this.Cert = new String(source.Cert);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CACert", this.CACert);
        this.setParamSimple(map, prefix + "Cert", this.Cert);
        this.setParamSimple(map, prefix + "Key", this.Key);

    }
}

