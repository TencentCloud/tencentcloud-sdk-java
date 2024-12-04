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
package com.tencentcloudapi.vcube.v20220410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateApplicationAndBindLicenseRequest extends AbstractModel {

    /**
    * 应用名
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 应用ID
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * 包名
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
    * 资源包ID
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
    * 营业执照
    */
    @SerializedName("CompanyPermit")
    @Expose
    private String CompanyPermit;

    /**
    * 公司类型
    */
    @SerializedName("CompanyType")
    @Expose
    private String CompanyType;

    /**
    * 公司名称
    */
    @SerializedName("CompanyName")
    @Expose
    private String CompanyName;

    /**
    * 优图资源id列表
    */
    @SerializedName("XMagicResourceIds")
    @Expose
    private String [] XMagicResourceIds;

    /**
    * Mac 进程名
    */
    @SerializedName("MacBundleId")
    @Expose
    private String MacBundleId;

    /**
    * Windows 进程名
    */
    @SerializedName("WinProcessName")
    @Expose
    private String WinProcessName;

    /**
    * 要开通的域名列表
    */
    @SerializedName("DomainList")
    @Expose
    private String [] DomainList;

    /**
    * 要开通的端，web/mobile/pc
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
     * Get 应用名 
     * @return AppName 应用名
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 应用名
     * @param AppName 应用名
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 应用ID 
     * @return BundleId 应用ID
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set 应用ID
     * @param BundleId 应用ID
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get 包名 
     * @return PackageName 包名
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set 包名
     * @param PackageName 包名
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    /**
     * Get 资源包ID 
     * @return ResourceIds 资源包ID
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set 资源包ID
     * @param ResourceIds 资源包ID
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get 营业执照 
     * @return CompanyPermit 营业执照
     */
    public String getCompanyPermit() {
        return this.CompanyPermit;
    }

    /**
     * Set 营业执照
     * @param CompanyPermit 营业执照
     */
    public void setCompanyPermit(String CompanyPermit) {
        this.CompanyPermit = CompanyPermit;
    }

    /**
     * Get 公司类型 
     * @return CompanyType 公司类型
     */
    public String getCompanyType() {
        return this.CompanyType;
    }

    /**
     * Set 公司类型
     * @param CompanyType 公司类型
     */
    public void setCompanyType(String CompanyType) {
        this.CompanyType = CompanyType;
    }

    /**
     * Get 公司名称 
     * @return CompanyName 公司名称
     */
    public String getCompanyName() {
        return this.CompanyName;
    }

    /**
     * Set 公司名称
     * @param CompanyName 公司名称
     */
    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    /**
     * Get 优图资源id列表 
     * @return XMagicResourceIds 优图资源id列表
     */
    public String [] getXMagicResourceIds() {
        return this.XMagicResourceIds;
    }

    /**
     * Set 优图资源id列表
     * @param XMagicResourceIds 优图资源id列表
     */
    public void setXMagicResourceIds(String [] XMagicResourceIds) {
        this.XMagicResourceIds = XMagicResourceIds;
    }

    /**
     * Get Mac 进程名 
     * @return MacBundleId Mac 进程名
     */
    public String getMacBundleId() {
        return this.MacBundleId;
    }

    /**
     * Set Mac 进程名
     * @param MacBundleId Mac 进程名
     */
    public void setMacBundleId(String MacBundleId) {
        this.MacBundleId = MacBundleId;
    }

    /**
     * Get Windows 进程名 
     * @return WinProcessName Windows 进程名
     */
    public String getWinProcessName() {
        return this.WinProcessName;
    }

    /**
     * Set Windows 进程名
     * @param WinProcessName Windows 进程名
     */
    public void setWinProcessName(String WinProcessName) {
        this.WinProcessName = WinProcessName;
    }

    /**
     * Get 要开通的域名列表 
     * @return DomainList 要开通的域名列表
     */
    public String [] getDomainList() {
        return this.DomainList;
    }

    /**
     * Set 要开通的域名列表
     * @param DomainList 要开通的域名列表
     */
    public void setDomainList(String [] DomainList) {
        this.DomainList = DomainList;
    }

    /**
     * Get 要开通的端，web/mobile/pc 
     * @return Platform 要开通的端，web/mobile/pc
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 要开通的端，web/mobile/pc
     * @param Platform 要开通的端，web/mobile/pc
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    public CreateApplicationAndBindLicenseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateApplicationAndBindLicenseRequest(CreateApplicationAndBindLicenseRequest source) {
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.BundleId != null) {
            this.BundleId = new String(source.BundleId);
        }
        if (source.PackageName != null) {
            this.PackageName = new String(source.PackageName);
        }
        if (source.ResourceIds != null) {
            this.ResourceIds = new String[source.ResourceIds.length];
            for (int i = 0; i < source.ResourceIds.length; i++) {
                this.ResourceIds[i] = new String(source.ResourceIds[i]);
            }
        }
        if (source.CompanyPermit != null) {
            this.CompanyPermit = new String(source.CompanyPermit);
        }
        if (source.CompanyType != null) {
            this.CompanyType = new String(source.CompanyType);
        }
        if (source.CompanyName != null) {
            this.CompanyName = new String(source.CompanyName);
        }
        if (source.XMagicResourceIds != null) {
            this.XMagicResourceIds = new String[source.XMagicResourceIds.length];
            for (int i = 0; i < source.XMagicResourceIds.length; i++) {
                this.XMagicResourceIds[i] = new String(source.XMagicResourceIds[i]);
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
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);
        this.setParamArraySimple(map, prefix + "ResourceIds.", this.ResourceIds);
        this.setParamSimple(map, prefix + "CompanyPermit", this.CompanyPermit);
        this.setParamSimple(map, prefix + "CompanyType", this.CompanyType);
        this.setParamSimple(map, prefix + "CompanyName", this.CompanyName);
        this.setParamArraySimple(map, prefix + "XMagicResourceIds.", this.XMagicResourceIds);
        this.setParamSimple(map, prefix + "MacBundleId", this.MacBundleId);
        this.setParamSimple(map, prefix + "WinProcessName", this.WinProcessName);
        this.setParamArraySimple(map, prefix + "DomainList.", this.DomainList);
        this.setParamSimple(map, prefix + "Platform", this.Platform);

    }
}

