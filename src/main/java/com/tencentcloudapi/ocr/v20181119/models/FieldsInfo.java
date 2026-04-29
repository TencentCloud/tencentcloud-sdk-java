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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FieldsInfo extends AbstractModel {

    /**
    * <p>用户自定义的提取字段名。</p>
    */
    @SerializedName("KeyName")
    @Expose
    private String KeyName;

    /**
    * <p>用户自定义的提取字段名的提示词。</p>
    */
    @SerializedName("KeyPrompt")
    @Expose
    private String KeyPrompt;

    /**
    * <p>出参字段对应的值。</p><p>注意：此字段可能返回 null，表示取不到有效值。</p>
    */
    @SerializedName("KeyValue")
    @Expose
    private String KeyValue;

    /**
    * <p>出参类型。</p><p>注：与入参对应同个值。</p>
    */
    @SerializedName("KeyType")
    @Expose
    private Long KeyType;

    /**
    * <p>文本行坐标，以四个顶点坐标表示。</p><p>注：仅当入参EnableCoord不为null时生效，默认是false。</p>
    */
    @SerializedName("Polygon")
    @Expose
    private CoordList Polygon;

    /**
    * <p>嵌套FieldsInfo结构，仅当KeyType=1时有效。</p>
    */
    @SerializedName("SubItems")
    @Expose
    private SubItemGroup [] SubItems;

    /**
     * Get <p>用户自定义的提取字段名。</p> 
     * @return KeyName <p>用户自定义的提取字段名。</p>
     */
    public String getKeyName() {
        return this.KeyName;
    }

    /**
     * Set <p>用户自定义的提取字段名。</p>
     * @param KeyName <p>用户自定义的提取字段名。</p>
     */
    public void setKeyName(String KeyName) {
        this.KeyName = KeyName;
    }

    /**
     * Get <p>用户自定义的提取字段名的提示词。</p> 
     * @return KeyPrompt <p>用户自定义的提取字段名的提示词。</p>
     */
    public String getKeyPrompt() {
        return this.KeyPrompt;
    }

    /**
     * Set <p>用户自定义的提取字段名的提示词。</p>
     * @param KeyPrompt <p>用户自定义的提取字段名的提示词。</p>
     */
    public void setKeyPrompt(String KeyPrompt) {
        this.KeyPrompt = KeyPrompt;
    }

    /**
     * Get <p>出参字段对应的值。</p><p>注意：此字段可能返回 null，表示取不到有效值。</p> 
     * @return KeyValue <p>出参字段对应的值。</p><p>注意：此字段可能返回 null，表示取不到有效值。</p>
     */
    public String getKeyValue() {
        return this.KeyValue;
    }

    /**
     * Set <p>出参字段对应的值。</p><p>注意：此字段可能返回 null，表示取不到有效值。</p>
     * @param KeyValue <p>出参字段对应的值。</p><p>注意：此字段可能返回 null，表示取不到有效值。</p>
     */
    public void setKeyValue(String KeyValue) {
        this.KeyValue = KeyValue;
    }

    /**
     * Get <p>出参类型。</p><p>注：与入参对应同个值。</p> 
     * @return KeyType <p>出参类型。</p><p>注：与入参对应同个值。</p>
     */
    public Long getKeyType() {
        return this.KeyType;
    }

    /**
     * Set <p>出参类型。</p><p>注：与入参对应同个值。</p>
     * @param KeyType <p>出参类型。</p><p>注：与入参对应同个值。</p>
     */
    public void setKeyType(Long KeyType) {
        this.KeyType = KeyType;
    }

    /**
     * Get <p>文本行坐标，以四个顶点坐标表示。</p><p>注：仅当入参EnableCoord不为null时生效，默认是false。</p> 
     * @return Polygon <p>文本行坐标，以四个顶点坐标表示。</p><p>注：仅当入参EnableCoord不为null时生效，默认是false。</p>
     */
    public CoordList getPolygon() {
        return this.Polygon;
    }

    /**
     * Set <p>文本行坐标，以四个顶点坐标表示。</p><p>注：仅当入参EnableCoord不为null时生效，默认是false。</p>
     * @param Polygon <p>文本行坐标，以四个顶点坐标表示。</p><p>注：仅当入参EnableCoord不为null时生效，默认是false。</p>
     */
    public void setPolygon(CoordList Polygon) {
        this.Polygon = Polygon;
    }

    /**
     * Get <p>嵌套FieldsInfo结构，仅当KeyType=1时有效。</p> 
     * @return SubItems <p>嵌套FieldsInfo结构，仅当KeyType=1时有效。</p>
     */
    public SubItemGroup [] getSubItems() {
        return this.SubItems;
    }

    /**
     * Set <p>嵌套FieldsInfo结构，仅当KeyType=1时有效。</p>
     * @param SubItems <p>嵌套FieldsInfo结构，仅当KeyType=1时有效。</p>
     */
    public void setSubItems(SubItemGroup [] SubItems) {
        this.SubItems = SubItems;
    }

    public FieldsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FieldsInfo(FieldsInfo source) {
        if (source.KeyName != null) {
            this.KeyName = new String(source.KeyName);
        }
        if (source.KeyPrompt != null) {
            this.KeyPrompt = new String(source.KeyPrompt);
        }
        if (source.KeyValue != null) {
            this.KeyValue = new String(source.KeyValue);
        }
        if (source.KeyType != null) {
            this.KeyType = new Long(source.KeyType);
        }
        if (source.Polygon != null) {
            this.Polygon = new CoordList(source.Polygon);
        }
        if (source.SubItems != null) {
            this.SubItems = new SubItemGroup[source.SubItems.length];
            for (int i = 0; i < source.SubItems.length; i++) {
                this.SubItems[i] = new SubItemGroup(source.SubItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyName", this.KeyName);
        this.setParamSimple(map, prefix + "KeyPrompt", this.KeyPrompt);
        this.setParamSimple(map, prefix + "KeyValue", this.KeyValue);
        this.setParamSimple(map, prefix + "KeyType", this.KeyType);
        this.setParamObj(map, prefix + "Polygon.", this.Polygon);
        this.setParamArrayObj(map, prefix + "SubItems.", this.SubItems);

    }
}

