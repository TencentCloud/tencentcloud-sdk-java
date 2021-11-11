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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParamInfo extends AbstractModel{

    /**
    * 参数ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 参数名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 参数值类型：integer（整型）、real（浮点型）、bool（布尔型）、enum（枚举类型）、mutil_enum（枚举类型、支持多选）。
当参数类型为integer（整型）、real（浮点型）时，参数的取值范围根据返回值的Max、Min确定； 
当参数类型为bool（布尔型）时，参数设置值取值范围是true | false； 
当参数类型为enum（枚举类型）、mutil_enum（多枚举类型）时，参数的取值范围由返回值中的EnumValue确定。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamValueType")
    @Expose
    private String ParamValueType;

    /**
    * 参数值 单位。参数没有单位是，该字段返回空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * 参数默认值。以字符串形式返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * 参数当前运行值。以字符串形式返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurrentValue")
    @Expose
    private String CurrentValue;

    /**
    * 枚举类型参数，取值范围
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnumValue")
    @Expose
    private String [] EnumValue;

    /**
    * 数值类型（integer、real）参数，取值下界
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Max")
    @Expose
    private Float Max;

    /**
    * 数值类型（integer、real）参数，取值上界
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Min")
    @Expose
    private Float Min;

    /**
    * 参数中文描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamDescriptionCH")
    @Expose
    private String ParamDescriptionCH;

    /**
    * 参数英文描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamDescriptionEN")
    @Expose
    private String ParamDescriptionEN;

    /**
    * 参数修改，是否重启生效。（true为需要，false为不需要）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NeedReboot")
    @Expose
    private Boolean NeedReboot;

    /**
    * 参数中文分类
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClassificationCN")
    @Expose
    private String ClassificationCN;

    /**
    * 参数英文分类
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClassificationEN")
    @Expose
    private String ClassificationEN;

    /**
    * 是否和规格相关。（true为相关，false为不想关）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpecRelated")
    @Expose
    private Boolean SpecRelated;

    /**
    * 是否为重点参数。（true为重点参数，修改是需要重点关注，可能会影响实例性能）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Advanced")
    @Expose
    private Boolean Advanced;

    /**
    * 参数最后一次修改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastModifyTime")
    @Expose
    private String LastModifyTime;

    /**
     * Get 参数ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ID 参数ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 参数ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ID 参数ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

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
     * Get 参数值类型：integer（整型）、real（浮点型）、bool（布尔型）、enum（枚举类型）、mutil_enum（枚举类型、支持多选）。
当参数类型为integer（整型）、real（浮点型）时，参数的取值范围根据返回值的Max、Min确定； 
当参数类型为bool（布尔型）时，参数设置值取值范围是true | false； 
当参数类型为enum（枚举类型）、mutil_enum（多枚举类型）时，参数的取值范围由返回值中的EnumValue确定。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamValueType 参数值类型：integer（整型）、real（浮点型）、bool（布尔型）、enum（枚举类型）、mutil_enum（枚举类型、支持多选）。
当参数类型为integer（整型）、real（浮点型）时，参数的取值范围根据返回值的Max、Min确定； 
当参数类型为bool（布尔型）时，参数设置值取值范围是true | false； 
当参数类型为enum（枚举类型）、mutil_enum（多枚举类型）时，参数的取值范围由返回值中的EnumValue确定。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParamValueType() {
        return this.ParamValueType;
    }

    /**
     * Set 参数值类型：integer（整型）、real（浮点型）、bool（布尔型）、enum（枚举类型）、mutil_enum（枚举类型、支持多选）。
当参数类型为integer（整型）、real（浮点型）时，参数的取值范围根据返回值的Max、Min确定； 
当参数类型为bool（布尔型）时，参数设置值取值范围是true | false； 
当参数类型为enum（枚举类型）、mutil_enum（多枚举类型）时，参数的取值范围由返回值中的EnumValue确定。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamValueType 参数值类型：integer（整型）、real（浮点型）、bool（布尔型）、enum（枚举类型）、mutil_enum（枚举类型、支持多选）。
当参数类型为integer（整型）、real（浮点型）时，参数的取值范围根据返回值的Max、Min确定； 
当参数类型为bool（布尔型）时，参数设置值取值范围是true | false； 
当参数类型为enum（枚举类型）、mutil_enum（多枚举类型）时，参数的取值范围由返回值中的EnumValue确定。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamValueType(String ParamValueType) {
        this.ParamValueType = ParamValueType;
    }

    /**
     * Get 参数值 单位。参数没有单位是，该字段返回空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Unit 参数值 单位。参数没有单位是，该字段返回空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set 参数值 单位。参数没有单位是，该字段返回空
注意：此字段可能返回 null，表示取不到有效值。
     * @param Unit 参数值 单位。参数没有单位是，该字段返回空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get 参数默认值。以字符串形式返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultValue 参数默认值。以字符串形式返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set 参数默认值。以字符串形式返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultValue 参数默认值。以字符串形式返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    /**
     * Get 参数当前运行值。以字符串形式返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurrentValue 参数当前运行值。以字符串形式返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCurrentValue() {
        return this.CurrentValue;
    }

    /**
     * Set 参数当前运行值。以字符串形式返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurrentValue 参数当前运行值。以字符串形式返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurrentValue(String CurrentValue) {
        this.CurrentValue = CurrentValue;
    }

    /**
     * Get 枚举类型参数，取值范围
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnumValue 枚举类型参数，取值范围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getEnumValue() {
        return this.EnumValue;
    }

    /**
     * Set 枚举类型参数，取值范围
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnumValue 枚举类型参数，取值范围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnumValue(String [] EnumValue) {
        this.EnumValue = EnumValue;
    }

    /**
     * Get 数值类型（integer、real）参数，取值下界
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Max 数值类型（integer、real）参数，取值下界
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getMax() {
        return this.Max;
    }

    /**
     * Set 数值类型（integer、real）参数，取值下界
注意：此字段可能返回 null，表示取不到有效值。
     * @param Max 数值类型（integer、real）参数，取值下界
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMax(Float Max) {
        this.Max = Max;
    }

    /**
     * Get 数值类型（integer、real）参数，取值上界
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Min 数值类型（integer、real）参数，取值上界
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getMin() {
        return this.Min;
    }

    /**
     * Set 数值类型（integer、real）参数，取值上界
注意：此字段可能返回 null，表示取不到有效值。
     * @param Min 数值类型（integer、real）参数，取值上界
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMin(Float Min) {
        this.Min = Min;
    }

    /**
     * Get 参数中文描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamDescriptionCH 参数中文描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParamDescriptionCH() {
        return this.ParamDescriptionCH;
    }

    /**
     * Set 参数中文描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamDescriptionCH 参数中文描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamDescriptionCH(String ParamDescriptionCH) {
        this.ParamDescriptionCH = ParamDescriptionCH;
    }

    /**
     * Get 参数英文描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamDescriptionEN 参数英文描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParamDescriptionEN() {
        return this.ParamDescriptionEN;
    }

    /**
     * Set 参数英文描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamDescriptionEN 参数英文描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamDescriptionEN(String ParamDescriptionEN) {
        this.ParamDescriptionEN = ParamDescriptionEN;
    }

    /**
     * Get 参数修改，是否重启生效。（true为需要，false为不需要）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NeedReboot 参数修改，是否重启生效。（true为需要，false为不需要）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getNeedReboot() {
        return this.NeedReboot;
    }

    /**
     * Set 参数修改，是否重启生效。（true为需要，false为不需要）
注意：此字段可能返回 null，表示取不到有效值。
     * @param NeedReboot 参数修改，是否重启生效。（true为需要，false为不需要）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNeedReboot(Boolean NeedReboot) {
        this.NeedReboot = NeedReboot;
    }

    /**
     * Get 参数中文分类
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClassificationCN 参数中文分类
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClassificationCN() {
        return this.ClassificationCN;
    }

    /**
     * Set 参数中文分类
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClassificationCN 参数中文分类
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClassificationCN(String ClassificationCN) {
        this.ClassificationCN = ClassificationCN;
    }

    /**
     * Get 参数英文分类
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClassificationEN 参数英文分类
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClassificationEN() {
        return this.ClassificationEN;
    }

    /**
     * Set 参数英文分类
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClassificationEN 参数英文分类
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClassificationEN(String ClassificationEN) {
        this.ClassificationEN = ClassificationEN;
    }

    /**
     * Get 是否和规格相关。（true为相关，false为不想关）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpecRelated 是否和规格相关。（true为相关，false为不想关）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSpecRelated() {
        return this.SpecRelated;
    }

    /**
     * Set 是否和规格相关。（true为相关，false为不想关）
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpecRelated 是否和规格相关。（true为相关，false为不想关）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpecRelated(Boolean SpecRelated) {
        this.SpecRelated = SpecRelated;
    }

    /**
     * Get 是否为重点参数。（true为重点参数，修改是需要重点关注，可能会影响实例性能）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Advanced 是否为重点参数。（true为重点参数，修改是需要重点关注，可能会影响实例性能）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAdvanced() {
        return this.Advanced;
    }

    /**
     * Set 是否为重点参数。（true为重点参数，修改是需要重点关注，可能会影响实例性能）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Advanced 是否为重点参数。（true为重点参数，修改是需要重点关注，可能会影响实例性能）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdvanced(Boolean Advanced) {
        this.Advanced = Advanced;
    }

    /**
     * Get 参数最后一次修改时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastModifyTime 参数最后一次修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastModifyTime() {
        return this.LastModifyTime;
    }

    /**
     * Set 参数最后一次修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastModifyTime 参数最后一次修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastModifyTime(String LastModifyTime) {
        this.LastModifyTime = LastModifyTime;
    }

    public ParamInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParamInfo(ParamInfo source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ParamValueType != null) {
            this.ParamValueType = new String(source.ParamValueType);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.DefaultValue != null) {
            this.DefaultValue = new String(source.DefaultValue);
        }
        if (source.CurrentValue != null) {
            this.CurrentValue = new String(source.CurrentValue);
        }
        if (source.EnumValue != null) {
            this.EnumValue = new String[source.EnumValue.length];
            for (int i = 0; i < source.EnumValue.length; i++) {
                this.EnumValue[i] = new String(source.EnumValue[i]);
            }
        }
        if (source.Max != null) {
            this.Max = new Float(source.Max);
        }
        if (source.Min != null) {
            this.Min = new Float(source.Min);
        }
        if (source.ParamDescriptionCH != null) {
            this.ParamDescriptionCH = new String(source.ParamDescriptionCH);
        }
        if (source.ParamDescriptionEN != null) {
            this.ParamDescriptionEN = new String(source.ParamDescriptionEN);
        }
        if (source.NeedReboot != null) {
            this.NeedReboot = new Boolean(source.NeedReboot);
        }
        if (source.ClassificationCN != null) {
            this.ClassificationCN = new String(source.ClassificationCN);
        }
        if (source.ClassificationEN != null) {
            this.ClassificationEN = new String(source.ClassificationEN);
        }
        if (source.SpecRelated != null) {
            this.SpecRelated = new Boolean(source.SpecRelated);
        }
        if (source.Advanced != null) {
            this.Advanced = new Boolean(source.Advanced);
        }
        if (source.LastModifyTime != null) {
            this.LastModifyTime = new String(source.LastModifyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ParamValueType", this.ParamValueType);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);
        this.setParamSimple(map, prefix + "CurrentValue", this.CurrentValue);
        this.setParamArraySimple(map, prefix + "EnumValue.", this.EnumValue);
        this.setParamSimple(map, prefix + "Max", this.Max);
        this.setParamSimple(map, prefix + "Min", this.Min);
        this.setParamSimple(map, prefix + "ParamDescriptionCH", this.ParamDescriptionCH);
        this.setParamSimple(map, prefix + "ParamDescriptionEN", this.ParamDescriptionEN);
        this.setParamSimple(map, prefix + "NeedReboot", this.NeedReboot);
        this.setParamSimple(map, prefix + "ClassificationCN", this.ClassificationCN);
        this.setParamSimple(map, prefix + "ClassificationEN", this.ClassificationEN);
        this.setParamSimple(map, prefix + "SpecRelated", this.SpecRelated);
        this.setParamSimple(map, prefix + "Advanced", this.Advanced);
        this.setParamSimple(map, prefix + "LastModifyTime", this.LastModifyTime);

    }
}

