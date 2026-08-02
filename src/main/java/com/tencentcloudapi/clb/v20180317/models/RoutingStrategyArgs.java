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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoutingStrategyArgs extends AbstractModel {

    /**
    * <p>最低繁忙路由算法相对近优容差。</p><p>取值范围：[0, 100]</p><p>默认值：0</p><p>仅最低繁忙路由算法生效。0 表示请求仅会路由到在途数最小的上游大模型部署，0.10 表示请求路由到的上游大模型部署在途请求数最多比最小在途数高10%，依次类推。</p>
    */
    @SerializedName("LeastBusyBuffer")
    @Expose
    private Float LeastBusyBuffer;

    /**
    * <p>用量均衡路由算法相对近优容差</p><p>取值范围：[0, 100]</p><p>默认值：0</p><p>仅用量均衡路由算法生效。0 表示请求仅会路由到TPM最低的上游大模型部署；0.10 表示请求最多会路由到比TPM最小值高10%的上游大模型部署，依次类推。</p>
    */
    @SerializedName("UsageBasedBuffer")
    @Expose
    private Float UsageBasedBuffer;

    /**
    * <p>最低延迟路由算法相对近优容差</p><p>取值范围：[0, 100]</p><p>默认值：0</p><p>仅最低延迟路由算法生效。0 表示请求仅会路由到延迟最低的上游大模型部署；0.10 表示请求最多会路由到比延迟最小值高10%的上游大模型部署，依次类推。</p>
    */
    @SerializedName("LowestLatencyBuffer")
    @Expose
    private Float LowestLatencyBuffer;

    /**
    * <p>最低积分系数路由算法相对近优容差</p><p>取值范围：[0, 100]</p><p>默认值：0</p><p>仅最低积分系数路由算法生效。0 表示请求仅会路由到积分系数最低的上游大模型部署；0.10 表示请求最多会路由到比积分系数最小值高10%的上游大模型部署，依次类推。</p>
    */
    @SerializedName("LowestCostBuffer")
    @Expose
    private Float LowestCostBuffer;

    /**
     * Get <p>最低繁忙路由算法相对近优容差。</p><p>取值范围：[0, 100]</p><p>默认值：0</p><p>仅最低繁忙路由算法生效。0 表示请求仅会路由到在途数最小的上游大模型部署，0.10 表示请求路由到的上游大模型部署在途请求数最多比最小在途数高10%，依次类推。</p> 
     * @return LeastBusyBuffer <p>最低繁忙路由算法相对近优容差。</p><p>取值范围：[0, 100]</p><p>默认值：0</p><p>仅最低繁忙路由算法生效。0 表示请求仅会路由到在途数最小的上游大模型部署，0.10 表示请求路由到的上游大模型部署在途请求数最多比最小在途数高10%，依次类推。</p>
     */
    public Float getLeastBusyBuffer() {
        return this.LeastBusyBuffer;
    }

    /**
     * Set <p>最低繁忙路由算法相对近优容差。</p><p>取值范围：[0, 100]</p><p>默认值：0</p><p>仅最低繁忙路由算法生效。0 表示请求仅会路由到在途数最小的上游大模型部署，0.10 表示请求路由到的上游大模型部署在途请求数最多比最小在途数高10%，依次类推。</p>
     * @param LeastBusyBuffer <p>最低繁忙路由算法相对近优容差。</p><p>取值范围：[0, 100]</p><p>默认值：0</p><p>仅最低繁忙路由算法生效。0 表示请求仅会路由到在途数最小的上游大模型部署，0.10 表示请求路由到的上游大模型部署在途请求数最多比最小在途数高10%，依次类推。</p>
     */
    public void setLeastBusyBuffer(Float LeastBusyBuffer) {
        this.LeastBusyBuffer = LeastBusyBuffer;
    }

    /**
     * Get <p>用量均衡路由算法相对近优容差</p><p>取值范围：[0, 100]</p><p>默认值：0</p><p>仅用量均衡路由算法生效。0 表示请求仅会路由到TPM最低的上游大模型部署；0.10 表示请求最多会路由到比TPM最小值高10%的上游大模型部署，依次类推。</p> 
     * @return UsageBasedBuffer <p>用量均衡路由算法相对近优容差</p><p>取值范围：[0, 100]</p><p>默认值：0</p><p>仅用量均衡路由算法生效。0 表示请求仅会路由到TPM最低的上游大模型部署；0.10 表示请求最多会路由到比TPM最小值高10%的上游大模型部署，依次类推。</p>
     */
    public Float getUsageBasedBuffer() {
        return this.UsageBasedBuffer;
    }

    /**
     * Set <p>用量均衡路由算法相对近优容差</p><p>取值范围：[0, 100]</p><p>默认值：0</p><p>仅用量均衡路由算法生效。0 表示请求仅会路由到TPM最低的上游大模型部署；0.10 表示请求最多会路由到比TPM最小值高10%的上游大模型部署，依次类推。</p>
     * @param UsageBasedBuffer <p>用量均衡路由算法相对近优容差</p><p>取值范围：[0, 100]</p><p>默认值：0</p><p>仅用量均衡路由算法生效。0 表示请求仅会路由到TPM最低的上游大模型部署；0.10 表示请求最多会路由到比TPM最小值高10%的上游大模型部署，依次类推。</p>
     */
    public void setUsageBasedBuffer(Float UsageBasedBuffer) {
        this.UsageBasedBuffer = UsageBasedBuffer;
    }

    /**
     * Get <p>最低延迟路由算法相对近优容差</p><p>取值范围：[0, 100]</p><p>默认值：0</p><p>仅最低延迟路由算法生效。0 表示请求仅会路由到延迟最低的上游大模型部署；0.10 表示请求最多会路由到比延迟最小值高10%的上游大模型部署，依次类推。</p> 
     * @return LowestLatencyBuffer <p>最低延迟路由算法相对近优容差</p><p>取值范围：[0, 100]</p><p>默认值：0</p><p>仅最低延迟路由算法生效。0 表示请求仅会路由到延迟最低的上游大模型部署；0.10 表示请求最多会路由到比延迟最小值高10%的上游大模型部署，依次类推。</p>
     */
    public Float getLowestLatencyBuffer() {
        return this.LowestLatencyBuffer;
    }

    /**
     * Set <p>最低延迟路由算法相对近优容差</p><p>取值范围：[0, 100]</p><p>默认值：0</p><p>仅最低延迟路由算法生效。0 表示请求仅会路由到延迟最低的上游大模型部署；0.10 表示请求最多会路由到比延迟最小值高10%的上游大模型部署，依次类推。</p>
     * @param LowestLatencyBuffer <p>最低延迟路由算法相对近优容差</p><p>取值范围：[0, 100]</p><p>默认值：0</p><p>仅最低延迟路由算法生效。0 表示请求仅会路由到延迟最低的上游大模型部署；0.10 表示请求最多会路由到比延迟最小值高10%的上游大模型部署，依次类推。</p>
     */
    public void setLowestLatencyBuffer(Float LowestLatencyBuffer) {
        this.LowestLatencyBuffer = LowestLatencyBuffer;
    }

    /**
     * Get <p>最低积分系数路由算法相对近优容差</p><p>取值范围：[0, 100]</p><p>默认值：0</p><p>仅最低积分系数路由算法生效。0 表示请求仅会路由到积分系数最低的上游大模型部署；0.10 表示请求最多会路由到比积分系数最小值高10%的上游大模型部署，依次类推。</p> 
     * @return LowestCostBuffer <p>最低积分系数路由算法相对近优容差</p><p>取值范围：[0, 100]</p><p>默认值：0</p><p>仅最低积分系数路由算法生效。0 表示请求仅会路由到积分系数最低的上游大模型部署；0.10 表示请求最多会路由到比积分系数最小值高10%的上游大模型部署，依次类推。</p>
     */
    public Float getLowestCostBuffer() {
        return this.LowestCostBuffer;
    }

    /**
     * Set <p>最低积分系数路由算法相对近优容差</p><p>取值范围：[0, 100]</p><p>默认值：0</p><p>仅最低积分系数路由算法生效。0 表示请求仅会路由到积分系数最低的上游大模型部署；0.10 表示请求最多会路由到比积分系数最小值高10%的上游大模型部署，依次类推。</p>
     * @param LowestCostBuffer <p>最低积分系数路由算法相对近优容差</p><p>取值范围：[0, 100]</p><p>默认值：0</p><p>仅最低积分系数路由算法生效。0 表示请求仅会路由到积分系数最低的上游大模型部署；0.10 表示请求最多会路由到比积分系数最小值高10%的上游大模型部署，依次类推。</p>
     */
    public void setLowestCostBuffer(Float LowestCostBuffer) {
        this.LowestCostBuffer = LowestCostBuffer;
    }

    public RoutingStrategyArgs() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoutingStrategyArgs(RoutingStrategyArgs source) {
        if (source.LeastBusyBuffer != null) {
            this.LeastBusyBuffer = new Float(source.LeastBusyBuffer);
        }
        if (source.UsageBasedBuffer != null) {
            this.UsageBasedBuffer = new Float(source.UsageBasedBuffer);
        }
        if (source.LowestLatencyBuffer != null) {
            this.LowestLatencyBuffer = new Float(source.LowestLatencyBuffer);
        }
        if (source.LowestCostBuffer != null) {
            this.LowestCostBuffer = new Float(source.LowestCostBuffer);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LeastBusyBuffer", this.LeastBusyBuffer);
        this.setParamSimple(map, prefix + "UsageBasedBuffer", this.UsageBasedBuffer);
        this.setParamSimple(map, prefix + "LowestLatencyBuffer", this.LowestLatencyBuffer);
        this.setParamSimple(map, prefix + "LowestCostBuffer", this.LowestCostBuffer);

    }
}

