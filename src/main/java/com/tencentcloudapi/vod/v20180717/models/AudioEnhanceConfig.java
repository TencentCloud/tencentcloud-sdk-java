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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AudioEnhanceConfig extends AbstractModel {

    /**
    * 音频降噪配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Denoise")
    @Expose
    private AudioDenoiseInfo Denoise;

    /**
    * 音频分离配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Separate")
    @Expose
    private AudioSeparateInfo Separate;

    /**
    * 音量均衡配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VolumeBalance")
    @Expose
    private AudioVolumeBalanceInfo VolumeBalance;

    /**
    * 音量美化配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Beautify")
    @Expose
    private AudioBeautifyInfo Beautify;

    /**
     * Get 音频降噪配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Denoise 音频降噪配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AudioDenoiseInfo getDenoise() {
        return this.Denoise;
    }

    /**
     * Set 音频降噪配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Denoise 音频降噪配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDenoise(AudioDenoiseInfo Denoise) {
        this.Denoise = Denoise;
    }

    /**
     * Get 音频分离配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Separate 音频分离配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AudioSeparateInfo getSeparate() {
        return this.Separate;
    }

    /**
     * Set 音频分离配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Separate 音频分离配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSeparate(AudioSeparateInfo Separate) {
        this.Separate = Separate;
    }

    /**
     * Get 音量均衡配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VolumeBalance 音量均衡配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AudioVolumeBalanceInfo getVolumeBalance() {
        return this.VolumeBalance;
    }

    /**
     * Set 音量均衡配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VolumeBalance 音量均衡配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVolumeBalance(AudioVolumeBalanceInfo VolumeBalance) {
        this.VolumeBalance = VolumeBalance;
    }

    /**
     * Get 音量美化配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Beautify 音量美化配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AudioBeautifyInfo getBeautify() {
        return this.Beautify;
    }

    /**
     * Set 音量美化配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Beautify 音量美化配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBeautify(AudioBeautifyInfo Beautify) {
        this.Beautify = Beautify;
    }

    public AudioEnhanceConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioEnhanceConfig(AudioEnhanceConfig source) {
        if (source.Denoise != null) {
            this.Denoise = new AudioDenoiseInfo(source.Denoise);
        }
        if (source.Separate != null) {
            this.Separate = new AudioSeparateInfo(source.Separate);
        }
        if (source.VolumeBalance != null) {
            this.VolumeBalance = new AudioVolumeBalanceInfo(source.VolumeBalance);
        }
        if (source.Beautify != null) {
            this.Beautify = new AudioBeautifyInfo(source.Beautify);
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

    }
}

