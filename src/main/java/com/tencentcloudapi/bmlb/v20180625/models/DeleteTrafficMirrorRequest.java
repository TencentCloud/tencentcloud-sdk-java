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

public class DeleteTrafficMirrorRequest extends AbstractModel {

    /**
    * 流量镜像实例ID数组，可以批量删除，每次删除上限为20
    */
    @SerializedName("TrafficMirrorIds")
    @Expose
    private String [] TrafficMirrorIds;

    /**
     * Get 流量镜像实例ID数组，可以批量删除，每次删除上限为20 
     * @return TrafficMirrorIds 流量镜像实例ID数组，可以批量删除，每次删除上限为20
     */
    public String [] getTrafficMirrorIds() {
        return this.TrafficMirrorIds;
    }

    /**
     * Set 流量镜像实例ID数组，可以批量删除，每次删除上限为20
     * @param TrafficMirrorIds 流量镜像实例ID数组，可以批量删除，每次删除上限为20
     */
    public void setTrafficMirrorIds(String [] TrafficMirrorIds) {
        this.TrafficMirrorIds = TrafficMirrorIds;
    }

    public DeleteTrafficMirrorRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteTrafficMirrorRequest(DeleteTrafficMirrorRequest source) {
        if (source.TrafficMirrorIds != null) {
            this.TrafficMirrorIds = new String[source.TrafficMirrorIds.length];
            for (int i = 0; i < source.TrafficMirrorIds.length; i++) {
                this.TrafficMirrorIds[i] = new String(source.TrafficMirrorIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TrafficMirrorIds.", this.TrafficMirrorIds);

    }
}

