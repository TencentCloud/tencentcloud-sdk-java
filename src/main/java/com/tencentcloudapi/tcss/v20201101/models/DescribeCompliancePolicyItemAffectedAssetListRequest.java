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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCompliancePolicyItemAffectedAssetListRequest extends AbstractModel{

    /**
    * DescribeComplianceTaskPolicyItemSummaryList返回的CustomerPolicyItemId，表示检测项的ID。
    */
    @SerializedName("CustomerPolicyItemId")
    @Expose
    private Long CustomerPolicyItemId;

    /**
    * 起始偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 需要返回的数量，默认为10，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤条件。
Name - String
Name 可取值：NodeName, CheckResult
    */
    @SerializedName("Filters")
    @Expose
    private ComplianceFilters [] Filters;

    /**
     * Get DescribeComplianceTaskPolicyItemSummaryList返回的CustomerPolicyItemId，表示检测项的ID。 
     * @return CustomerPolicyItemId DescribeComplianceTaskPolicyItemSummaryList返回的CustomerPolicyItemId，表示检测项的ID。
     */
    public Long getCustomerPolicyItemId() {
        return this.CustomerPolicyItemId;
    }

    /**
     * Set DescribeComplianceTaskPolicyItemSummaryList返回的CustomerPolicyItemId，表示检测项的ID。
     * @param CustomerPolicyItemId DescribeComplianceTaskPolicyItemSummaryList返回的CustomerPolicyItemId，表示检测项的ID。
     */
    public void setCustomerPolicyItemId(Long CustomerPolicyItemId) {
        this.CustomerPolicyItemId = CustomerPolicyItemId;
    }

    /**
     * Get 起始偏移量，默认为0。 
     * @return Offset 起始偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 起始偏移量，默认为0。
     * @param Offset 起始偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 需要返回的数量，默认为10，最大值为100。 
     * @return Limit 需要返回的数量，默认为10，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 需要返回的数量，默认为10，最大值为100。
     * @param Limit 需要返回的数量，默认为10，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤条件。
Name - String
Name 可取值：NodeName, CheckResult 
     * @return Filters 过滤条件。
Name - String
Name 可取值：NodeName, CheckResult
     */
    public ComplianceFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。
Name - String
Name 可取值：NodeName, CheckResult
     * @param Filters 过滤条件。
Name - String
Name 可取值：NodeName, CheckResult
     */
    public void setFilters(ComplianceFilters [] Filters) {
        this.Filters = Filters;
    }

    public DescribeCompliancePolicyItemAffectedAssetListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCompliancePolicyItemAffectedAssetListRequest(DescribeCompliancePolicyItemAffectedAssetListRequest source) {
        if (source.CustomerPolicyItemId != null) {
            this.CustomerPolicyItemId = new Long(source.CustomerPolicyItemId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new ComplianceFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new ComplianceFilters(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomerPolicyItemId", this.CustomerPolicyItemId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

