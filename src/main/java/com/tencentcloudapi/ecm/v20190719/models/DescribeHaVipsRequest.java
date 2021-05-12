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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHaVipsRequest extends AbstractModel{

    /**
    * HAVIP数组，HAVIP唯一ID，形如：havip-9o233uri。
    */
    @SerializedName("HaVipIds")
    @Expose
    private String [] HaVipIds;

    /**
    * 过滤条件，参数不支持同时指定HaVipIds和Filters。
havip-id - String - HAVIP唯一ID，形如：havip-9o233uri。
havip-name - String - HAVIP名称。
vpc-id - String - HAVIP所在私有网络ID。
subnet-id - String - HAVIP所在子网ID。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 偏移量，默认值是0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认值是20，最大是100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Ecm 区域，不填代表全部区域。
    */
    @SerializedName("EcmRegion")
    @Expose
    private String EcmRegion;

    /**
     * Get HAVIP数组，HAVIP唯一ID，形如：havip-9o233uri。 
     * @return HaVipIds HAVIP数组，HAVIP唯一ID，形如：havip-9o233uri。
     */
    public String [] getHaVipIds() {
        return this.HaVipIds;
    }

    /**
     * Set HAVIP数组，HAVIP唯一ID，形如：havip-9o233uri。
     * @param HaVipIds HAVIP数组，HAVIP唯一ID，形如：havip-9o233uri。
     */
    public void setHaVipIds(String [] HaVipIds) {
        this.HaVipIds = HaVipIds;
    }

    /**
     * Get 过滤条件，参数不支持同时指定HaVipIds和Filters。
havip-id - String - HAVIP唯一ID，形如：havip-9o233uri。
havip-name - String - HAVIP名称。
vpc-id - String - HAVIP所在私有网络ID。
subnet-id - String - HAVIP所在子网ID。 
     * @return Filters 过滤条件，参数不支持同时指定HaVipIds和Filters。
havip-id - String - HAVIP唯一ID，形如：havip-9o233uri。
havip-name - String - HAVIP名称。
vpc-id - String - HAVIP所在私有网络ID。
subnet-id - String - HAVIP所在子网ID。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，参数不支持同时指定HaVipIds和Filters。
havip-id - String - HAVIP唯一ID，形如：havip-9o233uri。
havip-name - String - HAVIP名称。
vpc-id - String - HAVIP所在私有网络ID。
subnet-id - String - HAVIP所在子网ID。
     * @param Filters 过滤条件，参数不支持同时指定HaVipIds和Filters。
havip-id - String - HAVIP唯一ID，形如：havip-9o233uri。
havip-name - String - HAVIP名称。
vpc-id - String - HAVIP所在私有网络ID。
subnet-id - String - HAVIP所在子网ID。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 偏移量，默认值是0。 
     * @return Offset 偏移量，默认值是0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认值是0。
     * @param Offset 偏移量，默认值是0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认值是20，最大是100。 
     * @return Limit 返回数量，默认值是20，最大是100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认值是20，最大是100。
     * @param Limit 返回数量，默认值是20，最大是100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Ecm 区域，不填代表全部区域。 
     * @return EcmRegion Ecm 区域，不填代表全部区域。
     */
    public String getEcmRegion() {
        return this.EcmRegion;
    }

    /**
     * Set Ecm 区域，不填代表全部区域。
     * @param EcmRegion Ecm 区域，不填代表全部区域。
     */
    public void setEcmRegion(String EcmRegion) {
        this.EcmRegion = EcmRegion;
    }

    public DescribeHaVipsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHaVipsRequest(DescribeHaVipsRequest source) {
        if (source.HaVipIds != null) {
            this.HaVipIds = new String[source.HaVipIds.length];
            for (int i = 0; i < source.HaVipIds.length; i++) {
                this.HaVipIds[i] = new String(source.HaVipIds[i]);
            }
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
        if (source.EcmRegion != null) {
            this.EcmRegion = new String(source.EcmRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "HaVipIds.", this.HaVipIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "EcmRegion", this.EcmRegion);

    }
}

