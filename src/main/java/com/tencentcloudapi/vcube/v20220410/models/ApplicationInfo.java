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
    * <p>应用名称</p>
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * <p>Ios应用的唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * <p>应用类型，formal： 正式应用，test：测试应用</p>
    */
    @SerializedName("AppType")
    @Expose
    private String AppType;

    /**
    * <p>license数组</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Licenses")
    @Expose
    private License [] Licenses;

    /**
    * <p>license 秘钥</p>
    */
    @SerializedName("LicenseKey")
    @Expose
    private String LicenseKey;

    /**
    * <p>安卓应用的唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * <p>用户应用Id</p>
    */
    @SerializedName("ApplicationId")
    @Expose
    private Long ApplicationId;

    /**
    * <p>视立方下载license的url</p>
    */
    @SerializedName("LicenseUrl")
    @Expose
    private String LicenseUrl;

    /**
    * <p>优图美视信息列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("XMagics")
    @Expose
    private XMagicInfo [] XMagics;

    /**
    * <p>Mac  进程名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MacBundleId")
    @Expose
    private String MacBundleId;

    /**
    * <p>windows 进程名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WinProcessName")
    @Expose
    private String WinProcessName;

    /**
    * <p>web端Domain列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DomainList")
    @Expose
    private String [] DomainList;

    /**
    * <p>账号AppId</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>扩展包名数量上限</p>
    */
    @SerializedName("NameLimit")
    @Expose
    private Long NameLimit;

    /**
    * <p>linux 进程名</p>
    */
    @SerializedName("LinuxProcessName")
    @Expose
    private String LinuxProcessName;

    /**
     * Get <p>应用名称</p> 
     * @return AppName <p>应用名称</p>
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set <p>应用名称</p>
     * @param AppName <p>应用名称</p>
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get <p>Ios应用的唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BundleId <p>Ios应用的唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set <p>Ios应用的唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BundleId <p>Ios应用的唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get <p>应用类型，formal： 正式应用，test：测试应用</p> 
     * @return AppType <p>应用类型，formal： 正式应用，test：测试应用</p>
     */
    public String getAppType() {
        return this.AppType;
    }

    /**
     * Set <p>应用类型，formal： 正式应用，test：测试应用</p>
     * @param AppType <p>应用类型，formal： 正式应用，test：测试应用</p>
     */
    public void setAppType(String AppType) {
        this.AppType = AppType;
    }

    /**
     * Get <p>license数组</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Licenses <p>license数组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public License [] getLicenses() {
        return this.Licenses;
    }

    /**
     * Set <p>license数组</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Licenses <p>license数组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLicenses(License [] Licenses) {
        this.Licenses = Licenses;
    }

    /**
     * Get <p>license 秘钥</p> 
     * @return LicenseKey <p>license 秘钥</p>
     */
    public String getLicenseKey() {
        return this.LicenseKey;
    }

    /**
     * Set <p>license 秘钥</p>
     * @param LicenseKey <p>license 秘钥</p>
     */
    public void setLicenseKey(String LicenseKey) {
        this.LicenseKey = LicenseKey;
    }

    /**
     * Get <p>安卓应用的唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageName <p>安卓应用的唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set <p>安卓应用的唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageName <p>安卓应用的唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreatedAt <p>创建时间</p>
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreatedAt <p>创建时间</p>
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdatedAt <p>更新时间</p>
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdatedAt <p>更新时间</p>
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get <p>用户应用Id</p> 
     * @return ApplicationId <p>用户应用Id</p>
     */
    public Long getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set <p>用户应用Id</p>
     * @param ApplicationId <p>用户应用Id</p>
     */
    public void setApplicationId(Long ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get <p>视立方下载license的url</p> 
     * @return LicenseUrl <p>视立方下载license的url</p>
     */
    public String getLicenseUrl() {
        return this.LicenseUrl;
    }

    /**
     * Set <p>视立方下载license的url</p>
     * @param LicenseUrl <p>视立方下载license的url</p>
     */
    public void setLicenseUrl(String LicenseUrl) {
        this.LicenseUrl = LicenseUrl;
    }

    /**
     * Get <p>优图美视信息列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return XMagics <p>优图美视信息列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public XMagicInfo [] getXMagics() {
        return this.XMagics;
    }

    /**
     * Set <p>优图美视信息列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param XMagics <p>优图美视信息列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setXMagics(XMagicInfo [] XMagics) {
        this.XMagics = XMagics;
    }

    /**
     * Get <p>Mac  进程名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MacBundleId <p>Mac  进程名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMacBundleId() {
        return this.MacBundleId;
    }

    /**
     * Set <p>Mac  进程名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MacBundleId <p>Mac  进程名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMacBundleId(String MacBundleId) {
        this.MacBundleId = MacBundleId;
    }

    /**
     * Get <p>windows 进程名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WinProcessName <p>windows 进程名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWinProcessName() {
        return this.WinProcessName;
    }

    /**
     * Set <p>windows 进程名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WinProcessName <p>windows 进程名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWinProcessName(String WinProcessName) {
        this.WinProcessName = WinProcessName;
    }

    /**
     * Get <p>web端Domain列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DomainList <p>web端Domain列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDomainList() {
        return this.DomainList;
    }

    /**
     * Set <p>web端Domain列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DomainList <p>web端Domain列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomainList(String [] DomainList) {
        this.DomainList = DomainList;
    }

    /**
     * Get <p>账号AppId</p> 
     * @return AppId <p>账号AppId</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>账号AppId</p>
     * @param AppId <p>账号AppId</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>扩展包名数量上限</p> 
     * @return NameLimit <p>扩展包名数量上限</p>
     */
    public Long getNameLimit() {
        return this.NameLimit;
    }

    /**
     * Set <p>扩展包名数量上限</p>
     * @param NameLimit <p>扩展包名数量上限</p>
     */
    public void setNameLimit(Long NameLimit) {
        this.NameLimit = NameLimit;
    }

    /**
     * Get <p>linux 进程名</p> 
     * @return LinuxProcessName <p>linux 进程名</p>
     */
    public String getLinuxProcessName() {
        return this.LinuxProcessName;
    }

    /**
     * Set <p>linux 进程名</p>
     * @param LinuxProcessName <p>linux 进程名</p>
     */
    public void setLinuxProcessName(String LinuxProcessName) {
        this.LinuxProcessName = LinuxProcessName;
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
        if (source.LinuxProcessName != null) {
            this.LinuxProcessName = new String(source.LinuxProcessName);
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
        this.setParamSimple(map, prefix + "LinuxProcessName", this.LinuxProcessName);

    }
}

