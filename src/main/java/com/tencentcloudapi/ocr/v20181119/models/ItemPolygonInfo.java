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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ItemPolygonInfo extends AbstractModel {

    /**
    * 发票的英文字段名称（如Title）
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 字段值所在位置的四点坐标
    */
    @SerializedName("Polygon")
    @Expose
    private Polygon Polygon;

    /**
    * 字段属于第几行，用于相同字段的排版，如发票明细表格项目，普通字段使用默认值为-1，表示无列排版。
    */
    @SerializedName("Row")
    @Expose
    private Long Row;

    /**
     * Get 发票的英文字段名称（如Title） 
     * @return Key 发票的英文字段名称（如Title）
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 发票的英文字段名称（如Title）
     * @param Key 发票的英文字段名称（如Title）
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 字段值所在位置的四点坐标 
     * @return Polygon 字段值所在位置的四点坐标
     */
    public Polygon getPolygon() {
        return this.Polygon;
    }

    /**
     * Set 字段值所在位置的四点坐标
     * @param Polygon 字段值所在位置的四点坐标
     */
    public void setPolygon(Polygon Polygon) {
        this.Polygon = Polygon;
    }

    /**
     * Get 字段属于第几行，用于相同字段的排版，如发票明细表格项目，普通字段使用默认值为-1，表示无列排版。 
     * @return Row 字段属于第几行，用于相同字段的排版，如发票明细表格项目，普通字段使用默认值为-1，表示无列排版。
     */
    public Long getRow() {
        return this.Row;
    }

    /**
     * Set 字段属于第几行，用于相同字段的排版，如发票明细表格项目，普通字段使用默认值为-1，表示无列排版。
     * @param Row 字段属于第几行，用于相同字段的排版，如发票明细表格项目，普通字段使用默认值为-1，表示无列排版。
     */
    public void setRow(Long Row) {
        this.Row = Row;
    }

    public ItemPolygonInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ItemPolygonInfo(ItemPolygonInfo source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Polygon != null) {
            this.Polygon = new Polygon(source.Polygon);
        }
        if (source.Row != null) {
            this.Row = new Long(source.Row);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamObj(map, prefix + "Polygon.", this.Polygon);
        this.setParamSimple(map, prefix + "Row", this.Row);

    }
}

