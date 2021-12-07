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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskResultSummaryResponse extends AbstractModel{

    /**
    * 严重风险影响的节点数量,返回7天数据
    */
    @SerializedName("SeriousRiskNodeCount")
    @Expose
    private Long [] SeriousRiskNodeCount;

    /**
    * 高风险影响的节点的数量,返回7天数据
    */
    @SerializedName("HighRiskNodeCount")
    @Expose
    private Long [] HighRiskNodeCount;

    /**
    * 中风险检查项的节点数量,返回7天数据
    */
    @SerializedName("MiddleRiskNodeCount")
    @Expose
    private Long [] MiddleRiskNodeCount;

    /**
    * 提示风险检查项的节点数量,返回7天数据
    */
    @SerializedName("HintRiskNodeCount")
    @Expose
    private Long [] HintRiskNodeCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 严重风险影响的节点数量,返回7天数据 
     * @return SeriousRiskNodeCount 严重风险影响的节点数量,返回7天数据
     */
    public Long [] getSeriousRiskNodeCount() {
        return this.SeriousRiskNodeCount;
    }

    /**
     * Set 严重风险影响的节点数量,返回7天数据
     * @param SeriousRiskNodeCount 严重风险影响的节点数量,返回7天数据
     */
    public void setSeriousRiskNodeCount(Long [] SeriousRiskNodeCount) {
        this.SeriousRiskNodeCount = SeriousRiskNodeCount;
    }

    /**
     * Get 高风险影响的节点的数量,返回7天数据 
     * @return HighRiskNodeCount 高风险影响的节点的数量,返回7天数据
     */
    public Long [] getHighRiskNodeCount() {
        return this.HighRiskNodeCount;
    }

    /**
     * Set 高风险影响的节点的数量,返回7天数据
     * @param HighRiskNodeCount 高风险影响的节点的数量,返回7天数据
     */
    public void setHighRiskNodeCount(Long [] HighRiskNodeCount) {
        this.HighRiskNodeCount = HighRiskNodeCount;
    }

    /**
     * Get 中风险检查项的节点数量,返回7天数据 
     * @return MiddleRiskNodeCount 中风险检查项的节点数量,返回7天数据
     */
    public Long [] getMiddleRiskNodeCount() {
        return this.MiddleRiskNodeCount;
    }

    /**
     * Set 中风险检查项的节点数量,返回7天数据
     * @param MiddleRiskNodeCount 中风险检查项的节点数量,返回7天数据
     */
    public void setMiddleRiskNodeCount(Long [] MiddleRiskNodeCount) {
        this.MiddleRiskNodeCount = MiddleRiskNodeCount;
    }

    /**
     * Get 提示风险检查项的节点数量,返回7天数据 
     * @return HintRiskNodeCount 提示风险检查项的节点数量,返回7天数据
     */
    public Long [] getHintRiskNodeCount() {
        return this.HintRiskNodeCount;
    }

    /**
     * Set 提示风险检查项的节点数量,返回7天数据
     * @param HintRiskNodeCount 提示风险检查项的节点数量,返回7天数据
     */
    public void setHintRiskNodeCount(Long [] HintRiskNodeCount) {
        this.HintRiskNodeCount = HintRiskNodeCount;
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

    public DescribeTaskResultSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskResultSummaryResponse(DescribeTaskResultSummaryResponse source) {
        if (source.SeriousRiskNodeCount != null) {
            this.SeriousRiskNodeCount = new Long[source.SeriousRiskNodeCount.length];
            for (int i = 0; i < source.SeriousRiskNodeCount.length; i++) {
                this.SeriousRiskNodeCount[i] = new Long(source.SeriousRiskNodeCount[i]);
            }
        }
        if (source.HighRiskNodeCount != null) {
            this.HighRiskNodeCount = new Long[source.HighRiskNodeCount.length];
            for (int i = 0; i < source.HighRiskNodeCount.length; i++) {
                this.HighRiskNodeCount[i] = new Long(source.HighRiskNodeCount[i]);
            }
        }
        if (source.MiddleRiskNodeCount != null) {
            this.MiddleRiskNodeCount = new Long[source.MiddleRiskNodeCount.length];
            for (int i = 0; i < source.MiddleRiskNodeCount.length; i++) {
                this.MiddleRiskNodeCount[i] = new Long(source.MiddleRiskNodeCount[i]);
            }
        }
        if (source.HintRiskNodeCount != null) {
            this.HintRiskNodeCount = new Long[source.HintRiskNodeCount.length];
            for (int i = 0; i < source.HintRiskNodeCount.length; i++) {
                this.HintRiskNodeCount[i] = new Long(source.HintRiskNodeCount[i]);
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
        this.setParamArraySimple(map, prefix + "SeriousRiskNodeCount.", this.SeriousRiskNodeCount);
        this.setParamArraySimple(map, prefix + "HighRiskNodeCount.", this.HighRiskNodeCount);
        this.setParamArraySimple(map, prefix + "MiddleRiskNodeCount.", this.MiddleRiskNodeCount);
        this.setParamArraySimple(map, prefix + "HintRiskNodeCount.", this.HintRiskNodeCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

