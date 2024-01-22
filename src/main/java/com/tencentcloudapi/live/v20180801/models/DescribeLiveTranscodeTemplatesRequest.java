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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLiveTranscodeTemplatesRequest extends AbstractModel {

    /**
    * 转码模板类型，默认0。
0：普通转码模板。
1：自适应码率转码模板。
    */
    @SerializedName("TemplateType")
    @Expose
    private Long TemplateType;

    /**
     * Get 转码模板类型，默认0。
0：普通转码模板。
1：自适应码率转码模板。 
     * @return TemplateType 转码模板类型，默认0。
0：普通转码模板。
1：自适应码率转码模板。
     */
    public Long getTemplateType() {
        return this.TemplateType;
    }

    /**
     * Set 转码模板类型，默认0。
0：普通转码模板。
1：自适应码率转码模板。
     * @param TemplateType 转码模板类型，默认0。
0：普通转码模板。
1：自适应码率转码模板。
     */
    public void setTemplateType(Long TemplateType) {
        this.TemplateType = TemplateType;
    }

    public DescribeLiveTranscodeTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLiveTranscodeTemplatesRequest(DescribeLiveTranscodeTemplatesRequest source) {
        if (source.TemplateType != null) {
            this.TemplateType = new Long(source.TemplateType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateType", this.TemplateType);

    }
}

