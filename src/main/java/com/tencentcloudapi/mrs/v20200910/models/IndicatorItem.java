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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IndicatorItem extends AbstractModel{

    /**
    * “”
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * “”
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Scode")
    @Expose
    private String Scode;

    /**
    * “”
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * “”
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Sname")
    @Expose
    private String Sname;

    /**
    * “”
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * “”
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * “”
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Range")
    @Expose
    private String Range;

    /**
    * “”
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Arrow")
    @Expose
    private String Arrow;

    /**
    * 是否正常
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Normal")
    @Expose
    private Boolean Normal;

    /**
     * Get “”
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Code “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set “”
注意：此字段可能返回 null，表示取不到有效值。
     * @param Code “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get “”
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Scode “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScode() {
        return this.Scode;
    }

    /**
     * Set “”
注意：此字段可能返回 null，表示取不到有效值。
     * @param Scode “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScode(String Scode) {
        this.Scode = Scode;
    }

    /**
     * Get “”
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set “”
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get “”
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Sname “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSname() {
        return this.Sname;
    }

    /**
     * Set “”
注意：此字段可能返回 null，表示取不到有效值。
     * @param Sname “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSname(String Sname) {
        this.Sname = Sname;
    }

    /**
     * Get “”
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Result “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set “”
注意：此字段可能返回 null，表示取不到有效值。
     * @param Result “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get “”
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Unit “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set “”
注意：此字段可能返回 null，表示取不到有效值。
     * @param Unit “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get “”
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Range “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRange() {
        return this.Range;
    }

    /**
     * Set “”
注意：此字段可能返回 null，表示取不到有效值。
     * @param Range “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRange(String Range) {
        this.Range = Range;
    }

    /**
     * Get “”
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Arrow “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getArrow() {
        return this.Arrow;
    }

    /**
     * Set “”
注意：此字段可能返回 null，表示取不到有效值。
     * @param Arrow “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setArrow(String Arrow) {
        this.Arrow = Arrow;
    }

    /**
     * Get 是否正常
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Normal 是否正常
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getNormal() {
        return this.Normal;
    }

    /**
     * Set 是否正常
注意：此字段可能返回 null，表示取不到有效值。
     * @param Normal 是否正常
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNormal(Boolean Normal) {
        this.Normal = Normal;
    }

    public IndicatorItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IndicatorItem(IndicatorItem source) {
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Scode != null) {
            this.Scode = new String(source.Scode);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Sname != null) {
            this.Sname = new String(source.Sname);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.Range != null) {
            this.Range = new String(source.Range);
        }
        if (source.Arrow != null) {
            this.Arrow = new String(source.Arrow);
        }
        if (source.Normal != null) {
            this.Normal = new Boolean(source.Normal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Scode", this.Scode);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Sname", this.Sname);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "Range", this.Range);
        this.setParamSimple(map, prefix + "Arrow", this.Arrow);
        this.setParamSimple(map, prefix + "Normal", this.Normal);

    }
}

