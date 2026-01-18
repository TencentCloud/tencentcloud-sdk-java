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

public class ImageTransformConfig extends AbstractModel {

    /**
    * 图片缩放配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageResize")
    @Expose
    private ImageResizeConfig ImageResize;

    /**
     * Get 图片缩放配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageResize 图片缩放配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageResizeConfig getImageResize() {
        return this.ImageResize;
    }

    /**
     * Set 图片缩放配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageResize 图片缩放配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageResize(ImageResizeConfig ImageResize) {
        this.ImageResize = ImageResize;
    }

    public ImageTransformConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageTransformConfig(ImageTransformConfig source) {
        if (source.ImageResize != null) {
            this.ImageResize = new ImageResizeConfig(source.ImageResize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ImageResize.", this.ImageResize);

    }
}

