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

public class ImageOcr extends AbstractModel{

    /**
    * 图片中可视文本识别结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 可视文本在图片中的位置信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppearRect")
    @Expose
    private Rectf AppearRect;

    /**
     * Get 图片中可视文本识别结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Content 图片中可视文本识别结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 图片中可视文本识别结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param Content 图片中可视文本识别结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 可视文本在图片中的位置信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppearRect 可视文本在图片中的位置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Rectf getAppearRect() {
        return this.AppearRect;
    }

    /**
     * Set 可视文本在图片中的位置信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppearRect 可视文本在图片中的位置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppearRect(Rectf AppearRect) {
        this.AppearRect = AppearRect;
    }

    public ImageOcr() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageOcr(ImageOcr source) {
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.AppearRect != null) {
            this.AppearRect = new Rectf(source.AppearRect);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamObj(map, prefix + "AppearRect.", this.AppearRect);

    }
}

