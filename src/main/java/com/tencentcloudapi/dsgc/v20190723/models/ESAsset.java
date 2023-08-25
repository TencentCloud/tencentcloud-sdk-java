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

public class ESAsset extends AbstractModel{

    /**
    * 索引总数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexNums")
    @Expose
    private Long IndexNums;

    /**
    * 敏感索引的数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SensitiveIndexNums")
    @Expose
    private Long SensitiveIndexNums;

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
     * Get 索引总数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexNums 索引总数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIndexNums() {
        return this.IndexNums;
    }

    /**
     * Set 索引总数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexNums 索引总数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexNums(Long IndexNums) {
        this.IndexNums = IndexNums;
    }

    /**
     * Get 敏感索引的数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SensitiveIndexNums 敏感索引的数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSensitiveIndexNums() {
        return this.SensitiveIndexNums;
    }

    /**
     * Set 敏感索引的数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param SensitiveIndexNums 敏感索引的数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSensitiveIndexNums(Long SensitiveIndexNums) {
        this.SensitiveIndexNums = SensitiveIndexNums;
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

    public ESAsset() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ESAsset(ESAsset source) {
        if (source.IndexNums != null) {
            this.IndexNums = new Long(source.IndexNums);
        }
        if (source.SensitiveIndexNums != null) {
            this.SensitiveIndexNums = new Long(source.SensitiveIndexNums);
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
        this.setParamSimple(map, prefix + "IndexNums", this.IndexNums);
        this.setParamSimple(map, prefix + "SensitiveIndexNums", this.SensitiveIndexNums);
        this.setParamSimple(map, prefix + "FieldNums", this.FieldNums);
        this.setParamSimple(map, prefix + "SensitiveFieldNums", this.SensitiveFieldNums);

    }
}

