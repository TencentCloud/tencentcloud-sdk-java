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

public class CreateWhiteBoxKeyResponse extends AbstractModel{

    /**
    * 用于加密的密钥，base64编码
    */
    @SerializedName("EncryptKey")
    @Expose
    private String EncryptKey;

    /**
    * 用于解密的密钥，base64编码
    */
    @SerializedName("DecryptKey")
    @Expose
    private String DecryptKey;

    /**
    * 白盒密钥的全局唯一标识符
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 标签操作的返回码. 0: 成功；1: 内部错误；2: 业务处理错误
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagCode")
    @Expose
    private Long TagCode;

    /**
    * 标签操作的返回信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagMsg")
    @Expose
    private String TagMsg;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 用于加密的密钥，base64编码 
     * @return EncryptKey 用于加密的密钥，base64编码
     */
    public String getEncryptKey() {
        return this.EncryptKey;
    }

    /**
     * Set 用于加密的密钥，base64编码
     * @param EncryptKey 用于加密的密钥，base64编码
     */
    public void setEncryptKey(String EncryptKey) {
        this.EncryptKey = EncryptKey;
    }

    /**
     * Get 用于解密的密钥，base64编码 
     * @return DecryptKey 用于解密的密钥，base64编码
     */
    public String getDecryptKey() {
        return this.DecryptKey;
    }

    /**
     * Set 用于解密的密钥，base64编码
     * @param DecryptKey 用于解密的密钥，base64编码
     */
    public void setDecryptKey(String DecryptKey) {
        this.DecryptKey = DecryptKey;
    }

    /**
     * Get 白盒密钥的全局唯一标识符 
     * @return KeyId 白盒密钥的全局唯一标识符
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set 白盒密钥的全局唯一标识符
     * @param KeyId 白盒密钥的全局唯一标识符
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get 标签操作的返回码. 0: 成功；1: 内部错误；2: 业务处理错误
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagCode 标签操作的返回码. 0: 成功；1: 内部错误；2: 业务处理错误
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTagCode() {
        return this.TagCode;
    }

    /**
     * Set 标签操作的返回码. 0: 成功；1: 内部错误；2: 业务处理错误
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagCode 标签操作的返回码. 0: 成功；1: 内部错误；2: 业务处理错误
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagCode(Long TagCode) {
        this.TagCode = TagCode;
    }

    /**
     * Get 标签操作的返回信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagMsg 标签操作的返回信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTagMsg() {
        return this.TagMsg;
    }

    /**
     * Set 标签操作的返回信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagMsg 标签操作的返回信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagMsg(String TagMsg) {
        this.TagMsg = TagMsg;
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

    public CreateWhiteBoxKeyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateWhiteBoxKeyResponse(CreateWhiteBoxKeyResponse source) {
        if (source.EncryptKey != null) {
            this.EncryptKey = new String(source.EncryptKey);
        }
        if (source.DecryptKey != null) {
            this.DecryptKey = new String(source.DecryptKey);
        }
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.TagCode != null) {
            this.TagCode = new Long(source.TagCode);
        }
        if (source.TagMsg != null) {
            this.TagMsg = new String(source.TagMsg);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EncryptKey", this.EncryptKey);
        this.setParamSimple(map, prefix + "DecryptKey", this.DecryptKey);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "TagCode", this.TagCode);
        this.setParamSimple(map, prefix + "TagMsg", this.TagMsg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

