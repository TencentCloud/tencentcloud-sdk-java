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
package com.tencentcloudapi.dataintegration.v20220613.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendMessageRequest extends AbstractModel{

    /**
    * 接入资源ID
    */
    @SerializedName("DataHubId")
    @Expose
    private String DataHubId;

    /**
    * 批量消息
    */
    @SerializedName("Message")
    @Expose
    private BatchContent [] Message;

    /**
     * Get 接入资源ID 
     * @return DataHubId 接入资源ID
     */
    public String getDataHubId() {
        return this.DataHubId;
    }

    /**
     * Set 接入资源ID
     * @param DataHubId 接入资源ID
     */
    public void setDataHubId(String DataHubId) {
        this.DataHubId = DataHubId;
    }

    /**
     * Get 批量消息 
     * @return Message 批量消息
     */
    public BatchContent [] getMessage() {
        return this.Message;
    }

    /**
     * Set 批量消息
     * @param Message 批量消息
     */
    public void setMessage(BatchContent [] Message) {
        this.Message = Message;
    }

    public SendMessageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendMessageRequest(SendMessageRequest source) {
        if (source.DataHubId != null) {
            this.DataHubId = new String(source.DataHubId);
        }
        if (source.Message != null) {
            this.Message = new BatchContent[source.Message.length];
            for (int i = 0; i < source.Message.length; i++) {
                this.Message[i] = new BatchContent(source.Message[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataHubId", this.DataHubId);
        this.setParamArrayObj(map, prefix + "Message.", this.Message);

    }
}

