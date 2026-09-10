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

public class ProcessImageAsyncTask extends AbstractModel {

    /**
    * <p>图片转码输出配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EncodeConfig")
    @Expose
    private ImageEncodeConfig EncodeConfig;

    /**
    * <p>图片增强配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnhanceConfig")
    @Expose
    private ImageEnhanceConfig EnhanceConfig;

    /**
    * <p>图片美颜配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BeautyConfig")
    @Expose
    private ImageBeautyConfig BeautyConfig;

    /**
    * <p>Ai抠图配置</p>
    */
    @SerializedName("AiCutOutConfig")
    @Expose
    private AiCutOutConfig AiCutOutConfig;

    /**
     * Get <p>图片转码输出配置。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EncodeConfig <p>图片转码输出配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageEncodeConfig getEncodeConfig() {
        return this.EncodeConfig;
    }

    /**
     * Set <p>图片转码输出配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EncodeConfig <p>图片转码输出配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEncodeConfig(ImageEncodeConfig EncodeConfig) {
        this.EncodeConfig = EncodeConfig;
    }

    /**
     * Get <p>图片增强配置。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnhanceConfig <p>图片增强配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageEnhanceConfig getEnhanceConfig() {
        return this.EnhanceConfig;
    }

    /**
     * Set <p>图片增强配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnhanceConfig <p>图片增强配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnhanceConfig(ImageEnhanceConfig EnhanceConfig) {
        this.EnhanceConfig = EnhanceConfig;
    }

    /**
     * Get <p>图片美颜配置。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BeautyConfig <p>图片美颜配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageBeautyConfig getBeautyConfig() {
        return this.BeautyConfig;
    }

    /**
     * Set <p>图片美颜配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BeautyConfig <p>图片美颜配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBeautyConfig(ImageBeautyConfig BeautyConfig) {
        this.BeautyConfig = BeautyConfig;
    }

    /**
     * Get <p>Ai抠图配置</p> 
     * @return AiCutOutConfig <p>Ai抠图配置</p>
     */
    public AiCutOutConfig getAiCutOutConfig() {
        return this.AiCutOutConfig;
    }

    /**
     * Set <p>Ai抠图配置</p>
     * @param AiCutOutConfig <p>Ai抠图配置</p>
     */
    public void setAiCutOutConfig(AiCutOutConfig AiCutOutConfig) {
        this.AiCutOutConfig = AiCutOutConfig;
    }

    public ProcessImageAsyncTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcessImageAsyncTask(ProcessImageAsyncTask source) {
        if (source.EncodeConfig != null) {
            this.EncodeConfig = new ImageEncodeConfig(source.EncodeConfig);
        }
        if (source.EnhanceConfig != null) {
            this.EnhanceConfig = new ImageEnhanceConfig(source.EnhanceConfig);
        }
        if (source.BeautyConfig != null) {
            this.BeautyConfig = new ImageBeautyConfig(source.BeautyConfig);
        }
        if (source.AiCutOutConfig != null) {
            this.AiCutOutConfig = new AiCutOutConfig(source.AiCutOutConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "EncodeConfig.", this.EncodeConfig);
        this.setParamObj(map, prefix + "EnhanceConfig.", this.EnhanceConfig);
        this.setParamObj(map, prefix + "BeautyConfig.", this.BeautyConfig);
        this.setParamObj(map, prefix + "AiCutOutConfig.", this.AiCutOutConfig);

    }
}

