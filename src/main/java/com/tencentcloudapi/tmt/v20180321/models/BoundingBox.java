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
package com.tencentcloudapi.tmt.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BoundingBox extends AbstractModel {

    /**
    * 左上顶点x坐标
    */
    @SerializedName("X")
    @Expose
    private Long X;

    /**
    * 左上顶点y坐标
    */
    @SerializedName("Y")
    @Expose
    private Long Y;

    /**
    * 宽
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 高
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
     * Get 左上顶点x坐标 
     * @return X 左上顶点x坐标
     */
    public Long getX() {
        return this.X;
    }

    /**
     * Set 左上顶点x坐标
     * @param X 左上顶点x坐标
     */
    public void setX(Long X) {
        this.X = X;
    }

    /**
     * Get 左上顶点y坐标 
     * @return Y 左上顶点y坐标
     */
    public Long getY() {
        return this.Y;
    }

    /**
     * Set 左上顶点y坐标
     * @param Y 左上顶点y坐标
     */
    public void setY(Long Y) {
        this.Y = Y;
    }

    /**
     * Get 宽 
     * @return Width 宽
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 宽
     * @param Width 宽
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 高 
     * @return Height 高
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 高
     * @param Height 高
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    public BoundingBox() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BoundingBox(BoundingBox source) {
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

