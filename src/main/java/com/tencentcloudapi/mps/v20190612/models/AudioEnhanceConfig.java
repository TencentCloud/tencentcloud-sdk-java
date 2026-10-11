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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AudioEnhanceConfig extends AbstractModel {

    /**
    * <p>音频降噪配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Denoise")
    @Expose
    private AudioDenoiseConfig Denoise;

    /**
    * <p>音频分离配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Separate")
    @Expose
    private AudioSeparateConfig Separate;

    /**
    * <p>音量均衡配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VolumeBalance")
    @Expose
    private VolumeBalanceConfig VolumeBalance;

    /**
    * <p>音频美化配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Beautify")
    @Expose
    private AudioBeautifyConfig Beautify;

    /**
    * <p>音频增强编辑。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AudioEnhanceEdit")
    @Expose
    private AudioEnhanceEditConfig AudioEnhanceEdit;

    /**
     * Get <p>音频降噪配置。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Denoise <p>音频降噪配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AudioDenoiseConfig getDenoise() {
        return this.Denoise;
    }

    /**
     * Set <p>音频降噪配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Denoise <p>音频降噪配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDenoise(AudioDenoiseConfig Denoise) {
        this.Denoise = Denoise;
    }

    /**
     * Get <p>音频分离配置。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Separate <p>音频分离配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AudioSeparateConfig getSeparate() {
        return this.Separate;
    }

    /**
     * Set <p>音频分离配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Separate <p>音频分离配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSeparate(AudioSeparateConfig Separate) {
        this.Separate = Separate;
    }

    /**
     * Get <p>音量均衡配置。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VolumeBalance <p>音量均衡配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VolumeBalanceConfig getVolumeBalance() {
        return this.VolumeBalance;
    }

    /**
     * Set <p>音量均衡配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VolumeBalance <p>音量均衡配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVolumeBalance(VolumeBalanceConfig VolumeBalance) {
        this.VolumeBalance = VolumeBalance;
    }

    /**
     * Get <p>音频美化配置。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Beautify <p>音频美化配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AudioBeautifyConfig getBeautify() {
        return this.Beautify;
    }

    /**
     * Set <p>音频美化配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Beautify <p>音频美化配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBeautify(AudioBeautifyConfig Beautify) {
        this.Beautify = Beautify;
    }

    /**
     * Get <p>音频增强编辑。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AudioEnhanceEdit <p>音频增强编辑。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AudioEnhanceEditConfig getAudioEnhanceEdit() {
        return this.AudioEnhanceEdit;
    }

    /**
     * Set <p>音频增强编辑。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AudioEnhanceEdit <p>音频增强编辑。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAudioEnhanceEdit(AudioEnhanceEditConfig AudioEnhanceEdit) {
        this.AudioEnhanceEdit = AudioEnhanceEdit;
    }

    public AudioEnhanceConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioEnhanceConfig(AudioEnhanceConfig source) {
        if (source.Denoise != null) {
            this.Denoise = new AudioDenoiseConfig(source.Denoise);
        }
        if (source.Separate != null) {
            this.Separate = new AudioSeparateConfig(source.Separate);
        }
        if (source.VolumeBalance != null) {
            this.VolumeBalance = new VolumeBalanceConfig(source.VolumeBalance);
        }
        if (source.Beautify != null) {
            this.Beautify = new AudioBeautifyConfig(source.Beautify);
        }
        if (source.AudioEnhanceEdit != null) {
            this.AudioEnhanceEdit = new AudioEnhanceEditConfig(source.AudioEnhanceEdit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Denoise.", this.Denoise);
        this.setParamObj(map, prefix + "Separate.", this.Separate);
        this.setParamObj(map, prefix + "VolumeBalance.", this.VolumeBalance);
        this.setParamObj(map, prefix + "Beautify.", this.Beautify);
        this.setParamObj(map, prefix + "AudioEnhanceEdit.", this.AudioEnhanceEdit);

    }
}

