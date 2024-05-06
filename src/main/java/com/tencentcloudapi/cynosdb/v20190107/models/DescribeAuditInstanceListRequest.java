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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAuditInstanceListRequest extends AbstractModel {

    /**
    * 实例审计开启的状态。1-已开启审计；0-未开启审计。
    */
    @SerializedName("AuditSwitch")
    @Expose
    private Long AuditSwitch;

    /**
    * 查询实例列表的过滤条件。
    */
    @SerializedName("Filters")
    @Expose
    private AuditInstanceFilters [] Filters;

    /**
    * 实例的审计规则模式。1-规则审计；0-全审计。
    */
    @SerializedName("AuditMode")
    @Expose
    private Long AuditMode;

    /**
    * 单次请求返回的数量。默认值为30，最大值为 100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认值为 0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 实例审计开启的状态。1-已开启审计；0-未开启审计。 
     * @return AuditSwitch 实例审计开启的状态。1-已开启审计；0-未开启审计。
     */
    public Long getAuditSwitch() {
        return this.AuditSwitch;
    }

    /**
     * Set 实例审计开启的状态。1-已开启审计；0-未开启审计。
     * @param AuditSwitch 实例审计开启的状态。1-已开启审计；0-未开启审计。
     */
    public void setAuditSwitch(Long AuditSwitch) {
        this.AuditSwitch = AuditSwitch;
    }

    /**
     * Get 查询实例列表的过滤条件。 
     * @return Filters 查询实例列表的过滤条件。
     */
    public AuditInstanceFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 查询实例列表的过滤条件。
     * @param Filters 查询实例列表的过滤条件。
     */
    public void setFilters(AuditInstanceFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 实例的审计规则模式。1-规则审计；0-全审计。 
     * @return AuditMode 实例的审计规则模式。1-规则审计；0-全审计。
     */
    public Long getAuditMode() {
        return this.AuditMode;
    }

    /**
     * Set 实例的审计规则模式。1-规则审计；0-全审计。
     * @param AuditMode 实例的审计规则模式。1-规则审计；0-全审计。
     */
    public void setAuditMode(Long AuditMode) {
        this.AuditMode = AuditMode;
    }

    /**
     * Get 单次请求返回的数量。默认值为30，最大值为 100。 
     * @return Limit 单次请求返回的数量。默认值为30，最大值为 100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 单次请求返回的数量。默认值为30，最大值为 100。
     * @param Limit 单次请求返回的数量。默认值为30，最大值为 100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认值为 0。 
     * @return Offset 偏移量，默认值为 0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认值为 0。
     * @param Offset 偏移量，默认值为 0。
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

