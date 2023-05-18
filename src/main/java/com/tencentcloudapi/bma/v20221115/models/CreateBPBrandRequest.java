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
package com.tencentcloudapi.bma.v20221115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBPBrandRequest extends AbstractModel{

    /**
    * 品牌名称
    */
    @SerializedName("BrandName")
    @Expose
    private String BrandName;

    /**
    * 企业名称
    */
    @SerializedName("CompanyName")
    @Expose
    private String CompanyName;

    /**
    * 品牌logo
    */
    @SerializedName("BrandLogo")
    @Expose
    private String BrandLogo;

    /**
    * 联系电话
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * 营业执照
    */
    @SerializedName("License")
    @Expose
    private String License;

    /**
    * 授权书
    */
    @SerializedName("Authorization")
    @Expose
    private String Authorization;

    /**
    * 商标名称
    */
    @SerializedName("TrademarkNames")
    @Expose
    private String [] TrademarkNames;

    /**
    * 商标证明
    */
    @SerializedName("Trademarks")
    @Expose
    private String [] Trademarks;

    /**
    * 是否涉及转让: 0-不转让 1-转让
    */
    @SerializedName("IsTransfers")
    @Expose
    private String [] IsTransfers;

    /**
    * 转让证明
    */
    @SerializedName("Transfers")
    @Expose
    private String [] Transfers;

    /**
    * 保护网址
    */
    @SerializedName("ProtectURLs")
    @Expose
    private String [] ProtectURLs;

    /**
    * 保护应用
    */
    @SerializedName("ProtectAPPs")
    @Expose
    private String [] ProtectAPPs;

    /**
    * 保护公众号
    */
    @SerializedName("ProtectOfficialAccounts")
    @Expose
    private String [] ProtectOfficialAccounts;

    /**
    * 保护小程序
    */
    @SerializedName("ProtectMiniPrograms")
    @Expose
    private String [] ProtectMiniPrograms;

    /**
    * 请求来源：0-反钓鱼 2-反假冒
    */
    @SerializedName("APISource")
    @Expose
    private Long APISource;

    /**
     * Get 品牌名称 
     * @return BrandName 品牌名称
     */
    public String getBrandName() {
        return this.BrandName;
    }

    /**
     * Set 品牌名称
     * @param BrandName 品牌名称
     */
    public void setBrandName(String BrandName) {
        this.BrandName = BrandName;
    }

    /**
     * Get 企业名称 
     * @return CompanyName 企业名称
     */
    public String getCompanyName() {
        return this.CompanyName;
    }

    /**
     * Set 企业名称
     * @param CompanyName 企业名称
     */
    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    /**
     * Get 品牌logo 
     * @return BrandLogo 品牌logo
     */
    public String getBrandLogo() {
        return this.BrandLogo;
    }

    /**
     * Set 品牌logo
     * @param BrandLogo 品牌logo
     */
    public void setBrandLogo(String BrandLogo) {
        this.BrandLogo = BrandLogo;
    }

    /**
     * Get 联系电话 
     * @return Phone 联系电话
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 联系电话
     * @param Phone 联系电话
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 营业执照 
     * @return License 营业执照
     */
    public String getLicense() {
        return this.License;
    }

    /**
     * Set 营业执照
     * @param License 营业执照
     */
    public void setLicense(String License) {
        this.License = License;
    }

    /**
     * Get 授权书 
     * @return Authorization 授权书
     */
    public String getAuthorization() {
        return this.Authorization;
    }

    /**
     * Set 授权书
     * @param Authorization 授权书
     */
    public void setAuthorization(String Authorization) {
        this.Authorization = Authorization;
    }

    /**
     * Get 商标名称 
     * @return TrademarkNames 商标名称
     */
    public String [] getTrademarkNames() {
        return this.TrademarkNames;
    }

    /**
     * Set 商标名称
     * @param TrademarkNames 商标名称
     */
    public void setTrademarkNames(String [] TrademarkNames) {
        this.TrademarkNames = TrademarkNames;
    }

    /**
     * Get 商标证明 
     * @return Trademarks 商标证明
     */
    public String [] getTrademarks() {
        return this.Trademarks;
    }

    /**
     * Set 商标证明
     * @param Trademarks 商标证明
     */
    public void setTrademarks(String [] Trademarks) {
        this.Trademarks = Trademarks;
    }

    /**
     * Get 是否涉及转让: 0-不转让 1-转让 
     * @return IsTransfers 是否涉及转让: 0-不转让 1-转让
     */
    public String [] getIsTransfers() {
        return this.IsTransfers;
    }

    /**
     * Set 是否涉及转让: 0-不转让 1-转让
     * @param IsTransfers 是否涉及转让: 0-不转让 1-转让
     */
    public void setIsTransfers(String [] IsTransfers) {
        this.IsTransfers = IsTransfers;
    }

    /**
     * Get 转让证明 
     * @return Transfers 转让证明
     */
    public String [] getTransfers() {
        return this.Transfers;
    }

    /**
     * Set 转让证明
     * @param Transfers 转让证明
     */
    public void setTransfers(String [] Transfers) {
        this.Transfers = Transfers;
    }

    /**
     * Get 保护网址 
     * @return ProtectURLs 保护网址
     */
    public String [] getProtectURLs() {
        return this.ProtectURLs;
    }

    /**
     * Set 保护网址
     * @param ProtectURLs 保护网址
     */
    public void setProtectURLs(String [] ProtectURLs) {
        this.ProtectURLs = ProtectURLs;
    }

    /**
     * Get 保护应用 
     * @return ProtectAPPs 保护应用
     */
    public String [] getProtectAPPs() {
        return this.ProtectAPPs;
    }

    /**
     * Set 保护应用
     * @param ProtectAPPs 保护应用
     */
    public void setProtectAPPs(String [] ProtectAPPs) {
        this.ProtectAPPs = ProtectAPPs;
    }

    /**
     * Get 保护公众号 
     * @return ProtectOfficialAccounts 保护公众号
     */
    public String [] getProtectOfficialAccounts() {
        return this.ProtectOfficialAccounts;
    }

    /**
     * Set 保护公众号
     * @param ProtectOfficialAccounts 保护公众号
     */
    public void setProtectOfficialAccounts(String [] ProtectOfficialAccounts) {
        this.ProtectOfficialAccounts = ProtectOfficialAccounts;
    }

    /**
     * Get 保护小程序 
     * @return ProtectMiniPrograms 保护小程序
     */
    public String [] getProtectMiniPrograms() {
        return this.ProtectMiniPrograms;
    }

    /**
     * Set 保护小程序
     * @param ProtectMiniPrograms 保护小程序
     */
    public void setProtectMiniPrograms(String [] ProtectMiniPrograms) {
        this.ProtectMiniPrograms = ProtectMiniPrograms;
    }

    /**
     * Get 请求来源：0-反钓鱼 2-反假冒 
     * @return APISource 请求来源：0-反钓鱼 2-反假冒
     */
    public Long getAPISource() {
        return this.APISource;
    }

    /**
     * Set 请求来源：0-反钓鱼 2-反假冒
     * @param APISource 请求来源：0-反钓鱼 2-反假冒
     */
    public void setAPISource(Long APISource) {
        this.APISource = APISource;
    }

    public CreateBPBrandRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBPBrandRequest(CreateBPBrandRequest source) {
        if (source.BrandName != null) {
            this.BrandName = new String(source.BrandName);
        }
        if (source.CompanyName != null) {
            this.CompanyName = new String(source.CompanyName);
        }
        if (source.BrandLogo != null) {
            this.BrandLogo = new String(source.BrandLogo);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.License != null) {
            this.License = new String(source.License);
        }
        if (source.Authorization != null) {
            this.Authorization = new String(source.Authorization);
        }
        if (source.TrademarkNames != null) {
            this.TrademarkNames = new String[source.TrademarkNames.length];
            for (int i = 0; i < source.TrademarkNames.length; i++) {
                this.TrademarkNames[i] = new String(source.TrademarkNames[i]);
            }
        }
        if (source.Trademarks != null) {
            this.Trademarks = new String[source.Trademarks.length];
            for (int i = 0; i < source.Trademarks.length; i++) {
                this.Trademarks[i] = new String(source.Trademarks[i]);
            }
        }
        if (source.IsTransfers != null) {
            this.IsTransfers = new String[source.IsTransfers.length];
            for (int i = 0; i < source.IsTransfers.length; i++) {
                this.IsTransfers[i] = new String(source.IsTransfers[i]);
            }
        }
        if (source.Transfers != null) {
            this.Transfers = new String[source.Transfers.length];
            for (int i = 0; i < source.Transfers.length; i++) {
                this.Transfers[i] = new String(source.Transfers[i]);
            }
        }
        if (source.ProtectURLs != null) {
            this.ProtectURLs = new String[source.ProtectURLs.length];
            for (int i = 0; i < source.ProtectURLs.length; i++) {
                this.ProtectURLs[i] = new String(source.ProtectURLs[i]);
            }
        }
        if (source.ProtectAPPs != null) {
            this.ProtectAPPs = new String[source.ProtectAPPs.length];
            for (int i = 0; i < source.ProtectAPPs.length; i++) {
                this.ProtectAPPs[i] = new String(source.ProtectAPPs[i]);
            }
        }
        if (source.ProtectOfficialAccounts != null) {
            this.ProtectOfficialAccounts = new String[source.ProtectOfficialAccounts.length];
            for (int i = 0; i < source.ProtectOfficialAccounts.length; i++) {
                this.ProtectOfficialAccounts[i] = new String(source.ProtectOfficialAccounts[i]);
            }
        }
        if (source.ProtectMiniPrograms != null) {
            this.ProtectMiniPrograms = new String[source.ProtectMiniPrograms.length];
            for (int i = 0; i < source.ProtectMiniPrograms.length; i++) {
                this.ProtectMiniPrograms[i] = new String(source.ProtectMiniPrograms[i]);
            }
        }
        if (source.APISource != null) {
            this.APISource = new Long(source.APISource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BrandName", this.BrandName);
        this.setParamSimple(map, prefix + "CompanyName", this.CompanyName);
        this.setParamSimple(map, prefix + "BrandLogo", this.BrandLogo);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "License", this.License);
        this.setParamSimple(map, prefix + "Authorization", this.Authorization);
        this.setParamArraySimple(map, prefix + "TrademarkNames.", this.TrademarkNames);
        this.setParamArraySimple(map, prefix + "Trademarks.", this.Trademarks);
        this.setParamArraySimple(map, prefix + "IsTransfers.", this.IsTransfers);
        this.setParamArraySimple(map, prefix + "Transfers.", this.Transfers);
        this.setParamArraySimple(map, prefix + "ProtectURLs.", this.ProtectURLs);
        this.setParamArraySimple(map, prefix + "ProtectAPPs.", this.ProtectAPPs);
        this.setParamArraySimple(map, prefix + "ProtectOfficialAccounts.", this.ProtectOfficialAccounts);
        this.setParamArraySimple(map, prefix + "ProtectMiniPrograms.", this.ProtectMiniPrograms);
        this.setParamSimple(map, prefix + "APISource", this.APISource);

    }
}

