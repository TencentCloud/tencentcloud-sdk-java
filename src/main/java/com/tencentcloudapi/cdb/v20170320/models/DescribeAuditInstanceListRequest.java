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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAuditInstanceListRequest extends AbstractModel {

    /**
    * <p>实例审计开启的状态。1-已开启审计；0-未开启审计。</p>
    */
    @SerializedName("AuditSwitch")
    @Expose
    private Long AuditSwitch;

    /**
    * <p>查询实例列表的过滤条件。</p>
    */
    @SerializedName("Filters")
    @Expose
    private AuditInstanceFilters [] Filters;

    /**
    * <p>实例的审计规则模式。1-规则审计；0-全审计。</p>
    */
    @SerializedName("AuditMode")
    @Expose
    private Long AuditMode;

    /**
    * <p>单次请求返回的数量。默认值为30，最大值为 20000。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>偏移量，默认值为 0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get <p>实例审计开启的状态。1-已开启审计；0-未开启审计。</p> 
     * @return AuditSwitch <p>实例审计开启的状态。1-已开启审计；0-未开启审计。</p>
     */
    public Long getAuditSwitch() {
        return this.AuditSwitch;
    }

    /**
     * Set <p>实例审计开启的状态。1-已开启审计；0-未开启审计。</p>
     * @param AuditSwitch <p>实例审计开启的状态。1-已开启审计；0-未开启审计。</p>
     */
    public void setAuditSwitch(Long AuditSwitch) {
        this.AuditSwitch = AuditSwitch;
    }

    /**
     * Get <p>查询实例列表的过滤条件。</p> 
     * @return Filters <p>查询实例列表的过滤条件。</p>
     */
    public AuditInstanceFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>查询实例列表的过滤条件。</p>
     * @param Filters <p>查询实例列表的过滤条件。</p>
     */
    public void setFilters(AuditInstanceFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>实例的审计规则模式。1-规则审计；0-全审计。</p> 
     * @return AuditMode <p>实例的审计规则模式。1-规则审计；0-全审计。</p>
     */
    public Long getAuditMode() {
        return this.AuditMode;
    }

    /**
     * Set <p>实例的审计规则模式。1-规则审计；0-全审计。</p>
     * @param AuditMode <p>实例的审计规则模式。1-规则审计；0-全审计。</p>
     */
    public void setAuditMode(Long AuditMode) {
        this.AuditMode = AuditMode;
    }

    /**
     * Get <p>单次请求返回的数量。默认值为30，最大值为 20000。</p> 
     * @return Limit <p>单次请求返回的数量。默认值为30，最大值为 20000。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>单次请求返回的数量。默认值为30，最大值为 20000。</p>
     * @param Limit <p>单次请求返回的数量。默认值为30，最大值为 20000。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>偏移量，默认值为 0。</p> 
     * @return Offset <p>偏移量，默认值为 0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，默认值为 0。</p>
     * @param Offset <p>偏移量，默认值为 0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeAuditInstanceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAuditInstanceListRequest(DescribeAuditInstanceListRequest source) {
        if (source.AuditSwitch != null) {
            this.AuditSwitch = new Long(source.AuditSwitch);
        }
        if (source.Filters != null) {
            this.Filters = new AuditInstanceFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AuditInstanceFilters(source.Filters[i]);
            }
        }
        if (source.AuditMode != null) {
            this.AuditMode = new Long(source.AuditMode);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AuditSwitch", this.AuditSwitch);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "AuditMode", this.AuditMode);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

