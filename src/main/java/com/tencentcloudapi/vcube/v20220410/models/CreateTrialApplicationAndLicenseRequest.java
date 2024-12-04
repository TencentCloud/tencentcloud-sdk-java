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

public class CreateTrialApplicationAndLicenseRequest extends AbstractModel {

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
    * 功能 id 数组
    */
    @SerializedName("FeatureIds")
    @Expose
    private Long [] FeatureIds;

    /**
    * 是否要开通优图功能
    */
    @SerializedName("XMagic")
    @Expose
    private Boolean XMagic;

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
    * 要开通的测试功能名称，基础套餐只能有一个
    */
    @SerializedName("PlanList")
    @Expose
    private String [] PlanList;

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
    * 要创建到哪个平台，web、mobile、pc，默认mobile
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 授权域名列表
    */
    @SerializedName("DomainList")
    @Expose
    private String [] DomainList;

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
     * Get 功能 id 数组 
     * @return FeatureIds 功能 id 数组
     */
    public Long [] getFeatureIds() {
        return this.FeatureIds;
    }

    /**
     * Set 功能 id 数组
     * @param FeatureIds 功能 id 数组
     */
    public void setFeatureIds(Long [] FeatureIds) {
        this.FeatureIds = FeatureIds;
    }

    /**
     * Get 是否要开通优图功能 
     * @return XMagic 是否要开通优图功能
     */
    public Boolean getXMagic() {
        return this.XMagic;
    }

    /**
     * Set 是否要开通优图功能
     * @param XMagic 是否要开通优图功能
     */
    public void setXMagic(Boolean XMagic) {
        this.XMagic = XMagic;
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
     * Get 要开通的测试功能名称，基础套餐只能有一个 
     * @return PlanList 要开通的测试功能名称，基础套餐只能有一个
     */
    public String [] getPlanList() {
        return this.PlanList;
    }

    /**
     * Set 要开通的测试功能名称，基础套餐只能有一个
     * @param PlanList 要开通的测试功能名称，基础套餐只能有一个
     */
    public void setPlanList(String [] PlanList) {
        this.PlanList = PlanList;
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
     * Get 要创建到哪个平台，web、mobile、pc，默认mobile 
     * @return Platform 要创建到哪个平台，web、mobile、pc，默认mobile
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 要创建到哪个平台，web、mobile、pc，默认mobile
     * @param Platform 要创建到哪个平台，web、mobile、pc，默认mobile
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 授权域名列表 
     * @return DomainList 授权域名列表
     */
    public String [] getDomainList() {
        return this.DomainList;
    }

    /**
     * Set 授权域名列表
     * @param DomainList 授权域名列表
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

