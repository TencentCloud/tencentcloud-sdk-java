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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionInfo extends AbstractModel {

    /**
    * 地域名称，例如“ap-guangzhou"
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 地域描述，例如"广州”
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 地域唯一标记
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 地域下所有可用区列表
    */
    @SerializedName("Zones")
    @Expose
    private ZoneInfo [] Zones;

    /**
    * 该地域下集群数目
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 0代表是国际站 1代表不是
    */
    @SerializedName("IsInternationalSite")
    @Expose
    private Long IsInternationalSite;

    /**
    * 桶
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
     * Get 地域名称，例如“ap-guangzhou" 
     * @return Name 地域名称，例如“ap-guangzhou"
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 地域名称，例如“ap-guangzhou"
     * @param Name 地域名称，例如“ap-guangzhou"
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 地域描述，例如"广州” 
     * @return Desc 地域描述，例如"广州”
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 地域描述，例如"广州”
     * @param Desc 地域描述，例如"广州”
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 地域唯一标记 
     * @return RegionId 地域唯一标记
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域唯一标记
     * @param RegionId 地域唯一标记
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 地域下所有可用区列表 
     * @return Zones 地域下所有可用区列表
     */
    public ZoneInfo [] getZones() {
        return this.Zones;
    }

    /**
     * Set 地域下所有可用区列表
     * @param Zones 地域下所有可用区列表
     */
    public void setZones(ZoneInfo [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get 该地域下集群数目 
     * @return Count 该地域下集群数目
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 该地域下集群数目
     * @param Count 该地域下集群数目
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 0代表是国际站 1代表不是 
     * @return IsInternationalSite 0代表是国际站 1代表不是
     */
    public Long getIsInternationalSite() {
        return this.IsInternationalSite;
    }

    /**
     * Set 0代表是国际站 1代表不是
     * @param IsInternationalSite 0代表是国际站 1代表不是
     */
    public void setIsInternationalSite(Long IsInternationalSite) {
        this.IsInternationalSite = IsInternationalSite;
    }

    /**
     * Get 桶 
     * @return Bucket 桶
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set 桶
     * @param Bucket 桶
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    public RegionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegionInfo(RegionInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.Zones != null) {
            this.Zones = new ZoneInfo[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new ZoneInfo(source.Zones[i]);
            }
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.IsInternationalSite != null) {
            this.IsInternationalSite = new Long(source.IsInternationalSite);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamArrayObj(map, prefix + "Zones.", this.Zones);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "IsInternationalSite", this.IsInternationalSite);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);

    }
}

