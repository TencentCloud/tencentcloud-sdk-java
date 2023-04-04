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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RebuildVideoInfo extends AbstractModel{

    /**
    * 画质修复控制参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RepairInfo")
    @Expose
    private RepairInfo RepairInfo;

    /**
    * 智能插帧控制参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VideoFrameInterpolationInfo")
    @Expose
    private VideoFrameInterpolationInfo VideoFrameInterpolationInfo;

    /**
    * 画面超分控制参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuperResolutionInfo")
    @Expose
    private SuperResolutionInfo SuperResolutionInfo;

    /**
    * 高动态范围类型控制参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HDRInfo")
    @Expose
    private HDRInfo HDRInfo;

    /**
    * 视频降噪控制参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VideoDenoiseInfo")
    @Expose
    private VideoDenoiseInfo VideoDenoiseInfo;

    /**
    * 色彩增强控制参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColorInfo")
    @Expose
    private ColorEnhanceInfo ColorInfo;

    /**
    * 细节增强控制参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SharpInfo")
    @Expose
    private SharpEnhanceInfo SharpInfo;

    /**
    * 人脸增强控制参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FaceInfo")
    @Expose
    private FaceEnhanceInfo FaceInfo;

    /**
    * 低光照控制参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LowLightInfo")
    @Expose
    private LowLightEnhanceInfo LowLightInfo;

    /**
    * 去划痕控制参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScratchRepairInfo")
    @Expose
    private ScratchRepairInfo ScratchRepairInfo;

    /**
    * 去伪影控制参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ArtifactRepairInfo")
    @Expose
    private ArtifactRepairInfo ArtifactRepairInfo;

    /**
     * Get 画质修复控制参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RepairInfo 画质修复控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RepairInfo getRepairInfo() {
        return this.RepairInfo;
    }

    /**
     * Set 画质修复控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RepairInfo 画质修复控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRepairInfo(RepairInfo RepairInfo) {
        this.RepairInfo = RepairInfo;
    }

    /**
     * Get 智能插帧控制参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VideoFrameInterpolationInfo 智能插帧控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VideoFrameInterpolationInfo getVideoFrameInterpolationInfo() {
        return this.VideoFrameInterpolationInfo;
    }

    /**
     * Set 智能插帧控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VideoFrameInterpolationInfo 智能插帧控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVideoFrameInterpolationInfo(VideoFrameInterpolationInfo VideoFrameInterpolationInfo) {
        this.VideoFrameInterpolationInfo = VideoFrameInterpolationInfo;
    }

    /**
     * Get 画面超分控制参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuperResolutionInfo 画面超分控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SuperResolutionInfo getSuperResolutionInfo() {
        return this.SuperResolutionInfo;
    }

    /**
     * Set 画面超分控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuperResolutionInfo 画面超分控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuperResolutionInfo(SuperResolutionInfo SuperResolutionInfo) {
        this.SuperResolutionInfo = SuperResolutionInfo;
    }

    /**
     * Get 高动态范围类型控制参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HDRInfo 高动态范围类型控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HDRInfo getHDRInfo() {
        return this.HDRInfo;
    }

    /**
     * Set 高动态范围类型控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HDRInfo 高动态范围类型控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHDRInfo(HDRInfo HDRInfo) {
        this.HDRInfo = HDRInfo;
    }

    /**
     * Get 视频降噪控制参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VideoDenoiseInfo 视频降噪控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VideoDenoiseInfo getVideoDenoiseInfo() {
        return this.VideoDenoiseInfo;
    }

    /**
     * Set 视频降噪控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VideoDenoiseInfo 视频降噪控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVideoDenoiseInfo(VideoDenoiseInfo VideoDenoiseInfo) {
        this.VideoDenoiseInfo = VideoDenoiseInfo;
    }

    /**
     * Get 色彩增强控制参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColorInfo 色彩增强控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ColorEnhanceInfo getColorInfo() {
        return this.ColorInfo;
    }

    /**
     * Set 色彩增强控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColorInfo 色彩增强控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColorInfo(ColorEnhanceInfo ColorInfo) {
        this.ColorInfo = ColorInfo;
    }

    /**
     * Get 细节增强控制参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SharpInfo 细节增强控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SharpEnhanceInfo getSharpInfo() {
        return this.SharpInfo;
    }

    /**
     * Set 细节增强控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SharpInfo 细节增强控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSharpInfo(SharpEnhanceInfo SharpInfo) {
        this.SharpInfo = SharpInfo;
    }

    /**
     * Get 人脸增强控制参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FaceInfo 人脸增强控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FaceEnhanceInfo getFaceInfo() {
        return this.FaceInfo;
    }

    /**
     * Set 人脸增强控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FaceInfo 人脸增强控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFaceInfo(FaceEnhanceInfo FaceInfo) {
        this.FaceInfo = FaceInfo;
    }

    /**
     * Get 低光照控制参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LowLightInfo 低光照控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LowLightEnhanceInfo getLowLightInfo() {
        return this.LowLightInfo;
    }

    /**
     * Set 低光照控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LowLightInfo 低光照控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLowLightInfo(LowLightEnhanceInfo LowLightInfo) {
        this.LowLightInfo = LowLightInfo;
    }

    /**
     * Get 去划痕控制参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScratchRepairInfo 去划痕控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ScratchRepairInfo getScratchRepairInfo() {
        return this.ScratchRepairInfo;
    }

    /**
     * Set 去划痕控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScratchRepairInfo 去划痕控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScratchRepairInfo(ScratchRepairInfo ScratchRepairInfo) {
        this.ScratchRepairInfo = ScratchRepairInfo;
    }

    /**
     * Get 去伪影控制参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ArtifactRepairInfo 去伪影控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ArtifactRepairInfo getArtifactRepairInfo() {
        return this.ArtifactRepairInfo;
    }

    /**
     * Set 去伪影控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ArtifactRepairInfo 去伪影控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setArtifactRepairInfo(ArtifactRepairInfo ArtifactRepairInfo) {
        this.ArtifactRepairInfo = ArtifactRepairInfo;
    }

    public RebuildVideoInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RebuildVideoInfo(RebuildVideoInfo source) {
        if (source.RepairInfo != null) {
            this.RepairInfo = new RepairInfo(source.RepairInfo);
        }
        if (source.VideoFrameInterpolationInfo != null) {
            this.VideoFrameInterpolationInfo = new VideoFrameInterpolationInfo(source.VideoFrameInterpolationInfo);
        }
        if (source.SuperResolutionInfo != null) {
            this.SuperResolutionInfo = new SuperResolutionInfo(source.SuperResolutionInfo);
        }
        if (source.HDRInfo != null) {
            this.HDRInfo = new HDRInfo(source.HDRInfo);
        }
        if (source.VideoDenoiseInfo != null) {
            this.VideoDenoiseInfo = new VideoDenoiseInfo(source.VideoDenoiseInfo);
        }
        if (source.ColorInfo != null) {
            this.ColorInfo = new ColorEnhanceInfo(source.ColorInfo);
        }
        if (source.SharpInfo != null) {
            this.SharpInfo = new SharpEnhanceInfo(source.SharpInfo);
        }
        if (source.FaceInfo != null) {
            this.FaceInfo = new FaceEnhanceInfo(source.FaceInfo);
        }
        if (source.LowLightInfo != null) {
            this.LowLightInfo = new LowLightEnhanceInfo(source.LowLightInfo);
        }
        if (source.ScratchRepairInfo != null) {
            this.ScratchRepairInfo = new ScratchRepairInfo(source.ScratchRepairInfo);
        }
        if (source.ArtifactRepairInfo != null) {
            this.ArtifactRepairInfo = new ArtifactRepairInfo(source.ArtifactRepairInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "RepairInfo.", this.RepairInfo);
        this.setParamObj(map, prefix + "VideoFrameInterpolationInfo.", this.VideoFrameInterpolationInfo);
        this.setParamObj(map, prefix + "SuperResolutionInfo.", this.SuperResolutionInfo);
        this.setParamObj(map, prefix + "HDRInfo.", this.HDRInfo);
        this.setParamObj(map, prefix + "VideoDenoiseInfo.", this.VideoDenoiseInfo);
        this.setParamObj(map, prefix + "ColorInfo.", this.ColorInfo);
        this.setParamObj(map, prefix + "SharpInfo.", this.SharpInfo);
        this.setParamObj(map, prefix + "FaceInfo.", this.FaceInfo);
        this.setParamObj(map, prefix + "LowLightInfo.", this.LowLightInfo);
        this.setParamObj(map, prefix + "ScratchRepairInfo.", this.ScratchRepairInfo);
        this.setParamObj(map, prefix + "ArtifactRepairInfo.", this.ArtifactRepairInfo);

    }
}

