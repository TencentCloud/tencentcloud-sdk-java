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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUsagePlanEnvironmentsRequest extends AbstractModel{

    /**
    * 待查询的使用计划唯一 ID。
    */
    @SerializedName("UsagePlanId")
    @Expose
    private String UsagePlanId;

    /**
    * 定类型，取值为 API、SERVICE，默认值为 SERVICE。
    */
    @SerializedName("BindType")
    @Expose
    private String BindType;

    /**
    * 返回数量，默认为 20，最大值为 100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认为 0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 待查询的使用计划唯一 ID。 
     * @return UsagePlanId 待查询的使用计划唯一 ID。
     */
    public String getUsagePlanId() {
        return this.UsagePlanId;
    }

    /**
     * Set 待查询的使用计划唯一 ID。
     * @param UsagePlanId 待查询的使用计划唯一 ID。
     */
    public void setUsagePlanId(String UsagePlanId) {
        this.UsagePlanId = UsagePlanId;
    }

    /**
     * Get 定类型，取值为 API、SERVICE，默认值为 SERVICE。 
     * @return BindType 定类型，取值为 API、SERVICE，默认值为 SERVICE。
     */
    public String getBindType() {
        return this.BindType;
    }

    /**
     * Set 定类型，取值为 API、SERVICE，默认值为 SERVICE。
     * @param BindType 定类型，取值为 API、SERVICE，默认值为 SERVICE。
     */
    public void setBindType(String BindType) {
        this.BindType = BindType;
    }

    /**
     * Get 返回数量，默认为 20，最大值为 100。 
     * @return Limit 返回数量，默认为 20，最大值为 100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为 20，最大值为 100。
     * @param Limit 返回数量，默认为 20，最大值为 100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认为 0。 
     * @return Offset 偏移量，默认为 0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为 0。
     * @param Offset 偏移量，默认为 0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeUsagePlanEnvironmentsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUsagePlanEnvironmentsRequest(DescribeUsagePlanEnvironmentsRequest source) {
        if (source.UsagePlanId != null) {
            this.UsagePlanId = new String(source.UsagePlanId);
        }
        if (source.BindType != null) {
            this.BindType = new String(source.BindType);
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
        this.setParamSimple(map, prefix + "UsagePlanId", this.UsagePlanId);
        this.setParamSimple(map, prefix + "BindType", this.BindType);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

