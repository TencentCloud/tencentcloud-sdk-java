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

public class InvasiveV2 extends AbstractModel {

    /**
    * 索引
    */
    @SerializedName("Index")
    @Expose
    private Long [] Index;

    /**
    * 部位
    */
    @SerializedName("Part")
    @Expose
    private Part Part;

    /**
    * 阴性或阳性
    */
    @SerializedName("Positive")
    @Expose
    private String Positive;

    /**
    * 原文
    */
    @SerializedName("Src")
    @Expose
    private String Src;

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
     * Get 部位 
     * @return Part 部位
     */
    public Part getPart() {
        return this.Part;
    }

    /**
     * Set 部位
     * @param Part 部位
     */
    public void setPart(Part Part) {
        this.Part = Part;
    }

    /**
     * Get 阴性或阳性 
     * @return Positive 阴性或阳性
     */
    public String getPositive() {
        return this.Positive;
    }

    /**
     * Set 阴性或阳性
     * @param Positive 阴性或阳性
     */
    public void setPositive(String Positive) {
        this.Positive = Positive;
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

    public InvasiveV2() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InvasiveV2(InvasiveV2 source) {
        if (source.Index != null) {
            this.Index = new Long[source.Index.length];
            for (int i = 0; i < source.Index.length; i++) {
                this.Index[i] = new Long(source.Index[i]);
            }
        }
        if (source.Part != null) {
            this.Part = new Part(source.Part);
        }
        if (source.Positive != null) {
            this.Positive = new String(source.Positive);
        }
        if (source.Src != null) {
            this.Src = new String(source.Src);
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
        this.setParamObj(map, prefix + "Part.", this.Part);
        this.setParamSimple(map, prefix + "Positive", this.Positive);
        this.setParamSimple(map, prefix + "Src", this.Src);
        this.setParamArrayObj(map, prefix + "Coords.", this.Coords);

    }
}

