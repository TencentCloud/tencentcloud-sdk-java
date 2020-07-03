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

public class DestroyStaticStoreRequest extends AbstractModel{

    /**
    * 环境ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * cdn域名
    */
    @SerializedName("CdnDomain")
    @Expose
    private String CdnDomain;

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
     * Get cdn域名 
     * @return CdnDomain cdn域名
     */
    public String getCdnDomain() {
        return this.CdnDomain;
    }

    /**
     * Set cdn域名
     * @param CdnDomain cdn域名
     */
    public void setCdnDomain(String CdnDomain) {
        this.CdnDomain = CdnDomain;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "CdnDomain", this.CdnDomain);

    }
}

