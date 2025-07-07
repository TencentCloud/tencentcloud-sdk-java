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
package com.tencentcloudapi.facefusion.v20220927.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FaceInfo extends AbstractModel {

    /**
    * 人脸框的横坐标
    */
    @SerializedName("X")
    @Expose
    private Long X;

    /**
    * 人脸框的纵坐标
    */
    @SerializedName("Y")
    @Expose
    private Long Y;

    /**
    * 人脸框的宽度
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 人脸框的高度
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
     * Get 人脸框的横坐标 
     * @return X 人脸框的横坐标
     */
    public Long getX() {
        return this.X;
    }

    /**
     * Set 人脸框的横坐标
     * @param X 人脸框的横坐标
     */
    public void setX(Long X) {
        this.X = X;
    }

    /**
     * Get 人脸框的纵坐标 
     * @return Y 人脸框的纵坐标
     */
    public Long getY() {
        return this.Y;
    }

    /**
     * Set 人脸框的纵坐标
     * @param Y 人脸框的纵坐标
     */
    public void setY(Long Y) {
        this.Y = Y;
    }

    /**
     * Get 人脸框的宽度 
     * @return Width 人脸框的宽度
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 人脸框的宽度
     * @param Width 人脸框的宽度
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 人脸框的高度 
     * @return Height 人脸框的高度
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 人脸框的高度
     * @param Height 人脸框的高度
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    public FaceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FaceInfo(FaceInfo source) {
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

