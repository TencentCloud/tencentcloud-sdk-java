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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AigcVideoReferenceImageInfo extends AbstractModel {

    /**
    * 用于指导视频生成的图片 URL。该URL需外网可访问。同时允许爬虫拉取。
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * 参考类型。
注意：
1. 当使用GV模型时，可作为参考方式,可选asset(素材)、style(风格)。
    */
    @SerializedName("ReferenceType")
    @Expose
    private String ReferenceType;

    /**
     * Get 用于指导视频生成的图片 URL。该URL需外网可访问。同时允许爬虫拉取。 
     * @return ImageUrl 用于指导视频生成的图片 URL。该URL需外网可访问。同时允许爬虫拉取。
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 用于指导视频生成的图片 URL。该URL需外网可访问。同时允许爬虫拉取。
     * @param ImageUrl 用于指导视频生成的图片 URL。该URL需外网可访问。同时允许爬虫拉取。
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get 参考类型。
注意：
1. 当使用GV模型时，可作为参考方式,可选asset(素材)、style(风格)。 
     * @return ReferenceType 参考类型。
注意：
1. 当使用GV模型时，可作为参考方式,可选asset(素材)、style(风格)。
     */
    public String getReferenceType() {
        return this.ReferenceType;
    }

    /**
     * Set 参考类型。
注意：
1. 当使用GV模型时，可作为参考方式,可选asset(素材)、style(风格)。
     * @param ReferenceType 参考类型。
注意：
1. 当使用GV模型时，可作为参考方式,可选asset(素材)、style(风格)。
     */
    public void setReferenceType(String ReferenceType) {
        this.ReferenceType = ReferenceType;
    }

    public AigcVideoReferenceImageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcVideoReferenceImageInfo(AigcVideoReferenceImageInfo source) {
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.ReferenceType != null) {
            this.ReferenceType = new String(source.ReferenceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "ReferenceType", this.ReferenceType);

    }
}

