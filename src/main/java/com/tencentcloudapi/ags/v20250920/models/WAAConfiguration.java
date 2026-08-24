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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WAAConfiguration extends AbstractModel {

    /**
    * <p>自定义waa镜像ID</p>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
     * Get <p>自定义waa镜像ID</p> 
     * @return ImageId <p>自定义waa镜像ID</p>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set <p>自定义waa镜像ID</p>
     * @param ImageId <p>自定义waa镜像ID</p>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    public WAAConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WAAConfiguration(WAAConfiguration source) {
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);

    }
}

