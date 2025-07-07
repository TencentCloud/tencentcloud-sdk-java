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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrafficMirrorTargetResourceInfo extends AbstractModel {

    /**
    * 接收目标的资源Id
    */
    @SerializedName("TargetId")
    @Expose
    private String TargetId;

    /**
    * 接收目标的资源名称
    */
    @SerializedName("TargetName")
    @Expose
    private String TargetName;

    /**
     * Get 接收目标的资源Id 
     * @return TargetId 接收目标的资源Id
     */
    public String getTargetId() {
        return this.TargetId;
    }

    /**
     * Set 接收目标的资源Id
     * @param TargetId 接收目标的资源Id
     */
    public void setTargetId(String TargetId) {
        this.TargetId = TargetId;
    }

    /**
     * Get 接收目标的资源名称 
     * @return TargetName 接收目标的资源名称
     */
    public String getTargetName() {
        return this.TargetName;
    }

    /**
     * Set 接收目标的资源名称
     * @param TargetName 接收目标的资源名称
     */
    public void setTargetName(String TargetName) {
        this.TargetName = TargetName;
    }

    public TrafficMirrorTargetResourceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrafficMirrorTargetResourceInfo(TrafficMirrorTargetResourceInfo source) {
        if (source.TargetId != null) {
            this.TargetId = new String(source.TargetId);
        }
        if (source.TargetName != null) {
            this.TargetName = new String(source.TargetName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetId", this.TargetId);
        this.setParamSimple(map, prefix + "TargetName", this.TargetName);

    }
}

