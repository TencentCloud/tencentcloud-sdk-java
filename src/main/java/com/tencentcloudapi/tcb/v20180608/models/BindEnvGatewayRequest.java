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

public class BindEnvGatewayRequest extends AbstractModel{

    /**
    * 子环境id
    */
    @SerializedName("SubEnvId")
    @Expose
    private String SubEnvId;

    /**
     * Get 子环境id 
     * @return SubEnvId 子环境id
     */
    public String getSubEnvId() {
        return this.SubEnvId;
    }

    /**
     * Set 子环境id
     * @param SubEnvId 子环境id
     */
    public void setSubEnvId(String SubEnvId) {
        this.SubEnvId = SubEnvId;
    }

    public BindEnvGatewayRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindEnvGatewayRequest(BindEnvGatewayRequest source) {
        if (source.SubEnvId != null) {
            this.SubEnvId = new String(source.SubEnvId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubEnvId", this.SubEnvId);

    }
}

