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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowRealtimeStatusRTP extends AbstractModel{

    /**
    * 传输的包个数
    */
    @SerializedName("Packets")
    @Expose
    private Long Packets;

    /**
     * Get 传输的包个数 
     * @return Packets 传输的包个数
     */
    public Long getPackets() {
        return this.Packets;
    }

    /**
     * Set 传输的包个数
     * @param Packets 传输的包个数
     */
    public void setPackets(Long Packets) {
        this.Packets = Packets;
    }

    public FlowRealtimeStatusRTP() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowRealtimeStatusRTP(FlowRealtimeStatusRTP source) {
        if (source.Packets != null) {
            this.Packets = new Long(source.Packets);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Packets", this.Packets);

    }
}

