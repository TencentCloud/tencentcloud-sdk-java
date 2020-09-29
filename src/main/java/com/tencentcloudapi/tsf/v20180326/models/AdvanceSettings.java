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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdvanceSettings extends AbstractModel{

    /**
    * 子任务单机并发数限制，默认值为2
    */
    @SerializedName("SubTaskConcurrency")
    @Expose
    private Long SubTaskConcurrency;

    /**
     * Get 子任务单机并发数限制，默认值为2 
     * @return SubTaskConcurrency 子任务单机并发数限制，默认值为2
     */
    public Long getSubTaskConcurrency() {
        return this.SubTaskConcurrency;
    }

    /**
     * Set 子任务单机并发数限制，默认值为2
     * @param SubTaskConcurrency 子任务单机并发数限制，默认值为2
     */
    public void setSubTaskConcurrency(Long SubTaskConcurrency) {
        this.SubTaskConcurrency = SubTaskConcurrency;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubTaskConcurrency", this.SubTaskConcurrency);

    }
}

