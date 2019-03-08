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

public class MediaImageSpriteInfo  extends AbstractModel{

    /**
    * 特定规格的雪碧图信息集合，每个元素代表一套相同规格的雪碧图。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageSpriteSet")
    @Expose
    private MediaImageSpriteItem [] ImageSpriteSet;

    /**
     * 获取特定规格的雪碧图信息集合，每个元素代表一套相同规格的雪碧图。
注意：此字段可能返回 null，表示取不到有效值。
     * @return ImageSpriteSet 特定规格的雪碧图信息集合，每个元素代表一套相同规格的雪碧图。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaImageSpriteItem [] getImageSpriteSet() {
        return this.ImageSpriteSet;
    }

    /**
     * 设置特定规格的雪碧图信息集合，每个元素代表一套相同规格的雪碧图。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageSpriteSet 特定规格的雪碧图信息集合，每个元素代表一套相同规格的雪碧图。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageSpriteSet(MediaImageSpriteItem [] ImageSpriteSet) {
        this.ImageSpriteSet = ImageSpriteSet;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ImageSpriteSet.", this.ImageSpriteSet);

    }
}

