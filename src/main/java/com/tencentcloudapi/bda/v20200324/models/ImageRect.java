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
package com.tencentcloudapi.bda.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageRect extends AbstractModel {

    /**
    * 左上角横坐标。
    */
    @SerializedName("X")
    @Expose
    private Long X;

    /**
    * 左上角纵坐标。
    */
    @SerializedName("Y")
    @Expose
    private Long Y;

    /**
    * 人体宽度。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 人体高度。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 分割选项名称。
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
     * Get 左上角横坐标。 
     * @return X 左上角横坐标。
     */
    public Long getX() {
        return this.X;
    }

    /**
     * Set 左上角横坐标。
     * @param X 左上角横坐标。
     */
    public void setX(Long X) {
        this.X = X;
    }

    /**
     * Get 左上角纵坐标。 
     * @return Y 左上角纵坐标。
     */
    public Long getY() {
        return this.Y;
    }

    /**
     * Set 左上角纵坐标。
     * @param Y 左上角纵坐标。
     */
    public void setY(Long Y) {
        this.Y = Y;
    }

    /**
     * Get 人体宽度。 
     * @return Width 人体宽度。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 人体宽度。
     * @param Width 人体宽度。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 人体高度。 
     * @return Height 人体高度。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 人体高度。
     * @param Height 人体高度。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 分割选项名称。 
     * @return Label 分割选项名称。
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 分割选项名称。
     * @param Label 分割选项名称。
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    public ImageRect() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageRect(ImageRect source) {
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
        if (source.Label != null) {
            this.Label = new String(source.Label);
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
        this.setParamSimple(map, prefix + "Label", this.Label);

    }
}

