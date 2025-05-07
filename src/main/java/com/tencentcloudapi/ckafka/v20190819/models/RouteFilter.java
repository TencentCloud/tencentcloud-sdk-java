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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RouteFilter extends AbstractModel {

    /**
    * 过滤名称,目前支持security-group-id,按安全组关联过滤
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 过滤值,当过滤名称为security-group-id时仅支持传单个value
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
    * 过滤关系,支持IN和NOT_IN,默认为IN
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Relation")
    @Expose
    private String Relation;

    /**
     * Get 过滤名称,目前支持security-group-id,按安全组关联过滤
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 过滤名称,目前支持security-group-id,按安全组关联过滤
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 过滤名称,目前支持security-group-id,按安全组关联过滤
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 过滤名称,目前支持security-group-id,按安全组关联过滤
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 过滤值,当过滤名称为security-group-id时仅支持传单个value
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Values 过滤值,当过滤名称为security-group-id时仅支持传单个value
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set 过滤值,当过滤名称为security-group-id时仅支持传单个value
注意：此字段可能返回 null，表示取不到有效值。
     * @param Values 过滤值,当过滤名称为security-group-id时仅支持传单个value
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * Get 过滤关系,支持IN和NOT_IN,默认为IN
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Relation 过滤关系,支持IN和NOT_IN,默认为IN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRelation() {
        return this.Relation;
    }

    /**
     * Set 过滤关系,支持IN和NOT_IN,默认为IN
注意：此字段可能返回 null，表示取不到有效值。
     * @param Relation 过滤关系,支持IN和NOT_IN,默认为IN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelation(String Relation) {
        this.Relation = Relation;
    }

    public RouteFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RouteFilter(RouteFilter source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
        if (source.Relation != null) {
            this.Relation = new String(source.Relation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);
        this.setParamSimple(map, prefix + "Relation", this.Relation);

    }
}

