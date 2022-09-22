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
package com.tencentcloudapi.ivld.v20210903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageLogo extends AbstractModel{

    /**
    * 图片中出现的Logo识别结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Logo")
    @Expose
    private String Logo;

    /**
    * Logo在图片中出现的位置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppearRect")
    @Expose
    private Rectf AppearRect;

    /**
     * Get 图片中出现的Logo识别结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Logo 图片中出现的Logo识别结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogo() {
        return this.Logo;
    }

    /**
     * Set 图片中出现的Logo识别结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param Logo 图片中出现的Logo识别结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogo(String Logo) {
        this.Logo = Logo;
    }

    /**
     * Get Logo在图片中出现的位置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppearRect Logo在图片中出现的位置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Rectf getAppearRect() {
        return this.AppearRect;
    }

    /**
     * Set Logo在图片中出现的位置
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppearRect Logo在图片中出现的位置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppearRect(Rectf AppearRect) {
        this.AppearRect = AppearRect;
    }

    public ImageLogo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageLogo(ImageLogo source) {
        if (source.Logo != null) {
            this.Logo = new String(source.Logo);
        }
        if (source.AppearRect != null) {
            this.AppearRect = new Rectf(source.AppearRect);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Logo", this.Logo);
        this.setParamObj(map, prefix + "AppearRect.", this.AppearRect);

    }
}

