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
package com.tencentcloudapi.facefusion.v20220927.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogoParam extends AbstractModel {

    /**
    * 标识图片位于融合结果图中的坐标，将按照坐标对标识图片进行位置和大小的拉伸匹配。
Width、Height <= 2160。
    */
    @SerializedName("LogoRect")
    @Expose
    private FaceRect LogoRect;

    /**
    * 标识图片Url地址

●base64 和 url 必须提供一个，如果都提供以 url 为准。
●支持图片格式：支持jpg或png
专业版：base64 编码后大小不超过10M。
非专业版：base64 编码后大小不超过5M。
    */
    @SerializedName("LogoUrl")
    @Expose
    private String LogoUrl;

    /**
    * 输入图片base64。
●base64 和 url 必须提供一个，如果都提供以 url 为准。
●支持图片格式：支持jpg或png
专业版：base64 编码后大小不超过10M。
非专业版：base64 编码后大小不超过5M。
    */
    @SerializedName("LogoImage")
    @Expose
    private String LogoImage;

    /**
     * Get 标识图片位于融合结果图中的坐标，将按照坐标对标识图片进行位置和大小的拉伸匹配。
Width、Height <= 2160。 
     * @return LogoRect 标识图片位于融合结果图中的坐标，将按照坐标对标识图片进行位置和大小的拉伸匹配。
Width、Height <= 2160。
     */
    public FaceRect getLogoRect() {
        return this.LogoRect;
    }

    /**
     * Set 标识图片位于融合结果图中的坐标，将按照坐标对标识图片进行位置和大小的拉伸匹配。
Width、Height <= 2160。
     * @param LogoRect 标识图片位于融合结果图中的坐标，将按照坐标对标识图片进行位置和大小的拉伸匹配。
Width、Height <= 2160。
     */
    public void setLogoRect(FaceRect LogoRect) {
        this.LogoRect = LogoRect;
    }

    /**
     * Get 标识图片Url地址

●base64 和 url 必须提供一个，如果都提供以 url 为准。
●支持图片格式：支持jpg或png
专业版：base64 编码后大小不超过10M。
非专业版：base64 编码后大小不超过5M。 
     * @return LogoUrl 标识图片Url地址

●base64 和 url 必须提供一个，如果都提供以 url 为准。
●支持图片格式：支持jpg或png
专业版：base64 编码后大小不超过10M。
非专业版：base64 编码后大小不超过5M。
     */
    public String getLogoUrl() {
        return this.LogoUrl;
    }

    /**
     * Set 标识图片Url地址

●base64 和 url 必须提供一个，如果都提供以 url 为准。
●支持图片格式：支持jpg或png
专业版：base64 编码后大小不超过10M。
非专业版：base64 编码后大小不超过5M。
     * @param LogoUrl 标识图片Url地址

●base64 和 url 必须提供一个，如果都提供以 url 为准。
●支持图片格式：支持jpg或png
专业版：base64 编码后大小不超过10M。
非专业版：base64 编码后大小不超过5M。
     */
    public void setLogoUrl(String LogoUrl) {
        this.LogoUrl = LogoUrl;
    }

    /**
     * Get 输入图片base64。
●base64 和 url 必须提供一个，如果都提供以 url 为准。
●支持图片格式：支持jpg或png
专业版：base64 编码后大小不超过10M。
非专业版：base64 编码后大小不超过5M。 
     * @return LogoImage 输入图片base64。
●base64 和 url 必须提供一个，如果都提供以 url 为准。
●支持图片格式：支持jpg或png
专业版：base64 编码后大小不超过10M。
非专业版：base64 编码后大小不超过5M。
     */
    public String getLogoImage() {
        return this.LogoImage;
    }

    /**
     * Set 输入图片base64。
●base64 和 url 必须提供一个，如果都提供以 url 为准。
●支持图片格式：支持jpg或png
专业版：base64 编码后大小不超过10M。
非专业版：base64 编码后大小不超过5M。
     * @param LogoImage 输入图片base64。
●base64 和 url 必须提供一个，如果都提供以 url 为准。
●支持图片格式：支持jpg或png
专业版：base64 编码后大小不超过10M。
非专业版：base64 编码后大小不超过5M。
     */
    public void setLogoImage(String LogoImage) {
        this.LogoImage = LogoImage;
    }

    public LogoParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogoParam(LogoParam source) {
        if (source.LogoRect != null) {
            this.LogoRect = new FaceRect(source.LogoRect);
        }
        if (source.LogoUrl != null) {
            this.LogoUrl = new String(source.LogoUrl);
        }
        if (source.LogoImage != null) {
            this.LogoImage = new String(source.LogoImage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "LogoRect.", this.LogoRect);
        this.setParamSimple(map, prefix + "LogoUrl", this.LogoUrl);
        this.setParamSimple(map, prefix + "LogoImage", this.LogoImage);

    }
}

