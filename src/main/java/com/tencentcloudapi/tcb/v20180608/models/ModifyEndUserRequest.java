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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyEndUserRequest extends AbstractModel {

    /**
    * 环境ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * C端用户端的唯一ID
    */
    @SerializedName("UUId")
    @Expose
    private String UUId;

    /**
    * 账号的状态
<li>ENABLE</li>
<li>DISABLE</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 环境ID 
     * @return EnvId 环境ID
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境ID
     * @param EnvId 环境ID
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get C端用户端的唯一ID 
     * @return UUId C端用户端的唯一ID
     */
    public String getUUId() {
        return this.UUId;
    }

    /**
     * Set C端用户端的唯一ID
     * @param UUId C端用户端的唯一ID
     */
    public void setUUId(String UUId) {
        this.UUId = UUId;
    }

    /**
     * Get 账号的状态
<li>ENABLE</li>
<li>DISABLE</li> 
     * @return Status 账号的状态
<li>ENABLE</li>
<li>DISABLE</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 账号的状态
<li>ENABLE</li>
<li>DISABLE</li>
     * @param Status 账号的状态
<li>ENABLE</li>
<li>DISABLE</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ModifyEndUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyEndUserRequest(ModifyEndUserRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.UUId != null) {
            this.UUId = new String(source.UUId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "UUId", this.UUId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

