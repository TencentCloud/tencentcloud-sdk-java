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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSaleRegionInfo extends AbstractModel {

    /**
    * <p>Region英文字符串</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>售卖Zone列表</p>
    */
    @SerializedName("ZoneList")
    @Expose
    private DescribeSaleZonesInfo [] ZoneList;

    /**
    * <p>Region中文字符串</p>
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * <p>是否售卖。1:售卖，0不售卖</p>
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * <p>多可用可选数量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AvailableZoneNum")
    @Expose
    private Long AvailableZoneNum;

    /**
    * <p>是否允许使用日志副本</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsSupportedLogReplica")
    @Expose
    private Boolean IsSupportedLogReplica;

    /**
    * <p>可用区组合</p>
    */
    @SerializedName("ZoneGroup")
    @Expose
    private DescribeSaleZonesGroup [] ZoneGroup;

    /**
    * <p>是否支持serverless</p>
    */
    @SerializedName("IsSupportServerless")
    @Expose
    private Boolean IsSupportServerless;

    /**
     * Get <p>Region英文字符串</p> 
     * @return Region <p>Region英文字符串</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>Region英文字符串</p>
     * @param Region <p>Region英文字符串</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>售卖Zone列表</p> 
     * @return ZoneList <p>售卖Zone列表</p>
     */
    public DescribeSaleZonesInfo [] getZoneList() {
        return this.ZoneList;
    }

    /**
     * Set <p>售卖Zone列表</p>
     * @param ZoneList <p>售卖Zone列表</p>
     */
    public void setZoneList(DescribeSaleZonesInfo [] ZoneList) {
        this.ZoneList = ZoneList;
    }

    /**
     * Get <p>Region中文字符串</p> 
     * @return RegionName <p>Region中文字符串</p>
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set <p>Region中文字符串</p>
     * @param RegionName <p>Region中文字符串</p>
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get <p>是否售卖。1:售卖，0不售卖</p> 
     * @return Enable <p>是否售卖。1:售卖，0不售卖</p>
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>是否售卖。1:售卖，0不售卖</p>
     * @param Enable <p>是否售卖。1:售卖，0不售卖</p>
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>多可用可选数量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AvailableZoneNum <p>多可用可选数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAvailableZoneNum() {
        return this.AvailableZoneNum;
    }

    /**
     * Set <p>多可用可选数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AvailableZoneNum <p>多可用可选数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAvailableZoneNum(Long AvailableZoneNum) {
        this.AvailableZoneNum = AvailableZoneNum;
    }

    /**
     * Get <p>是否允许使用日志副本</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsSupportedLogReplica <p>是否允许使用日志副本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsSupportedLogReplica() {
        return this.IsSupportedLogReplica;
    }

    /**
     * Set <p>是否允许使用日志副本</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsSupportedLogReplica <p>是否允许使用日志副本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsSupportedLogReplica(Boolean IsSupportedLogReplica) {
        this.IsSupportedLogReplica = IsSupportedLogReplica;
    }

    /**
     * Get <p>可用区组合</p> 
     * @return ZoneGroup <p>可用区组合</p>
     */
    public DescribeSaleZonesGroup [] getZoneGroup() {
        return this.ZoneGroup;
    }

    /**
     * Set <p>可用区组合</p>
     * @param ZoneGroup <p>可用区组合</p>
     */
    public void setZoneGroup(DescribeSaleZonesGroup [] ZoneGroup) {
        this.ZoneGroup = ZoneGroup;
    }

    /**
     * Get <p>是否支持serverless</p> 
     * @return IsSupportServerless <p>是否支持serverless</p>
     */
    public Boolean getIsSupportServerless() {
        return this.IsSupportServerless;
    }

    /**
     * Set <p>是否支持serverless</p>
     * @param IsSupportServerless <p>是否支持serverless</p>
     */
    public void setIsSupportServerless(Boolean IsSupportServerless) {
        this.IsSupportServerless = IsSupportServerless;
    }

    public DescribeSaleRegionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSaleRegionInfo(DescribeSaleRegionInfo source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.ZoneList != null) {
            this.ZoneList = new DescribeSaleZonesInfo[source.ZoneList.length];
            for (int i = 0; i < source.ZoneList.length; i++) {
                this.ZoneList[i] = new DescribeSaleZonesInfo(source.ZoneList[i]);
            }
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.AvailableZoneNum != null) {
            this.AvailableZoneNum = new Long(source.AvailableZoneNum);
        }
        if (source.IsSupportedLogReplica != null) {
            this.IsSupportedLogReplica = new Boolean(source.IsSupportedLogReplica);
        }
        if (source.ZoneGroup != null) {
            this.ZoneGroup = new DescribeSaleZonesGroup[source.ZoneGroup.length];
            for (int i = 0; i < source.ZoneGroup.length; i++) {
                this.ZoneGroup[i] = new DescribeSaleZonesGroup(source.ZoneGroup[i]);
            }
        }
        if (source.IsSupportServerless != null) {
            this.IsSupportServerless = new Boolean(source.IsSupportServerless);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamArrayObj(map, prefix + "ZoneList.", this.ZoneList);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "AvailableZoneNum", this.AvailableZoneNum);
        this.setParamSimple(map, prefix + "IsSupportedLogReplica", this.IsSupportedLogReplica);
        this.setParamArrayObj(map, prefix + "ZoneGroup.", this.ZoneGroup);
        this.setParamSimple(map, prefix + "IsSupportServerless", this.IsSupportServerless);

    }
}

