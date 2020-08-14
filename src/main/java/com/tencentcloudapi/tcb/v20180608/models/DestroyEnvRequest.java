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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DestroyEnvRequest extends AbstractModel{

    /**
    * 环境Id
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 针对预付费 删除隔离中的环境时要传true 正常环境直接跳过隔离期删除
    */
    @SerializedName("IsForce")
    @Expose
    private Boolean IsForce;

    /**
    * 是否绕过资源检查，资源包等额外资源，默认为false，如果为true，则不检查资源是否有数据，直接删除。
    */
    @SerializedName("BypassCheck")
    @Expose
    private Boolean BypassCheck;

    /**
     * Get 环境Id 
     * @return EnvId 环境Id
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境Id
     * @param EnvId 环境Id
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 针对预付费 删除隔离中的环境时要传true 正常环境直接跳过隔离期删除 
     * @return IsForce 针对预付费 删除隔离中的环境时要传true 正常环境直接跳过隔离期删除
     */
    public Boolean getIsForce() {
        return this.IsForce;
    }

    /**
     * Set 针对预付费 删除隔离中的环境时要传true 正常环境直接跳过隔离期删除
     * @param IsForce 针对预付费 删除隔离中的环境时要传true 正常环境直接跳过隔离期删除
     */
    public void setIsForce(Boolean IsForce) {
        this.IsForce = IsForce;
    }

    /**
     * Get 是否绕过资源检查，资源包等额外资源，默认为false，如果为true，则不检查资源是否有数据，直接删除。 
     * @return BypassCheck 是否绕过资源检查，资源包等额外资源，默认为false，如果为true，则不检查资源是否有数据，直接删除。
     */
    public Boolean getBypassCheck() {
        return this.BypassCheck;
    }

    /**
     * Set 是否绕过资源检查，资源包等额外资源，默认为false，如果为true，则不检查资源是否有数据，直接删除。
     * @param BypassCheck 是否绕过资源检查，资源包等额外资源，默认为false，如果为true，则不检查资源是否有数据，直接删除。
     */
    public void setBypassCheck(Boolean BypassCheck) {
        this.BypassCheck = BypassCheck;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "IsForce", this.IsForce);
        this.setParamSimple(map, prefix + "BypassCheck", this.BypassCheck);

    }
}

