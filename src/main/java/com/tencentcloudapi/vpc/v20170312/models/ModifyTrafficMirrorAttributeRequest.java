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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyTrafficMirrorAttributeRequest extends AbstractModel {

    /**
    * 流量镜像实例ID
    */
    @SerializedName("TrafficMirrorId")
    @Expose
    private String TrafficMirrorId;

    /**
    * 流量镜像实例名称
    */
    @SerializedName("TrafficMirrorName")
    @Expose
    private String TrafficMirrorName;

    /**
    * 流量镜像实例描述信息
    */
    @SerializedName("TrafficMirrorDescription")
    @Expose
    private String TrafficMirrorDescription;

    /**
     * Get 流量镜像实例ID 
     * @return TrafficMirrorId 流量镜像实例ID
     */
    public String getTrafficMirrorId() {
        return this.TrafficMirrorId;
    }

    /**
     * Set 流量镜像实例ID
     * @param TrafficMirrorId 流量镜像实例ID
     */
    public void setTrafficMirrorId(String TrafficMirrorId) {
        this.TrafficMirrorId = TrafficMirrorId;
    }

    /**
     * Get 流量镜像实例名称 
     * @return TrafficMirrorName 流量镜像实例名称
     */
    public String getTrafficMirrorName() {
        return this.TrafficMirrorName;
    }

    /**
     * Set 流量镜像实例名称
     * @param TrafficMirrorName 流量镜像实例名称
     */
    public void setTrafficMirrorName(String TrafficMirrorName) {
        this.TrafficMirrorName = TrafficMirrorName;
    }

    /**
     * Get 流量镜像实例描述信息 
     * @return TrafficMirrorDescription 流量镜像实例描述信息
     */
    public String getTrafficMirrorDescription() {
        return this.TrafficMirrorDescription;
    }

    /**
     * Set 流量镜像实例描述信息
     * @param TrafficMirrorDescription 流量镜像实例描述信息
     */
    public void setTrafficMirrorDescription(String TrafficMirrorDescription) {
        this.TrafficMirrorDescription = TrafficMirrorDescription;
    }

    public ModifyTrafficMirrorAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTrafficMirrorAttributeRequest(ModifyTrafficMirrorAttributeRequest source) {
        if (source.TrafficMirrorId != null) {
            this.TrafficMirrorId = new String(source.TrafficMirrorId);
        }
        if (source.TrafficMirrorName != null) {
            this.TrafficMirrorName = new String(source.TrafficMirrorName);
        }
        if (source.TrafficMirrorDescription != null) {
            this.TrafficMirrorDescription = new String(source.TrafficMirrorDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TrafficMirrorId", this.TrafficMirrorId);
        this.setParamSimple(map, prefix + "TrafficMirrorName", this.TrafficMirrorName);
        this.setParamSimple(map, prefix + "TrafficMirrorDescription", this.TrafficMirrorDescription);

    }
}

