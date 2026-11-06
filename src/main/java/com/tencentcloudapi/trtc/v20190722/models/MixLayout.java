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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MixLayout extends AbstractModel {

    /**
    * <p>画布上该画面左上角的 y 轴坐标，取值范围 [0, 1920]，不能超过画布的高。</p>
    */
    @SerializedName("Top")
    @Expose
    private Long Top;

    /**
    * <p>画布上该画面左上角的 x 轴坐标，取值范围 [0, 1920]，不能超过画布的宽。</p>
    */
    @SerializedName("Left")
    @Expose
    private Long Left;

    /**
    * <p>画布上该画面宽度的相对值，取值范围 [0, 1920]，与Left相加不应超过画布的宽。</p>
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * <p>画布上该画面高度的相对值，取值范围 [0, 1920]，与Top相加不应超过画布的高。</p>
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * <p>字符串内容为待显示在该画面的主播对应的UserId，如果不指定，会按照主播加入房间的顺序匹配。</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>画布的透明度值，取值范围[0, 255]。0表示不透明，255表示全透明。默认值为0。</p>
    */
    @SerializedName("Alpha")
    @Expose
    private Long Alpha;

    /**
    * <p>画布上该画面的渲染模式</p><p>枚举值：</p><ul><li>0： 拉伸模式，这个模式下整个视频内容会全部显示，并填满子画面，在源视频和目的视频宽高比不一致的时候，画面不会缺少内容，但是画面可能产生形变；</li><li>1： 剪裁模式（默认），这个模式下会严格按照目的视频的宽高比对源视频剪裁之后再拉伸，并填满子画面画布，在源视频和目的视频宽高比不一致的时候，画面保持不变形，但是会被剪裁；</li><li>2： 填黑模式，这个模式下会严格保持源视频的宽高比进行等比缩放，在源视频和目的视频宽高比不一致的时候，画面的上下侧边缘或者左右侧边缘会露出子画面画布的背景；</li><li>3： 智能拉伸模式，这个模式类似剪裁模式，区别是在源视频和目的视频宽高比不一致的时候，限制了最大剪裁比例为画面的宽度或者高度的20%；</li></ul>
    */
    @SerializedName("RenderMode")
    @Expose
    private Long RenderMode;

    /**
    * <p>对应订阅流的主辅路标识：<br>0：主流（默认）；<br>1：辅流；</p>
    */
    @SerializedName("MediaId")
    @Expose
    private Long MediaId;

    /**
    * <p>该画布的图层顺序, 这个值越小表示图层越靠后。默认值为0。</p>
    */
    @SerializedName("ImageLayer")
    @Expose
    private Long ImageLayer;

    /**
    * <p>图片的url地址， 只支持jpg, png, jpeg，图片分辨率限制不超过2K，图片大小限制不超过5MB。注意，url必须携带格式后缀，url内只支持特定的字符串, 范围是a-z A-Z 0-9 &#39;-&#39;, &#39;.&#39;, &#39;_&#39;, &#39;~&#39;, &#39;:&#39;, &#39;/&#39;, &#39;?&#39;, &#39;#&#39;, &#39;[&#39;, &#39;]&#39; &#39;@&#39;, &#39;!&#39;, &#39;&amp;&#39;, &#39;(&#39;, &#39;)&#39;, &#39;*&#39;, &#39;+&#39;, &#39;,&#39;, &#39;%&#39;, &#39;=&#39;</p>
    */
    @SerializedName("SubBackgroundImage")
    @Expose
    private String SubBackgroundImage;

    /**
     * Get <p>画布上该画面左上角的 y 轴坐标，取值范围 [0, 1920]，不能超过画布的高。</p> 
     * @return Top <p>画布上该画面左上角的 y 轴坐标，取值范围 [0, 1920]，不能超过画布的高。</p>
     */
    public Long getTop() {
        return this.Top;
    }

    /**
     * Set <p>画布上该画面左上角的 y 轴坐标，取值范围 [0, 1920]，不能超过画布的高。</p>
     * @param Top <p>画布上该画面左上角的 y 轴坐标，取值范围 [0, 1920]，不能超过画布的高。</p>
     */
    public void setTop(Long Top) {
        this.Top = Top;
    }

    /**
     * Get <p>画布上该画面左上角的 x 轴坐标，取值范围 [0, 1920]，不能超过画布的宽。</p> 
     * @return Left <p>画布上该画面左上角的 x 轴坐标，取值范围 [0, 1920]，不能超过画布的宽。</p>
     */
    public Long getLeft() {
        return this.Left;
    }

    /**
     * Set <p>画布上该画面左上角的 x 轴坐标，取值范围 [0, 1920]，不能超过画布的宽。</p>
     * @param Left <p>画布上该画面左上角的 x 轴坐标，取值范围 [0, 1920]，不能超过画布的宽。</p>
     */
    public void setLeft(Long Left) {
        this.Left = Left;
    }

    /**
     * Get <p>画布上该画面宽度的相对值，取值范围 [0, 1920]，与Left相加不应超过画布的宽。</p> 
     * @return Width <p>画布上该画面宽度的相对值，取值范围 [0, 1920]，与Left相加不应超过画布的宽。</p>
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set <p>画布上该画面宽度的相对值，取值范围 [0, 1920]，与Left相加不应超过画布的宽。</p>
     * @param Width <p>画布上该画面宽度的相对值，取值范围 [0, 1920]，与Left相加不应超过画布的宽。</p>
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get <p>画布上该画面高度的相对值，取值范围 [0, 1920]，与Top相加不应超过画布的高。</p> 
     * @return Height <p>画布上该画面高度的相对值，取值范围 [0, 1920]，与Top相加不应超过画布的高。</p>
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set <p>画布上该画面高度的相对值，取值范围 [0, 1920]，与Top相加不应超过画布的高。</p>
     * @param Height <p>画布上该画面高度的相对值，取值范围 [0, 1920]，与Top相加不应超过画布的高。</p>
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get <p>字符串内容为待显示在该画面的主播对应的UserId，如果不指定，会按照主播加入房间的顺序匹配。</p> 
     * @return UserId <p>字符串内容为待显示在该画面的主播对应的UserId，如果不指定，会按照主播加入房间的顺序匹配。</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>字符串内容为待显示在该画面的主播对应的UserId，如果不指定，会按照主播加入房间的顺序匹配。</p>
     * @param UserId <p>字符串内容为待显示在该画面的主播对应的UserId，如果不指定，会按照主播加入房间的顺序匹配。</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>画布的透明度值，取值范围[0, 255]。0表示不透明，255表示全透明。默认值为0。</p> 
     * @return Alpha <p>画布的透明度值，取值范围[0, 255]。0表示不透明，255表示全透明。默认值为0。</p>
     */
    public Long getAlpha() {
        return this.Alpha;
    }

    /**
     * Set <p>画布的透明度值，取值范围[0, 255]。0表示不透明，255表示全透明。默认值为0。</p>
     * @param Alpha <p>画布的透明度值，取值范围[0, 255]。0表示不透明，255表示全透明。默认值为0。</p>
     */
    public void setAlpha(Long Alpha) {
        this.Alpha = Alpha;
    }

    /**
     * Get <p>画布上该画面的渲染模式</p><p>枚举值：</p><ul><li>0： 拉伸模式，这个模式下整个视频内容会全部显示，并填满子画面，在源视频和目的视频宽高比不一致的时候，画面不会缺少内容，但是画面可能产生形变；</li><li>1： 剪裁模式（默认），这个模式下会严格按照目的视频的宽高比对源视频剪裁之后再拉伸，并填满子画面画布，在源视频和目的视频宽高比不一致的时候，画面保持不变形，但是会被剪裁；</li><li>2： 填黑模式，这个模式下会严格保持源视频的宽高比进行等比缩放，在源视频和目的视频宽高比不一致的时候，画面的上下侧边缘或者左右侧边缘会露出子画面画布的背景；</li><li>3： 智能拉伸模式，这个模式类似剪裁模式，区别是在源视频和目的视频宽高比不一致的时候，限制了最大剪裁比例为画面的宽度或者高度的20%；</li></ul> 
     * @return RenderMode <p>画布上该画面的渲染模式</p><p>枚举值：</p><ul><li>0： 拉伸模式，这个模式下整个视频内容会全部显示，并填满子画面，在源视频和目的视频宽高比不一致的时候，画面不会缺少内容，但是画面可能产生形变；</li><li>1： 剪裁模式（默认），这个模式下会严格按照目的视频的宽高比对源视频剪裁之后再拉伸，并填满子画面画布，在源视频和目的视频宽高比不一致的时候，画面保持不变形，但是会被剪裁；</li><li>2： 填黑模式，这个模式下会严格保持源视频的宽高比进行等比缩放，在源视频和目的视频宽高比不一致的时候，画面的上下侧边缘或者左右侧边缘会露出子画面画布的背景；</li><li>3： 智能拉伸模式，这个模式类似剪裁模式，区别是在源视频和目的视频宽高比不一致的时候，限制了最大剪裁比例为画面的宽度或者高度的20%；</li></ul>
     */
    public Long getRenderMode() {
        return this.RenderMode;
    }

    /**
     * Set <p>画布上该画面的渲染模式</p><p>枚举值：</p><ul><li>0： 拉伸模式，这个模式下整个视频内容会全部显示，并填满子画面，在源视频和目的视频宽高比不一致的时候，画面不会缺少内容，但是画面可能产生形变；</li><li>1： 剪裁模式（默认），这个模式下会严格按照目的视频的宽高比对源视频剪裁之后再拉伸，并填满子画面画布，在源视频和目的视频宽高比不一致的时候，画面保持不变形，但是会被剪裁；</li><li>2： 填黑模式，这个模式下会严格保持源视频的宽高比进行等比缩放，在源视频和目的视频宽高比不一致的时候，画面的上下侧边缘或者左右侧边缘会露出子画面画布的背景；</li><li>3： 智能拉伸模式，这个模式类似剪裁模式，区别是在源视频和目的视频宽高比不一致的时候，限制了最大剪裁比例为画面的宽度或者高度的20%；</li></ul>
     * @param RenderMode <p>画布上该画面的渲染模式</p><p>枚举值：</p><ul><li>0： 拉伸模式，这个模式下整个视频内容会全部显示，并填满子画面，在源视频和目的视频宽高比不一致的时候，画面不会缺少内容，但是画面可能产生形变；</li><li>1： 剪裁模式（默认），这个模式下会严格按照目的视频的宽高比对源视频剪裁之后再拉伸，并填满子画面画布，在源视频和目的视频宽高比不一致的时候，画面保持不变形，但是会被剪裁；</li><li>2： 填黑模式，这个模式下会严格保持源视频的宽高比进行等比缩放，在源视频和目的视频宽高比不一致的时候，画面的上下侧边缘或者左右侧边缘会露出子画面画布的背景；</li><li>3： 智能拉伸模式，这个模式类似剪裁模式，区别是在源视频和目的视频宽高比不一致的时候，限制了最大剪裁比例为画面的宽度或者高度的20%；</li></ul>
     */
    public void setRenderMode(Long RenderMode) {
        this.RenderMode = RenderMode;
    }

    /**
     * Get <p>对应订阅流的主辅路标识：<br>0：主流（默认）；<br>1：辅流；</p> 
     * @return MediaId <p>对应订阅流的主辅路标识：<br>0：主流（默认）；<br>1：辅流；</p>
     */
    public Long getMediaId() {
        return this.MediaId;
    }

    /**
     * Set <p>对应订阅流的主辅路标识：<br>0：主流（默认）；<br>1：辅流；</p>
     * @param MediaId <p>对应订阅流的主辅路标识：<br>0：主流（默认）；<br>1：辅流；</p>
     */
    public void setMediaId(Long MediaId) {
        this.MediaId = MediaId;
    }

    /**
     * Get <p>该画布的图层顺序, 这个值越小表示图层越靠后。默认值为0。</p> 
     * @return ImageLayer <p>该画布的图层顺序, 这个值越小表示图层越靠后。默认值为0。</p>
     */
    public Long getImageLayer() {
        return this.ImageLayer;
    }

    /**
     * Set <p>该画布的图层顺序, 这个值越小表示图层越靠后。默认值为0。</p>
     * @param ImageLayer <p>该画布的图层顺序, 这个值越小表示图层越靠后。默认值为0。</p>
     */
    public void setImageLayer(Long ImageLayer) {
        this.ImageLayer = ImageLayer;
    }

    /**
     * Get <p>图片的url地址， 只支持jpg, png, jpeg，图片分辨率限制不超过2K，图片大小限制不超过5MB。注意，url必须携带格式后缀，url内只支持特定的字符串, 范围是a-z A-Z 0-9 &#39;-&#39;, &#39;.&#39;, &#39;_&#39;, &#39;~&#39;, &#39;:&#39;, &#39;/&#39;, &#39;?&#39;, &#39;#&#39;, &#39;[&#39;, &#39;]&#39; &#39;@&#39;, &#39;!&#39;, &#39;&amp;&#39;, &#39;(&#39;, &#39;)&#39;, &#39;*&#39;, &#39;+&#39;, &#39;,&#39;, &#39;%&#39;, &#39;=&#39;</p> 
     * @return SubBackgroundImage <p>图片的url地址， 只支持jpg, png, jpeg，图片分辨率限制不超过2K，图片大小限制不超过5MB。注意，url必须携带格式后缀，url内只支持特定的字符串, 范围是a-z A-Z 0-9 &#39;-&#39;, &#39;.&#39;, &#39;_&#39;, &#39;~&#39;, &#39;:&#39;, &#39;/&#39;, &#39;?&#39;, &#39;#&#39;, &#39;[&#39;, &#39;]&#39; &#39;@&#39;, &#39;!&#39;, &#39;&amp;&#39;, &#39;(&#39;, &#39;)&#39;, &#39;*&#39;, &#39;+&#39;, &#39;,&#39;, &#39;%&#39;, &#39;=&#39;</p>
     */
    public String getSubBackgroundImage() {
        return this.SubBackgroundImage;
    }

    /**
     * Set <p>图片的url地址， 只支持jpg, png, jpeg，图片分辨率限制不超过2K，图片大小限制不超过5MB。注意，url必须携带格式后缀，url内只支持特定的字符串, 范围是a-z A-Z 0-9 &#39;-&#39;, &#39;.&#39;, &#39;_&#39;, &#39;~&#39;, &#39;:&#39;, &#39;/&#39;, &#39;?&#39;, &#39;#&#39;, &#39;[&#39;, &#39;]&#39; &#39;@&#39;, &#39;!&#39;, &#39;&amp;&#39;, &#39;(&#39;, &#39;)&#39;, &#39;*&#39;, &#39;+&#39;, &#39;,&#39;, &#39;%&#39;, &#39;=&#39;</p>
     * @param SubBackgroundImage <p>图片的url地址， 只支持jpg, png, jpeg，图片分辨率限制不超过2K，图片大小限制不超过5MB。注意，url必须携带格式后缀，url内只支持特定的字符串, 范围是a-z A-Z 0-9 &#39;-&#39;, &#39;.&#39;, &#39;_&#39;, &#39;~&#39;, &#39;:&#39;, &#39;/&#39;, &#39;?&#39;, &#39;#&#39;, &#39;[&#39;, &#39;]&#39; &#39;@&#39;, &#39;!&#39;, &#39;&amp;&#39;, &#39;(&#39;, &#39;)&#39;, &#39;*&#39;, &#39;+&#39;, &#39;,&#39;, &#39;%&#39;, &#39;=&#39;</p>
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

