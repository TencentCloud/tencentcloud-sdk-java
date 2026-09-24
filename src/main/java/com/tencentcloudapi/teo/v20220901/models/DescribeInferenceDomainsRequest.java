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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInferenceDomainsRequest extends AbstractModel {

    /**
    * <p>站点 ID。</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>推理服务 ID。</p>
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * <p>排序字段。</p><p>枚举值：</p><ul><li>CreateTime： 域名创建时间；</li><li>UpdateTime： 域名修改时间。</li></ul><p>默认值：CreateTime。</p>
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * <p>排序方式。</p><p>枚举值：</p><ul><li>Asc： 升序方式；</li><li>Desc： 降序方式。</li></ul><p>默认值：Desc。</p>
    */
    @SerializedName("SortOrder")
    @Expose
    private String SortOrder;

    /**
    * <p>分页查询偏移量。</p><p>默认值：0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>分页查询限制数目。</p><p>默认值：20。</p><p>最大值：200。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p>站点 ID。</p> 
     * @return ZoneId <p>站点 ID。</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>站点 ID。</p>
     * @param ZoneId <p>站点 ID。</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>推理服务 ID。</p> 
     * @return ServiceId <p>推理服务 ID。</p>
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set <p>推理服务 ID。</p>
     * @param ServiceId <p>推理服务 ID。</p>
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get <p>排序字段。</p><p>枚举值：</p><ul><li>CreateTime： 域名创建时间；</li><li>UpdateTime： 域名修改时间。</li></ul><p>默认值：CreateTime。</p> 
     * @return SortBy <p>排序字段。</p><p>枚举值：</p><ul><li>CreateTime： 域名创建时间；</li><li>UpdateTime： 域名修改时间。</li></ul><p>默认值：CreateTime。</p>
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set <p>排序字段。</p><p>枚举值：</p><ul><li>CreateTime： 域名创建时间；</li><li>UpdateTime： 域名修改时间。</li></ul><p>默认值：CreateTime。</p>
     * @param SortBy <p>排序字段。</p><p>枚举值：</p><ul><li>CreateTime： 域名创建时间；</li><li>UpdateTime： 域名修改时间。</li></ul><p>默认值：CreateTime。</p>
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get <p>排序方式。</p><p>枚举值：</p><ul><li>Asc： 升序方式；</li><li>Desc： 降序方式。</li></ul><p>默认值：Desc。</p> 
     * @return SortOrder <p>排序方式。</p><p>枚举值：</p><ul><li>Asc： 升序方式；</li><li>Desc： 降序方式。</li></ul><p>默认值：Desc。</p>
     */
    public String getSortOrder() {
        return this.SortOrder;
    }

    /**
     * Set <p>排序方式。</p><p>枚举值：</p><ul><li>Asc： 升序方式；</li><li>Desc： 降序方式。</li></ul><p>默认值：Desc。</p>
     * @param SortOrder <p>排序方式。</p><p>枚举值：</p><ul><li>Asc： 升序方式；</li><li>Desc： 降序方式。</li></ul><p>默认值：Desc。</p>
     */
    public void setSortOrder(String SortOrder) {
        this.SortOrder = SortOrder;
    }

    /**
     * Get <p>分页查询偏移量。</p><p>默认值：0。</p> 
     * @return Offset <p>分页查询偏移量。</p><p>默认值：0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页查询偏移量。</p><p>默认值：0。</p>
     * @param Offset <p>分页查询偏移量。</p><p>默认值：0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>分页查询限制数目。</p><p>默认值：20。</p><p>最大值：200。</p> 
     * @return Limit <p>分页查询限制数目。</p><p>默认值：20。</p><p>最大值：200。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页查询限制数目。</p><p>默认值：20。</p><p>最大值：200。</p>
     * @param Limit <p>分页查询限制数目。</p><p>默认值：20。</p><p>最大值：200。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeInferenceDomainsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInferenceDomainsRequest(DescribeInferenceDomainsRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.SortBy != null) {
            this.SortBy = new String(source.SortBy);
        }
        if (source.SortOrder != null) {
            this.SortOrder = new String(source.SortOrder);
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
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);
        this.setParamSimple(map, prefix + "SortOrder", this.SortOrder);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

