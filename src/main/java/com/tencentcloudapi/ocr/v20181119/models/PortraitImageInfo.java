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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PortraitImageInfo extends AbstractModel {

    /**
    * 头像
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PortraitImage")
    @Expose
    private String PortraitImage;

    /**
    * 头像坐标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageCoordinates")
    @Expose
    private ImageCoordinates ImageCoordinates;

    /**
     * Get 头像
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PortraitImage 头像
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPortraitImage() {
        return this.PortraitImage;
    }

    /**
     * Set 头像
注意：此字段可能返回 null，表示取不到有效值。
     * @param PortraitImage 头像
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPortraitImage(String PortraitImage) {
        this.PortraitImage = PortraitImage;
    }

    /**
     * Get 头像坐标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageCoordinates 头像坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageCoordinates getImageCoordinates() {
        return this.ImageCoordinates;
    }

    /**
     * Set 头像坐标
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageCoordinates 头像坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageCoordinates(ImageCoordinates ImageCoordinates) {
        this.ImageCoordinates = ImageCoordinates;
    }

    public PortraitImageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PortraitImageInfo(PortraitImageInfo source) {
        if (source.PortraitImage != null) {
            this.PortraitImage = new String(source.PortraitImage);
        }
        if (source.ImageCoordinates != null) {
            this.ImageCoordinates = new ImageCoordinates(source.ImageCoordinates);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PortraitImage", this.PortraitImage);
        this.setParamObj(map, prefix + "ImageCoordinates.", this.ImageCoordinates);

    }
}

