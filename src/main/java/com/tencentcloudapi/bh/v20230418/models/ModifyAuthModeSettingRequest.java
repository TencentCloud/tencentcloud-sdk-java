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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAuthModeSettingRequest extends AbstractModel {

    /**
    * 双因子认证，0-不开启，1-OTP，2-短信，3-USB Key
    */
    @SerializedName("AuthMode")
    @Expose
    private Long AuthMode;

    /**
    * 资源类型，0：普通 1：国密
    */
    @SerializedName("ResourceType")
    @Expose
    private Long ResourceType;

    /**
     * Get 双因子认证，0-不开启，1-OTP，2-短信，3-USB Key 
     * @return AuthMode 双因子认证，0-不开启，1-OTP，2-短信，3-USB Key
     */
    public Long getAuthMode() {
        return this.AuthMode;
    }

    /**
     * Set 双因子认证，0-不开启，1-OTP，2-短信，3-USB Key
     * @param AuthMode 双因子认证，0-不开启，1-OTP，2-短信，3-USB Key
     */
    public void setAuthMode(Long AuthMode) {
        this.AuthMode = AuthMode;
    }

    /**
     * Get 资源类型，0：普通 1：国密 
     * @return ResourceType 资源类型，0：普通 1：国密
     */
    public Long getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型，0：普通 1：国密
     * @param ResourceType 资源类型，0：普通 1：国密
     */
    public void setResourceType(Long ResourceType) {
        this.ResourceType = ResourceType;
    }

    public ModifyAuthModeSettingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAuthModeSettingRequest(ModifyAuthModeSettingRequest source) {
        if (source.AuthMode != null) {
            this.AuthMode = new Long(source.AuthMode);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new Long(source.ResourceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AuthMode", this.AuthMode);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);

    }
}

