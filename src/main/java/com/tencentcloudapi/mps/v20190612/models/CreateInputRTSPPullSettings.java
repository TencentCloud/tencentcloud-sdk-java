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

public class CreateInputRTSPPullSettings extends AbstractModel{

    /**
    * RTSP源站的源站地址，有且只能有一个。
    */
    @SerializedName("SourceAddresses")
    @Expose
    private RTSPPullSourceAddress [] SourceAddresses;

    /**
     * Get RTSP源站的源站地址，有且只能有一个。 
     * @return SourceAddresses RTSP源站的源站地址，有且只能有一个。
     */
    public RTSPPullSourceAddress [] getSourceAddresses() {
        return this.SourceAddresses;
    }

    /**
     * Set RTSP源站的源站地址，有且只能有一个。
     * @param SourceAddresses RTSP源站的源站地址，有且只能有一个。
     */
    public void setSourceAddresses(RTSPPullSourceAddress [] SourceAddresses) {
        this.SourceAddresses = SourceAddresses;
    }

    public CreateInputRTSPPullSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInputRTSPPullSettings(CreateInputRTSPPullSettings source) {
        if (source.SourceAddresses != null) {
            this.SourceAddresses = new RTSPPullSourceAddress[source.SourceAddresses.length];
            for (int i = 0; i < source.SourceAddresses.length; i++) {
                this.SourceAddresses[i] = new RTSPPullSourceAddress(source.SourceAddresses[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SourceAddresses.", this.SourceAddresses);

    }
}

