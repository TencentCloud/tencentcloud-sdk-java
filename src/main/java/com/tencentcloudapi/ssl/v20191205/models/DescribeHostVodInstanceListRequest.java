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

public class DescribeHostVodInstanceListRequest extends AbstractModel{

    /**
    * 待部署的证书ID
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * 部署资源类型 vod
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 是否查询缓存，1：是； 0：否， 默认为查询缓存，缓存半小时
    */
    @SerializedName("IsCache")
    @Expose
    private Long IsCache;

    /**
    * 过滤参数列表
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 已部署的证书ID
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
     * Get 部署资源类型 vod 
     * @return ResourceType 部署资源类型 vod
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 部署资源类型 vod
     * @param ResourceType 部署资源类型 vod
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
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
     * Get 过滤参数列表 
     * @return Filters 过滤参数列表
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤参数列表
     * @param Filters 过滤参数列表
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 已部署的证书ID 
     * @return OldCertificateId 已部署的证书ID
     */
    public String getOldCertificateId() {
        return this.OldCertificateId;
    }

    /**
     * Set 已部署的证书ID
     * @param OldCertificateId 已部署的证书ID
     */
    public void setOldCertificateId(String OldCertificateId) {
        this.OldCertificateId = OldCertificateId;
    }

    public DescribeHostVodInstanceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHostVodInstanceListRequest(DescribeHostVodInstanceListRequest source) {
        if (source.CertificateId != null) {
            this.CertificateId = new String(source.CertificateId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
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
        if (source.OldCertificateId != null) {
            this.OldCertificateId = new String(source.OldCertificateId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "IsCache", this.IsCache);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "OldCertificateId", this.OldCertificateId);

    }
}

