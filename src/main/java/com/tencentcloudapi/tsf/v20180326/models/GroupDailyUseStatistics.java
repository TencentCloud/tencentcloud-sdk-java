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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupDailyUseStatistics extends AbstractModel{

    /**
    * 总调用数
    */
    @SerializedName("TopReqAmount")
    @Expose
    private GroupUseStatisticsEntity [] TopReqAmount;

    /**
    * 平均错误率
    */
    @SerializedName("TopFailureRate")
    @Expose
    private GroupUseStatisticsEntity [] TopFailureRate;

    /**
    * 平均响应耗时
    */
    @SerializedName("TopAvgTimeCost")
    @Expose
    private GroupUseStatisticsEntity [] TopAvgTimeCost;

    /**
     * Get 总调用数 
     * @return TopReqAmount 总调用数
     */
    public GroupUseStatisticsEntity [] getTopReqAmount() {
        return this.TopReqAmount;
    }

    /**
     * Set 总调用数
     * @param TopReqAmount 总调用数
     */
    public void setTopReqAmount(GroupUseStatisticsEntity [] TopReqAmount) {
        this.TopReqAmount = TopReqAmount;
    }

    /**
     * Get 平均错误率 
     * @return TopFailureRate 平均错误率
     */
    public GroupUseStatisticsEntity [] getTopFailureRate() {
        return this.TopFailureRate;
    }

    /**
     * Set 平均错误率
     * @param TopFailureRate 平均错误率
     */
    public void setTopFailureRate(GroupUseStatisticsEntity [] TopFailureRate) {
        this.TopFailureRate = TopFailureRate;
    }

    /**
     * Get 平均响应耗时 
     * @return TopAvgTimeCost 平均响应耗时
     */
    public GroupUseStatisticsEntity [] getTopAvgTimeCost() {
        return this.TopAvgTimeCost;
    }

    /**
     * Set 平均响应耗时
     * @param TopAvgTimeCost 平均响应耗时
     */
    public void setTopAvgTimeCost(GroupUseStatisticsEntity [] TopAvgTimeCost) {
        this.TopAvgTimeCost = TopAvgTimeCost;
    }

    public GroupDailyUseStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupDailyUseStatistics(GroupDailyUseStatistics source) {
        if (source.TopReqAmount != null) {
            this.TopReqAmount = new GroupUseStatisticsEntity[source.TopReqAmount.length];
            for (int i = 0; i < source.TopReqAmount.length; i++) {
                this.TopReqAmount[i] = new GroupUseStatisticsEntity(source.TopReqAmount[i]);
            }
        }
        if (source.TopFailureRate != null) {
            this.TopFailureRate = new GroupUseStatisticsEntity[source.TopFailureRate.length];
            for (int i = 0; i < source.TopFailureRate.length; i++) {
                this.TopFailureRate[i] = new GroupUseStatisticsEntity(source.TopFailureRate[i]);
            }
        }
        if (source.TopAvgTimeCost != null) {
            this.TopAvgTimeCost = new GroupUseStatisticsEntity[source.TopAvgTimeCost.length];
            for (int i = 0; i < source.TopAvgTimeCost.length; i++) {
                this.TopAvgTimeCost[i] = new GroupUseStatisticsEntity(source.TopAvgTimeCost[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TopReqAmount.", this.TopReqAmount);
        this.setParamArrayObj(map, prefix + "TopFailureRate.", this.TopFailureRate);
        this.setParamArrayObj(map, prefix + "TopAvgTimeCost.", this.TopAvgTimeCost);

    }
}

