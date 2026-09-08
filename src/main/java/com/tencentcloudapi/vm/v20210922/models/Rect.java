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
package com.tencentcloudapi.vm.v20210922.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Rect extends AbstractModel {

    /**
    * <p>X坐标</p>
    */
    @SerializedName("X")
    @Expose
    private Long X;

    /**
    * <p>Y坐标</p>
    */
    @SerializedName("Y")
    @Expose
    private Long Y;

    /**
    * <p>宽</p>
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * <p>高</p>
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * <p>旋转角度</p>
    */
    @SerializedName("Rotate")
    @Expose
    private Long Rotate;

    /**
     * Get <p>X坐标</p> 
     * @return X <p>X坐标</p>
     */
    public Long getX() {
        return this.X;
    }

    /**
     * Set <p>X坐标</p>
     * @param X <p>X坐标</p>
     */
    public void setX(Long X) {
        this.X = X;
    }

    /**
     * Get <p>Y坐标</p> 
     * @return Y <p>Y坐标</p>
     */
    public Long getY() {
        return this.Y;
    }

    /**
     * Set <p>Y坐标</p>
     * @param Y <p>Y坐标</p>
     */
    public void setY(Long Y) {
        this.Y = Y;
    }

    /**
     * Get <p>宽</p> 
     * @return Width <p>宽</p>
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set <p>宽</p>
     * @param Width <p>宽</p>
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get <p>高</p> 
     * @return Height <p>高</p>
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set <p>高</p>
     * @param Height <p>高</p>
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get <p>旋转角度</p> 
     * @return Rotate <p>旋转角度</p>
     */
    public Long getRotate() {
        return this.Rotate;
    }

    /**
     * Set <p>旋转角度</p>
     * @param Rotate <p>旋转角度</p>
     */
    public void setRotate(Long Rotate) {
        this.Rotate = Rotate;
    }

    public Rect() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Rect(Rect source) {
        if (source.X != null) {
            this.X = new Long(source.X);
        }
        if (source.Y != null) {
            this.Y = new Long(source.Y);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Rotate != null) {
            this.Rotate = new Long(source.Rotate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "X", this.X);
        this.setParamSimple(map, prefix + "Y", this.Y);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Rotate", this.Rotate);

    }
}

