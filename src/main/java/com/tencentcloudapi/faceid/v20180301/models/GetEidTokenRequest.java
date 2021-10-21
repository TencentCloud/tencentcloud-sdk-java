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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetEidTokenRequest extends AbstractModel{

    /**
    * EID商户id，字段长度最长50位。
    */
    @SerializedName("MerchantId")
    @Expose
    private String MerchantId;

    /**
    * 身份标识（未使用OCR服务时，必须传入）。
规则：a-zA-Z0-9组合。最长长度32位。
    */
    @SerializedName("IdCard")
    @Expose
    private String IdCard;

    /**
    * 姓名。（未使用OCR服务时，必须传入）最长长度32位。中文请使用UTF-8编码。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 透传字段，在获取验证结果时返回。最长长度1024位。
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
    * 小程序模式配置，包括如何传入姓名身份证的配置。
    */
    @SerializedName("Config")
    @Expose
    private GetEidTokenConfig Config;

    /**
    * 最长长度1024位。用户从Url中进入核身认证结束后重定向的回调链接地址。EidToken会在该链接的query参数中。
    */
    @SerializedName("RedirectUrl")
    @Expose
    private String RedirectUrl;

    /**
    * 敏感数据加密信息。对传入信息（姓名、身份证号）有加密需求的用户可使用此参数，详情请点击左侧链接。
    */
    @SerializedName("Encryption")
    @Expose
    private Encryption Encryption;

    /**
     * Get EID商户id，字段长度最长50位。 
     * @return MerchantId EID商户id，字段长度最长50位。
     */
    public String getMerchantId() {
        return this.MerchantId;
    }

    /**
     * Set EID商户id，字段长度最长50位。
     * @param MerchantId EID商户id，字段长度最长50位。
     */
    public void setMerchantId(String MerchantId) {
        this.MerchantId = MerchantId;
    }

    /**
     * Get 身份标识（未使用OCR服务时，必须传入）。
规则：a-zA-Z0-9组合。最长长度32位。 
     * @return IdCard 身份标识（未使用OCR服务时，必须传入）。
规则：a-zA-Z0-9组合。最长长度32位。
     */
    public String getIdCard() {
        return this.IdCard;
    }

    /**
     * Set 身份标识（未使用OCR服务时，必须传入）。
规则：a-zA-Z0-9组合。最长长度32位。
     * @param IdCard 身份标识（未使用OCR服务时，必须传入）。
规则：a-zA-Z0-9组合。最长长度32位。
     */
    public void setIdCard(String IdCard) {
        this.IdCard = IdCard;
    }

    /**
     * Get 姓名。（未使用OCR服务时，必须传入）最长长度32位。中文请使用UTF-8编码。 
     * @return Name 姓名。（未使用OCR服务时，必须传入）最长长度32位。中文请使用UTF-8编码。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 姓名。（未使用OCR服务时，必须传入）最长长度32位。中文请使用UTF-8编码。
     * @param Name 姓名。（未使用OCR服务时，必须传入）最长长度32位。中文请使用UTF-8编码。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 透传字段，在获取验证结果时返回。最长长度1024位。 
     * @return Extra 透传字段，在获取验证结果时返回。最长长度1024位。
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set 透传字段，在获取验证结果时返回。最长长度1024位。
     * @param Extra 透传字段，在获取验证结果时返回。最长长度1024位。
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    /**
     * Get 小程序模式配置，包括如何传入姓名身份证的配置。 
     * @return Config 小程序模式配置，包括如何传入姓名身份证的配置。
     */
    public GetEidTokenConfig getConfig() {
        return this.Config;
    }

    /**
     * Set 小程序模式配置，包括如何传入姓名身份证的配置。
     * @param Config 小程序模式配置，包括如何传入姓名身份证的配置。
     */
    public void setConfig(GetEidTokenConfig Config) {
        this.Config = Config;
    }

    /**
     * Get 最长长度1024位。用户从Url中进入核身认证结束后重定向的回调链接地址。EidToken会在该链接的query参数中。 
     * @return RedirectUrl 最长长度1024位。用户从Url中进入核身认证结束后重定向的回调链接地址。EidToken会在该链接的query参数中。
     */
    public String getRedirectUrl() {
        return this.RedirectUrl;
    }

    /**
     * Set 最长长度1024位。用户从Url中进入核身认证结束后重定向的回调链接地址。EidToken会在该链接的query参数中。
     * @param RedirectUrl 最长长度1024位。用户从Url中进入核身认证结束后重定向的回调链接地址。EidToken会在该链接的query参数中。
     */
    public void setRedirectUrl(String RedirectUrl) {
        this.RedirectUrl = RedirectUrl;
    }

    /**
     * Get 敏感数据加密信息。对传入信息（姓名、身份证号）有加密需求的用户可使用此参数，详情请点击左侧链接。 
     * @return Encryption 敏感数据加密信息。对传入信息（姓名、身份证号）有加密需求的用户可使用此参数，详情请点击左侧链接。
     */
    public Encryption getEncryption() {
        return this.Encryption;
    }

    /**
     * Set 敏感数据加密信息。对传入信息（姓名、身份证号）有加密需求的用户可使用此参数，详情请点击左侧链接。
     * @param Encryption 敏感数据加密信息。对传入信息（姓名、身份证号）有加密需求的用户可使用此参数，详情请点击左侧链接。
     */
    public void setEncryption(Encryption Encryption) {
        this.Encryption = Encryption;
    }

    public GetEidTokenRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetEidTokenRequest(GetEidTokenRequest source) {
        if (source.MerchantId != null) {
            this.MerchantId = new String(source.MerchantId);
        }
        if (source.IdCard != null) {
            this.IdCard = new String(source.IdCard);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Extra != null) {
            this.Extra = new String(source.Extra);
        }
        if (source.Config != null) {
            this.Config = new GetEidTokenConfig(source.Config);
        }
        if (source.RedirectUrl != null) {
            this.RedirectUrl = new String(source.RedirectUrl);
        }
        if (source.Encryption != null) {
            this.Encryption = new Encryption(source.Encryption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MerchantId", this.MerchantId);
        this.setParamSimple(map, prefix + "IdCard", this.IdCard);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Extra", this.Extra);
        this.setParamObj(map, prefix + "Config.", this.Config);
        this.setParamSimple(map, prefix + "RedirectUrl", this.RedirectUrl);
        this.setParamObj(map, prefix + "Encryption.", this.Encryption);

    }
}

