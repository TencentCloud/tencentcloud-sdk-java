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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoginStatusInfo extends AbstractModel{

    /**
    * 用户 Id。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 用户登录状态。
<li>Online：在线；</li>
<li>Offline：离线。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 用户 Id。 
     * @return UserId 用户 Id。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户 Id。
     * @param UserId 用户 Id。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 用户登录状态。
<li>Online：在线；</li>
<li>Offline：离线。</li> 
     * @return Status 用户登录状态。
<li>Online：在线；</li>
<li>Offline：离线。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 用户登录状态。
<li>Online：在线；</li>
<li>Offline：离线。</li>
     * @param Status 用户登录状态。
<li>Online：在线；</li>
<li>Offline：离线。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

