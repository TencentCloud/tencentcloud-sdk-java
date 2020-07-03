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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReEncryptResponse extends AbstractModel{

    /**
    * 重新加密后的密文
    */
    @SerializedName("CiphertextBlob")
    @Expose
    private String CiphertextBlob;

    /**
    * 重新加密使用的CMK
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 重新加密前密文使用的CMK
    */
    @SerializedName("SourceKeyId")
    @Expose
    private String SourceKeyId;

    /**
    * true表示密文已经重新加密。同一个CMK进行重加密，在密钥没有发生轮换的情况下不会进行实际重新加密操作，返回原密文
    */
    @SerializedName("ReEncrypted")
    @Expose
    private Boolean ReEncrypted;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 重新加密后的密文 
     * @return CiphertextBlob 重新加密后的密文
     */
    public String getCiphertextBlob() {
        return this.CiphertextBlob;
    }

    /**
     * Set 重新加密后的密文
     * @param CiphertextBlob 重新加密后的密文
     */
    public void setCiphertextBlob(String CiphertextBlob) {
        this.CiphertextBlob = CiphertextBlob;
    }

    /**
     * Get 重新加密使用的CMK 
     * @return KeyId 重新加密使用的CMK
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set 重新加密使用的CMK
     * @param KeyId 重新加密使用的CMK
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get 重新加密前密文使用的CMK 
     * @return SourceKeyId 重新加密前密文使用的CMK
     */
    public String getSourceKeyId() {
        return this.SourceKeyId;
    }

    /**
     * Set 重新加密前密文使用的CMK
     * @param SourceKeyId 重新加密前密文使用的CMK
     */
    public void setSourceKeyId(String SourceKeyId) {
        this.SourceKeyId = SourceKeyId;
    }

    /**
     * Get true表示密文已经重新加密。同一个CMK进行重加密，在密钥没有发生轮换的情况下不会进行实际重新加密操作，返回原密文 
     * @return ReEncrypted true表示密文已经重新加密。同一个CMK进行重加密，在密钥没有发生轮换的情况下不会进行实际重新加密操作，返回原密文
     */
    public Boolean getReEncrypted() {
        return this.ReEncrypted;
    }

    /**
     * Set true表示密文已经重新加密。同一个CMK进行重加密，在密钥没有发生轮换的情况下不会进行实际重新加密操作，返回原密文
     * @param ReEncrypted true表示密文已经重新加密。同一个CMK进行重加密，在密钥没有发生轮换的情况下不会进行实际重新加密操作，返回原密文
     */
    public void setReEncrypted(Boolean ReEncrypted) {
        this.ReEncrypted = ReEncrypted;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CiphertextBlob", this.CiphertextBlob);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "SourceKeyId", this.SourceKeyId);
        this.setParamSimple(map, prefix + "ReEncrypted", this.ReEncrypted);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

