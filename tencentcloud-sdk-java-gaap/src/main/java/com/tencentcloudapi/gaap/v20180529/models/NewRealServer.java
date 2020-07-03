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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NewRealServer extends AbstractModel{

    /**
    * 源站ID
    */
    @SerializedName("RealServerId")
    @Expose
    private String RealServerId;

    /**
    * 源站ip或域名
    */
    @SerializedName("RealServerIP")
    @Expose
    private String RealServerIP;

    /**
     * Get 源站ID 
     * @return RealServerId 源站ID
     */
    public String getRealServerId() {
        return this.RealServerId;
    }

    /**
     * Set 源站ID
     * @param RealServerId 源站ID
     */
    public void setRealServerId(String RealServerId) {
        this.RealServerId = RealServerId;
    }

    /**
     * Get 源站ip或域名 
     * @return RealServerIP 源站ip或域名
     */
    public String getRealServerIP() {
        return this.RealServerIP;
    }

    /**
     * Set 源站ip或域名
     * @param RealServerIP 源站ip或域名
     */
    public void setRealServerIP(String RealServerIP) {
        this.RealServerIP = RealServerIP;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RealServerId", this.RealServerId);
        this.setParamSimple(map, prefix + "RealServerIP", this.RealServerIP);

    }
}

