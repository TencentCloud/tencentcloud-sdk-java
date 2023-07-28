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

public class McuVideoParams extends AbstractModel{

    /**
    * 输出流视频编码参数。
    */
    @SerializedName("VideoEncode")
    @Expose
    private VideoEncode VideoEncode;

    /**
    * 混流布局参数。
    */
    @SerializedName("LayoutParams")
    @Expose
    private McuLayoutParams LayoutParams;

    /**
    * 整个画布背景颜色，常用的颜色有：
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
    * 整个画布的背景图url，优先级高于BackGroundColor。
    */
    @SerializedName("BackgroundImageUrl")
    @Expose
    private String BackgroundImageUrl;

    /**
    * 混流布局的水印参数。
    */
    @SerializedName("WaterMarkList")
    @Expose
    private McuWaterMarkParams [] WaterMarkList;

    /**
    * 背景图在输出时的显示模式：0为裁剪，1为缩放并显示黑底，2为变比例伸缩。后台默认为变比例伸缩。
    */
    @SerializedName("BackgroundRenderMode")
    @Expose
    private Long BackgroundRenderMode;

    /**
     * Get 输出流视频编码参数。 
     * @return VideoEncode 输出流视频编码参数。
     */
    public VideoEncode getVideoEncode() {
        return this.VideoEncode;
    }

    /**
     * Set 输出流视频编码参数。
     * @param VideoEncode 输出流视频编码参数。
     */
    public void setVideoEncode(VideoEncode VideoEncode) {
        this.VideoEncode = VideoEncode;
    }

    /**
     * Get 混流布局参数。 
     * @return LayoutParams 混流布局参数。
     */
    public McuLayoutParams getLayoutParams() {
        return this.LayoutParams;
    }

    /**
     * Set 混流布局参数。
     * @param LayoutParams 混流布局参数。
     */
    public void setLayoutParams(McuLayoutParams LayoutParams) {
        this.LayoutParams = LayoutParams;
    }

    /**
     * Get 整个画布背景颜色，常用的颜色有：
红色：0xcc0033。
黄色：0xcc9900。
绿色：0xcccc33。
蓝色：0x99CCFF。
黑色：0x000000。
白色：0xFFFFFF。
灰色：0x999999。 
     * @return BackGroundColor 整个画布背景颜色，常用的颜色有：
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
     * Set 整个画布背景颜色，常用的颜色有：
红色：0xcc0033。
黄色：0xcc9900。
绿色：0xcccc33。
蓝色：0x99CCFF。
黑色：0x000000。
白色：0xFFFFFF。
灰色：0x999999。
     * @param BackGroundColor 整个画布背景颜色，常用的颜色有：
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
     * Get 整个画布的背景图url，优先级高于BackGroundColor。 
     * @return BackgroundImageUrl 整个画布的背景图url，优先级高于BackGroundColor。
     */
    public String getBackgroundImageUrl() {
        return this.BackgroundImageUrl;
    }

    /**
     * Set 整个画布的背景图url，优先级高于BackGroundColor。
     * @param BackgroundImageUrl 整个画布的背景图url，优先级高于BackGroundColor。
     */
    public void setBackgroundImageUrl(String BackgroundImageUrl) {
        this.BackgroundImageUrl = BackgroundImageUrl;
    }

    /**
     * Get 混流布局的水印参数。 
     * @return WaterMarkList 混流布局的水印参数。
     */
    public McuWaterMarkParams [] getWaterMarkList() {
        return this.WaterMarkList;
    }

    /**
     * Set 混流布局的水印参数。
     * @param WaterMarkList 混流布局的水印参数。
     */
    public void setWaterMarkList(McuWaterMarkParams [] WaterMarkList) {
        this.WaterMarkList = WaterMarkList;
    }

    /**
     * Get 背景图在输出时的显示模式：0为裁剪，1为缩放并显示黑底，2为变比例伸缩。后台默认为变比例伸缩。 
     * @return BackgroundRenderMode 背景图在输出时的显示模式：0为裁剪，1为缩放并显示黑底，2为变比例伸缩。后台默认为变比例伸缩。
     */
    public Long getBackgroundRenderMode() {
        return this.BackgroundRenderMode;
    }

    /**
     * Set 背景图在输出时的显示模式：0为裁剪，1为缩放并显示黑底，2为变比例伸缩。后台默认为变比例伸缩。
     * @param BackgroundRenderMode 背景图在输出时的显示模式：0为裁剪，1为缩放并显示黑底，2为变比例伸缩。后台默认为变比例伸缩。
     */
    public void setBackgroundRenderMode(Long BackgroundRenderMode) {
        this.BackgroundRenderMode = BackgroundRenderMode;
    }

    public McuVideoParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public McuVideoParams(McuVideoParams source) {
        if (source.VideoEncode != null) {
            this.VideoEncode = new VideoEncode(source.VideoEncode);
        }
        if (source.LayoutParams != null) {
            this.LayoutParams = new McuLayoutParams(source.LayoutParams);
        }
        if (source.BackGroundColor != null) {
            this.BackGroundColor = new String(source.BackGroundColor);
        }
        if (source.BackgroundImageUrl != null) {
            this.BackgroundImageUrl = new String(source.BackgroundImageUrl);
        }
        if (source.WaterMarkList != null) {
            this.WaterMarkList = new McuWaterMarkParams[source.WaterMarkList.length];
            for (int i = 0; i < source.WaterMarkList.length; i++) {
                this.WaterMarkList[i] = new McuWaterMarkParams(source.WaterMarkList[i]);
            }
        }
        if (source.BackgroundRenderMode != null) {
            this.BackgroundRenderMode = new Long(source.BackgroundRenderMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "VideoEncode.", this.VideoEncode);
        this.setParamObj(map, prefix + "LayoutParams.", this.LayoutParams);
        this.setParamSimple(map, prefix + "BackGroundColor", this.BackGroundColor);
        this.setParamSimple(map, prefix + "BackgroundImageUrl", this.BackgroundImageUrl);
        this.setParamArrayObj(map, prefix + "WaterMarkList.", this.WaterMarkList);
        this.setParamSimple(map, prefix + "BackgroundRenderMode", this.BackgroundRenderMode);

    }
}

