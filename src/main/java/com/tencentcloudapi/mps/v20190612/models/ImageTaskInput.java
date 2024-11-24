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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageTaskInput extends AbstractModel {

    /**
    * 图片编码配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EncodeConfig")
    @Expose
    private ImageEncodeConfig EncodeConfig;

    /**
    * 图片增强配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnhanceConfig")
    @Expose
    private ImageEnhanceConfig EnhanceConfig;

    /**
     * Get 图片编码配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EncodeConfig 图片编码配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageEncodeConfig getEncodeConfig() {
        return this.EncodeConfig;
    }

    /**
     * Set 图片编码配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param EncodeConfig 图片编码配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEncodeConfig(ImageEncodeConfig EncodeConfig) {
        this.EncodeConfig = EncodeConfig;
    }

    /**
     * Get 图片增强配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnhanceConfig 图片增强配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageEnhanceConfig getEnhanceConfig() {
        return this.EnhanceConfig;
    }

    /**
     * Set 图片增强配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnhanceConfig 图片增强配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnhanceConfig(ImageEnhanceConfig EnhanceConfig) {
        this.EnhanceConfig = EnhanceConfig;
    }

    public ImageTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageTaskInput(ImageTaskInput source) {
        if (source.EncodeConfig != null) {
            this.EncodeConfig = new ImageEncodeConfig(source.EncodeConfig);
        }
        if (source.EnhanceConfig != null) {
            this.EnhanceConfig = new ImageEnhanceConfig(source.EnhanceConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "EncodeConfig.", this.EncodeConfig);
        this.setParamObj(map, prefix + "EnhanceConfig.", this.EnhanceConfig);

    }
}

