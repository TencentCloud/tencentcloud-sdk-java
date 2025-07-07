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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RetryConfig extends AbstractModel {

    /**
    * 重试次数
    */
    @SerializedName("RetryNum")
    @Expose
    private Long RetryNum;

    /**
     * Get 重试次数 
     * @return RetryNum 重试次数
     */
    public Long getRetryNum() {
        return this.RetryNum;
    }

    /**
     * Set 重试次数
     * @param RetryNum 重试次数
     */
    public void setRetryNum(Long RetryNum) {
        this.RetryNum = RetryNum;
    }

    public RetryConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RetryConfig(RetryConfig source) {
        if (source.RetryNum != null) {
            this.RetryNum = new Long(source.RetryNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RetryNum", this.RetryNum);

    }
}

