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

public class AssetRiskInfo extends AbstractModel {

    /**
    * <p>风险类型</p>
    */
    @SerializedName("ResultType")
    @Expose
    private String ResultType;

    /**
    * <p>总风险数量</p>
    */
    @SerializedName("RiskCount")
    @Expose
    private Long RiskCount;

    /**
    * <p>严重风险数量</p>
    */
    @SerializedName("RiskCritical")
    @Expose
    private Long RiskCritical;

    /**
    * <p>高风险数量</p>
    */
    @SerializedName("RiskHigh")
    @Expose
    private Long RiskHigh;

    /**
    * <p>中风险数量</p>
    */
    @SerializedName("RiskMedium")
    @Expose
    private Long RiskMedium;

    /**
    * <p>低风险数量</p>
    */
    @SerializedName("RiskLow")
    @Expose
    private Long RiskLow;

    /**
     * Get <p>风险类型</p> 
     * @return ResultType <p>风险类型</p>
     */
    public String getResultType() {
        return this.ResultType;
    }

    /**
     * Set <p>风险类型</p>
     * @param ResultType <p>风险类型</p>
     */
    public void setResultType(String ResultType) {
        this.ResultType = ResultType;
    }

    /**
     * Get <p>总风险数量</p> 
     * @return RiskCount <p>总风险数量</p>
     */
    public Long getRiskCount() {
        return this.RiskCount;
    }

    /**
     * Set <p>总风险数量</p>
     * @param RiskCount <p>总风险数量</p>
     */
    public void setRiskCount(Long RiskCount) {
        this.RiskCount = RiskCount;
    }

    /**
     * Get <p>严重风险数量</p> 
     * @return RiskCritical <p>严重风险数量</p>
     */
    public Long getRiskCritical() {
        return this.RiskCritical;
    }

    /**
     * Set <p>严重风险数量</p>
     * @param RiskCritical <p>严重风险数量</p>
     */
    public void setRiskCritical(Long RiskCritical) {
        this.RiskCritical = RiskCritical;
    }

    /**
     * Get <p>高风险数量</p> 
     * @return RiskHigh <p>高风险数量</p>
     */
    public Long getRiskHigh() {
        return this.RiskHigh;
    }

    /**
     * Set <p>高风险数量</p>
     * @param RiskHigh <p>高风险数量</p>
     */
    public void setRiskHigh(Long RiskHigh) {
        this.RiskHigh = RiskHigh;
    }

    /**
     * Get <p>中风险数量</p> 
     * @return RiskMedium <p>中风险数量</p>
     */
    public Long getRiskMedium() {
        return this.RiskMedium;
    }

    /**
     * Set <p>中风险数量</p>
     * @param RiskMedium <p>中风险数量</p>
     */
    public void setRiskMedium(Long RiskMedium) {
        this.RiskMedium = RiskMedium;
    }

    /**
     * Get <p>低风险数量</p> 
     * @return RiskLow <p>低风险数量</p>
     */
    public Long getRiskLow() {
        return this.RiskLow;
    }

    /**
     * Set <p>低风险数量</p>
     * @param RiskLow <p>低风险数量</p>
     */
    public void setRiskLow(Long RiskLow) {
        this.RiskLow = RiskLow;
    }

    public AssetRiskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetRiskInfo(AssetRiskInfo source) {
        if (source.ResultType != null) {
            this.ResultType = new String(source.ResultType);
        }
        if (source.RiskCount != null) {
            this.RiskCount = new Long(source.RiskCount);
        }
        if (source.RiskCritical != null) {
            this.RiskCritical = new Long(source.RiskCritical);
        }
        if (source.RiskHigh != null) {
            this.RiskHigh = new Long(source.RiskHigh);
        }
        if (source.RiskMedium != null) {
            this.RiskMedium = new Long(source.RiskMedium);
        }
        if (source.RiskLow != null) {
            this.RiskLow = new Long(source.RiskLow);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResultType", this.ResultType);
        this.setParamSimple(map, prefix + "RiskCount", this.RiskCount);
        this.setParamSimple(map, prefix + "RiskCritical", this.RiskCritical);
        this.setParamSimple(map, prefix + "RiskHigh", this.RiskHigh);
        this.setParamSimple(map, prefix + "RiskMedium", this.RiskMedium);
        this.setParamSimple(map, prefix + "RiskLow", this.RiskLow);

    }
}

