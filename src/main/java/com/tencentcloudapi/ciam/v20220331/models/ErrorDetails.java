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
package com.tencentcloudapi.ciam.v20220331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ErrorDetails extends AbstractModel {

    /**
    * 用户信息
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 失败原因
    */
    @SerializedName("Error")
    @Expose
    private String Error;

    /**
     * Get 用户信息 
     * @return UserId 用户信息
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户信息
     * @param UserId 用户信息
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 失败原因 
     * @return Error 失败原因
     */
    public String getError() {
        return this.Error;
    }

    /**
     * Set 失败原因
     * @param Error 失败原因
     */
    public void setError(String Error) {
        this.Error = Error;
    }

    public ErrorDetails() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ErrorDetails(ErrorDetails source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Error != null) {
            this.Error = new String(source.Error);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Error", this.Error);

    }
}

