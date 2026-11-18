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

public class ModifyEnvAccessControlRequest extends AbstractModel {

    /**
    * <p>环境id</p>
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * <p>本次要设置的来源集合</p><p>入参限制：SourceType = PUBLIC 时，标识操作公网开关<br>SourceType = VPC 时，通过配置 VPCWhiteList，开启/关闭 VPC 白名单<br>SourceType = WOA 时，通过配置 WOAAuth，开启/关闭鉴权校验，开启鉴权时，AuthToken 字段为填</p>
    */
    @SerializedName("Sources")
    @Expose
    private AccessSourceSetting [] Sources;

    /**
     * Get <p>环境id</p> 
     * @return EnvId <p>环境id</p>
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set <p>环境id</p>
     * @param EnvId <p>环境id</p>
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get <p>本次要设置的来源集合</p><p>入参限制：SourceType = PUBLIC 时，标识操作公网开关<br>SourceType = VPC 时，通过配置 VPCWhiteList，开启/关闭 VPC 白名单<br>SourceType = WOA 时，通过配置 WOAAuth，开启/关闭鉴权校验，开启鉴权时，AuthToken 字段为填</p> 
     * @return Sources <p>本次要设置的来源集合</p><p>入参限制：SourceType = PUBLIC 时，标识操作公网开关<br>SourceType = VPC 时，通过配置 VPCWhiteList，开启/关闭 VPC 白名单<br>SourceType = WOA 时，通过配置 WOAAuth，开启/关闭鉴权校验，开启鉴权时，AuthToken 字段为填</p>
     */
    public AccessSourceSetting [] getSources() {
        return this.Sources;
    }

    /**
     * Set <p>本次要设置的来源集合</p><p>入参限制：SourceType = PUBLIC 时，标识操作公网开关<br>SourceType = VPC 时，通过配置 VPCWhiteList，开启/关闭 VPC 白名单<br>SourceType = WOA 时，通过配置 WOAAuth，开启/关闭鉴权校验，开启鉴权时，AuthToken 字段为填</p>
     * @param Sources <p>本次要设置的来源集合</p><p>入参限制：SourceType = PUBLIC 时，标识操作公网开关<br>SourceType = VPC 时，通过配置 VPCWhiteList，开启/关闭 VPC 白名单<br>SourceType = WOA 时，通过配置 WOAAuth，开启/关闭鉴权校验，开启鉴权时，AuthToken 字段为填</p>
     */
    public void setSources(AccessSourceSetting [] Sources) {
        this.Sources = Sources;
    }

    public ModifyEnvAccessControlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyEnvAccessControlRequest(ModifyEnvAccessControlRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.Sources != null) {
            this.Sources = new AccessSourceSetting[source.Sources.length];
            for (int i = 0; i < source.Sources.length; i++) {
                this.Sources[i] = new AccessSourceSetting(source.Sources[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamArrayObj(map, prefix + "Sources.", this.Sources);

    }
}

