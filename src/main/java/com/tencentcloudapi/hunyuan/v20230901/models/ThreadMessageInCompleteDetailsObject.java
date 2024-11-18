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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ThreadMessageInCompleteDetailsObject extends AbstractModel {

    /**
    * 会话消息未完成原因
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get 会话消息未完成原因 
     * @return Reason 会话消息未完成原因
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 会话消息未完成原因
     * @param Reason 会话消息未完成原因
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public ThreadMessageInCompleteDetailsObject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ThreadMessageInCompleteDetailsObject(ThreadMessageInCompleteDetailsObject source) {
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

