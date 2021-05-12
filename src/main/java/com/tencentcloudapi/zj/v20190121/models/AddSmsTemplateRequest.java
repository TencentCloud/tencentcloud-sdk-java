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
package com.tencentcloudapi.zj.v20190121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddSmsTemplateRequest extends AbstractModel{

    /**
    * 商户证书
    */
    @SerializedName("License")
    @Expose
    private String License;

    /**
    * 短信签名，创建签名时返回
    */
    @SerializedName("SignID")
    @Expose
    private Long SignID;

    /**
    * 模板名称
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * 短信内容，动态内容使用占位符{1}，{2}等表示
    */
    @SerializedName("TemplateContent")
    @Expose
    private String TemplateContent;

    /**
    * 短信类型：{0:普通短信，1:营销短信}
    */
    @SerializedName("SmsType")
    @Expose
    private Long SmsType;

    /**
    * 是否国际/港澳台短信：
0：表示国内短信。
1：表示国际/港澳台短信。
    */
    @SerializedName("International")
    @Expose
    private Long International;

    /**
    * 短信模板标签
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 发送短信活动时配置的落地链接地址,仅用作短信活动
    */
    @SerializedName("Urls")
    @Expose
    private String [] Urls;

    /**
    * 发送短信活动时用于展示人群包动态参数模板占位符序号或接口发送时变量占位符序号
    */
    @SerializedName("CommonParams")
    @Expose
    private Long [] CommonParams;

    /**
    * 发送短信活动时用于展示短连接模板占位符序号,仅用作短信活动
    */
    @SerializedName("UrlParams")
    @Expose
    private Long [] UrlParams;

    /**
     * Get 商户证书 
     * @return License 商户证书
     */
    public String getLicense() {
        return this.License;
    }

    /**
     * Set 商户证书
     * @param License 商户证书
     */
    public void setLicense(String License) {
        this.License = License;
    }

    /**
     * Get 短信签名，创建签名时返回 
     * @return SignID 短信签名，创建签名时返回
     */
    public Long getSignID() {
        return this.SignID;
    }

    /**
     * Set 短信签名，创建签名时返回
     * @param SignID 短信签名，创建签名时返回
     */
    public void setSignID(Long SignID) {
        this.SignID = SignID;
    }

    /**
     * Get 模板名称 
     * @return TemplateName 模板名称
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set 模板名称
     * @param TemplateName 模板名称
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get 短信内容，动态内容使用占位符{1}，{2}等表示 
     * @return TemplateContent 短信内容，动态内容使用占位符{1}，{2}等表示
     */
    public String getTemplateContent() {
        return this.TemplateContent;
    }

    /**
     * Set 短信内容，动态内容使用占位符{1}，{2}等表示
     * @param TemplateContent 短信内容，动态内容使用占位符{1}，{2}等表示
     */
    public void setTemplateContent(String TemplateContent) {
        this.TemplateContent = TemplateContent;
    }

    /**
     * Get 短信类型：{0:普通短信，1:营销短信} 
     * @return SmsType 短信类型：{0:普通短信，1:营销短信}
     */
    public Long getSmsType() {
        return this.SmsType;
    }

    /**
     * Set 短信类型：{0:普通短信，1:营销短信}
     * @param SmsType 短信类型：{0:普通短信，1:营销短信}
     */
    public void setSmsType(Long SmsType) {
        this.SmsType = SmsType;
    }

    /**
     * Get 是否国际/港澳台短信：
0：表示国内短信。
1：表示国际/港澳台短信。 
     * @return International 是否国际/港澳台短信：
0：表示国内短信。
1：表示国际/港澳台短信。
     */
    public Long getInternational() {
        return this.International;
    }

    /**
     * Set 是否国际/港澳台短信：
0：表示国内短信。
1：表示国际/港澳台短信。
     * @param International 是否国际/港澳台短信：
0：表示国内短信。
1：表示国际/港澳台短信。
     */
    public void setInternational(Long International) {
        this.International = International;
    }

    /**
     * Get 短信模板标签 
     * @return Remark 短信模板标签
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 短信模板标签
     * @param Remark 短信模板标签
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 发送短信活动时配置的落地链接地址,仅用作短信活动 
     * @return Urls 发送短信活动时配置的落地链接地址,仅用作短信活动
     */
    public String [] getUrls() {
        return this.Urls;
    }

    /**
     * Set 发送短信活动时配置的落地链接地址,仅用作短信活动
     * @param Urls 发送短信活动时配置的落地链接地址,仅用作短信活动
     */
    public void setUrls(String [] Urls) {
        this.Urls = Urls;
    }

    /**
     * Get 发送短信活动时用于展示人群包动态参数模板占位符序号或接口发送时变量占位符序号 
     * @return CommonParams 发送短信活动时用于展示人群包动态参数模板占位符序号或接口发送时变量占位符序号
     */
    public Long [] getCommonParams() {
        return this.CommonParams;
    }

    /**
     * Set 发送短信活动时用于展示人群包动态参数模板占位符序号或接口发送时变量占位符序号
     * @param CommonParams 发送短信活动时用于展示人群包动态参数模板占位符序号或接口发送时变量占位符序号
     */
    public void setCommonParams(Long [] CommonParams) {
        this.CommonParams = CommonParams;
    }

    /**
     * Get 发送短信活动时用于展示短连接模板占位符序号,仅用作短信活动 
     * @return UrlParams 发送短信活动时用于展示短连接模板占位符序号,仅用作短信活动
     */
    public Long [] getUrlParams() {
        return this.UrlParams;
    }

    /**
     * Set 发送短信活动时用于展示短连接模板占位符序号,仅用作短信活动
     * @param UrlParams 发送短信活动时用于展示短连接模板占位符序号,仅用作短信活动
     */
    public void setUrlParams(Long [] UrlParams) {
        this.UrlParams = UrlParams;
    }

    public AddSmsTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddSmsTemplateRequest(AddSmsTemplateRequest source) {
        if (source.License != null) {
            this.License = new String(source.License);
        }
        if (source.SignID != null) {
            this.SignID = new Long(source.SignID);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.TemplateContent != null) {
            this.TemplateContent = new String(source.TemplateContent);
        }
        if (source.SmsType != null) {
            this.SmsType = new Long(source.SmsType);
        }
        if (source.International != null) {
            this.International = new Long(source.International);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Urls != null) {
            this.Urls = new String[source.Urls.length];
            for (int i = 0; i < source.Urls.length; i++) {
                this.Urls[i] = new String(source.Urls[i]);
            }
        }
        if (source.CommonParams != null) {
            this.CommonParams = new Long[source.CommonParams.length];
            for (int i = 0; i < source.CommonParams.length; i++) {
                this.CommonParams[i] = new Long(source.CommonParams[i]);
            }
        }
        if (source.UrlParams != null) {
            this.UrlParams = new Long[source.UrlParams.length];
            for (int i = 0; i < source.UrlParams.length; i++) {
                this.UrlParams[i] = new Long(source.UrlParams[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "License", this.License);
        this.setParamSimple(map, prefix + "SignID", this.SignID);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "TemplateContent", this.TemplateContent);
        this.setParamSimple(map, prefix + "SmsType", this.SmsType);
        this.setParamSimple(map, prefix + "International", this.International);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArraySimple(map, prefix + "Urls.", this.Urls);
        this.setParamArraySimple(map, prefix + "CommonParams.", this.CommonParams);
        this.setParamArraySimple(map, prefix + "UrlParams.", this.UrlParams);

    }
}

