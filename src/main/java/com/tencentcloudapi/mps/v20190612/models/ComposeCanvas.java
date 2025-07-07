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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComposeCanvas extends AbstractModel {

    /**
    * 背景颜色对应的 RGB 参考值，取值格式： #RRGGBB，如 #F0F0F0 。 
默认值：#000000（黑色）。
    */
    @SerializedName("Color")
    @Expose
    private String Color;

    /**
    * 画布宽度，即输出视频的宽度，取值范围：0~ 3840，单位：px。  
默认值：0，表示和第一个视频宽度一致。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 画布高度，即输出视频的高度，取值范围：0~ 3840，单位：px。  
默认值：0，表示和第一个视频高度一致。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
     * Get 背景颜色对应的 RGB 参考值，取值格式： #RRGGBB，如 #F0F0F0 。 
默认值：#000000（黑色）。 
     * @return Color 背景颜色对应的 RGB 参考值，取值格式： #RRGGBB，如 #F0F0F0 。 
默认值：#000000（黑色）。
     */
    public String getColor() {
        return this.Color;
    }

    /**
     * Set 背景颜色对应的 RGB 参考值，取值格式： #RRGGBB，如 #F0F0F0 。 
默认值：#000000（黑色）。
     * @param Color 背景颜色对应的 RGB 参考值，取值格式： #RRGGBB，如 #F0F0F0 。 
默认值：#000000（黑色）。
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * Get 画布宽度，即输出视频的宽度，取值范围：0~ 3840，单位：px。  
默认值：0，表示和第一个视频宽度一致。 
     * @return Width 画布宽度，即输出视频的宽度，取值范围：0~ 3840，单位：px。  
默认值：0，表示和第一个视频宽度一致。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 画布宽度，即输出视频的宽度，取值范围：0~ 3840，单位：px。  
默认值：0，表示和第一个视频宽度一致。
     * @param Width 画布宽度，即输出视频的宽度，取值范围：0~ 3840，单位：px。  
默认值：0，表示和第一个视频宽度一致。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 画布高度，即输出视频的高度，取值范围：0~ 3840，单位：px。  
默认值：0，表示和第一个视频高度一致。 
     * @return Height 画布高度，即输出视频的高度，取值范围：0~ 3840，单位：px。  
默认值：0，表示和第一个视频高度一致。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 画布高度，即输出视频的高度，取值范围：0~ 3840，单位：px。  
默认值：0，表示和第一个视频高度一致。
     * @param Height 画布高度，即输出视频的高度，取值范围：0~ 3840，单位：px。  
默认值：0，表示和第一个视频高度一致。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    public ComposeCanvas() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComposeCanvas(ComposeCanvas source) {
        if (source.Color != null) {
            this.Color = new String(source.Color);
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
        this.setParamSimple(map, prefix + "Color", this.Color);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);

    }
}

