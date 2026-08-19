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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAIAnalysisFileDownloadURLRequest extends AbstractModel {

    /**
    * <p>文件原始下载地址，最大 2048 字符。可通过 AI 分析流式接口返回的文件信息获取。</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get <p>文件原始下载地址，最大 2048 字符。可通过 AI 分析流式接口返回的文件信息获取。</p> 
     * @return Url <p>文件原始下载地址，最大 2048 字符。可通过 AI 分析流式接口返回的文件信息获取。</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>文件原始下载地址，最大 2048 字符。可通过 AI 分析流式接口返回的文件信息获取。</p>
     * @param Url <p>文件原始下载地址，最大 2048 字符。可通过 AI 分析流式接口返回的文件信息获取。</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public DescribeAIAnalysisFileDownloadURLRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAIAnalysisFileDownloadURLRequest(DescribeAIAnalysisFileDownloadURLRequest source) {
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

