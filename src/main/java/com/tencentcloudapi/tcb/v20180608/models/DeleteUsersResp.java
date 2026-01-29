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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteUsersResp extends AbstractModel {

    /**
    * 成功个数
    */
    @SerializedName("SuccessCount")
    @Expose
    private Long SuccessCount;

    /**
    * 失败个数
    */
    @SerializedName("FailedCount")
    @Expose
    private Long FailedCount;

    /**
     * Get 成功个数 
     * @return SuccessCount 成功个数
     */
    public Long getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set 成功个数
     * @param SuccessCount 成功个数
     */
    public void setSuccessCount(Long SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get 失败个数 
     * @return FailedCount 失败个数
     */
    public Long getFailedCount() {
        return this.FailedCount;
    }

    /**
     * Set 失败个数
     * @param FailedCount 失败个数
     */
    public void setFailedCount(Long FailedCount) {
        this.FailedCount = FailedCount;
    }

    public DeleteUsersResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteUsersResp(DeleteUsersResp source) {
        if (source.SuccessCount != null) {
            this.SuccessCount = new Long(source.SuccessCount);
        }
        if (source.FailedCount != null) {
            this.FailedCount = new Long(source.FailedCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamSimple(map, prefix + "FailedCount", this.FailedCount);

    }
}

