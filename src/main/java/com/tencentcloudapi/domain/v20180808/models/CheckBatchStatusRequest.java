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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckBatchStatusRequest extends AbstractModel{

    /**
    * 批量任务id数组，最多 200 个
    */
    @SerializedName("LogIds")
    @Expose
    private Long [] LogIds;

    /**
     * Get 批量任务id数组，最多 200 个 
     * @return LogIds 批量任务id数组，最多 200 个
     */
    public Long [] getLogIds() {
        return this.LogIds;
    }

    /**
     * Set 批量任务id数组，最多 200 个
     * @param LogIds 批量任务id数组，最多 200 个
     */
    public void setLogIds(Long [] LogIds) {
        this.LogIds = LogIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "LogIds.", this.LogIds);

    }
}

