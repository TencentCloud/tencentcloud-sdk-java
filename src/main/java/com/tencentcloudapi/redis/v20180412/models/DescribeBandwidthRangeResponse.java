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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBandwidthRangeResponse extends AbstractModel{

    /**
    * 标准带宽。指购买实例时，系统为每个节点分配的带宽。
    */
    @SerializedName("BaseBandwidth")
    @Expose
    private Long BaseBandwidth;

    /**
    * 指实例的附加带宽。标准带宽不满足需求的情况下，用户可自行增加的带宽。<ul><li>开启副本只读时，实例总带宽 = 附加带宽 * 分片数 + 标准带宽 * 分片数 * Max ([只读副本数量, 1])，标准架构的分片数 = 1。</li><li>没有开启副本只读时，实例总带宽 = 附加带宽 * 分片数 + 标准带宽 * 分片数，标准架构的分片数 = 1。</li></ul>
    */
    @SerializedName("AddBandwidth")
    @Expose
    private Long AddBandwidth;

    /**
    * 附加带宽设置下限。
    */
    @SerializedName("MinAddBandwidth")
    @Expose
    private Long MinAddBandwidth;

    /**
    * 附加带宽设置上限。
    */
    @SerializedName("MaxAddBandwidth")
    @Expose
    private Long MaxAddBandwidth;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 标准带宽。指购买实例时，系统为每个节点分配的带宽。 
     * @return BaseBandwidth 标准带宽。指购买实例时，系统为每个节点分配的带宽。
     */
    public Long getBaseBandwidth() {
        return this.BaseBandwidth;
    }

    /**
     * Set 标准带宽。指购买实例时，系统为每个节点分配的带宽。
     * @param BaseBandwidth 标准带宽。指购买实例时，系统为每个节点分配的带宽。
     */
    public void setBaseBandwidth(Long BaseBandwidth) {
        this.BaseBandwidth = BaseBandwidth;
    }

    /**
     * Get 指实例的附加带宽。标准带宽不满足需求的情况下，用户可自行增加的带宽。<ul><li>开启副本只读时，实例总带宽 = 附加带宽 * 分片数 + 标准带宽 * 分片数 * Max ([只读副本数量, 1])，标准架构的分片数 = 1。</li><li>没有开启副本只读时，实例总带宽 = 附加带宽 * 分片数 + 标准带宽 * 分片数，标准架构的分片数 = 1。</li></ul> 
     * @return AddBandwidth 指实例的附加带宽。标准带宽不满足需求的情况下，用户可自行增加的带宽。<ul><li>开启副本只读时，实例总带宽 = 附加带宽 * 分片数 + 标准带宽 * 分片数 * Max ([只读副本数量, 1])，标准架构的分片数 = 1。</li><li>没有开启副本只读时，实例总带宽 = 附加带宽 * 分片数 + 标准带宽 * 分片数，标准架构的分片数 = 1。</li></ul>
     */
    public Long getAddBandwidth() {
        return this.AddBandwidth;
    }

    /**
     * Set 指实例的附加带宽。标准带宽不满足需求的情况下，用户可自行增加的带宽。<ul><li>开启副本只读时，实例总带宽 = 附加带宽 * 分片数 + 标准带宽 * 分片数 * Max ([只读副本数量, 1])，标准架构的分片数 = 1。</li><li>没有开启副本只读时，实例总带宽 = 附加带宽 * 分片数 + 标准带宽 * 分片数，标准架构的分片数 = 1。</li></ul>
     * @param AddBandwidth 指实例的附加带宽。标准带宽不满足需求的情况下，用户可自行增加的带宽。<ul><li>开启副本只读时，实例总带宽 = 附加带宽 * 分片数 + 标准带宽 * 分片数 * Max ([只读副本数量, 1])，标准架构的分片数 = 1。</li><li>没有开启副本只读时，实例总带宽 = 附加带宽 * 分片数 + 标准带宽 * 分片数，标准架构的分片数 = 1。</li></ul>
     */
    public void setAddBandwidth(Long AddBandwidth) {
        this.AddBandwidth = AddBandwidth;
    }

    /**
     * Get 附加带宽设置下限。 
     * @return MinAddBandwidth 附加带宽设置下限。
     */
    public Long getMinAddBandwidth() {
        return this.MinAddBandwidth;
    }

    /**
     * Set 附加带宽设置下限。
     * @param MinAddBandwidth 附加带宽设置下限。
     */
    public void setMinAddBandwidth(Long MinAddBandwidth) {
        this.MinAddBandwidth = MinAddBandwidth;
    }

    /**
     * Get 附加带宽设置上限。 
     * @return MaxAddBandwidth 附加带宽设置上限。
     */
    public Long getMaxAddBandwidth() {
        return this.MaxAddBandwidth;
    }

    /**
     * Set 附加带宽设置上限。
     * @param MaxAddBandwidth 附加带宽设置上限。
     */
    public void setMaxAddBandwidth(Long MaxAddBandwidth) {
        this.MaxAddBandwidth = MaxAddBandwidth;
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

    public DescribeBandwidthRangeResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBandwidthRangeResponse(DescribeBandwidthRangeResponse source) {
        if (source.BaseBandwidth != null) {
            this.BaseBandwidth = new Long(source.BaseBandwidth);
        }
        if (source.AddBandwidth != null) {
            this.AddBandwidth = new Long(source.AddBandwidth);
        }
        if (source.MinAddBandwidth != null) {
            this.MinAddBandwidth = new Long(source.MinAddBandwidth);
        }
        if (source.MaxAddBandwidth != null) {
            this.MaxAddBandwidth = new Long(source.MaxAddBandwidth);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BaseBandwidth", this.BaseBandwidth);
        this.setParamSimple(map, prefix + "AddBandwidth", this.AddBandwidth);
        this.setParamSimple(map, prefix + "MinAddBandwidth", this.MinAddBandwidth);
        this.setParamSimple(map, prefix + "MaxAddBandwidth", this.MaxAddBandwidth);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

