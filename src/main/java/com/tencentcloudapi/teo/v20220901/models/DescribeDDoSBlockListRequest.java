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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDDoSBlockListRequest extends AbstractModel{

    /**
    * 攻击事件起始时间。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 攻击事件列表。
    */
    @SerializedName("EventIds")
    @Expose
    private String [] EventIds;

    /**
    * 站点列表，不填默认选择全部站点。
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * 策略列表，不填默认选择全部策略。
    */
    @SerializedName("PolicyIds")
    @Expose
    private Long [] PolicyIds;

    /**
    * 分页查询的限制数目，默认值为20，最大查询条目为1000。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页的偏移量，默认值为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 数据归属地区，取值有：
<li>overseas：全球（除中国大陆地区）数据；</li>
<li>mainland：中国大陆地区数据。</li>不填将根据用户所在地智能选择地区。
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get 攻击事件起始时间。 
     * @return StartTime 攻击事件起始时间。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 攻击事件起始时间。
     * @param StartTime 攻击事件起始时间。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 攻击事件列表。 
     * @return EventIds 攻击事件列表。
     */
    public String [] getEventIds() {
        return this.EventIds;
    }

    /**
     * Set 攻击事件列表。
     * @param EventIds 攻击事件列表。
     */
    public void setEventIds(String [] EventIds) {
        this.EventIds = EventIds;
    }

    /**
     * Get 站点列表，不填默认选择全部站点。 
     * @return ZoneIds 站点列表，不填默认选择全部站点。
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set 站点列表，不填默认选择全部站点。
     * @param ZoneIds 站点列表，不填默认选择全部站点。
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get 策略列表，不填默认选择全部策略。 
     * @return PolicyIds 策略列表，不填默认选择全部策略。
     */
    public Long [] getPolicyIds() {
        return this.PolicyIds;
    }

    /**
     * Set 策略列表，不填默认选择全部策略。
     * @param PolicyIds 策略列表，不填默认选择全部策略。
     */
    public void setPolicyIds(Long [] PolicyIds) {
        this.PolicyIds = PolicyIds;
    }

    /**
     * Get 分页查询的限制数目，默认值为20，最大查询条目为1000。 
     * @return Limit 分页查询的限制数目，默认值为20，最大查询条目为1000。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页查询的限制数目，默认值为20，最大查询条目为1000。
     * @param Limit 分页查询的限制数目，默认值为20，最大查询条目为1000。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页的偏移量，默认值为0。 
     * @return Offset 分页的偏移量，默认值为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页的偏移量，默认值为0。
     * @param Offset 分页的偏移量，默认值为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 数据归属地区，取值有：
<li>overseas：全球（除中国大陆地区）数据；</li>
<li>mainland：中国大陆地区数据。</li>不填将根据用户所在地智能选择地区。 
     * @return Area 数据归属地区，取值有：
<li>overseas：全球（除中国大陆地区）数据；</li>
<li>mainland：中国大陆地区数据。</li>不填将根据用户所在地智能选择地区。
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 数据归属地区，取值有：
<li>overseas：全球（除中国大陆地区）数据；</li>
<li>mainland：中国大陆地区数据。</li>不填将根据用户所在地智能选择地区。
     * @param Area 数据归属地区，取值有：
<li>overseas：全球（除中国大陆地区）数据；</li>
<li>mainland：中国大陆地区数据。</li>不填将根据用户所在地智能选择地区。
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public DescribeDDoSBlockListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDDoSBlockListRequest(DescribeDDoSBlockListRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EventIds != null) {
            this.EventIds = new String[source.EventIds.length];
            for (int i = 0; i < source.EventIds.length; i++) {
                this.EventIds[i] = new String(source.EventIds[i]);
            }
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new String[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new String(source.ZoneIds[i]);
            }
        }
        if (source.PolicyIds != null) {
            this.PolicyIds = new Long[source.PolicyIds.length];
            for (int i = 0; i < source.PolicyIds.length; i++) {
                this.PolicyIds[i] = new Long(source.PolicyIds[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamArraySimple(map, prefix + "EventIds.", this.EventIds);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamArraySimple(map, prefix + "PolicyIds.", this.PolicyIds);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

