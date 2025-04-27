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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteScheduledActionRequest extends AbstractModel {

    /**
    * 待删除的定时任务ID。可以通过调用接口 [DescribeScheduledActions](https://cloud.tencent.com/document/api/377/20450) ，取返回信息中的 ScheduledActionId 获取定时任务ID。
    */
    @SerializedName("ScheduledActionId")
    @Expose
    private String ScheduledActionId;

    /**
     * Get 待删除的定时任务ID。可以通过调用接口 [DescribeScheduledActions](https://cloud.tencent.com/document/api/377/20450) ，取返回信息中的 ScheduledActionId 获取定时任务ID。 
     * @return ScheduledActionId 待删除的定时任务ID。可以通过调用接口 [DescribeScheduledActions](https://cloud.tencent.com/document/api/377/20450) ，取返回信息中的 ScheduledActionId 获取定时任务ID。
     */
    public String getScheduledActionId() {
        return this.ScheduledActionId;
    }

    /**
     * Set 待删除的定时任务ID。可以通过调用接口 [DescribeScheduledActions](https://cloud.tencent.com/document/api/377/20450) ，取返回信息中的 ScheduledActionId 获取定时任务ID。
     * @param ScheduledActionId 待删除的定时任务ID。可以通过调用接口 [DescribeScheduledActions](https://cloud.tencent.com/document/api/377/20450) ，取返回信息中的 ScheduledActionId 获取定时任务ID。
     */
    public void setScheduledActionId(String ScheduledActionId) {
        this.ScheduledActionId = ScheduledActionId;
    }

    public DeleteScheduledActionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteScheduledActionRequest(DeleteScheduledActionRequest source) {
        if (source.ScheduledActionId != null) {
            this.ScheduledActionId = new String(source.ScheduledActionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScheduledActionId", this.ScheduledActionId);

    }
}

