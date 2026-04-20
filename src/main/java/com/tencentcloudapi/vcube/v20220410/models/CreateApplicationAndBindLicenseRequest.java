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

public class CreateApplicationAndBindLicenseRequest extends AbstractModel {

    /**
    * <p>应用名</p>
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * <p>应用ID</p>
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * <p>包名</p>
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
    * <p>鸿蒙包包名</p>
    */
    @SerializedName("BundleName")
    @Expose
    private String BundleName;

    /**
    * <p>资源包ID</p>
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
    * <p>营业执照</p>
    */
    @SerializedName("CompanyPermit")
    @Expose
    private String CompanyPermit;

    /**
    * <p>公司类型</p>
    */
    @SerializedName("CompanyType")
    @Expose
    private String CompanyType;

    /**
    * <p>公司名称</p>
    */
    @SerializedName("CompanyName")
    @Expose
    private String CompanyName;

    /**
    * <p>优图资源id列表</p>
    */
    @SerializedName("XMagicResourceIds")
    @Expose
    private String [] XMagicResourceIds;

    /**
    * <p>Mac 进程名</p>
    */
    @SerializedName("MacBundleId")
    @Expose
    private String MacBundleId;

    /**
    * <p>Windows 进程名</p>
    */
    @SerializedName("WinProcessName")
    @Expose
    private String WinProcessName;

    /**
    * <p>要开通的域名列表</p>
    */
    @SerializedName("DomainList")
    @Expose
    private String [] DomainList;

    /**
    * <p>要开通的端，web/mobile/pc</p>
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
     * Get <p>应用名</p> 
     * @return AppName <p>应用名</p>
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set <p>应用名</p>
     * @param AppName <p>应用名</p>
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get <p>应用ID</p> 
     * @return BundleId <p>应用ID</p>
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set <p>应用ID</p>
     * @param BundleId <p>应用ID</p>
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get <p>包名</p> 
     * @return PackageName <p>包名</p>
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set <p>包名</p>
     * @param PackageName <p>包名</p>
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    /**
     * Get <p>鸿蒙包包名</p> 
     * @return BundleName <p>鸿蒙包包名</p>
     */
    public String getBundleName() {
        return this.BundleName;
    }

    /**
     * Set <p>鸿蒙包包名</p>
     * @param BundleName <p>鸿蒙包包名</p>
     */
    public void setBundleName(String BundleName) {
        this.BundleName = BundleName;
    }

    /**
     * Get <p>资源包ID</p> 
     * @return ResourceIds <p>资源包ID</p>
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set <p>资源包ID</p>
     * @param ResourceIds <p>资源包ID</p>
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get <p>营业执照</p> 
     * @return CompanyPermit <p>营业执照</p>
     */
    public String getCompanyPermit() {
        return this.CompanyPermit;
    }

    /**
     * Set <p>营业执照</p>
     * @param CompanyPermit <p>营业执照</p>
     */
    public void setCompanyPermit(String CompanyPermit) {
        this.CompanyPermit = CompanyPermit;
    }

    /**
     * Get <p>公司类型</p> 
     * @return CompanyType <p>公司类型</p>
     */
    public String getCompanyType() {
        return this.CompanyType;
    }

    /**
     * Set <p>公司类型</p>
     * @param CompanyType <p>公司类型</p>
     */
    public void setCompanyType(String CompanyType) {
        this.CompanyType = CompanyType;
    }

    /**
     * Get <p>公司名称</p> 
     * @return CompanyName <p>公司名称</p>
     */
    public String getCompanyName() {
        return this.CompanyName;
    }

    /**
     * Set <p>公司名称</p>
     * @param CompanyName <p>公司名称</p>
     */
    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    /**
     * Get <p>优图资源id列表</p> 
     * @return XMagicResourceIds <p>优图资源id列表</p>
     */
    public String [] getXMagicResourceIds() {
        return this.XMagicResourceIds;
    }

    /**
     * Set <p>优图资源id列表</p>
     * @param XMagicResourceIds <p>优图资源id列表</p>
     */
    public void setXMagicResourceIds(String [] XMagicResourceIds) {
        this.XMagicResourceIds = XMagicResourceIds;
    }

    /**
     * Get <p>Mac 进程名</p> 
     * @return MacBundleId <p>Mac 进程名</p>
     */
    public String getMacBundleId() {
        return this.MacBundleId;
    }

    /**
     * Set <p>Mac 进程名</p>
     * @param MacBundleId <p>Mac 进程名</p>
     */
    public void setMacBundleId(String MacBundleId) {
        this.MacBundleId = MacBundleId;
    }

    /**
     * Get <p>Windows 进程名</p> 
     * @return WinProcessName <p>Windows 进程名</p>
     */
    public String getWinProcessName() {
        return this.WinProcessName;
    }

    /**
     * Set <p>Windows 进程名</p>
     * @param WinProcessName <p>Windows 进程名</p>
     */
    public void setWinProcessName(String WinProcessName) {
        this.WinProcessName = WinProcessName;
    }

    /**
     * Get <p>要开通的域名列表</p> 
     * @return DomainList <p>要开通的域名列表</p>
     */
    public String [] getDomainList() {
        return this.DomainList;
    }

    /**
     * Set <p>要开通的域名列表</p>
     * @param DomainList <p>要开通的域名列表</p>
     */
    public void setDomainList(String [] DomainList) {
        this.DomainList = DomainList;
    }

    /**
     * Get <p>要开通的端，web/mobile/pc</p> 
     * @return Platform <p>要开通的端，web/mobile/pc</p>
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set <p>要开通的端，web/mobile/pc</p>
     * @param Platform <p>要开通的端，web/mobile/pc</p>
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
        if (source.BundleName != null) {
            this.BundleName = new String(source.BundleName);
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
        this.setParamSimple(map, prefix + "BundleName", this.BundleName);
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

