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

public class UnbindTrafficMirrorListenersRequest extends AbstractModel {

    /**
    * 流量镜像实例ID。
    */
    @SerializedName("TrafficMirrorId")
    @Expose
    private String TrafficMirrorId;

    /**
    * 七层监听器实例ID数组，可通过接口DescribeL7Listeners查询。
    */
    @SerializedName("ListenerIds")
    @Expose
    private String [] ListenerIds;

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
     * Get 七层监听器实例ID数组，可通过接口DescribeL7Listeners查询。 
     * @return ListenerIds 七层监听器实例ID数组，可通过接口DescribeL7Listeners查询。
     */
    public String [] getListenerIds() {
        return this.ListenerIds;
    }

    /**
     * Set 七层监听器实例ID数组，可通过接口DescribeL7Listeners查询。
     * @param ListenerIds 七层监听器实例ID数组，可通过接口DescribeL7Listeners查询。
     */
    public void setListenerIds(String [] ListenerIds) {
        this.ListenerIds = ListenerIds;
    }

    public UnbindTrafficMirrorListenersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnbindTrafficMirrorListenersRequest(UnbindTrafficMirrorListenersRequest source) {
        if (source.TrafficMirrorId != null) {
            this.TrafficMirrorId = new String(source.TrafficMirrorId);
        }
        if (source.ListenerIds != null) {
            this.ListenerIds = new String[source.ListenerIds.length];
            for (int i = 0; i < source.ListenerIds.length; i++) {
                this.ListenerIds[i] = new String(source.ListenerIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TrafficMirrorId", this.TrafficMirrorId);
        this.setParamArraySimple(map, prefix + "ListenerIds.", this.ListenerIds);

    }
}

