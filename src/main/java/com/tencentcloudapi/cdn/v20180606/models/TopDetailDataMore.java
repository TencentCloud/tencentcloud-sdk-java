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

public class TopDetailDataMore extends AbstractModel{

    /**
    * 数据类型的名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 数据值
    */
    @SerializedName("Value")
    @Expose
    private Float Value;

    /**
    * 数据值在总值中的百分比
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Percent")
    @Expose
    private Float Percent;

    /**
     * Get 数据类型的名称 
     * @return Name 数据类型的名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 数据类型的名称
     * @param Name 数据类型的名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 数据值 
     * @return Value 数据值
     */
    public Float getValue() {
        return this.Value;
    }

    /**
     * Set 数据值
     * @param Value 数据值
     */
    public void setValue(Float Value) {
        this.Value = Value;
    }

    /**
     * Get 数据值在总值中的百分比
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Percent 数据值在总值中的百分比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getPercent() {
        return this.Percent;
    }

    /**
     * Set 数据值在总值中的百分比
注意：此字段可能返回 null，表示取不到有效值。
     * @param Percent 数据值在总值中的百分比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPercent(Float Percent) {
        this.Percent = Percent;
    }

    public TopDetailDataMore() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopDetailDataMore(TopDetailDataMore source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Value != null) {
            this.Value = new Float(source.Value);
        }
        if (source.Percent != null) {
            this.Percent = new Float(source.Percent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Percent", this.Percent);

    }
}

