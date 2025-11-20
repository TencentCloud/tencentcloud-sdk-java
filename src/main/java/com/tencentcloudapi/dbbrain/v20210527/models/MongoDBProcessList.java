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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MongoDBProcessList extends AbstractModel {

    /**
    * 列名字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Names")
    @Expose
    private String [] Names;

    /**
    * 接口返回数据详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Data")
    @Expose
    private MongoDBProcessItem [] Data;

    /**
     * Get 列名字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Names 列名字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getNames() {
        return this.Names;
    }

    /**
     * Set 列名字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param Names 列名字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNames(String [] Names) {
        this.Names = Names;
    }

    /**
     * Get 接口返回数据详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Data 接口返回数据详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MongoDBProcessItem [] getData() {
        return this.Data;
    }

    /**
     * Set 接口返回数据详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param Data 接口返回数据详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setData(MongoDBProcessItem [] Data) {
        this.Data = Data;
    }

    public MongoDBProcessList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MongoDBProcessList(MongoDBProcessList source) {
        if (source.Names != null) {
            this.Names = new String[source.Names.length];
            for (int i = 0; i < source.Names.length; i++) {
                this.Names[i] = new String(source.Names[i]);
            }
        }
        if (source.Data != null) {
            this.Data = new MongoDBProcessItem[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new MongoDBProcessItem(source.Data[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Names.", this.Names);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);

    }
}

