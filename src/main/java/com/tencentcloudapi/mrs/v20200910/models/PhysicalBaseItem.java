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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PhysicalBaseItem extends AbstractModel {

    /**
    * 类型
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 原始文本
    */
    @SerializedName("Src")
    @Expose
    private String Src;

    /**
    * 归一化后值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 四点坐标
    */
    @SerializedName("Coords")
    @Expose
    private Coord [] Coords;

    /**
     * Get 类型 
     * @return Name 类型
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 类型
     * @param Name 类型
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 原始文本 
     * @return Src 原始文本
     */
    public String getSrc() {
        return this.Src;
    }

    /**
     * Set 原始文本
     * @param Src 原始文本
     */
    public void setSrc(String Src) {
        this.Src = Src;
    }

    /**
     * Get 归一化后值 
     * @return Value 归一化后值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 归一化后值
     * @param Value 归一化后值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 四点坐标 
     * @return Coords 四点坐标
     */
    public Coord [] getCoords() {
        return this.Coords;
    }

    /**
     * Set 四点坐标
     * @param Coords 四点坐标
     */
    public void setCoords(Coord [] Coords) {
        this.Coords = Coords;
    }

    public PhysicalBaseItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PhysicalBaseItem(PhysicalBaseItem source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Src != null) {
            this.Src = new String(source.Src);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Coords != null) {
            this.Coords = new Coord[source.Coords.length];
            for (int i = 0; i < source.Coords.length; i++) {
                this.Coords[i] = new Coord(source.Coords[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Src", this.Src);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamArrayObj(map, prefix + "Coords.", this.Coords);

    }
}

