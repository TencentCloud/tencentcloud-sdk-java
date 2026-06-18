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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Explain extends AbstractModel {

    /**
    * <p>标识符</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * <p>查询类型</p><p>枚举值：</p><ul><li>SIMPLE： 没有子查询和 UNION 的普通查询，单表或普通 JOIN 都是 SIMPLE。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SelectType")
    @Expose
    private String SelectType;

    /**
    * <p>表名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * <p>分区</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Partitions")
    @Expose
    private String Partitions;

    /**
    * <p>访问类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>可能使用的索引</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PossibleKeys")
    @Expose
    private String PossibleKeys;

    /**
    * <p>实际使用的索引</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * <p>使用的索引长度</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeyLen")
    @Expose
    private String KeyLen;

    /**
    * <p>与索引比较的列或常量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ref")
    @Expose
    private String Ref;

    /**
    * <p>估算扫描行数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rows")
    @Expose
    private String Rows;

    /**
    * <p>条件过滤后剩余行的估算百分比</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Filtered")
    @Expose
    private String Filtered;

    /**
    * <p>附加信息，如 Using index、Using filesort 等</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
     * Get <p>标识符</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ID <p>标识符</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set <p>标识符</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ID <p>标识符</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get <p>查询类型</p><p>枚举值：</p><ul><li>SIMPLE： 没有子查询和 UNION 的普通查询，单表或普通 JOIN 都是 SIMPLE。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SelectType <p>查询类型</p><p>枚举值：</p><ul><li>SIMPLE： 没有子查询和 UNION 的普通查询，单表或普通 JOIN 都是 SIMPLE。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSelectType() {
        return this.SelectType;
    }

    /**
     * Set <p>查询类型</p><p>枚举值：</p><ul><li>SIMPLE： 没有子查询和 UNION 的普通查询，单表或普通 JOIN 都是 SIMPLE。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SelectType <p>查询类型</p><p>枚举值：</p><ul><li>SIMPLE： 没有子查询和 UNION 的普通查询，单表或普通 JOIN 都是 SIMPLE。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSelectType(String SelectType) {
        this.SelectType = SelectType;
    }

    /**
     * Get <p>表名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Table <p>表名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set <p>表名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Table <p>表名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get <p>分区</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Partitions <p>分区</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPartitions() {
        return this.Partitions;
    }

    /**
     * Set <p>分区</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Partitions <p>分区</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPartitions(String Partitions) {
        this.Partitions = Partitions;
    }

    /**
     * Get <p>访问类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type <p>访问类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>访问类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type <p>访问类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>可能使用的索引</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PossibleKeys <p>可能使用的索引</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPossibleKeys() {
        return this.PossibleKeys;
    }

    /**
     * Set <p>可能使用的索引</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PossibleKeys <p>可能使用的索引</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPossibleKeys(String PossibleKeys) {
        this.PossibleKeys = PossibleKeys;
    }

    /**
     * Get <p>实际使用的索引</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Key <p>实际使用的索引</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set <p>实际使用的索引</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Key <p>实际使用的索引</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get <p>使用的索引长度</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeyLen <p>使用的索引长度</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKeyLen() {
        return this.KeyLen;
    }

    /**
     * Set <p>使用的索引长度</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeyLen <p>使用的索引长度</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyLen(String KeyLen) {
        this.KeyLen = KeyLen;
    }

    /**
     * Get <p>与索引比较的列或常量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ref <p>与索引比较的列或常量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRef() {
        return this.Ref;
    }

    /**
     * Set <p>与索引比较的列或常量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ref <p>与索引比较的列或常量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRef(String Ref) {
        this.Ref = Ref;
    }

    /**
     * Get <p>估算扫描行数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rows <p>估算扫描行数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRows() {
        return this.Rows;
    }

    /**
     * Set <p>估算扫描行数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rows <p>估算扫描行数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRows(String Rows) {
        this.Rows = Rows;
    }

    /**
     * Get <p>条件过滤后剩余行的估算百分比</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Filtered <p>条件过滤后剩余行的估算百分比</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFiltered() {
        return this.Filtered;
    }

    /**
     * Set <p>条件过滤后剩余行的估算百分比</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Filtered <p>条件过滤后剩余行的估算百分比</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFiltered(String Filtered) {
        this.Filtered = Filtered;
    }

    /**
     * Get <p>附加信息，如 Using index、Using filesort 等</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Extra <p>附加信息，如 Using index、Using filesort 等</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set <p>附加信息，如 Using index、Using filesort 等</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Extra <p>附加信息，如 Using index、Using filesort 等</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    public Explain() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Explain(Explain source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.SelectType != null) {
            this.SelectType = new String(source.SelectType);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
        if (source.Partitions != null) {
            this.Partitions = new String(source.Partitions);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.PossibleKeys != null) {
            this.PossibleKeys = new String(source.PossibleKeys);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.KeyLen != null) {
            this.KeyLen = new String(source.KeyLen);
        }
        if (source.Ref != null) {
            this.Ref = new String(source.Ref);
        }
        if (source.Rows != null) {
            this.Rows = new String(source.Rows);
        }
        if (source.Filtered != null) {
            this.Filtered = new String(source.Filtered);
        }
        if (source.Extra != null) {
            this.Extra = new String(source.Extra);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "SelectType", this.SelectType);
        this.setParamSimple(map, prefix + "Table", this.Table);
        this.setParamSimple(map, prefix + "Partitions", this.Partitions);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "PossibleKeys", this.PossibleKeys);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "KeyLen", this.KeyLen);
        this.setParamSimple(map, prefix + "Ref", this.Ref);
        this.setParamSimple(map, prefix + "Rows", this.Rows);
        this.setParamSimple(map, prefix + "Filtered", this.Filtered);
        this.setParamSimple(map, prefix + "Extra", this.Extra);

    }
}

