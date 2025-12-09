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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DimTableLink extends AbstractModel {

    /**
    * 维度主键KEY对应的表列
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 维度值对应的表列
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 表 GUID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableGuid")
    @Expose
    private String TableGuid;

    /**
    * 表名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
     * Get 维度主键KEY对应的表列
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Key 维度主键KEY对应的表列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 维度主键KEY对应的表列
注意：此字段可能返回 null，表示取不到有效值。
     * @param Key 维度主键KEY对应的表列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 维度值对应的表列
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value 维度值对应的表列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 维度值对应的表列
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value 维度值对应的表列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 表 GUID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableGuid 表 GUID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableGuid() {
        return this.TableGuid;
    }

    /**
     * Set 表 GUID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableGuid 表 GUID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableGuid(String TableGuid) {
        this.TableGuid = TableGuid;
    }

    /**
     * Get 表名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableName 表名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableName 表名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    public DimTableLink() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DimTableLink(DimTableLink source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.TableGuid != null) {
            this.TableGuid = new String(source.TableGuid);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "TableGuid", this.TableGuid);
        this.setParamSimple(map, prefix + "TableName", this.TableName);

    }
}

