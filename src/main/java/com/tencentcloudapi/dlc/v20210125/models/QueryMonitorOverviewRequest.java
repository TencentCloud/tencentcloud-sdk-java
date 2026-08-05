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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryMonitorOverviewRequest extends AbstractModel {

    /**
    * <p>图表类型列表（批量查询多个指标的当前值）</p>
    */
    @SerializedName("ChartTypes")
    @Expose
    private String [] ChartTypes;

    /**
    * <p>推理服务 ID（业务唯一标识）</p>
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
     * Get <p>图表类型列表（批量查询多个指标的当前值）</p> 
     * @return ChartTypes <p>图表类型列表（批量查询多个指标的当前值）</p>
     */
    public String [] getChartTypes() {
        return this.ChartTypes;
    }

    /**
     * Set <p>图表类型列表（批量查询多个指标的当前值）</p>
     * @param ChartTypes <p>图表类型列表（批量查询多个指标的当前值）</p>
     */
    public void setChartTypes(String [] ChartTypes) {
        this.ChartTypes = ChartTypes;
    }

    /**
     * Get <p>推理服务 ID（业务唯一标识）</p> 
     * @return ServiceId <p>推理服务 ID（业务唯一标识）</p>
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set <p>推理服务 ID（业务唯一标识）</p>
     * @param ServiceId <p>推理服务 ID（业务唯一标识）</p>
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    public QueryMonitorOverviewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryMonitorOverviewRequest(QueryMonitorOverviewRequest source) {
        if (source.ChartTypes != null) {
            this.ChartTypes = new String[source.ChartTypes.length];
            for (int i = 0; i < source.ChartTypes.length; i++) {
                this.ChartTypes[i] = new String(source.ChartTypes[i]);
            }
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ChartTypes.", this.ChartTypes);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);

    }
}

