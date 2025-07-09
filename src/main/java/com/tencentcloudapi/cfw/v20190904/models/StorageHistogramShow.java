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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StorageHistogramShow extends AbstractModel {

    /**
    * 存储类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageType")
    @Expose
    private String [] StorageType;

    /**
    * 日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Dates")
    @Expose
    private String [] Dates;

    /**
    * 数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Data")
    @Expose
    private IntArray [] Data;

    /**
     * Get 存储类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageType 存储类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getStorageType() {
        return this.StorageType;
    }

    /**
     * Set 存储类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageType 存储类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageType(String [] StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get 日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Dates 日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDates() {
        return this.Dates;
    }

    /**
     * Set 日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param Dates 日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDates(String [] Dates) {
        this.Dates = Dates;
    }

    /**
     * Get 数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Data 数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IntArray [] getData() {
        return this.Data;
    }

    /**
     * Set 数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param Data 数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setData(IntArray [] Data) {
        this.Data = Data;
    }

    public StorageHistogramShow() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StorageHistogramShow(StorageHistogramShow source) {
        if (source.StorageType != null) {
            this.StorageType = new String[source.StorageType.length];
            for (int i = 0; i < source.StorageType.length; i++) {
                this.StorageType[i] = new String(source.StorageType[i]);
            }
        }
        if (source.Dates != null) {
            this.Dates = new String[source.Dates.length];
            for (int i = 0; i < source.Dates.length; i++) {
                this.Dates[i] = new String(source.Dates[i]);
            }
        }
        if (source.Data != null) {
            this.Data = new IntArray[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new IntArray(source.Data[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "StorageType.", this.StorageType);
        this.setParamArraySimple(map, prefix + "Dates.", this.Dates);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);

    }
}

