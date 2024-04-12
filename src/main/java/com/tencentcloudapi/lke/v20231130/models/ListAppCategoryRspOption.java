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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListAppCategoryRspOption extends AbstractModel {

    /**
    * 类型名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 类型值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 类型log
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Logo")
    @Expose
    private String Logo;

    /**
     * Get 类型名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Text 类型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 类型名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Text 类型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 类型值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value 类型值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 类型值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value 类型值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 类型log
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Logo 类型log
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogo() {
        return this.Logo;
    }

    /**
     * Set 类型log
注意：此字段可能返回 null，表示取不到有效值。
     * @param Logo 类型log
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogo(String Logo) {
        this.Logo = Logo;
    }

    public ListAppCategoryRspOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListAppCategoryRspOption(ListAppCategoryRspOption source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Logo != null) {
            this.Logo = new String(source.Logo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Logo", this.Logo);

    }
}

