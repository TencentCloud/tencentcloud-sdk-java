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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NotRepeatStrategy extends AbstractModel {

    /**
    * 该次任务执行的具体完整时间，格式为"2020-07-13 00:00:00"
    */
    @SerializedName("ExecuteAt")
    @Expose
    private String ExecuteAt;

    /**
     * Get 该次任务执行的具体完整时间，格式为"2020-07-13 00:00:00" 
     * @return ExecuteAt 该次任务执行的具体完整时间，格式为"2020-07-13 00:00:00"
     */
    public String getExecuteAt() {
        return this.ExecuteAt;
    }

    /**
     * Set 该次任务执行的具体完整时间，格式为"2020-07-13 00:00:00"
     * @param ExecuteAt 该次任务执行的具体完整时间，格式为"2020-07-13 00:00:00"
     */
    public void setExecuteAt(String ExecuteAt) {
        this.ExecuteAt = ExecuteAt;
    }

    public NotRepeatStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NotRepeatStrategy(NotRepeatStrategy source) {
        if (source.ExecuteAt != null) {
            this.ExecuteAt = new String(source.ExecuteAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExecuteAt", this.ExecuteAt);

    }
}

