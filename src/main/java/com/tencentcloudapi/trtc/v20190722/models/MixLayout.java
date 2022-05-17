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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MixLayout extends AbstractModel{

    /**
    * 画布上该画面左上角的 y 轴坐标，取值范围 [0, 1920]，不能超过画布的高。
    */
    @SerializedName("Top")
    @Expose
    private Long Top;

    /**
    * 画布上该画面左上角的 x 轴坐标，取值范围 [0, 1920]，不能超过画布的宽。
    */
    @SerializedName("Left")
    @Expose
    private Long Left;

    /**
    * 画布上该画面宽度的相对值，取值范围 [0, 1920]，与Left相加不应超过画布的宽。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 画布上该画面高度的相对值，取值范围 [0, 1920]，与Top相加不应超过画布的高。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 字符串内容为待显示在该画面的主播对应的UserId，如果不指定，会按照主播加入房间的顺序匹配。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 画布的透明度值，取值范围[0, 255]。0表示不透明，255表示全透明。默认值为0。
    */
    @SerializedName("Alpha")
    @Expose
    private Long Alpha;

    /**
    * 0 ：拉伸模式，这个模式下整个视频内容会全部显示，并填满子画面，在源视频和目的视频宽高比不一致的时候，画面不会缺少内容，但是画面可能产生形变；

1 ：剪裁模式（默认），这个模式下会严格按照目的视频的宽高比对源视频剪裁之后再拉伸，并填满子画面画布，在源视频和目的视频宽高比不一致的时候，画面保持不变形，但是会被剪裁；

2 ：填黑模式，这个模式下会严格保持源视频的宽高比进行等比缩放，在源视频和目的视频宽高比不一致的时候，画面的上下侧边缘或者左右侧边缘会露出子画面画布的背景；

3 ：智能拉伸模式，这个模式类似剪裁模式，区别是在源视频和目的视频宽高比不一致的时候，限制了最大剪裁比例为画面的宽度或者高度的20%；
    */
    @SerializedName("RenderMode")
    @Expose
    private Long RenderMode;

    /**
    * 对应订阅流的主辅路标识：
0：主流（默认）；
1：辅流；
    */
    @SerializedName("MediaId")
    @Expose
    private Long MediaId;

    /**
    * 该画布的图层顺序, 这个值越小表示图层越靠后。默认值为0。
    */
    @SerializedName("ImageLayer")
    @Expose
    private Long ImageLayer;

    /**
    * 下载的url地址， 只支持jpg， png，大小限制不超过5M，宽高比不一致的处理方案同 RenderMode。
    */
    @SerializedName("SubBackgroundImage")
    @Expose
    private String SubBackgroundImage;

    /**
     * Get 画布上该画面左上角的 y 轴坐标，取值范围 [0, 1920]，不能超过画布的高。 
     * @return Top 画布上该画面左上角的 y 轴坐标，取值范围 [0, 1920]，不能超过画布的高。
     */
    public Long getTop() {
        return this.Top;
    }

    /**
     * Set 画布上该画面左上角的 y 轴坐标，取值范围 [0, 1920]，不能超过画布的高。
     * @param Top 画布上该画面左上角的 y 轴坐标，取值范围 [0, 1920]，不能超过画布的高。
     */
    public void setTop(Long Top) {
        this.Top = Top;
    }

    /**
     * Get 画布上该画面左上角的 x 轴坐标，取值范围 [0, 1920]，不能超过画布的宽。 
     * @return Left 画布上该画面左上角的 x 轴坐标，取值范围 [0, 1920]，不能超过画布的宽。
     */
    public Long getLeft() {
        return this.Left;
    }

    /**
     * Set 画布上该画面左上角的 x 轴坐标，取值范围 [0, 1920]，不能超过画布的宽。
     * @param Left 画布上该画面左上角的 x 轴坐标，取值范围 [0, 1920]，不能超过画布的宽。
     */
    public void setLeft(Long Left) {
        this.Left = Left;
    }

    /**
     * Get 画布上该画面宽度的相对值，取值范围 [0, 1920]，与Left相加不应超过画布的宽。 
     * @return Width 画布上该画面宽度的相对值，取值范围 [0, 1920]，与Left相加不应超过画布的宽。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 画布上该画面宽度的相对值，取值范围 [0, 1920]，与Left相加不应超过画布的宽。
     * @param Width 画布上该画面宽度的相对值，取值范围 [0, 1920]，与Left相加不应超过画布的宽。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 画布上该画面高度的相对值，取值范围 [0, 1920]，与Top相加不应超过画布的高。 
     * @return Height 画布上该画面高度的相对值，取值范围 [0, 1920]，与Top相加不应超过画布的高。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 画布上该画面高度的相对值，取值范围 [0, 1920]，与Top相加不应超过画布的高。
     * @param Height 画布上该画面高度的相对值，取值范围 [0, 1920]，与Top相加不应超过画布的高。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 字符串内容为待显示在该画面的主播对应的UserId，如果不指定，会按照主播加入房间的顺序匹配。 
     * @return UserId 字符串内容为待显示在该画面的主播对应的UserId，如果不指定，会按照主播加入房间的顺序匹配。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 字符串内容为待显示在该画面的主播对应的UserId，如果不指定，会按照主播加入房间的顺序匹配。
     * @param UserId 字符串内容为待显示在该画面的主播对应的UserId，如果不指定，会按照主播加入房间的顺序匹配。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 画布的透明度值，取值范围[0, 255]。0表示不透明，255表示全透明。默认值为0。 
     * @return Alpha 画布的透明度值，取值范围[0, 255]。0表示不透明，255表示全透明。默认值为0。
     */
    public Long getAlpha() {
        return this.Alpha;
    }

    /**
     * Set 画布的透明度值，取值范围[0, 255]。0表示不透明，255表示全透明。默认值为0。
     * @param Alpha 画布的透明度值，取值范围[0, 255]。0表示不透明，255表示全透明。默认值为0。
     */
    public void setAlpha(Long Alpha) {
        this.Alpha = Alpha;
    }

    /**
     * Get 0 ：拉伸模式，这个模式下整个视频内容会全部显示，并填满子画面，在源视频和目的视频宽高比不一致的时候，画面不会缺少内容，但是画面可能产生形变；

1 ：剪裁模式（默认），这个模式下会严格按照目的视频的宽高比对源视频剪裁之后再拉伸，并填满子画面画布，在源视频和目的视频宽高比不一致的时候，画面保持不变形，但是会被剪裁；

2 ：填黑模式，这个模式下会严格保持源视频的宽高比进行等比缩放，在源视频和目的视频宽高比不一致的时候，画面的上下侧边缘或者左右侧边缘会露出子画面画布的背景；

3 ：智能拉伸模式，这个模式类似剪裁模式，区别是在源视频和目的视频宽高比不一致的时候，限制了最大剪裁比例为画面的宽度或者高度的20%； 
     * @return RenderMode 0 ：拉伸模式，这个模式下整个视频内容会全部显示，并填满子画面，在源视频和目的视频宽高比不一致的时候，画面不会缺少内容，但是画面可能产生形变；

1 ：剪裁模式（默认），这个模式下会严格按照目的视频的宽高比对源视频剪裁之后再拉伸，并填满子画面画布，在源视频和目的视频宽高比不一致的时候，画面保持不变形，但是会被剪裁；

2 ：填黑模式，这个模式下会严格保持源视频的宽高比进行等比缩放，在源视频和目的视频宽高比不一致的时候，画面的上下侧边缘或者左右侧边缘会露出子画面画布的背景；

3 ：智能拉伸模式，这个模式类似剪裁模式，区别是在源视频和目的视频宽高比不一致的时候，限制了最大剪裁比例为画面的宽度或者高度的20%；
     */
    public Long getRenderMode() {
        return this.RenderMode;
    }

    /**
     * Set 0 ：拉伸模式，这个模式下整个视频内容会全部显示，并填满子画面，在源视频和目的视频宽高比不一致的时候，画面不会缺少内容，但是画面可能产生形变；

1 ：剪裁模式（默认），这个模式下会严格按照目的视频的宽高比对源视频剪裁之后再拉伸，并填满子画面画布，在源视频和目的视频宽高比不一致的时候，画面保持不变形，但是会被剪裁；

2 ：填黑模式，这个模式下会严格保持源视频的宽高比进行等比缩放，在源视频和目的视频宽高比不一致的时候，画面的上下侧边缘或者左右侧边缘会露出子画面画布的背景；

3 ：智能拉伸模式，这个模式类似剪裁模式，区别是在源视频和目的视频宽高比不一致的时候，限制了最大剪裁比例为画面的宽度或者高度的20%；
     * @param RenderMode 0 ：拉伸模式，这个模式下整个视频内容会全部显示，并填满子画面，在源视频和目的视频宽高比不一致的时候，画面不会缺少内容，但是画面可能产生形变；

1 ：剪裁模式（默认），这个模式下会严格按照目的视频的宽高比对源视频剪裁之后再拉伸，并填满子画面画布，在源视频和目的视频宽高比不一致的时候，画面保持不变形，但是会被剪裁；

2 ：填黑模式，这个模式下会严格保持源视频的宽高比进行等比缩放，在源视频和目的视频宽高比不一致的时候，画面的上下侧边缘或者左右侧边缘会露出子画面画布的背景；

3 ：智能拉伸模式，这个模式类似剪裁模式，区别是在源视频和目的视频宽高比不一致的时候，限制了最大剪裁比例为画面的宽度或者高度的20%；
     */
    public void setRenderMode(Long RenderMode) {
        this.RenderMode = RenderMode;
    }

    /**
     * Get 对应订阅流的主辅路标识：
0：主流（默认）；
1：辅流； 
     * @return MediaId 对应订阅流的主辅路标识：
0：主流（默认）；
1：辅流；
     */
    public Long getMediaId() {
        return this.MediaId;
    }

    /**
     * Set 对应订阅流的主辅路标识：
0：主流（默认）；
1：辅流；
     * @param MediaId 对应订阅流的主辅路标识：
0：主流（默认）；
1：辅流；
     */
    public void setMediaId(Long MediaId) {
        this.MediaId = MediaId;
    }

    /**
     * Get 该画布的图层顺序, 这个值越小表示图层越靠后。默认值为0。 
     * @return ImageLayer 该画布的图层顺序, 这个值越小表示图层越靠后。默认值为0。
     */
    public Long getImageLayer() {
        return this.ImageLayer;
    }

    /**
     * Set 该画布的图层顺序, 这个值越小表示图层越靠后。默认值为0。
     * @param ImageLayer 该画布的图层顺序, 这个值越小表示图层越靠后。默认值为0。
     */
    public void setImageLayer(Long ImageLayer) {
        this.ImageLayer = ImageLayer;
    }

    /**
     * Get 下载的url地址， 只支持jpg， png，大小限制不超过5M，宽高比不一致的处理方案同 RenderMode。 
     * @return SubBackgroundImage 下载的url地址， 只支持jpg， png，大小限制不超过5M，宽高比不一致的处理方案同 RenderMode。
     */
    public String getSubBackgroundImage() {
        return this.SubBackgroundImage;
    }

    /**
     * Set 下载的url地址， 只支持jpg， png，大小限制不超过5M，宽高比不一致的处理方案同 RenderMode。
     * @param SubBackgroundImage 下载的url地址， 只支持jpg， png，大小限制不超过5M，宽高比不一致的处理方案同 RenderMode。
     */
    public void setSubBackgroundImage(String SubBackgroundImage) {
        this.SubBackgroundImage = SubBackgroundImage;
    }

    public MixLayout() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MixLayout(MixLayout source) {
        if (source.Top != null) {
            this.Top = new Long(source.Top);
        }
        if (source.Left != null) {
            this.Left = new Long(source.Left);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Alpha != null) {
            this.Alpha = new Long(source.Alpha);
        }
        if (source.RenderMode != null) {
            this.RenderMode = new Long(source.RenderMode);
        }
        if (source.MediaId != null) {
            this.MediaId = new Long(source.MediaId);
        }
        if (source.ImageLayer != null) {
            this.ImageLayer = new Long(source.ImageLayer);
        }
        if (source.SubBackgroundImage != null) {
            this.SubBackgroundImage = new String(source.SubBackgroundImage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Top", this.Top);
        this.setParamSimple(map, prefix + "Left", this.Left);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Alpha", this.Alpha);
        this.setParamSimple(map, prefix + "RenderMode", this.RenderMode);
        this.setParamSimple(map, prefix + "MediaId", this.MediaId);
        this.setParamSimple(map, prefix + "ImageLayer", this.ImageLayer);
        this.setParamSimple(map, prefix + "SubBackgroundImage", this.SubBackgroundImage);

    }
}

