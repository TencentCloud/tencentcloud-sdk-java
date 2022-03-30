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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePrivateZoneRecordListRequest extends AbstractModel{

    /**
    * 私有域ID: zone-xxxxxx
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 过滤参数（支持使用Value、RecordType过滤）
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 分页偏移量，从0开始
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页限制数目， 最大200，默认20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 私有域ID: zone-xxxxxx 
     * @return ZoneId 私有域ID: zone-xxxxxx
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 私有域ID: zone-xxxxxx
     * @param ZoneId 私有域ID: zone-xxxxxx
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 过滤参数（支持使用Value、RecordType过滤） 
     * @return Filters 过滤参数（支持使用Value、RecordType过滤）
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤参数（支持使用Value、RecordType过滤）
     * @param Filters 过滤参数（支持使用Value、RecordType过滤）
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 分页偏移量，从0开始 
     * @return Offset 分页偏移量，从0开始
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量，从0开始
     * @param Offset 分页偏移量，从0开始
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页限制数目， 最大200，默认20 
     * @return Limit 分页限制数目， 最大200，默认20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页限制数目， 最大200，默认20
     * @param Limit 分页限制数目， 最大200，默认20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribePrivateZoneRecordListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePrivateZoneRecordListRequest(DescribePrivateZoneRecordListRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

