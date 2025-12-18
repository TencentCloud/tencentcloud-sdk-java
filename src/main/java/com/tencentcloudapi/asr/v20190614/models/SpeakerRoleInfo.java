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
package com.tencentcloudapi.asr.v20190614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpeakerRoleInfo extends AbstractModel {

    /**
    * 音频url地址，建议不超过30秒，最大45秒
    */
    @SerializedName("RoleAudioUrl")
    @Expose
    private String RoleAudioUrl;

    /**
    * 不超过30字节
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
     * Get 音频url地址，建议不超过30秒，最大45秒 
     * @return RoleAudioUrl 音频url地址，建议不超过30秒，最大45秒
     */
    public String getRoleAudioUrl() {
        return this.RoleAudioUrl;
    }

    /**
     * Set 音频url地址，建议不超过30秒，最大45秒
     * @param RoleAudioUrl 音频url地址，建议不超过30秒，最大45秒
     */
    public void setRoleAudioUrl(String RoleAudioUrl) {
        this.RoleAudioUrl = RoleAudioUrl;
    }

    /**
     * Get 不超过30字节 
     * @return RoleName 不超过30字节
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set 不超过30字节
     * @param RoleName 不超过30字节
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    public SpeakerRoleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpeakerRoleInfo(SpeakerRoleInfo source) {
        if (source.RoleAudioUrl != null) {
            this.RoleAudioUrl = new String(source.RoleAudioUrl);
        }
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleAudioUrl", this.RoleAudioUrl);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);

    }
}

