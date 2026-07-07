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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeModelKeysRequest extends AbstractModel {

    /**
    * <p>接入类型过滤：PublicBYOK/PublicCustom/PrivateCustom</p>
    */
    @SerializedName("AccessType")
    @Expose
    private String AccessType;

    /**
    * <p>过滤条件</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>返回数量限制</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>翻页启始索引</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>服务提供商ID</p>
    */
    @SerializedName("ServiceProviderIds")
    @Expose
    private String [] ServiceProviderIds;

    /**
     * Get <p>接入类型过滤：PublicBYOK/PublicCustom/PrivateCustom</p> 
     * @return AccessType <p>接入类型过滤：PublicBYOK/PublicCustom/PrivateCustom</p>
     */
    public String getAccessType() {
        return this.AccessType;
    }

    /**
     * Set <p>接入类型过滤：PublicBYOK/PublicCustom/PrivateCustom</p>
     * @param AccessType <p>接入类型过滤：PublicBYOK/PublicCustom/PrivateCustom</p>
     */
    public void setAccessType(String AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get <p>过滤条件</p> 
     * @return Filters <p>过滤条件</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件</p>
     * @param Filters <p>过滤条件</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>返回数量限制</p> 
     * @return Limit <p>返回数量限制</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数量限制</p>
     * @param Limit <p>返回数量限制</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>翻页启始索引</p> 
     * @return Offset <p>翻页启始索引</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>翻页启始索引</p>
     * @param Offset <p>翻页启始索引</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>服务提供商ID</p> 
     * @return ServiceProviderIds <p>服务提供商ID</p>
     */
    public String [] getServiceProviderIds() {
        return this.ServiceProviderIds;
    }

    /**
     * Set <p>服务提供商ID</p>
     * @param ServiceProviderIds <p>服务提供商ID</p>
     */
    public void setServiceProviderIds(String [] ServiceProviderIds) {
        this.ServiceProviderIds = ServiceProviderIds;
    }

    public DescribeModelKeysRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeModelKeysRequest(DescribeModelKeysRequest source) {
        if (source.AccessType != null) {
            this.AccessType = new String(source.AccessType);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.ServiceProviderIds != null) {
            this.ServiceProviderIds = new String[source.ServiceProviderIds.length];
            for (int i = 0; i < source.ServiceProviderIds.length; i++) {
                this.ServiceProviderIds[i] = new String(source.ServiceProviderIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArraySimple(map, prefix + "ServiceProviderIds.", this.ServiceProviderIds);

    }
}

