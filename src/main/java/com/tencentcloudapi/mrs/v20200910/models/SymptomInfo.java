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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SymptomInfo extends AbstractModel {

    /**
    * 等级
    */
    @SerializedName("Grade")
    @Expose
    private BlockInfo Grade;

    /**
    * 部位
    */
    @SerializedName("Part")
    @Expose
    private Part Part;

    /**
    * 原文位置
    */
    @SerializedName("Index")
    @Expose
    private Long [] Index;

    /**
    * 病变
    */
    @SerializedName("Symptom")
    @Expose
    private BlockInfo Symptom;

    /**
    * 属性
    */
    @SerializedName("Attrs")
    @Expose
    private BlockInfo [] Attrs;

    /**
    * 原文
    */
    @SerializedName("Src")
    @Expose
    private String Src;

    /**
    * 坐标
    */
    @SerializedName("Coords")
    @Expose
    private Coord [] Coords;

    /**
     * Get 等级 
     * @return Grade 等级
     */
    public BlockInfo getGrade() {
        return this.Grade;
    }

    /**
     * Set 等级
     * @param Grade 等级
     */
    public void setGrade(BlockInfo Grade) {
        this.Grade = Grade;
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
     * Get 原文位置 
     * @return Index 原文位置
     */
    public Long [] getIndex() {
        return this.Index;
    }

    /**
     * Set 原文位置
     * @param Index 原文位置
     */
    public void setIndex(Long [] Index) {
        this.Index = Index;
    }

    /**
     * Get 病变 
     * @return Symptom 病变
     */
    public BlockInfo getSymptom() {
        return this.Symptom;
    }

    /**
     * Set 病变
     * @param Symptom 病变
     */
    public void setSymptom(BlockInfo Symptom) {
        this.Symptom = Symptom;
    }

    /**
     * Get 属性 
     * @return Attrs 属性
     */
    public BlockInfo [] getAttrs() {
        return this.Attrs;
    }

    /**
     * Set 属性
     * @param Attrs 属性
     */
    public void setAttrs(BlockInfo [] Attrs) {
        this.Attrs = Attrs;
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
     * Get 坐标 
     * @return Coords 坐标
     */
    public Coord [] getCoords() {
        return this.Coords;
    }

    /**
     * Set 坐标
     * @param Coords 坐标
     */
    public void setCoords(Coord [] Coords) {
        this.Coords = Coords;
    }

    public SymptomInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SymptomInfo(SymptomInfo source) {
        if (source.Grade != null) {
            this.Grade = new BlockInfo(source.Grade);
        }
        if (source.Part != null) {
            this.Part = new Part(source.Part);
        }
        if (source.Index != null) {
            this.Index = new Long[source.Index.length];
            for (int i = 0; i < source.Index.length; i++) {
                this.Index[i] = new Long(source.Index[i]);
            }
        }
        if (source.Symptom != null) {
            this.Symptom = new BlockInfo(source.Symptom);
        }
        if (source.Attrs != null) {
            this.Attrs = new BlockInfo[source.Attrs.length];
            for (int i = 0; i < source.Attrs.length; i++) {
                this.Attrs[i] = new BlockInfo(source.Attrs[i]);
            }
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
        this.setParamObj(map, prefix + "Grade.", this.Grade);
        this.setParamObj(map, prefix + "Part.", this.Part);
        this.setParamArraySimple(map, prefix + "Index.", this.Index);
        this.setParamObj(map, prefix + "Symptom.", this.Symptom);
        this.setParamArrayObj(map, prefix + "Attrs.", this.Attrs);
        this.setParamSimple(map, prefix + "Src", this.Src);
        this.setParamArrayObj(map, prefix + "Coords.", this.Coords);

    }
}

