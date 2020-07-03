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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ItemCoord extends AbstractModel{

    /**
    * 左上角x
    */
    @SerializedName("X")
    @Expose
    private Long X;

    /**
    * 左上角y
    */
    @SerializedName("Y")
    @Expose
    private Long Y;

    /**
    * 宽width
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 高height
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
     * Get 左上角x 
     * @return X 左上角x
     */
    public Long getX() {
        return this.X;
    }

    /**
     * Set 左上角x
     * @param X 左上角x
     */
    public void setX(Long X) {
        this.X = X;
    }

    /**
     * Get 左上角y 
     * @return Y 左上角y
     */
    public Long getY() {
        return this.Y;
    }

    /**
     * Set 左上角y
     * @param Y 左上角y
     */
    public void setY(Long Y) {
        this.Y = Y;
    }

    /**
     * Get 宽width 
     * @return Width 宽width
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 宽width
     * @param Width 宽width
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 高height 
     * @return Height 高height
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 高height
     * @param Height 高height
     */
    public void setHeight(Long Height) {
        this.Height = Height;
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

