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

public class DescribeVulFixableMachineListResponse extends AbstractModel {

    /**
    * <p>可修复主机列表</p>
    */
    @SerializedName("Data")
    @Expose
    private VulFixableMachineItem [] Data;

    /**
    * <p>总数量</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>可一键修复的主机数量</p>
    */
    @SerializedName("FixableCount")
    @Expose
    private Long FixableCount;

    /**
    * <p>不可一键修复的主机数量</p>
    */
    @SerializedName("NotFixableCount")
    @Expose
    private Long NotFixableCount;

    /**
    * <p>漏洞维度汇总信息，展示被修复的漏洞列表概要</p>
    */
    @SerializedName("VulSummary")
    @Expose
    private VulFixSummaryItem [] VulSummary;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>可修复主机列表</p> 
     * @return Data <p>可修复主机列表</p>
     */
    public VulFixableMachineItem [] getData() {
        return this.Data;
    }

    /**
     * Set <p>可修复主机列表</p>
     * @param Data <p>可修复主机列表</p>
     */
    public void setData(VulFixableMachineItem [] Data) {
        this.Data = Data;
    }

    /**
     * Get <p>总数量</p> 
     * @return TotalCount <p>总数量</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>总数量</p>
     * @param TotalCount <p>总数量</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>可一键修复的主机数量</p> 
     * @return FixableCount <p>可一键修复的主机数量</p>
     */
    public Long getFixableCount() {
        return this.FixableCount;
    }

    /**
     * Set <p>可一键修复的主机数量</p>
     * @param FixableCount <p>可一键修复的主机数量</p>
     */
    public void setFixableCount(Long FixableCount) {
        this.FixableCount = FixableCount;
    }

    /**
     * Get <p>不可一键修复的主机数量</p> 
     * @return NotFixableCount <p>不可一键修复的主机数量</p>
     */
    public Long getNotFixableCount() {
        return this.NotFixableCount;
    }

    /**
     * Set <p>不可一键修复的主机数量</p>
     * @param NotFixableCount <p>不可一键修复的主机数量</p>
     */
    public void setNotFixableCount(Long NotFixableCount) {
        this.NotFixableCount = NotFixableCount;
    }

    /**
     * Get <p>漏洞维度汇总信息，展示被修复的漏洞列表概要</p> 
     * @return VulSummary <p>漏洞维度汇总信息，展示被修复的漏洞列表概要</p>
     */
    public VulFixSummaryItem [] getVulSummary() {
        return this.VulSummary;
    }

    /**
     * Set <p>漏洞维度汇总信息，展示被修复的漏洞列表概要</p>
     * @param VulSummary <p>漏洞维度汇总信息，展示被修复的漏洞列表概要</p>
     */
    public void setVulSummary(VulFixSummaryItem [] VulSummary) {
        this.VulSummary = VulSummary;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeVulFixableMachineListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulFixableMachineListResponse(DescribeVulFixableMachineListResponse source) {
        if (source.Data != null) {
            this.Data = new VulFixableMachineItem[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new VulFixableMachineItem(source.Data[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.FixableCount != null) {
            this.FixableCount = new Long(source.FixableCount);
        }
        if (source.NotFixableCount != null) {
            this.NotFixableCount = new Long(source.NotFixableCount);
        }
        if (source.VulSummary != null) {
            this.VulSummary = new VulFixSummaryItem[source.VulSummary.length];
            for (int i = 0; i < source.VulSummary.length; i++) {
                this.VulSummary[i] = new VulFixSummaryItem(source.VulSummary[i]);
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
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "FixableCount", this.FixableCount);
        this.setParamSimple(map, prefix + "NotFixableCount", this.NotFixableCount);
        this.setParamArrayObj(map, prefix + "VulSummary.", this.VulSummary);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

