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

public class DrugCardInfo extends AbstractModel {

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
    * 生产厂商
    */
    @SerializedName("Manufacturer")
    @Expose
    private String Manufacturer;

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
    * 识别来源，1:药品图片，2:用户输入
    */
    @SerializedName("IdentifySource")
    @Expose
    private Long IdentifySource;

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
     * Get 生产厂商 
     * @return Manufacturer 生产厂商
     */
    public String getManufacturer() {
        return this.Manufacturer;
    }

    /**
     * Set 生产厂商
     * @param Manufacturer 生产厂商
     */
    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
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

    /**
     * Get 识别来源，1:药品图片，2:用户输入 
     * @return IdentifySource 识别来源，1:药品图片，2:用户输入
     */
    public Long getIdentifySource() {
        return this.IdentifySource;
    }

    /**
     * Set 识别来源，1:药品图片，2:用户输入
     * @param IdentifySource 识别来源，1:药品图片，2:用户输入
     */
    public void setIdentifySource(Long IdentifySource) {
        this.IdentifySource = IdentifySource;
    }

    public DrugCardInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DrugCardInfo(DrugCardInfo source) {
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
        if (source.DrugRxType != null) {
            this.DrugRxType = new Long(source.DrugRxType);
        }
        if (source.DocUrl != null) {
            this.DocUrl = new String(source.DocUrl);
        }
        if (source.IdentifySource != null) {
            this.IdentifySource = new Long(source.IdentifySource);
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
        this.setParamSimple(map, prefix + "DrugRxType", this.DrugRxType);
        this.setParamSimple(map, prefix + "DocUrl", this.DocUrl);
        this.setParamSimple(map, prefix + "IdentifySource", this.IdentifySource);

    }
}

