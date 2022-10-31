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
    * 迁移对象模式 all(所有迁移对象)，partial(部分对象迁移)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ObjectMode")
    @Expose
    private String ObjectMode;

    /**
    * 迁移对象库表配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ObjectItems")
    @Expose
    private CompareObjectItem [] ObjectItems;

    /**
     * Get 迁移对象模式 all(所有迁移对象)，partial(部分对象迁移)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ObjectMode 迁移对象模式 all(所有迁移对象)，partial(部分对象迁移)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getObjectMode() {
        return this.ObjectMode;
    }

    /**
     * Set 迁移对象模式 all(所有迁移对象)，partial(部分对象迁移)
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObjectMode 迁移对象模式 all(所有迁移对象)，partial(部分对象迁移)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObjectMode(String ObjectMode) {
        this.ObjectMode = ObjectMode;
    }

    /**
     * Get 迁移对象库表配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ObjectItems 迁移对象库表配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CompareObjectItem [] getObjectItems() {
        return this.ObjectItems;
    }

    /**
     * Set 迁移对象库表配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObjectItems 迁移对象库表配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObjectItems(CompareObjectItem [] ObjectItems) {
        this.ObjectItems = ObjectItems;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ObjectMode", this.ObjectMode);
        this.setParamArrayObj(map, prefix + "ObjectItems.", this.ObjectItems);

    }
}

