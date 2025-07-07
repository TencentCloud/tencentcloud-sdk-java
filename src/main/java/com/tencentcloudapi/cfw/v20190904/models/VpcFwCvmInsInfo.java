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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VpcFwCvmInsInfo extends AbstractModel {

    /**
    * VPC防火墙实例ID
    */
    @SerializedName("FwInsId")
    @Expose
    private String FwInsId;

    /**
    * CVM所在地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * CVM所在地域中文
    */
    @SerializedName("RegionZh")
    @Expose
    private String RegionZh;

    /**
    * CVM所在地域详情
    */
    @SerializedName("RegionDetail")
    @Expose
    private String RegionDetail;

    /**
    * 主机所在可用区
    */
    @SerializedName("ZoneZh")
    @Expose
    private String ZoneZh;

    /**
    * 备机所在可用区
    */
    @SerializedName("ZoneZhBack")
    @Expose
    private String ZoneZhBack;

    /**
    * 防火墙CVM带宽值
    */
    @SerializedName("BandWidth")
    @Expose
    private Long BandWidth;

    /**
    * 实例主机所在可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 实例备机所在可用区
    */
    @SerializedName("ZoneBak")
    @Expose
    private String ZoneBak;

    /**
     * Get VPC防火墙实例ID 
     * @return FwInsId VPC防火墙实例ID
     */
    public String getFwInsId() {
        return this.FwInsId;
    }

    /**
     * Set VPC防火墙实例ID
     * @param FwInsId VPC防火墙实例ID
     */
    public void setFwInsId(String FwInsId) {
        this.FwInsId = FwInsId;
    }

    /**
     * Get CVM所在地域 
     * @return Region CVM所在地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set CVM所在地域
     * @param Region CVM所在地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get CVM所在地域中文 
     * @return RegionZh CVM所在地域中文
     */
    public String getRegionZh() {
        return this.RegionZh;
    }

    /**
     * Set CVM所在地域中文
     * @param RegionZh CVM所在地域中文
     */
    public void setRegionZh(String RegionZh) {
        this.RegionZh = RegionZh;
    }

    /**
     * Get CVM所在地域详情 
     * @return RegionDetail CVM所在地域详情
     */
    public String getRegionDetail() {
        return this.RegionDetail;
    }

    /**
     * Set CVM所在地域详情
     * @param RegionDetail CVM所在地域详情
     */
    public void setRegionDetail(String RegionDetail) {
        this.RegionDetail = RegionDetail;
    }

    /**
     * Get 主机所在可用区 
     * @return ZoneZh 主机所在可用区
     */
    public String getZoneZh() {
        return this.ZoneZh;
    }

    /**
     * Set 主机所在可用区
     * @param ZoneZh 主机所在可用区
     */
    public void setZoneZh(String ZoneZh) {
        this.ZoneZh = ZoneZh;
    }

    /**
     * Get 备机所在可用区 
     * @return ZoneZhBack 备机所在可用区
     */
    public String getZoneZhBack() {
        return this.ZoneZhBack;
    }

    /**
     * Set 备机所在可用区
     * @param ZoneZhBack 备机所在可用区
     */
    public void setZoneZhBack(String ZoneZhBack) {
        this.ZoneZhBack = ZoneZhBack;
    }

    /**
     * Get 防火墙CVM带宽值 
     * @return BandWidth 防火墙CVM带宽值
     */
    public Long getBandWidth() {
        return this.BandWidth;
    }

    /**
     * Set 防火墙CVM带宽值
     * @param BandWidth 防火墙CVM带宽值
     */
    public void setBandWidth(Long BandWidth) {
        this.BandWidth = BandWidth;
    }

    /**
     * Get 实例主机所在可用区 
     * @return Zone 实例主机所在可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 实例主机所在可用区
     * @param Zone 实例主机所在可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 实例备机所在可用区 
     * @return ZoneBak 实例备机所在可用区
     */
    public String getZoneBak() {
        return this.ZoneBak;
    }

    /**
     * Set 实例备机所在可用区
     * @param ZoneBak 实例备机所在可用区
     */
    public void setZoneBak(String ZoneBak) {
        this.ZoneBak = ZoneBak;
    }

    public VpcFwCvmInsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VpcFwCvmInsInfo(VpcFwCvmInsInfo source) {
        if (source.FwInsId != null) {
            this.FwInsId = new String(source.FwInsId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.RegionZh != null) {
            this.RegionZh = new String(source.RegionZh);
        }
        if (source.RegionDetail != null) {
            this.RegionDetail = new String(source.RegionDetail);
        }
        if (source.ZoneZh != null) {
            this.ZoneZh = new String(source.ZoneZh);
        }
        if (source.ZoneZhBack != null) {
            this.ZoneZhBack = new String(source.ZoneZhBack);
        }
        if (source.BandWidth != null) {
            this.BandWidth = new Long(source.BandWidth);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ZoneBak != null) {
            this.ZoneBak = new String(source.ZoneBak);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FwInsId", this.FwInsId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RegionZh", this.RegionZh);
        this.setParamSimple(map, prefix + "RegionDetail", this.RegionDetail);
        this.setParamSimple(map, prefix + "ZoneZh", this.ZoneZh);
        this.setParamSimple(map, prefix + "ZoneZhBack", this.ZoneZhBack);
        this.setParamSimple(map, prefix + "BandWidth", this.BandWidth);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ZoneBak", this.ZoneBak);

    }
}

