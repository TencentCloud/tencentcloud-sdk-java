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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FavorInfo extends AbstractModel {

    /**
    * 优先事项
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * Catalog名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

    /**
    * DataBase名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataBase")
    @Expose
    private String DataBase;

    /**
    * Table名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
     * Get 优先事项
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Priority 优先事项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 优先事项
注意：此字段可能返回 null，表示取不到有效值。
     * @param Priority 优先事项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get Catalog名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Catalog Catalog名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCatalog() {
        return this.Catalog;
    }

    /**
     * Set Catalog名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Catalog Catalog名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCatalog(String Catalog) {
        this.Catalog = Catalog;
    }

    /**
     * Get DataBase名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataBase DataBase名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataBase() {
        return this.DataBase;
    }

    /**
     * Set DataBase名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataBase DataBase名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataBase(String DataBase) {
        this.DataBase = DataBase;
    }

    /**
     * Get Table名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Table Table名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set Table名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Table Table名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    public FavorInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FavorInfo(FavorInfo source) {
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Catalog != null) {
            this.Catalog = new String(source.Catalog);
        }
        if (source.DataBase != null) {
            this.DataBase = new String(source.DataBase);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Catalog", this.Catalog);
        this.setParamSimple(map, prefix + "DataBase", this.DataBase);
        this.setParamSimple(map, prefix + "Table", this.Table);

    }
}

