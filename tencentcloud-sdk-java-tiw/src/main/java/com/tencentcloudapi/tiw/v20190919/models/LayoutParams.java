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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LayoutParams extends AbstractModel{

    /**
    * 流画面宽，取值范围[2,3000]
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 流画面高，取值范围[2,3000]
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 当前画面左上角顶点相对于Canvas左上角顶点的x轴偏移量，默认为0，取值范围[0,3000]
    */
    @SerializedName("X")
    @Expose
    private Long X;

    /**
    * 当前画面左上角顶点相对于Canvas左上角顶点的y轴偏移量，默认为0， 取值范围[0,3000]
    */
    @SerializedName("Y")
    @Expose
    private Long Y;

    /**
    * 画面z轴位置，默认为0
z轴确定了重叠画面的遮盖顺序，z轴值大的画面处于顶层
    */
    @SerializedName("ZOrder")
    @Expose
    private Long ZOrder;

    /**
     * Get 流画面宽，取值范围[2,3000] 
     * @return Width 流画面宽，取值范围[2,3000]
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 流画面宽，取值范围[2,3000]
     * @param Width 流画面宽，取值范围[2,3000]
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 流画面高，取值范围[2,3000] 
     * @return Height 流画面高，取值范围[2,3000]
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 流画面高，取值范围[2,3000]
     * @param Height 流画面高，取值范围[2,3000]
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 当前画面左上角顶点相对于Canvas左上角顶点的x轴偏移量，默认为0，取值范围[0,3000] 
     * @return X 当前画面左上角顶点相对于Canvas左上角顶点的x轴偏移量，默认为0，取值范围[0,3000]
     */
    public Long getX() {
        return this.X;
    }

    /**
     * Set 当前画面左上角顶点相对于Canvas左上角顶点的x轴偏移量，默认为0，取值范围[0,3000]
     * @param X 当前画面左上角顶点相对于Canvas左上角顶点的x轴偏移量，默认为0，取值范围[0,3000]
     */
    public void setX(Long X) {
        this.X = X;
    }

    /**
     * Get 当前画面左上角顶点相对于Canvas左上角顶点的y轴偏移量，默认为0， 取值范围[0,3000] 
     * @return Y 当前画面左上角顶点相对于Canvas左上角顶点的y轴偏移量，默认为0， 取值范围[0,3000]
     */
    public Long getY() {
        return this.Y;
    }

    /**
     * Set 当前画面左上角顶点相对于Canvas左上角顶点的y轴偏移量，默认为0， 取值范围[0,3000]
     * @param Y 当前画面左上角顶点相对于Canvas左上角顶点的y轴偏移量，默认为0， 取值范围[0,3000]
     */
    public void setY(Long Y) {
        this.Y = Y;
    }

    /**
     * Get 画面z轴位置，默认为0
z轴确定了重叠画面的遮盖顺序，z轴值大的画面处于顶层 
     * @return ZOrder 画面z轴位置，默认为0
z轴确定了重叠画面的遮盖顺序，z轴值大的画面处于顶层
     */
    public Long getZOrder() {
        return this.ZOrder;
    }

    /**
     * Set 画面z轴位置，默认为0
z轴确定了重叠画面的遮盖顺序，z轴值大的画面处于顶层
     * @param ZOrder 画面z轴位置，默认为0
z轴确定了重叠画面的遮盖顺序，z轴值大的画面处于顶层
     */
    public void setZOrder(Long ZOrder) {
        this.ZOrder = ZOrder;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "X", this.X);
        this.setParamSimple(map, prefix + "Y", this.Y);
        this.setParamSimple(map, prefix + "ZOrder", this.ZOrder);

    }
}

