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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecordMapping extends AbstractModel {

    /**
    * 消息的 key 名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JsonKey")
    @Expose
    private String JsonKey;

    /**
    * 消息类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 消息是否允许为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AllowNull")
    @Expose
    private Boolean AllowNull;

    /**
    * 对应映射列名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColumnName")
    @Expose
    private String ColumnName;

    /**
    * 数据库表额外字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtraInfo")
    @Expose
    private String ExtraInfo;

    /**
    * 当前列大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColumnSize")
    @Expose
    private String ColumnSize;

    /**
    * 当前列精度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DecimalDigits")
    @Expose
    private String DecimalDigits;

    /**
    * 是否为自增列
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoIncrement")
    @Expose
    private Boolean AutoIncrement;

    /**
    * 数据库表默认参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
     * Get 消息的 key 名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JsonKey 消息的 key 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJsonKey() {
        return this.JsonKey;
    }

    /**
     * Set 消息的 key 名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param JsonKey 消息的 key 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJsonKey(String JsonKey) {
        this.JsonKey = JsonKey;
    }

    /**
     * Get 消息类型 
     * @return Type 消息类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 消息类型
     * @param Type 消息类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 消息是否允许为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AllowNull 消息是否允许为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAllowNull() {
        return this.AllowNull;
    }

    /**
     * Set 消息是否允许为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param AllowNull 消息是否允许为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllowNull(Boolean AllowNull) {
        this.AllowNull = AllowNull;
    }

    /**
     * Get 对应映射列名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColumnName 对应映射列名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getColumnName() {
        return this.ColumnName;
    }

    /**
     * Set 对应映射列名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColumnName 对应映射列名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumnName(String ColumnName) {
        this.ColumnName = ColumnName;
    }

    /**
     * Get 数据库表额外字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtraInfo 数据库表额外字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtraInfo() {
        return this.ExtraInfo;
    }

    /**
     * Set 数据库表额外字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtraInfo 数据库表额外字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtraInfo(String ExtraInfo) {
        this.ExtraInfo = ExtraInfo;
    }

    /**
     * Get 当前列大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColumnSize 当前列大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getColumnSize() {
        return this.ColumnSize;
    }

    /**
     * Set 当前列大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColumnSize 当前列大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumnSize(String ColumnSize) {
        this.ColumnSize = ColumnSize;
    }

    /**
     * Get 当前列精度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DecimalDigits 当前列精度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDecimalDigits() {
        return this.DecimalDigits;
    }

    /**
     * Set 当前列精度
注意：此字段可能返回 null，表示取不到有效值。
     * @param DecimalDigits 当前列精度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDecimalDigits(String DecimalDigits) {
        this.DecimalDigits = DecimalDigits;
    }

    /**
     * Get 是否为自增列
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoIncrement 是否为自增列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAutoIncrement() {
        return this.AutoIncrement;
    }

    /**
     * Set 是否为自增列
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoIncrement 是否为自增列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoIncrement(Boolean AutoIncrement) {
        this.AutoIncrement = AutoIncrement;
    }

    /**
     * Get 数据库表默认参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultValue 数据库表默认参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set 数据库表默认参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultValue 数据库表默认参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    public RecordMapping() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordMapping(RecordMapping source) {
        if (source.JsonKey != null) {
            this.JsonKey = new String(source.JsonKey);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.AllowNull != null) {
            this.AllowNull = new Boolean(source.AllowNull);
        }
        if (source.ColumnName != null) {
            this.ColumnName = new String(source.ColumnName);
        }
        if (source.ExtraInfo != null) {
            this.ExtraInfo = new String(source.ExtraInfo);
        }
        if (source.ColumnSize != null) {
            this.ColumnSize = new String(source.ColumnSize);
        }
        if (source.DecimalDigits != null) {
            this.DecimalDigits = new String(source.DecimalDigits);
        }
        if (source.AutoIncrement != null) {
            this.AutoIncrement = new Boolean(source.AutoIncrement);
        }
        if (source.DefaultValue != null) {
            this.DefaultValue = new String(source.DefaultValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JsonKey", this.JsonKey);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "AllowNull", this.AllowNull);
        this.setParamSimple(map, prefix + "ColumnName", this.ColumnName);
        this.setParamSimple(map, prefix + "ExtraInfo", this.ExtraInfo);
        this.setParamSimple(map, prefix + "ColumnSize", this.ColumnSize);
        this.setParamSimple(map, prefix + "DecimalDigits", this.DecimalDigits);
        this.setParamSimple(map, prefix + "AutoIncrement", this.AutoIncrement);
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);

    }
}

