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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParamItemInfo extends AbstractModel {

    /**
    * 参数名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamName")
    @Expose
    private String ParamName;

    /**
    * 参数新值

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NewValue")
    @Expose
    private String NewValue;

    /**
    * 参数旧值

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OldValue")
    @Expose
    private String OldValue;

    /**
    * 参数公式

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValueFunction")
    @Expose
    private String ValueFunction;

    /**
     * Get 参数名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamName 参数名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParamName() {
        return this.ParamName;
    }

    /**
     * Set 参数名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamName 参数名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamName(String ParamName) {
        this.ParamName = ParamName;
    }

    /**
     * Get 参数新值

注意：此字段可能返回 null，表示取不到有效值。 
     * @return NewValue 参数新值

注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNewValue() {
        return this.NewValue;
    }

    /**
     * Set 参数新值

注意：此字段可能返回 null，表示取不到有效值。
     * @param NewValue 参数新值

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNewValue(String NewValue) {
        this.NewValue = NewValue;
    }

    /**
     * Get 参数旧值

注意：此字段可能返回 null，表示取不到有效值。 
     * @return OldValue 参数旧值

注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOldValue() {
        return this.OldValue;
    }

    /**
     * Set 参数旧值

注意：此字段可能返回 null，表示取不到有效值。
     * @param OldValue 参数旧值

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOldValue(String OldValue) {
        this.OldValue = OldValue;
    }

    /**
     * Get 参数公式

注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValueFunction 参数公式

注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValueFunction() {
        return this.ValueFunction;
    }

    /**
     * Set 参数公式

注意：此字段可能返回 null，表示取不到有效值。
     * @param ValueFunction 参数公式

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValueFunction(String ValueFunction) {
        this.ValueFunction = ValueFunction;
    }

    public ParamItemInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParamItemInfo(ParamItemInfo source) {
        if (source.ParamName != null) {
            this.ParamName = new String(source.ParamName);
        }
        if (source.NewValue != null) {
            this.NewValue = new String(source.NewValue);
        }
        if (source.OldValue != null) {
            this.OldValue = new String(source.OldValue);
        }
        if (source.ValueFunction != null) {
            this.ValueFunction = new String(source.ValueFunction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParamName", this.ParamName);
        this.setParamSimple(map, prefix + "NewValue", this.NewValue);
        this.setParamSimple(map, prefix + "OldValue", this.OldValue);
        this.setParamSimple(map, prefix + "ValueFunction", this.ValueFunction);

    }
}

