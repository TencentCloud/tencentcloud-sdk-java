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

public class PresetLayoutConfig extends AbstractModel{

    /**
    * 指定显示在该画面上的用户ID。如果不指定用户ID，会按照用户加入房间的顺序自动匹配PresetLayoutConfig中的画面设置。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 当该画面指定用户时，代表用户的流类型。0为摄像头，1为屏幕分享。小画面为web用户时此值填0。
    */
    @SerializedName("StreamType")
    @Expose
    private Long StreamType;

    /**
    * 该画面在输出时的宽度，单位为像素值，不填默认为0。
    */
    @SerializedName("ImageWidth")
    @Expose
    private Long ImageWidth;

    /**
    * 该画面在输出时的高度，单位为像素值，不填默认为0。
    */
    @SerializedName("ImageHeight")
    @Expose
    private Long ImageHeight;

    /**
    * 该画面在输出时的X偏移，单位为像素值，LocationX与ImageWidth之和不能超过混流输出的总宽度，不填默认为0。
    */
    @SerializedName("LocationX")
    @Expose
    private Long LocationX;

    /**
    * 该画面在输出时的Y偏移，单位为像素值，LocationY与ImageHeight之和不能超过混流输出的总高度，不填默认为0。
    */
    @SerializedName("LocationY")
    @Expose
    private Long LocationY;

    /**
    * 该画面在输出时的层级，不填默认为0。
    */
    @SerializedName("ZOrder")
    @Expose
    private Long ZOrder;

    /**
    * 该画面在输出时的显示模式：0为裁剪，1为缩放，2为缩放并显示黑底。不填默认为0。
    */
    @SerializedName("RenderMode")
    @Expose
    private Long RenderMode;

    /**
    * 该当前位置用户混入的流类型：0为混入音视频，1为只混入视频，2为只混入音频。默认为0，建议配合指定用户ID使用。
    */
    @SerializedName("MixInputType")
    @Expose
    private Long MixInputType;

    /**
    * 占位图ID。启用占位图功能时，在当前位置的用户没有上行视频时显示占位图。占位图大小不能超过2M，在实时音视频控制台上传并生成，https://cloud.tencent.com/document/product/647/50769
    */
    @SerializedName("PlaceImageId")
    @Expose
    private Long PlaceImageId;

    /**
     * Get 指定显示在该画面上的用户ID。如果不指定用户ID，会按照用户加入房间的顺序自动匹配PresetLayoutConfig中的画面设置。 
     * @return UserId 指定显示在该画面上的用户ID。如果不指定用户ID，会按照用户加入房间的顺序自动匹配PresetLayoutConfig中的画面设置。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 指定显示在该画面上的用户ID。如果不指定用户ID，会按照用户加入房间的顺序自动匹配PresetLayoutConfig中的画面设置。
     * @param UserId 指定显示在该画面上的用户ID。如果不指定用户ID，会按照用户加入房间的顺序自动匹配PresetLayoutConfig中的画面设置。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 当该画面指定用户时，代表用户的流类型。0为摄像头，1为屏幕分享。小画面为web用户时此值填0。 
     * @return StreamType 当该画面指定用户时，代表用户的流类型。0为摄像头，1为屏幕分享。小画面为web用户时此值填0。
     */
    public Long getStreamType() {
        return this.StreamType;
    }

    /**
     * Set 当该画面指定用户时，代表用户的流类型。0为摄像头，1为屏幕分享。小画面为web用户时此值填0。
     * @param StreamType 当该画面指定用户时，代表用户的流类型。0为摄像头，1为屏幕分享。小画面为web用户时此值填0。
     */
    public void setStreamType(Long StreamType) {
        this.StreamType = StreamType;
    }

    /**
     * Get 该画面在输出时的宽度，单位为像素值，不填默认为0。 
     * @return ImageWidth 该画面在输出时的宽度，单位为像素值，不填默认为0。
     */
    public Long getImageWidth() {
        return this.ImageWidth;
    }

    /**
     * Set 该画面在输出时的宽度，单位为像素值，不填默认为0。
     * @param ImageWidth 该画面在输出时的宽度，单位为像素值，不填默认为0。
     */
    public void setImageWidth(Long ImageWidth) {
        this.ImageWidth = ImageWidth;
    }

    /**
     * Get 该画面在输出时的高度，单位为像素值，不填默认为0。 
     * @return ImageHeight 该画面在输出时的高度，单位为像素值，不填默认为0。
     */
    public Long getImageHeight() {
        return this.ImageHeight;
    }

    /**
     * Set 该画面在输出时的高度，单位为像素值，不填默认为0。
     * @param ImageHeight 该画面在输出时的高度，单位为像素值，不填默认为0。
     */
    public void setImageHeight(Long ImageHeight) {
        this.ImageHeight = ImageHeight;
    }

    /**
     * Get 该画面在输出时的X偏移，单位为像素值，LocationX与ImageWidth之和不能超过混流输出的总宽度，不填默认为0。 
     * @return LocationX 该画面在输出时的X偏移，单位为像素值，LocationX与ImageWidth之和不能超过混流输出的总宽度，不填默认为0。
     */
    public Long getLocationX() {
        return this.LocationX;
    }

    /**
     * Set 该画面在输出时的X偏移，单位为像素值，LocationX与ImageWidth之和不能超过混流输出的总宽度，不填默认为0。
     * @param LocationX 该画面在输出时的X偏移，单位为像素值，LocationX与ImageWidth之和不能超过混流输出的总宽度，不填默认为0。
     */
    public void setLocationX(Long LocationX) {
        this.LocationX = LocationX;
    }

    /**
     * Get 该画面在输出时的Y偏移，单位为像素值，LocationY与ImageHeight之和不能超过混流输出的总高度，不填默认为0。 
     * @return LocationY 该画面在输出时的Y偏移，单位为像素值，LocationY与ImageHeight之和不能超过混流输出的总高度，不填默认为0。
     */
    public Long getLocationY() {
        return this.LocationY;
    }

    /**
     * Set 该画面在输出时的Y偏移，单位为像素值，LocationY与ImageHeight之和不能超过混流输出的总高度，不填默认为0。
     * @param LocationY 该画面在输出时的Y偏移，单位为像素值，LocationY与ImageHeight之和不能超过混流输出的总高度，不填默认为0。
     */
    public void setLocationY(Long LocationY) {
        this.LocationY = LocationY;
    }

    /**
     * Get 该画面在输出时的层级，不填默认为0。 
     * @return ZOrder 该画面在输出时的层级，不填默认为0。
     */
    public Long getZOrder() {
        return this.ZOrder;
    }

    /**
     * Set 该画面在输出时的层级，不填默认为0。
     * @param ZOrder 该画面在输出时的层级，不填默认为0。
     */
    public void setZOrder(Long ZOrder) {
        this.ZOrder = ZOrder;
    }

    /**
     * Get 该画面在输出时的显示模式：0为裁剪，1为缩放，2为缩放并显示黑底。不填默认为0。 
     * @return RenderMode 该画面在输出时的显示模式：0为裁剪，1为缩放，2为缩放并显示黑底。不填默认为0。
     */
    public Long getRenderMode() {
        return this.RenderMode;
    }

    /**
     * Set 该画面在输出时的显示模式：0为裁剪，1为缩放，2为缩放并显示黑底。不填默认为0。
     * @param RenderMode 该画面在输出时的显示模式：0为裁剪，1为缩放，2为缩放并显示黑底。不填默认为0。
     */
    public void setRenderMode(Long RenderMode) {
        this.RenderMode = RenderMode;
    }

    /**
     * Get 该当前位置用户混入的流类型：0为混入音视频，1为只混入视频，2为只混入音频。默认为0，建议配合指定用户ID使用。 
     * @return MixInputType 该当前位置用户混入的流类型：0为混入音视频，1为只混入视频，2为只混入音频。默认为0，建议配合指定用户ID使用。
     */
    public Long getMixInputType() {
        return this.MixInputType;
    }

    /**
     * Set 该当前位置用户混入的流类型：0为混入音视频，1为只混入视频，2为只混入音频。默认为0，建议配合指定用户ID使用。
     * @param MixInputType 该当前位置用户混入的流类型：0为混入音视频，1为只混入视频，2为只混入音频。默认为0，建议配合指定用户ID使用。
     */
    public void setMixInputType(Long MixInputType) {
        this.MixInputType = MixInputType;
    }

    /**
     * Get 占位图ID。启用占位图功能时，在当前位置的用户没有上行视频时显示占位图。占位图大小不能超过2M，在实时音视频控制台上传并生成，https://cloud.tencent.com/document/product/647/50769 
     * @return PlaceImageId 占位图ID。启用占位图功能时，在当前位置的用户没有上行视频时显示占位图。占位图大小不能超过2M，在实时音视频控制台上传并生成，https://cloud.tencent.com/document/product/647/50769
     */
    public Long getPlaceImageId() {
        return this.PlaceImageId;
    }

    /**
     * Set 占位图ID。启用占位图功能时，在当前位置的用户没有上行视频时显示占位图。占位图大小不能超过2M，在实时音视频控制台上传并生成，https://cloud.tencent.com/document/product/647/50769
     * @param PlaceImageId 占位图ID。启用占位图功能时，在当前位置的用户没有上行视频时显示占位图。占位图大小不能超过2M，在实时音视频控制台上传并生成，https://cloud.tencent.com/document/product/647/50769
     */
    public void setPlaceImageId(Long PlaceImageId) {
        this.PlaceImageId = PlaceImageId;
    }

    public PresetLayoutConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PresetLayoutConfig(PresetLayoutConfig source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.StreamType != null) {
            this.StreamType = new Long(source.StreamType);
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
        if (source.MixInputType != null) {
            this.MixInputType = new Long(source.MixInputType);
        }
        if (source.PlaceImageId != null) {
            this.PlaceImageId = new Long(source.PlaceImageId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "StreamType", this.StreamType);
        this.setParamSimple(map, prefix + "ImageWidth", this.ImageWidth);
        this.setParamSimple(map, prefix + "ImageHeight", this.ImageHeight);
        this.setParamSimple(map, prefix + "LocationX", this.LocationX);
        this.setParamSimple(map, prefix + "LocationY", this.LocationY);
        this.setParamSimple(map, prefix + "ZOrder", this.ZOrder);
        this.setParamSimple(map, prefix + "RenderMode", this.RenderMode);
        this.setParamSimple(map, prefix + "MixInputType", this.MixInputType);
        this.setParamSimple(map, prefix + "PlaceImageId", this.PlaceImageId);

    }
}

