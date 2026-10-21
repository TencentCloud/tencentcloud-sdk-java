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
package com.tencentcloudapi.fwm.v20250611.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCfwManagedRequest extends AbstractModel {

    /**
    * 目标成员 Id
    */
    @SerializedName("MemberId")
    @Expose
    private String MemberId;

    /**
    * 云防火墙纳管：0-关闭，1-开启
    */
    @SerializedName("CfwManaged")
    @Expose
    private Long CfwManaged;

    /**
     * Get 目标成员 Id 
     * @return MemberId 目标成员 Id
     */
    public String getMemberId() {
        return this.MemberId;
    }

    /**
     * Set 目标成员 Id
     * @param MemberId 目标成员 Id
     */
    public void setMemberId(String MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get 云防火墙纳管：0-关闭，1-开启 
     * @return CfwManaged 云防火墙纳管：0-关闭，1-开启
     */
    public Long getCfwManaged() {
        return this.CfwManaged;
    }

    /**
     * Set 云防火墙纳管：0-关闭，1-开启
     * @param CfwManaged 云防火墙纳管：0-关闭，1-开启
     */
    public void setCfwManaged(Long CfwManaged) {
        this.CfwManaged = CfwManaged;
    }

    public ModifyCfwManagedRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCfwManagedRequest(ModifyCfwManagedRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String(source.MemberId);
        }
        if (source.CfwManaged != null) {
            this.CfwManaged = new Long(source.CfwManaged);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MemberId", this.MemberId);
        this.setParamSimple(map, prefix + "CfwManaged", this.CfwManaged);

    }
}

