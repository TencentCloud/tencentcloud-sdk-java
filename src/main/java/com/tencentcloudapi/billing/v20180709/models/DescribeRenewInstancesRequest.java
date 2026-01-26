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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRenewInstancesRequest extends AbstractModel {

    /**
    * 每页的最大实例条数。 取值范围：1~100。
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * 查询返回结果下一页的令牌。首次调用 API 不需要NextToken。
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
    * 获取实例的排序方向。枚举值如下：
false=正序（默认）
true=倒序
    */
    @SerializedName("Reverse")
    @Expose
    private Boolean Reverse;

    /**
    * 续费标识。多个值用英文逗号分隔。枚举值如下：
NOTIFY_AND_MANUAL_RENEW：手动续费
NOTIFY_AND_AUTO_RENEW：自动续费
DISABLE_NOTIFY_AND_MANUAL_RENEW：到期不续
    */
    @SerializedName("RenewFlagList")
    @Expose
    private String [] RenewFlagList;

    /**
    * 实例ID。多个ID用英文逗号分隔，最多不超过100个。
    */
    @SerializedName("InstanceIdList")
    @Expose
    private String [] InstanceIdList;

    /**
    * 到期时间段起，格式为yyyy-MM-dd HH:mm:ss。
    */
    @SerializedName("ExpireTimeStart")
    @Expose
    private String ExpireTimeStart;

    /**
    * 到期时间段止，格式为yyyy-MM-dd HH:mm:ss。
    */
    @SerializedName("ExpireTimeEnd")
    @Expose
    private String ExpireTimeEnd;

    /**
     * Get 每页的最大实例条数。 取值范围：1~100。 
     * @return MaxResults 每页的最大实例条数。 取值范围：1~100。
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set 每页的最大实例条数。 取值范围：1~100。
     * @param MaxResults 每页的最大实例条数。 取值范围：1~100。
     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
    }

    /**
     * Get 查询返回结果下一页的令牌。首次调用 API 不需要NextToken。 
     * @return NextToken 查询返回结果下一页的令牌。首次调用 API 不需要NextToken。
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set 查询返回结果下一页的令牌。首次调用 API 不需要NextToken。
     * @param NextToken 查询返回结果下一页的令牌。首次调用 API 不需要NextToken。
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    /**
     * Get 获取实例的排序方向。枚举值如下：
false=正序（默认）
true=倒序 
     * @return Reverse 获取实例的排序方向。枚举值如下：
false=正序（默认）
true=倒序
     */
    public Boolean getReverse() {
        return this.Reverse;
    }

    /**
     * Set 获取实例的排序方向。枚举值如下：
false=正序（默认）
true=倒序
     * @param Reverse 获取实例的排序方向。枚举值如下：
false=正序（默认）
true=倒序
     */
    public void setReverse(Boolean Reverse) {
        this.Reverse = Reverse;
    }

    /**
     * Get 续费标识。多个值用英文逗号分隔。枚举值如下：
NOTIFY_AND_MANUAL_RENEW：手动续费
NOTIFY_AND_AUTO_RENEW：自动续费
DISABLE_NOTIFY_AND_MANUAL_RENEW：到期不续 
     * @return RenewFlagList 续费标识。多个值用英文逗号分隔。枚举值如下：
NOTIFY_AND_MANUAL_RENEW：手动续费
NOTIFY_AND_AUTO_RENEW：自动续费
DISABLE_NOTIFY_AND_MANUAL_RENEW：到期不续
     */
    public String [] getRenewFlagList() {
        return this.RenewFlagList;
    }

    /**
     * Set 续费标识。多个值用英文逗号分隔。枚举值如下：
NOTIFY_AND_MANUAL_RENEW：手动续费
NOTIFY_AND_AUTO_RENEW：自动续费
DISABLE_NOTIFY_AND_MANUAL_RENEW：到期不续
     * @param RenewFlagList 续费标识。多个值用英文逗号分隔。枚举值如下：
NOTIFY_AND_MANUAL_RENEW：手动续费
NOTIFY_AND_AUTO_RENEW：自动续费
DISABLE_NOTIFY_AND_MANUAL_RENEW：到期不续
     */
    public void setRenewFlagList(String [] RenewFlagList) {
        this.RenewFlagList = RenewFlagList;
    }

    /**
     * Get 实例ID。多个ID用英文逗号分隔，最多不超过100个。 
     * @return InstanceIdList 实例ID。多个ID用英文逗号分隔，最多不超过100个。
     */
    public String [] getInstanceIdList() {
        return this.InstanceIdList;
    }

    /**
     * Set 实例ID。多个ID用英文逗号分隔，最多不超过100个。
     * @param InstanceIdList 实例ID。多个ID用英文逗号分隔，最多不超过100个。
     */
    public void setInstanceIdList(String [] InstanceIdList) {
        this.InstanceIdList = InstanceIdList;
    }

    /**
     * Get 到期时间段起，格式为yyyy-MM-dd HH:mm:ss。 
     * @return ExpireTimeStart 到期时间段起，格式为yyyy-MM-dd HH:mm:ss。
     */
    public String getExpireTimeStart() {
        return this.ExpireTimeStart;
    }

    /**
     * Set 到期时间段起，格式为yyyy-MM-dd HH:mm:ss。
     * @param ExpireTimeStart 到期时间段起，格式为yyyy-MM-dd HH:mm:ss。
     */
    public void setExpireTimeStart(String ExpireTimeStart) {
        this.ExpireTimeStart = ExpireTimeStart;
    }

    /**
     * Get 到期时间段止，格式为yyyy-MM-dd HH:mm:ss。 
     * @return ExpireTimeEnd 到期时间段止，格式为yyyy-MM-dd HH:mm:ss。
     */
    public String getExpireTimeEnd() {
        return this.ExpireTimeEnd;
    }

    /**
     * Set 到期时间段止，格式为yyyy-MM-dd HH:mm:ss。
     * @param ExpireTimeEnd 到期时间段止，格式为yyyy-MM-dd HH:mm:ss。
     */
    public void setExpireTimeEnd(String ExpireTimeEnd) {
        this.ExpireTimeEnd = ExpireTimeEnd;
    }

    public DescribeRenewInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRenewInstancesRequest(DescribeRenewInstancesRequest source) {
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
        if (source.Reverse != null) {
            this.Reverse = new Boolean(source.Reverse);
        }
        if (source.RenewFlagList != null) {
            this.RenewFlagList = new String[source.RenewFlagList.length];
            for (int i = 0; i < source.RenewFlagList.length; i++) {
                this.RenewFlagList[i] = new String(source.RenewFlagList[i]);
            }
        }
        if (source.InstanceIdList != null) {
            this.InstanceIdList = new String[source.InstanceIdList.length];
            for (int i = 0; i < source.InstanceIdList.length; i++) {
                this.InstanceIdList[i] = new String(source.InstanceIdList[i]);
            }
        }
        if (source.ExpireTimeStart != null) {
            this.ExpireTimeStart = new String(source.ExpireTimeStart);
        }
        if (source.ExpireTimeEnd != null) {
            this.ExpireTimeEnd = new String(source.ExpireTimeEnd);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamSimple(map, prefix + "Reverse", this.Reverse);
        this.setParamArraySimple(map, prefix + "RenewFlagList.", this.RenewFlagList);
        this.setParamArraySimple(map, prefix + "InstanceIdList.", this.InstanceIdList);
        this.setParamSimple(map, prefix + "ExpireTimeStart", this.ExpireTimeStart);
        this.setParamSimple(map, prefix + "ExpireTimeEnd", this.ExpireTimeEnd);

    }
}

