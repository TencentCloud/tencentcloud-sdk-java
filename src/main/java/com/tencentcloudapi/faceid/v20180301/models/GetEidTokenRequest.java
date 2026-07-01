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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetEidTokenRequest extends AbstractModel {

    /**
    * <p>EID商户ID。</p><ul><li>商户ID通过人脸核身控制台<a href="https://console.cloud.tencent.com/faceid/access">自助接入</a>申请。</li><li>商户ID与您通过腾讯云人脸核身控制台完成自助接入时所使用的腾讯云账号绑定。</li><li>必须使用申请该商户ID时登录的腾讯云账号所对应的腾讯云API密钥调用该接口。</li></ul>
    */
    @SerializedName("MerchantId")
    @Expose
    private String MerchantId;

    /**
    * <p>身份标识。</p><ul><li>未使用OCR服务时，必须传入。</li><li>规则：a-z，A-Z，0-9组合。</li><li>最长长度32位。</li></ul>
    */
    @SerializedName("IdCard")
    @Expose
    private String IdCard;

    /**
    * <p>姓名。</p><ul><li>未使用OCR服务时，必须传入。</li><li>最长长度32位。</li><li>中文请使用UTF-8编码。</li></ul>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>透传字段，在获取验证结果时返回。</p><ul><li>最长长度1024位。</li></ul>
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
    * <p>小程序模式配置，包括如何传入姓名身份证的配置，以及是否使用意愿核身。</p>
    */
    @SerializedName("Config")
    @Expose
    private GetEidTokenConfig Config;

    /**
    * <p>用户从Url中进入核身认证结束后重定向的回调链接地址。</p><ul><li>最长长度1024位。</li><li>EidToken会在该链接的query参数中。</li></ul>
    */
    @SerializedName("RedirectUrl")
    @Expose
    private String RedirectUrl;

    /**
    * <p>敏感数据加密信息。</p><ul><li>对传入信息（姓名、身份证号）有加密需求的用户可使用此参数，详情请点击左侧链接。</li></ul>
    */
    @SerializedName("Encryption")
    @Expose
    private Encryption Encryption;

    /**
     * Get <p>EID商户ID。</p><ul><li>商户ID通过人脸核身控制台<a href="https://console.cloud.tencent.com/faceid/access">自助接入</a>申请。</li><li>商户ID与您通过腾讯云人脸核身控制台完成自助接入时所使用的腾讯云账号绑定。</li><li>必须使用申请该商户ID时登录的腾讯云账号所对应的腾讯云API密钥调用该接口。</li></ul> 
     * @return MerchantId <p>EID商户ID。</p><ul><li>商户ID通过人脸核身控制台<a href="https://console.cloud.tencent.com/faceid/access">自助接入</a>申请。</li><li>商户ID与您通过腾讯云人脸核身控制台完成自助接入时所使用的腾讯云账号绑定。</li><li>必须使用申请该商户ID时登录的腾讯云账号所对应的腾讯云API密钥调用该接口。</li></ul>
     */
    public String getMerchantId() {
        return this.MerchantId;
    }

    /**
     * Set <p>EID商户ID。</p><ul><li>商户ID通过人脸核身控制台<a href="https://console.cloud.tencent.com/faceid/access">自助接入</a>申请。</li><li>商户ID与您通过腾讯云人脸核身控制台完成自助接入时所使用的腾讯云账号绑定。</li><li>必须使用申请该商户ID时登录的腾讯云账号所对应的腾讯云API密钥调用该接口。</li></ul>
     * @param MerchantId <p>EID商户ID。</p><ul><li>商户ID通过人脸核身控制台<a href="https://console.cloud.tencent.com/faceid/access">自助接入</a>申请。</li><li>商户ID与您通过腾讯云人脸核身控制台完成自助接入时所使用的腾讯云账号绑定。</li><li>必须使用申请该商户ID时登录的腾讯云账号所对应的腾讯云API密钥调用该接口。</li></ul>
     */
    public void setMerchantId(String MerchantId) {
        this.MerchantId = MerchantId;
    }

    /**
     * Get <p>身份标识。</p><ul><li>未使用OCR服务时，必须传入。</li><li>规则：a-z，A-Z，0-9组合。</li><li>最长长度32位。</li></ul> 
     * @return IdCard <p>身份标识。</p><ul><li>未使用OCR服务时，必须传入。</li><li>规则：a-z，A-Z，0-9组合。</li><li>最长长度32位。</li></ul>
     */
    public String getIdCard() {
        return this.IdCard;
    }

    /**
     * Set <p>身份标识。</p><ul><li>未使用OCR服务时，必须传入。</li><li>规则：a-z，A-Z，0-9组合。</li><li>最长长度32位。</li></ul>
     * @param IdCard <p>身份标识。</p><ul><li>未使用OCR服务时，必须传入。</li><li>规则：a-z，A-Z，0-9组合。</li><li>最长长度32位。</li></ul>
     */
    public void setIdCard(String IdCard) {
        this.IdCard = IdCard;
    }

    /**
     * Get <p>姓名。</p><ul><li>未使用OCR服务时，必须传入。</li><li>最长长度32位。</li><li>中文请使用UTF-8编码。</li></ul> 
     * @return Name <p>姓名。</p><ul><li>未使用OCR服务时，必须传入。</li><li>最长长度32位。</li><li>中文请使用UTF-8编码。</li></ul>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>姓名。</p><ul><li>未使用OCR服务时，必须传入。</li><li>最长长度32位。</li><li>中文请使用UTF-8编码。</li></ul>
     * @param Name <p>姓名。</p><ul><li>未使用OCR服务时，必须传入。</li><li>最长长度32位。</li><li>中文请使用UTF-8编码。</li></ul>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>透传字段，在获取验证结果时返回。</p><ul><li>最长长度1024位。</li></ul> 
     * @return Extra <p>透传字段，在获取验证结果时返回。</p><ul><li>最长长度1024位。</li></ul>
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set <p>透传字段，在获取验证结果时返回。</p><ul><li>最长长度1024位。</li></ul>
     * @param Extra <p>透传字段，在获取验证结果时返回。</p><ul><li>最长长度1024位。</li></ul>
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    /**
     * Get <p>小程序模式配置，包括如何传入姓名身份证的配置，以及是否使用意愿核身。</p> 
     * @return Config <p>小程序模式配置，包括如何传入姓名身份证的配置，以及是否使用意愿核身。</p>
     */
    public GetEidTokenConfig getConfig() {
        return this.Config;
    }

    /**
     * Set <p>小程序模式配置，包括如何传入姓名身份证的配置，以及是否使用意愿核身。</p>
     * @param Config <p>小程序模式配置，包括如何传入姓名身份证的配置，以及是否使用意愿核身。</p>
     */
    public void setConfig(GetEidTokenConfig Config) {
        this.Config = Config;
    }

    /**
     * Get <p>用户从Url中进入核身认证结束后重定向的回调链接地址。</p><ul><li>最长长度1024位。</li><li>EidToken会在该链接的query参数中。</li></ul> 
     * @return RedirectUrl <p>用户从Url中进入核身认证结束后重定向的回调链接地址。</p><ul><li>最长长度1024位。</li><li>EidToken会在该链接的query参数中。</li></ul>
     */
    public String getRedirectUrl() {
        return this.RedirectUrl;
    }

    /**
     * Set <p>用户从Url中进入核身认证结束后重定向的回调链接地址。</p><ul><li>最长长度1024位。</li><li>EidToken会在该链接的query参数中。</li></ul>
     * @param RedirectUrl <p>用户从Url中进入核身认证结束后重定向的回调链接地址。</p><ul><li>最长长度1024位。</li><li>EidToken会在该链接的query参数中。</li></ul>
     */
    public void setRedirectUrl(String RedirectUrl) {
        this.RedirectUrl = RedirectUrl;
    }

    /**
     * Get <p>敏感数据加密信息。</p><ul><li>对传入信息（姓名、身份证号）有加密需求的用户可使用此参数，详情请点击左侧链接。</li></ul> 
     * @return Encryption <p>敏感数据加密信息。</p><ul><li>对传入信息（姓名、身份证号）有加密需求的用户可使用此参数，详情请点击左侧链接。</li></ul>
     */
    public Encryption getEncryption() {
        return this.Encryption;
    }

    /**
     * Set <p>敏感数据加密信息。</p><ul><li>对传入信息（姓名、身份证号）有加密需求的用户可使用此参数，详情请点击左侧链接。</li></ul>
     * @param Encryption <p>敏感数据加密信息。</p><ul><li>对传入信息（姓名、身份证号）有加密需求的用户可使用此参数，详情请点击左侧链接。</li></ul>
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

