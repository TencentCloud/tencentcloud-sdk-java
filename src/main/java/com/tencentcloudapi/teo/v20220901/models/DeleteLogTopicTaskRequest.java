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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteLogTopicTaskRequest extends AbstractModel{

    /**
    * 待删除的推送任务ID。
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 推送任务所属日志集地域，此字段仅用于CLS推送任务。
    */
    @SerializedName("LogSetRegion")
    @Expose
    private String LogSetRegion;

    /**
     * Get 待删除的推送任务ID。 
     * @return TopicId 待删除的推送任务ID。
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 待删除的推送任务ID。
     * @param TopicId 待删除的推送任务ID。
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 推送任务所属日志集地域，此字段仅用于CLS推送任务。 
     * @return LogSetRegion 推送任务所属日志集地域，此字段仅用于CLS推送任务。
     */
    public String getLogSetRegion() {
        return this.LogSetRegion;
    }

    /**
     * Set 推送任务所属日志集地域，此字段仅用于CLS推送任务。
     * @param LogSetRegion 推送任务所属日志集地域，此字段仅用于CLS推送任务。
     */
    public void setLogSetRegion(String LogSetRegion) {
        this.LogSetRegion = LogSetRegion;
    }

    public DeleteLogTopicTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteLogTopicTaskRequest(DeleteLogTopicTaskRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.LogSetRegion != null) {
            this.LogSetRegion = new String(source.LogSetRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "LogSetRegion", this.LogSetRegion);

    }
}

