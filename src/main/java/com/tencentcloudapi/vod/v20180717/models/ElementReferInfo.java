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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ElementReferInfo extends AbstractModel {

    /**
    * 不同角度的主体参考图片URL。
图片格式支持.jpg / .jpeg / .png
图片文件大小不能超过10MB，图片宽高尺寸不小于300px，图片宽高比要在1:2.5 ~ 2.5:1之间。
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
     * Get 不同角度的主体参考图片URL。
图片格式支持.jpg / .jpeg / .png
图片文件大小不能超过10MB，图片宽高尺寸不小于300px，图片宽高比要在1:2.5 ~ 2.5:1之间。 
     * @return ImageUrl 不同角度的主体参考图片URL。
图片格式支持.jpg / .jpeg / .png
图片文件大小不能超过10MB，图片宽高尺寸不小于300px，图片宽高比要在1:2.5 ~ 2.5:1之间。
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 不同角度的主体参考图片URL。
图片格式支持.jpg / .jpeg / .png
图片文件大小不能超过10MB，图片宽高尺寸不小于300px，图片宽高比要在1:2.5 ~ 2.5:1之间。
     * @param ImageUrl 不同角度的主体参考图片URL。
图片格式支持.jpg / .jpeg / .png
图片文件大小不能超过10MB，图片宽高尺寸不小于300px，图片宽高比要在1:2.5 ~ 2.5:1之间。
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    public ElementReferInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ElementReferInfo(ElementReferInfo source) {
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);

    }
}

