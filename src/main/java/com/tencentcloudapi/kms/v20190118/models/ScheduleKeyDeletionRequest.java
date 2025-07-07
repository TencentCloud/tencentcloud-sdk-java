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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScheduleKeyDeletionRequest extends AbstractModel {

    /**
    * CMK的唯一标志
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 计划删除时间区间[7,30]
    */
    @SerializedName("PendingWindowInDays")
    @Expose
    private Long PendingWindowInDays;

    /**
     * Get CMK的唯一标志 
     * @return KeyId CMK的唯一标志
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set CMK的唯一标志
     * @param KeyId CMK的唯一标志
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get 计划删除时间区间[7,30] 
     * @return PendingWindowInDays 计划删除时间区间[7,30]
     */
    public Long getPendingWindowInDays() {
        return this.PendingWindowInDays;
    }

    /**
     * Set 计划删除时间区间[7,30]
     * @param PendingWindowInDays 计划删除时间区间[7,30]
     */
    public void setPendingWindowInDays(Long PendingWindowInDays) {
        this.PendingWindowInDays = PendingWindowInDays;
    }

    public ScheduleKeyDeletionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScheduleKeyDeletionRequest(ScheduleKeyDeletionRequest source) {
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.PendingWindowInDays != null) {
            this.PendingWindowInDays = new Long(source.PendingWindowInDays);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "PendingWindowInDays", this.PendingWindowInDays);

    }
}

