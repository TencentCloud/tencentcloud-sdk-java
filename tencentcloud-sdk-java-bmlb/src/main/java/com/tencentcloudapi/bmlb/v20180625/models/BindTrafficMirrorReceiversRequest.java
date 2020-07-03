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
package com.tencentcloudapi.bmlb.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindTrafficMirrorReceiversRequest extends AbstractModel{

    /**
    * 流量镜像实例ID。
    */
    @SerializedName("TrafficMirrorId")
    @Expose
    private String TrafficMirrorId;

    /**
    * 待绑定的黑石物理机信息数组。
    */
    @SerializedName("ReceiverSet")
    @Expose
    private BindTrafficMirrorReceiver [] ReceiverSet;

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
     * Get 待绑定的黑石物理机信息数组。 
     * @return ReceiverSet 待绑定的黑石物理机信息数组。
     */
    public BindTrafficMirrorReceiver [] getReceiverSet() {
        return this.ReceiverSet;
    }

    /**
     * Set 待绑定的黑石物理机信息数组。
     * @param ReceiverSet 待绑定的黑石物理机信息数组。
     */
    public void setReceiverSet(BindTrafficMirrorReceiver [] ReceiverSet) {
        this.ReceiverSet = ReceiverSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TrafficMirrorId", this.TrafficMirrorId);
        this.setParamArrayObj(map, prefix + "ReceiverSet.", this.ReceiverSet);

    }
}

