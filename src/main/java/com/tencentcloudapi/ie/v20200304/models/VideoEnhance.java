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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoEnhance extends AbstractModel{

    /**
    * 去编码毛刺、伪影参数。
    */
    @SerializedName("ArtifactReduction")
    @Expose
    private ArtifactReduction ArtifactReduction;

    /**
    * 去噪声参数。
    */
    @SerializedName("Denoising")
    @Expose
    private Denoising Denoising;

    /**
    * 颜色增强参数。
    */
    @SerializedName("ColorEnhance")
    @Expose
    private ColorEnhance ColorEnhance;

    /**
    * 细节增强参数。
    */
    @SerializedName("Sharp")
    @Expose
    private Sharp Sharp;

    /**
    * 超分参数，可选项：2，目前仅支持2倍超分。
注意：此参数已经弃用，超分可以使用VideoSuperResolution参数
    */
    @SerializedName("WdSuperResolution")
    @Expose
    private Long WdSuperResolution;

    /**
    * 人脸保护信息。
    */
    @SerializedName("FaceProtect")
    @Expose
    private FaceProtect FaceProtect;

    /**
    * 插帧，取值范围：[0, 60]，单位：Hz。
注意：当取值为 0，表示帧率和原始视频保持一致。
    */
    @SerializedName("WdFps")
    @Expose
    private Long WdFps;

    /**
    * 去划痕参数
    */
    @SerializedName("ScratchRepair")
    @Expose
    private ScratchRepair ScratchRepair;

    /**
    * 低光照增强参数
    */
    @SerializedName("LowLightEnhance")
    @Expose
    private LowLightEnhance LowLightEnhance;

    /**
    * 视频超分参数
    */
    @SerializedName("VideoSuperResolution")
    @Expose
    private VideoSuperResolution VideoSuperResolution;

    /**
    * 视频画质修复参数
    */
    @SerializedName("VideoRepair")
    @Expose
    private VideoRepair VideoRepair;

    /**
     * Get 去编码毛刺、伪影参数。 
     * @return ArtifactReduction 去编码毛刺、伪影参数。
     */
    public ArtifactReduction getArtifactReduction() {
        return this.ArtifactReduction;
    }

    /**
     * Set 去编码毛刺、伪影参数。
     * @param ArtifactReduction 去编码毛刺、伪影参数。
     */
    public void setArtifactReduction(ArtifactReduction ArtifactReduction) {
        this.ArtifactReduction = ArtifactReduction;
    }

    /**
     * Get 去噪声参数。 
     * @return Denoising 去噪声参数。
     */
    public Denoising getDenoising() {
        return this.Denoising;
    }

    /**
     * Set 去噪声参数。
     * @param Denoising 去噪声参数。
     */
    public void setDenoising(Denoising Denoising) {
        this.Denoising = Denoising;
    }

    /**
     * Get 颜色增强参数。 
     * @return ColorEnhance 颜色增强参数。
     */
    public ColorEnhance getColorEnhance() {
        return this.ColorEnhance;
    }

    /**
     * Set 颜色增强参数。
     * @param ColorEnhance 颜色增强参数。
     */
    public void setColorEnhance(ColorEnhance ColorEnhance) {
        this.ColorEnhance = ColorEnhance;
    }

    /**
     * Get 细节增强参数。 
     * @return Sharp 细节增强参数。
     */
    public Sharp getSharp() {
        return this.Sharp;
    }

    /**
     * Set 细节增强参数。
     * @param Sharp 细节增强参数。
     */
    public void setSharp(Sharp Sharp) {
        this.Sharp = Sharp;
    }

    /**
     * Get 超分参数，可选项：2，目前仅支持2倍超分。
注意：此参数已经弃用，超分可以使用VideoSuperResolution参数 
     * @return WdSuperResolution 超分参数，可选项：2，目前仅支持2倍超分。
注意：此参数已经弃用，超分可以使用VideoSuperResolution参数
     */
    public Long getWdSuperResolution() {
        return this.WdSuperResolution;
    }

    /**
     * Set 超分参数，可选项：2，目前仅支持2倍超分。
注意：此参数已经弃用，超分可以使用VideoSuperResolution参数
     * @param WdSuperResolution 超分参数，可选项：2，目前仅支持2倍超分。
注意：此参数已经弃用，超分可以使用VideoSuperResolution参数
     */
    public void setWdSuperResolution(Long WdSuperResolution) {
        this.WdSuperResolution = WdSuperResolution;
    }

    /**
     * Get 人脸保护信息。 
     * @return FaceProtect 人脸保护信息。
     */
    public FaceProtect getFaceProtect() {
        return this.FaceProtect;
    }

    /**
     * Set 人脸保护信息。
     * @param FaceProtect 人脸保护信息。
     */
    public void setFaceProtect(FaceProtect FaceProtect) {
        this.FaceProtect = FaceProtect;
    }

    /**
     * Get 插帧，取值范围：[0, 60]，单位：Hz。
注意：当取值为 0，表示帧率和原始视频保持一致。 
     * @return WdFps 插帧，取值范围：[0, 60]，单位：Hz。
注意：当取值为 0，表示帧率和原始视频保持一致。
     */
    public Long getWdFps() {
        return this.WdFps;
    }

    /**
     * Set 插帧，取值范围：[0, 60]，单位：Hz。
注意：当取值为 0，表示帧率和原始视频保持一致。
     * @param WdFps 插帧，取值范围：[0, 60]，单位：Hz。
注意：当取值为 0，表示帧率和原始视频保持一致。
     */
    public void setWdFps(Long WdFps) {
        this.WdFps = WdFps;
    }

    /**
     * Get 去划痕参数 
     * @return ScratchRepair 去划痕参数
     */
    public ScratchRepair getScratchRepair() {
        return this.ScratchRepair;
    }

    /**
     * Set 去划痕参数
     * @param ScratchRepair 去划痕参数
     */
    public void setScratchRepair(ScratchRepair ScratchRepair) {
        this.ScratchRepair = ScratchRepair;
    }

    /**
     * Get 低光照增强参数 
     * @return LowLightEnhance 低光照增强参数
     */
    public LowLightEnhance getLowLightEnhance() {
        return this.LowLightEnhance;
    }

    /**
     * Set 低光照增强参数
     * @param LowLightEnhance 低光照增强参数
     */
    public void setLowLightEnhance(LowLightEnhance LowLightEnhance) {
        this.LowLightEnhance = LowLightEnhance;
    }

    /**
     * Get 视频超分参数 
     * @return VideoSuperResolution 视频超分参数
     */
    public VideoSuperResolution getVideoSuperResolution() {
        return this.VideoSuperResolution;
    }

    /**
     * Set 视频超分参数
     * @param VideoSuperResolution 视频超分参数
     */
    public void setVideoSuperResolution(VideoSuperResolution VideoSuperResolution) {
        this.VideoSuperResolution = VideoSuperResolution;
    }

    /**
     * Get 视频画质修复参数 
     * @return VideoRepair 视频画质修复参数
     */
    public VideoRepair getVideoRepair() {
        return this.VideoRepair;
    }

    /**
     * Set 视频画质修复参数
     * @param VideoRepair 视频画质修复参数
     */
    public void setVideoRepair(VideoRepair VideoRepair) {
        this.VideoRepair = VideoRepair;
    }

    public VideoEnhance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoEnhance(VideoEnhance source) {
        if (source.ArtifactReduction != null) {
            this.ArtifactReduction = new ArtifactReduction(source.ArtifactReduction);
        }
        if (source.Denoising != null) {
            this.Denoising = new Denoising(source.Denoising);
        }
        if (source.ColorEnhance != null) {
            this.ColorEnhance = new ColorEnhance(source.ColorEnhance);
        }
        if (source.Sharp != null) {
            this.Sharp = new Sharp(source.Sharp);
        }
        if (source.WdSuperResolution != null) {
            this.WdSuperResolution = new Long(source.WdSuperResolution);
        }
        if (source.FaceProtect != null) {
            this.FaceProtect = new FaceProtect(source.FaceProtect);
        }
        if (source.WdFps != null) {
            this.WdFps = new Long(source.WdFps);
        }
        if (source.ScratchRepair != null) {
            this.ScratchRepair = new ScratchRepair(source.ScratchRepair);
        }
        if (source.LowLightEnhance != null) {
            this.LowLightEnhance = new LowLightEnhance(source.LowLightEnhance);
        }
        if (source.VideoSuperResolution != null) {
            this.VideoSuperResolution = new VideoSuperResolution(source.VideoSuperResolution);
        }
        if (source.VideoRepair != null) {
            this.VideoRepair = new VideoRepair(source.VideoRepair);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ArtifactReduction.", this.ArtifactReduction);
        this.setParamObj(map, prefix + "Denoising.", this.Denoising);
        this.setParamObj(map, prefix + "ColorEnhance.", this.ColorEnhance);
        this.setParamObj(map, prefix + "Sharp.", this.Sharp);
        this.setParamSimple(map, prefix + "WdSuperResolution", this.WdSuperResolution);
        this.setParamObj(map, prefix + "FaceProtect.", this.FaceProtect);
        this.setParamSimple(map, prefix + "WdFps", this.WdFps);
        this.setParamObj(map, prefix + "ScratchRepair.", this.ScratchRepair);
        this.setParamObj(map, prefix + "LowLightEnhance.", this.LowLightEnhance);
        this.setParamObj(map, prefix + "VideoSuperResolution.", this.VideoSuperResolution);
        this.setParamObj(map, prefix + "VideoRepair.", this.VideoRepair);

    }
}

