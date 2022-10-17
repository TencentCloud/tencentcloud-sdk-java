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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetectReflectLivenessAndCompareRequest extends AbstractModel{

    /**
    * SDK生成的活体检测数据包的资源地址。
    */
    @SerializedName("LiveDataUrl")
    @Expose
    private String LiveDataUrl;

    /**
    * SDK生成的活体检测数据包的资源内容MD5（32位，用于校验LiveData的一致性）。
    */
    @SerializedName("LiveDataMd5")
    @Expose
    private String LiveDataMd5;

    /**
    * 用于比对的目标图片的资源地址。
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * 用于比对的目标图片的资源MD5（32位，用于校验Image的一致性）。
    */
    @SerializedName("ImageMd5")
    @Expose
    private String ImageMd5;

    /**
     * Get SDK生成的活体检测数据包的资源地址。 
     * @return LiveDataUrl SDK生成的活体检测数据包的资源地址。
     */
    public String getLiveDataUrl() {
        return this.LiveDataUrl;
    }

    /**
     * Set SDK生成的活体检测数据包的资源地址。
     * @param LiveDataUrl SDK生成的活体检测数据包的资源地址。
     */
    public void setLiveDataUrl(String LiveDataUrl) {
        this.LiveDataUrl = LiveDataUrl;
    }

    /**
     * Get SDK生成的活体检测数据包的资源内容MD5（32位，用于校验LiveData的一致性）。 
     * @return LiveDataMd5 SDK生成的活体检测数据包的资源内容MD5（32位，用于校验LiveData的一致性）。
     */
    public String getLiveDataMd5() {
        return this.LiveDataMd5;
    }

    /**
     * Set SDK生成的活体检测数据包的资源内容MD5（32位，用于校验LiveData的一致性）。
     * @param LiveDataMd5 SDK生成的活体检测数据包的资源内容MD5（32位，用于校验LiveData的一致性）。
     */
    public void setLiveDataMd5(String LiveDataMd5) {
        this.LiveDataMd5 = LiveDataMd5;
    }

    /**
     * Get 用于比对的目标图片的资源地址。 
     * @return ImageUrl 用于比对的目标图片的资源地址。
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 用于比对的目标图片的资源地址。
     * @param ImageUrl 用于比对的目标图片的资源地址。
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get 用于比对的目标图片的资源MD5（32位，用于校验Image的一致性）。 
     * @return ImageMd5 用于比对的目标图片的资源MD5（32位，用于校验Image的一致性）。
     */
    public String getImageMd5() {
        return this.ImageMd5;
    }

    /**
     * Set 用于比对的目标图片的资源MD5（32位，用于校验Image的一致性）。
     * @param ImageMd5 用于比对的目标图片的资源MD5（32位，用于校验Image的一致性）。
     */
    public void setImageMd5(String ImageMd5) {
        this.ImageMd5 = ImageMd5;
    }

    public DetectReflectLivenessAndCompareRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetectReflectLivenessAndCompareRequest(DetectReflectLivenessAndCompareRequest source) {
        if (source.LiveDataUrl != null) {
            this.LiveDataUrl = new String(source.LiveDataUrl);
        }
        if (source.LiveDataMd5 != null) {
            this.LiveDataMd5 = new String(source.LiveDataMd5);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.ImageMd5 != null) {
            this.ImageMd5 = new String(source.ImageMd5);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LiveDataUrl", this.LiveDataUrl);
        this.setParamSimple(map, prefix + "LiveDataMd5", this.LiveDataMd5);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "ImageMd5", this.ImageMd5);

    }
}

