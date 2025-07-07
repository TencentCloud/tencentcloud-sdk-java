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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteConnectionRequest extends AbstractModel {

    /**
    * 连接器ID
    */
    @SerializedName("ConnectionId")
    @Expose
    private String ConnectionId;

    /**
    * 事件集ID
    */
    @SerializedName("EventBusId")
    @Expose
    private String EventBusId;

    /**
     * Get 连接器ID 
     * @return ConnectionId 连接器ID
     */
    public String getConnectionId() {
        return this.ConnectionId;
    }

    /**
     * Set 连接器ID
     * @param ConnectionId 连接器ID
     */
    public void setConnectionId(String ConnectionId) {
        this.ConnectionId = ConnectionId;
    }

    /**
     * Get 事件集ID 
     * @return EventBusId 事件集ID
     */
    public String getEventBusId() {
        return this.EventBusId;
    }

    /**
     * Set 事件集ID
     * @param EventBusId 事件集ID
     */
    public void setEventBusId(String EventBusId) {
        this.EventBusId = EventBusId;
    }

    public DeleteConnectionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteConnectionRequest(DeleteConnectionRequest source) {
        if (source.ConnectionId != null) {
            this.ConnectionId = new String(source.ConnectionId);
        }
        if (source.EventBusId != null) {
            this.EventBusId = new String(source.EventBusId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConnectionId", this.ConnectionId);
        this.setParamSimple(map, prefix + "EventBusId", this.EventBusId);

    }
}

