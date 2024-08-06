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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LifecycleInfo extends AbstractModel {

    /**
    * 生命周期值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Lifecycle")
    @Expose
    private Long Lifecycle;

    /**
    * 列名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Columns")
    @Expose
    private String [] Columns;

    /**
    * 日期格式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DateFormat")
    @Expose
    private String [] DateFormat;

    /**
     * Get 生命周期值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Lifecycle 生命周期值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLifecycle() {
        return this.Lifecycle;
    }

    /**
     * Set 生命周期值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Lifecycle 生命周期值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLifecycle(Long Lifecycle) {
        this.Lifecycle = Lifecycle;
    }

    /**
     * Get 列名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Columns 列名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getColumns() {
        return this.Columns;
    }

    /**
     * Set 列名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Columns 列名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumns(String [] Columns) {
        this.Columns = Columns;
    }

    /**
     * Get 日期格式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DateFormat 日期格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDateFormat() {
        return this.DateFormat;
    }

    /**
     * Set 日期格式
注意：此字段可能返回 null，表示取不到有效值。
     * @param DateFormat 日期格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDateFormat(String [] DateFormat) {
        this.DateFormat = DateFormat;
    }

    public LifecycleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LifecycleInfo(LifecycleInfo source) {
        if (source.Lifecycle != null) {
            this.Lifecycle = new Long(source.Lifecycle);
        }
        if (source.Columns != null) {
            this.Columns = new String[source.Columns.length];
            for (int i = 0; i < source.Columns.length; i++) {
                this.Columns[i] = new String(source.Columns[i]);
            }
        }
        if (source.DateFormat != null) {
            this.DateFormat = new String[source.DateFormat.length];
            for (int i = 0; i < source.DateFormat.length; i++) {
                this.DateFormat[i] = new String(source.DateFormat[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Lifecycle", this.Lifecycle);
        this.setParamArraySimple(map, prefix + "Columns.", this.Columns);
        this.setParamArraySimple(map, prefix + "DateFormat.", this.DateFormat);

    }
}

