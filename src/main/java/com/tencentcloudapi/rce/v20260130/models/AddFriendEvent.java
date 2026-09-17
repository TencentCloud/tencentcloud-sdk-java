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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddFriendEvent extends AbstractModel {

    /**
    * <p>所属服务器ID，允许空串</p>
    */
    @SerializedName("ServerId")
    @Expose
    private String ServerId;

    /**
    * <p>发送者信息</p>
    */
    @SerializedName("Sender")
    @Expose
    private Sender Sender;

    /**
    * <p>接收者信息</p>
    */
    @SerializedName("Receiver")
    @Expose
    private Receiver Receiver;

    /**
     * Get <p>所属服务器ID，允许空串</p> 
     * @return ServerId <p>所属服务器ID，允许空串</p>
     */
    public String getServerId() {
        return this.ServerId;
    }

    /**
     * Set <p>所属服务器ID，允许空串</p>
     * @param ServerId <p>所属服务器ID，允许空串</p>
     */
    public void setServerId(String ServerId) {
        this.ServerId = ServerId;
    }

    /**
     * Get <p>发送者信息</p> 
     * @return Sender <p>发送者信息</p>
     */
    public Sender getSender() {
        return this.Sender;
    }

    /**
     * Set <p>发送者信息</p>
     * @param Sender <p>发送者信息</p>
     */
    public void setSender(Sender Sender) {
        this.Sender = Sender;
    }

    /**
     * Get <p>接收者信息</p> 
     * @return Receiver <p>接收者信息</p>
     */
    public Receiver getReceiver() {
        return this.Receiver;
    }

    /**
     * Set <p>接收者信息</p>
     * @param Receiver <p>接收者信息</p>
     */
    public void setReceiver(Receiver Receiver) {
        this.Receiver = Receiver;
    }

    public AddFriendEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddFriendEvent(AddFriendEvent source) {
        if (source.ServerId != null) {
            this.ServerId = new String(source.ServerId);
        }
        if (source.Sender != null) {
            this.Sender = new Sender(source.Sender);
        }
        if (source.Receiver != null) {
            this.Receiver = new Receiver(source.Receiver);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServerId", this.ServerId);
        this.setParamObj(map, prefix + "Sender.", this.Sender);
        this.setParamObj(map, prefix + "Receiver.", this.Receiver);

    }
}

