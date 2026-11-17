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

public class Polygon extends AbstractModel {

    /**
    * <p>左上顶点坐标</p>
    */
    @SerializedName("LeftTop")
    @Expose
    private Coord LeftTop;

    /**
    * <p>右上顶点坐标</p>
    */
    @SerializedName("RightTop")
    @Expose
    private Coord RightTop;

    /**
    * <p>右下顶点坐标</p>
    */
    @SerializedName("RightBottom")
    @Expose
    private Coord RightBottom;

    /**
    * <p>左下顶点坐标</p>
    */
    @SerializedName("LeftBottom")
    @Expose
    private Coord LeftBottom;

    /**
     * Get <p>左上顶点坐标</p> 
     * @return LeftTop <p>左上顶点坐标</p>
     */
    public Coord getLeftTop() {
        return this.LeftTop;
    }

    /**
     * Set <p>左上顶点坐标</p>
     * @param LeftTop <p>左上顶点坐标</p>
     */
    public void setLeftTop(Coord LeftTop) {
        this.LeftTop = LeftTop;
    }

    /**
     * Get <p>右上顶点坐标</p> 
     * @return RightTop <p>右上顶点坐标</p>
     */
    public Coord getRightTop() {
        return this.RightTop;
    }

    /**
     * Set <p>右上顶点坐标</p>
     * @param RightTop <p>右上顶点坐标</p>
     */
    public void setRightTop(Coord RightTop) {
        this.RightTop = RightTop;
    }

    /**
     * Get <p>右下顶点坐标</p> 
     * @return RightBottom <p>右下顶点坐标</p>
     */
    public Coord getRightBottom() {
        return this.RightBottom;
    }

    /**
     * Set <p>右下顶点坐标</p>
     * @param RightBottom <p>右下顶点坐标</p>
     */
    public void setRightBottom(Coord RightBottom) {
        this.RightBottom = RightBottom;
    }

    /**
     * Get <p>左下顶点坐标</p> 
     * @return LeftBottom <p>左下顶点坐标</p>
     */
    public Coord getLeftBottom() {
        return this.LeftBottom;
    }

    /**
     * Set <p>左下顶点坐标</p>
     * @param LeftBottom <p>左下顶点坐标</p>
     */
    public void setLeftBottom(Coord LeftBottom) {
        this.LeftBottom = LeftBottom;
    }

    public Polygon() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Polygon(Polygon source) {
        if (source.LeftTop != null) {
            this.LeftTop = new Coord(source.LeftTop);
        }
        if (source.RightTop != null) {
            this.RightTop = new Coord(source.RightTop);
        }
        if (source.RightBottom != null) {
            this.RightBottom = new Coord(source.RightBottom);
        }
        if (source.LeftBottom != null) {
            this.LeftBottom = new Coord(source.LeftBottom);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "LeftTop.", this.LeftTop);
        this.setParamObj(map, prefix + "RightTop.", this.RightTop);
        this.setParamObj(map, prefix + "RightBottom.", this.RightBottom);
        this.setParamObj(map, prefix + "LeftBottom.", this.LeftBottom);

    }
}

