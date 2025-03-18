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

public class ModifyApplicationRequest extends AbstractModel {

    /**
    * 应用ID
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
    * 关联的产品
    */
    @SerializedName("Products")
    @Expose
    private String Products;

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
    * TPNS服务iOS应用所属地域，广州：ap-guangzhou，上海：ap-shanghai，中国香港：ap-hongkong，新加坡：ap-singapore。
    */
    @SerializedName("TPNSiOSRegion")
    @Expose
    private String TPNSiOSRegion;

    /**
    * TPNS服务Android应用所属地域，广州：ap-guangzhou，上海：ap-shanghai，中国香港：ap-hongkong，新加坡：ap-singapore。
    */
    @SerializedName("TPNSAndroidRegion")
    @Expose
    private String TPNSAndroidRegion;

    /**
    * TurnKey小程序托管
    */
    @SerializedName("TurnKeySwitch")
    @Expose
    private Long TurnKeySwitch;

    /**
     * Get 应用ID 
     * @return IotAppID 应用ID
     */
    public String getIotAppID() {
        return this.IotAppID;
    }

    /**
     * Set 应用ID
     * @param IotAppID 应用ID
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
     * Get 关联的产品 
     * @return Products 关联的产品
     */
    public String getProducts() {
        return this.Products;
    }

    /**
     * Set 关联的产品
     * @param Products 关联的产品
     */
    public void setProducts(String Products) {
        this.Products = Products;
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
     * Get TPNS服务iOS应用所属地域，广州：ap-guangzhou，上海：ap-shanghai，中国香港：ap-hongkong，新加坡：ap-singapore。 
     * @return TPNSiOSRegion TPNS服务iOS应用所属地域，广州：ap-guangzhou，上海：ap-shanghai，中国香港：ap-hongkong，新加坡：ap-singapore。
     */
    public String getTPNSiOSRegion() {
        return this.TPNSiOSRegion;
    }

    /**
     * Set TPNS服务iOS应用所属地域，广州：ap-guangzhou，上海：ap-shanghai，中国香港：ap-hongkong，新加坡：ap-singapore。
     * @param TPNSiOSRegion TPNS服务iOS应用所属地域，广州：ap-guangzhou，上海：ap-shanghai，中国香港：ap-hongkong，新加坡：ap-singapore。
     */
    public void setTPNSiOSRegion(String TPNSiOSRegion) {
        this.TPNSiOSRegion = TPNSiOSRegion;
    }

    /**
     * Get TPNS服务Android应用所属地域，广州：ap-guangzhou，上海：ap-shanghai，中国香港：ap-hongkong，新加坡：ap-singapore。 
     * @return TPNSAndroidRegion TPNS服务Android应用所属地域，广州：ap-guangzhou，上海：ap-shanghai，中国香港：ap-hongkong，新加坡：ap-singapore。
     */
    public String getTPNSAndroidRegion() {
        return this.TPNSAndroidRegion;
    }

    /**
     * Set TPNS服务Android应用所属地域，广州：ap-guangzhou，上海：ap-shanghai，中国香港：ap-hongkong，新加坡：ap-singapore。
     * @param TPNSAndroidRegion TPNS服务Android应用所属地域，广州：ap-guangzhou，上海：ap-shanghai，中国香港：ap-hongkong，新加坡：ap-singapore。
     */
    public void setTPNSAndroidRegion(String TPNSAndroidRegion) {
        this.TPNSAndroidRegion = TPNSAndroidRegion;
    }

    /**
     * Get TurnKey小程序托管 
     * @return TurnKeySwitch TurnKey小程序托管
     */
    public Long getTurnKeySwitch() {
        return this.TurnKeySwitch;
    }

    /**
     * Set TurnKey小程序托管
     * @param TurnKeySwitch TurnKey小程序托管
     */
    public void setTurnKeySwitch(Long TurnKeySwitch) {
        this.TurnKeySwitch = TurnKeySwitch;
    }

    public ModifyApplicationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyApplicationRequest(ModifyApplicationRequest source) {
        if (source.IotAppID != null) {
            this.IotAppID = new String(source.IotAppID);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Products != null) {
            this.Products = new String(source.Products);
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
        if (source.TurnKeySwitch != null) {
            this.TurnKeySwitch = new Long(source.TurnKeySwitch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IotAppID", this.IotAppID);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Products", this.Products);
        this.setParamSimple(map, prefix + "PushSecretID", this.PushSecretID);
        this.setParamSimple(map, prefix + "PushSecretKey", this.PushSecretKey);
        this.setParamSimple(map, prefix + "PushEnvironment", this.PushEnvironment);
        this.setParamSimple(map, prefix + "TPNSiOSAccessID", this.TPNSiOSAccessID);
        this.setParamSimple(map, prefix + "TPNSiOSSecretKey", this.TPNSiOSSecretKey);
        this.setParamSimple(map, prefix + "TPNSiOSPushEnvironment", this.TPNSiOSPushEnvironment);
        this.setParamSimple(map, prefix + "TPNSAndroidAccessID", this.TPNSAndroidAccessID);
        this.setParamSimple(map, prefix + "TPNSAndroidSecretKey", this.TPNSAndroidSecretKey);
        this.setParamSimple(map, prefix + "TPNSiOSRegion", this.TPNSiOSRegion);
        this.setParamSimple(map, prefix + "TPNSAndroidRegion", this.TPNSAndroidRegion);
        this.setParamSimple(map, prefix + "TurnKeySwitch", this.TurnKeySwitch);

    }
}

