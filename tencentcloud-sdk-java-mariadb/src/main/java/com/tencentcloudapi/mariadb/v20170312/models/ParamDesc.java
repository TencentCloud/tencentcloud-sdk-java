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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParamDesc extends AbstractModel{

    /**
    * 参数名字
    */
    @SerializedName("Param")
    @Expose
    private String Param;

    /**
    * 当前参数值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 设置过的值，参数生效后，该值和value一样。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SetValue")
    @Expose
    private String SetValue;

    /**
    * 系统默认值
    */
    @SerializedName("Default")
    @Expose
    private String Default;

    /**
    * 参数限制
    */
    @SerializedName("Constraint")
    @Expose
    private ParamConstraint Constraint;

    /**
    * 是否有设置过值，false:没有设置过值，true:有设置过值。
    */
    @SerializedName("HaveSetValue")
    @Expose
    private Boolean HaveSetValue;

    /**
     * Get 参数名字 
     * @return Param 参数名字
     */
    public String getParam() {
        return this.Param;
    }

    /**
     * Set 参数名字
     * @param Param 参数名字
     */
    public void setParam(String Param) {
        this.Param = Param;
    }

    /**
     * Get 当前参数值 
     * @return Value 当前参数值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 当前参数值
     * @param Value 当前参数值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 设置过的值，参数生效后，该值和value一样。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SetValue 设置过的值，参数生效后，该值和value一样。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSetValue() {
        return this.SetValue;
    }

    /**
     * Set 设置过的值，参数生效后，该值和value一样。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SetValue 设置过的值，参数生效后，该值和value一样。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSetValue(String SetValue) {
        this.SetValue = SetValue;
    }

    /**
     * Get 系统默认值 
     * @return Default 系统默认值
     */
    public String getDefault() {
        return this.Default;
    }

    /**
     * Set 系统默认值
     * @param Default 系统默认值
     */
    public void setDefault(String Default) {
        this.Default = Default;
    }

    /**
     * Get 参数限制 
     * @return Constraint 参数限制
     */
    public ParamConstraint getConstraint() {
        return this.Constraint;
    }

    /**
     * Set 参数限制
     * @param Constraint 参数限制
     */
    public void setConstraint(ParamConstraint Constraint) {
        this.Constraint = Constraint;
    }

    /**
     * Get 是否有设置过值，false:没有设置过值，true:有设置过值。 
     * @return HaveSetValue 是否有设置过值，false:没有设置过值，true:有设置过值。
     */
    public Boolean getHaveSetValue() {
        return this.HaveSetValue;
    }

    /**
     * Set 是否有设置过值，false:没有设置过值，true:有设置过值。
     * @param HaveSetValue 是否有设置过值，false:没有设置过值，true:有设置过值。
     */
    public void setHaveSetValue(Boolean HaveSetValue) {
        this.HaveSetValue = HaveSetValue;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Param", this.Param);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "SetValue", this.SetValue);
        this.setParamSimple(map, prefix + "Default", this.Default);
        this.setParamObj(map, prefix + "Constraint.", this.Constraint);
        this.setParamSimple(map, prefix + "HaveSetValue", this.HaveSetValue);

    }
}

