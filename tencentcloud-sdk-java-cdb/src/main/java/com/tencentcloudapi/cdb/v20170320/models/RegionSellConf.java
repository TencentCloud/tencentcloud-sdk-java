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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionSellConf extends AbstractModel{

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
    * 可用区售卖配置
    */
    @SerializedName("ZonesConf")
    @Expose
    private ZoneSellConf [] ZonesConf;

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
     * Get 可用区售卖配置 
     * @return ZonesConf 可用区售卖配置
     */
    public ZoneSellConf [] getZonesConf() {
        return this.ZonesConf;
    }

    /**
     * Set 可用区售卖配置
     * @param ZonesConf 可用区售卖配置
     */
    public void setZonesConf(ZoneSellConf [] ZonesConf) {
        this.ZonesConf = ZonesConf;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "IsDefaultRegion", this.IsDefaultRegion);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamArrayObj(map, prefix + "ZonesConf.", this.ZonesConf);

    }
}

