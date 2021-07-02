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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReportImageStructuredRequest extends AbstractModel{

    /**
    * 医疗报告图片URL
    */
    @SerializedName("ImageURL")
    @Expose
    private String ImageURL;

    /**
    * 医疗报告图片base64编码后内容
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
     * Get 医疗报告图片URL 
     * @return ImageURL 医疗报告图片URL
     */
    public String getImageURL() {
        return this.ImageURL;
    }

    /**
     * Set 医疗报告图片URL
     * @param ImageURL 医疗报告图片URL
     */
    public void setImageURL(String ImageURL) {
        this.ImageURL = ImageURL;
    }

    /**
     * Get 医疗报告图片base64编码后内容 
     * @return ImageBase64 医疗报告图片base64编码后内容
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set 医疗报告图片base64编码后内容
     * @param ImageBase64 医疗报告图片base64编码后内容
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    public ReportImageStructuredRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReportImageStructuredRequest(ReportImageStructuredRequest source) {
        if (source.ImageURL != null) {
            this.ImageURL = new String(source.ImageURL);
        }
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageURL", this.ImageURL);
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);

    }
}

