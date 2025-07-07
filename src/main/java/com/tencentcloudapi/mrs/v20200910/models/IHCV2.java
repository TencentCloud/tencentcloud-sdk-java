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

public class IHCV2 extends AbstractModel {

    /**
    * 索引
    */
    @SerializedName("Index")
    @Expose
    private Long [] Index;

    /**
    * 原文
    */
    @SerializedName("Src")
    @Expose
    private String Src;

    /**
    * ihc归一化
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * ihc详情
    */
    @SerializedName("Value")
    @Expose
    private Value Value;

    /**
    * 原文对应坐标
    */
    @SerializedName("Coords")
    @Expose
    private Coord [] Coords;

    /**
     * Get 索引 
     * @return Index 索引
     */
    public Long [] getIndex() {
        return this.Index;
    }

    /**
     * Set 索引
     * @param Index 索引
     */
    public void setIndex(Long [] Index) {
        this.Index = Index;
    }

    /**
     * Get 原文 
     * @return Src 原文
     */
    public String getSrc() {
        return this.Src;
    }

    /**
     * Set 原文
     * @param Src 原文
     */
    public void setSrc(String Src) {
        this.Src = Src;
    }

    /**
     * Get ihc归一化 
     * @return Name ihc归一化
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set ihc归一化
     * @param Name ihc归一化
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get ihc详情 
     * @return Value ihc详情
     */
    public Value getValue() {
        return this.Value;
    }

    /**
     * Set ihc详情
     * @param Value ihc详情
     */
    public void setValue(Value Value) {
        this.Value = Value;
    }

    /**
     * Get 原文对应坐标 
     * @return Coords 原文对应坐标
     */
    public Coord [] getCoords() {
        return this.Coords;
    }

    /**
     * Set 原文对应坐标
     * @param Coords 原文对应坐标
     */
    public void setCoords(Coord [] Coords) {
        this.Coords = Coords;
    }

    public IHCV2() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IHCV2(IHCV2 source) {
        if (source.Index != null) {
            this.Index = new Long[source.Index.length];
            for (int i = 0; i < source.Index.length; i++) {
                this.Index[i] = new Long(source.Index[i]);
            }
        }
        if (source.Src != null) {
            this.Src = new String(source.Src);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Value != null) {
            this.Value = new Value(source.Value);
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
        this.setParamArraySimple(map, prefix + "Index.", this.Index);
        this.setParamSimple(map, prefix + "Src", this.Src);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "Value.", this.Value);
        this.setParamArrayObj(map, prefix + "Coords.", this.Coords);

    }
}

