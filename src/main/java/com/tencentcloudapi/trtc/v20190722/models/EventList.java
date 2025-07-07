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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventList extends AbstractModel {

    /**
    * 数据内容
    */
    @SerializedName("Content")
    @Expose
    private EventMessage [] Content;

    /**
    * 发送端的userId
    */
    @SerializedName("PeerId")
    @Expose
    private String PeerId;

    /**
     * Get 数据内容 
     * @return Content 数据内容
     */
    public EventMessage [] getContent() {
        return this.Content;
    }

    /**
     * Set 数据内容
     * @param Content 数据内容
     */
    public void setContent(EventMessage [] Content) {
        this.Content = Content;
    }

    /**
     * Get 发送端的userId 
     * @return PeerId 发送端的userId
     */
    public String getPeerId() {
        return this.PeerId;
    }

    /**
     * Set 发送端的userId
     * @param PeerId 发送端的userId
     */
    public void setPeerId(String PeerId) {
        this.PeerId = PeerId;
    }

    public EventList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventList(EventList source) {
        if (source.Content != null) {
            this.Content = new EventMessage[source.Content.length];
            for (int i = 0; i < source.Content.length; i++) {
                this.Content[i] = new EventMessage(source.Content[i]);
            }
        }
        if (source.PeerId != null) {
            this.PeerId = new String(source.PeerId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Content.", this.Content);
        this.setParamSimple(map, prefix + "PeerId", this.PeerId);

    }
}

