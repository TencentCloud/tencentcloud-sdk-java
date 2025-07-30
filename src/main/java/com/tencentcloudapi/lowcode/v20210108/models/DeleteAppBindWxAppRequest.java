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
package com.tencentcloudapi.lowcode.v20210108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteAppBindWxAppRequest extends AbstractModel {

    /**
    * 应用id
    */
    @SerializedName("WeappId")
    @Expose
    private String WeappId;

    /**
     * Get 应用id 
     * @return WeappId 应用id
     */
    public String getWeappId() {
        return this.WeappId;
    }

    /**
     * Set 应用id
     * @param WeappId 应用id
     */
    public void setWeappId(String WeappId) {
        this.WeappId = WeappId;
    }

    public DeleteAppBindWxAppRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAppBindWxAppRequest(DeleteAppBindWxAppRequest source) {
        if (source.WeappId != null) {
            this.WeappId = new String(source.WeappId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WeappId", this.WeappId);

    }
}

