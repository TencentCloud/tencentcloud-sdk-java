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
package com.tencentcloudapi.hcm.v20181106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ItemCoord extends AbstractModel{

    /**
    * 算式高度
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 算式宽度
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 算式图的左上角横坐标
    */
    @SerializedName("X")
    @Expose
    private Long X;

    /**
    * 算式图的左上角纵坐标
    */
    @SerializedName("Y")
    @Expose
    private Long Y;

    /**
     * Get 算式高度 
     * @return Height 算式高度
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 算式高度
     * @param Height 算式高度
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 算式宽度 
     * @return Width 算式宽度
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 算式宽度
     * @param Width 算式宽度
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 算式图的左上角横坐标 
     * @return X 算式图的左上角横坐标
     */
    public Long getX() {
        return this.X;
    }

    /**
     * Set 算式图的左上角横坐标
     * @param X 算式图的左上角横坐标
     */
    public void setX(Long X) {
        this.X = X;
    }

    /**
     * Get 算式图的左上角纵坐标 
     * @return Y 算式图的左上角纵坐标
     */
    public Long getY() {
        return this.Y;
    }

    /**
     * Set 算式图的左上角纵坐标
     * @param Y 算式图的左上角纵坐标
     */
    public void setY(Long Y) {
        this.Y = Y;
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

