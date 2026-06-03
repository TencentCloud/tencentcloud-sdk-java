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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TableField extends AbstractModel {

    /**
    * db里的字段column名
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * bi展示名
    */
    @SerializedName("AliasName")
    @Expose
    private String AliasName;

    /**
    * db里的字段类型
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * BI归类后的抽象字段类型,比如字符串,数字,时间
    */
    @SerializedName("FieldType")
    @Expose
    private String FieldType;

    /**
    * 字段组合计算公式后生成的复杂明细类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FieldComplexType")
    @Expose
    private String FieldComplexType;

    /**
    * 字段描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Mark")
    @Expose
    private String Mark;

    /**
    * 字段计算公式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FormatRule")
    @Expose
    private String FormatRule;

    /**
    * 数据字段是否过滤空值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsFilter")
    @Expose
    private Boolean IsFilter;

    /**
    * 计算字段类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CalcType")
    @Expose
    private String CalcType;

    /**
    * 计算字段的公式内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CalcFormula")
    @Expose
    private String CalcFormula;

    /**
    * 计算字段的中文公式内容, 前端展示使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CalcDesc")
    @Expose
    private String CalcDesc;

    /**
    * 关联字典表id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DictId")
    @Expose
    private Long DictId;

    /**
    * 关联字典表名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DictName")
    @Expose
    private String DictName;

    /**
    * 非必填, 多表关联新增字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableNodeId")
    @Expose
    private String TableNodeId;

    /**
    * excel
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExcelName")
    @Expose
    private String ExcelName;

    /**
    * 非必填,多表关联新增字段,字段所属的表名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * api数据源路径名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JsonPathName")
    @Expose
    private String JsonPathName;

    /**
    * 地理字段标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Granularity")
    @Expose
    private String Granularity;

    /**
    * 地图id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GeoJsonId")
    @Expose
    private Long GeoJsonId;

    /**
    * 空值展示样式配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EmptyValueConfig")
    @Expose
    private EmptyValueConfig EmptyValueConfig;

    /**
    * 原列名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DbFieldName")
    @Expose
    private String DbFieldName;

    /**
    * 是否是复制字段操作
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsCopyOperation")
    @Expose
    private Boolean IsCopyOperation;

    /**
    * 是否从普通字段复制
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsCopyFromNormal")
    @Expose
    private Boolean IsCopyFromNormal;

    /**
     * Get db里的字段column名 
     * @return DbName db里的字段column名
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set db里的字段column名
     * @param DbName db里的字段column名
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get bi展示名 
     * @return AliasName bi展示名
     */
    public String getAliasName() {
        return this.AliasName;
    }

    /**
     * Set bi展示名
     * @param AliasName bi展示名
     */
    public void setAliasName(String AliasName) {
        this.AliasName = AliasName;
    }

    /**
     * Get db里的字段类型 
     * @return DbType db里的字段类型
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set db里的字段类型
     * @param DbType db里的字段类型
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get BI归类后的抽象字段类型,比如字符串,数字,时间 
     * @return FieldType BI归类后的抽象字段类型,比如字符串,数字,时间
     */
    public String getFieldType() {
        return this.FieldType;
    }

    /**
     * Set BI归类后的抽象字段类型,比如字符串,数字,时间
     * @param FieldType BI归类后的抽象字段类型,比如字符串,数字,时间
     */
    public void setFieldType(String FieldType) {
        this.FieldType = FieldType;
    }

    /**
     * Get 字段组合计算公式后生成的复杂明细类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FieldComplexType 字段组合计算公式后生成的复杂明细类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFieldComplexType() {
        return this.FieldComplexType;
    }

    /**
     * Set 字段组合计算公式后生成的复杂明细类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param FieldComplexType 字段组合计算公式后生成的复杂明细类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFieldComplexType(String FieldComplexType) {
        this.FieldComplexType = FieldComplexType;
    }

    /**
     * Get 字段描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Mark 字段描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMark() {
        return this.Mark;
    }

    /**
     * Set 字段描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Mark 字段描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMark(String Mark) {
        this.Mark = Mark;
    }

    /**
     * Get 字段计算公式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FormatRule 字段计算公式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFormatRule() {
        return this.FormatRule;
    }

    /**
     * Set 字段计算公式
注意：此字段可能返回 null，表示取不到有效值。
     * @param FormatRule 字段计算公式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFormatRule(String FormatRule) {
        this.FormatRule = FormatRule;
    }

    /**
     * Get 数据字段是否过滤空值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsFilter 数据字段是否过滤空值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsFilter() {
        return this.IsFilter;
    }

    /**
     * Set 数据字段是否过滤空值
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsFilter 数据字段是否过滤空值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsFilter(Boolean IsFilter) {
        this.IsFilter = IsFilter;
    }

    /**
     * Get 计算字段类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CalcType 计算字段类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCalcType() {
        return this.CalcType;
    }

    /**
     * Set 计算字段类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param CalcType 计算字段类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCalcType(String CalcType) {
        this.CalcType = CalcType;
    }

    /**
     * Get 计算字段的公式内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CalcFormula 计算字段的公式内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCalcFormula() {
        return this.CalcFormula;
    }

    /**
     * Set 计算字段的公式内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param CalcFormula 计算字段的公式内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCalcFormula(String CalcFormula) {
        this.CalcFormula = CalcFormula;
    }

    /**
     * Get 计算字段的中文公式内容, 前端展示使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CalcDesc 计算字段的中文公式内容, 前端展示使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCalcDesc() {
        return this.CalcDesc;
    }

    /**
     * Set 计算字段的中文公式内容, 前端展示使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param CalcDesc 计算字段的中文公式内容, 前端展示使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCalcDesc(String CalcDesc) {
        this.CalcDesc = CalcDesc;
    }

    /**
     * Get 关联字典表id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DictId 关联字典表id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDictId() {
        return this.DictId;
    }

    /**
     * Set 关联字典表id
注意：此字段可能返回 null，表示取不到有效值。
     * @param DictId 关联字典表id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDictId(Long DictId) {
        this.DictId = DictId;
    }

    /**
     * Get 关联字典表名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DictName 关联字典表名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDictName() {
        return this.DictName;
    }

    /**
     * Set 关联字典表名
注意：此字段可能返回 null，表示取不到有效值。
     * @param DictName 关联字典表名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDictName(String DictName) {
        this.DictName = DictName;
    }

    /**
     * Get 非必填, 多表关联新增字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableNodeId 非必填, 多表关联新增字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableNodeId() {
        return this.TableNodeId;
    }

    /**
     * Set 非必填, 多表关联新增字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableNodeId 非必填, 多表关联新增字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableNodeId(String TableNodeId) {
        this.TableNodeId = TableNodeId;
    }

    /**
     * Get excel
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExcelName excel
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExcelName() {
        return this.ExcelName;
    }

    /**
     * Set excel
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExcelName excel
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExcelName(String ExcelName) {
        this.ExcelName = ExcelName;
    }

    /**
     * Get 非必填,多表关联新增字段,字段所属的表名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableName 非必填,多表关联新增字段,字段所属的表名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 非必填,多表关联新增字段,字段所属的表名
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableName 非必填,多表关联新增字段,字段所属的表名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get api数据源路径名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JsonPathName api数据源路径名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJsonPathName() {
        return this.JsonPathName;
    }

    /**
     * Set api数据源路径名
注意：此字段可能返回 null，表示取不到有效值。
     * @param JsonPathName api数据源路径名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJsonPathName(String JsonPathName) {
        this.JsonPathName = JsonPathName;
    }

    /**
     * Get 地理字段标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Granularity 地理字段标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGranularity() {
        return this.Granularity;
    }

    /**
     * Set 地理字段标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param Granularity 地理字段标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGranularity(String Granularity) {
        this.Granularity = Granularity;
    }

    /**
     * Get 地图id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GeoJsonId 地图id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGeoJsonId() {
        return this.GeoJsonId;
    }

    /**
     * Set 地图id
注意：此字段可能返回 null，表示取不到有效值。
     * @param GeoJsonId 地图id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGeoJsonId(Long GeoJsonId) {
        this.GeoJsonId = GeoJsonId;
    }

    /**
     * Get 空值展示样式配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EmptyValueConfig 空值展示样式配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EmptyValueConfig getEmptyValueConfig() {
        return this.EmptyValueConfig;
    }

    /**
     * Set 空值展示样式配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param EmptyValueConfig 空值展示样式配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEmptyValueConfig(EmptyValueConfig EmptyValueConfig) {
        this.EmptyValueConfig = EmptyValueConfig;
    }

    /**
     * Get 原列名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DbFieldName 原列名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDbFieldName() {
        return this.DbFieldName;
    }

    /**
     * Set 原列名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DbFieldName 原列名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDbFieldName(String DbFieldName) {
        this.DbFieldName = DbFieldName;
    }

    /**
     * Get 是否是复制字段操作
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsCopyOperation 是否是复制字段操作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsCopyOperation() {
        return this.IsCopyOperation;
    }

    /**
     * Set 是否是复制字段操作
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsCopyOperation 是否是复制字段操作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsCopyOperation(Boolean IsCopyOperation) {
        this.IsCopyOperation = IsCopyOperation;
    }

    /**
     * Get 是否从普通字段复制
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsCopyFromNormal 是否从普通字段复制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsCopyFromNormal() {
        return this.IsCopyFromNormal;
    }

    /**
     * Set 是否从普通字段复制
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsCopyFromNormal 是否从普通字段复制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsCopyFromNormal(Boolean IsCopyFromNormal) {
        this.IsCopyFromNormal = IsCopyFromNormal;
    }

    public TableField() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableField(TableField source) {
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.AliasName != null) {
            this.AliasName = new String(source.AliasName);
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
        if (source.FieldType != null) {
            this.FieldType = new String(source.FieldType);
        }
        if (source.FieldComplexType != null) {
            this.FieldComplexType = new String(source.FieldComplexType);
        }
        if (source.Mark != null) {
            this.Mark = new String(source.Mark);
        }
        if (source.FormatRule != null) {
            this.FormatRule = new String(source.FormatRule);
        }
        if (source.IsFilter != null) {
            this.IsFilter = new Boolean(source.IsFilter);
        }
        if (source.CalcType != null) {
            this.CalcType = new String(source.CalcType);
        }
        if (source.CalcFormula != null) {
            this.CalcFormula = new String(source.CalcFormula);
        }
        if (source.CalcDesc != null) {
            this.CalcDesc = new String(source.CalcDesc);
        }
        if (source.DictId != null) {
            this.DictId = new Long(source.DictId);
        }
        if (source.DictName != null) {
            this.DictName = new String(source.DictName);
        }
        if (source.TableNodeId != null) {
            this.TableNodeId = new String(source.TableNodeId);
        }
        if (source.ExcelName != null) {
            this.ExcelName = new String(source.ExcelName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.JsonPathName != null) {
            this.JsonPathName = new String(source.JsonPathName);
        }
        if (source.Granularity != null) {
            this.Granularity = new String(source.Granularity);
        }
        if (source.GeoJsonId != null) {
            this.GeoJsonId = new Long(source.GeoJsonId);
        }
        if (source.EmptyValueConfig != null) {
            this.EmptyValueConfig = new EmptyValueConfig(source.EmptyValueConfig);
        }
        if (source.DbFieldName != null) {
            this.DbFieldName = new String(source.DbFieldName);
        }
        if (source.IsCopyOperation != null) {
            this.IsCopyOperation = new Boolean(source.IsCopyOperation);
        }
        if (source.IsCopyFromNormal != null) {
            this.IsCopyFromNormal = new Boolean(source.IsCopyFromNormal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "AliasName", this.AliasName);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamSimple(map, prefix + "FieldType", this.FieldType);
        this.setParamSimple(map, prefix + "FieldComplexType", this.FieldComplexType);
        this.setParamSimple(map, prefix + "Mark", this.Mark);
        this.setParamSimple(map, prefix + "FormatRule", this.FormatRule);
        this.setParamSimple(map, prefix + "IsFilter", this.IsFilter);
        this.setParamSimple(map, prefix + "CalcType", this.CalcType);
        this.setParamSimple(map, prefix + "CalcFormula", this.CalcFormula);
        this.setParamSimple(map, prefix + "CalcDesc", this.CalcDesc);
        this.setParamSimple(map, prefix + "DictId", this.DictId);
        this.setParamSimple(map, prefix + "DictName", this.DictName);
        this.setParamSimple(map, prefix + "TableNodeId", this.TableNodeId);
        this.setParamSimple(map, prefix + "ExcelName", this.ExcelName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "JsonPathName", this.JsonPathName);
        this.setParamSimple(map, prefix + "Granularity", this.Granularity);
        this.setParamSimple(map, prefix + "GeoJsonId", this.GeoJsonId);
        this.setParamObj(map, prefix + "EmptyValueConfig.", this.EmptyValueConfig);
        this.setParamSimple(map, prefix + "DbFieldName", this.DbFieldName);
        this.setParamSimple(map, prefix + "IsCopyOperation", this.IsCopyOperation);
        this.setParamSimple(map, prefix + "IsCopyFromNormal", this.IsCopyFromNormal);

    }
}

