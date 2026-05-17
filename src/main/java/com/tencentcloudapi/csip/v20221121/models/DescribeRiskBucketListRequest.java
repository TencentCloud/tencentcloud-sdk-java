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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRiskBucketListRequest extends AbstractModel {

    /**
    * 关联的appid
    */
    @SerializedName("RelAppId")
    @Expose
    private Long RelAppId;

    /**
    * 规则id
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * 过滤器
    */
    @SerializedName("Filter")
    @Expose
    private Filter Filter;

    /**
     * Get 关联的appid 
     * @return RelAppId 关联的appid
     */
    public Long getRelAppId() {
        return this.RelAppId;
    }

    /**
     * Set 关联的appid
     * @param RelAppId 关联的appid
     */
    public void setRelAppId(Long RelAppId) {
        this.RelAppId = RelAppId;
    }

    /**
     * Get 规则id 
     * @return PolicyId 规则id
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 规则id
     * @param PolicyId 规则id
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 过滤器 
     * @return Filter 过滤器
     */
    public Filter getFilter() {
        return this.Filter;
    }

    /**
     * Set 过滤器
     * @param Filter 过滤器
     */
    public void setFilter(Filter Filter) {
        this.Filter = Filter;
    }

    public DescribeRiskBucketListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRiskBucketListRequest(DescribeRiskBucketListRequest source) {
        if (source.RelAppId != null) {
            this.RelAppId = new Long(source.RelAppId);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.Filter != null) {
            this.Filter = new Filter(source.Filter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RelAppId", this.RelAppId);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamObj(map, prefix + "Filter.", this.Filter);

    }
}

