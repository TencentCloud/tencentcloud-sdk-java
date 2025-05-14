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
package com.tencentcloudapi.tmt.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageTranslateLLMRequest extends AbstractModel {

    /**
    * 输入图 Url。 使用Url的时候，Data参数需要传入""。 图片限制：小于 10MB，分辨率建议600*800以上，格式支持 jpg、jpeg、png。

    */
    @SerializedName("Url")
    @Expose
    private String Url;

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
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

