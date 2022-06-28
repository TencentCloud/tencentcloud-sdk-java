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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadOpenBankSubMerchantCredentialRequest extends AbstractModel{

    /**
    * 渠道商户ID。
    */
    @SerializedName("ChannelMerchantId")
    @Expose
    private String ChannelMerchantId;

    /**
    * 渠道子商户ID。
    */
    @SerializedName("ChannelSubMerchantId")
    @Expose
    private String ChannelSubMerchantId;

    /**
    * 渠道名称。详见附录-枚举类型-ChannelName。
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * 外部序列进件号。
    */
    @SerializedName("OutApplyId")
    @Expose
    private String OutApplyId;

    /**
    * 资质类型，详见附录-枚举类型-CredentialType。
    */
    @SerializedName("CredentialType")
    @Expose
    private String CredentialType;

    /**
    * 文件类型。
合利宝渠道，文件类型为PNG/JPG格式。
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 支付方式。
合利宝渠道不需要传。
    */
    @SerializedName("PaymentMethod")
    @Expose
    private String PaymentMethod;

    /**
    * 资质文件内容。Base64编码，资质文件内容和链接二选一。
合利宝渠道，文件限制大小5M以内。
    */
    @SerializedName("CredentialContent")
    @Expose
    private String CredentialContent;

    /**
    * 资质文件链接。资质文件内容和链接二选一。
合利宝渠道，文件限制大小5M以内。
    */
    @SerializedName("CredentialUrl")
    @Expose
    private String CredentialUrl;

    /**
    * 环境类型。
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
     * Get 渠道商户ID。 
     * @return ChannelMerchantId 渠道商户ID。
     */
    public String getChannelMerchantId() {
        return this.ChannelMerchantId;
    }

    /**
     * Set 渠道商户ID。
     * @param ChannelMerchantId 渠道商户ID。
     */
    public void setChannelMerchantId(String ChannelMerchantId) {
        this.ChannelMerchantId = ChannelMerchantId;
    }

    /**
     * Get 渠道子商户ID。 
     * @return ChannelSubMerchantId 渠道子商户ID。
     */
    public String getChannelSubMerchantId() {
        return this.ChannelSubMerchantId;
    }

    /**
     * Set 渠道子商户ID。
     * @param ChannelSubMerchantId 渠道子商户ID。
     */
    public void setChannelSubMerchantId(String ChannelSubMerchantId) {
        this.ChannelSubMerchantId = ChannelSubMerchantId;
    }

    /**
     * Get 渠道名称。详见附录-枚举类型-ChannelName。 
     * @return ChannelName 渠道名称。详见附录-枚举类型-ChannelName。
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set 渠道名称。详见附录-枚举类型-ChannelName。
     * @param ChannelName 渠道名称。详见附录-枚举类型-ChannelName。
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get 外部序列进件号。 
     * @return OutApplyId 外部序列进件号。
     */
    public String getOutApplyId() {
        return this.OutApplyId;
    }

    /**
     * Set 外部序列进件号。
     * @param OutApplyId 外部序列进件号。
     */
    public void setOutApplyId(String OutApplyId) {
        this.OutApplyId = OutApplyId;
    }

    /**
     * Get 资质类型，详见附录-枚举类型-CredentialType。 
     * @return CredentialType 资质类型，详见附录-枚举类型-CredentialType。
     */
    public String getCredentialType() {
        return this.CredentialType;
    }

    /**
     * Set 资质类型，详见附录-枚举类型-CredentialType。
     * @param CredentialType 资质类型，详见附录-枚举类型-CredentialType。
     */
    public void setCredentialType(String CredentialType) {
        this.CredentialType = CredentialType;
    }

    /**
     * Get 文件类型。
合利宝渠道，文件类型为PNG/JPG格式。 
     * @return FileType 文件类型。
合利宝渠道，文件类型为PNG/JPG格式。
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 文件类型。
合利宝渠道，文件类型为PNG/JPG格式。
     * @param FileType 文件类型。
合利宝渠道，文件类型为PNG/JPG格式。
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 支付方式。
合利宝渠道不需要传。 
     * @return PaymentMethod 支付方式。
合利宝渠道不需要传。
     */
    public String getPaymentMethod() {
        return this.PaymentMethod;
    }

    /**
     * Set 支付方式。
合利宝渠道不需要传。
     * @param PaymentMethod 支付方式。
合利宝渠道不需要传。
     */
    public void setPaymentMethod(String PaymentMethod) {
        this.PaymentMethod = PaymentMethod;
    }

    /**
     * Get 资质文件内容。Base64编码，资质文件内容和链接二选一。
合利宝渠道，文件限制大小5M以内。 
     * @return CredentialContent 资质文件内容。Base64编码，资质文件内容和链接二选一。
合利宝渠道，文件限制大小5M以内。
     */
    public String getCredentialContent() {
        return this.CredentialContent;
    }

    /**
     * Set 资质文件内容。Base64编码，资质文件内容和链接二选一。
合利宝渠道，文件限制大小5M以内。
     * @param CredentialContent 资质文件内容。Base64编码，资质文件内容和链接二选一。
合利宝渠道，文件限制大小5M以内。
     */
    public void setCredentialContent(String CredentialContent) {
        this.CredentialContent = CredentialContent;
    }

    /**
     * Get 资质文件链接。资质文件内容和链接二选一。
合利宝渠道，文件限制大小5M以内。 
     * @return CredentialUrl 资质文件链接。资质文件内容和链接二选一。
合利宝渠道，文件限制大小5M以内。
     */
    public String getCredentialUrl() {
        return this.CredentialUrl;
    }

    /**
     * Set 资质文件链接。资质文件内容和链接二选一。
合利宝渠道，文件限制大小5M以内。
     * @param CredentialUrl 资质文件链接。资质文件内容和链接二选一。
合利宝渠道，文件限制大小5M以内。
     */
    public void setCredentialUrl(String CredentialUrl) {
        this.CredentialUrl = CredentialUrl;
    }

    /**
     * Get 环境类型。
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_ 
     * @return Environment 环境类型。
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set 环境类型。
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
     * @param Environment 环境类型。
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    public UploadOpenBankSubMerchantCredentialRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadOpenBankSubMerchantCredentialRequest(UploadOpenBankSubMerchantCredentialRequest source) {
        if (source.ChannelMerchantId != null) {
            this.ChannelMerchantId = new String(source.ChannelMerchantId);
        }
        if (source.ChannelSubMerchantId != null) {
            this.ChannelSubMerchantId = new String(source.ChannelSubMerchantId);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.OutApplyId != null) {
            this.OutApplyId = new String(source.OutApplyId);
        }
        if (source.CredentialType != null) {
            this.CredentialType = new String(source.CredentialType);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.PaymentMethod != null) {
            this.PaymentMethod = new String(source.PaymentMethod);
        }
        if (source.CredentialContent != null) {
            this.CredentialContent = new String(source.CredentialContent);
        }
        if (source.CredentialUrl != null) {
            this.CredentialUrl = new String(source.CredentialUrl);
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelMerchantId", this.ChannelMerchantId);
        this.setParamSimple(map, prefix + "ChannelSubMerchantId", this.ChannelSubMerchantId);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "OutApplyId", this.OutApplyId);
        this.setParamSimple(map, prefix + "CredentialType", this.CredentialType);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "PaymentMethod", this.PaymentMethod);
        this.setParamSimple(map, prefix + "CredentialContent", this.CredentialContent);
        this.setParamSimple(map, prefix + "CredentialUrl", this.CredentialUrl);
        this.setParamSimple(map, prefix + "Environment", this.Environment);

    }
}

