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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiopsDLCResourceConfigDto extends AbstractModel {

    /**
    * Driver资源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DriverSize")
    @Expose
    private String DriverSize;

    /**
    * Executor资源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutorSize")
    @Expose
    private String ExecutorSize;

    /**
    * Executor数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutorNumbers")
    @Expose
    private String ExecutorNumbers;

    /**
    * 资源配置方式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsInherit")
    @Expose
    private String IsInherit;

    /**
     * Get Driver资源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DriverSize Driver资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDriverSize() {
        return this.DriverSize;
    }

    /**
     * Set Driver资源
注意：此字段可能返回 null，表示取不到有效值。
     * @param DriverSize Driver资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDriverSize(String DriverSize) {
        this.DriverSize = DriverSize;
    }

    /**
     * Get Executor资源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutorSize Executor资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutorSize() {
        return this.ExecutorSize;
    }

    /**
     * Set Executor资源
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutorSize Executor资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutorSize(String ExecutorSize) {
        this.ExecutorSize = ExecutorSize;
    }

    /**
     * Get Executor数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutorNumbers Executor数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutorNumbers() {
        return this.ExecutorNumbers;
    }

    /**
     * Set Executor数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutorNumbers Executor数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutorNumbers(String ExecutorNumbers) {
        this.ExecutorNumbers = ExecutorNumbers;
    }

    /**
     * Get 资源配置方式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsInherit 资源配置方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsInherit() {
        return this.IsInherit;
    }

    /**
     * Set 资源配置方式
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsInherit 资源配置方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsInherit(String IsInherit) {
        this.IsInherit = IsInherit;
    }

    public AiopsDLCResourceConfigDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiopsDLCResourceConfigDto(AiopsDLCResourceConfigDto source) {
        if (source.DriverSize != null) {
            this.DriverSize = new String(source.DriverSize);
        }
        if (source.ExecutorSize != null) {
            this.ExecutorSize = new String(source.ExecutorSize);
        }
        if (source.ExecutorNumbers != null) {
            this.ExecutorNumbers = new String(source.ExecutorNumbers);
        }
        if (source.IsInherit != null) {
            this.IsInherit = new String(source.IsInherit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DriverSize", this.DriverSize);
        this.setParamSimple(map, prefix + "ExecutorSize", this.ExecutorSize);
        this.setParamSimple(map, prefix + "ExecutorNumbers", this.ExecutorNumbers);
        this.setParamSimple(map, prefix + "IsInherit", this.IsInherit);

    }
}

