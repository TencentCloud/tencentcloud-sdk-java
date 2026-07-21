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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConversationResetInfo extends AbstractModel {

    /**
    * <p>最近一次重置的毫秒级时间戳</p>
    */
    @SerializedName("ResetTime")
    @Expose
    private String ResetTime;

    /**
    * <p>最近一次重置边界；该记录及更早的记录不再作为对话上下文</p>
    */
    @SerializedName("ResetThroughRecordId")
    @Expose
    private String ResetThroughRecordId;

    /**
     * Get <p>最近一次重置的毫秒级时间戳</p> 
     * @return ResetTime <p>最近一次重置的毫秒级时间戳</p>
     */
    public String getResetTime() {
        return this.ResetTime;
    }

    /**
     * Set <p>最近一次重置的毫秒级时间戳</p>
     * @param ResetTime <p>最近一次重置的毫秒级时间戳</p>
     */
    public void setResetTime(String ResetTime) {
        this.ResetTime = ResetTime;
    }

    /**
     * Get <p>最近一次重置边界；该记录及更早的记录不再作为对话上下文</p> 
     * @return ResetThroughRecordId <p>最近一次重置边界；该记录及更早的记录不再作为对话上下文</p>
     */
    public String getResetThroughRecordId() {
        return this.ResetThroughRecordId;
    }

    /**
     * Set <p>最近一次重置边界；该记录及更早的记录不再作为对话上下文</p>
     * @param ResetThroughRecordId <p>最近一次重置边界；该记录及更早的记录不再作为对话上下文</p>
     */
    public void setResetThroughRecordId(String ResetThroughRecordId) {
        this.ResetThroughRecordId = ResetThroughRecordId;
    }

    public ConversationResetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConversationResetInfo(ConversationResetInfo source) {
        if (source.ResetTime != null) {
            this.ResetTime = new String(source.ResetTime);
        }
        if (source.ResetThroughRecordId != null) {
            this.ResetThroughRecordId = new String(source.ResetThroughRecordId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResetTime", this.ResetTime);
        this.setParamSimple(map, prefix + "ResetThroughRecordId", this.ResetThroughRecordId);

    }
}

