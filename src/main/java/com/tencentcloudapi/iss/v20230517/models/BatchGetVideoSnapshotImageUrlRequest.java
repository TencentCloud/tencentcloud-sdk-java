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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchGetVideoSnapshotImageUrlRequest extends AbstractModel {

    /**
    * <p>图片Id</p>
    */
    @SerializedName("ImageIds")
    @Expose
    private String [] ImageIds;

    /**
    * <p>图片URL有效期，单位：秒</p><p>取值范围：[60, 86400]</p><p>默认值：600</p>
    */
    @SerializedName("ImageUrlExpires")
    @Expose
    private Long ImageUrlExpires;

    /**
     * Get <p>图片Id</p> 
     * @return ImageIds <p>图片Id</p>
     */
    public String [] getImageIds() {
        return this.ImageIds;
    }

    /**
     * Set <p>图片Id</p>
     * @param ImageIds <p>图片Id</p>
     */
    public void setImageIds(String [] ImageIds) {
        this.ImageIds = ImageIds;
    }

    /**
     * Get <p>图片URL有效期，单位：秒</p><p>取值范围：[60, 86400]</p><p>默认值：600</p> 
     * @return ImageUrlExpires <p>图片URL有效期，单位：秒</p><p>取值范围：[60, 86400]</p><p>默认值：600</p>
     */
    public Long getImageUrlExpires() {
        return this.ImageUrlExpires;
    }

    /**
     * Set <p>图片URL有效期，单位：秒</p><p>取值范围：[60, 86400]</p><p>默认值：600</p>
     * @param ImageUrlExpires <p>图片URL有效期，单位：秒</p><p>取值范围：[60, 86400]</p><p>默认值：600</p>
     */
    public void setImageUrlExpires(Long ImageUrlExpires) {
        this.ImageUrlExpires = ImageUrlExpires;
    }

    public BatchGetVideoSnapshotImageUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchGetVideoSnapshotImageUrlRequest(BatchGetVideoSnapshotImageUrlRequest source) {
        if (source.ImageIds != null) {
            this.ImageIds = new String[source.ImageIds.length];
            for (int i = 0; i < source.ImageIds.length; i++) {
                this.ImageIds[i] = new String(source.ImageIds[i]);
            }
        }
        if (source.ImageUrlExpires != null) {
            this.ImageUrlExpires = new Long(source.ImageUrlExpires);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ImageIds.", this.ImageIds);
        this.setParamSimple(map, prefix + "ImageUrlExpires", this.ImageUrlExpires);

    }
}

