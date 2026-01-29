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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IndexInfo extends AbstractModel {

    /**
    * 索引名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 索引大小，单位: 字节
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 索引键值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Keys")
    @Expose
    private Indexkey [] Keys;

    /**
    * 索引使用信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Accesses")
    @Expose
    private IndexAccesses Accesses;

    /**
    * 是否为唯一索引
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Unique")
    @Expose
    private Boolean Unique;

    /**
     * Get 索引名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 索引名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 索引名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 索引名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 索引大小，单位: 字节
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Size 索引大小，单位: 字节
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 索引大小，单位: 字节
注意：此字段可能返回 null，表示取不到有效值。
     * @param Size 索引大小，单位: 字节
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 索引键值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Keys 索引键值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Indexkey [] getKeys() {
        return this.Keys;
    }

    /**
     * Set 索引键值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Keys 索引键值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeys(Indexkey [] Keys) {
        this.Keys = Keys;
    }

    /**
     * Get 索引使用信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Accesses 索引使用信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IndexAccesses getAccesses() {
        return this.Accesses;
    }

    /**
     * Set 索引使用信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Accesses 索引使用信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccesses(IndexAccesses Accesses) {
        this.Accesses = Accesses;
    }

    /**
     * Get 是否为唯一索引
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Unique 是否为唯一索引
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getUnique() {
        return this.Unique;
    }

    /**
     * Set 是否为唯一索引
注意：此字段可能返回 null，表示取不到有效值。
     * @param Unique 是否为唯一索引
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnique(Boolean Unique) {
        this.Unique = Unique;
    }

    public IndexInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IndexInfo(IndexInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Keys != null) {
            this.Keys = new Indexkey[source.Keys.length];
            for (int i = 0; i < source.Keys.length; i++) {
                this.Keys[i] = new Indexkey(source.Keys[i]);
            }
        }
        if (source.Accesses != null) {
            this.Accesses = new IndexAccesses(source.Accesses);
        }
        if (source.Unique != null) {
            this.Unique = new Boolean(source.Unique);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamArrayObj(map, prefix + "Keys.", this.Keys);
        this.setParamObj(map, prefix + "Accesses.", this.Accesses);
        this.setParamSimple(map, prefix + "Unique", this.Unique);

    }
}

