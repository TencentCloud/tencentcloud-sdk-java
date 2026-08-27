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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRequestWithEncryptionRequest extends AbstractModel {

    /**
    * <p>操作的接口名称。取值参考接口文档输入参数章节关于公共参数 Action 的说明。</p>
    */
    @SerializedName("RequestAction")
    @Expose
    private String RequestAction;

    /**
    * <p>加密算法使用的初始化向量。固定为 16 字节，将 IV 原始字节使用标准 Base64 编码后传入。</p>
    */
    @SerializedName("IV")
    @Expose
    private String IV;

    /**
    * <p>使用 AES-CBC 或 SM4-CBC 加密请求内容得到的密文。加密前请求内容采用 PKCS#7 Padding；将密文原始字节使用标准 Base64 编码后传入。</p>
    */
    @SerializedName("EncryptedData")
    @Expose
    private String EncryptedData;

    /**
    * <p>用于校验请求数据完整性。对 IV 原始字节和密文原始字节直接拼接（不加拼接符）后计算 HMAC-SHA256，再将计算结果使用标准 Base64 编码后传入。</p>
    */
    @SerializedName("EncryptionSignature")
    @Expose
    private String EncryptionSignature;

    /**
     * Get <p>操作的接口名称。取值参考接口文档输入参数章节关于公共参数 Action 的说明。</p> 
     * @return RequestAction <p>操作的接口名称。取值参考接口文档输入参数章节关于公共参数 Action 的说明。</p>
     */
    public String getRequestAction() {
        return this.RequestAction;
    }

    /**
     * Set <p>操作的接口名称。取值参考接口文档输入参数章节关于公共参数 Action 的说明。</p>
     * @param RequestAction <p>操作的接口名称。取值参考接口文档输入参数章节关于公共参数 Action 的说明。</p>
     */
    public void setRequestAction(String RequestAction) {
        this.RequestAction = RequestAction;
    }

    /**
     * Get <p>加密算法使用的初始化向量。固定为 16 字节，将 IV 原始字节使用标准 Base64 编码后传入。</p> 
     * @return IV <p>加密算法使用的初始化向量。固定为 16 字节，将 IV 原始字节使用标准 Base64 编码后传入。</p>
     */
    public String getIV() {
        return this.IV;
    }

    /**
     * Set <p>加密算法使用的初始化向量。固定为 16 字节，将 IV 原始字节使用标准 Base64 编码后传入。</p>
     * @param IV <p>加密算法使用的初始化向量。固定为 16 字节，将 IV 原始字节使用标准 Base64 编码后传入。</p>
     */
    public void setIV(String IV) {
        this.IV = IV;
    }

    /**
     * Get <p>使用 AES-CBC 或 SM4-CBC 加密请求内容得到的密文。加密前请求内容采用 PKCS#7 Padding；将密文原始字节使用标准 Base64 编码后传入。</p> 
     * @return EncryptedData <p>使用 AES-CBC 或 SM4-CBC 加密请求内容得到的密文。加密前请求内容采用 PKCS#7 Padding；将密文原始字节使用标准 Base64 编码后传入。</p>
     */
    public String getEncryptedData() {
        return this.EncryptedData;
    }

    /**
     * Set <p>使用 AES-CBC 或 SM4-CBC 加密请求内容得到的密文。加密前请求内容采用 PKCS#7 Padding；将密文原始字节使用标准 Base64 编码后传入。</p>
     * @param EncryptedData <p>使用 AES-CBC 或 SM4-CBC 加密请求内容得到的密文。加密前请求内容采用 PKCS#7 Padding；将密文原始字节使用标准 Base64 编码后传入。</p>
     */
    public void setEncryptedData(String EncryptedData) {
        this.EncryptedData = EncryptedData;
    }

    /**
     * Get <p>用于校验请求数据完整性。对 IV 原始字节和密文原始字节直接拼接（不加拼接符）后计算 HMAC-SHA256，再将计算结果使用标准 Base64 编码后传入。</p> 
     * @return EncryptionSignature <p>用于校验请求数据完整性。对 IV 原始字节和密文原始字节直接拼接（不加拼接符）后计算 HMAC-SHA256，再将计算结果使用标准 Base64 编码后传入。</p>
     */
    public String getEncryptionSignature() {
        return this.EncryptionSignature;
    }

    /**
     * Set <p>用于校验请求数据完整性。对 IV 原始字节和密文原始字节直接拼接（不加拼接符）后计算 HMAC-SHA256，再将计算结果使用标准 Base64 编码后传入。</p>
     * @param EncryptionSignature <p>用于校验请求数据完整性。对 IV 原始字节和密文原始字节直接拼接（不加拼接符）后计算 HMAC-SHA256，再将计算结果使用标准 Base64 编码后传入。</p>
     */
    public void setEncryptionSignature(String EncryptionSignature) {
        this.EncryptionSignature = EncryptionSignature;
    }

    public CreateRequestWithEncryptionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRequestWithEncryptionRequest(CreateRequestWithEncryptionRequest source) {
        if (source.RequestAction != null) {
            this.RequestAction = new String(source.RequestAction);
        }
        if (source.IV != null) {
            this.IV = new String(source.IV);
        }
        if (source.EncryptedData != null) {
            this.EncryptedData = new String(source.EncryptedData);
        }
        if (source.EncryptionSignature != null) {
            this.EncryptionSignature = new String(source.EncryptionSignature);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RequestAction", this.RequestAction);
        this.setParamSimple(map, prefix + "IV", this.IV);
        this.setParamSimple(map, prefix + "EncryptedData", this.EncryptedData);
        this.setParamSimple(map, prefix + "EncryptionSignature", this.EncryptionSignature);

    }
}

