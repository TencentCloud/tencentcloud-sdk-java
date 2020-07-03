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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccessInfo extends AbstractModel{

    /**
    * 域名
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * VIP
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
     * Get 域名 
     * @return Host 域名
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 域名
     * @param Host 域名
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get VIP 
     * @return Vip VIP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set VIP
     * @param Vip VIP
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Vip", this.Vip);

    }
}

