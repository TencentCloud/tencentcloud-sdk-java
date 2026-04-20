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

public class CreateTrialApplicationAndLicenseRequest extends AbstractModel {

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
    * <p>功能 id 数组</p>
    */
    @SerializedName("FeatureIds")
    @Expose
    private Long [] FeatureIds;

    /**
    * <p>是否要开通优图功能</p>
    */
    @SerializedName("XMagic")
    @Expose
    private Boolean XMagic;

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
    * <p>要开通的测试功能名称，基础套餐只能有一个</p>
    */
    @SerializedName("PlanList")
    @Expose
    private String [] PlanList;

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
    * <p>要创建到哪个平台，web、mobile、pc，默认mobile</p>
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * <p>授权域名列表</p>
    */
    @SerializedName("DomainList")
    @Expose
    private String [] DomainList;

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
     * Get <p>功能 id 数组</p> 
     * @return FeatureIds <p>功能 id 数组</p>
     */
    public Long [] getFeatureIds() {
        return this.FeatureIds;
    }

    /**
     * Set <p>功能 id 数组</p>
     * @param FeatureIds <p>功能 id 数组</p>
     */
    public void setFeatureIds(Long [] FeatureIds) {
        this.FeatureIds = FeatureIds;
    }

    /**
     * Get <p>是否要开通优图功能</p> 
     * @return XMagic <p>是否要开通优图功能</p>
     */
    public Boolean getXMagic() {
        return this.XMagic;
    }

    /**
     * Set <p>是否要开通优图功能</p>
     * @param XMagic <p>是否要开通优图功能</p>
     */
    public void setXMagic(Boolean XMagic) {
        this.XMagic = XMagic;
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
     * Get <p>要开通的测试功能名称，基础套餐只能有一个</p> 
     * @return PlanList <p>要开通的测试功能名称，基础套餐只能有一个</p>
     */
    public String [] getPlanList() {
        return this.PlanList;
    }

    /**
     * Set <p>要开通的测试功能名称，基础套餐只能有一个</p>
     * @param PlanList <p>要开通的测试功能名称，基础套餐只能有一个</p>
     */
    public void setPlanList(String [] PlanList) {
        this.PlanList = PlanList;
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
     * Get <p>要创建到哪个平台，web、mobile、pc，默认mobile</p> 
     * @return Platform <p>要创建到哪个平台，web、mobile、pc，默认mobile</p>
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set <p>要创建到哪个平台，web、mobile、pc，默认mobile</p>
     * @param Platform <p>要创建到哪个平台，web、mobile、pc，默认mobile</p>
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get <p>授权域名列表</p> 
     * @return DomainList <p>授权域名列表</p>
     */
    public String [] getDomainList() {
        return this.DomainList;
    }

    /**
     * Set <p>授权域名列表</p>
     * @param DomainList <p>授权域名列表</p>
     */
    public void setDomainList(String [] DomainList) {
        this.DomainList = DomainList;
    }

    public CreateTrialApplicationAndLicenseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTrialApplicationAndLicenseRequest(CreateTrialApplicationAndLicenseRequest source) {
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
        if (source.FeatureIds != null) {
            this.FeatureIds = new Long[source.FeatureIds.length];
            for (int i = 0; i < source.FeatureIds.length; i++) {
                this.FeatureIds[i] = new Long(source.FeatureIds[i]);
            }
        }
        if (source.XMagic != null) {
            this.XMagic = new Boolean(source.XMagic);
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
        if (source.PlanList != null) {
            this.PlanList = new String[source.PlanList.length];
            for (int i = 0; i < source.PlanList.length; i++) {
                this.PlanList[i] = new String(source.PlanList[i]);
            }
        }
        if (source.MacBundleId != null) {
            this.MacBundleId = new String(source.MacBundleId);
        }
        if (source.WinProcessName != null) {
            this.WinProcessName = new String(source.WinProcessName);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.DomainList != null) {
            this.DomainList = new String[source.DomainList.length];
            for (int i = 0; i < source.DomainList.length; i++) {
                this.DomainList[i] = new String(source.DomainList[i]);
            }
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
        this.setParamArraySimple(map, prefix + "FeatureIds.", this.FeatureIds);
        this.setParamSimple(map, prefix + "XMagic", this.XMagic);
        this.setParamSimple(map, prefix + "CompanyPermit", this.CompanyPermit);
        this.setParamSimple(map, prefix + "CompanyType", this.CompanyType);
        this.setParamSimple(map, prefix + "CompanyName", this.CompanyName);
        this.setParamArraySimple(map, prefix + "PlanList.", this.PlanList);
        this.setParamSimple(map, prefix + "MacBundleId", this.MacBundleId);
        this.setParamSimple(map, prefix + "WinProcessName", this.WinProcessName);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamArraySimple(map, prefix + "DomainList.", this.DomainList);

    }
}

