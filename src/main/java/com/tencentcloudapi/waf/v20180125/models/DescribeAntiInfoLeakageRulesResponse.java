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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAntiInfoLeakageRulesResponse extends AbstractModel{

    /**
    * 记录条数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 规则列表
    */
    @SerializedName("RuleList")
    @Expose
    private DescribeAntiLeakageItem [] RuleList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 记录条数 
     * @return Total 记录条数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 记录条数
     * @param Total 记录条数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 规则列表 
     * @return RuleList 规则列表
     */
    public DescribeAntiLeakageItem [] getRuleList() {
        return this.RuleList;
    }

    /**
     * Set 规则列表
     * @param RuleList 规则列表
     */
    public void setRuleList(DescribeAntiLeakageItem [] RuleList) {
        this.RuleList = RuleList;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeAntiInfoLeakageRulesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAntiInfoLeakageRulesResponse(DescribeAntiInfoLeakageRulesResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.RuleList != null) {
            this.RuleList = new DescribeAntiLeakageItem[source.RuleList.length];
            for (int i = 0; i < source.RuleList.length; i++) {
                this.RuleList[i] = new DescribeAntiLeakageItem(source.RuleList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "RuleList.", this.RuleList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

