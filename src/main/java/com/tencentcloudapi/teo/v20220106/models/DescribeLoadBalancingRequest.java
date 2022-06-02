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

public class DescribeLoadBalancingRequest extends AbstractModel{

    /**
    * 站点ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 分页参数Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页参数Limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤参数Host
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 过滤参数Host是否支持模糊匹配
    */
    @SerializedName("Fuzzy")
    @Expose
    private Boolean Fuzzy;

    /**
     * Get 站点ID 
     * @return ZoneId 站点ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点ID
     * @param ZoneId 站点ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 分页参数Offset 
     * @return Offset 分页参数Offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页参数Offset
     * @param Offset 分页参数Offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页参数Limit 
     * @return Limit 分页参数Limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页参数Limit
     * @param Limit 分页参数Limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤参数Host 
     * @return Host 过滤参数Host
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 过滤参数Host
     * @param Host 过滤参数Host
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 过滤参数Host是否支持模糊匹配 
     * @return Fuzzy 过滤参数Host是否支持模糊匹配
     */
    public Boolean getFuzzy() {
        return this.Fuzzy;
    }

    /**
     * Set 过滤参数Host是否支持模糊匹配
     * @param Fuzzy 过滤参数Host是否支持模糊匹配
     */
    public void setFuzzy(Boolean Fuzzy) {
        this.Fuzzy = Fuzzy;
    }

    public DescribeLoadBalancingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLoadBalancingRequest(DescribeLoadBalancingRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Fuzzy != null) {
            this.Fuzzy = new Boolean(source.Fuzzy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Fuzzy", this.Fuzzy);

    }
}

