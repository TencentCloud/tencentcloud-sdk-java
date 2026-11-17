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
package com.tencentcloudapi.makers.v20261113.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosCredentials extends AbstractModel {

    /**
    * <p>临时 SecretId</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TmpSecretId")
    @Expose
    private String TmpSecretId;

    /**
    * <p>临时 SecretKey</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TmpSecretKey")
    @Expose
    private String TmpSecretKey;

    /**
    * <p>临时 Token</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
     * Get <p>临时 SecretId</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TmpSecretId <p>临时 SecretId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTmpSecretId() {
        return this.TmpSecretId;
    }

    /**
     * Set <p>临时 SecretId</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TmpSecretId <p>临时 SecretId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTmpSecretId(String TmpSecretId) {
        this.TmpSecretId = TmpSecretId;
    }

    /**
     * Get <p>临时 SecretKey</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TmpSecretKey <p>临时 SecretKey</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTmpSecretKey() {
        return this.TmpSecretKey;
    }

    /**
     * Set <p>临时 SecretKey</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TmpSecretKey <p>临时 SecretKey</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTmpSecretKey(String TmpSecretKey) {
        this.TmpSecretKey = TmpSecretKey;
    }

    /**
     * Get <p>临时 Token</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Token <p>临时 Token</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set <p>临时 Token</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Token <p>临时 Token</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    public CosCredentials() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosCredentials(CosCredentials source) {
        if (source.TmpSecretId != null) {
            this.TmpSecretId = new String(source.TmpSecretId);
        }
        if (source.TmpSecretKey != null) {
            this.TmpSecretKey = new String(source.TmpSecretKey);
        }
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TmpSecretId", this.TmpSecretId);
        this.setParamSimple(map, prefix + "TmpSecretKey", this.TmpSecretKey);
        this.setParamSimple(map, prefix + "Token", this.Token);

    }
}

