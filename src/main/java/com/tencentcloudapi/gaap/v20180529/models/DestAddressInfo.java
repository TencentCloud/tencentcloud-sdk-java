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

public class DestAddressInfo extends AbstractModel{

    /**
    * 加速的目标IP，可多ip一起加速
    */
    @SerializedName("DestIp")
    @Expose
    private String [] DestIp;

    /**
     * Get 加速的目标IP，可多ip一起加速 
     * @return DestIp 加速的目标IP，可多ip一起加速
     */
    public String [] getDestIp() {
        return this.DestIp;
    }

    /**
     * Set 加速的目标IP，可多ip一起加速
     * @param DestIp 加速的目标IP，可多ip一起加速
     */
    public void setDestIp(String [] DestIp) {
        this.DestIp = DestIp;
    }

    public DestAddressInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DestAddressInfo(DestAddressInfo source) {
        if (source.DestIp != null) {
            this.DestIp = new String[source.DestIp.length];
            for (int i = 0; i < source.DestIp.length; i++) {
                this.DestIp[i] = new String(source.DestIp[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DestIp.", this.DestIp);

    }
}

