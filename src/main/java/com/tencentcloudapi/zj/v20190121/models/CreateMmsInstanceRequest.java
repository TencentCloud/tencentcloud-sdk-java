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

public class CreateMmsInstanceRequest extends AbstractModel{

    /**
    * 商户证书
    */
    @SerializedName("License")
    @Expose
    private String License;

    /**
    * 样例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 标题
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 签名
    */
    @SerializedName("Sign")
    @Expose
    private String Sign;

    /**
    * 素材内容
    */
    @SerializedName("Contents")
    @Expose
    private CreateMmsInstanceItem [] Contents;

    /**
    * 样例中链接动态变量对应的链接，和占位符顺序一致
    */
    @SerializedName("Urls")
    @Expose
    private String [] Urls;

    /**
    * 机型列表
    */
    @SerializedName("PhoneType")
    @Expose
    private Long [] PhoneType;

    /**
    * 发送超短活动时用于展示人群包动态参数模板占位符序号或接口发送时变量占位符序号
    */
    @SerializedName("CommonParams")
    @Expose
    private Long [] CommonParams;

    /**
    * 发送超短活动时用于展示短连接模板占位符序号,仅用作超短活动
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
     * Get 样例名称 
     * @return InstanceName 样例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 样例名称
     * @param InstanceName 样例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 标题 
     * @return Title 标题
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 标题
     * @param Title 标题
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 签名 
     * @return Sign 签名
     */
    public String getSign() {
        return this.Sign;
    }

    /**
     * Set 签名
     * @param Sign 签名
     */
    public void setSign(String Sign) {
        this.Sign = Sign;
    }

    /**
     * Get 素材内容 
     * @return Contents 素材内容
     */
    public CreateMmsInstanceItem [] getContents() {
        return this.Contents;
    }

    /**
     * Set 素材内容
     * @param Contents 素材内容
     */
    public void setContents(CreateMmsInstanceItem [] Contents) {
        this.Contents = Contents;
    }

    /**
     * Get 样例中链接动态变量对应的链接，和占位符顺序一致 
     * @return Urls 样例中链接动态变量对应的链接，和占位符顺序一致
     */
    public String [] getUrls() {
        return this.Urls;
    }

    /**
     * Set 样例中链接动态变量对应的链接，和占位符顺序一致
     * @param Urls 样例中链接动态变量对应的链接，和占位符顺序一致
     */
    public void setUrls(String [] Urls) {
        this.Urls = Urls;
    }

    /**
     * Get 机型列表 
     * @return PhoneType 机型列表
     */
    public Long [] getPhoneType() {
        return this.PhoneType;
    }

    /**
     * Set 机型列表
     * @param PhoneType 机型列表
     */
    public void setPhoneType(Long [] PhoneType) {
        this.PhoneType = PhoneType;
    }

    /**
     * Get 发送超短活动时用于展示人群包动态参数模板占位符序号或接口发送时变量占位符序号 
     * @return CommonParams 发送超短活动时用于展示人群包动态参数模板占位符序号或接口发送时变量占位符序号
     */
    public Long [] getCommonParams() {
        return this.CommonParams;
    }

    /**
     * Set 发送超短活动时用于展示人群包动态参数模板占位符序号或接口发送时变量占位符序号
     * @param CommonParams 发送超短活动时用于展示人群包动态参数模板占位符序号或接口发送时变量占位符序号
     */
    public void setCommonParams(Long [] CommonParams) {
        this.CommonParams = CommonParams;
    }

    /**
     * Get 发送超短活动时用于展示短连接模板占位符序号,仅用作超短活动 
     * @return UrlParams 发送超短活动时用于展示短连接模板占位符序号,仅用作超短活动
     */
    public Long [] getUrlParams() {
        return this.UrlParams;
    }

    /**
     * Set 发送超短活动时用于展示短连接模板占位符序号,仅用作超短活动
     * @param UrlParams 发送超短活动时用于展示短连接模板占位符序号,仅用作超短活动
     */
    public void setUrlParams(Long [] UrlParams) {
        this.UrlParams = UrlParams;
    }

    public CreateMmsInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMmsInstanceRequest(CreateMmsInstanceRequest source) {
        if (source.License != null) {
            this.License = new String(source.License);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Sign != null) {
            this.Sign = new String(source.Sign);
        }
        if (source.Contents != null) {
            this.Contents = new CreateMmsInstanceItem[source.Contents.length];
            for (int i = 0; i < source.Contents.length; i++) {
                this.Contents[i] = new CreateMmsInstanceItem(source.Contents[i]);
            }
        }
        if (source.Urls != null) {
            this.Urls = new String[source.Urls.length];
            for (int i = 0; i < source.Urls.length; i++) {
                this.Urls[i] = new String(source.Urls[i]);
            }
        }
        if (source.PhoneType != null) {
            this.PhoneType = new Long[source.PhoneType.length];
            for (int i = 0; i < source.PhoneType.length; i++) {
                this.PhoneType[i] = new Long(source.PhoneType[i]);
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
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Sign", this.Sign);
        this.setParamArrayObj(map, prefix + "Contents.", this.Contents);
        this.setParamArraySimple(map, prefix + "Urls.", this.Urls);
        this.setParamArraySimple(map, prefix + "PhoneType.", this.PhoneType);
        this.setParamArraySimple(map, prefix + "CommonParams.", this.CommonParams);
        this.setParamArraySimple(map, prefix + "UrlParams.", this.UrlParams);

    }
}

