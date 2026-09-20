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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAuditImagesRequest extends AbstractModel {

    /**
    * <p>样本图片列表。</p>
    */
    @SerializedName("Images")
    @Expose
    private AuditImage [] Images;

    /**
     * Get <p>样本图片列表。</p> 
     * @return Images <p>样本图片列表。</p>
     */
    public AuditImage [] getImages() {
        return this.Images;
    }

    /**
     * Set <p>样本图片列表。</p>
     * @param Images <p>样本图片列表。</p>
     */
    public void setImages(AuditImage [] Images) {
        this.Images = Images;
    }

    public CreateAuditImagesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAuditImagesRequest(CreateAuditImagesRequest source) {
        if (source.Images != null) {
            this.Images = new AuditImage[source.Images.length];
            for (int i = 0; i < source.Images.length; i++) {
                this.Images[i] = new AuditImage(source.Images[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Images.", this.Images);

    }
}

