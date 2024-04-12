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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class McuBackgroundCustomRender extends AbstractModel {

    /**
    * 自定义渲染画面的宽度，单位为像素值，需大于0，且不能超过子布局的宽。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 自定义渲染画面的高度，单位为像素值，需大于0，且不能超过子布局的高。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 自定义渲染画面的圆角半径，单位为像素值，不能超过渲染画面Width和Height最小值的一半，不指定默认为0，表示直角。
    */
    @SerializedName("Radius")
    @Expose
    private Long Radius;

    /**
     * Get 自定义渲染画面的宽度，单位为像素值，需大于0，且不能超过子布局的宽。 
     * @return Width 自定义渲染画面的宽度，单位为像素值，需大于0，且不能超过子布局的宽。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 自定义渲染画面的宽度，单位为像素值，需大于0，且不能超过子布局的宽。
     * @param Width 自定义渲染画面的宽度，单位为像素值，需大于0，且不能超过子布局的宽。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 自定义渲染画面的高度，单位为像素值，需大于0，且不能超过子布局的高。 
     * @return Height 自定义渲染画面的高度，单位为像素值，需大于0，且不能超过子布局的高。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 自定义渲染画面的高度，单位为像素值，需大于0，且不能超过子布局的高。
     * @param Height 自定义渲染画面的高度，单位为像素值，需大于0，且不能超过子布局的高。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 自定义渲染画面的圆角半径，单位为像素值，不能超过渲染画面Width和Height最小值的一半，不指定默认为0，表示直角。 
     * @return Radius 自定义渲染画面的圆角半径，单位为像素值，不能超过渲染画面Width和Height最小值的一半，不指定默认为0，表示直角。
     */
    public Long getRadius() {
        return this.Radius;
    }

    /**
     * Set 自定义渲染画面的圆角半径，单位为像素值，不能超过渲染画面Width和Height最小值的一半，不指定默认为0，表示直角。
     * @param Radius 自定义渲染画面的圆角半径，单位为像素值，不能超过渲染画面Width和Height最小值的一半，不指定默认为0，表示直角。
     */
    public void setRadius(Long Radius) {
        this.Radius = Radius;
    }

    public McuBackgroundCustomRender() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public McuBackgroundCustomRender(McuBackgroundCustomRender source) {
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Radius != null) {
            this.Radius = new Long(source.Radius);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Radius", this.Radius);

    }
}

