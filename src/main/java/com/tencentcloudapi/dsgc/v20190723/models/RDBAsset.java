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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RDBAsset extends AbstractModel{

    /**
    * DB总数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DbNums")
    @Expose
    private Long DbNums;

    /**
    * 敏感DB数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SensitiveDbNums")
    @Expose
    private Long SensitiveDbNums;

    /**
    * 表数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableNums")
    @Expose
    private Long TableNums;

    /**
    * 敏感表的数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SensitiveTableNums")
    @Expose
    private Long SensitiveTableNums;

    /**
    * 字段数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FieldNums")
    @Expose
    private Long FieldNums;

    /**
    * 敏感的字段数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SensitiveFieldNums")
    @Expose
    private Long SensitiveFieldNums;

    /**
     * Get DB总数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DbNums DB总数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDbNums() {
        return this.DbNums;
    }

    /**
     * Set DB总数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param DbNums DB总数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDbNums(Long DbNums) {
        this.DbNums = DbNums;
    }

    /**
     * Get 敏感DB数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SensitiveDbNums 敏感DB数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSensitiveDbNums() {
        return this.SensitiveDbNums;
    }

    /**
     * Set 敏感DB数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param SensitiveDbNums 敏感DB数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSensitiveDbNums(Long SensitiveDbNums) {
        this.SensitiveDbNums = SensitiveDbNums;
    }

    /**
     * Get 表数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableNums 表数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTableNums() {
        return this.TableNums;
    }

    /**
     * Set 表数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableNums 表数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableNums(Long TableNums) {
        this.TableNums = TableNums;
    }

    /**
     * Get 敏感表的数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SensitiveTableNums 敏感表的数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSensitiveTableNums() {
        return this.SensitiveTableNums;
    }

    /**
     * Set 敏感表的数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param SensitiveTableNums 敏感表的数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSensitiveTableNums(Long SensitiveTableNums) {
        this.SensitiveTableNums = SensitiveTableNums;
    }

    /**
     * Get 字段数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FieldNums 字段数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFieldNums() {
        return this.FieldNums;
    }

    /**
     * Set 字段数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param FieldNums 字段数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFieldNums(Long FieldNums) {
        this.FieldNums = FieldNums;
    }

    /**
     * Get 敏感的字段数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SensitiveFieldNums 敏感的字段数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSensitiveFieldNums() {
        return this.SensitiveFieldNums;
    }

    /**
     * Set 敏感的字段数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param SensitiveFieldNums 敏感的字段数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSensitiveFieldNums(Long SensitiveFieldNums) {
        this.SensitiveFieldNums = SensitiveFieldNums;
    }

    public RDBAsset() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RDBAsset(RDBAsset source) {
        if (source.DbNums != null) {
            this.DbNums = new Long(source.DbNums);
        }
        if (source.SensitiveDbNums != null) {
            this.SensitiveDbNums = new Long(source.SensitiveDbNums);
        }
        if (source.TableNums != null) {
            this.TableNums = new Long(source.TableNums);
        }
        if (source.SensitiveTableNums != null) {
            this.SensitiveTableNums = new Long(source.SensitiveTableNums);
        }
        if (source.FieldNums != null) {
            this.FieldNums = new Long(source.FieldNums);
        }
        if (source.SensitiveFieldNums != null) {
            this.SensitiveFieldNums = new Long(source.SensitiveFieldNums);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DbNums", this.DbNums);
        this.setParamSimple(map, prefix + "SensitiveDbNums", this.SensitiveDbNums);
        this.setParamSimple(map, prefix + "TableNums", this.TableNums);
        this.setParamSimple(map, prefix + "SensitiveTableNums", this.SensitiveTableNums);
        this.setParamSimple(map, prefix + "FieldNums", this.FieldNums);
        this.setParamSimple(map, prefix + "SensitiveFieldNums", this.SensitiveFieldNums);

    }
}

