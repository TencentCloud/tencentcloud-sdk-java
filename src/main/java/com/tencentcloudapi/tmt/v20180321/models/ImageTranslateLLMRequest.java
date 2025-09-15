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
package com.tencentcloudapi.tmt.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageTranslateLLMRequest extends AbstractModel {

    /**
    * 图片数据的Base64字符串，经Base64编码后不超过 9M，分辨率建议600*800以上，支持PNG、JPG、JPEG格式。
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
    * 目标语言，支持语言列表：

- 中文：zh
- 繁体（中国台湾）：zh-TW
- 繁体（中国香港）：zh-HK
- 英文：en
- 日语：ja
- 韩语：ko
- 泰语：th
- 越南语：vi
- 俄语：ru
- 德语：de
- 法语：fr
- 阿拉伯语：ar
- 西班牙语：es
- 意大利语：it
- 印度尼西亚语：id
- 马来西亚语：ms
- 葡萄牙语：pt
- 土耳其语：tr
- 
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * 输入图 Url。 使用Url的时候，Data参数需要传入""。 图片限制：小于 10MB，分辨率建议600*800以上，格式支持 jpg、jpeg、png。

    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get 图片数据的Base64字符串，经Base64编码后不超过 9M，分辨率建议600*800以上，支持PNG、JPG、JPEG格式。 
     * @return Data 图片数据的Base64字符串，经Base64编码后不超过 9M，分辨率建议600*800以上，支持PNG、JPG、JPEG格式。
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set 图片数据的Base64字符串，经Base64编码后不超过 9M，分辨率建议600*800以上，支持PNG、JPG、JPEG格式。
     * @param Data 图片数据的Base64字符串，经Base64编码后不超过 9M，分辨率建议600*800以上，支持PNG、JPG、JPEG格式。
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    /**
     * Get 目标语言，支持语言列表：

- 中文：zh
- 繁体（中国台湾）：zh-TW
- 繁体（中国香港）：zh-HK
- 英文：en
- 日语：ja
- 韩语：ko
- 泰语：th
- 越南语：vi
- 俄语：ru
- 德语：de
- 法语：fr
- 阿拉伯语：ar
- 西班牙语：es
- 意大利语：it
- 印度尼西亚语：id
- 马来西亚语：ms
- 葡萄牙语：pt
- 土耳其语：tr
-  
     * @return Target 目标语言，支持语言列表：

- 中文：zh
- 繁体（中国台湾）：zh-TW
- 繁体（中国香港）：zh-HK
- 英文：en
- 日语：ja
- 韩语：ko
- 泰语：th
- 越南语：vi
- 俄语：ru
- 德语：de
- 法语：fr
- 阿拉伯语：ar
- 西班牙语：es
- 意大利语：it
- 印度尼西亚语：id
- 马来西亚语：ms
- 葡萄牙语：pt
- 土耳其语：tr
- 
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set 目标语言，支持语言列表：

- 中文：zh
- 繁体（中国台湾）：zh-TW
- 繁体（中国香港）：zh-HK
- 英文：en
- 日语：ja
- 韩语：ko
- 泰语：th
- 越南语：vi
- 俄语：ru
- 德语：de
- 法语：fr
- 阿拉伯语：ar
- 西班牙语：es
- 意大利语：it
- 印度尼西亚语：id
- 马来西亚语：ms
- 葡萄牙语：pt
- 土耳其语：tr
- 
     * @param Target 目标语言，支持语言列表：

- 中文：zh
- 繁体（中国台湾）：zh-TW
- 繁体（中国香港）：zh-HK
- 英文：en
- 日语：ja
- 韩语：ko
- 泰语：th
- 越南语：vi
- 俄语：ru
- 德语：de
- 法语：fr
- 阿拉伯语：ar
- 西班牙语：es
- 意大利语：it
- 印度尼西亚语：id
- 马来西亚语：ms
- 葡萄牙语：pt
- 土耳其语：tr
- 
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get 输入图 Url。 使用Url的时候，Data参数需要传入""。 图片限制：小于 10MB，分辨率建议600*800以上，格式支持 jpg、jpeg、png。
 
     * @return Url 输入图 Url。 使用Url的时候，Data参数需要传入""。 图片限制：小于 10MB，分辨率建议600*800以上，格式支持 jpg、jpeg、png。

     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 输入图 Url。 使用Url的时候，Data参数需要传入""。 图片限制：小于 10MB，分辨率建议600*800以上，格式支持 jpg、jpeg、png。

     * @param Url 输入图 Url。 使用Url的时候，Data参数需要传入""。 图片限制：小于 10MB，分辨率建议600*800以上，格式支持 jpg、jpeg、png。

     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public ImageTranslateLLMRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageTranslateLLMRequest(ImageTranslateLLMRequest source) {
        if (source.Data != null) {
            this.Data = new String(source.Data);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

