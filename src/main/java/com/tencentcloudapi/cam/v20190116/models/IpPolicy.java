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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IpPolicy extends AbstractModel {

    /**
    * IP段
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * 策略效力，Allow或Deny
    */
    @SerializedName("Effect")
    @Expose
    private String Effect;

    /**
     * Get IP段 
     * @return IP IP段
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set IP段
     * @param IP IP段
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get 策略效力，Allow或Deny 
     * @return Effect 策略效力，Allow或Deny
     */
    public String getEffect() {
        return this.Effect;
    }

    /**
     * Set 策略效力，Allow或Deny
     * @param Effect 策略效力，Allow或Deny
     */
    public void setEffect(String Effect) {
        this.Effect = Effect;
    }

    public IpPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IpPolicy(IpPolicy source) {
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.Effect != null) {
            this.Effect = new String(source.Effect);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "Effect", this.Effect);

    }
}

