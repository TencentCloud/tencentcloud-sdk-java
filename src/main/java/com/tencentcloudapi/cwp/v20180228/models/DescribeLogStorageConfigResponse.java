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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLogStorageConfigResponse extends AbstractModel{

    /**
    * 存储类型，string数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String [] Type;

    /**
    * 日志存储天数，3640表示不限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 本月Period的修改次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PeriodModifyCount")
    @Expose
    private Long PeriodModifyCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 存储类型，string数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 存储类型，string数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getType() {
        return this.Type;
    }

    /**
     * Set 存储类型，string数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 存储类型，string数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String [] Type) {
        this.Type = Type;
    }

    /**
     * Get 日志存储天数，3640表示不限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Period 日志存储天数，3640表示不限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 日志存储天数，3640表示不限
注意：此字段可能返回 null，表示取不到有效值。
     * @param Period 日志存储天数，3640表示不限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 本月Period的修改次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PeriodModifyCount 本月Period的修改次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPeriodModifyCount() {
        return this.PeriodModifyCount;
    }

    /**
     * Set 本月Period的修改次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param PeriodModifyCount 本月Period的修改次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeriodModifyCount(Long PeriodModifyCount) {
        this.PeriodModifyCount = PeriodModifyCount;
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

    public DescribeLogStorageConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLogStorageConfigResponse(DescribeLogStorageConfigResponse source) {
        if (source.Type != null) {
            this.Type = new String[source.Type.length];
            for (int i = 0; i < source.Type.length; i++) {
                this.Type[i] = new String(source.Type[i]);
            }
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.PeriodModifyCount != null) {
            this.PeriodModifyCount = new Long(source.PeriodModifyCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Type.", this.Type);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "PeriodModifyCount", this.PeriodModifyCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

