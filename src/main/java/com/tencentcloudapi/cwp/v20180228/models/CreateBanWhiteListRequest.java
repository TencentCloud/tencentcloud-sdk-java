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

public class CreateBanWhiteListRequest extends AbstractModel {

    /**
    * 阻断规则
    */
    @SerializedName("Rules")
    @Expose
    private BanWhiteList Rules;

    /**
    * 事件ID，事件列表加白名单时传递，白名单添加成功后，会将事件变成已加白状态
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
     * Get 阻断规则 
     * @return Rules 阻断规则
     */
    public BanWhiteList getRules() {
        return this.Rules;
    }

    /**
     * Set 阻断规则
     * @param Rules 阻断规则
     */
    public void setRules(BanWhiteList Rules) {
        this.Rules = Rules;
    }

    /**
     * Get 事件ID，事件列表加白名单时传递，白名单添加成功后，会将事件变成已加白状态 
     * @return EventId 事件ID，事件列表加白名单时传递，白名单添加成功后，会将事件变成已加白状态
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set 事件ID，事件列表加白名单时传递，白名单添加成功后，会将事件变成已加白状态
     * @param EventId 事件ID，事件列表加白名单时传递，白名单添加成功后，会将事件变成已加白状态
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    public CreateBanWhiteListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBanWhiteListRequest(CreateBanWhiteListRequest source) {
        if (source.Rules != null) {
            this.Rules = new BanWhiteList(source.Rules);
        }
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "EventId", this.EventId);

    }
}

