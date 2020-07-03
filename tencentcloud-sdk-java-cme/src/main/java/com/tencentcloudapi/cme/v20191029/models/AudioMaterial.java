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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AudioMaterial extends AbstractModel{

    /**
    * 素材元信息。
    */
    @SerializedName("MetaData")
    @Expose
    private MediaMetaData MetaData;

    /**
    * 素材媒体文件的 URL 地址。
    */
    @SerializedName("MaterialUrl")
    @Expose
    private String MaterialUrl;

    /**
    * 素材媒体文件的封面图片地址。
    */
    @SerializedName("CoverUrl")
    @Expose
    private String CoverUrl;

    /**
    * 素材状态。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaterialStatus")
    @Expose
    private MaterialStatus MaterialStatus;

    /**
     * Get 素材元信息。 
     * @return MetaData 素材元信息。
     */
    public MediaMetaData getMetaData() {
        return this.MetaData;
    }

    /**
     * Set 素材元信息。
     * @param MetaData 素材元信息。
     */
    public void setMetaData(MediaMetaData MetaData) {
        this.MetaData = MetaData;
    }

    /**
     * Get 素材媒体文件的 URL 地址。 
     * @return MaterialUrl 素材媒体文件的 URL 地址。
     */
    public String getMaterialUrl() {
        return this.MaterialUrl;
    }

    /**
     * Set 素材媒体文件的 URL 地址。
     * @param MaterialUrl 素材媒体文件的 URL 地址。
     */
    public void setMaterialUrl(String MaterialUrl) {
        this.MaterialUrl = MaterialUrl;
    }

    /**
     * Get 素材媒体文件的封面图片地址。 
     * @return CoverUrl 素材媒体文件的封面图片地址。
     */
    public String getCoverUrl() {
        return this.CoverUrl;
    }

    /**
     * Set 素材媒体文件的封面图片地址。
     * @param CoverUrl 素材媒体文件的封面图片地址。
     */
    public void setCoverUrl(String CoverUrl) {
        this.CoverUrl = CoverUrl;
    }

    /**
     * Get 素材状态。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaterialStatus 素材状态。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MaterialStatus getMaterialStatus() {
        return this.MaterialStatus;
    }

    /**
     * Set 素材状态。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaterialStatus 素材状态。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaterialStatus(MaterialStatus MaterialStatus) {
        this.MaterialStatus = MaterialStatus;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "MetaData.", this.MetaData);
        this.setParamSimple(map, prefix + "MaterialUrl", this.MaterialUrl);
        this.setParamSimple(map, prefix + "CoverUrl", this.CoverUrl);
        this.setParamObj(map, prefix + "MaterialStatus.", this.MaterialStatus);

    }
}

