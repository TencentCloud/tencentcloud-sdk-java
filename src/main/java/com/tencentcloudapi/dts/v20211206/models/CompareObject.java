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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CompareObject extends AbstractModel{

    /**
    * 对象模式 整实例-all,部分对象-partial
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ObjectMode")
    @Expose
    private String ObjectMode;

    /**
    * 对象列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ObjectItems")
    @Expose
    private CompareObjectItem [] ObjectItems;

    /**
    * 高级对象类型，如account(账号),index(索引),shardkey(片建，后面可能会调整),schema(库表结构)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdvancedObjects")
    @Expose
    private String [] AdvancedObjects;

    /**
     * Get 对象模式 整实例-all,部分对象-partial
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ObjectMode 对象模式 整实例-all,部分对象-partial
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getObjectMode() {
        return this.ObjectMode;
    }

    /**
     * Set 对象模式 整实例-all,部分对象-partial
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObjectMode 对象模式 整实例-all,部分对象-partial
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObjectMode(String ObjectMode) {
        this.ObjectMode = ObjectMode;
    }

    /**
     * Get 对象列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ObjectItems 对象列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CompareObjectItem [] getObjectItems() {
        return this.ObjectItems;
    }

    /**
     * Set 对象列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObjectItems 对象列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObjectItems(CompareObjectItem [] ObjectItems) {
        this.ObjectItems = ObjectItems;
    }

    /**
     * Get 高级对象类型，如account(账号),index(索引),shardkey(片建，后面可能会调整),schema(库表结构)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdvancedObjects 高级对象类型，如account(账号),index(索引),shardkey(片建，后面可能会调整),schema(库表结构)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAdvancedObjects() {
        return this.AdvancedObjects;
    }

    /**
     * Set 高级对象类型，如account(账号),index(索引),shardkey(片建，后面可能会调整),schema(库表结构)
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdvancedObjects 高级对象类型，如account(账号),index(索引),shardkey(片建，后面可能会调整),schema(库表结构)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdvancedObjects(String [] AdvancedObjects) {
        this.AdvancedObjects = AdvancedObjects;
    }

    public CompareObject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompareObject(CompareObject source) {
        if (source.ObjectMode != null) {
            this.ObjectMode = new String(source.ObjectMode);
        }
        if (source.ObjectItems != null) {
            this.ObjectItems = new CompareObjectItem[source.ObjectItems.length];
            for (int i = 0; i < source.ObjectItems.length; i++) {
                this.ObjectItems[i] = new CompareObjectItem(source.ObjectItems[i]);
            }
        }
        if (source.AdvancedObjects != null) {
            this.AdvancedObjects = new String[source.AdvancedObjects.length];
            for (int i = 0; i < source.AdvancedObjects.length; i++) {
                this.AdvancedObjects[i] = new String(source.AdvancedObjects[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ObjectMode", this.ObjectMode);
        this.setParamArrayObj(map, prefix + "ObjectItems.", this.ObjectItems);
        this.setParamArraySimple(map, prefix + "AdvancedObjects.", this.AdvancedObjects);

    }
}

