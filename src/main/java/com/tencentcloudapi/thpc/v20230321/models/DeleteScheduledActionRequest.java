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
package com.tencentcloudapi.thpc.v20230321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteScheduledActionRequest extends AbstractModel {

    /**
    * <p>定时伸缩任务 ID 列表，最多 20 个。</p>
    */
    @SerializedName("ScheduledActionIds")
    @Expose
    private String [] ScheduledActionIds;

    /**
     * Get <p>定时伸缩任务 ID 列表，最多 20 个。</p> 
     * @return ScheduledActionIds <p>定时伸缩任务 ID 列表，最多 20 个。</p>
     */
    public String [] getScheduledActionIds() {
        return this.ScheduledActionIds;
    }

    /**
     * Set <p>定时伸缩任务 ID 列表，最多 20 个。</p>
     * @param ScheduledActionIds <p>定时伸缩任务 ID 列表，最多 20 个。</p>
     */
    public void setScheduledActionIds(String [] ScheduledActionIds) {
        this.ScheduledActionIds = ScheduledActionIds;
    }

    public DeleteScheduledActionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteScheduledActionRequest(DeleteScheduledActionRequest source) {
        if (source.ScheduledActionIds != null) {
            this.ScheduledActionIds = new String[source.ScheduledActionIds.length];
            for (int i = 0; i < source.ScheduledActionIds.length; i++) {
                this.ScheduledActionIds[i] = new String(source.ScheduledActionIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ScheduledActionIds.", this.ScheduledActionIds);

    }
}

