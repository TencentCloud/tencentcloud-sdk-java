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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccessRegionDetial extends AbstractModel{

    /**
    * 区域ID
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * 区域的中文或英文名称
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * 可选的并发量取值数组
    */
    @SerializedName("ConcurrentList")
    @Expose
    private Long [] ConcurrentList;

    /**
    * 可选的带宽取值数组
    */
    @SerializedName("BandwidthList")
    @Expose
    private Long [] BandwidthList;

    /**
    * 机房所属大区
    */
    @SerializedName("RegionArea")
    @Expose
    private String RegionArea;

    /**
    * 机房所属大区名
    */
    @SerializedName("RegionAreaName")
    @Expose
    private String RegionAreaName;

    /**
    * 机房类型, dc表示DataCenter数据中心, ec表示EdgeComputing边缘节点
    */
    @SerializedName("IDCType")
    @Expose
    private String IDCType;

    /**
    * 特性位图，每个bit位代表一种特性，其中：
0，表示不支持该特性；
1，表示支持该特性。
特性位图含义如下（从右往左）：
第1个bit，支持4层加速；
第2个bit，支持7层加速；
第3个bit，支持Http3接入；
第4个bit，支持IPv6；
第5个bit，支持精品BGP接入；
第6个bit，支持三网接入；
第7个bit，支持接入段Qos加速。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FeatureBitmap")
    @Expose
    private Long FeatureBitmap;

    /**
     * Get 区域ID 
     * @return RegionId 区域ID
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 区域ID
     * @param RegionId 区域ID
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 区域的中文或英文名称 
     * @return RegionName 区域的中文或英文名称
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 区域的中文或英文名称
     * @param RegionName 区域的中文或英文名称
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get 可选的并发量取值数组 
     * @return ConcurrentList 可选的并发量取值数组
     */
    public Long [] getConcurrentList() {
        return this.ConcurrentList;
    }

    /**
     * Set 可选的并发量取值数组
     * @param ConcurrentList 可选的并发量取值数组
     */
    public void setConcurrentList(Long [] ConcurrentList) {
        this.ConcurrentList = ConcurrentList;
    }

    /**
     * Get 可选的带宽取值数组 
     * @return BandwidthList 可选的带宽取值数组
     */
    public Long [] getBandwidthList() {
        return this.BandwidthList;
    }

    /**
     * Set 可选的带宽取值数组
     * @param BandwidthList 可选的带宽取值数组
     */
    public void setBandwidthList(Long [] BandwidthList) {
        this.BandwidthList = BandwidthList;
    }

    /**
     * Get 机房所属大区 
     * @return RegionArea 机房所属大区
     */
    public String getRegionArea() {
        return this.RegionArea;
    }

    /**
     * Set 机房所属大区
     * @param RegionArea 机房所属大区
     */
    public void setRegionArea(String RegionArea) {
        this.RegionArea = RegionArea;
    }

    /**
     * Get 机房所属大区名 
     * @return RegionAreaName 机房所属大区名
     */
    public String getRegionAreaName() {
        return this.RegionAreaName;
    }

    /**
     * Set 机房所属大区名
     * @param RegionAreaName 机房所属大区名
     */
    public void setRegionAreaName(String RegionAreaName) {
        this.RegionAreaName = RegionAreaName;
    }

    /**
     * Get 机房类型, dc表示DataCenter数据中心, ec表示EdgeComputing边缘节点 
     * @return IDCType 机房类型, dc表示DataCenter数据中心, ec表示EdgeComputing边缘节点
     */
    public String getIDCType() {
        return this.IDCType;
    }

    /**
     * Set 机房类型, dc表示DataCenter数据中心, ec表示EdgeComputing边缘节点
     * @param IDCType 机房类型, dc表示DataCenter数据中心, ec表示EdgeComputing边缘节点
     */
    public void setIDCType(String IDCType) {
        this.IDCType = IDCType;
    }

    /**
     * Get 特性位图，每个bit位代表一种特性，其中：
0，表示不支持该特性；
1，表示支持该特性。
特性位图含义如下（从右往左）：
第1个bit，支持4层加速；
第2个bit，支持7层加速；
第3个bit，支持Http3接入；
第4个bit，支持IPv6；
第5个bit，支持精品BGP接入；
第6个bit，支持三网接入；
第7个bit，支持接入段Qos加速。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FeatureBitmap 特性位图，每个bit位代表一种特性，其中：
0，表示不支持该特性；
1，表示支持该特性。
特性位图含义如下（从右往左）：
第1个bit，支持4层加速；
第2个bit，支持7层加速；
第3个bit，支持Http3接入；
第4个bit，支持IPv6；
第5个bit，支持精品BGP接入；
第6个bit，支持三网接入；
第7个bit，支持接入段Qos加速。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFeatureBitmap() {
        return this.FeatureBitmap;
    }

    /**
     * Set 特性位图，每个bit位代表一种特性，其中：
0，表示不支持该特性；
1，表示支持该特性。
特性位图含义如下（从右往左）：
第1个bit，支持4层加速；
第2个bit，支持7层加速；
第3个bit，支持Http3接入；
第4个bit，支持IPv6；
第5个bit，支持精品BGP接入；
第6个bit，支持三网接入；
第7个bit，支持接入段Qos加速。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FeatureBitmap 特性位图，每个bit位代表一种特性，其中：
0，表示不支持该特性；
1，表示支持该特性。
特性位图含义如下（从右往左）：
第1个bit，支持4层加速；
第2个bit，支持7层加速；
第3个bit，支持Http3接入；
第4个bit，支持IPv6；
第5个bit，支持精品BGP接入；
第6个bit，支持三网接入；
第7个bit，支持接入段Qos加速。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFeatureBitmap(Long FeatureBitmap) {
        this.FeatureBitmap = FeatureBitmap;
    }

    public AccessRegionDetial() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessRegionDetial(AccessRegionDetial source) {
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.ConcurrentList != null) {
            this.ConcurrentList = new Long[source.ConcurrentList.length];
            for (int i = 0; i < source.ConcurrentList.length; i++) {
                this.ConcurrentList[i] = new Long(source.ConcurrentList[i]);
            }
        }
        if (source.BandwidthList != null) {
            this.BandwidthList = new Long[source.BandwidthList.length];
            for (int i = 0; i < source.BandwidthList.length; i++) {
                this.BandwidthList[i] = new Long(source.BandwidthList[i]);
            }
        }
        if (source.RegionArea != null) {
            this.RegionArea = new String(source.RegionArea);
        }
        if (source.RegionAreaName != null) {
            this.RegionAreaName = new String(source.RegionAreaName);
        }
        if (source.IDCType != null) {
            this.IDCType = new String(source.IDCType);
        }
        if (source.FeatureBitmap != null) {
            this.FeatureBitmap = new Long(source.FeatureBitmap);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamArraySimple(map, prefix + "ConcurrentList.", this.ConcurrentList);
        this.setParamArraySimple(map, prefix + "BandwidthList.", this.BandwidthList);
        this.setParamSimple(map, prefix + "RegionArea", this.RegionArea);
        this.setParamSimple(map, prefix + "RegionAreaName", this.RegionAreaName);
        this.setParamSimple(map, prefix + "IDCType", this.IDCType);
        this.setParamSimple(map, prefix + "FeatureBitmap", this.FeatureBitmap);

    }
}

