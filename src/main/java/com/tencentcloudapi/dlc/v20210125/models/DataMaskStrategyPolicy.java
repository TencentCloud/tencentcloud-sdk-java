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

public class DataMaskStrategyPolicy extends AbstractModel {

    /**
    * 数据脱敏权限对象
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolicyInfo")
    @Expose
    private Policy PolicyInfo;

    /**
    * 数据脱敏策略ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataMaskStrategyId")
    @Expose
    private String DataMaskStrategyId;

    /**
    * 绑定字段类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColumnType")
    @Expose
    private String ColumnType;

    /**
     * Get 数据脱敏权限对象
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PolicyInfo 数据脱敏权限对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Policy getPolicyInfo() {
        return this.PolicyInfo;
    }

    /**
     * Set 数据脱敏权限对象
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolicyInfo 数据脱敏权限对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicyInfo(Policy PolicyInfo) {
        this.PolicyInfo = PolicyInfo;
    }

    /**
     * Get 数据脱敏策略ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataMaskStrategyId 数据脱敏策略ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataMaskStrategyId() {
        return this.DataMaskStrategyId;
    }

    /**
     * Set 数据脱敏策略ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataMaskStrategyId 数据脱敏策略ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataMaskStrategyId(String DataMaskStrategyId) {
        this.DataMaskStrategyId = DataMaskStrategyId;
    }

    /**
     * Get 绑定字段类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColumnType 绑定字段类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getColumnType() {
        return this.ColumnType;
    }

    /**
     * Set 绑定字段类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColumnType 绑定字段类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumnType(String ColumnType) {
        this.ColumnType = ColumnType;
    }

    public DataMaskStrategyPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataMaskStrategyPolicy(DataMaskStrategyPolicy source) {
        if (source.PolicyInfo != null) {
            this.PolicyInfo = new Policy(source.PolicyInfo);
        }
        if (source.DataMaskStrategyId != null) {
            this.DataMaskStrategyId = new String(source.DataMaskStrategyId);
        }
        if (source.ColumnType != null) {
            this.ColumnType = new String(source.ColumnType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "PolicyInfo.", this.PolicyInfo);
        this.setParamSimple(map, prefix + "DataMaskStrategyId", this.DataMaskStrategyId);
        this.setParamSimple(map, prefix + "ColumnType", this.ColumnType);

    }
}

