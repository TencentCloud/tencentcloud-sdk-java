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

public class ImageComposeCanvas extends AbstractModel {

    /**
    * <p>画布宽度，取值范围 [1, 10240]，需与 Height 同时设置。</p>
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * <p>画布高度，取值范围 [1, 10240]，需与 Width 同时设置。</p>
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * <p>画布底色，统一为 8 位十六进制 #RRGGBBAA（含 alpha），原样作为画布底色。缺省 #00000000（全透明）。示例：#FFFFFFFF 不透明白、#FFFFFF80 半透明白。</p><p>输出格式不支持透明通道时（如 JPEG），透明区域按该底色的 RGB 塌陷；缺省值会得到黑底，需要白底请显式传    #FFFFFFFF。</p>
    */
    @SerializedName("Background")
    @Expose
    private String Background;

    /**
     * Get <p>画布宽度，取值范围 [1, 10240]，需与 Height 同时设置。</p> 
     * @return Width <p>画布宽度，取值范围 [1, 10240]，需与 Height 同时设置。</p>
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set <p>画布宽度，取值范围 [1, 10240]，需与 Height 同时设置。</p>
     * @param Width <p>画布宽度，取值范围 [1, 10240]，需与 Height 同时设置。</p>
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get <p>画布高度，取值范围 [1, 10240]，需与 Width 同时设置。</p> 
     * @return Height <p>画布高度，取值范围 [1, 10240]，需与 Width 同时设置。</p>
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set <p>画布高度，取值范围 [1, 10240]，需与 Width 同时设置。</p>
     * @param Height <p>画布高度，取值范围 [1, 10240]，需与 Width 同时设置。</p>
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get <p>画布底色，统一为 8 位十六进制 #RRGGBBAA（含 alpha），原样作为画布底色。缺省 #00000000（全透明）。示例：#FFFFFFFF 不透明白、#FFFFFF80 半透明白。</p><p>输出格式不支持透明通道时（如 JPEG），透明区域按该底色的 RGB 塌陷；缺省值会得到黑底，需要白底请显式传    #FFFFFFFF。</p> 
     * @return Background <p>画布底色，统一为 8 位十六进制 #RRGGBBAA（含 alpha），原样作为画布底色。缺省 #00000000（全透明）。示例：#FFFFFFFF 不透明白、#FFFFFF80 半透明白。</p><p>输出格式不支持透明通道时（如 JPEG），透明区域按该底色的 RGB 塌陷；缺省值会得到黑底，需要白底请显式传    #FFFFFFFF。</p>
     */
    public String getBackground() {
        return this.Background;
    }

    /**
     * Set <p>画布底色，统一为 8 位十六进制 #RRGGBBAA（含 alpha），原样作为画布底色。缺省 #00000000（全透明）。示例：#FFFFFFFF 不透明白、#FFFFFF80 半透明白。</p><p>输出格式不支持透明通道时（如 JPEG），透明区域按该底色的 RGB 塌陷；缺省值会得到黑底，需要白底请显式传    #FFFFFFFF。</p>
     * @param Background <p>画布底色，统一为 8 位十六进制 #RRGGBBAA（含 alpha），原样作为画布底色。缺省 #00000000（全透明）。示例：#FFFFFFFF 不透明白、#FFFFFF80 半透明白。</p><p>输出格式不支持透明通道时（如 JPEG），透明区域按该底色的 RGB 塌陷；缺省值会得到黑底，需要白底请显式传    #FFFFFFFF。</p>
     */
    public void setBackground(String Background) {
        this.Background = Background;
    }

    public ImageComposeCanvas() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageComposeCanvas(ImageComposeCanvas source) {
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Background != null) {
            this.Background = new String(source.Background);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Background", this.Background);

    }
}

