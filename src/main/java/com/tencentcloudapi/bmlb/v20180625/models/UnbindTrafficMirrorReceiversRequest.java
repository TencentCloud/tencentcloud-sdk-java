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
package com.tencentcloudapi.bmlb.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UnbindTrafficMirrorReceiversRequest extends AbstractModel {

    /**
    * 流量镜像实例ID。
    */
    @SerializedName("TrafficMirrorId")
    @Expose
    private String TrafficMirrorId;

    /**
    * 待绑定的主机实例ID和端口数组。
    */
    @SerializedName("ReceiverSet")
    @Expose
    private UnbindTrafficMirrorReceiver [] ReceiverSet;

    /**
     * Get 流量镜像实例ID。 
     * @return TrafficMirrorId 流量镜像实例ID。
     */
    public String getTrafficMirrorId() {
        return this.TrafficMirrorId;
    }

    /**
     * Set 流量镜像实例ID。
     * @param TrafficMirrorId 流量镜像实例ID。
     */
    public void setTrafficMirrorId(String TrafficMirrorId) {
        this.TrafficMirrorId = TrafficMirrorId;
    }

    /**
     * Get 待绑定的主机实例ID和端口数组。 
     * @return ReceiverSet 待绑定的主机实例ID和端口数组。
     */
    public UnbindTrafficMirrorReceiver [] getReceiverSet() {
        return this.ReceiverSet;
    }

    /**
     * Set 待绑定的主机实例ID和端口数组。
     * @param ReceiverSet 待绑定的主机实例ID和端口数组。
     */
    public void setReceiverSet(UnbindTrafficMirrorReceiver [] ReceiverSet) {
        this.ReceiverSet = ReceiverSet;
    }

    public UnbindTrafficMirrorReceiversRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnbindTrafficMirrorReceiversRequest(UnbindTrafficMirrorReceiversRequest source) {
        if (source.TrafficMirrorId != null) {
            this.TrafficMirrorId = new String(source.TrafficMirrorId);
        }
        if (source.ReceiverSet != null) {
            this.ReceiverSet = new UnbindTrafficMirrorReceiver[source.ReceiverSet.length];
            for (int i = 0; i < source.ReceiverSet.length; i++) {
                this.ReceiverSet[i] = new UnbindTrafficMirrorReceiver(source.ReceiverSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TrafficMirrorId", this.TrafficMirrorId);
        this.setParamArrayObj(map, prefix + "ReceiverSet.", this.ReceiverSet);

    }
}

