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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParsedTableInfoNew extends AbstractModel {

    /**
    * 表格描述语言类型：`PROTO`或`TDR`
    */
    @SerializedName("TableIdlType")
    @Expose
    private String TableIdlType;

    /**
    * 表格实例ID
    */
    @SerializedName("TableInstanceId")
    @Expose
    private String TableInstanceId;

    /**
    * 表格名称
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 表格数据结构类型：`GENERIC`或`LIST`
    */
    @SerializedName("TableType")
    @Expose
    private String TableType;

    /**
    * 主键字段信息
    */
    @SerializedName("KeyFields")
    @Expose
    private String KeyFields;

    /**
    * 原主键字段信息，改表校验时有效
    */
    @SerializedName("OldKeyFields")
    @Expose
    private String OldKeyFields;

    /**
    * 非主键字段信息
    */
    @SerializedName("ValueFields")
    @Expose
    private String ValueFields;

    /**
    * 原非主键字段信息，改表校验时有效
    */
    @SerializedName("OldValueFields")
    @Expose
    private String OldValueFields;

    /**
    * 所属表格组ID
    */
    @SerializedName("TableGroupId")
    @Expose
    private String TableGroupId;

    /**
    * 主键字段总大小
    */
    @SerializedName("SumKeyFieldSize")
    @Expose
    private Long SumKeyFieldSize;

    /**
    * 非主键字段总大小
    */
    @SerializedName("SumValueFieldSize")
    @Expose
    private Long SumValueFieldSize;

    /**
    * 索引键集合
    */
    @SerializedName("IndexKeySet")
    @Expose
    private String IndexKeySet;

    /**
    * 分表因子集合
    */
    @SerializedName("ShardingKeySet")
    @Expose
    private String ShardingKeySet;

    /**
    * TDR版本号
    */
    @SerializedName("TdrVersion")
    @Expose
    private Long TdrVersion;

    /**
    * 错误信息
    */
    @SerializedName("Error")
    @Expose
    private ErrorInfo Error;

    /**
    * LIST类型表格元素个数
    */
    @SerializedName("ListElementNum")
    @Expose
    private Long ListElementNum;

    /**
    * SORTLIST类型表格排序字段个数
    */
    @SerializedName("SortFieldNum")
    @Expose
    private Long SortFieldNum;

    /**
    * SORTLIST类型表格排序顺序
    */
    @SerializedName("SortRule")
    @Expose
    private Long SortRule;

    /**
     * Get 表格描述语言类型：`PROTO`或`TDR` 
     * @return TableIdlType 表格描述语言类型：`PROTO`或`TDR`
     */
    public String getTableIdlType() {
        return this.TableIdlType;
    }

    /**
     * Set 表格描述语言类型：`PROTO`或`TDR`
     * @param TableIdlType 表格描述语言类型：`PROTO`或`TDR`
     */
    public void setTableIdlType(String TableIdlType) {
        this.TableIdlType = TableIdlType;
    }

    /**
     * Get 表格实例ID 
     * @return TableInstanceId 表格实例ID
     */
    public String getTableInstanceId() {
        return this.TableInstanceId;
    }

    /**
     * Set 表格实例ID
     * @param TableInstanceId 表格实例ID
     */
    public void setTableInstanceId(String TableInstanceId) {
        this.TableInstanceId = TableInstanceId;
    }

    /**
     * Get 表格名称 
     * @return TableName 表格名称
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表格名称
     * @param TableName 表格名称
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 表格数据结构类型：`GENERIC`或`LIST` 
     * @return TableType 表格数据结构类型：`GENERIC`或`LIST`
     */
    public String getTableType() {
        return this.TableType;
    }

    /**
     * Set 表格数据结构类型：`GENERIC`或`LIST`
     * @param TableType 表格数据结构类型：`GENERIC`或`LIST`
     */
    public void setTableType(String TableType) {
        this.TableType = TableType;
    }

    /**
     * Get 主键字段信息 
     * @return KeyFields 主键字段信息
     */
    public String getKeyFields() {
        return this.KeyFields;
    }

    /**
     * Set 主键字段信息
     * @param KeyFields 主键字段信息
     */
    public void setKeyFields(String KeyFields) {
        this.KeyFields = KeyFields;
    }

    /**
     * Get 原主键字段信息，改表校验时有效 
     * @return OldKeyFields 原主键字段信息，改表校验时有效
     */
    public String getOldKeyFields() {
        return this.OldKeyFields;
    }

    /**
     * Set 原主键字段信息，改表校验时有效
     * @param OldKeyFields 原主键字段信息，改表校验时有效
     */
    public void setOldKeyFields(String OldKeyFields) {
        this.OldKeyFields = OldKeyFields;
    }

    /**
     * Get 非主键字段信息 
     * @return ValueFields 非主键字段信息
     */
    public String getValueFields() {
        return this.ValueFields;
    }

    /**
     * Set 非主键字段信息
     * @param ValueFields 非主键字段信息
     */
    public void setValueFields(String ValueFields) {
        this.ValueFields = ValueFields;
    }

    /**
     * Get 原非主键字段信息，改表校验时有效 
     * @return OldValueFields 原非主键字段信息，改表校验时有效
     */
    public String getOldValueFields() {
        return this.OldValueFields;
    }

    /**
     * Set 原非主键字段信息，改表校验时有效
     * @param OldValueFields 原非主键字段信息，改表校验时有效
     */
    public void setOldValueFields(String OldValueFields) {
        this.OldValueFields = OldValueFields;
    }

    /**
     * Get 所属表格组ID 
     * @return TableGroupId 所属表格组ID
     */
    public String getTableGroupId() {
        return this.TableGroupId;
    }

    /**
     * Set 所属表格组ID
     * @param TableGroupId 所属表格组ID
     */
    public void setTableGroupId(String TableGroupId) {
        this.TableGroupId = TableGroupId;
    }

    /**
     * Get 主键字段总大小 
     * @return SumKeyFieldSize 主键字段总大小
     */
    public Long getSumKeyFieldSize() {
        return this.SumKeyFieldSize;
    }

    /**
     * Set 主键字段总大小
     * @param SumKeyFieldSize 主键字段总大小
     */
    public void setSumKeyFieldSize(Long SumKeyFieldSize) {
        this.SumKeyFieldSize = SumKeyFieldSize;
    }

    /**
     * Get 非主键字段总大小 
     * @return SumValueFieldSize 非主键字段总大小
     */
    public Long getSumValueFieldSize() {
        return this.SumValueFieldSize;
    }

    /**
     * Set 非主键字段总大小
     * @param SumValueFieldSize 非主键字段总大小
     */
    public void setSumValueFieldSize(Long SumValueFieldSize) {
        this.SumValueFieldSize = SumValueFieldSize;
    }

    /**
     * Get 索引键集合 
     * @return IndexKeySet 索引键集合
     */
    public String getIndexKeySet() {
        return this.IndexKeySet;
    }

    /**
     * Set 索引键集合
     * @param IndexKeySet 索引键集合
     */
    public void setIndexKeySet(String IndexKeySet) {
        this.IndexKeySet = IndexKeySet;
    }

    /**
     * Get 分表因子集合 
     * @return ShardingKeySet 分表因子集合
     */
    public String getShardingKeySet() {
        return this.ShardingKeySet;
    }

    /**
     * Set 分表因子集合
     * @param ShardingKeySet 分表因子集合
     */
    public void setShardingKeySet(String ShardingKeySet) {
        this.ShardingKeySet = ShardingKeySet;
    }

    /**
     * Get TDR版本号 
     * @return TdrVersion TDR版本号
     */
    public Long getTdrVersion() {
        return this.TdrVersion;
    }

    /**
     * Set TDR版本号
     * @param TdrVersion TDR版本号
     */
    public void setTdrVersion(Long TdrVersion) {
        this.TdrVersion = TdrVersion;
    }

    /**
     * Get 错误信息 
     * @return Error 错误信息
     */
    public ErrorInfo getError() {
        return this.Error;
    }

    /**
     * Set 错误信息
     * @param Error 错误信息
     */
    public void setError(ErrorInfo Error) {
        this.Error = Error;
    }

    /**
     * Get LIST类型表格元素个数 
     * @return ListElementNum LIST类型表格元素个数
     */
    public Long getListElementNum() {
        return this.ListElementNum;
    }

    /**
     * Set LIST类型表格元素个数
     * @param ListElementNum LIST类型表格元素个数
     */
    public void setListElementNum(Long ListElementNum) {
        this.ListElementNum = ListElementNum;
    }

    /**
     * Get SORTLIST类型表格排序字段个数 
     * @return SortFieldNum SORTLIST类型表格排序字段个数
     */
    public Long getSortFieldNum() {
        return this.SortFieldNum;
    }

    /**
     * Set SORTLIST类型表格排序字段个数
     * @param SortFieldNum SORTLIST类型表格排序字段个数
     */
    public void setSortFieldNum(Long SortFieldNum) {
        this.SortFieldNum = SortFieldNum;
    }

    /**
     * Get SORTLIST类型表格排序顺序 
     * @return SortRule SORTLIST类型表格排序顺序
     */
    public Long getSortRule() {
        return this.SortRule;
    }

    /**
     * Set SORTLIST类型表格排序顺序
     * @param SortRule SORTLIST类型表格排序顺序
     */
    public void setSortRule(Long SortRule) {
        this.SortRule = SortRule;
    }

    public ParsedTableInfoNew() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParsedTableInfoNew(ParsedTableInfoNew source) {
        if (source.TableIdlType != null) {
            this.TableIdlType = new String(source.TableIdlType);
        }
        if (source.TableInstanceId != null) {
            this.TableInstanceId = new String(source.TableInstanceId);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.TableType != null) {
            this.TableType = new String(source.TableType);
        }
        if (source.KeyFields != null) {
            this.KeyFields = new String(source.KeyFields);
        }
        if (source.OldKeyFields != null) {
            this.OldKeyFields = new String(source.OldKeyFields);
        }
        if (source.ValueFields != null) {
            this.ValueFields = new String(source.ValueFields);
        }
        if (source.OldValueFields != null) {
            this.OldValueFields = new String(source.OldValueFields);
        }
        if (source.TableGroupId != null) {
            this.TableGroupId = new String(source.TableGroupId);
        }
        if (source.SumKeyFieldSize != null) {
            this.SumKeyFieldSize = new Long(source.SumKeyFieldSize);
        }
        if (source.SumValueFieldSize != null) {
            this.SumValueFieldSize = new Long(source.SumValueFieldSize);
        }
        if (source.IndexKeySet != null) {
            this.IndexKeySet = new String(source.IndexKeySet);
        }
        if (source.ShardingKeySet != null) {
            this.ShardingKeySet = new String(source.ShardingKeySet);
        }
        if (source.TdrVersion != null) {
            this.TdrVersion = new Long(source.TdrVersion);
        }
        if (source.Error != null) {
            this.Error = new ErrorInfo(source.Error);
        }
        if (source.ListElementNum != null) {
            this.ListElementNum = new Long(source.ListElementNum);
        }
        if (source.SortFieldNum != null) {
            this.SortFieldNum = new Long(source.SortFieldNum);
        }
        if (source.SortRule != null) {
            this.SortRule = new Long(source.SortRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableIdlType", this.TableIdlType);
        this.setParamSimple(map, prefix + "TableInstanceId", this.TableInstanceId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "TableType", this.TableType);
        this.setParamSimple(map, prefix + "KeyFields", this.KeyFields);
        this.setParamSimple(map, prefix + "OldKeyFields", this.OldKeyFields);
        this.setParamSimple(map, prefix + "ValueFields", this.ValueFields);
        this.setParamSimple(map, prefix + "OldValueFields", this.OldValueFields);
        this.setParamSimple(map, prefix + "TableGroupId", this.TableGroupId);
        this.setParamSimple(map, prefix + "SumKeyFieldSize", this.SumKeyFieldSize);
        this.setParamSimple(map, prefix + "SumValueFieldSize", this.SumValueFieldSize);
        this.setParamSimple(map, prefix + "IndexKeySet", this.IndexKeySet);
        this.setParamSimple(map, prefix + "ShardingKeySet", this.ShardingKeySet);
        this.setParamSimple(map, prefix + "TdrVersion", this.TdrVersion);
        this.setParamObj(map, prefix + "Error.", this.Error);
        this.setParamSimple(map, prefix + "ListElementNum", this.ListElementNum);
        this.setParamSimple(map, prefix + "SortFieldNum", this.SortFieldNum);
        this.setParamSimple(map, prefix + "SortRule", this.SortRule);

    }
}

