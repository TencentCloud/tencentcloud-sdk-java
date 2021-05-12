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

public class Coordinate extends AbstractModel{

    /**
    * 左上角横坐标
    */
    @SerializedName("Cx")
    @Expose
    private Long Cx;

    /**
    * 左上角纵坐标
    */
    @SerializedName("Cy")
    @Expose
    private Long Cy;

    /**
    * 高度
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 宽度
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
     * Get 左上角横坐标 
     * @return Cx 左上角横坐标
     */
    public Long getCx() {
        return this.Cx;
    }

    /**
     * Set 左上角横坐标
     * @param Cx 左上角横坐标
     */
    public void setCx(Long Cx) {
        this.Cx = Cx;
    }

    /**
     * Get 左上角纵坐标 
     * @return Cy 左上角纵坐标
     */
    public Long getCy() {
        return this.Cy;
    }

    /**
     * Set 左上角纵坐标
     * @param Cy 左上角纵坐标
     */
    public void setCy(Long Cy) {
        this.Cy = Cy;
    }

    /**
     * Get 高度 
     * @return Height 高度
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 高度
     * @param Height 高度
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 宽度 
     * @return Width 宽度
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 宽度
     * @param Width 宽度
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    public Coordinate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Coordinate(Coordinate source) {
        if (source.Cx != null) {
            this.Cx = new Long(source.Cx);
        }
        if (source.Cy != null) {
            this.Cy = new Long(source.Cy);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cx", this.Cx);
        this.setParamSimple(map, prefix + "Cy", this.Cy);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Width", this.Width);

    }
}

