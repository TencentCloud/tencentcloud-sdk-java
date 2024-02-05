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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListCloudNativeAPIGatewayStrategyResult extends AbstractModel {

    /**
    * 总数。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 云原生API网关实例策略列表。
    */
    @SerializedName("StrategyList")
    @Expose
    private CloudNativeAPIGatewayStrategy [] StrategyList;

    /**
     * Get 总数。 
     * @return TotalCount 总数。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总数。
     * @param TotalCount 总数。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 云原生API网关实例策略列表。 
     * @return StrategyList 云原生API网关实例策略列表。
     */
    public CloudNativeAPIGatewayStrategy [] getStrategyList() {
        return this.StrategyList;
    }

    /**
     * Set 云原生API网关实例策略列表。
     * @param StrategyList 云原生API网关实例策略列表。
     */
    public void setStrategyList(CloudNativeAPIGatewayStrategy [] StrategyList) {
        this.StrategyList = StrategyList;
    }

    public ListCloudNativeAPIGatewayStrategyResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListCloudNativeAPIGatewayStrategyResult(ListCloudNativeAPIGatewayStrategyResult source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.StrategyList != null) {
            this.StrategyList = new CloudNativeAPIGatewayStrategy[source.StrategyList.length];
            for (int i = 0; i < source.StrategyList.length; i++) {
                this.StrategyList[i] = new CloudNativeAPIGatewayStrategy(source.StrategyList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "StrategyList.", this.StrategyList);

    }
}

