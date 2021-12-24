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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityContext extends AbstractModel{

    /**
    * 是否开启特权模式
    */
    @SerializedName("Privilege")
    @Expose
    private Boolean Privilege;

    /**
    * 目录/Proc挂载方式
    */
    @SerializedName("ProcMount")
    @Expose
    private String ProcMount;

    /**
    * 安全配置
    */
    @SerializedName("Capabilities")
    @Expose
    private SecurityCapabilities Capabilities;

    /**
     * Get 是否开启特权模式 
     * @return Privilege 是否开启特权模式
     */
    public Boolean getPrivilege() {
        return this.Privilege;
    }

    /**
     * Set 是否开启特权模式
     * @param Privilege 是否开启特权模式
     */
    public void setPrivilege(Boolean Privilege) {
        this.Privilege = Privilege;
    }

    /**
     * Get 目录/Proc挂载方式 
     * @return ProcMount 目录/Proc挂载方式
     */
    public String getProcMount() {
        return this.ProcMount;
    }

    /**
     * Set 目录/Proc挂载方式
     * @param ProcMount 目录/Proc挂载方式
     */
    public void setProcMount(String ProcMount) {
        this.ProcMount = ProcMount;
    }

    /**
     * Get 安全配置 
     * @return Capabilities 安全配置
     */
    public SecurityCapabilities getCapabilities() {
        return this.Capabilities;
    }

    /**
     * Set 安全配置
     * @param Capabilities 安全配置
     */
    public void setCapabilities(SecurityCapabilities Capabilities) {
        this.Capabilities = Capabilities;
    }

    public SecurityContext() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityContext(SecurityContext source) {
        if (source.Privilege != null) {
            this.Privilege = new Boolean(source.Privilege);
        }
        if (source.ProcMount != null) {
            this.ProcMount = new String(source.ProcMount);
        }
        if (source.Capabilities != null) {
            this.Capabilities = new SecurityCapabilities(source.Capabilities);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Privilege", this.Privilege);
        this.setParamSimple(map, prefix + "ProcMount", this.ProcMount);
        this.setParamObj(map, prefix + "Capabilities.", this.Capabilities);

    }
}

