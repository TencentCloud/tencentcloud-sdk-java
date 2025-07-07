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

public class EndoscopyOrgan extends AbstractModel {

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
    * 原文
    */
    @SerializedName("Src")
    @Expose
    private String Src;

    /**
    * 部位别名
    */
    @SerializedName("PartAlias")
    @Expose
    private String PartAlias;

    /**
    * 症状描述
    */
    @SerializedName("SymDescList")
    @Expose
    private BlockInfo [] SymDescList;

    /**
    * 坐标
    */
    @SerializedName("Coords")
    @Expose
    private Coord [] Coords;

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
     * Get 部位别名 
     * @return PartAlias 部位别名
     */
    public String getPartAlias() {
        return this.PartAlias;
    }

    /**
     * Set 部位别名
     * @param PartAlias 部位别名
     */
    public void setPartAlias(String PartAlias) {
        this.PartAlias = PartAlias;
    }

    /**
     * Get 症状描述 
     * @return SymDescList 症状描述
     */
    public BlockInfo [] getSymDescList() {
        return this.SymDescList;
    }

    /**
     * Set 症状描述
     * @param SymDescList 症状描述
     */
    public void setSymDescList(BlockInfo [] SymDescList) {
        this.SymDescList = SymDescList;
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

    public EndoscopyOrgan() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EndoscopyOrgan(EndoscopyOrgan source) {
        if (source.Part != null) {
            this.Part = new Part(source.Part);
        }
        if (source.Index != null) {
            this.Index = new Long[source.Index.length];
            for (int i = 0; i < source.Index.length; i++) {
                this.Index[i] = new Long(source.Index[i]);
            }
        }
        if (source.Src != null) {
            this.Src = new String(source.Src);
        }
        if (source.PartAlias != null) {
            this.PartAlias = new String(source.PartAlias);
        }
        if (source.SymDescList != null) {
            this.SymDescList = new BlockInfo[source.SymDescList.length];
            for (int i = 0; i < source.SymDescList.length; i++) {
                this.SymDescList[i] = new BlockInfo(source.SymDescList[i]);
            }
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
        this.setParamObj(map, prefix + "Part.", this.Part);
        this.setParamArraySimple(map, prefix + "Index.", this.Index);
        this.setParamSimple(map, prefix + "Src", this.Src);
        this.setParamSimple(map, prefix + "PartAlias", this.PartAlias);
        this.setParamArrayObj(map, prefix + "SymDescList.", this.SymDescList);
        this.setParamArrayObj(map, prefix + "Coords.", this.Coords);

    }
}

