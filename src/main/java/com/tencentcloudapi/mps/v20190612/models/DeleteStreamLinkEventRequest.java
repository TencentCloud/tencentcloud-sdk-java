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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteStreamLinkEventRequest extends AbstractModel{

    /**
    * 媒体传输事件Id，删除前需要保证该Event关联的所有Flow都已经删除。
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
     * Get 媒体传输事件Id，删除前需要保证该Event关联的所有Flow都已经删除。 
     * @return EventId 媒体传输事件Id，删除前需要保证该Event关联的所有Flow都已经删除。
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set 媒体传输事件Id，删除前需要保证该Event关联的所有Flow都已经删除。
     * @param EventId 媒体传输事件Id，删除前需要保证该Event关联的所有Flow都已经删除。
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    public DeleteStreamLinkEventRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteStreamLinkEventRequest(DeleteStreamLinkEventRequest source) {
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventId", this.EventId);

    }
}

