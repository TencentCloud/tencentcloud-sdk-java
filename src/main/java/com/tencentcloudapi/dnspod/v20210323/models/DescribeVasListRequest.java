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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVasListRequest extends AbstractModel {

    /**
    * <p>偏移量，默认值为0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>限制数量，默认值为20。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>域名ID</p>
    */
    @SerializedName("DomainId")
    @Expose
    private Long DomainId;

    /**
    * <p>使用资源 ID 列表查询</p>
    */
    @SerializedName("ResourceIdList")
    @Expose
    private String [] ResourceIdList;

    /**
    * <p>增值服务类型</p>
    */
    @SerializedName("LimitType")
    @Expose
    private String LimitType;

    /**
     * Get <p>偏移量，默认值为0。</p> 
     * @return Offset <p>偏移量，默认值为0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，默认值为0。</p>
     * @param Offset <p>偏移量，默认值为0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>限制数量，默认值为20。</p> 
     * @return Limit <p>限制数量，默认值为20。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>限制数量，默认值为20。</p>
     * @param Limit <p>限制数量，默认值为20。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>域名ID</p> 
     * @return DomainId <p>域名ID</p>
     */
    public Long getDomainId() {
        return this.DomainId;
    }

    /**
     * Set <p>域名ID</p>
     * @param DomainId <p>域名ID</p>
     */
    public void setDomainId(Long DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get <p>使用资源 ID 列表查询</p> 
     * @return ResourceIdList <p>使用资源 ID 列表查询</p>
     */
    public String [] getResourceIdList() {
        return this.ResourceIdList;
    }

    /**
     * Set <p>使用资源 ID 列表查询</p>
     * @param ResourceIdList <p>使用资源 ID 列表查询</p>
     */
    public void setResourceIdList(String [] ResourceIdList) {
        this.ResourceIdList = ResourceIdList;
    }

    /**
     * Get <p>增值服务类型</p> 
     * @return LimitType <p>增值服务类型</p>
     */
    public String getLimitType() {
        return this.LimitType;
    }

    /**
     * Set <p>增值服务类型</p>
     * @param LimitType <p>增值服务类型</p>
     */
    public void setLimitType(String LimitType) {
        this.LimitType = LimitType;
    }

    public DescribeVasListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVasListRequest(DescribeVasListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.DomainId != null) {
            this.DomainId = new Long(source.DomainId);
        }
        if (source.ResourceIdList != null) {
            this.ResourceIdList = new String[source.ResourceIdList.length];
            for (int i = 0; i < source.ResourceIdList.length; i++) {
                this.ResourceIdList[i] = new String(source.ResourceIdList[i]);
            }
        }
        if (source.LimitType != null) {
            this.LimitType = new String(source.LimitType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamArraySimple(map, prefix + "ResourceIdList.", this.ResourceIdList);
        this.setParamSimple(map, prefix + "LimitType", this.LimitType);

    }
}

