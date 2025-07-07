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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchLogErrors extends AbstractModel {

    /**
    * 日志主题ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 错误信息
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
    * 错误码
    */
    @SerializedName("ErrorCodeStr")
    @Expose
    private String ErrorCodeStr;

    /**
     * Get 日志主题ID 
     * @return TopicId 日志主题ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志主题ID
     * @param TopicId 日志主题ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 错误信息 
     * @return ErrorMsg 错误信息
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set 错误信息
     * @param ErrorMsg 错误信息
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    /**
     * Get 错误码 
     * @return ErrorCodeStr 错误码
     */
    public String getErrorCodeStr() {
        return this.ErrorCodeStr;
    }

    /**
     * Set 错误码
     * @param ErrorCodeStr 错误码
     */
    public void setErrorCodeStr(String ErrorCodeStr) {
        this.ErrorCodeStr = ErrorCodeStr;
    }

    public SearchLogErrors() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchLogErrors(SearchLogErrors source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
        if (source.ErrorCodeStr != null) {
            this.ErrorCodeStr = new String(source.ErrorCodeStr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);
        this.setParamSimple(map, prefix + "ErrorCodeStr", this.ErrorCodeStr);

    }
}

