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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomRequestToAdd extends AbstractModel{

    /**
    * Header名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Header值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Header类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppendAction")
    @Expose
    private String AppendAction;

    /**
     * Get Header名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Key Header名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Header名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Key Header名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Header值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value Header值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Header值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value Header值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Header类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppendAction Header类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppendAction() {
        return this.AppendAction;
    }

    /**
     * Set Header类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppendAction Header类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppendAction(String AppendAction) {
        this.AppendAction = AppendAction;
    }

    public CustomRequestToAdd() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomRequestToAdd(CustomRequestToAdd source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.AppendAction != null) {
            this.AppendAction = new String(source.AppendAction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "AppendAction", this.AppendAction);

    }
}

