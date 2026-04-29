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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomImage extends AbstractModel {

    /**
    * 镜像来源。支持企业版镜像（tcr）、个人版镜像（ccrPersonal）、个人版共有镜像（ccrAllPersonal)
    */
    @SerializedName("ImageSourceType")
    @Expose
    private String ImageSourceType;

    /**
    * 镜像信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageInfo")
    @Expose
    private ImageInfo ImageInfo;

    /**
    * 镜像获取密钥
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImagePullSecret")
    @Expose
    private ImagePullSecret ImagePullSecret;

    /**
     * Get 镜像来源。支持企业版镜像（tcr）、个人版镜像（ccrPersonal）、个人版共有镜像（ccrAllPersonal) 
     * @return ImageSourceType 镜像来源。支持企业版镜像（tcr）、个人版镜像（ccrPersonal）、个人版共有镜像（ccrAllPersonal)
     */
    public String getImageSourceType() {
        return this.ImageSourceType;
    }

    /**
     * Set 镜像来源。支持企业版镜像（tcr）、个人版镜像（ccrPersonal）、个人版共有镜像（ccrAllPersonal)
     * @param ImageSourceType 镜像来源。支持企业版镜像（tcr）、个人版镜像（ccrPersonal）、个人版共有镜像（ccrAllPersonal)
     */
    public void setImageSourceType(String ImageSourceType) {
        this.ImageSourceType = ImageSourceType;
    }

    /**
     * Get 镜像信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageInfo 镜像信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageInfo getImageInfo() {
        return this.ImageInfo;
    }

    /**
     * Set 镜像信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageInfo 镜像信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageInfo(ImageInfo ImageInfo) {
        this.ImageInfo = ImageInfo;
    }

    /**
     * Get 镜像获取密钥
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImagePullSecret 镜像获取密钥
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImagePullSecret getImagePullSecret() {
        return this.ImagePullSecret;
    }

    /**
     * Set 镜像获取密钥
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImagePullSecret 镜像获取密钥
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImagePullSecret(ImagePullSecret ImagePullSecret) {
        this.ImagePullSecret = ImagePullSecret;
    }

    public CustomImage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomImage(CustomImage source) {
        if (source.ImageSourceType != null) {
            this.ImageSourceType = new String(source.ImageSourceType);
        }
        if (source.ImageInfo != null) {
            this.ImageInfo = new ImageInfo(source.ImageInfo);
        }
        if (source.ImagePullSecret != null) {
            this.ImagePullSecret = new ImagePullSecret(source.ImagePullSecret);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageSourceType", this.ImageSourceType);
        this.setParamObj(map, prefix + "ImageInfo.", this.ImageInfo);
        this.setParamObj(map, prefix + "ImagePullSecret.", this.ImagePullSecret);

    }
}

