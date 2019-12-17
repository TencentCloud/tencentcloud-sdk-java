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

public class TrafficMirrorReciversStatus extends AbstractModel{

    /**
    * 内网IP。
    */
    @SerializedName("LanIp")
    @Expose
    private String LanIp;

    /**
    * 端口及对应的状态。
    */
    @SerializedName("ReceiversPortStatusSet")
    @Expose
    private TrafficMirrorPortStatus [] ReceiversPortStatusSet;

    /**
     * Get 内网IP。 
     * @return LanIp 内网IP。
     */
    public String getLanIp() {
        return this.LanIp;
    }

    /**
     * Set 内网IP。
     * @param LanIp 内网IP。
     */
    public void setLanIp(String LanIp) {
        this.LanIp = LanIp;
    }

    /**
     * Get 端口及对应的状态。 
     * @return ReceiversPortStatusSet 端口及对应的状态。
     */
    public TrafficMirrorPortStatus [] getReceiversPortStatusSet() {
        return this.ReceiversPortStatusSet;
    }

    /**
     * Set 端口及对应的状态。
     * @param ReceiversPortStatusSet 端口及对应的状态。
     */
    public void setReceiversPortStatusSet(TrafficMirrorPortStatus [] ReceiversPortStatusSet) {
        this.ReceiversPortStatusSet = ReceiversPortStatusSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LanIp", this.LanIp);
        this.setParamArrayObj(map, prefix + "ReceiversPortStatusSet.", this.ReceiversPortStatusSet);

    }
}

