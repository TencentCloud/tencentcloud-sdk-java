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

    public TrafficMirrorReciversStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrafficMirrorReciversStatus(TrafficMirrorReciversStatus source) {
        if (source.LanIp != null) {
            this.LanIp = new String(source.LanIp);
        }
        if (source.ReceiversPortStatusSet != null) {
            this.ReceiversPortStatusSet = new TrafficMirrorPortStatus[source.ReceiversPortStatusSet.length];
            for (int i = 0; i < source.ReceiversPortStatusSet.length; i++) {
                this.ReceiversPortStatusSet[i] = new TrafficMirrorPortStatus(source.ReceiversPortStatusSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LanIp", this.LanIp);
        this.setParamArrayObj(map, prefix + "ReceiversPortStatusSet.", this.ReceiversPortStatusSet);

    }
}

