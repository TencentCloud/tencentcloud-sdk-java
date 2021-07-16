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
package com.tencentcloudapi.tem.v20201221.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeployStrategyConf extends AbstractModel{

    /**
    * 总分批数
    */
    @SerializedName("TotalBatchCount")
    @Expose
    private Long TotalBatchCount;

    /**
    * beta分批实例数
    */
    @SerializedName("BetaBatchNum")
    @Expose
    private Long BetaBatchNum;

    /**
    * 分批策略：0-全自动，1-全手动，beta分批一定是手动的，这里的策略指定的是剩余批次
    */
    @SerializedName("DeployStrategyType")
    @Expose
    private Long DeployStrategyType;

    /**
    * 每批暂停间隔
    */
    @SerializedName("BatchInterval")
    @Expose
    private Long BatchInterval;

    /**
     * Get 总分批数 
     * @return TotalBatchCount 总分批数
     */
    public Long getTotalBatchCount() {
        return this.TotalBatchCount;
    }

    /**
     * Set 总分批数
     * @param TotalBatchCount 总分批数
     */
    public void setTotalBatchCount(Long TotalBatchCount) {
        this.TotalBatchCount = TotalBatchCount;
    }

    /**
     * Get beta分批实例数 
     * @return BetaBatchNum beta分批实例数
     */
    public Long getBetaBatchNum() {
        return this.BetaBatchNum;
    }

    /**
     * Set beta分批实例数
     * @param BetaBatchNum beta分批实例数
     */
    public void setBetaBatchNum(Long BetaBatchNum) {
        this.BetaBatchNum = BetaBatchNum;
    }

    /**
     * Get 分批策略：0-全自动，1-全手动，beta分批一定是手动的，这里的策略指定的是剩余批次 
     * @return DeployStrategyType 分批策略：0-全自动，1-全手动，beta分批一定是手动的，这里的策略指定的是剩余批次
     */
    public Long getDeployStrategyType() {
        return this.DeployStrategyType;
    }

    /**
     * Set 分批策略：0-全自动，1-全手动，beta分批一定是手动的，这里的策略指定的是剩余批次
     * @param DeployStrategyType 分批策略：0-全自动，1-全手动，beta分批一定是手动的，这里的策略指定的是剩余批次
     */
    public void setDeployStrategyType(Long DeployStrategyType) {
        this.DeployStrategyType = DeployStrategyType;
    }

    /**
     * Get 每批暂停间隔 
     * @return BatchInterval 每批暂停间隔
     */
    public Long getBatchInterval() {
        return this.BatchInterval;
    }

    /**
     * Set 每批暂停间隔
     * @param BatchInterval 每批暂停间隔
     */
    public void setBatchInterval(Long BatchInterval) {
        this.BatchInterval = BatchInterval;
    }

    public DeployStrategyConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeployStrategyConf(DeployStrategyConf source) {
        if (source.TotalBatchCount != null) {
            this.TotalBatchCount = new Long(source.TotalBatchCount);
        }
        if (source.BetaBatchNum != null) {
            this.BetaBatchNum = new Long(source.BetaBatchNum);
        }
        if (source.DeployStrategyType != null) {
            this.DeployStrategyType = new Long(source.DeployStrategyType);
        }
        if (source.BatchInterval != null) {
            this.BatchInterval = new Long(source.BatchInterval);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalBatchCount", this.TotalBatchCount);
        this.setParamSimple(map, prefix + "BetaBatchNum", this.BetaBatchNum);
        this.setParamSimple(map, prefix + "DeployStrategyType", this.DeployStrategyType);
        this.setParamSimple(map, prefix + "BatchInterval", this.BatchInterval);

    }
}

