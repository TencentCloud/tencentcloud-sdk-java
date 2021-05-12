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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IpField extends AbstractModel{

    /**
    * 国家字段信息
    */
    @SerializedName("Country")
    @Expose
    private Boolean Country;

    /**
    * 省、州、郡一级行政区域字段信息
    */
    @SerializedName("Province")
    @Expose
    private Boolean Province;

    /**
    * 市一级行政区域字段信息
    */
    @SerializedName("City")
    @Expose
    private Boolean City;

    /**
    * 市内区域字段信息
    */
    @SerializedName("Region")
    @Expose
    private Boolean Region;

    /**
    * 接入运营商字段信息
    */
    @SerializedName("Isp")
    @Expose
    private Boolean Isp;

    /**
    * 骨干运营商字段信息
    */
    @SerializedName("AsName")
    @Expose
    private Boolean AsName;

    /**
    * 骨干As号
    */
    @SerializedName("AsId")
    @Expose
    private Boolean AsId;

    /**
    * 注释字段
    */
    @SerializedName("Comment")
    @Expose
    private Boolean Comment;

    /**
     * Get 国家字段信息 
     * @return Country 国家字段信息
     */
    public Boolean getCountry() {
        return this.Country;
    }

    /**
     * Set 国家字段信息
     * @param Country 国家字段信息
     */
    public void setCountry(Boolean Country) {
        this.Country = Country;
    }

    /**
     * Get 省、州、郡一级行政区域字段信息 
     * @return Province 省、州、郡一级行政区域字段信息
     */
    public Boolean getProvince() {
        return this.Province;
    }

    /**
     * Set 省、州、郡一级行政区域字段信息
     * @param Province 省、州、郡一级行政区域字段信息
     */
    public void setProvince(Boolean Province) {
        this.Province = Province;
    }

    /**
     * Get 市一级行政区域字段信息 
     * @return City 市一级行政区域字段信息
     */
    public Boolean getCity() {
        return this.City;
    }

    /**
     * Set 市一级行政区域字段信息
     * @param City 市一级行政区域字段信息
     */
    public void setCity(Boolean City) {
        this.City = City;
    }

    /**
     * Get 市内区域字段信息 
     * @return Region 市内区域字段信息
     */
    public Boolean getRegion() {
        return this.Region;
    }

    /**
     * Set 市内区域字段信息
     * @param Region 市内区域字段信息
     */
    public void setRegion(Boolean Region) {
        this.Region = Region;
    }

    /**
     * Get 接入运营商字段信息 
     * @return Isp 接入运营商字段信息
     */
    public Boolean getIsp() {
        return this.Isp;
    }

    /**
     * Set 接入运营商字段信息
     * @param Isp 接入运营商字段信息
     */
    public void setIsp(Boolean Isp) {
        this.Isp = Isp;
    }

    /**
     * Get 骨干运营商字段信息 
     * @return AsName 骨干运营商字段信息
     */
    public Boolean getAsName() {
        return this.AsName;
    }

    /**
     * Set 骨干运营商字段信息
     * @param AsName 骨干运营商字段信息
     */
    public void setAsName(Boolean AsName) {
        this.AsName = AsName;
    }

    /**
     * Get 骨干As号 
     * @return AsId 骨干As号
     */
    public Boolean getAsId() {
        return this.AsId;
    }

    /**
     * Set 骨干As号
     * @param AsId 骨干As号
     */
    public void setAsId(Boolean AsId) {
        this.AsId = AsId;
    }

    /**
     * Get 注释字段 
     * @return Comment 注释字段
     */
    public Boolean getComment() {
        return this.Comment;
    }

    /**
     * Set 注释字段
     * @param Comment 注释字段
     */
    public void setComment(Boolean Comment) {
        this.Comment = Comment;
    }

    public IpField() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IpField(IpField source) {
        if (source.Country != null) {
            this.Country = new Boolean(source.Country);
        }
        if (source.Province != null) {
            this.Province = new Boolean(source.Province);
        }
        if (source.City != null) {
            this.City = new Boolean(source.City);
        }
        if (source.Region != null) {
            this.Region = new Boolean(source.Region);
        }
        if (source.Isp != null) {
            this.Isp = new Boolean(source.Isp);
        }
        if (source.AsName != null) {
            this.AsName = new Boolean(source.AsName);
        }
        if (source.AsId != null) {
            this.AsId = new Boolean(source.AsId);
        }
        if (source.Comment != null) {
            this.Comment = new Boolean(source.Comment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Isp", this.Isp);
        this.setParamSimple(map, prefix + "AsName", this.AsName);
        this.setParamSimple(map, prefix + "AsId", this.AsId);
        this.setParamSimple(map, prefix + "Comment", this.Comment);

    }
}

