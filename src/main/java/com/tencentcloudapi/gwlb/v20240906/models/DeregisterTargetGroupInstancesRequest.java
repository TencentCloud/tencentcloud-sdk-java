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
package com.tencentcloudapi.gwlb.v20240906.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeregisterTargetGroupInstancesRequest extends AbstractModel {

    /**
    * 目标组ID。
    */
    @SerializedName("TargetGroupId")
    @Expose
    private String TargetGroupId;

    /**
    * 待解绑的服务器信息。
    */
    @SerializedName("TargetGroupInstances")
    @Expose
    private TargetGroupInstance [] TargetGroupInstances;

    /**
     * Get 目标组ID。 
     * @return TargetGroupId 目标组ID。
     */
    public String getTargetGroupId() {
        return this.TargetGroupId;
    }

    /**
     * Set 目标组ID。
     * @param TargetGroupId 目标组ID。
     */
    public void setTargetGroupId(String TargetGroupId) {
        this.TargetGroupId = TargetGroupId;
    }

    /**
     * Get 待解绑的服务器信息。 
     * @return TargetGroupInstances 待解绑的服务器信息。
     */
    public TargetGroupInstance [] getTargetGroupInstances() {
        return this.TargetGroupInstances;
    }

    /**
     * Set 待解绑的服务器信息。
     * @param TargetGroupInstances 待解绑的服务器信息。
     */
    public void setTargetGroupInstances(TargetGroupInstance [] TargetGroupInstances) {
        this.TargetGroupInstances = TargetGroupInstances;
    }

    public DeregisterTargetGroupInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeregisterTargetGroupInstancesRequest(DeregisterTargetGroupInstancesRequest source) {
        if (source.TargetGroupId != null) {
            this.TargetGroupId = new String(source.TargetGroupId);
        }
        if (source.TargetGroupInstances != null) {
            this.TargetGroupInstances = new TargetGroupInstance[source.TargetGroupInstances.length];
            for (int i = 0; i < source.TargetGroupInstances.length; i++) {
                this.TargetGroupInstances[i] = new TargetGroupInstance(source.TargetGroupInstances[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetGroupId", this.TargetGroupId);
        this.setParamArrayObj(map, prefix + "TargetGroupInstances.", this.TargetGroupInstances);

    }
}

