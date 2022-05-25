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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddEditRiskSyscallWhiteListRequest extends AbstractModel{

    /**
    * 仅在添加事件白名单时候使用
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * 增加或编辑白名单信。新增白名单时WhiteListInfo.id为空，编辑白名单WhiteListInfo.id不能为空.
    */
    @SerializedName("WhiteListInfo")
    @Expose
    private RiskSyscallWhiteListInfo WhiteListInfo;

    /**
     * Get 仅在添加事件白名单时候使用 
     * @return EventId 仅在添加事件白名单时候使用
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set 仅在添加事件白名单时候使用
     * @param EventId 仅在添加事件白名单时候使用
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get 增加或编辑白名单信。新增白名单时WhiteListInfo.id为空，编辑白名单WhiteListInfo.id不能为空. 
     * @return WhiteListInfo 增加或编辑白名单信。新增白名单时WhiteListInfo.id为空，编辑白名单WhiteListInfo.id不能为空.
     */
    public RiskSyscallWhiteListInfo getWhiteListInfo() {
        return this.WhiteListInfo;
    }

    /**
     * Set 增加或编辑白名单信。新增白名单时WhiteListInfo.id为空，编辑白名单WhiteListInfo.id不能为空.
     * @param WhiteListInfo 增加或编辑白名单信。新增白名单时WhiteListInfo.id为空，编辑白名单WhiteListInfo.id不能为空.
     */
    public void setWhiteListInfo(RiskSyscallWhiteListInfo WhiteListInfo) {
        this.WhiteListInfo = WhiteListInfo;
    }

    public AddEditRiskSyscallWhiteListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddEditRiskSyscallWhiteListRequest(AddEditRiskSyscallWhiteListRequest source) {
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
        if (source.WhiteListInfo != null) {
            this.WhiteListInfo = new RiskSyscallWhiteListInfo(source.WhiteListInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamObj(map, prefix + "WhiteListInfo.", this.WhiteListInfo);

    }
}

