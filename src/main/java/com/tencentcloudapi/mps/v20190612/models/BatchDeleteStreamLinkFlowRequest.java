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

public class BatchDeleteStreamLinkFlowRequest extends AbstractModel{

    /**
    * EventId。
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * Event关联的流Id数组，如果不传默认删除Event下面的所有媒体传输流。
    */
    @SerializedName("FlowIds")
    @Expose
    private String [] FlowIds;

    /**
     * Get EventId。 
     * @return EventId EventId。
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set EventId。
     * @param EventId EventId。
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get Event关联的流Id数组，如果不传默认删除Event下面的所有媒体传输流。 
     * @return FlowIds Event关联的流Id数组，如果不传默认删除Event下面的所有媒体传输流。
     */
    public String [] getFlowIds() {
        return this.FlowIds;
    }

    /**
     * Set Event关联的流Id数组，如果不传默认删除Event下面的所有媒体传输流。
     * @param FlowIds Event关联的流Id数组，如果不传默认删除Event下面的所有媒体传输流。
     */
    public void setFlowIds(String [] FlowIds) {
        this.FlowIds = FlowIds;
    }

    public BatchDeleteStreamLinkFlowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchDeleteStreamLinkFlowRequest(BatchDeleteStreamLinkFlowRequest source) {
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
        if (source.FlowIds != null) {
            this.FlowIds = new String[source.FlowIds.length];
            for (int i = 0; i < source.FlowIds.length; i++) {
                this.FlowIds[i] = new String(source.FlowIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamArraySimple(map, prefix + "FlowIds.", this.FlowIds);

    }
}

