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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyModuleDisableWanIpRequest extends AbstractModel{

    /**
    * 模块ID
    */
    @SerializedName("ModuleId")
    @Expose
    private String ModuleId;

    /**
    * 是否禁止分配外网ip,true：统一分配外网ip，false：禁止分配外网ip.
    */
    @SerializedName("DisableWanIp")
    @Expose
    private Boolean DisableWanIp;

    /**
     * Get 模块ID 
     * @return ModuleId 模块ID
     */
    public String getModuleId() {
        return this.ModuleId;
    }

    /**
     * Set 模块ID
     * @param ModuleId 模块ID
     */
    public void setModuleId(String ModuleId) {
        this.ModuleId = ModuleId;
    }

    /**
     * Get 是否禁止分配外网ip,true：统一分配外网ip，false：禁止分配外网ip. 
     * @return DisableWanIp 是否禁止分配外网ip,true：统一分配外网ip，false：禁止分配外网ip.
     */
    public Boolean getDisableWanIp() {
        return this.DisableWanIp;
    }

    /**
     * Set 是否禁止分配外网ip,true：统一分配外网ip，false：禁止分配外网ip.
     * @param DisableWanIp 是否禁止分配外网ip,true：统一分配外网ip，false：禁止分配外网ip.
     */
    public void setDisableWanIp(Boolean DisableWanIp) {
        this.DisableWanIp = DisableWanIp;
    }

    public ModifyModuleDisableWanIpRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyModuleDisableWanIpRequest(ModifyModuleDisableWanIpRequest source) {
        if (source.ModuleId != null) {
            this.ModuleId = new String(source.ModuleId);
        }
        if (source.DisableWanIp != null) {
            this.DisableWanIp = new Boolean(source.DisableWanIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModuleId", this.ModuleId);
        this.setParamSimple(map, prefix + "DisableWanIp", this.DisableWanIp);

    }
}

