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

public class LayoutParams extends AbstractModel{

    /**
    * 混流布局模板ID，0为悬浮模板(默认);1为九宫格模板;2为屏幕分享模板;3为画中画模板;4为自定义模板。
    */
    @SerializedName("Template")
    @Expose
    private Long Template;

    /**
    * 屏幕分享模板、悬浮模板、画中画模板中有效，代表大画面对应的用户ID。
    */
    @SerializedName("MainVideoUserId")
    @Expose
    private String MainVideoUserId;

    /**
    * 屏幕分享模板、悬浮模板、画中画模板中有效，代表大画面对应的流类型，0为摄像头，1为屏幕分享。左侧大画面为web用户时此值填0。
    */
    @SerializedName("MainVideoStreamType")
    @Expose
    private Long MainVideoStreamType;

    /**
    * 画中画模板中有效，代表小画面的布局参数。
    */
    @SerializedName("SmallVideoLayoutParams")
    @Expose
    private SmallVideoLayoutParams SmallVideoLayoutParams;

    /**
    * 屏幕分享模板有效。设置为1时代表大画面居右，小画面居左布局。默认为0。
    */
    @SerializedName("MainVideoRightAlign")
    @Expose
    private Long MainVideoRightAlign;

    /**
    * 悬浮模板、九宫格、屏幕分享模板有效。设置此参数后，输出流混合此参数中包含用户的音视频，以及其他用户的纯音频。最多可设置16个用户。
    */
    @SerializedName("MixVideoUids")
    @Expose
    private String [] MixVideoUids;

    /**
    * 自定义模板中有效，指定用户视频在混合画面中的位置。
    */
    @SerializedName("PresetLayoutConfig")
    @Expose
    private PresetLayoutConfig [] PresetLayoutConfig;

    /**
    * 自定义模板中有效，设置为1时代表启用占位图功能，0时代表不启用占位图功能，默认为0。启用占位图功能时，在预设位置的用户没有上行视频时可显示对应的占位图。
    */
    @SerializedName("PlaceHolderMode")
    @Expose
    private Long PlaceHolderMode;

    /**
    * 悬浮模板、九宫格、屏幕分享模板生效，用于控制纯音频上行是否占用画面布局位置。设置为0是代表后台默认处理方式，悬浮小画面占布局位置，九宫格画面占布局位置、屏幕分享小画面不占布局位置；设置为1时代表纯音频上行占布局位置；设置为2时代表纯音频上行不占布局位置。默认为0。
    */
    @SerializedName("PureAudioHoldPlaceMode")
    @Expose
    private Long PureAudioHoldPlaceMode;

    /**
    * 水印参数。
    */
    @SerializedName("WaterMarkParams")
    @Expose
    private WaterMarkParams WaterMarkParams;

    /**
     * Get 混流布局模板ID，0为悬浮模板(默认);1为九宫格模板;2为屏幕分享模板;3为画中画模板;4为自定义模板。 
     * @return Template 混流布局模板ID，0为悬浮模板(默认);1为九宫格模板;2为屏幕分享模板;3为画中画模板;4为自定义模板。
     */
    public Long getTemplate() {
        return this.Template;
    }

    /**
     * Set 混流布局模板ID，0为悬浮模板(默认);1为九宫格模板;2为屏幕分享模板;3为画中画模板;4为自定义模板。
     * @param Template 混流布局模板ID，0为悬浮模板(默认);1为九宫格模板;2为屏幕分享模板;3为画中画模板;4为自定义模板。
     */
    public void setTemplate(Long Template) {
        this.Template = Template;
    }

    /**
     * Get 屏幕分享模板、悬浮模板、画中画模板中有效，代表大画面对应的用户ID。 
     * @return MainVideoUserId 屏幕分享模板、悬浮模板、画中画模板中有效，代表大画面对应的用户ID。
     */
    public String getMainVideoUserId() {
        return this.MainVideoUserId;
    }

    /**
     * Set 屏幕分享模板、悬浮模板、画中画模板中有效，代表大画面对应的用户ID。
     * @param MainVideoUserId 屏幕分享模板、悬浮模板、画中画模板中有效，代表大画面对应的用户ID。
     */
    public void setMainVideoUserId(String MainVideoUserId) {
        this.MainVideoUserId = MainVideoUserId;
    }

    /**
     * Get 屏幕分享模板、悬浮模板、画中画模板中有效，代表大画面对应的流类型，0为摄像头，1为屏幕分享。左侧大画面为web用户时此值填0。 
     * @return MainVideoStreamType 屏幕分享模板、悬浮模板、画中画模板中有效，代表大画面对应的流类型，0为摄像头，1为屏幕分享。左侧大画面为web用户时此值填0。
     */
    public Long getMainVideoStreamType() {
        return this.MainVideoStreamType;
    }

    /**
     * Set 屏幕分享模板、悬浮模板、画中画模板中有效，代表大画面对应的流类型，0为摄像头，1为屏幕分享。左侧大画面为web用户时此值填0。
     * @param MainVideoStreamType 屏幕分享模板、悬浮模板、画中画模板中有效，代表大画面对应的流类型，0为摄像头，1为屏幕分享。左侧大画面为web用户时此值填0。
     */
    public void setMainVideoStreamType(Long MainVideoStreamType) {
        this.MainVideoStreamType = MainVideoStreamType;
    }

    /**
     * Get 画中画模板中有效，代表小画面的布局参数。 
     * @return SmallVideoLayoutParams 画中画模板中有效，代表小画面的布局参数。
     */
    public SmallVideoLayoutParams getSmallVideoLayoutParams() {
        return this.SmallVideoLayoutParams;
    }

    /**
     * Set 画中画模板中有效，代表小画面的布局参数。
     * @param SmallVideoLayoutParams 画中画模板中有效，代表小画面的布局参数。
     */
    public void setSmallVideoLayoutParams(SmallVideoLayoutParams SmallVideoLayoutParams) {
        this.SmallVideoLayoutParams = SmallVideoLayoutParams;
    }

    /**
     * Get 屏幕分享模板有效。设置为1时代表大画面居右，小画面居左布局。默认为0。 
     * @return MainVideoRightAlign 屏幕分享模板有效。设置为1时代表大画面居右，小画面居左布局。默认为0。
     */
    public Long getMainVideoRightAlign() {
        return this.MainVideoRightAlign;
    }

    /**
     * Set 屏幕分享模板有效。设置为1时代表大画面居右，小画面居左布局。默认为0。
     * @param MainVideoRightAlign 屏幕分享模板有效。设置为1时代表大画面居右，小画面居左布局。默认为0。
     */
    public void setMainVideoRightAlign(Long MainVideoRightAlign) {
        this.MainVideoRightAlign = MainVideoRightAlign;
    }

    /**
     * Get 悬浮模板、九宫格、屏幕分享模板有效。设置此参数后，输出流混合此参数中包含用户的音视频，以及其他用户的纯音频。最多可设置16个用户。 
     * @return MixVideoUids 悬浮模板、九宫格、屏幕分享模板有效。设置此参数后，输出流混合此参数中包含用户的音视频，以及其他用户的纯音频。最多可设置16个用户。
     */
    public String [] getMixVideoUids() {
        return this.MixVideoUids;
    }

    /**
     * Set 悬浮模板、九宫格、屏幕分享模板有效。设置此参数后，输出流混合此参数中包含用户的音视频，以及其他用户的纯音频。最多可设置16个用户。
     * @param MixVideoUids 悬浮模板、九宫格、屏幕分享模板有效。设置此参数后，输出流混合此参数中包含用户的音视频，以及其他用户的纯音频。最多可设置16个用户。
     */
    public void setMixVideoUids(String [] MixVideoUids) {
        this.MixVideoUids = MixVideoUids;
    }

    /**
     * Get 自定义模板中有效，指定用户视频在混合画面中的位置。 
     * @return PresetLayoutConfig 自定义模板中有效，指定用户视频在混合画面中的位置。
     */
    public PresetLayoutConfig [] getPresetLayoutConfig() {
        return this.PresetLayoutConfig;
    }

    /**
     * Set 自定义模板中有效，指定用户视频在混合画面中的位置。
     * @param PresetLayoutConfig 自定义模板中有效，指定用户视频在混合画面中的位置。
     */
    public void setPresetLayoutConfig(PresetLayoutConfig [] PresetLayoutConfig) {
        this.PresetLayoutConfig = PresetLayoutConfig;
    }

    /**
     * Get 自定义模板中有效，设置为1时代表启用占位图功能，0时代表不启用占位图功能，默认为0。启用占位图功能时，在预设位置的用户没有上行视频时可显示对应的占位图。 
     * @return PlaceHolderMode 自定义模板中有效，设置为1时代表启用占位图功能，0时代表不启用占位图功能，默认为0。启用占位图功能时，在预设位置的用户没有上行视频时可显示对应的占位图。
     */
    public Long getPlaceHolderMode() {
        return this.PlaceHolderMode;
    }

    /**
     * Set 自定义模板中有效，设置为1时代表启用占位图功能，0时代表不启用占位图功能，默认为0。启用占位图功能时，在预设位置的用户没有上行视频时可显示对应的占位图。
     * @param PlaceHolderMode 自定义模板中有效，设置为1时代表启用占位图功能，0时代表不启用占位图功能，默认为0。启用占位图功能时，在预设位置的用户没有上行视频时可显示对应的占位图。
     */
    public void setPlaceHolderMode(Long PlaceHolderMode) {
        this.PlaceHolderMode = PlaceHolderMode;
    }

    /**
     * Get 悬浮模板、九宫格、屏幕分享模板生效，用于控制纯音频上行是否占用画面布局位置。设置为0是代表后台默认处理方式，悬浮小画面占布局位置，九宫格画面占布局位置、屏幕分享小画面不占布局位置；设置为1时代表纯音频上行占布局位置；设置为2时代表纯音频上行不占布局位置。默认为0。 
     * @return PureAudioHoldPlaceMode 悬浮模板、九宫格、屏幕分享模板生效，用于控制纯音频上行是否占用画面布局位置。设置为0是代表后台默认处理方式，悬浮小画面占布局位置，九宫格画面占布局位置、屏幕分享小画面不占布局位置；设置为1时代表纯音频上行占布局位置；设置为2时代表纯音频上行不占布局位置。默认为0。
     */
    public Long getPureAudioHoldPlaceMode() {
        return this.PureAudioHoldPlaceMode;
    }

    /**
     * Set 悬浮模板、九宫格、屏幕分享模板生效，用于控制纯音频上行是否占用画面布局位置。设置为0是代表后台默认处理方式，悬浮小画面占布局位置，九宫格画面占布局位置、屏幕分享小画面不占布局位置；设置为1时代表纯音频上行占布局位置；设置为2时代表纯音频上行不占布局位置。默认为0。
     * @param PureAudioHoldPlaceMode 悬浮模板、九宫格、屏幕分享模板生效，用于控制纯音频上行是否占用画面布局位置。设置为0是代表后台默认处理方式，悬浮小画面占布局位置，九宫格画面占布局位置、屏幕分享小画面不占布局位置；设置为1时代表纯音频上行占布局位置；设置为2时代表纯音频上行不占布局位置。默认为0。
     */
    public void setPureAudioHoldPlaceMode(Long PureAudioHoldPlaceMode) {
        this.PureAudioHoldPlaceMode = PureAudioHoldPlaceMode;
    }

    /**
     * Get 水印参数。 
     * @return WaterMarkParams 水印参数。
     */
    public WaterMarkParams getWaterMarkParams() {
        return this.WaterMarkParams;
    }

    /**
     * Set 水印参数。
     * @param WaterMarkParams 水印参数。
     */
    public void setWaterMarkParams(WaterMarkParams WaterMarkParams) {
        this.WaterMarkParams = WaterMarkParams;
    }

    public LayoutParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LayoutParams(LayoutParams source) {
        if (source.Template != null) {
            this.Template = new Long(source.Template);
        }
        if (source.MainVideoUserId != null) {
            this.MainVideoUserId = new String(source.MainVideoUserId);
        }
        if (source.MainVideoStreamType != null) {
            this.MainVideoStreamType = new Long(source.MainVideoStreamType);
        }
        if (source.SmallVideoLayoutParams != null) {
            this.SmallVideoLayoutParams = new SmallVideoLayoutParams(source.SmallVideoLayoutParams);
        }
        if (source.MainVideoRightAlign != null) {
            this.MainVideoRightAlign = new Long(source.MainVideoRightAlign);
        }
        if (source.MixVideoUids != null) {
            this.MixVideoUids = new String[source.MixVideoUids.length];
            for (int i = 0; i < source.MixVideoUids.length; i++) {
                this.MixVideoUids[i] = new String(source.MixVideoUids[i]);
            }
        }
        if (source.PresetLayoutConfig != null) {
            this.PresetLayoutConfig = new PresetLayoutConfig[source.PresetLayoutConfig.length];
            for (int i = 0; i < source.PresetLayoutConfig.length; i++) {
                this.PresetLayoutConfig[i] = new PresetLayoutConfig(source.PresetLayoutConfig[i]);
            }
        }
        if (source.PlaceHolderMode != null) {
            this.PlaceHolderMode = new Long(source.PlaceHolderMode);
        }
        if (source.PureAudioHoldPlaceMode != null) {
            this.PureAudioHoldPlaceMode = new Long(source.PureAudioHoldPlaceMode);
        }
        if (source.WaterMarkParams != null) {
            this.WaterMarkParams = new WaterMarkParams(source.WaterMarkParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Template", this.Template);
        this.setParamSimple(map, prefix + "MainVideoUserId", this.MainVideoUserId);
        this.setParamSimple(map, prefix + "MainVideoStreamType", this.MainVideoStreamType);
        this.setParamObj(map, prefix + "SmallVideoLayoutParams.", this.SmallVideoLayoutParams);
        this.setParamSimple(map, prefix + "MainVideoRightAlign", this.MainVideoRightAlign);
        this.setParamArraySimple(map, prefix + "MixVideoUids.", this.MixVideoUids);
        this.setParamArrayObj(map, prefix + "PresetLayoutConfig.", this.PresetLayoutConfig);
        this.setParamSimple(map, prefix + "PlaceHolderMode", this.PlaceHolderMode);
        this.setParamSimple(map, prefix + "PureAudioHoldPlaceMode", this.PureAudioHoldPlaceMode);
        this.setParamObj(map, prefix + "WaterMarkParams.", this.WaterMarkParams);

    }
}

