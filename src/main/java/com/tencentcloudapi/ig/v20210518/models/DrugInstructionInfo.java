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
package com.tencentcloudapi.ig.v20210518.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DrugInstructionInfo extends AbstractModel {

    /**
    * 药品id
    */
    @SerializedName("DrugId")
    @Expose
    private String DrugId;

    /**
    * 药品名称
    */
    @SerializedName("DrugName")
    @Expose
    private String DrugName;

    /**
    * 商品名称
    */
    @SerializedName("TradeName")
    @Expose
    private String TradeName;

    /**
    * 规格
    */
    @SerializedName("Specification")
    @Expose
    private String Specification;

    /**
    * 生产企业
    */
    @SerializedName("Manufacturer")
    @Expose
    private String Manufacturer;

    /**
    * 用法用量
    */
    @SerializedName("DrugUsage")
    @Expose
    private String DrugUsage;

    /**
    * 适应症
    */
    @SerializedName("Indication")
    @Expose
    private String Indication;

    /**
    * 不良反应
    */
    @SerializedName("AdverseReaction")
    @Expose
    private String AdverseReaction;

    /**
    * 是否处方药，0:非处方药，1:处方药
    */
    @SerializedName("DrugRxType")
    @Expose
    private Long DrugRxType;

    /**
    * 药品说明书URL
    */
    @SerializedName("DocUrl")
    @Expose
    private String DocUrl;

    /**
     * Get 药品id 
     * @return DrugId 药品id
     */
    public String getDrugId() {
        return this.DrugId;
    }

    /**
     * Set 药品id
     * @param DrugId 药品id
     */
    public void setDrugId(String DrugId) {
        this.DrugId = DrugId;
    }

    /**
     * Get 药品名称 
     * @return DrugName 药品名称
     */
    public String getDrugName() {
        return this.DrugName;
    }

    /**
     * Set 药品名称
     * @param DrugName 药品名称
     */
    public void setDrugName(String DrugName) {
        this.DrugName = DrugName;
    }

    /**
     * Get 商品名称 
     * @return TradeName 商品名称
     */
    public String getTradeName() {
        return this.TradeName;
    }

    /**
     * Set 商品名称
     * @param TradeName 商品名称
     */
    public void setTradeName(String TradeName) {
        this.TradeName = TradeName;
    }

    /**
     * Get 规格 
     * @return Specification 规格
     */
    public String getSpecification() {
        return this.Specification;
    }

    /**
     * Set 规格
     * @param Specification 规格
     */
    public void setSpecification(String Specification) {
        this.Specification = Specification;
    }

    /**
     * Get 生产企业 
     * @return Manufacturer 生产企业
     */
    public String getManufacturer() {
        return this.Manufacturer;
    }

    /**
     * Set 生产企业
     * @param Manufacturer 生产企业
     */
    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    /**
     * Get 用法用量 
     * @return DrugUsage 用法用量
     */
    public String getDrugUsage() {
        return this.DrugUsage;
    }

    /**
     * Set 用法用量
     * @param DrugUsage 用法用量
     */
    public void setDrugUsage(String DrugUsage) {
        this.DrugUsage = DrugUsage;
    }

    /**
     * Get 适应症 
     * @return Indication 适应症
     */
    public String getIndication() {
        return this.Indication;
    }

    /**
     * Set 适应症
     * @param Indication 适应症
     */
    public void setIndication(String Indication) {
        this.Indication = Indication;
    }

    /**
     * Get 不良反应 
     * @return AdverseReaction 不良反应
     */
    public String getAdverseReaction() {
        return this.AdverseReaction;
    }

    /**
     * Set 不良反应
     * @param AdverseReaction 不良反应
     */
    public void setAdverseReaction(String AdverseReaction) {
        this.AdverseReaction = AdverseReaction;
    }

    /**
     * Get 是否处方药，0:非处方药，1:处方药 
     * @return DrugRxType 是否处方药，0:非处方药，1:处方药
     */
    public Long getDrugRxType() {
        return this.DrugRxType;
    }

    /**
     * Set 是否处方药，0:非处方药，1:处方药
     * @param DrugRxType 是否处方药，0:非处方药，1:处方药
     */
    public void setDrugRxType(Long DrugRxType) {
        this.DrugRxType = DrugRxType;
    }

    /**
     * Get 药品说明书URL 
     * @return DocUrl 药品说明书URL
     */
    public String getDocUrl() {
        return this.DocUrl;
    }

    /**
     * Set 药品说明书URL
     * @param DocUrl 药品说明书URL
     */
    public void setDocUrl(String DocUrl) {
        this.DocUrl = DocUrl;
    }

    public DrugInstructionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DrugInstructionInfo(DrugInstructionInfo source) {
        if (source.DrugId != null) {
            this.DrugId = new String(source.DrugId);
        }
        if (source.DrugName != null) {
            this.DrugName = new String(source.DrugName);
        }
        if (source.TradeName != null) {
            this.TradeName = new String(source.TradeName);
        }
        if (source.Specification != null) {
            this.Specification = new String(source.Specification);
        }
        if (source.Manufacturer != null) {
            this.Manufacturer = new String(source.Manufacturer);
        }
        if (source.DrugUsage != null) {
            this.DrugUsage = new String(source.DrugUsage);
        }
        if (source.Indication != null) {
            this.Indication = new String(source.Indication);
        }
        if (source.AdverseReaction != null) {
            this.AdverseReaction = new String(source.AdverseReaction);
        }
        if (source.DrugRxType != null) {
            this.DrugRxType = new Long(source.DrugRxType);
        }
        if (source.DocUrl != null) {
            this.DocUrl = new String(source.DocUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DrugId", this.DrugId);
        this.setParamSimple(map, prefix + "DrugName", this.DrugName);
        this.setParamSimple(map, prefix + "TradeName", this.TradeName);
        this.setParamSimple(map, prefix + "Specification", this.Specification);
        this.setParamSimple(map, prefix + "Manufacturer", this.Manufacturer);
        this.setParamSimple(map, prefix + "DrugUsage", this.DrugUsage);
        this.setParamSimple(map, prefix + "Indication", this.Indication);
        this.setParamSimple(map, prefix + "AdverseReaction", this.AdverseReaction);
        this.setParamSimple(map, prefix + "DrugRxType", this.DrugRxType);
        this.setParamSimple(map, prefix + "DocUrl", this.DocUrl);

    }
}

