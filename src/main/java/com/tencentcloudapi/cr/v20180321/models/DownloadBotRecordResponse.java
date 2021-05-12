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
package com.tencentcloudapi.cr.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DownloadBotRecordResponse extends AbstractModel{

    /**
    * 录音地址。请求后30分钟内有效
    */
    @SerializedName("RecordCosUrl")
    @Expose
    private String RecordCosUrl;

    /**
    * 文本地址。请求后30分钟内有效
    */
    @SerializedName("TextCosUrl")
    @Expose
    private String TextCosUrl;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 录音地址。请求后30分钟内有效 
     * @return RecordCosUrl 录音地址。请求后30分钟内有效
     */
    public String getRecordCosUrl() {
        return this.RecordCosUrl;
    }

    /**
     * Set 录音地址。请求后30分钟内有效
     * @param RecordCosUrl 录音地址。请求后30分钟内有效
     */
    public void setRecordCosUrl(String RecordCosUrl) {
        this.RecordCosUrl = RecordCosUrl;
    }

    /**
     * Get 文本地址。请求后30分钟内有效 
     * @return TextCosUrl 文本地址。请求后30分钟内有效
     */
    public String getTextCosUrl() {
        return this.TextCosUrl;
    }

    /**
     * Set 文本地址。请求后30分钟内有效
     * @param TextCosUrl 文本地址。请求后30分钟内有效
     */
    public void setTextCosUrl(String TextCosUrl) {
        this.TextCosUrl = TextCosUrl;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DownloadBotRecordResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DownloadBotRecordResponse(DownloadBotRecordResponse source) {
        if (source.RecordCosUrl != null) {
            this.RecordCosUrl = new String(source.RecordCosUrl);
        }
        if (source.TextCosUrl != null) {
            this.TextCosUrl = new String(source.TextCosUrl);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecordCosUrl", this.RecordCosUrl);
        this.setParamSimple(map, prefix + "TextCosUrl", this.TextCosUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

