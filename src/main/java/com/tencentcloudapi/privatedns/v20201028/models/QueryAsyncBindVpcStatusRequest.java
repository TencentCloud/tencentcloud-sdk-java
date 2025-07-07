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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryAsyncBindVpcStatusRequest extends AbstractModel {

    /**
    * 唯一ID
    */
    @SerializedName("UniqId")
    @Expose
    private String UniqId;

    /**
     * Get 唯一ID 
     * @return UniqId 唯一ID
     */
    public String getUniqId() {
        return this.UniqId;
    }

    /**
     * Set 唯一ID
     * @param UniqId 唯一ID
     */
    public void setUniqId(String UniqId) {
        this.UniqId = UniqId;
    }

    public QueryAsyncBindVpcStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryAsyncBindVpcStatusRequest(QueryAsyncBindVpcStatusRequest source) {
        if (source.UniqId != null) {
            this.UniqId = new String(source.UniqId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UniqId", this.UniqId);

    }
}

