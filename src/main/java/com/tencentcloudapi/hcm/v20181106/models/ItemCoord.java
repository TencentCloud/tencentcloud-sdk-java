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

public class ItemCoord  extends AbstractModel{

    /**
    * 算式高度
    */
    @SerializedName("Height")
    @Expose
    private Integer Height;

    /**
    * 算式宽度
    */
    @SerializedName("Width")
    @Expose
    private Integer Width;

    /**
    * 算式图的左上角横坐标
    */
    @SerializedName("X")
    @Expose
    private Integer X;

    /**
    * 算式图的左上角纵坐标
    */
    @SerializedName("Y")
    @Expose
    private Integer Y;

    /**
     * 获取算式高度
     * @return Height 算式高度
     */
    public Integer getHeight() {
        return this.Height;
    }

    /**
     * 设置算式高度
     * @param Height 算式高度
     */
    public void setHeight(Integer Height) {
        this.Height = Height;
    }

    /**
     * 获取算式宽度
     * @return Width 算式宽度
     */
    public Integer getWidth() {
        return this.Width;
    }

    /**
     * 设置算式宽度
     * @param Width 算式宽度
     */
    public void setWidth(Integer Width) {
        this.Width = Width;
    }

    /**
     * 获取算式图的左上角横坐标
     * @return X 算式图的左上角横坐标
     */
    public Integer getX() {
        return this.X;
    }

    /**
     * 设置算式图的左上角横坐标
     * @param X 算式图的左上角横坐标
     */
    public void setX(Integer X) {
        this.X = X;
    }

    /**
     * 获取算式图的左上角纵坐标
     * @return Y 算式图的左上角纵坐标
     */
    public Integer getY() {
        return this.Y;
    }

    /**
     * 设置算式图的左上角纵坐标
     * @param Y 算式图的左上角纵坐标
     */
    public void setY(Integer Y) {
        this.Y = Y;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "X", this.X);
        this.setParamSimple(map, prefix + "Y", this.Y);

    }
}

