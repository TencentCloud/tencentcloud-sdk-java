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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCallInMetricsResponse extends AbstractModel{

    /**
    * 时间戳
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * 总体指标
    */
    @SerializedName("TotalMetrics")
    @Expose
    private CallInMetrics TotalMetrics;

    /**
    * 线路维度指标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NumberMetrics")
    @Expose
    private CallInNumberMetrics [] NumberMetrics;

    /**
    * 技能组维度指标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SkillGroupMetrics")
    @Expose
    private CallInSkillGroupMetrics [] SkillGroupMetrics;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 时间戳 
     * @return Timestamp 时间戳
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 时间戳
     * @param Timestamp 时间戳
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 总体指标 
     * @return TotalMetrics 总体指标
     */
    public CallInMetrics getTotalMetrics() {
        return this.TotalMetrics;
    }

    /**
     * Set 总体指标
     * @param TotalMetrics 总体指标
     */
    public void setTotalMetrics(CallInMetrics TotalMetrics) {
        this.TotalMetrics = TotalMetrics;
    }

    /**
     * Get 线路维度指标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NumberMetrics 线路维度指标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CallInNumberMetrics [] getNumberMetrics() {
        return this.NumberMetrics;
    }

    /**
     * Set 线路维度指标
注意：此字段可能返回 null，表示取不到有效值。
     * @param NumberMetrics 线路维度指标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNumberMetrics(CallInNumberMetrics [] NumberMetrics) {
        this.NumberMetrics = NumberMetrics;
    }

    /**
     * Get 技能组维度指标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SkillGroupMetrics 技能组维度指标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CallInSkillGroupMetrics [] getSkillGroupMetrics() {
        return this.SkillGroupMetrics;
    }

    /**
     * Set 技能组维度指标
注意：此字段可能返回 null，表示取不到有效值。
     * @param SkillGroupMetrics 技能组维度指标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSkillGroupMetrics(CallInSkillGroupMetrics [] SkillGroupMetrics) {
        this.SkillGroupMetrics = SkillGroupMetrics;
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

    public DescribeCallInMetricsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCallInMetricsResponse(DescribeCallInMetricsResponse source) {
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.TotalMetrics != null) {
            this.TotalMetrics = new CallInMetrics(source.TotalMetrics);
        }
        if (source.NumberMetrics != null) {
            this.NumberMetrics = new CallInNumberMetrics[source.NumberMetrics.length];
            for (int i = 0; i < source.NumberMetrics.length; i++) {
                this.NumberMetrics[i] = new CallInNumberMetrics(source.NumberMetrics[i]);
            }
        }
        if (source.SkillGroupMetrics != null) {
            this.SkillGroupMetrics = new CallInSkillGroupMetrics[source.SkillGroupMetrics.length];
            for (int i = 0; i < source.SkillGroupMetrics.length; i++) {
                this.SkillGroupMetrics[i] = new CallInSkillGroupMetrics(source.SkillGroupMetrics[i]);
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
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamObj(map, prefix + "TotalMetrics.", this.TotalMetrics);
        this.setParamArrayObj(map, prefix + "NumberMetrics.", this.NumberMetrics);
        this.setParamArrayObj(map, prefix + "SkillGroupMetrics.", this.SkillGroupMetrics);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

