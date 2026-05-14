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
package com.tencentcloudapi.rce.v20250425.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManageIPPortraitRiskInput extends AbstractModel {

    /**
    * <p>用户公网ip（仅支持IPv4）</p>
    */
    @SerializedName("UserIp")
    @Expose
    private String UserIp;

    /**
    * <p>渠道号<br>1：pc<br>2：H5<br>3：app<br>4：ott</p>
    */
    @SerializedName("Channel")
    @Expose
    private Long Channel;

    /**
     * Get <p>用户公网ip（仅支持IPv4）</p> 
     * @return UserIp <p>用户公网ip（仅支持IPv4）</p>
     */
    public String getUserIp() {
        return this.UserIp;
    }

    /**
     * Set <p>用户公网ip（仅支持IPv4）</p>
     * @param UserIp <p>用户公网ip（仅支持IPv4）</p>
     */
    public void setUserIp(String UserIp) {
        this.UserIp = UserIp;
    }

    /**
     * Get <p>渠道号<br>1：pc<br>2：H5<br>3：app<br>4：ott</p> 
     * @return Channel <p>渠道号<br>1：pc<br>2：H5<br>3：app<br>4：ott</p>
     */
    public Long getChannel() {
        return this.Channel;
    }

    /**
     * Set <p>渠道号<br>1：pc<br>2：H5<br>3：app<br>4：ott</p>
     * @param Channel <p>渠道号<br>1：pc<br>2：H5<br>3：app<br>4：ott</p>
     */
    public void setChannel(Long Channel) {
        this.Channel = Channel;
    }

    public ManageIPPortraitRiskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManageIPPortraitRiskInput(ManageIPPortraitRiskInput source) {
        if (source.UserIp != null) {
            this.UserIp = new String(source.UserIp);
        }
        if (source.Channel != null) {
            this.Channel = new Long(source.Channel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserIp", this.UserIp);
        this.setParamSimple(map, prefix + "Channel", this.Channel);

    }
}

