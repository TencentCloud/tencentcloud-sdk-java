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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyMessageForwardRequest extends AbstractModel {

    /**
    * 配置ID
    */
    @SerializedName("IntId")
    @Expose
    private Long IntId;

    /**
    * json数组， 转发类型 1: 告警 2:GPS
    */
    @SerializedName("MessageType")
    @Expose
    private String MessageType;

    /**
     * Get 配置ID 
     * @return IntId 配置ID
     */
    public Long getIntId() {
        return this.IntId;
    }

    /**
     * Set 配置ID
     * @param IntId 配置ID
     */
    public void setIntId(Long IntId) {
        this.IntId = IntId;
    }

    /**
     * Get json数组， 转发类型 1: 告警 2:GPS 
     * @return MessageType json数组， 转发类型 1: 告警 2:GPS
     */
    public String getMessageType() {
        return this.MessageType;
    }

    /**
     * Set json数组， 转发类型 1: 告警 2:GPS
     * @param MessageType json数组， 转发类型 1: 告警 2:GPS
     */
    public void setMessageType(String MessageType) {
        this.MessageType = MessageType;
    }

    public ModifyMessageForwardRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMessageForwardRequest(ModifyMessageForwardRequest source) {
        if (source.IntId != null) {
            this.IntId = new Long(source.IntId);
        }
        if (source.MessageType != null) {
            this.MessageType = new String(source.MessageType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IntId", this.IntId);
        this.setParamSimple(map, prefix + "MessageType", this.MessageType);

    }
}

