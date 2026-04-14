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
package com.tencentcloudapi.hcm.v20181106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ItemCoord extends AbstractModel {

    /**
    * <p>算式高度（单位：px）</p>
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * <p>算式宽度（单位：px）</p>
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * <p>算式图的左上角横坐标</p>
    */
    @SerializedName("X")
    @Expose
    private Long X;

    /**
    * <p>算式图的左上角纵坐标</p>
    */
    @SerializedName("Y")
    @Expose
    private Long Y;

    /**
     * Get <p>算式高度（单位：px）</p> 
     * @return Height <p>算式高度（单位：px）</p>
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set <p>算式高度（单位：px）</p>
     * @param Height <p>算式高度（单位：px）</p>
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get <p>算式宽度（单位：px）</p> 
     * @return Width <p>算式宽度（单位：px）</p>
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set <p>算式宽度（单位：px）</p>
     * @param Width <p>算式宽度（单位：px）</p>
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get <p>算式图的左上角横坐标</p> 
     * @return X <p>算式图的左上角横坐标</p>
     */
    public Long getX() {
        return this.X;
    }

    /**
     * Set <p>算式图的左上角横坐标</p>
     * @param X <p>算式图的左上角横坐标</p>
     */
    public void setX(Long X) {
        this.X = X;
    }

    /**
     * Get <p>算式图的左上角纵坐标</p> 
     * @return Y <p>算式图的左上角纵坐标</p>
     */
    public Long getY() {
        return this.Y;
    }

    /**
     * Set <p>算式图的左上角纵坐标</p>
     * @param Y <p>算式图的左上角纵坐标</p>
     */
    public void setY(Long Y) {
        this.Y = Y;
    }

    public ItemCoord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ItemCoord(ItemCoord source) {
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.X != null) {
            this.X = new Long(source.X);
        }
        if (source.Y != null) {
            this.Y = new Long(source.Y);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "X", this.X);
        this.setParamSimple(map, prefix + "Y", this.Y);

    }
}

