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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupApiUseStatistics extends AbstractModel {

    /**
    * 总调用数
    */
    @SerializedName("TopStatusCode")
    @Expose
    private ApiUseStatisticsEntity [] TopStatusCode;

    /**
    * 平均错误率
    */
    @SerializedName("TopTimeCost")
    @Expose
    private ApiUseStatisticsEntity [] TopTimeCost;

    /**
    * 分位值对象
    */
    @SerializedName("Quantile")
    @Expose
    private QuantileEntity Quantile;

    /**
     * Get 总调用数 
     * @return TopStatusCode 总调用数
     */
    public ApiUseStatisticsEntity [] getTopStatusCode() {
        return this.TopStatusCode;
    }

    /**
     * Set 总调用数
     * @param TopStatusCode 总调用数
     */
    public void setTopStatusCode(ApiUseStatisticsEntity [] TopStatusCode) {
        this.TopStatusCode = TopStatusCode;
    }

    /**
     * Get 平均错误率 
     * @return TopTimeCost 平均错误率
     */
    public ApiUseStatisticsEntity [] getTopTimeCost() {
        return this.TopTimeCost;
    }

    /**
     * Set 平均错误率
     * @param TopTimeCost 平均错误率
     */
    public void setTopTimeCost(ApiUseStatisticsEntity [] TopTimeCost) {
        this.TopTimeCost = TopTimeCost;
    }

    /**
     * Get 分位值对象 
     * @return Quantile 分位值对象
     */
    public QuantileEntity getQuantile() {
        return this.Quantile;
    }

    /**
     * Set 分位值对象
     * @param Quantile 分位值对象
     */
    public void setQuantile(QuantileEntity Quantile) {
        this.Quantile = Quantile;
    }

    public GroupApiUseStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupApiUseStatistics(GroupApiUseStatistics source) {
        if (source.TopStatusCode != null) {
            this.TopStatusCode = new ApiUseStatisticsEntity[source.TopStatusCode.length];
            for (int i = 0; i < source.TopStatusCode.length; i++) {
                this.TopStatusCode[i] = new ApiUseStatisticsEntity(source.TopStatusCode[i]);
            }
        }
        if (source.TopTimeCost != null) {
            this.TopTimeCost = new ApiUseStatisticsEntity[source.TopTimeCost.length];
            for (int i = 0; i < source.TopTimeCost.length; i++) {
                this.TopTimeCost[i] = new ApiUseStatisticsEntity(source.TopTimeCost[i]);
            }
        }
        if (source.Quantile != null) {
            this.Quantile = new QuantileEntity(source.Quantile);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TopStatusCode.", this.TopStatusCode);
        this.setParamArrayObj(map, prefix + "TopTimeCost.", this.TopTimeCost);
        this.setParamObj(map, prefix + "Quantile.", this.Quantile);

    }
}

