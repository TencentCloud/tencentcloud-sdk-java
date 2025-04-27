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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAuctionListRequest extends AbstractModel {

    /**
    * 业务ID，通过接口DescribeBiddingList返回结果中获取
    */
    @SerializedName("BusinessId")
    @Expose
    private String BusinessId;

    /**
    * 条数，默认10，最大100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量 默认0
    */
    @SerializedName("OffSet")
    @Expose
    private Long OffSet;

    /**
     * Get 业务ID，通过接口DescribeBiddingList返回结果中获取 
     * @return BusinessId 业务ID，通过接口DescribeBiddingList返回结果中获取
     */
    public String getBusinessId() {
        return this.BusinessId;
    }

    /**
     * Set 业务ID，通过接口DescribeBiddingList返回结果中获取
     * @param BusinessId 业务ID，通过接口DescribeBiddingList返回结果中获取
     */
    public void setBusinessId(String BusinessId) {
        this.BusinessId = BusinessId;
    }

    /**
     * Get 条数，默认10，最大100 
     * @return Limit 条数，默认10，最大100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 条数，默认10，最大100
     * @param Limit 条数，默认10，最大100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量 默认0 
     * @return OffSet 偏移量 默认0
     */
    public Long getOffSet() {
        return this.OffSet;
    }

    /**
     * Set 偏移量 默认0
     * @param OffSet 偏移量 默认0
     */
    public void setOffSet(Long OffSet) {
        this.OffSet = OffSet;
    }

    public DescribeAuctionListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAuctionListRequest(DescribeAuctionListRequest source) {
        if (source.BusinessId != null) {
            this.BusinessId = new String(source.BusinessId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OffSet != null) {
            this.OffSet = new Long(source.OffSet);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BusinessId", this.BusinessId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OffSet", this.OffSet);

    }
}

