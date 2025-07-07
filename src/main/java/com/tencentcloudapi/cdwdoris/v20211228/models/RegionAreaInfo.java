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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionAreaInfo extends AbstractModel {

    /**
    * 大类地域信息，如"south_china", "east_china"等
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 对应Name的描述，例如“华南地区”，“华东地区”等
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 具体地域列表1
    */
    @SerializedName("Regions")
    @Expose
    private RegionInfo [] Regions;

    /**
     * Get 大类地域信息，如"south_china", "east_china"等 
     * @return Name 大类地域信息，如"south_china", "east_china"等
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 大类地域信息，如"south_china", "east_china"等
     * @param Name 大类地域信息，如"south_china", "east_china"等
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 对应Name的描述，例如“华南地区”，“华东地区”等 
     * @return Desc 对应Name的描述，例如“华南地区”，“华东地区”等
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 对应Name的描述，例如“华南地区”，“华东地区”等
     * @param Desc 对应Name的描述，例如“华南地区”，“华东地区”等
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 具体地域列表1 
     * @return Regions 具体地域列表1
     */
    public RegionInfo [] getRegions() {
        return this.Regions;
    }

    /**
     * Set 具体地域列表1
     * @param Regions 具体地域列表1
     */
    public void setRegions(RegionInfo [] Regions) {
        this.Regions = Regions;
    }

    public RegionAreaInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegionAreaInfo(RegionAreaInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Regions != null) {
            this.Regions = new RegionInfo[source.Regions.length];
            for (int i = 0; i < source.Regions.length; i++) {
                this.Regions[i] = new RegionInfo(source.Regions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamArrayObj(map, prefix + "Regions.", this.Regions);

    }
}

