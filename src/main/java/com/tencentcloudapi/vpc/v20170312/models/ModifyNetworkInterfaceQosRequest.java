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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNetworkInterfaceQosRequest extends AbstractModel{

    /**
    * 弹性网卡ID，支持批量修改。
    */
    @SerializedName("NetworkInterfaceIds")
    @Expose
    private String [] NetworkInterfaceIds;

    /**
    * 服务质量，可选值：PT、AU、AG、DEFAULT，分别代表白金、金、银、默认四个等级。
    */
    @SerializedName("QosLevel")
    @Expose
    private String QosLevel;

    /**
     * Get 弹性网卡ID，支持批量修改。 
     * @return NetworkInterfaceIds 弹性网卡ID，支持批量修改。
     */
    public String [] getNetworkInterfaceIds() {
        return this.NetworkInterfaceIds;
    }

    /**
     * Set 弹性网卡ID，支持批量修改。
     * @param NetworkInterfaceIds 弹性网卡ID，支持批量修改。
     */
    public void setNetworkInterfaceIds(String [] NetworkInterfaceIds) {
        this.NetworkInterfaceIds = NetworkInterfaceIds;
    }

    /**
     * Get 服务质量，可选值：PT、AU、AG、DEFAULT，分别代表白金、金、银、默认四个等级。 
     * @return QosLevel 服务质量，可选值：PT、AU、AG、DEFAULT，分别代表白金、金、银、默认四个等级。
     */
    public String getQosLevel() {
        return this.QosLevel;
    }

    /**
     * Set 服务质量，可选值：PT、AU、AG、DEFAULT，分别代表白金、金、银、默认四个等级。
     * @param QosLevel 服务质量，可选值：PT、AU、AG、DEFAULT，分别代表白金、金、银、默认四个等级。
     */
    public void setQosLevel(String QosLevel) {
        this.QosLevel = QosLevel;
    }

    public ModifyNetworkInterfaceQosRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNetworkInterfaceQosRequest(ModifyNetworkInterfaceQosRequest source) {
        if (source.NetworkInterfaceIds != null) {
            this.NetworkInterfaceIds = new String[source.NetworkInterfaceIds.length];
            for (int i = 0; i < source.NetworkInterfaceIds.length; i++) {
                this.NetworkInterfaceIds[i] = new String(source.NetworkInterfaceIds[i]);
            }
        }
        if (source.QosLevel != null) {
            this.QosLevel = new String(source.QosLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "NetworkInterfaceIds.", this.NetworkInterfaceIds);
        this.setParamSimple(map, prefix + "QosLevel", this.QosLevel);

    }
}

