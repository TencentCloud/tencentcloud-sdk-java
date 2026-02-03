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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckItem extends AbstractModel {

    /**
    * 校验项名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Item")
    @Expose
    private String Item;

    /**
    * 该项的校验结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 校验不通过的详细说明和修改建议
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurrentValue")
    @Expose
    private String CurrentValue;

    /**
    * 校验不通过的详细说明和修改建议
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpectedValue")
    @Expose
    private String ExpectedValue;

    /**
     * Get 校验项名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Item 校验项名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getItem() {
        return this.Item;
    }

    /**
     * Set 校验项名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Item 校验项名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItem(String Item) {
        this.Item = Item;
    }

    /**
     * Get 该项的校验结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Result 该项的校验结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 该项的校验结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param Result 该项的校验结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get 校验不通过的详细说明和修改建议
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurrentValue 校验不通过的详细说明和修改建议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCurrentValue() {
        return this.CurrentValue;
    }

    /**
     * Set 校验不通过的详细说明和修改建议
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurrentValue 校验不通过的详细说明和修改建议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurrentValue(String CurrentValue) {
        this.CurrentValue = CurrentValue;
    }

    /**
     * Get 校验不通过的详细说明和修改建议
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpectedValue 校验不通过的详细说明和修改建议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpectedValue() {
        return this.ExpectedValue;
    }

    /**
     * Set 校验不通过的详细说明和修改建议
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpectedValue 校验不通过的详细说明和修改建议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpectedValue(String ExpectedValue) {
        this.ExpectedValue = ExpectedValue;
    }

    public CheckItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckItem(CheckItem source) {
        if (source.Item != null) {
            this.Item = new String(source.Item);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.CurrentValue != null) {
            this.CurrentValue = new String(source.CurrentValue);
        }
        if (source.ExpectedValue != null) {
            this.ExpectedValue = new String(source.ExpectedValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Item", this.Item);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "CurrentValue", this.CurrentValue);
        this.setParamSimple(map, prefix + "ExpectedValue", this.ExpectedValue);

    }
}

