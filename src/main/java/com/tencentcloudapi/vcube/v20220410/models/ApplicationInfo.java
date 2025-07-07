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
package com.tencentcloudapi.vcube.v20220410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplicationInfo extends AbstractModel {

    /**
    * 应用名称
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * Ios应用的唯一标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * 应用类型，formal： 正式应用，test：测试应用
    */
    @SerializedName("AppType")
    @Expose
    private String AppType;

    /**
    * license数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Licenses")
    @Expose
    private License [] Licenses;

    /**
    * license 秘钥
    */
    @SerializedName("LicenseKey")
    @Expose
    private String LicenseKey;

    /**
    * 安卓应用的唯一标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
    * 创建时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 更新时间
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * 用户应用Id
    */
    @SerializedName("ApplicationId")
    @Expose
    private Long ApplicationId;

    /**
    * 视立方下载license的url
    */
    @SerializedName("LicenseUrl")
    @Expose
    private String LicenseUrl;

    /**
    * 优图美视信息列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("XMagics")
    @Expose
    private XMagicInfo [] XMagics;

    /**
    * Mac  进程名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MacBundleId")
    @Expose
    private String MacBundleId;

    /**
    * windows 进程名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WinProcessName")
    @Expose
    private String WinProcessName;

    /**
    * web端Domain列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DomainList")
    @Expose
    private String [] DomainList;

    /**
    * 账号AppId
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 扩展包名数量上限
    */
    @SerializedName("NameLimit")
    @Expose
    private Long NameLimit;

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
     * Get Ios应用的唯一标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BundleId Ios应用的唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set Ios应用的唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param BundleId Ios应用的唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get 应用类型，formal： 正式应用，test：测试应用 
     * @return AppType 应用类型，formal： 正式应用，test：测试应用
     */
    public String getAppType() {
        return this.AppType;
    }

    /**
     * Set 应用类型，formal： 正式应用，test：测试应用
     * @param AppType 应用类型，formal： 正式应用，test：测试应用
     */
    public void setAppType(String AppType) {
        this.AppType = AppType;
    }

    /**
     * Get license数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Licenses license数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public License [] getLicenses() {
        return this.Licenses;
    }

    /**
     * Set license数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param Licenses license数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLicenses(License [] Licenses) {
        this.Licenses = Licenses;
    }

    /**
     * Get license 秘钥 
     * @return LicenseKey license 秘钥
     */
    public String getLicenseKey() {
        return this.LicenseKey;
    }

    /**
     * Set license 秘钥
     * @param LicenseKey license 秘钥
     */
    public void setLicenseKey(String LicenseKey) {
        this.LicenseKey = LicenseKey;
    }

    /**
     * Get 安卓应用的唯一标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageName 安卓应用的唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set 安卓应用的唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageName 安卓应用的唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    /**
     * Get 创建时间 
     * @return CreatedAt 创建时间
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 创建时间
     * @param CreatedAt 创建时间
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 更新时间 
     * @return UpdatedAt 更新时间
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 更新时间
     * @param UpdatedAt 更新时间
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get 用户应用Id 
     * @return ApplicationId 用户应用Id
     */
    public Long getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 用户应用Id
     * @param ApplicationId 用户应用Id
     */
    public void setApplicationId(Long ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 视立方下载license的url 
     * @return LicenseUrl 视立方下载license的url
     */
    public String getLicenseUrl() {
        return this.LicenseUrl;
    }

    /**
     * Set 视立方下载license的url
     * @param LicenseUrl 视立方下载license的url
     */
    public void setLicenseUrl(String LicenseUrl) {
        this.LicenseUrl = LicenseUrl;
    }

    /**
     * Get 优图美视信息列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return XMagics 优图美视信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public XMagicInfo [] getXMagics() {
        return this.XMagics;
    }

    /**
     * Set 优图美视信息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param XMagics 优图美视信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setXMagics(XMagicInfo [] XMagics) {
        this.XMagics = XMagics;
    }

    /**
     * Get Mac  进程名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MacBundleId Mac  进程名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMacBundleId() {
        return this.MacBundleId;
    }

    /**
     * Set Mac  进程名
注意：此字段可能返回 null，表示取不到有效值。
     * @param MacBundleId Mac  进程名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMacBundleId(String MacBundleId) {
        this.MacBundleId = MacBundleId;
    }

    /**
     * Get windows 进程名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WinProcessName windows 进程名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWinProcessName() {
        return this.WinProcessName;
    }

    /**
     * Set windows 进程名
注意：此字段可能返回 null，表示取不到有效值。
     * @param WinProcessName windows 进程名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWinProcessName(String WinProcessName) {
        this.WinProcessName = WinProcessName;
    }

    /**
     * Get web端Domain列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DomainList web端Domain列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDomainList() {
        return this.DomainList;
    }

    /**
     * Set web端Domain列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param DomainList web端Domain列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomainList(String [] DomainList) {
        this.DomainList = DomainList;
    }

    /**
     * Get 账号AppId 
     * @return AppId 账号AppId
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 账号AppId
     * @param AppId 账号AppId
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 扩展包名数量上限 
     * @return NameLimit 扩展包名数量上限
     */
    public Long getNameLimit() {
        return this.NameLimit;
    }

    /**
     * Set 扩展包名数量上限
     * @param NameLimit 扩展包名数量上限
     */
    public void setNameLimit(Long NameLimit) {
        this.NameLimit = NameLimit;
    }

    public ApplicationInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplicationInfo(ApplicationInfo source) {
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.BundleId != null) {
            this.BundleId = new String(source.BundleId);
        }
        if (source.AppType != null) {
            this.AppType = new String(source.AppType);
        }
        if (source.Licenses != null) {
            this.Licenses = new License[source.Licenses.length];
            for (int i = 0; i < source.Licenses.length; i++) {
                this.Licenses[i] = new License(source.Licenses[i]);
            }
        }
        if (source.LicenseKey != null) {
            this.LicenseKey = new String(source.LicenseKey);
        }
        if (source.PackageName != null) {
            this.PackageName = new String(source.PackageName);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new Long(source.ApplicationId);
        }
        if (source.LicenseUrl != null) {
            this.LicenseUrl = new String(source.LicenseUrl);
        }
        if (source.XMagics != null) {
            this.XMagics = new XMagicInfo[source.XMagics.length];
            for (int i = 0; i < source.XMagics.length; i++) {
                this.XMagics[i] = new XMagicInfo(source.XMagics[i]);
            }
        }
        if (source.MacBundleId != null) {
            this.MacBundleId = new String(source.MacBundleId);
        }
        if (source.WinProcessName != null) {
            this.WinProcessName = new String(source.WinProcessName);
        }
        if (source.DomainList != null) {
            this.DomainList = new String[source.DomainList.length];
            for (int i = 0; i < source.DomainList.length; i++) {
                this.DomainList[i] = new String(source.DomainList[i]);
            }
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.NameLimit != null) {
            this.NameLimit = new Long(source.NameLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "AppType", this.AppType);
        this.setParamArrayObj(map, prefix + "Licenses.", this.Licenses);
        this.setParamSimple(map, prefix + "LicenseKey", this.LicenseKey);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "LicenseUrl", this.LicenseUrl);
        this.setParamArrayObj(map, prefix + "XMagics.", this.XMagics);
        this.setParamSimple(map, prefix + "MacBundleId", this.MacBundleId);
        this.setParamSimple(map, prefix + "WinProcessName", this.WinProcessName);
        this.setParamArraySimple(map, prefix + "DomainList.", this.DomainList);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "NameLimit", this.NameLimit);

    }
}

