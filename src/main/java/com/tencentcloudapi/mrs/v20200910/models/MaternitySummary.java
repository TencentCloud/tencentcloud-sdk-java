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

public class MaternitySummary extends AbstractModel {

    /**
    * 胎儿数据结构
    */
    @SerializedName("Fetus")
    @Expose
    private Fetus [] Fetus;

    /**
    * 胎儿数量
    */
    @SerializedName("FetusNum")
    @Expose
    private FieldInfo FetusNum;

    /**
    * 病变
    */
    @SerializedName("Sym")
    @Expose
    private FieldInfo [] Sym;

    /**
    * 原文
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 坐标
    */
    @SerializedName("Coords")
    @Expose
    private Coord [] Coords;

    /**
     * Get 胎儿数据结构 
     * @return Fetus 胎儿数据结构
     */
    public Fetus [] getFetus() {
        return this.Fetus;
    }

    /**
     * Set 胎儿数据结构
     * @param Fetus 胎儿数据结构
     */
    public void setFetus(Fetus [] Fetus) {
        this.Fetus = Fetus;
    }

    /**
     * Get 胎儿数量 
     * @return FetusNum 胎儿数量
     */
    public FieldInfo getFetusNum() {
        return this.FetusNum;
    }

    /**
     * Set 胎儿数量
     * @param FetusNum 胎儿数量
     */
    public void setFetusNum(FieldInfo FetusNum) {
        this.FetusNum = FetusNum;
    }

    /**
     * Get 病变 
     * @return Sym 病变
     */
    public FieldInfo [] getSym() {
        return this.Sym;
    }

    /**
     * Set 病变
     * @param Sym 病变
     */
    public void setSym(FieldInfo [] Sym) {
        this.Sym = Sym;
    }

    /**
     * Get 原文 
     * @return Text 原文
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 原文
     * @param Text 原文
     */
    public void setText(String Text) {
        this.Text = Text;
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

    public MaternitySummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MaternitySummary(MaternitySummary source) {
        if (source.Fetus != null) {
            this.Fetus = new Fetus[source.Fetus.length];
            for (int i = 0; i < source.Fetus.length; i++) {
                this.Fetus[i] = new Fetus(source.Fetus[i]);
            }
        }
        if (source.FetusNum != null) {
            this.FetusNum = new FieldInfo(source.FetusNum);
        }
        if (source.Sym != null) {
            this.Sym = new FieldInfo[source.Sym.length];
            for (int i = 0; i < source.Sym.length; i++) {
                this.Sym[i] = new FieldInfo(source.Sym[i]);
            }
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
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
        this.setParamArrayObj(map, prefix + "Fetus.", this.Fetus);
        this.setParamObj(map, prefix + "FetusNum.", this.FetusNum);
        this.setParamArrayObj(map, prefix + "Sym.", this.Sym);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamArrayObj(map, prefix + "Coords.", this.Coords);

    }
}

