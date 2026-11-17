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

public class DescribeExposureTrendResponse extends AbstractModel {

    /**
    * <p>暴露周期趋势数量统计信息</p>
    */
    @SerializedName("ExposeTrendList")
    @Expose
    private ExposeTrendItem [] ExposeTrendList;

    /**
    * <p>暴露周期新增数量统计</p>
    */
    @SerializedName("ExposeIncrement")
    @Expose
    private Long ExposeIncrement;

    /**
    * <p>近1天（24h）完全开放数量</p>
    */
    @SerializedName("OpenCount")
    @Expose
    private Long OpenCount;

    /**
    * <p>近1天（24h）受限访问数量</p>
    */
    @SerializedName("AclCount")
    @Expose
    private Long AclCount;

    /**
    * <p>近1天（24h）无法访问数量</p>
    */
    @SerializedName("CloseCount")
    @Expose
    private Long CloseCount;

    /**
    * <p>互联网边界总数</p>
    */
    @SerializedName("ExposeTotalCount")
    @Expose
    private Long ExposeTotalCount;

    /**
    * <p>待处理边界数量</p>
    */
    @SerializedName("ToGovernRiskCount")
    @Expose
    private Long ToGovernRiskCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>暴露周期趋势数量统计信息</p> 
     * @return ExposeTrendList <p>暴露周期趋势数量统计信息</p>
     */
    public ExposeTrendItem [] getExposeTrendList() {
        return this.ExposeTrendList;
    }

    /**
     * Set <p>暴露周期趋势数量统计信息</p>
     * @param ExposeTrendList <p>暴露周期趋势数量统计信息</p>
     */
    public void setExposeTrendList(ExposeTrendItem [] ExposeTrendList) {
        this.ExposeTrendList = ExposeTrendList;
    }

    /**
     * Get <p>暴露周期新增数量统计</p> 
     * @return ExposeIncrement <p>暴露周期新增数量统计</p>
     */
    public Long getExposeIncrement() {
        return this.ExposeIncrement;
    }

    /**
     * Set <p>暴露周期新增数量统计</p>
     * @param ExposeIncrement <p>暴露周期新增数量统计</p>
     */
    public void setExposeIncrement(Long ExposeIncrement) {
        this.ExposeIncrement = ExposeIncrement;
    }

    /**
     * Get <p>近1天（24h）完全开放数量</p> 
     * @return OpenCount <p>近1天（24h）完全开放数量</p>
     */
    public Long getOpenCount() {
        return this.OpenCount;
    }

    /**
     * Set <p>近1天（24h）完全开放数量</p>
     * @param OpenCount <p>近1天（24h）完全开放数量</p>
     */
    public void setOpenCount(Long OpenCount) {
        this.OpenCount = OpenCount;
    }

    /**
     * Get <p>近1天（24h）受限访问数量</p> 
     * @return AclCount <p>近1天（24h）受限访问数量</p>
     */
    public Long getAclCount() {
        return this.AclCount;
    }

    /**
     * Set <p>近1天（24h）受限访问数量</p>
     * @param AclCount <p>近1天（24h）受限访问数量</p>
     */
    public void setAclCount(Long AclCount) {
        this.AclCount = AclCount;
    }

    /**
     * Get <p>近1天（24h）无法访问数量</p> 
     * @return CloseCount <p>近1天（24h）无法访问数量</p>
     */
    public Long getCloseCount() {
        return this.CloseCount;
    }

    /**
     * Set <p>近1天（24h）无法访问数量</p>
     * @param CloseCount <p>近1天（24h）无法访问数量</p>
     */
    public void setCloseCount(Long CloseCount) {
        this.CloseCount = CloseCount;
    }

    /**
     * Get <p>互联网边界总数</p> 
     * @return ExposeTotalCount <p>互联网边界总数</p>
     */
    public Long getExposeTotalCount() {
        return this.ExposeTotalCount;
    }

    /**
     * Set <p>互联网边界总数</p>
     * @param ExposeTotalCount <p>互联网边界总数</p>
     */
    public void setExposeTotalCount(Long ExposeTotalCount) {
        this.ExposeTotalCount = ExposeTotalCount;
    }

    /**
     * Get <p>待处理边界数量</p> 
     * @return ToGovernRiskCount <p>待处理边界数量</p>
     */
    public Long getToGovernRiskCount() {
        return this.ToGovernRiskCount;
    }

    /**
     * Set <p>待处理边界数量</p>
     * @param ToGovernRiskCount <p>待处理边界数量</p>
     */
    public void setToGovernRiskCount(Long ToGovernRiskCount) {
        this.ToGovernRiskCount = ToGovernRiskCount;
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

    public DescribeExposureTrendResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeExposureTrendResponse(DescribeExposureTrendResponse source) {
        if (source.ExposeTrendList != null) {
            this.ExposeTrendList = new ExposeTrendItem[source.ExposeTrendList.length];
            for (int i = 0; i < source.ExposeTrendList.length; i++) {
                this.ExposeTrendList[i] = new ExposeTrendItem(source.ExposeTrendList[i]);
            }
        }
        if (source.ExposeIncrement != null) {
            this.ExposeIncrement = new Long(source.ExposeIncrement);
        }
        if (source.OpenCount != null) {
            this.OpenCount = new Long(source.OpenCount);
        }
        if (source.AclCount != null) {
            this.AclCount = new Long(source.AclCount);
        }
        if (source.CloseCount != null) {
            this.CloseCount = new Long(source.CloseCount);
        }
        if (source.ExposeTotalCount != null) {
            this.ExposeTotalCount = new Long(source.ExposeTotalCount);
        }
        if (source.ToGovernRiskCount != null) {
            this.ToGovernRiskCount = new Long(source.ToGovernRiskCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ExposeTrendList.", this.ExposeTrendList);
        this.setParamSimple(map, prefix + "ExposeIncrement", this.ExposeIncrement);
        this.setParamSimple(map, prefix + "OpenCount", this.OpenCount);
        this.setParamSimple(map, prefix + "AclCount", this.AclCount);
        this.setParamSimple(map, prefix + "CloseCount", this.CloseCount);
        this.setParamSimple(map, prefix + "ExposeTotalCount", this.ExposeTotalCount);
        this.setParamSimple(map, prefix + "ToGovernRiskCount", this.ToGovernRiskCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

