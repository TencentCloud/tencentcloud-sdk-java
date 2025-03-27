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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IotApplication extends AbstractModel {

    /**
    * 应用 ID
    */
    @SerializedName("IotAppID")
    @Expose
    private String IotAppID;

    /**
    * 应用名称
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 应用说明
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 开发模式
    */
    @SerializedName("DevMode")
    @Expose
    private Long DevMode;

    /**
    * iOS 平台 AppKey
    */
    @SerializedName("IOSAppKey")
    @Expose
    private String IOSAppKey;

    /**
    * iOS 平台 AppSecret
    */
    @SerializedName("IOSAppSecret")
    @Expose
    private String IOSAppSecret;

    /**
    * Android 平台 AppKey
    */
    @SerializedName("AndroidAppKey")
    @Expose
    private String AndroidAppKey;

    /**
    * Android 平台 AppSecret
    */
    @SerializedName("AndroidAppSecret")
    @Expose
    private String AndroidAppSecret;

    /**
    * 绑定的产品列表，数据为：ProdcutID 数组 JSON 序列化后的字符串
    */
    @SerializedName("Products")
    @Expose
    private String Products;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 信鸽推送APP ID
    */
    @SerializedName("PushSecretID")
    @Expose
    private String PushSecretID;

    /**
    * 信鸽推送SECRET KEY
    */
    @SerializedName("PushSecretKey")
    @Expose
    private String PushSecretKey;

    /**
    * iOS平台推送环境
    */
    @SerializedName("PushEnvironment")
    @Expose
    private String PushEnvironment;

    /**
    * 小程序平台 AppKey
    */
    @SerializedName("MiniProgramAppKey")
    @Expose
    private String MiniProgramAppKey;

    /**
    * 小程序平台 AppSecret
    */
    @SerializedName("MiniProgramAppSecret")
    @Expose
    private String MiniProgramAppSecret;

    /**
    * TPNS服务iOS应用AccessID，TPNS全称为腾讯移动推送（Tencent Push Notification Service），详见：https://cloud.tencent.com/document/product/548
    */
    @SerializedName("TPNSiOSAccessID")
    @Expose
    private String TPNSiOSAccessID;

    /**
    * TPNS服务iOS应用SecretKey
    */
    @SerializedName("TPNSiOSSecretKey")
    @Expose
    private String TPNSiOSSecretKey;

    /**
    * TPNS服务iOS应用推送环境
    */
    @SerializedName("TPNSiOSPushEnvironment")
    @Expose
    private String TPNSiOSPushEnvironment;

    /**
    * TPNS服务Android应用AccessID
    */
    @SerializedName("TPNSAndroidAccessID")
    @Expose
    private String TPNSAndroidAccessID;

    /**
    * TPNS服务Android应用SecretKey
    */
    @SerializedName("TPNSAndroidSecretKey")
    @Expose
    private String TPNSAndroidSecretKey;

    /**
    * TPNS服务iOS应用所属地域，详细说明参见 ModifyApplication 同名入参。
    */
    @SerializedName("TPNSiOSRegion")
    @Expose
    private String TPNSiOSRegion;

    /**
    * TPNS服务Android应用所属地域，详细说明参见 ModifyApplication 同名入参。
    */
    @SerializedName("TPNSAndroidRegion")
    @Expose
    private String TPNSAndroidRegion;

    /**
    * 自主短信配置APPID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SelfSmsAppId")
    @Expose
    private String SelfSmsAppId;

    /**
    * 自主短信配置APPKey
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SelfSmsAppKey")
    @Expose
    private String SelfSmsAppKey;

    /**
    * 自主短信配置签名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SelfSmsSign")
    @Expose
    private String SelfSmsSign;

    /**
    * 自主短信配置模板ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SelfSmsTemplateId")
    @Expose
    private Long SelfSmsTemplateId;

    /**
    * 第三方小程序强提醒开关 0：关闭；1：开启
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WechatNotifyStatus")
    @Expose
    private Long WechatNotifyStatus;

    /**
    * 互联互通产品ID列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InterconnectionProducts")
    @Expose
    private String InterconnectionProducts;

    /**
     * Get 应用 ID 
     * @return IotAppID 应用 ID
     */
    public String getIotAppID() {
        return this.IotAppID;
    }

    /**
     * Set 应用 ID
     * @param IotAppID 应用 ID
     */
    public void setIotAppID(String IotAppID) {
        this.IotAppID = IotAppID;
    }

    /**
     * Get 应用名称 
     * @return AppName 应用名称
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 应用名称
     * @param AppName 应用名称
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 应用说明 
     * @return Description 应用说明
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 应用说明
     * @param Description 应用说明
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 开发模式 
     * @return DevMode 开发模式
     */
    public Long getDevMode() {
        return this.DevMode;
    }

    /**
     * Set 开发模式
     * @param DevMode 开发模式
     */
    public void setDevMode(Long DevMode) {
        this.DevMode = DevMode;
    }

    /**
     * Get iOS 平台 AppKey 
     * @return IOSAppKey iOS 平台 AppKey
     */
    public String getIOSAppKey() {
        return this.IOSAppKey;
    }

    /**
     * Set iOS 平台 AppKey
     * @param IOSAppKey iOS 平台 AppKey
     */
    public void setIOSAppKey(String IOSAppKey) {
        this.IOSAppKey = IOSAppKey;
    }

    /**
     * Get iOS 平台 AppSecret 
     * @return IOSAppSecret iOS 平台 AppSecret
     */
    public String getIOSAppSecret() {
        return this.IOSAppSecret;
    }

    /**
     * Set iOS 平台 AppSecret
     * @param IOSAppSecret iOS 平台 AppSecret
     */
    public void setIOSAppSecret(String IOSAppSecret) {
        this.IOSAppSecret = IOSAppSecret;
    }

    /**
     * Get Android 平台 AppKey 
     * @return AndroidAppKey Android 平台 AppKey
     */
    public String getAndroidAppKey() {
        return this.AndroidAppKey;
    }

    /**
     * Set Android 平台 AppKey
     * @param AndroidAppKey Android 平台 AppKey
     */
    public void setAndroidAppKey(String AndroidAppKey) {
        this.AndroidAppKey = AndroidAppKey;
    }

    /**
     * Get Android 平台 AppSecret 
     * @return AndroidAppSecret Android 平台 AppSecret
     */
    public String getAndroidAppSecret() {
        return this.AndroidAppSecret;
    }

    /**
     * Set Android 平台 AppSecret
     * @param AndroidAppSecret Android 平台 AppSecret
     */
    public void setAndroidAppSecret(String AndroidAppSecret) {
        this.AndroidAppSecret = AndroidAppSecret;
    }

    /**
     * Get 绑定的产品列表，数据为：ProdcutID 数组 JSON 序列化后的字符串 
     * @return Products 绑定的产品列表，数据为：ProdcutID 数组 JSON 序列化后的字符串
     */
    public String getProducts() {
        return this.Products;
    }

    /**
     * Set 绑定的产品列表，数据为：ProdcutID 数组 JSON 序列化后的字符串
     * @param Products 绑定的产品列表，数据为：ProdcutID 数组 JSON 序列化后的字符串
     */
    public void setProducts(String Products) {
        this.Products = Products;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 信鸽推送APP ID 
     * @return PushSecretID 信鸽推送APP ID
     */
    public String getPushSecretID() {
        return this.PushSecretID;
    }

    /**
     * Set 信鸽推送APP ID
     * @param PushSecretID 信鸽推送APP ID
     */
    public void setPushSecretID(String PushSecretID) {
        this.PushSecretID = PushSecretID;
    }

    /**
     * Get 信鸽推送SECRET KEY 
     * @return PushSecretKey 信鸽推送SECRET KEY
     */
    public String getPushSecretKey() {
        return this.PushSecretKey;
    }

    /**
     * Set 信鸽推送SECRET KEY
     * @param PushSecretKey 信鸽推送SECRET KEY
     */
    public void setPushSecretKey(String PushSecretKey) {
        this.PushSecretKey = PushSecretKey;
    }

    /**
     * Get iOS平台推送环境 
     * @return PushEnvironment iOS平台推送环境
     */
    public String getPushEnvironment() {
        return this.PushEnvironment;
    }

    /**
     * Set iOS平台推送环境
     * @param PushEnvironment iOS平台推送环境
     */
    public void setPushEnvironment(String PushEnvironment) {
        this.PushEnvironment = PushEnvironment;
    }

    /**
     * Get 小程序平台 AppKey 
     * @return MiniProgramAppKey 小程序平台 AppKey
     */
    public String getMiniProgramAppKey() {
        return this.MiniProgramAppKey;
    }

    /**
     * Set 小程序平台 AppKey
     * @param MiniProgramAppKey 小程序平台 AppKey
     */
    public void setMiniProgramAppKey(String MiniProgramAppKey) {
        this.MiniProgramAppKey = MiniProgramAppKey;
    }

    /**
     * Get 小程序平台 AppSecret 
     * @return MiniProgramAppSecret 小程序平台 AppSecret
     */
    public String getMiniProgramAppSecret() {
        return this.MiniProgramAppSecret;
    }

    /**
     * Set 小程序平台 AppSecret
     * @param MiniProgramAppSecret 小程序平台 AppSecret
     */
    public void setMiniProgramAppSecret(String MiniProgramAppSecret) {
        this.MiniProgramAppSecret = MiniProgramAppSecret;
    }

    /**
     * Get TPNS服务iOS应用AccessID，TPNS全称为腾讯移动推送（Tencent Push Notification Service），详见：https://cloud.tencent.com/document/product/548 
     * @return TPNSiOSAccessID TPNS服务iOS应用AccessID，TPNS全称为腾讯移动推送（Tencent Push Notification Service），详见：https://cloud.tencent.com/document/product/548
     */
    public String getTPNSiOSAccessID() {
        return this.TPNSiOSAccessID;
    }

    /**
     * Set TPNS服务iOS应用AccessID，TPNS全称为腾讯移动推送（Tencent Push Notification Service），详见：https://cloud.tencent.com/document/product/548
     * @param TPNSiOSAccessID TPNS服务iOS应用AccessID，TPNS全称为腾讯移动推送（Tencent Push Notification Service），详见：https://cloud.tencent.com/document/product/548
     */
    public void setTPNSiOSAccessID(String TPNSiOSAccessID) {
        this.TPNSiOSAccessID = TPNSiOSAccessID;
    }

    /**
     * Get TPNS服务iOS应用SecretKey 
     * @return TPNSiOSSecretKey TPNS服务iOS应用SecretKey
     */
    public String getTPNSiOSSecretKey() {
        return this.TPNSiOSSecretKey;
    }

    /**
     * Set TPNS服务iOS应用SecretKey
     * @param TPNSiOSSecretKey TPNS服务iOS应用SecretKey
     */
    public void setTPNSiOSSecretKey(String TPNSiOSSecretKey) {
        this.TPNSiOSSecretKey = TPNSiOSSecretKey;
    }

    /**
     * Get TPNS服务iOS应用推送环境 
     * @return TPNSiOSPushEnvironment TPNS服务iOS应用推送环境
     */
    public String getTPNSiOSPushEnvironment() {
        return this.TPNSiOSPushEnvironment;
    }

    /**
     * Set TPNS服务iOS应用推送环境
     * @param TPNSiOSPushEnvironment TPNS服务iOS应用推送环境
     */
    public void setTPNSiOSPushEnvironment(String TPNSiOSPushEnvironment) {
        this.TPNSiOSPushEnvironment = TPNSiOSPushEnvironment;
    }

    /**
     * Get TPNS服务Android应用AccessID 
     * @return TPNSAndroidAccessID TPNS服务Android应用AccessID
     */
    public String getTPNSAndroidAccessID() {
        return this.TPNSAndroidAccessID;
    }

    /**
     * Set TPNS服务Android应用AccessID
     * @param TPNSAndroidAccessID TPNS服务Android应用AccessID
     */
    public void setTPNSAndroidAccessID(String TPNSAndroidAccessID) {
        this.TPNSAndroidAccessID = TPNSAndroidAccessID;
    }

    /**
     * Get TPNS服务Android应用SecretKey 
     * @return TPNSAndroidSecretKey TPNS服务Android应用SecretKey
     */
    public String getTPNSAndroidSecretKey() {
        return this.TPNSAndroidSecretKey;
    }

    /**
     * Set TPNS服务Android应用SecretKey
     * @param TPNSAndroidSecretKey TPNS服务Android应用SecretKey
     */
    public void setTPNSAndroidSecretKey(String TPNSAndroidSecretKey) {
        this.TPNSAndroidSecretKey = TPNSAndroidSecretKey;
    }

    /**
     * Get TPNS服务iOS应用所属地域，详细说明参见 ModifyApplication 同名入参。 
     * @return TPNSiOSRegion TPNS服务iOS应用所属地域，详细说明参见 ModifyApplication 同名入参。
     */
    public String getTPNSiOSRegion() {
        return this.TPNSiOSRegion;
    }

    /**
     * Set TPNS服务iOS应用所属地域，详细说明参见 ModifyApplication 同名入参。
     * @param TPNSiOSRegion TPNS服务iOS应用所属地域，详细说明参见 ModifyApplication 同名入参。
     */
    public void setTPNSiOSRegion(String TPNSiOSRegion) {
        this.TPNSiOSRegion = TPNSiOSRegion;
    }

    /**
     * Get TPNS服务Android应用所属地域，详细说明参见 ModifyApplication 同名入参。 
     * @return TPNSAndroidRegion TPNS服务Android应用所属地域，详细说明参见 ModifyApplication 同名入参。
     */
    public String getTPNSAndroidRegion() {
        return this.TPNSAndroidRegion;
    }

    /**
     * Set TPNS服务Android应用所属地域，详细说明参见 ModifyApplication 同名入参。
     * @param TPNSAndroidRegion TPNS服务Android应用所属地域，详细说明参见 ModifyApplication 同名入参。
     */
    public void setTPNSAndroidRegion(String TPNSAndroidRegion) {
        this.TPNSAndroidRegion = TPNSAndroidRegion;
    }

    /**
     * Get 自主短信配置APPID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SelfSmsAppId 自主短信配置APPID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSelfSmsAppId() {
        return this.SelfSmsAppId;
    }

    /**
     * Set 自主短信配置APPID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SelfSmsAppId 自主短信配置APPID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSelfSmsAppId(String SelfSmsAppId) {
        this.SelfSmsAppId = SelfSmsAppId;
    }

    /**
     * Get 自主短信配置APPKey
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SelfSmsAppKey 自主短信配置APPKey
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSelfSmsAppKey() {
        return this.SelfSmsAppKey;
    }

    /**
     * Set 自主短信配置APPKey
注意：此字段可能返回 null，表示取不到有效值。
     * @param SelfSmsAppKey 自主短信配置APPKey
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSelfSmsAppKey(String SelfSmsAppKey) {
        this.SelfSmsAppKey = SelfSmsAppKey;
    }

    /**
     * Get 自主短信配置签名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SelfSmsSign 自主短信配置签名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSelfSmsSign() {
        return this.SelfSmsSign;
    }

    /**
     * Set 自主短信配置签名
注意：此字段可能返回 null，表示取不到有效值。
     * @param SelfSmsSign 自主短信配置签名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSelfSmsSign(String SelfSmsSign) {
        this.SelfSmsSign = SelfSmsSign;
    }

    /**
     * Get 自主短信配置模板ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SelfSmsTemplateId 自主短信配置模板ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSelfSmsTemplateId() {
        return this.SelfSmsTemplateId;
    }

    /**
     * Set 自主短信配置模板ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SelfSmsTemplateId 自主短信配置模板ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSelfSmsTemplateId(Long SelfSmsTemplateId) {
        this.SelfSmsTemplateId = SelfSmsTemplateId;
    }

    /**
     * Get 第三方小程序强提醒开关 0：关闭；1：开启
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WechatNotifyStatus 第三方小程序强提醒开关 0：关闭；1：开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWechatNotifyStatus() {
        return this.WechatNotifyStatus;
    }

    /**
     * Set 第三方小程序强提醒开关 0：关闭；1：开启
注意：此字段可能返回 null，表示取不到有效值。
     * @param WechatNotifyStatus 第三方小程序强提醒开关 0：关闭；1：开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWechatNotifyStatus(Long WechatNotifyStatus) {
        this.WechatNotifyStatus = WechatNotifyStatus;
    }

    /**
     * Get 互联互通产品ID列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InterconnectionProducts 互联互通产品ID列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInterconnectionProducts() {
        return this.InterconnectionProducts;
    }

    /**
     * Set 互联互通产品ID列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param InterconnectionProducts 互联互通产品ID列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInterconnectionProducts(String InterconnectionProducts) {
        this.InterconnectionProducts = InterconnectionProducts;
    }

    public IotApplication() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IotApplication(IotApplication source) {
        if (source.IotAppID != null) {
            this.IotAppID = new String(source.IotAppID);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DevMode != null) {
            this.DevMode = new Long(source.DevMode);
        }
        if (source.IOSAppKey != null) {
            this.IOSAppKey = new String(source.IOSAppKey);
        }
        if (source.IOSAppSecret != null) {
            this.IOSAppSecret = new String(source.IOSAppSecret);
        }
        if (source.AndroidAppKey != null) {
            this.AndroidAppKey = new String(source.AndroidAppKey);
        }
        if (source.AndroidAppSecret != null) {
            this.AndroidAppSecret = new String(source.AndroidAppSecret);
        }
        if (source.Products != null) {
            this.Products = new String(source.Products);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PushSecretID != null) {
            this.PushSecretID = new String(source.PushSecretID);
        }
        if (source.PushSecretKey != null) {
            this.PushSecretKey = new String(source.PushSecretKey);
        }
        if (source.PushEnvironment != null) {
            this.PushEnvironment = new String(source.PushEnvironment);
        }
        if (source.MiniProgramAppKey != null) {
            this.MiniProgramAppKey = new String(source.MiniProgramAppKey);
        }
        if (source.MiniProgramAppSecret != null) {
            this.MiniProgramAppSecret = new String(source.MiniProgramAppSecret);
        }
        if (source.TPNSiOSAccessID != null) {
            this.TPNSiOSAccessID = new String(source.TPNSiOSAccessID);
        }
        if (source.TPNSiOSSecretKey != null) {
            this.TPNSiOSSecretKey = new String(source.TPNSiOSSecretKey);
        }
        if (source.TPNSiOSPushEnvironment != null) {
            this.TPNSiOSPushEnvironment = new String(source.TPNSiOSPushEnvironment);
        }
        if (source.TPNSAndroidAccessID != null) {
            this.TPNSAndroidAccessID = new String(source.TPNSAndroidAccessID);
        }
        if (source.TPNSAndroidSecretKey != null) {
            this.TPNSAndroidSecretKey = new String(source.TPNSAndroidSecretKey);
        }
        if (source.TPNSiOSRegion != null) {
            this.TPNSiOSRegion = new String(source.TPNSiOSRegion);
        }
        if (source.TPNSAndroidRegion != null) {
            this.TPNSAndroidRegion = new String(source.TPNSAndroidRegion);
        }
        if (source.SelfSmsAppId != null) {
            this.SelfSmsAppId = new String(source.SelfSmsAppId);
        }
        if (source.SelfSmsAppKey != null) {
            this.SelfSmsAppKey = new String(source.SelfSmsAppKey);
        }
        if (source.SelfSmsSign != null) {
            this.SelfSmsSign = new String(source.SelfSmsSign);
        }
        if (source.SelfSmsTemplateId != null) {
            this.SelfSmsTemplateId = new Long(source.SelfSmsTemplateId);
        }
        if (source.WechatNotifyStatus != null) {
            this.WechatNotifyStatus = new Long(source.WechatNotifyStatus);
        }
        if (source.InterconnectionProducts != null) {
            this.InterconnectionProducts = new String(source.InterconnectionProducts);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IotAppID", this.IotAppID);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "DevMode", this.DevMode);
        this.setParamSimple(map, prefix + "IOSAppKey", this.IOSAppKey);
        this.setParamSimple(map, prefix + "IOSAppSecret", this.IOSAppSecret);
        this.setParamSimple(map, prefix + "AndroidAppKey", this.AndroidAppKey);
        this.setParamSimple(map, prefix + "AndroidAppSecret", this.AndroidAppSecret);
        this.setParamSimple(map, prefix + "Products", this.Products);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PushSecretID", this.PushSecretID);
        this.setParamSimple(map, prefix + "PushSecretKey", this.PushSecretKey);
        this.setParamSimple(map, prefix + "PushEnvironment", this.PushEnvironment);
        this.setParamSimple(map, prefix + "MiniProgramAppKey", this.MiniProgramAppKey);
        this.setParamSimple(map, prefix + "MiniProgramAppSecret", this.MiniProgramAppSecret);
        this.setParamSimple(map, prefix + "TPNSiOSAccessID", this.TPNSiOSAccessID);
        this.setParamSimple(map, prefix + "TPNSiOSSecretKey", this.TPNSiOSSecretKey);
        this.setParamSimple(map, prefix + "TPNSiOSPushEnvironment", this.TPNSiOSPushEnvironment);
        this.setParamSimple(map, prefix + "TPNSAndroidAccessID", this.TPNSAndroidAccessID);
        this.setParamSimple(map, prefix + "TPNSAndroidSecretKey", this.TPNSAndroidSecretKey);
        this.setParamSimple(map, prefix + "TPNSiOSRegion", this.TPNSiOSRegion);
        this.setParamSimple(map, prefix + "TPNSAndroidRegion", this.TPNSAndroidRegion);
        this.setParamSimple(map, prefix + "SelfSmsAppId", this.SelfSmsAppId);
        this.setParamSimple(map, prefix + "SelfSmsAppKey", this.SelfSmsAppKey);
        this.setParamSimple(map, prefix + "SelfSmsSign", this.SelfSmsSign);
        this.setParamSimple(map, prefix + "SelfSmsTemplateId", this.SelfSmsTemplateId);
        this.setParamSimple(map, prefix + "WechatNotifyStatus", this.WechatNotifyStatus);
        this.setParamSimple(map, prefix + "InterconnectionProducts", this.InterconnectionProducts);

    }
}

