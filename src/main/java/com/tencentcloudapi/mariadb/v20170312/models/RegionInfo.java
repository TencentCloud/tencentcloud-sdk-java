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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionInfo extends AbstractModel {

    /**
    * 地域英文ID
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
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * 可用区列表
    */
    @SerializedName("ZoneList")
    @Expose
    private ZonesInfo [] ZoneList;

    /**
    * 可选择的主可用区和从可用区
    */
    @SerializedName("AvailableChoice")
    @Expose
    private ZoneChooseInfo [] AvailableChoice;

    /**
    * Cpu类型，如：英特尔：Intel/AMD，海光：Hygon
    */
    @SerializedName("CpuType")
    @Expose
    private String CpuType;

    /**
     * Get 地域英文ID 
     * @return Region 地域英文ID
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域英文ID
     * @param Region 地域英文ID
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
     * @return RegionName 地域中文名
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 地域中文名
     * @param RegionName 地域中文名
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get 可用区列表 
     * @return ZoneList 可用区列表
     */
    public ZonesInfo [] getZoneList() {
        return this.ZoneList;
    }

    /**
     * Set 可用区列表
     * @param ZoneList 可用区列表
     */
    public void setZoneList(ZonesInfo [] ZoneList) {
        this.ZoneList = ZoneList;
    }

    /**
     * Get 可选择的主可用区和从可用区 
     * @return AvailableChoice 可选择的主可用区和从可用区
     */
    public ZoneChooseInfo [] getAvailableChoice() {
        return this.AvailableChoice;
    }

    /**
     * Set 可选择的主可用区和从可用区
     * @param AvailableChoice 可选择的主可用区和从可用区
     */
    public void setAvailableChoice(ZoneChooseInfo [] AvailableChoice) {
        this.AvailableChoice = AvailableChoice;
    }

    /**
     * Get Cpu类型，如：英特尔：Intel/AMD，海光：Hygon 
     * @return CpuType Cpu类型，如：英特尔：Intel/AMD，海光：Hygon
     */
    public String getCpuType() {
        return this.CpuType;
    }

    /**
     * Set Cpu类型，如：英特尔：Intel/AMD，海光：Hygon
     * @param CpuType Cpu类型，如：英特尔：Intel/AMD，海光：Hygon
     */
    public void setCpuType(String CpuType) {
        this.CpuType = CpuType;
    }

    public RegionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegionInfo(RegionInfo source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.ZoneList != null) {
            this.ZoneList = new ZonesInfo[source.ZoneList.length];
            for (int i = 0; i < source.ZoneList.length; i++) {
                this.ZoneList[i] = new ZonesInfo(source.ZoneList[i]);
            }
        }
        if (source.AvailableChoice != null) {
            this.AvailableChoice = new ZoneChooseInfo[source.AvailableChoice.length];
            for (int i = 0; i < source.AvailableChoice.length; i++) {
                this.AvailableChoice[i] = new ZoneChooseInfo(source.AvailableChoice[i]);
            }
        }
        if (source.CpuType != null) {
            this.CpuType = new String(source.CpuType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamArrayObj(map, prefix + "ZoneList.", this.ZoneList);
        this.setParamArrayObj(map, prefix + "AvailableChoice.", this.AvailableChoice);
        this.setParamSimple(map, prefix + "CpuType", this.CpuType);

    }
}

