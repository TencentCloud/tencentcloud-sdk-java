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
package com.tencentcloudapi.drm.v20181115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddFairPlayPemRequest extends AbstractModel{

    /**
    * 加密后的fairplay方案申请时使用的私钥。
请使用腾讯云DRM 提供的公钥，使用rsa加密算法，PKCS1填充方式对私钥文件中的字段进行加密，并对加密结果进行base64编码。
    */
    @SerializedName("Pem")
    @Expose
    private String Pem;

    /**
    * 加密后的fairplay方案申请返回的ask数据。
请使用腾讯云DRM 提供的公钥，使用rsa加密算法，PKCS1填充方式对Ask字符串进行加密，并对加密结果进行base64编码。
    */
    @SerializedName("Ask")
    @Expose
    private String Ask;

    /**
    * 私钥的解密密钥。
openssl在生成rsa时，可能会需要设置加密密钥，请记住设置的密钥。
请使用腾讯云DRM 提供的公钥，使用rsa加密算法，PKCS1填充方式对解密密钥进行加密，并对加密结果进行base64编码。
    */
    @SerializedName("PemDecryptKey")
    @Expose
    private String PemDecryptKey;

    /**
    * 委托者Id,适用于托管自身证书的客户。普通客户无需填该字段。
    */
    @SerializedName("BailorId")
    @Expose
    private Long BailorId;

    /**
    * 私钥的优先级，优先级数值越高，优先级越高。
该值可以不传，后台将自动分配一个优先级。
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
     * Get 加密后的fairplay方案申请时使用的私钥。
请使用腾讯云DRM 提供的公钥，使用rsa加密算法，PKCS1填充方式对私钥文件中的字段进行加密，并对加密结果进行base64编码。 
     * @return Pem 加密后的fairplay方案申请时使用的私钥。
请使用腾讯云DRM 提供的公钥，使用rsa加密算法，PKCS1填充方式对私钥文件中的字段进行加密，并对加密结果进行base64编码。
     */
    public String getPem() {
        return this.Pem;
    }

    /**
     * Set 加密后的fairplay方案申请时使用的私钥。
请使用腾讯云DRM 提供的公钥，使用rsa加密算法，PKCS1填充方式对私钥文件中的字段进行加密，并对加密结果进行base64编码。
     * @param Pem 加密后的fairplay方案申请时使用的私钥。
请使用腾讯云DRM 提供的公钥，使用rsa加密算法，PKCS1填充方式对私钥文件中的字段进行加密，并对加密结果进行base64编码。
     */
    public void setPem(String Pem) {
        this.Pem = Pem;
    }

    /**
     * Get 加密后的fairplay方案申请返回的ask数据。
请使用腾讯云DRM 提供的公钥，使用rsa加密算法，PKCS1填充方式对Ask字符串进行加密，并对加密结果进行base64编码。 
     * @return Ask 加密后的fairplay方案申请返回的ask数据。
请使用腾讯云DRM 提供的公钥，使用rsa加密算法，PKCS1填充方式对Ask字符串进行加密，并对加密结果进行base64编码。
     */
    public String getAsk() {
        return this.Ask;
    }

    /**
     * Set 加密后的fairplay方案申请返回的ask数据。
请使用腾讯云DRM 提供的公钥，使用rsa加密算法，PKCS1填充方式对Ask字符串进行加密，并对加密结果进行base64编码。
     * @param Ask 加密后的fairplay方案申请返回的ask数据。
请使用腾讯云DRM 提供的公钥，使用rsa加密算法，PKCS1填充方式对Ask字符串进行加密，并对加密结果进行base64编码。
     */
    public void setAsk(String Ask) {
        this.Ask = Ask;
    }

    /**
     * Get 私钥的解密密钥。
openssl在生成rsa时，可能会需要设置加密密钥，请记住设置的密钥。
请使用腾讯云DRM 提供的公钥，使用rsa加密算法，PKCS1填充方式对解密密钥进行加密，并对加密结果进行base64编码。 
     * @return PemDecryptKey 私钥的解密密钥。
openssl在生成rsa时，可能会需要设置加密密钥，请记住设置的密钥。
请使用腾讯云DRM 提供的公钥，使用rsa加密算法，PKCS1填充方式对解密密钥进行加密，并对加密结果进行base64编码。
     */
    public String getPemDecryptKey() {
        return this.PemDecryptKey;
    }

    /**
     * Set 私钥的解密密钥。
openssl在生成rsa时，可能会需要设置加密密钥，请记住设置的密钥。
请使用腾讯云DRM 提供的公钥，使用rsa加密算法，PKCS1填充方式对解密密钥进行加密，并对加密结果进行base64编码。
     * @param PemDecryptKey 私钥的解密密钥。
openssl在生成rsa时，可能会需要设置加密密钥，请记住设置的密钥。
请使用腾讯云DRM 提供的公钥，使用rsa加密算法，PKCS1填充方式对解密密钥进行加密，并对加密结果进行base64编码。
     */
    public void setPemDecryptKey(String PemDecryptKey) {
        this.PemDecryptKey = PemDecryptKey;
    }

    /**
     * Get 委托者Id,适用于托管自身证书的客户。普通客户无需填该字段。 
     * @return BailorId 委托者Id,适用于托管自身证书的客户。普通客户无需填该字段。
     */
    public Long getBailorId() {
        return this.BailorId;
    }

    /**
     * Set 委托者Id,适用于托管自身证书的客户。普通客户无需填该字段。
     * @param BailorId 委托者Id,适用于托管自身证书的客户。普通客户无需填该字段。
     */
    public void setBailorId(Long BailorId) {
        this.BailorId = BailorId;
    }

    /**
     * Get 私钥的优先级，优先级数值越高，优先级越高。
该值可以不传，后台将自动分配一个优先级。 
     * @return Priority 私钥的优先级，优先级数值越高，优先级越高。
该值可以不传，后台将自动分配一个优先级。
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 私钥的优先级，优先级数值越高，优先级越高。
该值可以不传，后台将自动分配一个优先级。
     * @param Priority 私钥的优先级，优先级数值越高，优先级越高。
该值可以不传，后台将自动分配一个优先级。
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Pem", this.Pem);
        this.setParamSimple(map, prefix + "Ask", this.Ask);
        this.setParamSimple(map, prefix + "PemDecryptKey", this.PemDecryptKey);
        this.setParamSimple(map, prefix + "BailorId", this.BailorId);
        this.setParamSimple(map, prefix + "Priority", this.Priority);

    }
}

