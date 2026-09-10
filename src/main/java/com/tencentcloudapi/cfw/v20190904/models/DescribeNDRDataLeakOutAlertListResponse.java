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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNDRDataLeakOutAlertListResponse extends AbstractModel {

    /**
    * 符合查询条件的总条数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 查询结果列表
    */
    @SerializedName("Data")
    @Expose
    private DataLeakOutAlertEvent [] Data;

    /**
    * 实例类型可选项
    */
    @SerializedName("InstanceTypeOptions")
    @Expose
    private FieldOption [] InstanceTypeOptions;

    /**
    * 地域可选项
    */
    @SerializedName("RegionOptions")
    @Expose
    private FieldOption [] RegionOptions;

    /**
    * 目标服务类型可选项
    */
    @SerializedName("DstServiceTypeOptions")
    @Expose
    private FieldOption [] DstServiceTypeOptions;

    /**
    * 风险场景（类型）可选项
    */
    @SerializedName("RiskScenarioOptions")
    @Expose
    private FieldOption [] RiskScenarioOptions;

    /**
    * AI分析任务状态可选项
    */
    @SerializedName("AnalysisStatusOptions")
    @Expose
    private FieldOption [] AnalysisStatusOptions;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 符合查询条件的总条数 
     * @return Total 符合查询条件的总条数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 符合查询条件的总条数
     * @param Total 符合查询条件的总条数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 查询结果列表 
     * @return Data 查询结果列表
     */
    public DataLeakOutAlertEvent [] getData() {
        return this.Data;
    }

    /**
     * Set 查询结果列表
     * @param Data 查询结果列表
     */
    public void setData(DataLeakOutAlertEvent [] Data) {
        this.Data = Data;
    }

    /**
     * Get 实例类型可选项 
     * @return InstanceTypeOptions 实例类型可选项
     */
    public FieldOption [] getInstanceTypeOptions() {
        return this.InstanceTypeOptions;
    }

    /**
     * Set 实例类型可选项
     * @param InstanceTypeOptions 实例类型可选项
     */
    public void setInstanceTypeOptions(FieldOption [] InstanceTypeOptions) {
        this.InstanceTypeOptions = InstanceTypeOptions;
    }

    /**
     * Get 地域可选项 
     * @return RegionOptions 地域可选项
     */
    public FieldOption [] getRegionOptions() {
        return this.RegionOptions;
    }

    /**
     * Set 地域可选项
     * @param RegionOptions 地域可选项
     */
    public void setRegionOptions(FieldOption [] RegionOptions) {
        this.RegionOptions = RegionOptions;
    }

    /**
     * Get 目标服务类型可选项 
     * @return DstServiceTypeOptions 目标服务类型可选项
     */
    public FieldOption [] getDstServiceTypeOptions() {
        return this.DstServiceTypeOptions;
    }

    /**
     * Set 目标服务类型可选项
     * @param DstServiceTypeOptions 目标服务类型可选项
     */
    public void setDstServiceTypeOptions(FieldOption [] DstServiceTypeOptions) {
        this.DstServiceTypeOptions = DstServiceTypeOptions;
    }

    /**
     * Get 风险场景（类型）可选项 
     * @return RiskScenarioOptions 风险场景（类型）可选项
     */
    public FieldOption [] getRiskScenarioOptions() {
        return this.RiskScenarioOptions;
    }

    /**
     * Set 风险场景（类型）可选项
     * @param RiskScenarioOptions 风险场景（类型）可选项
     */
    public void setRiskScenarioOptions(FieldOption [] RiskScenarioOptions) {
        this.RiskScenarioOptions = RiskScenarioOptions;
    }

    /**
     * Get AI分析任务状态可选项 
     * @return AnalysisStatusOptions AI分析任务状态可选项
     */
    public FieldOption [] getAnalysisStatusOptions() {
        return this.AnalysisStatusOptions;
    }

    /**
     * Set AI分析任务状态可选项
     * @param AnalysisStatusOptions AI分析任务状态可选项
     */
    public void setAnalysisStatusOptions(FieldOption [] AnalysisStatusOptions) {
        this.AnalysisStatusOptions = AnalysisStatusOptions;
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

    public DescribeNDRDataLeakOutAlertListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNDRDataLeakOutAlertListResponse(DescribeNDRDataLeakOutAlertListResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Data != null) {
            this.Data = new DataLeakOutAlertEvent[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new DataLeakOutAlertEvent(source.Data[i]);
            }
        }
        if (source.InstanceTypeOptions != null) {
            this.InstanceTypeOptions = new FieldOption[source.InstanceTypeOptions.length];
            for (int i = 0; i < source.InstanceTypeOptions.length; i++) {
                this.InstanceTypeOptions[i] = new FieldOption(source.InstanceTypeOptions[i]);
            }
        }
        if (source.RegionOptions != null) {
            this.RegionOptions = new FieldOption[source.RegionOptions.length];
            for (int i = 0; i < source.RegionOptions.length; i++) {
                this.RegionOptions[i] = new FieldOption(source.RegionOptions[i]);
            }
        }
        if (source.DstServiceTypeOptions != null) {
            this.DstServiceTypeOptions = new FieldOption[source.DstServiceTypeOptions.length];
            for (int i = 0; i < source.DstServiceTypeOptions.length; i++) {
                this.DstServiceTypeOptions[i] = new FieldOption(source.DstServiceTypeOptions[i]);
            }
        }
        if (source.RiskScenarioOptions != null) {
            this.RiskScenarioOptions = new FieldOption[source.RiskScenarioOptions.length];
            for (int i = 0; i < source.RiskScenarioOptions.length; i++) {
                this.RiskScenarioOptions[i] = new FieldOption(source.RiskScenarioOptions[i]);
            }
        }
        if (source.AnalysisStatusOptions != null) {
            this.AnalysisStatusOptions = new FieldOption[source.AnalysisStatusOptions.length];
            for (int i = 0; i < source.AnalysisStatusOptions.length; i++) {
                this.AnalysisStatusOptions[i] = new FieldOption(source.AnalysisStatusOptions[i]);
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
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamArrayObj(map, prefix + "InstanceTypeOptions.", this.InstanceTypeOptions);
        this.setParamArrayObj(map, prefix + "RegionOptions.", this.RegionOptions);
        this.setParamArrayObj(map, prefix + "DstServiceTypeOptions.", this.DstServiceTypeOptions);
        this.setParamArrayObj(map, prefix + "RiskScenarioOptions.", this.RiskScenarioOptions);
        this.setParamArrayObj(map, prefix + "AnalysisStatusOptions.", this.AnalysisStatusOptions);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

