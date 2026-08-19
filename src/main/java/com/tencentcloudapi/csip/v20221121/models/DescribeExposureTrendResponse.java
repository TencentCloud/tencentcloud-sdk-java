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
    * 暴露周期趋势数量统计信息
    */
    @SerializedName("ExposeTrendList")
    @Expose
    private ExposeTrendItem [] ExposeTrendList;

    /**
    * 暴露周期新增数量统计
    */
    @SerializedName("ExposeIncrement")
    @Expose
    private Long ExposeIncrement;

    /**
    * 近1天（24h）完全开放数量
    */
    @SerializedName("OpenCount")
    @Expose
    private Long OpenCount;

    /**
    * 近1天（24h）受限访问数量
    */
    @SerializedName("AclCount")
    @Expose
    private Long AclCount;

    /**
    * 近1天（24h）无法访问数量
    */
    @SerializedName("CloseCount")
    @Expose
    private Long CloseCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 暴露周期趋势数量统计信息 
     * @return ExposeTrendList 暴露周期趋势数量统计信息
     */
    public ExposeTrendItem [] getExposeTrendList() {
        return this.ExposeTrendList;
    }

    /**
     * Set 暴露周期趋势数量统计信息
     * @param ExposeTrendList 暴露周期趋势数量统计信息
     */
    public void setExposeTrendList(ExposeTrendItem [] ExposeTrendList) {
        this.ExposeTrendList = ExposeTrendList;
    }

    /**
     * Get 暴露周期新增数量统计 
     * @return ExposeIncrement 暴露周期新增数量统计
     */
    public Long getExposeIncrement() {
        return this.ExposeIncrement;
    }

    /**
     * Set 暴露周期新增数量统计
     * @param ExposeIncrement 暴露周期新增数量统计
     */
    public void setExposeIncrement(Long ExposeIncrement) {
        this.ExposeIncrement = ExposeIncrement;
    }

    /**
     * Get 近1天（24h）完全开放数量 
     * @return OpenCount 近1天（24h）完全开放数量
     */
    public Long getOpenCount() {
        return this.OpenCount;
    }

    /**
     * Set 近1天（24h）完全开放数量
     * @param OpenCount 近1天（24h）完全开放数量
     */
    public void setOpenCount(Long OpenCount) {
        this.OpenCount = OpenCount;
    }

    /**
     * Get 近1天（24h）受限访问数量 
     * @return AclCount 近1天（24h）受限访问数量
     */
    public Long getAclCount() {
        return this.AclCount;
    }

    /**
     * Set 近1天（24h）受限访问数量
     * @param AclCount 近1天（24h）受限访问数量
     */
    public void setAclCount(Long AclCount) {
        this.AclCount = AclCount;
    }

    /**
     * Get 近1天（24h）无法访问数量 
     * @return CloseCount 近1天（24h）无法访问数量
     */
    public Long getCloseCount() {
        return this.CloseCount;
    }

    /**
     * Set 近1天（24h）无法访问数量
     * @param CloseCount 近1天（24h）无法访问数量
     */
    public void setCloseCount(Long CloseCount) {
        this.CloseCount = CloseCount;
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

