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
package com.tencentcloudapi.ame.v20190916.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Album extends AbstractModel{

    /**
    * 专辑名
    */
    @SerializedName("AlbumName")
    @Expose
    private String AlbumName;

    /**
    * 专辑图片大小及类别
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImagePathMap")
    @Expose
    private ImagePath [] ImagePathMap;

    /**
     * Get 专辑名 
     * @return AlbumName 专辑名
     */
    public String getAlbumName() {
        return this.AlbumName;
    }

    /**
     * Set 专辑名
     * @param AlbumName 专辑名
     */
    public void setAlbumName(String AlbumName) {
        this.AlbumName = AlbumName;
    }

    /**
     * Get 专辑图片大小及类别
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImagePathMap 专辑图片大小及类别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImagePath [] getImagePathMap() {
        return this.ImagePathMap;
    }

    /**
     * Set 专辑图片大小及类别
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImagePathMap 专辑图片大小及类别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImagePathMap(ImagePath [] ImagePathMap) {
        this.ImagePathMap = ImagePathMap;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlbumName", this.AlbumName);
        this.setParamArrayObj(map, prefix + "ImagePathMap.", this.ImagePathMap);

    }
}

