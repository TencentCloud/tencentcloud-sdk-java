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

public class DeleteImageRequest extends AbstractModel {

    /**
    * 镜像ID列表。
    */
    @SerializedName("ImageIDSet")
    @Expose
    private String [] ImageIDSet;

    /**
     * Get 镜像ID列表。 
     * @return ImageIDSet 镜像ID列表。
     */
    public String [] getImageIDSet() {
        return this.ImageIDSet;
    }

    /**
     * Set 镜像ID列表。
     * @param ImageIDSet 镜像ID列表。
     */
    public void setImageIDSet(String [] ImageIDSet) {
        this.ImageIDSet = ImageIDSet;
    }

    public DeleteImageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteImageRequest(DeleteImageRequest source) {
        if (source.ImageIDSet != null) {
            this.ImageIDSet = new String[source.ImageIDSet.length];
            for (int i = 0; i < source.ImageIDSet.length; i++) {
                this.ImageIDSet[i] = new String(source.ImageIDSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ImageIDSet.", this.ImageIDSet);

    }
}

