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
package com.tencentcloudapi.es.v20250101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DocumentParseConfig extends AbstractModel {

    /**
    * 0:图片以链接形式返回
1:返回图片中提取的文本内容
    */
    @SerializedName("ImageResponseType")
    @Expose
    private Long ImageResponseType;

    /**
     * Get 0:图片以链接形式返回
1:返回图片中提取的文本内容 
     * @return ImageResponseType 0:图片以链接形式返回
1:返回图片中提取的文本内容
     */
    public Long getImageResponseType() {
        return this.ImageResponseType;
    }

    /**
     * Set 0:图片以链接形式返回
1:返回图片中提取的文本内容
     * @param ImageResponseType 0:图片以链接形式返回
1:返回图片中提取的文本内容
     */
    public void setImageResponseType(Long ImageResponseType) {
        this.ImageResponseType = ImageResponseType;
    }

    public DocumentParseConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DocumentParseConfig(DocumentParseConfig source) {
        if (source.ImageResponseType != null) {
            this.ImageResponseType = new Long(source.ImageResponseType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageResponseType", this.ImageResponseType);

    }
}

