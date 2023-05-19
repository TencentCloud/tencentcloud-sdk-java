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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHostTkeInstanceListRequest extends AbstractModel{

    /**
    * 待部署的证书ID
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * 分页偏移量，从0开始。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页数量，默认10。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 是否查询缓存，1：是； 0：否， 默认为查询缓存，缓存半小时
    */
    @SerializedName("IsCache")
    @Expose
    private Long IsCache;

    /**
    * 过滤参数列表； FilterKey：domainMatch（查询域名是否匹配的实例列表） FilterValue：1，表示查询匹配； 0，表示查询不匹配； 默认查询匹配
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 是否异步缓存
    */
    @SerializedName("AsyncCache")
    @Expose
    private Long AsyncCache;

    /**
    * 原证书ID
    */
    @SerializedName("OldCertificateId")
    @Expose
    private String OldCertificateId;

    /**
     * Get 待部署的证书ID 
     * @return CertificateId 待部署的证书ID
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set 待部署的证书ID
     * @param CertificateId 待部署的证书ID
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get 分页偏移量，从0开始。 
     * @return Offset 分页偏移量，从0开始。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量，从0开始。
     * @param Offset 分页偏移量，从0开始。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页数量，默认10。 
     * @return Limit 每页数量，默认10。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页数量，默认10。
     * @param Limit 每页数量，默认10。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 是否查询缓存，1：是； 0：否， 默认为查询缓存，缓存半小时 
     * @return IsCache 是否查询缓存，1：是； 0：否， 默认为查询缓存，缓存半小时
     */
    public Long getIsCache() {
        return this.IsCache;
    }

    /**
     * Set 是否查询缓存，1：是； 0：否， 默认为查询缓存，缓存半小时
     * @param IsCache 是否查询缓存，1：是； 0：否， 默认为查询缓存，缓存半小时
     */
    public void setIsCache(Long IsCache) {
        this.IsCache = IsCache;
    }

    /**
     * Get 过滤参数列表； FilterKey：domainMatch（查询域名是否匹配的实例列表） FilterValue：1，表示查询匹配； 0，表示查询不匹配； 默认查询匹配 
     * @return Filters 过滤参数列表； FilterKey：domainMatch（查询域名是否匹配的实例列表） FilterValue：1，表示查询匹配； 0，表示查询不匹配； 默认查询匹配
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤参数列表； FilterKey：domainMatch（查询域名是否匹配的实例列表） FilterValue：1，表示查询匹配； 0，表示查询不匹配； 默认查询匹配
     * @param Filters 过滤参数列表； FilterKey：domainMatch（查询域名是否匹配的实例列表） FilterValue：1，表示查询匹配； 0，表示查询不匹配； 默认查询匹配
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 是否异步缓存 
     * @return AsyncCache 是否异步缓存
     */
    public Long getAsyncCache() {
        return this.AsyncCache;
    }

    /**
     * Set 是否异步缓存
     * @param AsyncCache 是否异步缓存
     */
    public void setAsyncCache(Long AsyncCache) {
        this.AsyncCache = AsyncCache;
    }

    /**
     * Get 原证书ID 
     * @return OldCertificateId 原证书ID
     */
    public String getOldCertificateId() {
        return this.OldCertificateId;
    }

    /**
     * Set 原证书ID
     * @param OldCertificateId 原证书ID
     */
    public void setOldCertificateId(String OldCertificateId) {
        this.OldCertificateId = OldCertificateId;
    }

    public DescribeHostTkeInstanceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHostTkeInstanceListRequest(DescribeHostTkeInstanceListRequest source) {
        if (source.CertificateId != null) {
            this.CertificateId = new String(source.CertificateId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.IsCache != null) {
            this.IsCache = new Long(source.IsCache);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.AsyncCache != null) {
            this.AsyncCache = new Long(source.AsyncCache);
        }
        if (source.OldCertificateId != null) {
            this.OldCertificateId = new String(source.OldCertificateId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "IsCache", this.IsCache);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "AsyncCache", this.AsyncCache);
        this.setParamSimple(map, prefix + "OldCertificateId", this.OldCertificateId);

    }
}

