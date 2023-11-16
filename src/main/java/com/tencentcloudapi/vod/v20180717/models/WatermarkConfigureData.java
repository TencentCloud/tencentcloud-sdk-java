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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WatermarkConfigureData extends AbstractModel {

    /**
    * 是否启用水印。可取值：
<li>ON：表示启用水印；</li>
<li>OFF：表示关闭水印。</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 水印 Url。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 水印的宽度。
<li>字符串以 % 结尾，表示水印 Width 为视频宽度的百分比大小，如 10% 表示 Width 为视频宽度的 10%；</li>
    */
    @SerializedName("Width")
    @Expose
    private String Width;

    /**
    * 水印的高度。
<li>字符串以 % 结尾，表示水印 Height 为视频高度的百分比大小，如 10% 表示 Height 为视频高度的 10%；</li>
    */
    @SerializedName("Height")
    @Expose
    private String Height;

    /**
    * 水印原点距离视频图像坐标原点的水平位置。字符串以 % 结尾，表示水印 XPos 为视频宽度指定百分比，如 10% 表示 XPos 为视频宽度的 10%；
    */
    @SerializedName("XPos")
    @Expose
    private String XPos;

    /**
    * 水印原点距离视频图像坐标原点的垂直位置。当字符串以 % 结尾，表示水印 YPos 为视频高度指定百分比，如 10% 表示 YPos 为视频高度的 10%。
    */
    @SerializedName("YPos")
    @Expose
    private String YPos;

    /**
     * Get 是否启用水印。可取值：
<li>ON：表示启用水印；</li>
<li>OFF：表示关闭水印。</li> 
     * @return Switch 是否启用水印。可取值：
<li>ON：表示启用水印；</li>
<li>OFF：表示关闭水印。</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 是否启用水印。可取值：
<li>ON：表示启用水印；</li>
<li>OFF：表示关闭水印。</li>
     * @param Switch 是否启用水印。可取值：
<li>ON：表示启用水印；</li>
<li>OFF：表示关闭水印。</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 水印 Url。 
     * @return Url 水印 Url。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 水印 Url。
     * @param Url 水印 Url。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 水印的宽度。
<li>字符串以 % 结尾，表示水印 Width 为视频宽度的百分比大小，如 10% 表示 Width 为视频宽度的 10%；</li> 
     * @return Width 水印的宽度。
<li>字符串以 % 结尾，表示水印 Width 为视频宽度的百分比大小，如 10% 表示 Width 为视频宽度的 10%；</li>
     */
    public String getWidth() {
        return this.Width;
    }

    /**
     * Set 水印的宽度。
<li>字符串以 % 结尾，表示水印 Width 为视频宽度的百分比大小，如 10% 表示 Width 为视频宽度的 10%；</li>
     * @param Width 水印的宽度。
<li>字符串以 % 结尾，表示水印 Width 为视频宽度的百分比大小，如 10% 表示 Width 为视频宽度的 10%；</li>
     */
    public void setWidth(String Width) {
        this.Width = Width;
    }

    /**
     * Get 水印的高度。
<li>字符串以 % 结尾，表示水印 Height 为视频高度的百分比大小，如 10% 表示 Height 为视频高度的 10%；</li> 
     * @return Height 水印的高度。
<li>字符串以 % 结尾，表示水印 Height 为视频高度的百分比大小，如 10% 表示 Height 为视频高度的 10%；</li>
     */
    public String getHeight() {
        return this.Height;
    }

    /**
     * Set 水印的高度。
<li>字符串以 % 结尾，表示水印 Height 为视频高度的百分比大小，如 10% 表示 Height 为视频高度的 10%；</li>
     * @param Height 水印的高度。
<li>字符串以 % 结尾，表示水印 Height 为视频高度的百分比大小，如 10% 表示 Height 为视频高度的 10%；</li>
     */
    public void setHeight(String Height) {
        this.Height = Height;
    }

    /**
     * Get 水印原点距离视频图像坐标原点的水平位置。字符串以 % 结尾，表示水印 XPos 为视频宽度指定百分比，如 10% 表示 XPos 为视频宽度的 10%； 
     * @return XPos 水印原点距离视频图像坐标原点的水平位置。字符串以 % 结尾，表示水印 XPos 为视频宽度指定百分比，如 10% 表示 XPos 为视频宽度的 10%；
     */
    public String getXPos() {
        return this.XPos;
    }

    /**
     * Set 水印原点距离视频图像坐标原点的水平位置。字符串以 % 结尾，表示水印 XPos 为视频宽度指定百分比，如 10% 表示 XPos 为视频宽度的 10%；
     * @param XPos 水印原点距离视频图像坐标原点的水平位置。字符串以 % 结尾，表示水印 XPos 为视频宽度指定百分比，如 10% 表示 XPos 为视频宽度的 10%；
     */
    public void setXPos(String XPos) {
        this.XPos = XPos;
    }

    /**
     * Get 水印原点距离视频图像坐标原点的垂直位置。当字符串以 % 结尾，表示水印 YPos 为视频高度指定百分比，如 10% 表示 YPos 为视频高度的 10%。 
     * @return YPos 水印原点距离视频图像坐标原点的垂直位置。当字符串以 % 结尾，表示水印 YPos 为视频高度指定百分比，如 10% 表示 YPos 为视频高度的 10%。
     */
    public String getYPos() {
        return this.YPos;
    }

    /**
     * Set 水印原点距离视频图像坐标原点的垂直位置。当字符串以 % 结尾，表示水印 YPos 为视频高度指定百分比，如 10% 表示 YPos 为视频高度的 10%。
     * @param YPos 水印原点距离视频图像坐标原点的垂直位置。当字符串以 % 结尾，表示水印 YPos 为视频高度指定百分比，如 10% 表示 YPos 为视频高度的 10%。
     */
    public void setYPos(String YPos) {
        this.YPos = YPos;
    }

    public WatermarkConfigureData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WatermarkConfigureData(WatermarkConfigureData source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Width != null) {
            this.Width = new String(source.Width);
        }
        if (source.Height != null) {
            this.Height = new String(source.Height);
        }
        if (source.XPos != null) {
            this.XPos = new String(source.XPos);
        }
        if (source.YPos != null) {
            this.YPos = new String(source.YPos);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "XPos", this.XPos);
        this.setParamSimple(map, prefix + "YPos", this.YPos);

    }
}

