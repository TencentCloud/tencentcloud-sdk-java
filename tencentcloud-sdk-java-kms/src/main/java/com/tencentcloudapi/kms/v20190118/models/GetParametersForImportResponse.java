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

public class GetParametersForImportResponse extends AbstractModel{

    /**
    * CMK的唯一标识，用于指定目标导入密钥材料的CMK。
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 导入密钥材料需要的token，用于作为 ImportKeyMaterial 的参数。
    */
    @SerializedName("ImportToken")
    @Expose
    private String ImportToken;

    /**
    * 用于加密密钥材料的RSA公钥，base64编码。使用PublicKey base64解码后的公钥将导入密钥进行加密后作为 ImportKeyMaterial 的参数。
    */
    @SerializedName("PublicKey")
    @Expose
    private String PublicKey;

    /**
    * 该导出token和公钥的有效期，超过该时间后无法导入，需要重新调用GetParametersForImport获取。
    */
    @SerializedName("ParametersValidTo")
    @Expose
    private Long ParametersValidTo;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get CMK的唯一标识，用于指定目标导入密钥材料的CMK。 
     * @return KeyId CMK的唯一标识，用于指定目标导入密钥材料的CMK。
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set CMK的唯一标识，用于指定目标导入密钥材料的CMK。
     * @param KeyId CMK的唯一标识，用于指定目标导入密钥材料的CMK。
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get 导入密钥材料需要的token，用于作为 ImportKeyMaterial 的参数。 
     * @return ImportToken 导入密钥材料需要的token，用于作为 ImportKeyMaterial 的参数。
     */
    public String getImportToken() {
        return this.ImportToken;
    }

    /**
     * Set 导入密钥材料需要的token，用于作为 ImportKeyMaterial 的参数。
     * @param ImportToken 导入密钥材料需要的token，用于作为 ImportKeyMaterial 的参数。
     */
    public void setImportToken(String ImportToken) {
        this.ImportToken = ImportToken;
    }

    /**
     * Get 用于加密密钥材料的RSA公钥，base64编码。使用PublicKey base64解码后的公钥将导入密钥进行加密后作为 ImportKeyMaterial 的参数。 
     * @return PublicKey 用于加密密钥材料的RSA公钥，base64编码。使用PublicKey base64解码后的公钥将导入密钥进行加密后作为 ImportKeyMaterial 的参数。
     */
    public String getPublicKey() {
        return this.PublicKey;
    }

    /**
     * Set 用于加密密钥材料的RSA公钥，base64编码。使用PublicKey base64解码后的公钥将导入密钥进行加密后作为 ImportKeyMaterial 的参数。
     * @param PublicKey 用于加密密钥材料的RSA公钥，base64编码。使用PublicKey base64解码后的公钥将导入密钥进行加密后作为 ImportKeyMaterial 的参数。
     */
    public void setPublicKey(String PublicKey) {
        this.PublicKey = PublicKey;
    }

    /**
     * Get 该导出token和公钥的有效期，超过该时间后无法导入，需要重新调用GetParametersForImport获取。 
     * @return ParametersValidTo 该导出token和公钥的有效期，超过该时间后无法导入，需要重新调用GetParametersForImport获取。
     */
    public Long getParametersValidTo() {
        return this.ParametersValidTo;
    }

    /**
     * Set 该导出token和公钥的有效期，超过该时间后无法导入，需要重新调用GetParametersForImport获取。
     * @param ParametersValidTo 该导出token和公钥的有效期，超过该时间后无法导入，需要重新调用GetParametersForImport获取。
     */
    public void setParametersValidTo(Long ParametersValidTo) {
        this.ParametersValidTo = ParametersValidTo;
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
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "ImportToken", this.ImportToken);
        this.setParamSimple(map, prefix + "PublicKey", this.PublicKey);
        this.setParamSimple(map, prefix + "ParametersValidTo", this.ParametersValidTo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

