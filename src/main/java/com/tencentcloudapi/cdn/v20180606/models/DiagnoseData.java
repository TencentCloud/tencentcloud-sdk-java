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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiagnoseData extends AbstractModel{

    /**
    * 诊断报告内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Data")
    @Expose
    private DiagnoseUnit [] Data;

    /**
    * 当前诊断项是否正常。
"ok"：正常
"error"：异常
"warning"："警告"
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 诊断报告内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Data 诊断报告内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiagnoseUnit [] getData() {
        return this.Data;
    }

    /**
     * Set 诊断报告内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Data 诊断报告内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setData(DiagnoseUnit [] Data) {
        this.Data = Data;
    }

    /**
     * Get 当前诊断项是否正常。
"ok"：正常
"error"：异常
"warning"："警告"
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 当前诊断项是否正常。
"ok"：正常
"error"：异常
"warning"："警告"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 当前诊断项是否正常。
"ok"：正常
"error"：异常
"warning"："警告"
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 当前诊断项是否正常。
"ok"：正常
"error"：异常
"warning"："警告"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public DiagnoseData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiagnoseData(DiagnoseData source) {
        if (source.Data != null) {
            this.Data = new DiagnoseUnit[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new DiagnoseUnit(source.Data[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

