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

public class DescribeAffectedClusterCountResponse extends AbstractModel{

    /**
    * 严重风险的集群数量
    */
    @SerializedName("SeriousRiskClusterCount")
    @Expose
    private Long SeriousRiskClusterCount;

    /**
    * 高危风险的集群数量
    */
    @SerializedName("HighRiskClusterCount")
    @Expose
    private Long HighRiskClusterCount;

    /**
    * 中危风险的集群数量
    */
    @SerializedName("MiddleRiskClusterCount")
    @Expose
    private Long MiddleRiskClusterCount;

    /**
    * 低危风险的集群数量
    */
    @SerializedName("HintRiskClusterCount")
    @Expose
    private Long HintRiskClusterCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 严重风险的集群数量 
     * @return SeriousRiskClusterCount 严重风险的集群数量
     */
    public Long getSeriousRiskClusterCount() {
        return this.SeriousRiskClusterCount;
    }

    /**
     * Set 严重风险的集群数量
     * @param SeriousRiskClusterCount 严重风险的集群数量
     */
    public void setSeriousRiskClusterCount(Long SeriousRiskClusterCount) {
        this.SeriousRiskClusterCount = SeriousRiskClusterCount;
    }

    /**
     * Get 高危风险的集群数量 
     * @return HighRiskClusterCount 高危风险的集群数量
     */
    public Long getHighRiskClusterCount() {
        return this.HighRiskClusterCount;
    }

    /**
     * Set 高危风险的集群数量
     * @param HighRiskClusterCount 高危风险的集群数量
     */
    public void setHighRiskClusterCount(Long HighRiskClusterCount) {
        this.HighRiskClusterCount = HighRiskClusterCount;
    }

    /**
     * Get 中危风险的集群数量 
     * @return MiddleRiskClusterCount 中危风险的集群数量
     */
    public Long getMiddleRiskClusterCount() {
        return this.MiddleRiskClusterCount;
    }

    /**
     * Set 中危风险的集群数量
     * @param MiddleRiskClusterCount 中危风险的集群数量
     */
    public void setMiddleRiskClusterCount(Long MiddleRiskClusterCount) {
        this.MiddleRiskClusterCount = MiddleRiskClusterCount;
    }

    /**
     * Get 低危风险的集群数量 
     * @return HintRiskClusterCount 低危风险的集群数量
     */
    public Long getHintRiskClusterCount() {
        return this.HintRiskClusterCount;
    }

    /**
     * Set 低危风险的集群数量
     * @param HintRiskClusterCount 低危风险的集群数量
     */
    public void setHintRiskClusterCount(Long HintRiskClusterCount) {
        this.HintRiskClusterCount = HintRiskClusterCount;
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

    public DescribeAffectedClusterCountResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAffectedClusterCountResponse(DescribeAffectedClusterCountResponse source) {
        if (source.SeriousRiskClusterCount != null) {
            this.SeriousRiskClusterCount = new Long(source.SeriousRiskClusterCount);
        }
        if (source.HighRiskClusterCount != null) {
            this.HighRiskClusterCount = new Long(source.HighRiskClusterCount);
        }
        if (source.MiddleRiskClusterCount != null) {
            this.MiddleRiskClusterCount = new Long(source.MiddleRiskClusterCount);
        }
        if (source.HintRiskClusterCount != null) {
            this.HintRiskClusterCount = new Long(source.HintRiskClusterCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SeriousRiskClusterCount", this.SeriousRiskClusterCount);
        this.setParamSimple(map, prefix + "HighRiskClusterCount", this.HighRiskClusterCount);
        this.setParamSimple(map, prefix + "MiddleRiskClusterCount", this.MiddleRiskClusterCount);
        this.setParamSimple(map, prefix + "HintRiskClusterCount", this.HintRiskClusterCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

