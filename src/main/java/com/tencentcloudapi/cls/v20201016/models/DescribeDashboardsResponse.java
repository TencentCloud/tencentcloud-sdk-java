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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDashboardsResponse extends AbstractModel{

    /**
    * 仪表盘的数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 仪表盘详细明细
    */
    @SerializedName("DashboardInfos")
    @Expose
    private DashboardInfo [] DashboardInfos;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 仪表盘的数量 
     * @return TotalCount 仪表盘的数量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 仪表盘的数量
     * @param TotalCount 仪表盘的数量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 仪表盘详细明细 
     * @return DashboardInfos 仪表盘详细明细
     */
    public DashboardInfo [] getDashboardInfos() {
        return this.DashboardInfos;
    }

    /**
     * Set 仪表盘详细明细
     * @param DashboardInfos 仪表盘详细明细
     */
    public void setDashboardInfos(DashboardInfo [] DashboardInfos) {
        this.DashboardInfos = DashboardInfos;
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

    public DescribeDashboardsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDashboardsResponse(DescribeDashboardsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.DashboardInfos != null) {
            this.DashboardInfos = new DashboardInfo[source.DashboardInfos.length];
            for (int i = 0; i < source.DashboardInfos.length; i++) {
                this.DashboardInfos[i] = new DashboardInfo(source.DashboardInfos[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "DashboardInfos.", this.DashboardInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

