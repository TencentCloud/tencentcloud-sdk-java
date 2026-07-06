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
package com.tencentcloudapi.fwm.v20250611.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRiskAnalysisDetailsRequest extends AbstractModel {

    /**
    * 风险ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 查询类型，analyze实时数据分析，task定时分析结果
    */
    @SerializedName("SearchType")
    @Expose
    private String SearchType;

    /**
    * 成员Id
    */
    @SerializedName("MemberId")
    @Expose
    private String MemberId;

    /**
     * Get 风险ID 
     * @return Id 风险ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 风险ID
     * @param Id 风险ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 查询类型，analyze实时数据分析，task定时分析结果 
     * @return SearchType 查询类型，analyze实时数据分析，task定时分析结果
     */
    public String getSearchType() {
        return this.SearchType;
    }

    /**
     * Set 查询类型，analyze实时数据分析，task定时分析结果
     * @param SearchType 查询类型，analyze实时数据分析，task定时分析结果
     */
    public void setSearchType(String SearchType) {
        this.SearchType = SearchType;
    }

    /**
     * Get 成员Id 
     * @return MemberId 成员Id
     */
    public String getMemberId() {
        return this.MemberId;
    }

    /**
     * Set 成员Id
     * @param MemberId 成员Id
     */
    public void setMemberId(String MemberId) {
        this.MemberId = MemberId;
    }

    public DescribeRiskAnalysisDetailsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRiskAnalysisDetailsRequest(DescribeRiskAnalysisDetailsRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.SearchType != null) {
            this.SearchType = new String(source.SearchType);
        }
        if (source.MemberId != null) {
            this.MemberId = new String(source.MemberId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "SearchType", this.SearchType);
        this.setParamSimple(map, prefix + "MemberId", this.MemberId);

    }
}

