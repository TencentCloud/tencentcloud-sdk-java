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
package com.tencentcloudapi.tiia.v20190529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Rect extends AbstractModel{

    /**
    * x轴坐标
    */
    @SerializedName("X")
    @Expose
    private Long X;

    /**
    * y轴坐标
    */
    @SerializedName("Y")
    @Expose
    private Long Y;

    /**
    * (x,y)坐标距离长度
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * (x,y)坐标距离高度
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
     * Get x轴坐标 
     * @return X x轴坐标
     */
    public Long getX() {
        return this.X;
    }

    /**
     * Set x轴坐标
     * @param X x轴坐标
     */
    public void setX(Long X) {
        this.X = X;
    }

    /**
     * Get y轴坐标 
     * @return Y y轴坐标
     */
    public Long getY() {
        return this.Y;
    }

    /**
     * Set y轴坐标
     * @param Y y轴坐标
     */
    public void setY(Long Y) {
        this.Y = Y;
    }

    /**
     * Get (x,y)坐标距离长度 
     * @return Width (x,y)坐标距离长度
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set (x,y)坐标距离长度
     * @param Width (x,y)坐标距离长度
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get (x,y)坐标距离高度 
     * @return Height (x,y)坐标距离高度
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set (x,y)坐标距离高度
     * @param Height (x,y)坐标距离高度
     */
    public void setHeight(Long Height) {
        this.Height = Height;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "X", this.X);
        this.setParamSimple(map, prefix + "Y", this.Y);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);

    }
}

