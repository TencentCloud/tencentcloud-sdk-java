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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StopMachinesRequest extends AbstractModel {

    /**
    * 集群 ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 节点名字列表，一次请求，传入节点数量上限为100个
    */
    @SerializedName("MachineNames")
    @Expose
    private String [] MachineNames;

    /**
    * 实例的关闭模式。取值范围：
soft_first：表示在正常关闭失败后进行强制关闭
hard：直接强制关闭
soft：仅软关机
    */
    @SerializedName("StopType")
    @Expose
    private String StopType;

    /**
     * Get 集群 ID 
     * @return ClusterId 集群 ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群 ID
     * @param ClusterId 集群 ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 节点名字列表，一次请求，传入节点数量上限为100个 
     * @return MachineNames 节点名字列表，一次请求，传入节点数量上限为100个
     */
    public String [] getMachineNames() {
        return this.MachineNames;
    }

    /**
     * Set 节点名字列表，一次请求，传入节点数量上限为100个
     * @param MachineNames 节点名字列表，一次请求，传入节点数量上限为100个
     */
    public void setMachineNames(String [] MachineNames) {
        this.MachineNames = MachineNames;
    }

    /**
     * Get 实例的关闭模式。取值范围：
soft_first：表示在正常关闭失败后进行强制关闭
hard：直接强制关闭
soft：仅软关机 
     * @return StopType 实例的关闭模式。取值范围：
soft_first：表示在正常关闭失败后进行强制关闭
hard：直接强制关闭
soft：仅软关机
     */
    public String getStopType() {
        return this.StopType;
    }

    /**
     * Set 实例的关闭模式。取值范围：
soft_first：表示在正常关闭失败后进行强制关闭
hard：直接强制关闭
soft：仅软关机
     * @param StopType 实例的关闭模式。取值范围：
soft_first：表示在正常关闭失败后进行强制关闭
hard：直接强制关闭
soft：仅软关机
     */
    public void setStopType(String StopType) {
        this.StopType = StopType;
    }

    public StopMachinesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StopMachinesRequest(StopMachinesRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.MachineNames != null) {
            this.MachineNames = new String[source.MachineNames.length];
            for (int i = 0; i < source.MachineNames.length; i++) {
                this.MachineNames[i] = new String(source.MachineNames[i]);
            }
        }
        if (source.StopType != null) {
            this.StopType = new String(source.StopType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "MachineNames.", this.MachineNames);
        this.setParamSimple(map, prefix + "StopType", this.StopType);

    }
}

