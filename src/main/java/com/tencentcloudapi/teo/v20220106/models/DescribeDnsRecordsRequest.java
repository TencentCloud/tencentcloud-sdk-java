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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDnsRecordsRequest extends AbstractModel{

    /**
    * 查询条件过滤器
    */
    @SerializedName("Filters")
    @Expose
    private DnsRecordFilter [] Filters;

    /**
    * 排序
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 可选值 asc, desc
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
    * 可选值 all, any
    */
    @SerializedName("Match")
    @Expose
    private String Match;

    /**
    * 分页查询限制数目，默认为 100，最大可设置为 1000
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页查询偏移量，默认为 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 站点 ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
     * Get 查询条件过滤器 
     * @return Filters 查询条件过滤器
     */
    public DnsRecordFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 查询条件过滤器
     * @param Filters 查询条件过滤器
     */
    public void setFilters(DnsRecordFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序 
     * @return Order 排序
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序
     * @param Order 排序
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 可选值 asc, desc 
     * @return Direction 可选值 asc, desc
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set 可选值 asc, desc
     * @param Direction 可选值 asc, desc
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    /**
     * Get 可选值 all, any 
     * @return Match 可选值 all, any
     */
    public String getMatch() {
        return this.Match;
    }

    /**
     * Set 可选值 all, any
     * @param Match 可选值 all, any
     */
    public void setMatch(String Match) {
        this.Match = Match;
    }

    /**
     * Get 分页查询限制数目，默认为 100，最大可设置为 1000 
     * @return Limit 分页查询限制数目，默认为 100，最大可设置为 1000
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页查询限制数目，默认为 100，最大可设置为 1000
     * @param Limit 分页查询限制数目，默认为 100，最大可设置为 1000
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页查询偏移量，默认为 0 
     * @return Offset 分页查询偏移量，默认为 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页查询偏移量，默认为 0
     * @param Offset 分页查询偏移量，默认为 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 站点 ID 
     * @return ZoneId 站点 ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点 ID
     * @param ZoneId 站点 ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    public DescribeDnsRecordsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDnsRecordsRequest(DescribeDnsRecordsRequest source) {
        if (source.Filters != null) {
            this.Filters = new DnsRecordFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new DnsRecordFilter(source.Filters[i]);
            }
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.Direction != null) {
            this.Direction = new String(source.Direction);
        }
        if (source.Match != null) {
            this.Match = new String(source.Match);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "Match", this.Match);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);

    }
}

