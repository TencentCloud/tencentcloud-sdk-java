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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpsAsyncResponse extends AbstractModel {

    /**
    * 异步执行记录Id
    */
    @SerializedName("AsyncId")
    @Expose
    private String AsyncId;

    /**
     * Get 异步执行记录Id 
     * @return AsyncId 异步执行记录Id
     */
    public String getAsyncId() {
        return this.AsyncId;
    }

    /**
     * Set 异步执行记录Id
     * @param AsyncId 异步执行记录Id
     */
    public void setAsyncId(String AsyncId) {
        this.AsyncId = AsyncId;
    }

    public OpsAsyncResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpsAsyncResponse(OpsAsyncResponse source) {
        if (source.AsyncId != null) {
            this.AsyncId = new String(source.AsyncId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AsyncId", this.AsyncId);

    }
}

