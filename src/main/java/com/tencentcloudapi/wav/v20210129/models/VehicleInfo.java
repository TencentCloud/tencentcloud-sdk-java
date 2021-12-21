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
package com.tencentcloudapi.wav.v20210129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VehicleInfo extends AbstractModel{

    /**
    * 品牌id
    */
    @SerializedName("BrandId")
    @Expose
    private Long BrandId;

    /**
    * 品牌名称
    */
    @SerializedName("BrandName")
    @Expose
    private String BrandName;

    /**
    * 车系id
    */
    @SerializedName("SeriesId")
    @Expose
    private Long SeriesId;

    /**
    * 车系名称
    */
    @SerializedName("SeriesName")
    @Expose
    private String SeriesName;

    /**
    * 车型id
    */
    @SerializedName("ModelId")
    @Expose
    private Long ModelId;

    /**
    * 车型名称
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
     * Get 品牌id 
     * @return BrandId 品牌id
     */
    public Long getBrandId() {
        return this.BrandId;
    }

    /**
     * Set 品牌id
     * @param BrandId 品牌id
     */
    public void setBrandId(Long BrandId) {
        this.BrandId = BrandId;
    }

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
     * Get 车系id 
     * @return SeriesId 车系id
     */
    public Long getSeriesId() {
        return this.SeriesId;
    }

    /**
     * Set 车系id
     * @param SeriesId 车系id
     */
    public void setSeriesId(Long SeriesId) {
        this.SeriesId = SeriesId;
    }

    /**
     * Get 车系名称 
     * @return SeriesName 车系名称
     */
    public String getSeriesName() {
        return this.SeriesName;
    }

    /**
     * Set 车系名称
     * @param SeriesName 车系名称
     */
    public void setSeriesName(String SeriesName) {
        this.SeriesName = SeriesName;
    }

    /**
     * Get 车型id 
     * @return ModelId 车型id
     */
    public Long getModelId() {
        return this.ModelId;
    }

    /**
     * Set 车型id
     * @param ModelId 车型id
     */
    public void setModelId(Long ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get 车型名称 
     * @return ModelName 车型名称
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set 车型名称
     * @param ModelName 车型名称
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    public VehicleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VehicleInfo(VehicleInfo source) {
        if (source.BrandId != null) {
            this.BrandId = new Long(source.BrandId);
        }
        if (source.BrandName != null) {
            this.BrandName = new String(source.BrandName);
        }
        if (source.SeriesId != null) {
            this.SeriesId = new Long(source.SeriesId);
        }
        if (source.SeriesName != null) {
            this.SeriesName = new String(source.SeriesName);
        }
        if (source.ModelId != null) {
            this.ModelId = new Long(source.ModelId);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BrandId", this.BrandId);
        this.setParamSimple(map, prefix + "BrandName", this.BrandName);
        this.setParamSimple(map, prefix + "SeriesId", this.SeriesId);
        this.setParamSimple(map, prefix + "SeriesName", this.SeriesName);
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);

    }
}

