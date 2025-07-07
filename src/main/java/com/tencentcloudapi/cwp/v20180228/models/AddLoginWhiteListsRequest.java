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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddLoginWhiteListsRequest extends AbstractModel {

    /**
    * 异地登录白名单实体
    */
    @SerializedName("HostLoginWhiteObj")
    @Expose
    private HostLoginWhiteObj HostLoginWhiteObj;

    /**
    * 事件同步处理方式：
  "" -- 不操作
  "All" -- 将符合此配置的所有事件记录加白
  "Id" -- 将EventId对应的事件记录加白
    */
    @SerializedName("ProcessType")
    @Expose
    private String ProcessType;

    /**
    * 异地登录事件ID，当ProcessType为Id时此项必填
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
     * Get 异地登录白名单实体 
     * @return HostLoginWhiteObj 异地登录白名单实体
     */
    public HostLoginWhiteObj getHostLoginWhiteObj() {
        return this.HostLoginWhiteObj;
    }

    /**
     * Set 异地登录白名单实体
     * @param HostLoginWhiteObj 异地登录白名单实体
     */
    public void setHostLoginWhiteObj(HostLoginWhiteObj HostLoginWhiteObj) {
        this.HostLoginWhiteObj = HostLoginWhiteObj;
    }

    /**
     * Get 事件同步处理方式：
  "" -- 不操作
  "All" -- 将符合此配置的所有事件记录加白
  "Id" -- 将EventId对应的事件记录加白 
     * @return ProcessType 事件同步处理方式：
  "" -- 不操作
  "All" -- 将符合此配置的所有事件记录加白
  "Id" -- 将EventId对应的事件记录加白
     */
    public String getProcessType() {
        return this.ProcessType;
    }

    /**
     * Set 事件同步处理方式：
  "" -- 不操作
  "All" -- 将符合此配置的所有事件记录加白
  "Id" -- 将EventId对应的事件记录加白
     * @param ProcessType 事件同步处理方式：
  "" -- 不操作
  "All" -- 将符合此配置的所有事件记录加白
  "Id" -- 将EventId对应的事件记录加白
     */
    public void setProcessType(String ProcessType) {
        this.ProcessType = ProcessType;
    }

    /**
     * Get 异地登录事件ID，当ProcessType为Id时此项必填 
     * @return EventId 异地登录事件ID，当ProcessType为Id时此项必填
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set 异地登录事件ID，当ProcessType为Id时此项必填
     * @param EventId 异地登录事件ID，当ProcessType为Id时此项必填
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    public AddLoginWhiteListsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddLoginWhiteListsRequest(AddLoginWhiteListsRequest source) {
        if (source.HostLoginWhiteObj != null) {
            this.HostLoginWhiteObj = new HostLoginWhiteObj(source.HostLoginWhiteObj);
        }
        if (source.ProcessType != null) {
            this.ProcessType = new String(source.ProcessType);
        }
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "HostLoginWhiteObj.", this.HostLoginWhiteObj);
        this.setParamSimple(map, prefix + "ProcessType", this.ProcessType);
        this.setParamSimple(map, prefix + "EventId", this.EventId);

    }
}

