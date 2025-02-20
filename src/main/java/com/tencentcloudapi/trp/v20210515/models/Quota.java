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
package com.tencentcloudapi.trp.v20210515.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Quota extends AbstractModel {

    /**
    * 服务开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 服务结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 配额ID
    */
    @SerializedName("QuotaId")
    @Expose
    private Long QuotaId;

    /**
    * 企业ID
    */
    @SerializedName("CorpId")
    @Expose
    private Long CorpId;

    /**
    * 开通服务
    */
    @SerializedName("Services")
    @Expose
    private String [] Services;

    /**
    * 商户配额
    */
    @SerializedName("FactoryQuota")
    @Expose
    private Long FactoryQuota;

    /**
    * 商品配额
    */
    @SerializedName("ItemQuota")
    @Expose
    private Long ItemQuota;

    /**
    * 溯源码配额
    */
    @SerializedName("TrackQuota")
    @Expose
    private Long TrackQuota;

    /**
    * 销售码配额
    */
    @SerializedName("SaleQuota")
    @Expose
    private Long SaleQuota;

    /**
    * 上链配额
    */
    @SerializedName("ChainQuota")
    @Expose
    private Long ChainQuota;

    /**
    * 风控配额
    */
    @SerializedName("RiskQuota")
    @Expose
    private Long RiskQuota;

    /**
    * AI文字数量
    */
    @SerializedName("AigcTextQuota")
    @Expose
    private Long AigcTextQuota;

    /**
    * AI图片数量
    */
    @SerializedName("AigcImageQuota")
    @Expose
    private Long AigcImageQuota;

    /**
    * 溯源类型
    */
    @SerializedName("TrackType")
    @Expose
    private Long TrackType;

    /**
    * 开通版本 lite:轻量版, basic:基础版, standard:标准版
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 是否开启企业认证
    */
    @SerializedName("ProductCertify")
    @Expose
    private Long ProductCertify;

    /**
     * Get 服务开始时间 
     * @return StartTime 服务开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 服务开始时间
     * @param StartTime 服务开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 服务结束时间 
     * @return EndTime 服务结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 服务结束时间
     * @param EndTime 服务结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 配额ID 
     * @return QuotaId 配额ID
     */
    public Long getQuotaId() {
        return this.QuotaId;
    }

    /**
     * Set 配额ID
     * @param QuotaId 配额ID
     */
    public void setQuotaId(Long QuotaId) {
        this.QuotaId = QuotaId;
    }

    /**
     * Get 企业ID 
     * @return CorpId 企业ID
     */
    public Long getCorpId() {
        return this.CorpId;
    }

    /**
     * Set 企业ID
     * @param CorpId 企业ID
     */
    public void setCorpId(Long CorpId) {
        this.CorpId = CorpId;
    }

    /**
     * Get 开通服务 
     * @return Services 开通服务
     */
    public String [] getServices() {
        return this.Services;
    }

    /**
     * Set 开通服务
     * @param Services 开通服务
     */
    public void setServices(String [] Services) {
        this.Services = Services;
    }

    /**
     * Get 商户配额 
     * @return FactoryQuota 商户配额
     */
    public Long getFactoryQuota() {
        return this.FactoryQuota;
    }

    /**
     * Set 商户配额
     * @param FactoryQuota 商户配额
     */
    public void setFactoryQuota(Long FactoryQuota) {
        this.FactoryQuota = FactoryQuota;
    }

    /**
     * Get 商品配额 
     * @return ItemQuota 商品配额
     */
    public Long getItemQuota() {
        return this.ItemQuota;
    }

    /**
     * Set 商品配额
     * @param ItemQuota 商品配额
     */
    public void setItemQuota(Long ItemQuota) {
        this.ItemQuota = ItemQuota;
    }

    /**
     * Get 溯源码配额 
     * @return TrackQuota 溯源码配额
     */
    public Long getTrackQuota() {
        return this.TrackQuota;
    }

    /**
     * Set 溯源码配额
     * @param TrackQuota 溯源码配额
     */
    public void setTrackQuota(Long TrackQuota) {
        this.TrackQuota = TrackQuota;
    }

    /**
     * Get 销售码配额 
     * @return SaleQuota 销售码配额
     */
    public Long getSaleQuota() {
        return this.SaleQuota;
    }

    /**
     * Set 销售码配额
     * @param SaleQuota 销售码配额
     */
    public void setSaleQuota(Long SaleQuota) {
        this.SaleQuota = SaleQuota;
    }

    /**
     * Get 上链配额 
     * @return ChainQuota 上链配额
     */
    public Long getChainQuota() {
        return this.ChainQuota;
    }

    /**
     * Set 上链配额
     * @param ChainQuota 上链配额
     */
    public void setChainQuota(Long ChainQuota) {
        this.ChainQuota = ChainQuota;
    }

    /**
     * Get 风控配额 
     * @return RiskQuota 风控配额
     */
    public Long getRiskQuota() {
        return this.RiskQuota;
    }

    /**
     * Set 风控配额
     * @param RiskQuota 风控配额
     */
    public void setRiskQuota(Long RiskQuota) {
        this.RiskQuota = RiskQuota;
    }

    /**
     * Get AI文字数量 
     * @return AigcTextQuota AI文字数量
     */
    public Long getAigcTextQuota() {
        return this.AigcTextQuota;
    }

    /**
     * Set AI文字数量
     * @param AigcTextQuota AI文字数量
     */
    public void setAigcTextQuota(Long AigcTextQuota) {
        this.AigcTextQuota = AigcTextQuota;
    }

    /**
     * Get AI图片数量 
     * @return AigcImageQuota AI图片数量
     */
    public Long getAigcImageQuota() {
        return this.AigcImageQuota;
    }

    /**
     * Set AI图片数量
     * @param AigcImageQuota AI图片数量
     */
    public void setAigcImageQuota(Long AigcImageQuota) {
        this.AigcImageQuota = AigcImageQuota;
    }

    /**
     * Get 溯源类型 
     * @return TrackType 溯源类型
     */
    public Long getTrackType() {
        return this.TrackType;
    }

    /**
     * Set 溯源类型
     * @param TrackType 溯源类型
     */
    public void setTrackType(Long TrackType) {
        this.TrackType = TrackType;
    }

    /**
     * Get 开通版本 lite:轻量版, basic:基础版, standard:标准版 
     * @return Version 开通版本 lite:轻量版, basic:基础版, standard:标准版
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 开通版本 lite:轻量版, basic:基础版, standard:标准版
     * @param Version 开通版本 lite:轻量版, basic:基础版, standard:标准版
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 是否开启企业认证 
     * @return ProductCertify 是否开启企业认证
     */
    public Long getProductCertify() {
        return this.ProductCertify;
    }

    /**
     * Set 是否开启企业认证
     * @param ProductCertify 是否开启企业认证
     */
    public void setProductCertify(Long ProductCertify) {
        this.ProductCertify = ProductCertify;
    }

    public Quota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Quota(Quota source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.QuotaId != null) {
            this.QuotaId = new Long(source.QuotaId);
        }
        if (source.CorpId != null) {
            this.CorpId = new Long(source.CorpId);
        }
        if (source.Services != null) {
            this.Services = new String[source.Services.length];
            for (int i = 0; i < source.Services.length; i++) {
                this.Services[i] = new String(source.Services[i]);
            }
        }
        if (source.FactoryQuota != null) {
            this.FactoryQuota = new Long(source.FactoryQuota);
        }
        if (source.ItemQuota != null) {
            this.ItemQuota = new Long(source.ItemQuota);
        }
        if (source.TrackQuota != null) {
            this.TrackQuota = new Long(source.TrackQuota);
        }
        if (source.SaleQuota != null) {
            this.SaleQuota = new Long(source.SaleQuota);
        }
        if (source.ChainQuota != null) {
            this.ChainQuota = new Long(source.ChainQuota);
        }
        if (source.RiskQuota != null) {
            this.RiskQuota = new Long(source.RiskQuota);
        }
        if (source.AigcTextQuota != null) {
            this.AigcTextQuota = new Long(source.AigcTextQuota);
        }
        if (source.AigcImageQuota != null) {
            this.AigcImageQuota = new Long(source.AigcImageQuota);
        }
        if (source.TrackType != null) {
            this.TrackType = new Long(source.TrackType);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.ProductCertify != null) {
            this.ProductCertify = new Long(source.ProductCertify);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "QuotaId", this.QuotaId);
        this.setParamSimple(map, prefix + "CorpId", this.CorpId);
        this.setParamArraySimple(map, prefix + "Services.", this.Services);
        this.setParamSimple(map, prefix + "FactoryQuota", this.FactoryQuota);
        this.setParamSimple(map, prefix + "ItemQuota", this.ItemQuota);
        this.setParamSimple(map, prefix + "TrackQuota", this.TrackQuota);
        this.setParamSimple(map, prefix + "SaleQuota", this.SaleQuota);
        this.setParamSimple(map, prefix + "ChainQuota", this.ChainQuota);
        this.setParamSimple(map, prefix + "RiskQuota", this.RiskQuota);
        this.setParamSimple(map, prefix + "AigcTextQuota", this.AigcTextQuota);
        this.setParamSimple(map, prefix + "AigcImageQuota", this.AigcImageQuota);
        this.setParamSimple(map, prefix + "TrackType", this.TrackType);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "ProductCertify", this.ProductCertify);

    }
}

