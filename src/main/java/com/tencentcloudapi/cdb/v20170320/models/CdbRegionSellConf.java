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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CdbRegionSellConf extends AbstractModel {

    /**
    * 地域中文名称
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * 所属大区
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 是否为默认地域
    */
    @SerializedName("IsDefaultRegion")
    @Expose
    private Long IsDefaultRegion;

    /**
    * 地域名称
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 地域的可用区售卖配置
    */
    @SerializedName("RegionConfig")
    @Expose
    private CdbZoneSellConf [] RegionConfig;

    /**
     * Get 地域中文名称 
     * @return RegionName 地域中文名称
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 地域中文名称
     * @param RegionName 地域中文名称
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get 所属大区 
     * @return Area 所属大区
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 所属大区
     * @param Area 所属大区
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 是否为默认地域 
     * @return IsDefaultRegion 是否为默认地域
     */
    public Long getIsDefaultRegion() {
        return this.IsDefaultRegion;
    }

    /**
     * Set 是否为默认地域
     * @param IsDefaultRegion 是否为默认地域
     */
    public void setIsDefaultRegion(Long IsDefaultRegion) {
        this.IsDefaultRegion = IsDefaultRegion;
    }

    /**
     * Get 地域名称 
     * @return Region 地域名称
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域名称
     * @param Region 地域名称
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 地域的可用区售卖配置 
     * @return RegionConfig 地域的可用区售卖配置
     */
    public CdbZoneSellConf [] getRegionConfig() {
        return this.RegionConfig;
    }

    /**
     * Set 地域的可用区售卖配置
     * @param RegionConfig 地域的可用区售卖配置
     */
    public void setRegionConfig(CdbZoneSellConf [] RegionConfig) {
        this.RegionConfig = RegionConfig;
    }

    public CdbRegionSellConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CdbRegionSellConf(CdbRegionSellConf source) {
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.IsDefaultRegion != null) {
            this.IsDefaultRegion = new Long(source.IsDefaultRegion);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.RegionConfig != null) {
            this.RegionConfig = new CdbZoneSellConf[source.RegionConfig.length];
            for (int i = 0; i < source.RegionConfig.length; i++) {
                this.RegionConfig[i] = new CdbZoneSellConf(source.RegionConfig[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "IsDefaultRegion", this.IsDefaultRegion);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamArrayObj(map, prefix + "RegionConfig.", this.RegionConfig);

    }
}

