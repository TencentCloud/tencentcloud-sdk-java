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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInputRTMPPullSettings extends AbstractModel {

    /**
    * RTMP源站的源站地址，有且只能有一个。
    */
    @SerializedName("SourceAddresses")
    @Expose
    private RTMPPullSourceAddress [] SourceAddresses;

    /**
     * Get RTMP源站的源站地址，有且只能有一个。 
     * @return SourceAddresses RTMP源站的源站地址，有且只能有一个。
     */
    public RTMPPullSourceAddress [] getSourceAddresses() {
        return this.SourceAddresses;
    }

    /**
     * Set RTMP源站的源站地址，有且只能有一个。
     * @param SourceAddresses RTMP源站的源站地址，有且只能有一个。
     */
    public void setSourceAddresses(RTMPPullSourceAddress [] SourceAddresses) {
        this.SourceAddresses = SourceAddresses;
    }

    public CreateInputRTMPPullSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInputRTMPPullSettings(CreateInputRTMPPullSettings source) {
        if (source.SourceAddresses != null) {
            this.SourceAddresses = new RTMPPullSourceAddress[source.SourceAddresses.length];
            for (int i = 0; i < source.SourceAddresses.length; i++) {
                this.SourceAddresses[i] = new RTMPPullSourceAddress(source.SourceAddresses[i]);
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

