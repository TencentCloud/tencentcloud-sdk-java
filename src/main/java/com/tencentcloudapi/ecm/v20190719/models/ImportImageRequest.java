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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImportImageRequest extends AbstractModel {

    /**
    * 镜像的Id。
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 镜像的描述。
    */
    @SerializedName("ImageDescription")
    @Expose
    private String ImageDescription;

    /**
    * 源地域
    */
    @SerializedName("SourceRegion")
    @Expose
    private String SourceRegion;

    /**
     * Get 镜像的Id。 
     * @return ImageId 镜像的Id。
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 镜像的Id。
     * @param ImageId 镜像的Id。
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 镜像的描述。 
     * @return ImageDescription 镜像的描述。
     */
    public String getImageDescription() {
        return this.ImageDescription;
    }

    /**
     * Set 镜像的描述。
     * @param ImageDescription 镜像的描述。
     */
    public void setImageDescription(String ImageDescription) {
        this.ImageDescription = ImageDescription;
    }

    /**
     * Get 源地域 
     * @return SourceRegion 源地域
     */
    public String getSourceRegion() {
        return this.SourceRegion;
    }

    /**
     * Set 源地域
     * @param SourceRegion 源地域
     */
    public void setSourceRegion(String SourceRegion) {
        this.SourceRegion = SourceRegion;
    }

    public ImportImageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImportImageRequest(ImportImageRequest source) {
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.ImageDescription != null) {
            this.ImageDescription = new String(source.ImageDescription);
        }
        if (source.SourceRegion != null) {
            this.SourceRegion = new String(source.SourceRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ImageDescription", this.ImageDescription);
        this.setParamSimple(map, prefix + "SourceRegion", this.SourceRegion);

    }
}

