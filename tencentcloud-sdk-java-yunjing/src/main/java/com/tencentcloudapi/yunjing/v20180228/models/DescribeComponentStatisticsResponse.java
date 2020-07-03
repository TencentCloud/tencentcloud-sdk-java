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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeComponentStatisticsResponse extends AbstractModel{

    /**
    * 组件统计列表记录总数。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 组件统计列表数据数组。
    */
    @SerializedName("ComponentStatistics")
    @Expose
    private ComponentStatistics [] ComponentStatistics;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 组件统计列表记录总数。 
     * @return TotalCount 组件统计列表记录总数。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 组件统计列表记录总数。
     * @param TotalCount 组件统计列表记录总数。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 组件统计列表数据数组。 
     * @return ComponentStatistics 组件统计列表数据数组。
     */
    public ComponentStatistics [] getComponentStatistics() {
        return this.ComponentStatistics;
    }

    /**
     * Set 组件统计列表数据数组。
     * @param ComponentStatistics 组件统计列表数据数组。
     */
    public void setComponentStatistics(ComponentStatistics [] ComponentStatistics) {
        this.ComponentStatistics = ComponentStatistics;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "ComponentStatistics.", this.ComponentStatistics);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

