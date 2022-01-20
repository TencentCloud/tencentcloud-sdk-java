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
package com.tencentcloudapi.cii.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UnderwriteOutput extends AbstractModel{

    /**
    * 客户ID
    */
    @SerializedName("CustomerId")
    @Expose
    private String CustomerId;

    /**
    * 客户姓名
    */
    @SerializedName("CustomerName")
    @Expose
    private String CustomerName;

    /**
    * 结果
    */
    @SerializedName("Results")
    @Expose
    private InsuranceResult [] Results;

    /**
    * 复核时间
    */
    @SerializedName("ReviewTime")
    @Expose
    private String ReviewTime;

    /**
    * 人工复核结果
    */
    @SerializedName("ManualDetail")
    @Expose
    private UnderwriteConclusion [] ManualDetail;

    /**
     * Get 客户ID 
     * @return CustomerId 客户ID
     */
    public String getCustomerId() {
        return this.CustomerId;
    }

    /**
     * Set 客户ID
     * @param CustomerId 客户ID
     */
    public void setCustomerId(String CustomerId) {
        this.CustomerId = CustomerId;
    }

    /**
     * Get 客户姓名 
     * @return CustomerName 客户姓名
     */
    public String getCustomerName() {
        return this.CustomerName;
    }

    /**
     * Set 客户姓名
     * @param CustomerName 客户姓名
     */
    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    /**
     * Get 结果 
     * @return Results 结果
     */
    public InsuranceResult [] getResults() {
        return this.Results;
    }

    /**
     * Set 结果
     * @param Results 结果
     */
    public void setResults(InsuranceResult [] Results) {
        this.Results = Results;
    }

    /**
     * Get 复核时间 
     * @return ReviewTime 复核时间
     */
    public String getReviewTime() {
        return this.ReviewTime;
    }

    /**
     * Set 复核时间
     * @param ReviewTime 复核时间
     */
    public void setReviewTime(String ReviewTime) {
        this.ReviewTime = ReviewTime;
    }

    /**
     * Get 人工复核结果 
     * @return ManualDetail 人工复核结果
     */
    public UnderwriteConclusion [] getManualDetail() {
        return this.ManualDetail;
    }

    /**
     * Set 人工复核结果
     * @param ManualDetail 人工复核结果
     */
    public void setManualDetail(UnderwriteConclusion [] ManualDetail) {
        this.ManualDetail = ManualDetail;
    }

    public UnderwriteOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnderwriteOutput(UnderwriteOutput source) {
        if (source.CustomerId != null) {
            this.CustomerId = new String(source.CustomerId);
        }
        if (source.CustomerName != null) {
            this.CustomerName = new String(source.CustomerName);
        }
        if (source.Results != null) {
            this.Results = new InsuranceResult[source.Results.length];
            for (int i = 0; i < source.Results.length; i++) {
                this.Results[i] = new InsuranceResult(source.Results[i]);
            }
        }
        if (source.ReviewTime != null) {
            this.ReviewTime = new String(source.ReviewTime);
        }
        if (source.ManualDetail != null) {
            this.ManualDetail = new UnderwriteConclusion[source.ManualDetail.length];
            for (int i = 0; i < source.ManualDetail.length; i++) {
                this.ManualDetail[i] = new UnderwriteConclusion(source.ManualDetail[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomerId", this.CustomerId);
        this.setParamSimple(map, prefix + "CustomerName", this.CustomerName);
        this.setParamArrayObj(map, prefix + "Results.", this.Results);
        this.setParamSimple(map, prefix + "ReviewTime", this.ReviewTime);
        this.setParamArrayObj(map, prefix + "ManualDetail.", this.ManualDetail);

    }
}

