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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoDelStrategyInfoResp extends AbstractModel {

    /**
    * 总数目
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 自动删除策略列表
    */
    @SerializedName("StrategyInfo")
    @Expose
    private AutoDelStrategyInfo [] StrategyInfo;

    /**
     * Get 总数目 
     * @return TotalCount 总数目
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总数目
     * @param TotalCount 总数目
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 自动删除策略列表 
     * @return StrategyInfo 自动删除策略列表
     */
    public AutoDelStrategyInfo [] getStrategyInfo() {
        return this.StrategyInfo;
    }

    /**
     * Set 自动删除策略列表
     * @param StrategyInfo 自动删除策略列表
     */
    public void setStrategyInfo(AutoDelStrategyInfo [] StrategyInfo) {
        this.StrategyInfo = StrategyInfo;
    }

    public AutoDelStrategyInfoResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoDelStrategyInfoResp(AutoDelStrategyInfoResp source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.StrategyInfo != null) {
            this.StrategyInfo = new AutoDelStrategyInfo[source.StrategyInfo.length];
            for (int i = 0; i < source.StrategyInfo.length; i++) {
                this.StrategyInfo[i] = new AutoDelStrategyInfo(source.StrategyInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "StrategyInfo.", this.StrategyInfo);

    }
}

