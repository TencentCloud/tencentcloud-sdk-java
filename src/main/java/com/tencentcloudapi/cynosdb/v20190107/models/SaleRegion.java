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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SaleRegion extends AbstractModel{

    /**
    * 地域英文名
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 地域数字ID
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 地域中文名
    */
    @SerializedName("RegionZh")
    @Expose
    private String RegionZh;

    /**
    * 可售卖可用区列表
    */
    @SerializedName("ZoneSet")
    @Expose
    private SaleZone [] ZoneSet;

    /**
    * 引擎类型
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * 地域模块支持情况
    */
    @SerializedName("Modules")
    @Expose
    private Module [] Modules;

    /**
     * Get 地域英文名 
     * @return Region 地域英文名
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域英文名
     * @param Region 地域英文名
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 地域数字ID 
     * @return RegionId 地域数字ID
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域数字ID
     * @param RegionId 地域数字ID
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 地域中文名 
     * @return RegionZh 地域中文名
     */
    public String getRegionZh() {
        return this.RegionZh;
    }

    /**
     * Set 地域中文名
     * @param RegionZh 地域中文名
     */
    public void setRegionZh(String RegionZh) {
        this.RegionZh = RegionZh;
    }

    /**
     * Get 可售卖可用区列表 
     * @return ZoneSet 可售卖可用区列表
     */
    public SaleZone [] getZoneSet() {
        return this.ZoneSet;
    }

    /**
     * Set 可售卖可用区列表
     * @param ZoneSet 可售卖可用区列表
     */
    public void setZoneSet(SaleZone [] ZoneSet) {
        this.ZoneSet = ZoneSet;
    }

    /**
     * Get 引擎类型 
     * @return DbType 引擎类型
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set 引擎类型
     * @param DbType 引擎类型
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get 地域模块支持情况 
     * @return Modules 地域模块支持情况
     */
    public Module [] getModules() {
        return this.Modules;
    }

    /**
     * Set 地域模块支持情况
     * @param Modules 地域模块支持情况
     */
    public void setModules(Module [] Modules) {
        this.Modules = Modules;
    }

    public SaleRegion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SaleRegion(SaleRegion source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.RegionZh != null) {
            this.RegionZh = new String(source.RegionZh);
        }
        if (source.ZoneSet != null) {
            this.ZoneSet = new SaleZone[source.ZoneSet.length];
            for (int i = 0; i < source.ZoneSet.length; i++) {
                this.ZoneSet[i] = new SaleZone(source.ZoneSet[i]);
            }
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
        if (source.Modules != null) {
            this.Modules = new Module[source.Modules.length];
            for (int i = 0; i < source.Modules.length; i++) {
                this.Modules[i] = new Module(source.Modules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "RegionZh", this.RegionZh);
        this.setParamArrayObj(map, prefix + "ZoneSet.", this.ZoneSet);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamArrayObj(map, prefix + "Modules.", this.Modules);

    }
}

