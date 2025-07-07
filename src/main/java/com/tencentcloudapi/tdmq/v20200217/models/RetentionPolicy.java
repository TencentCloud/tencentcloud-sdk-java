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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RetentionPolicy extends AbstractModel {

    /**
    * 消息保留时长
    */
    @SerializedName("TimeInMinutes")
    @Expose
    private Long TimeInMinutes;

    /**
    * 消息保留大小
    */
    @SerializedName("SizeInMB")
    @Expose
    private Long SizeInMB;

    /**
     * Get 消息保留时长 
     * @return TimeInMinutes 消息保留时长
     */
    public Long getTimeInMinutes() {
        return this.TimeInMinutes;
    }

    /**
     * Set 消息保留时长
     * @param TimeInMinutes 消息保留时长
     */
    public void setTimeInMinutes(Long TimeInMinutes) {
        this.TimeInMinutes = TimeInMinutes;
    }

    /**
     * Get 消息保留大小 
     * @return SizeInMB 消息保留大小
     */
    public Long getSizeInMB() {
        return this.SizeInMB;
    }

    /**
     * Set 消息保留大小
     * @param SizeInMB 消息保留大小
     */
    public void setSizeInMB(Long SizeInMB) {
        this.SizeInMB = SizeInMB;
    }

    public RetentionPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RetentionPolicy(RetentionPolicy source) {
        if (source.TimeInMinutes != null) {
            this.TimeInMinutes = new Long(source.TimeInMinutes);
        }
        if (source.SizeInMB != null) {
            this.SizeInMB = new Long(source.SizeInMB);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeInMinutes", this.TimeInMinutes);
        this.setParamSimple(map, prefix + "SizeInMB", this.SizeInMB);

    }
}

