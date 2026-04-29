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

public class CoordList extends AbstractModel {

    /**
    * <p>左上角坐标。</p>
    */
    @SerializedName("TopLeft")
    @Expose
    private Coord TopLeft;

    /**
    * <p>右上角坐标。</p>
    */
    @SerializedName("TopRight")
    @Expose
    private Coord TopRight;

    /**
    * <p>左下角坐标。</p>
    */
    @SerializedName("BottomLeft")
    @Expose
    private Coord BottomLeft;

    /**
    * <p>右下角坐标。</p>
    */
    @SerializedName("BottomRight")
    @Expose
    private Coord BottomRight;

    /**
     * Get <p>左上角坐标。</p> 
     * @return TopLeft <p>左上角坐标。</p>
     */
    public Coord getTopLeft() {
        return this.TopLeft;
    }

    /**
     * Set <p>左上角坐标。</p>
     * @param TopLeft <p>左上角坐标。</p>
     */
    public void setTopLeft(Coord TopLeft) {
        this.TopLeft = TopLeft;
    }

    /**
     * Get <p>右上角坐标。</p> 
     * @return TopRight <p>右上角坐标。</p>
     */
    public Coord getTopRight() {
        return this.TopRight;
    }

    /**
     * Set <p>右上角坐标。</p>
     * @param TopRight <p>右上角坐标。</p>
     */
    public void setTopRight(Coord TopRight) {
        this.TopRight = TopRight;
    }

    /**
     * Get <p>左下角坐标。</p> 
     * @return BottomLeft <p>左下角坐标。</p>
     */
    public Coord getBottomLeft() {
        return this.BottomLeft;
    }

    /**
     * Set <p>左下角坐标。</p>
     * @param BottomLeft <p>左下角坐标。</p>
     */
    public void setBottomLeft(Coord BottomLeft) {
        this.BottomLeft = BottomLeft;
    }

    /**
     * Get <p>右下角坐标。</p> 
     * @return BottomRight <p>右下角坐标。</p>
     */
    public Coord getBottomRight() {
        return this.BottomRight;
    }

    /**
     * Set <p>右下角坐标。</p>
     * @param BottomRight <p>右下角坐标。</p>
     */
    public void setBottomRight(Coord BottomRight) {
        this.BottomRight = BottomRight;
    }

    public CoordList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CoordList(CoordList source) {
        if (source.TopLeft != null) {
            this.TopLeft = new Coord(source.TopLeft);
        }
        if (source.TopRight != null) {
            this.TopRight = new Coord(source.TopRight);
        }
        if (source.BottomLeft != null) {
            this.BottomLeft = new Coord(source.BottomLeft);
        }
        if (source.BottomRight != null) {
            this.BottomRight = new Coord(source.BottomRight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TopLeft.", this.TopLeft);
        this.setParamObj(map, prefix + "TopRight.", this.TopRight);
        this.setParamObj(map, prefix + "BottomLeft.", this.BottomLeft);
        this.setParamObj(map, prefix + "BottomRight.", this.BottomRight);

    }
}

