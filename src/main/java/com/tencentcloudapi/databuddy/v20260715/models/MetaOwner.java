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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MetaOwner extends AbstractModel {

    /**
    * 元数据名称（全名）:catalog.schema.table
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FullName")
    @Expose
    private String FullName;

    /**
    * 所有者类型:User
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerType")
    @Expose
    private String OwnerType;

    /**
    * 所有者:唯一标识(uin)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * 所有者名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerName")
    @Expose
    private String OwnerName;

    /**
     * Get 元数据名称（全名）:catalog.schema.table
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FullName 元数据名称（全名）:catalog.schema.table
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFullName() {
        return this.FullName;
    }

    /**
     * Set 元数据名称（全名）:catalog.schema.table
注意：此字段可能返回 null，表示取不到有效值。
     * @param FullName 元数据名称（全名）:catalog.schema.table
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    /**
     * Get 所有者类型:User
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerType 所有者类型:User
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerType() {
        return this.OwnerType;
    }

    /**
     * Set 所有者类型:User
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerType 所有者类型:User
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerType(String OwnerType) {
        this.OwnerType = OwnerType;
    }

    /**
     * Get 所有者:唯一标识(uin)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Owner 所有者:唯一标识(uin)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set 所有者:唯一标识(uin)
注意：此字段可能返回 null，表示取不到有效值。
     * @param Owner 所有者:唯一标识(uin)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 所有者名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerName 所有者名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerName() {
        return this.OwnerName;
    }

    /**
     * Set 所有者名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerName 所有者名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerName(String OwnerName) {
        this.OwnerName = OwnerName;
    }

    public MetaOwner() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetaOwner(MetaOwner source) {
        if (source.FullName != null) {
            this.FullName = new String(source.FullName);
        }
        if (source.OwnerType != null) {
            this.OwnerType = new String(source.OwnerType);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.OwnerName != null) {
            this.OwnerName = new String(source.OwnerName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FullName", this.FullName);
        this.setParamSimple(map, prefix + "OwnerType", this.OwnerType);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "OwnerName", this.OwnerName);

    }
}

