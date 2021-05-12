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
package com.tencentcloudapi.nlp.v20190408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EntityRelationObject extends AbstractModel{

    /**
    * object对应popular值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Popular")
    @Expose
    private Long [] Popular;

    /**
    * object对应id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String [] Id;

    /**
    * object对应name
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String [] Name;

    /**
     * Get object对应popular值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Popular object对应popular值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getPopular() {
        return this.Popular;
    }

    /**
     * Set object对应popular值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Popular object对应popular值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPopular(Long [] Popular) {
        this.Popular = Popular;
    }

    /**
     * Get object对应id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id object对应id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getId() {
        return this.Id;
    }

    /**
     * Set object对应id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id object对应id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String [] Id) {
        this.Id = Id;
    }

    /**
     * Get object对应name
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name object对应name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getName() {
        return this.Name;
    }

    /**
     * Set object对应name
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name object对应name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String [] Name) {
        this.Name = Name;
    }

    public EntityRelationObject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EntityRelationObject(EntityRelationObject source) {
        if (source.Popular != null) {
            this.Popular = new Long[source.Popular.length];
            for (int i = 0; i < source.Popular.length; i++) {
                this.Popular[i] = new Long(source.Popular[i]);
            }
        }
        if (source.Id != null) {
            this.Id = new String[source.Id.length];
            for (int i = 0; i < source.Id.length; i++) {
                this.Id[i] = new String(source.Id[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String[source.Name.length];
            for (int i = 0; i < source.Name.length; i++) {
                this.Name[i] = new String(source.Name[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Popular.", this.Popular);
        this.setParamArraySimple(map, prefix + "Id.", this.Id);
        this.setParamArraySimple(map, prefix + "Name.", this.Name);

    }
}

