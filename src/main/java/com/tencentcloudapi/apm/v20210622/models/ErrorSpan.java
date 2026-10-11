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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ErrorSpan extends AbstractModel {

    /**
    * <p>异常SpanId</p>
    */
    @SerializedName("SpanID")
    @Expose
    private String SpanID;

    /**
    * <p>异常信息</p>
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
     * Get <p>异常SpanId</p> 
     * @return SpanID <p>异常SpanId</p>
     */
    public String getSpanID() {
        return this.SpanID;
    }

    /**
     * Set <p>异常SpanId</p>
     * @param SpanID <p>异常SpanId</p>
     */
    public void setSpanID(String SpanID) {
        this.SpanID = SpanID;
    }

    /**
     * Get <p>异常信息</p> 
     * @return ErrorMessage <p>异常信息</p>
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set <p>异常信息</p>
     * @param ErrorMessage <p>异常信息</p>
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    public ErrorSpan() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ErrorSpan(ErrorSpan source) {
        if (source.SpanID != null) {
            this.SpanID = new String(source.SpanID);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpanID", this.SpanID);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);

    }
}

