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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MonitorOverview extends AbstractModel{

    /**
    * 近24小时调用数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InvocationCountOfDay")
    @Expose
    private String InvocationCountOfDay;

    /**
    * 总调用数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InvocationCount")
    @Expose
    private String InvocationCount;

    /**
    * 近24小时调用错误数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorCountOfDay")
    @Expose
    private String ErrorCountOfDay;

    /**
    * 总调用错误数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorCount")
    @Expose
    private String ErrorCount;

    /**
    * 近24小时调用成功率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuccessRatioOfDay")
    @Expose
    private String SuccessRatioOfDay;

    /**
    * 总调用成功率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuccessRatio")
    @Expose
    private String SuccessRatio;

    /**
     * Get 近24小时调用数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InvocationCountOfDay 近24小时调用数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInvocationCountOfDay() {
        return this.InvocationCountOfDay;
    }

    /**
     * Set 近24小时调用数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param InvocationCountOfDay 近24小时调用数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInvocationCountOfDay(String InvocationCountOfDay) {
        this.InvocationCountOfDay = InvocationCountOfDay;
    }

    /**
     * Get 总调用数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InvocationCount 总调用数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInvocationCount() {
        return this.InvocationCount;
    }

    /**
     * Set 总调用数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param InvocationCount 总调用数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInvocationCount(String InvocationCount) {
        this.InvocationCount = InvocationCount;
    }

    /**
     * Get 近24小时调用错误数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorCountOfDay 近24小时调用错误数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorCountOfDay() {
        return this.ErrorCountOfDay;
    }

    /**
     * Set 近24小时调用错误数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorCountOfDay 近24小时调用错误数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorCountOfDay(String ErrorCountOfDay) {
        this.ErrorCountOfDay = ErrorCountOfDay;
    }

    /**
     * Get 总调用错误数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorCount 总调用错误数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorCount() {
        return this.ErrorCount;
    }

    /**
     * Set 总调用错误数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorCount 总调用错误数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorCount(String ErrorCount) {
        this.ErrorCount = ErrorCount;
    }

    /**
     * Get 近24小时调用成功率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuccessRatioOfDay 近24小时调用成功率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSuccessRatioOfDay() {
        return this.SuccessRatioOfDay;
    }

    /**
     * Set 近24小时调用成功率
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuccessRatioOfDay 近24小时调用成功率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuccessRatioOfDay(String SuccessRatioOfDay) {
        this.SuccessRatioOfDay = SuccessRatioOfDay;
    }

    /**
     * Get 总调用成功率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuccessRatio 总调用成功率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSuccessRatio() {
        return this.SuccessRatio;
    }

    /**
     * Set 总调用成功率
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuccessRatio 总调用成功率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuccessRatio(String SuccessRatio) {
        this.SuccessRatio = SuccessRatio;
    }

    public MonitorOverview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MonitorOverview(MonitorOverview source) {
        if (source.InvocationCountOfDay != null) {
            this.InvocationCountOfDay = new String(source.InvocationCountOfDay);
        }
        if (source.InvocationCount != null) {
            this.InvocationCount = new String(source.InvocationCount);
        }
        if (source.ErrorCountOfDay != null) {
            this.ErrorCountOfDay = new String(source.ErrorCountOfDay);
        }
        if (source.ErrorCount != null) {
            this.ErrorCount = new String(source.ErrorCount);
        }
        if (source.SuccessRatioOfDay != null) {
            this.SuccessRatioOfDay = new String(source.SuccessRatioOfDay);
        }
        if (source.SuccessRatio != null) {
            this.SuccessRatio = new String(source.SuccessRatio);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InvocationCountOfDay", this.InvocationCountOfDay);
        this.setParamSimple(map, prefix + "InvocationCount", this.InvocationCount);
        this.setParamSimple(map, prefix + "ErrorCountOfDay", this.ErrorCountOfDay);
        this.setParamSimple(map, prefix + "ErrorCount", this.ErrorCount);
        this.setParamSimple(map, prefix + "SuccessRatioOfDay", this.SuccessRatioOfDay);
        this.setParamSimple(map, prefix + "SuccessRatio", this.SuccessRatio);

    }
}

