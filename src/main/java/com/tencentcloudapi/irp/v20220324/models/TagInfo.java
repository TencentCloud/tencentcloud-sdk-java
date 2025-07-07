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
package com.tencentcloudapi.irp.v20220324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TagInfo extends AbstractModel {

    /**
    * 标签id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 标签名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 推荐权重
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Weight")
    @Expose
    private Float Weight;

    /**
     * Get 标签id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 标签id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 标签id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 标签id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 标签名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 标签名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 标签名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 标签名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 推荐权重
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Weight 推荐权重
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getWeight() {
        return this.Weight;
    }

    /**
     * Set 推荐权重
注意：此字段可能返回 null，表示取不到有效值。
     * @param Weight 推荐权重
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeight(Float Weight) {
        this.Weight = Weight;
    }

    public TagInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TagInfo(TagInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Weight != null) {
            this.Weight = new Float(source.Weight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Weight", this.Weight);

    }
}

