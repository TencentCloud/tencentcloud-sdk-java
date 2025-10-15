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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IdleResponseInfo extends AbstractModel {

    /**
    * 重试次数（1-3）
    */
    @SerializedName("RetryCount")
    @Expose
    private Long RetryCount;

    /**
    * 响应信息
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get 重试次数（1-3） 
     * @return RetryCount 重试次数（1-3）
     */
    public Long getRetryCount() {
        return this.RetryCount;
    }

    /**
     * Set 重试次数（1-3）
     * @param RetryCount 重试次数（1-3）
     */
    public void setRetryCount(Long RetryCount) {
        this.RetryCount = RetryCount;
    }

    /**
     * Get 响应信息 
     * @return Message 响应信息
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 响应信息
     * @param Message 响应信息
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public IdleResponseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IdleResponseInfo(IdleResponseInfo source) {
        if (source.RetryCount != null) {
            this.RetryCount = new Long(source.RetryCount);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RetryCount", this.RetryCount);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

