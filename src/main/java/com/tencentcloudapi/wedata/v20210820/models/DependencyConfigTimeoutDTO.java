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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DependencyConfigTimeoutDTO extends AbstractModel {

    /**
    * 超时类型
WAIT_TOTAL_TIMEOUT 等待总时长

RUNNING_TIMEOUT 运行时长

WAIT_TIME_POINT_TIMEOUT 等待超过配置时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeoutType")
    @Expose
    private String TimeoutType;

    /**
    * 超时时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeoutValue")
    @Expose
    private Long TimeoutValue;

    /**
    * 固定时间点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeoutPoint")
    @Expose
    private String TimeoutPoint;

    /**
     * Get 超时类型
WAIT_TOTAL_TIMEOUT 等待总时长

RUNNING_TIMEOUT 运行时长

WAIT_TIME_POINT_TIMEOUT 等待超过配置时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeoutType 超时类型
WAIT_TOTAL_TIMEOUT 等待总时长

RUNNING_TIMEOUT 运行时长

WAIT_TIME_POINT_TIMEOUT 等待超过配置时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimeoutType() {
        return this.TimeoutType;
    }

    /**
     * Set 超时类型
WAIT_TOTAL_TIMEOUT 等待总时长

RUNNING_TIMEOUT 运行时长

WAIT_TIME_POINT_TIMEOUT 等待超过配置时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeoutType 超时类型
WAIT_TOTAL_TIMEOUT 等待总时长

RUNNING_TIMEOUT 运行时长

WAIT_TIME_POINT_TIMEOUT 等待超过配置时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeoutType(String TimeoutType) {
        this.TimeoutType = TimeoutType;
    }

    /**
     * Get 超时时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeoutValue 超时时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimeoutValue() {
        return this.TimeoutValue;
    }

    /**
     * Set 超时时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeoutValue 超时时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeoutValue(Long TimeoutValue) {
        this.TimeoutValue = TimeoutValue;
    }

    /**
     * Get 固定时间点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeoutPoint 固定时间点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimeoutPoint() {
        return this.TimeoutPoint;
    }

    /**
     * Set 固定时间点
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeoutPoint 固定时间点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeoutPoint(String TimeoutPoint) {
        this.TimeoutPoint = TimeoutPoint;
    }

    public DependencyConfigTimeoutDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DependencyConfigTimeoutDTO(DependencyConfigTimeoutDTO source) {
        if (source.TimeoutType != null) {
            this.TimeoutType = new String(source.TimeoutType);
        }
        if (source.TimeoutValue != null) {
            this.TimeoutValue = new Long(source.TimeoutValue);
        }
        if (source.TimeoutPoint != null) {
            this.TimeoutPoint = new String(source.TimeoutPoint);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeoutType", this.TimeoutType);
        this.setParamSimple(map, prefix + "TimeoutValue", this.TimeoutValue);
        this.setParamSimple(map, prefix + "TimeoutPoint", this.TimeoutPoint);

    }
}

