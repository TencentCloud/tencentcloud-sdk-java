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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateClusterVpcFwRequest extends AbstractModel {

    /**
    * ccn防火墙开关配置信息
    */
    @SerializedName("CcnSwitch")
    @Expose
    private CcnSwitchInfo CcnSwitch;

    /**
     * Get ccn防火墙开关配置信息 
     * @return CcnSwitch ccn防火墙开关配置信息
     */
    public CcnSwitchInfo getCcnSwitch() {
        return this.CcnSwitch;
    }

    /**
     * Set ccn防火墙开关配置信息
     * @param CcnSwitch ccn防火墙开关配置信息
     */
    public void setCcnSwitch(CcnSwitchInfo CcnSwitch) {
        this.CcnSwitch = CcnSwitch;
    }

    public UpdateClusterVpcFwRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateClusterVpcFwRequest(UpdateClusterVpcFwRequest source) {
        if (source.CcnSwitch != null) {
            this.CcnSwitch = new CcnSwitchInfo(source.CcnSwitch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "CcnSwitch.", this.CcnSwitch);

    }
}

