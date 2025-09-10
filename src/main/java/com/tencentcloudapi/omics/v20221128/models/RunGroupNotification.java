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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunGroupNotification extends AbstractModel {

    /**
    * 结果通知。
    */
    @SerializedName("ResultNotification")
    @Expose
    private RunGroupResultNotification ResultNotification;

    /**
    * 超时通知。
    */
    @SerializedName("TimeoutNotification")
    @Expose
    private RunGroupTimeoutNotification TimeoutNotification;

    /**
     * Get 结果通知。 
     * @return ResultNotification 结果通知。
     */
    public RunGroupResultNotification getResultNotification() {
        return this.ResultNotification;
    }

    /**
     * Set 结果通知。
     * @param ResultNotification 结果通知。
     */
    public void setResultNotification(RunGroupResultNotification ResultNotification) {
        this.ResultNotification = ResultNotification;
    }

    /**
     * Get 超时通知。 
     * @return TimeoutNotification 超时通知。
     */
    public RunGroupTimeoutNotification getTimeoutNotification() {
        return this.TimeoutNotification;
    }

    /**
     * Set 超时通知。
     * @param TimeoutNotification 超时通知。
     */
    public void setTimeoutNotification(RunGroupTimeoutNotification TimeoutNotification) {
        this.TimeoutNotification = TimeoutNotification;
    }

    public RunGroupNotification() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunGroupNotification(RunGroupNotification source) {
        if (source.ResultNotification != null) {
            this.ResultNotification = new RunGroupResultNotification(source.ResultNotification);
        }
        if (source.TimeoutNotification != null) {
            this.TimeoutNotification = new RunGroupTimeoutNotification(source.TimeoutNotification);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ResultNotification.", this.ResultNotification);
        this.setParamObj(map, prefix + "TimeoutNotification.", this.TimeoutNotification);

    }
}

