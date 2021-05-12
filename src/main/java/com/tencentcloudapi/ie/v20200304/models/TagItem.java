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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TagItem extends AbstractModel{

    /**
    * 标签内容
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 结果的置信度（百分制）
    */
    @SerializedName("Confidence")
    @Expose
    private Long Confidence;

    /**
    * 分级数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Categorys")
    @Expose
    private String [] Categorys;

    /**
    * 标签备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ext")
    @Expose
    private String Ext;

    /**
     * Get 标签内容 
     * @return Id 标签内容
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 标签内容
     * @param Id 标签内容
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 结果的置信度（百分制） 
     * @return Confidence 结果的置信度（百分制）
     */
    public Long getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 结果的置信度（百分制）
     * @param Confidence 结果的置信度（百分制）
     */
    public void setConfidence(Long Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 分级数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Categorys 分级数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCategorys() {
        return this.Categorys;
    }

    /**
     * Set 分级数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param Categorys 分级数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCategorys(String [] Categorys) {
        this.Categorys = Categorys;
    }

    /**
     * Get 标签备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ext 标签备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExt() {
        return this.Ext;
    }

    /**
     * Set 标签备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ext 标签备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExt(String Ext) {
        this.Ext = Ext;
    }

    public TagItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TagItem(TagItem source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Confidence != null) {
            this.Confidence = new Long(source.Confidence);
        }
        if (source.Categorys != null) {
            this.Categorys = new String[source.Categorys.length];
            for (int i = 0; i < source.Categorys.length; i++) {
                this.Categorys[i] = new String(source.Categorys[i]);
            }
        }
        if (source.Ext != null) {
            this.Ext = new String(source.Ext);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamArraySimple(map, prefix + "Categorys.", this.Categorys);
        this.setParamSimple(map, prefix + "Ext", this.Ext);

    }
}

