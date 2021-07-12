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
package com.tencentcloudapi.eiam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePublicKeyResponse extends AbstractModel{

    /**
    * jwt验证签名所用的公钥信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicKey")
    @Expose
    private String PublicKey;

    /**
    * jwt的密钥id。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 应用ID，是应用的全局唯一标识。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get jwt验证签名所用的公钥信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicKey jwt验证签名所用的公钥信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublicKey() {
        return this.PublicKey;
    }

    /**
     * Set jwt验证签名所用的公钥信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicKey jwt验证签名所用的公钥信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicKey(String PublicKey) {
        this.PublicKey = PublicKey;
    }

    /**
     * Get jwt的密钥id。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeyId jwt的密钥id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set jwt的密钥id。
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeyId jwt的密钥id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get 应用ID，是应用的全局唯一标识。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationId 应用ID，是应用的全局唯一标识。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用ID，是应用的全局唯一标识。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationId 应用ID，是应用的全局唯一标识。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribePublicKeyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePublicKeyResponse(DescribePublicKeyResponse source) {
        if (source.PublicKey != null) {
            this.PublicKey = new String(source.PublicKey);
        }
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PublicKey", this.PublicKey);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

