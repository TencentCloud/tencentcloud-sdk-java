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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RrectF extends AbstractModel{

    /**
    * logo横坐标
    */
    @SerializedName("Cx")
    @Expose
    private Float Cx;

    /**
    * logo纵坐标
    */
    @SerializedName("Cy")
    @Expose
    private Float Cy;

    /**
    * logo图标高度
    */
    @SerializedName("Height")
    @Expose
    private Float Height;

    /**
    * logo图标中心旋转度
    */
    @SerializedName("Rotate")
    @Expose
    private Float Rotate;

    /**
    * logo图标宽度
    */
    @SerializedName("Width")
    @Expose
    private Float Width;

    /**
     * Get logo横坐标 
     * @return Cx logo横坐标
     */
    public Float getCx() {
        return this.Cx;
    }

    /**
     * Set logo横坐标
     * @param Cx logo横坐标
     */
    public void setCx(Float Cx) {
        this.Cx = Cx;
    }

    /**
     * Get logo纵坐标 
     * @return Cy logo纵坐标
     */
    public Float getCy() {
        return this.Cy;
    }

    /**
     * Set logo纵坐标
     * @param Cy logo纵坐标
     */
    public void setCy(Float Cy) {
        this.Cy = Cy;
    }

    /**
     * Get logo图标高度 
     * @return Height logo图标高度
     */
    public Float getHeight() {
        return this.Height;
    }

    /**
     * Set logo图标高度
     * @param Height logo图标高度
     */
    public void setHeight(Float Height) {
        this.Height = Height;
    }

    /**
     * Get logo图标中心旋转度 
     * @return Rotate logo图标中心旋转度
     */
    public Float getRotate() {
        return this.Rotate;
    }

    /**
     * Set logo图标中心旋转度
     * @param Rotate logo图标中心旋转度
     */
    public void setRotate(Float Rotate) {
        this.Rotate = Rotate;
    }

    /**
     * Get logo图标宽度 
     * @return Width logo图标宽度
     */
    public Float getWidth() {
        return this.Width;
    }

    /**
     * Set logo图标宽度
     * @param Width logo图标宽度
     */
    public void setWidth(Float Width) {
        this.Width = Width;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cx", this.Cx);
        this.setParamSimple(map, prefix + "Cy", this.Cy);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Rotate", this.Rotate);
        this.setParamSimple(map, prefix + "Width", this.Width);

    }
}

