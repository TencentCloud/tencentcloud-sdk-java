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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetThreadRequest extends AbstractModel {

    /**
    * 会话 ID
    */
    @SerializedName("ThreadID")
    @Expose
    private String ThreadID;

    /**
     * Get 会话 ID 
     * @return ThreadID 会话 ID
     */
    public String getThreadID() {
        return this.ThreadID;
    }

    /**
     * Set 会话 ID
     * @param ThreadID 会话 ID
     */
    public void setThreadID(String ThreadID) {
        this.ThreadID = ThreadID;
    }

    public GetThreadRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetThreadRequest(GetThreadRequest source) {
        if (source.ThreadID != null) {
            this.ThreadID = new String(source.ThreadID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ThreadID", this.ThreadID);

    }
}

