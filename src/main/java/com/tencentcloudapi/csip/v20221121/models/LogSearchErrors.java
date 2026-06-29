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

public class LogSearchErrors extends AbstractModel {

    /**
    * <p>主题</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>错误信息</p>
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
    * <p>错误信息</p>
    */
    @SerializedName("ErrorCodeStr")
    @Expose
    private String ErrorCodeStr;

    /**
     * Get <p>主题</p> 
     * @return TopicId <p>主题</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>主题</p>
     * @param TopicId <p>主题</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>错误信息</p> 
     * @return ErrorMsg <p>错误信息</p>
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set <p>错误信息</p>
     * @param ErrorMsg <p>错误信息</p>
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    /**
     * Get <p>错误信息</p> 
     * @return ErrorCodeStr <p>错误信息</p>
     */
    public String getErrorCodeStr() {
        return this.ErrorCodeStr;
    }

    /**
     * Set <p>错误信息</p>
     * @param ErrorCodeStr <p>错误信息</p>
     */
    public void setErrorCodeStr(String ErrorCodeStr) {
        this.ErrorCodeStr = ErrorCodeStr;
    }

    public LogSearchErrors() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogSearchErrors(LogSearchErrors source) {
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

