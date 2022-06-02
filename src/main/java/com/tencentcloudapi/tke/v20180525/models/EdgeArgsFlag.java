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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EdgeArgsFlag extends AbstractModel{

    /**
    * 参数名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 参数类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 参数描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Usage")
    @Expose
    private String Usage;

    /**
    * 参数默认值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Default")
    @Expose
    private String Default;

    /**
    * 参数可选范围（目前包含range和in两种，"[]"代表range，如"[1, 5]"表示参数必须>=1且 <=5, "()"代表in， 如"('aa', 'bb')"表示参数只能为字符串'aa'或者'bb'，该参数为空表示不校验）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Constraint")
    @Expose
    private String Constraint;

    /**
     * Get 参数名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 参数名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 参数名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 参数名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 参数类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 参数类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 参数类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 参数类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 参数描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Usage 参数描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUsage() {
        return this.Usage;
    }

    /**
     * Set 参数描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Usage 参数描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsage(String Usage) {
        this.Usage = Usage;
    }

    /**
     * Get 参数默认值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Default 参数默认值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDefault() {
        return this.Default;
    }

    /**
     * Set 参数默认值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Default 参数默认值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefault(String Default) {
        this.Default = Default;
    }

    /**
     * Get 参数可选范围（目前包含range和in两种，"[]"代表range，如"[1, 5]"表示参数必须>=1且 <=5, "()"代表in， 如"('aa', 'bb')"表示参数只能为字符串'aa'或者'bb'，该参数为空表示不校验）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Constraint 参数可选范围（目前包含range和in两种，"[]"代表range，如"[1, 5]"表示参数必须>=1且 <=5, "()"代表in， 如"('aa', 'bb')"表示参数只能为字符串'aa'或者'bb'，该参数为空表示不校验）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConstraint() {
        return this.Constraint;
    }

    /**
     * Set 参数可选范围（目前包含range和in两种，"[]"代表range，如"[1, 5]"表示参数必须>=1且 <=5, "()"代表in， 如"('aa', 'bb')"表示参数只能为字符串'aa'或者'bb'，该参数为空表示不校验）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Constraint 参数可选范围（目前包含range和in两种，"[]"代表range，如"[1, 5]"表示参数必须>=1且 <=5, "()"代表in， 如"('aa', 'bb')"表示参数只能为字符串'aa'或者'bb'，该参数为空表示不校验）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConstraint(String Constraint) {
        this.Constraint = Constraint;
    }

    public EdgeArgsFlag() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EdgeArgsFlag(EdgeArgsFlag source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Usage != null) {
            this.Usage = new String(source.Usage);
        }
        if (source.Default != null) {
            this.Default = new String(source.Default);
        }
        if (source.Constraint != null) {
            this.Constraint = new String(source.Constraint);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Usage", this.Usage);
        this.setParamSimple(map, prefix + "Default", this.Default);
        this.setParamSimple(map, prefix + "Constraint", this.Constraint);

    }
}

