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

public class McuLayout extends AbstractModel{

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
    * 子画面的背景图url，填写该参数，当用户关闭摄像头或未进入TRTC房间时，会在布局位置填充为指定图片。若指定图片与布局位置尺寸比例不一致，则会对图片进行拉伸处理，优先级高于BackGroundColor。
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
    * 子背景图在输出时的显示模式：0为裁剪，1为缩放并显示背景，2为缩放并显示黑底，3为变比例伸缩。不填默认为3。
    */
    @SerializedName("BackgroundRenderMode")
    @Expose
    private Long BackgroundRenderMode;

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
     * Get 子画面的背景图url，填写该参数，当用户关闭摄像头或未进入TRTC房间时，会在布局位置填充为指定图片。若指定图片与布局位置尺寸比例不一致，则会对图片进行拉伸处理，优先级高于BackGroundColor。 
     * @return BackgroundImageUrl 子画面的背景图url，填写该参数，当用户关闭摄像头或未进入TRTC房间时，会在布局位置填充为指定图片。若指定图片与布局位置尺寸比例不一致，则会对图片进行拉伸处理，优先级高于BackGroundColor。
     */
    public String getBackgroundImageUrl() {
        return this.BackgroundImageUrl;
    }

    /**
     * Set 子画面的背景图url，填写该参数，当用户关闭摄像头或未进入TRTC房间时，会在布局位置填充为指定图片。若指定图片与布局位置尺寸比例不一致，则会对图片进行拉伸处理，优先级高于BackGroundColor。
     * @param BackgroundImageUrl 子画面的背景图url，填写该参数，当用户关闭摄像头或未进入TRTC房间时，会在布局位置填充为指定图片。若指定图片与布局位置尺寸比例不一致，则会对图片进行拉伸处理，优先级高于BackGroundColor。
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
     * Get 子背景图在输出时的显示模式：0为裁剪，1为缩放并显示背景，2为缩放并显示黑底，3为变比例伸缩。不填默认为3。 
     * @return BackgroundRenderMode 子背景图在输出时的显示模式：0为裁剪，1为缩放并显示背景，2为缩放并显示黑底，3为变比例伸缩。不填默认为3。
     */
    public Long getBackgroundRenderMode() {
        return this.BackgroundRenderMode;
    }

    /**
     * Set 子背景图在输出时的显示模式：0为裁剪，1为缩放并显示背景，2为缩放并显示黑底，3为变比例伸缩。不填默认为3。
     * @param BackgroundRenderMode 子背景图在输出时的显示模式：0为裁剪，1为缩放并显示背景，2为缩放并显示黑底，3为变比例伸缩。不填默认为3。
     */
    public void setBackgroundRenderMode(Long BackgroundRenderMode) {
        this.BackgroundRenderMode = BackgroundRenderMode;
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

    }
}

