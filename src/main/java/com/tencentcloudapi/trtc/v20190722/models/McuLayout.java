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

public class McuLayout extends AbstractModel {

    /**
    * 用户媒体流参数。不填时腾讯云后台按照上行主播的进房顺序自动填充。
    */
    @SerializedName("UserMediaStream")
    @Expose
    private UserMediaStream UserMediaStream;

    /**
    * 子画面在输出时的宽度，单位为像素值，不填默认为0。
    */
    @SerializedName("ImageWidth")
    @Expose
    private Long ImageWidth;

    /**
    * 子画面在输出时的高度，单位为像素值，不填默认为0。
    */
    @SerializedName("ImageHeight")
    @Expose
    private Long ImageHeight;

    /**
    * 子画面在输出时的X偏移，单位为像素值，LocationX与ImageWidth之和不能超过混流输出的总宽度，不填默认为0。
    */
    @SerializedName("LocationX")
    @Expose
    private Long LocationX;

    /**
    * 子画面在输出时的Y偏移，单位为像素值，LocationY与ImageHeight之和不能超过混流输出的总高度，不填默认为0。
    */
    @SerializedName("LocationY")
    @Expose
    private Long LocationY;

    /**
    * 子画面在输出时的层级，不填默认为0。
    */
    @SerializedName("ZOrder")
    @Expose
    private Long ZOrder;

    /**
    * 子画面在输出时的显示模式：0为裁剪，1为缩放并显示背景，2为缩放并显示黑底。不填默认为0。
    */
    @SerializedName("RenderMode")
    @Expose
    private Long RenderMode;

    /**
    * 【此参数配置无效，暂不支持】子画面的背景颜色，常用的颜色有：
红色：0xcc0033。
黄色：0xcc9900。
绿色：0xcccc33。
蓝色：0x99CCFF。
黑色：0x000000。
白色：0xFFFFFF。
灰色：0x999999。
    */
    @SerializedName("BackGroundColor")
    @Expose
    private String BackGroundColor;

    /**
    * 子画面的背景图url，填写该参数，当用户关闭摄像头或未进入TRTC房间时，会在布局位置填充为指定图片。若指定图片与布局位置尺寸比例不一致，则会对图片进行拉伸处理，优先级高于BackGroundColor。支持png、jpg、jpeg、bmp、gif、webm格式。图片大小限制不超过5MB。
注：您需要确保图片链接的可访问性，后台单次下载超时时间为10秒，最多重试3次，若最终图片下载失败，子画面的背景图将不会生效。
    */
    @SerializedName("BackgroundImageUrl")
    @Expose
    private String BackgroundImageUrl;

    /**
    * 客户自定义裁剪，针对原始输入流裁剪
    */
    @SerializedName("CustomCrop")
    @Expose
    private McuCustomCrop CustomCrop;

    /**
    * 子背景图在输出时的显示模式：0为裁剪，1为缩放并显示背景，2为缩放并显示黑底，3为变比例伸缩，4为自定义渲染。不填默认为3。
    */
    @SerializedName("BackgroundRenderMode")
    @Expose
    private Long BackgroundRenderMode;

    /**
    * 子画面的透明模版url，指向一张包含透明通道的模板图片。填写该参数，后台混流时会提取该模板图片的透明通道，将其缩放作为目标画面的透明通道，再和其他画面进行混合。您可以通过透明模版实现目标画面的半透明效果和任意形状裁剪（如圆角、星形、心形等）。 支持png格式。图片大小限制不超过5MB。
注：1，模板图片宽高比应接近目标画面宽高比，以避免缩放适配目标画面时出现模板效果变形；2，透明模版只有RenderMode为0（裁剪）时才生效；3，您需要确保图片链接的可访问性，后台单次下载超时时间为10秒，最多重试3次，若最终图片下载失败，透明模版将不会生效。
    */
    @SerializedName("TransparentUrl")
    @Expose
    private String TransparentUrl;

    /**
    * 子背景图的自定义渲染参数，当BackgroundRenderMode为4时必须配置。
    */
    @SerializedName("BackgroundCustomRender")
    @Expose
    private McuBackgroundCustomRender BackgroundCustomRender;

    /**
    * 子背景色生效模式，默认值为0表示均不生效。
bit0:占位图缩放是否生效。
bit1:上行流缩放是否生效。
您可以将相应bit位置1启动生效，例如：
0(00)表示子背景色不生效。
1(01)表示子背景色只在占位图缩放时生效。
2(10)表示子背景色只在上行流缩放时生效。
3(11)表示子背景色在占位图缩放和上行流缩放时均生效。

    */
    @SerializedName("BackGroundColorMode")
    @Expose
    private Long BackGroundColorMode;

    /**
     * Get 用户媒体流参数。不填时腾讯云后台按照上行主播的进房顺序自动填充。 
     * @return UserMediaStream 用户媒体流参数。不填时腾讯云后台按照上行主播的进房顺序自动填充。
     */
    public UserMediaStream getUserMediaStream() {
        return this.UserMediaStream;
    }

    /**
     * Set 用户媒体流参数。不填时腾讯云后台按照上行主播的进房顺序自动填充。
     * @param UserMediaStream 用户媒体流参数。不填时腾讯云后台按照上行主播的进房顺序自动填充。
     */
    public void setUserMediaStream(UserMediaStream UserMediaStream) {
        this.UserMediaStream = UserMediaStream;
    }

    /**
     * Get 子画面在输出时的宽度，单位为像素值，不填默认为0。 
     * @return ImageWidth 子画面在输出时的宽度，单位为像素值，不填默认为0。
     */
    public Long getImageWidth() {
        return this.ImageWidth;
    }

    /**
     * Set 子画面在输出时的宽度，单位为像素值，不填默认为0。
     * @param ImageWidth 子画面在输出时的宽度，单位为像素值，不填默认为0。
     */
    public void setImageWidth(Long ImageWidth) {
        this.ImageWidth = ImageWidth;
    }

    /**
     * Get 子画面在输出时的高度，单位为像素值，不填默认为0。 
     * @return ImageHeight 子画面在输出时的高度，单位为像素值，不填默认为0。
     */
    public Long getImageHeight() {
        return this.ImageHeight;
    }

    /**
     * Set 子画面在输出时的高度，单位为像素值，不填默认为0。
     * @param ImageHeight 子画面在输出时的高度，单位为像素值，不填默认为0。
     */
    public void setImageHeight(Long ImageHeight) {
        this.ImageHeight = ImageHeight;
    }

    /**
     * Get 子画面在输出时的X偏移，单位为像素值，LocationX与ImageWidth之和不能超过混流输出的总宽度，不填默认为0。 
     * @return LocationX 子画面在输出时的X偏移，单位为像素值，LocationX与ImageWidth之和不能超过混流输出的总宽度，不填默认为0。
     */
    public Long getLocationX() {
        return this.LocationX;
    }

    /**
     * Set 子画面在输出时的X偏移，单位为像素值，LocationX与ImageWidth之和不能超过混流输出的总宽度，不填默认为0。
     * @param LocationX 子画面在输出时的X偏移，单位为像素值，LocationX与ImageWidth之和不能超过混流输出的总宽度，不填默认为0。
     */
    public void setLocationX(Long LocationX) {
        this.LocationX = LocationX;
    }

    /**
     * Get 子画面在输出时的Y偏移，单位为像素值，LocationY与ImageHeight之和不能超过混流输出的总高度，不填默认为0。 
     * @return LocationY 子画面在输出时的Y偏移，单位为像素值，LocationY与ImageHeight之和不能超过混流输出的总高度，不填默认为0。
     */
    public Long getLocationY() {
        return this.LocationY;
    }

    /**
     * Set 子画面在输出时的Y偏移，单位为像素值，LocationY与ImageHeight之和不能超过混流输出的总高度，不填默认为0。
     * @param LocationY 子画面在输出时的Y偏移，单位为像素值，LocationY与ImageHeight之和不能超过混流输出的总高度，不填默认为0。
     */
    public void setLocationY(Long LocationY) {
        this.LocationY = LocationY;
    }

    /**
     * Get 子画面在输出时的层级，不填默认为0。 
     * @return ZOrder 子画面在输出时的层级，不填默认为0。
     */
    public Long getZOrder() {
        return this.ZOrder;
    }

    /**
     * Set 子画面在输出时的层级，不填默认为0。
     * @param ZOrder 子画面在输出时的层级，不填默认为0。
     */
    public void setZOrder(Long ZOrder) {
        this.ZOrder = ZOrder;
    }

    /**
     * Get 子画面在输出时的显示模式：0为裁剪，1为缩放并显示背景，2为缩放并显示黑底。不填默认为0。 
     * @return RenderMode 子画面在输出时的显示模式：0为裁剪，1为缩放并显示背景，2为缩放并显示黑底。不填默认为0。
     */
    public Long getRenderMode() {
        return this.RenderMode;
    }

    /**
     * Set 子画面在输出时的显示模式：0为裁剪，1为缩放并显示背景，2为缩放并显示黑底。不填默认为0。
     * @param RenderMode 子画面在输出时的显示模式：0为裁剪，1为缩放并显示背景，2为缩放并显示黑底。不填默认为0。
     */
    public void setRenderMode(Long RenderMode) {
        this.RenderMode = RenderMode;
    }

    /**
     * Get 【此参数配置无效，暂不支持】子画面的背景颜色，常用的颜色有：
红色：0xcc0033。
黄色：0xcc9900。
绿色：0xcccc33。
蓝色：0x99CCFF。
黑色：0x000000。
白色：0xFFFFFF。
灰色：0x999999。 
     * @return BackGroundColor 【此参数配置无效，暂不支持】子画面的背景颜色，常用的颜色有：
红色：0xcc0033。
黄色：0xcc9900。
绿色：0xcccc33。
蓝色：0x99CCFF。
黑色：0x000000。
白色：0xFFFFFF。
灰色：0x999999。
     */
    public String getBackGroundColor() {
        return this.BackGroundColor;
    }

    /**
     * Set 【此参数配置无效，暂不支持】子画面的背景颜色，常用的颜色有：
红色：0xcc0033。
黄色：0xcc9900。
绿色：0xcccc33。
蓝色：0x99CCFF。
黑色：0x000000。
白色：0xFFFFFF。
灰色：0x999999。
     * @param BackGroundColor 【此参数配置无效，暂不支持】子画面的背景颜色，常用的颜色有：
红色：0xcc0033。
黄色：0xcc9900。
绿色：0xcccc33。
蓝色：0x99CCFF。
黑色：0x000000。
白色：0xFFFFFF。
灰色：0x999999。
     */
    public void setBackGroundColor(String BackGroundColor) {
        this.BackGroundColor = BackGroundColor;
    }

    /**
     * Get 子画面的背景图url，填写该参数，当用户关闭摄像头或未进入TRTC房间时，会在布局位置填充为指定图片。若指定图片与布局位置尺寸比例不一致，则会对图片进行拉伸处理，优先级高于BackGroundColor。支持png、jpg、jpeg、bmp、gif、webm格式。图片大小限制不超过5MB。
注：您需要确保图片链接的可访问性，后台单次下载超时时间为10秒，最多重试3次，若最终图片下载失败，子画面的背景图将不会生效。 
     * @return BackgroundImageUrl 子画面的背景图url，填写该参数，当用户关闭摄像头或未进入TRTC房间时，会在布局位置填充为指定图片。若指定图片与布局位置尺寸比例不一致，则会对图片进行拉伸处理，优先级高于BackGroundColor。支持png、jpg、jpeg、bmp、gif、webm格式。图片大小限制不超过5MB。
注：您需要确保图片链接的可访问性，后台单次下载超时时间为10秒，最多重试3次，若最终图片下载失败，子画面的背景图将不会生效。
     */
    public String getBackgroundImageUrl() {
        return this.BackgroundImageUrl;
    }

    /**
     * Set 子画面的背景图url，填写该参数，当用户关闭摄像头或未进入TRTC房间时，会在布局位置填充为指定图片。若指定图片与布局位置尺寸比例不一致，则会对图片进行拉伸处理，优先级高于BackGroundColor。支持png、jpg、jpeg、bmp、gif、webm格式。图片大小限制不超过5MB。
注：您需要确保图片链接的可访问性，后台单次下载超时时间为10秒，最多重试3次，若最终图片下载失败，子画面的背景图将不会生效。
     * @param BackgroundImageUrl 子画面的背景图url，填写该参数，当用户关闭摄像头或未进入TRTC房间时，会在布局位置填充为指定图片。若指定图片与布局位置尺寸比例不一致，则会对图片进行拉伸处理，优先级高于BackGroundColor。支持png、jpg、jpeg、bmp、gif、webm格式。图片大小限制不超过5MB。
注：您需要确保图片链接的可访问性，后台单次下载超时时间为10秒，最多重试3次，若最终图片下载失败，子画面的背景图将不会生效。
     */
    public void setBackgroundImageUrl(String BackgroundImageUrl) {
        this.BackgroundImageUrl = BackgroundImageUrl;
    }

    /**
     * Get 客户自定义裁剪，针对原始输入流裁剪 
     * @return CustomCrop 客户自定义裁剪，针对原始输入流裁剪
     */
    public McuCustomCrop getCustomCrop() {
        return this.CustomCrop;
    }

    /**
     * Set 客户自定义裁剪，针对原始输入流裁剪
     * @param CustomCrop 客户自定义裁剪，针对原始输入流裁剪
     */
    public void setCustomCrop(McuCustomCrop CustomCrop) {
        this.CustomCrop = CustomCrop;
    }

    /**
     * Get 子背景图在输出时的显示模式：0为裁剪，1为缩放并显示背景，2为缩放并显示黑底，3为变比例伸缩，4为自定义渲染。不填默认为3。 
     * @return BackgroundRenderMode 子背景图在输出时的显示模式：0为裁剪，1为缩放并显示背景，2为缩放并显示黑底，3为变比例伸缩，4为自定义渲染。不填默认为3。
     */
    public Long getBackgroundRenderMode() {
        return this.BackgroundRenderMode;
    }

    /**
     * Set 子背景图在输出时的显示模式：0为裁剪，1为缩放并显示背景，2为缩放并显示黑底，3为变比例伸缩，4为自定义渲染。不填默认为3。
     * @param BackgroundRenderMode 子背景图在输出时的显示模式：0为裁剪，1为缩放并显示背景，2为缩放并显示黑底，3为变比例伸缩，4为自定义渲染。不填默认为3。
     */
    public void setBackgroundRenderMode(Long BackgroundRenderMode) {
        this.BackgroundRenderMode = BackgroundRenderMode;
    }

    /**
     * Get 子画面的透明模版url，指向一张包含透明通道的模板图片。填写该参数，后台混流时会提取该模板图片的透明通道，将其缩放作为目标画面的透明通道，再和其他画面进行混合。您可以通过透明模版实现目标画面的半透明效果和任意形状裁剪（如圆角、星形、心形等）。 支持png格式。图片大小限制不超过5MB。
注：1，模板图片宽高比应接近目标画面宽高比，以避免缩放适配目标画面时出现模板效果变形；2，透明模版只有RenderMode为0（裁剪）时才生效；3，您需要确保图片链接的可访问性，后台单次下载超时时间为10秒，最多重试3次，若最终图片下载失败，透明模版将不会生效。 
     * @return TransparentUrl 子画面的透明模版url，指向一张包含透明通道的模板图片。填写该参数，后台混流时会提取该模板图片的透明通道，将其缩放作为目标画面的透明通道，再和其他画面进行混合。您可以通过透明模版实现目标画面的半透明效果和任意形状裁剪（如圆角、星形、心形等）。 支持png格式。图片大小限制不超过5MB。
注：1，模板图片宽高比应接近目标画面宽高比，以避免缩放适配目标画面时出现模板效果变形；2，透明模版只有RenderMode为0（裁剪）时才生效；3，您需要确保图片链接的可访问性，后台单次下载超时时间为10秒，最多重试3次，若最终图片下载失败，透明模版将不会生效。
     */
    public String getTransparentUrl() {
        return this.TransparentUrl;
    }

    /**
     * Set 子画面的透明模版url，指向一张包含透明通道的模板图片。填写该参数，后台混流时会提取该模板图片的透明通道，将其缩放作为目标画面的透明通道，再和其他画面进行混合。您可以通过透明模版实现目标画面的半透明效果和任意形状裁剪（如圆角、星形、心形等）。 支持png格式。图片大小限制不超过5MB。
注：1，模板图片宽高比应接近目标画面宽高比，以避免缩放适配目标画面时出现模板效果变形；2，透明模版只有RenderMode为0（裁剪）时才生效；3，您需要确保图片链接的可访问性，后台单次下载超时时间为10秒，最多重试3次，若最终图片下载失败，透明模版将不会生效。
     * @param TransparentUrl 子画面的透明模版url，指向一张包含透明通道的模板图片。填写该参数，后台混流时会提取该模板图片的透明通道，将其缩放作为目标画面的透明通道，再和其他画面进行混合。您可以通过透明模版实现目标画面的半透明效果和任意形状裁剪（如圆角、星形、心形等）。 支持png格式。图片大小限制不超过5MB。
注：1，模板图片宽高比应接近目标画面宽高比，以避免缩放适配目标画面时出现模板效果变形；2，透明模版只有RenderMode为0（裁剪）时才生效；3，您需要确保图片链接的可访问性，后台单次下载超时时间为10秒，最多重试3次，若最终图片下载失败，透明模版将不会生效。
     */
    public void setTransparentUrl(String TransparentUrl) {
        this.TransparentUrl = TransparentUrl;
    }

    /**
     * Get 子背景图的自定义渲染参数，当BackgroundRenderMode为4时必须配置。 
     * @return BackgroundCustomRender 子背景图的自定义渲染参数，当BackgroundRenderMode为4时必须配置。
     */
    public McuBackgroundCustomRender getBackgroundCustomRender() {
        return this.BackgroundCustomRender;
    }

    /**
     * Set 子背景图的自定义渲染参数，当BackgroundRenderMode为4时必须配置。
     * @param BackgroundCustomRender 子背景图的自定义渲染参数，当BackgroundRenderMode为4时必须配置。
     */
    public void setBackgroundCustomRender(McuBackgroundCustomRender BackgroundCustomRender) {
        this.BackgroundCustomRender = BackgroundCustomRender;
    }

    /**
     * Get 子背景色生效模式，默认值为0表示均不生效。
bit0:占位图缩放是否生效。
bit1:上行流缩放是否生效。
您可以将相应bit位置1启动生效，例如：
0(00)表示子背景色不生效。
1(01)表示子背景色只在占位图缩放时生效。
2(10)表示子背景色只在上行流缩放时生效。
3(11)表示子背景色在占位图缩放和上行流缩放时均生效。
 
     * @return BackGroundColorMode 子背景色生效模式，默认值为0表示均不生效。
bit0:占位图缩放是否生效。
bit1:上行流缩放是否生效。
您可以将相应bit位置1启动生效，例如：
0(00)表示子背景色不生效。
1(01)表示子背景色只在占位图缩放时生效。
2(10)表示子背景色只在上行流缩放时生效。
3(11)表示子背景色在占位图缩放和上行流缩放时均生效。

     */
    public Long getBackGroundColorMode() {
        return this.BackGroundColorMode;
    }

    /**
     * Set 子背景色生效模式，默认值为0表示均不生效。
bit0:占位图缩放是否生效。
bit1:上行流缩放是否生效。
您可以将相应bit位置1启动生效，例如：
0(00)表示子背景色不生效。
1(01)表示子背景色只在占位图缩放时生效。
2(10)表示子背景色只在上行流缩放时生效。
3(11)表示子背景色在占位图缩放和上行流缩放时均生效。

     * @param BackGroundColorMode 子背景色生效模式，默认值为0表示均不生效。
bit0:占位图缩放是否生效。
bit1:上行流缩放是否生效。
您可以将相应bit位置1启动生效，例如：
0(00)表示子背景色不生效。
1(01)表示子背景色只在占位图缩放时生效。
2(10)表示子背景色只在上行流缩放时生效。
3(11)表示子背景色在占位图缩放和上行流缩放时均生效。

     */
    public void setBackGroundColorMode(Long BackGroundColorMode) {
        this.BackGroundColorMode = BackGroundColorMode;
    }

    public McuLayout() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public McuLayout(McuLayout source) {
        if (source.UserMediaStream != null) {
            this.UserMediaStream = new UserMediaStream(source.UserMediaStream);
        }
        if (source.ImageWidth != null) {
            this.ImageWidth = new Long(source.ImageWidth);
        }
        if (source.ImageHeight != null) {
            this.ImageHeight = new Long(source.ImageHeight);
        }
        if (source.LocationX != null) {
            this.LocationX = new Long(source.LocationX);
        }
        if (source.LocationY != null) {
            this.LocationY = new Long(source.LocationY);
        }
        if (source.ZOrder != null) {
            this.ZOrder = new Long(source.ZOrder);
        }
        if (source.RenderMode != null) {
            this.RenderMode = new Long(source.RenderMode);
        }
        if (source.BackGroundColor != null) {
            this.BackGroundColor = new String(source.BackGroundColor);
        }
        if (source.BackgroundImageUrl != null) {
            this.BackgroundImageUrl = new String(source.BackgroundImageUrl);
        }
        if (source.CustomCrop != null) {
            this.CustomCrop = new McuCustomCrop(source.CustomCrop);
        }
        if (source.BackgroundRenderMode != null) {
            this.BackgroundRenderMode = new Long(source.BackgroundRenderMode);
        }
        if (source.TransparentUrl != null) {
            this.TransparentUrl = new String(source.TransparentUrl);
        }
        if (source.BackgroundCustomRender != null) {
            this.BackgroundCustomRender = new McuBackgroundCustomRender(source.BackgroundCustomRender);
        }
        if (source.BackGroundColorMode != null) {
            this.BackGroundColorMode = new Long(source.BackGroundColorMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "UserMediaStream.", this.UserMediaStream);
        this.setParamSimple(map, prefix + "ImageWidth", this.ImageWidth);
        this.setParamSimple(map, prefix + "ImageHeight", this.ImageHeight);
        this.setParamSimple(map, prefix + "LocationX", this.LocationX);
        this.setParamSimple(map, prefix + "LocationY", this.LocationY);
        this.setParamSimple(map, prefix + "ZOrder", this.ZOrder);
        this.setParamSimple(map, prefix + "RenderMode", this.RenderMode);
        this.setParamSimple(map, prefix + "BackGroundColor", this.BackGroundColor);
        this.setParamSimple(map, prefix + "BackgroundImageUrl", this.BackgroundImageUrl);
        this.setParamObj(map, prefix + "CustomCrop.", this.CustomCrop);
        this.setParamSimple(map, prefix + "BackgroundRenderMode", this.BackgroundRenderMode);
        this.setParamSimple(map, prefix + "TransparentUrl", this.TransparentUrl);
        this.setParamObj(map, prefix + "BackgroundCustomRender.", this.BackgroundCustomRender);
        this.setParamSimple(map, prefix + "BackGroundColorMode", this.BackGroundColorMode);

    }
}

