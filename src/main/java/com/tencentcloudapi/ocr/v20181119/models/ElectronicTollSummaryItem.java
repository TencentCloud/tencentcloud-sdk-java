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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ElectronicTollSummaryItem extends AbstractModel {

    /**
    * 票面key值
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 票面value值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 字段所在行，下标从0开始，非行字段或未能识别行号的返回-1
    */
    @SerializedName("Row")
    @Expose
    private Long Row;

    /**
     * Get 票面key值 
     * @return Name 票面key值
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 票面key值
     * @param Name 票面key值
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 票面value值 
     * @return Value 票面value值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 票面value值
     * @param Value 票面value值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 字段所在行，下标从0开始，非行字段或未能识别行号的返回-1 
     * @return Row 字段所在行，下标从0开始，非行字段或未能识别行号的返回-1
     */
    public Long getRow() {
        return this.Row;
    }

    /**
     * Set 字段所在行，下标从0开始，非行字段或未能识别行号的返回-1
     * @param Row 字段所在行，下标从0开始，非行字段或未能识别行号的返回-1
     */
    public void setRow(Long Row) {
        this.Row = Row;
    }

    public ElectronicTollSummaryItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ElectronicTollSummaryItem(ElectronicTollSummaryItem source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Row != null) {
            this.Row = new Long(source.Row);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Row", this.Row);

    }
}

