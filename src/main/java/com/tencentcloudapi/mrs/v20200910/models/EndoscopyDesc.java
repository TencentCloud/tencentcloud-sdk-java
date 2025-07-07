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

public class EndoscopyDesc extends AbstractModel {

    /**
    * 描述内容
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 器官
    */
    @SerializedName("Organ")
    @Expose
    private EndoscopyOrgan [] Organ;

    /**
    * 坐标
    */
    @SerializedName("Coords")
    @Expose
    private Coord [] Coords;

    /**
     * Get 描述内容 
     * @return Text 描述内容
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 描述内容
     * @param Text 描述内容
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 器官 
     * @return Organ 器官
     */
    public EndoscopyOrgan [] getOrgan() {
        return this.Organ;
    }

    /**
     * Set 器官
     * @param Organ 器官
     */
    public void setOrgan(EndoscopyOrgan [] Organ) {
        this.Organ = Organ;
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

    public EndoscopyDesc() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EndoscopyDesc(EndoscopyDesc source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Organ != null) {
            this.Organ = new EndoscopyOrgan[source.Organ.length];
            for (int i = 0; i < source.Organ.length; i++) {
                this.Organ[i] = new EndoscopyOrgan(source.Organ[i]);
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
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamArrayObj(map, prefix + "Organ.", this.Organ);
        this.setParamArrayObj(map, prefix + "Coords.", this.Coords);

    }
}

