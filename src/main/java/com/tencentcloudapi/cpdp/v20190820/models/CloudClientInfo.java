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

public class CloudClientInfo extends AbstractModel{

    /**
    * 场景类型。
wechat_ecommerce渠道 - h5支付方式，此字段必填；
枚举值：
CLIENT_TYPE_UNKNOWN 未知;
CLIENT_TYPE_IOS ios系统;
CLIENT_TYPE_ANDROID 安卓系统;
CLIENT_TYPE_WAP WAP场景;
CLIENT_TYPE_H5 H5场景;
    */
    @SerializedName("ClientType")
    @Expose
    private String ClientType;

    /**
    * 应用名称。
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 网站URL。
    */
    @SerializedName("AppUrl")
    @Expose
    private String AppUrl;

    /**
    * IOS平台BundleID。
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * Android平台PackageName
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
     * Get 场景类型。
wechat_ecommerce渠道 - h5支付方式，此字段必填；
枚举值：
CLIENT_TYPE_UNKNOWN 未知;
CLIENT_TYPE_IOS ios系统;
CLIENT_TYPE_ANDROID 安卓系统;
CLIENT_TYPE_WAP WAP场景;
CLIENT_TYPE_H5 H5场景; 
     * @return ClientType 场景类型。
wechat_ecommerce渠道 - h5支付方式，此字段必填；
枚举值：
CLIENT_TYPE_UNKNOWN 未知;
CLIENT_TYPE_IOS ios系统;
CLIENT_TYPE_ANDROID 安卓系统;
CLIENT_TYPE_WAP WAP场景;
CLIENT_TYPE_H5 H5场景;
     */
    public String getClientType() {
        return this.ClientType;
    }

    /**
     * Set 场景类型。
wechat_ecommerce渠道 - h5支付方式，此字段必填；
枚举值：
CLIENT_TYPE_UNKNOWN 未知;
CLIENT_TYPE_IOS ios系统;
CLIENT_TYPE_ANDROID 安卓系统;
CLIENT_TYPE_WAP WAP场景;
CLIENT_TYPE_H5 H5场景;
     * @param ClientType 场景类型。
wechat_ecommerce渠道 - h5支付方式，此字段必填；
枚举值：
CLIENT_TYPE_UNKNOWN 未知;
CLIENT_TYPE_IOS ios系统;
CLIENT_TYPE_ANDROID 安卓系统;
CLIENT_TYPE_WAP WAP场景;
CLIENT_TYPE_H5 H5场景;
     */
    public void setClientType(String ClientType) {
        this.ClientType = ClientType;
    }

    /**
     * Get 应用名称。 
     * @return AppName 应用名称。
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 应用名称。
     * @param AppName 应用名称。
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 网站URL。 
     * @return AppUrl 网站URL。
     */
    public String getAppUrl() {
        return this.AppUrl;
    }

    /**
     * Set 网站URL。
     * @param AppUrl 网站URL。
     */
    public void setAppUrl(String AppUrl) {
        this.AppUrl = AppUrl;
    }

    /**
     * Get IOS平台BundleID。 
     * @return BundleId IOS平台BundleID。
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set IOS平台BundleID。
     * @param BundleId IOS平台BundleID。
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get Android平台PackageName 
     * @return PackageName Android平台PackageName
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set Android平台PackageName
     * @param PackageName Android平台PackageName
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    public CloudClientInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudClientInfo(CloudClientInfo source) {
        if (source.ClientType != null) {
            this.ClientType = new String(source.ClientType);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.AppUrl != null) {
            this.AppUrl = new String(source.AppUrl);
        }
        if (source.BundleId != null) {
            this.BundleId = new String(source.BundleId);
        }
        if (source.PackageName != null) {
            this.PackageName = new String(source.PackageName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientType", this.ClientType);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "AppUrl", this.AppUrl);
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);

    }
}

