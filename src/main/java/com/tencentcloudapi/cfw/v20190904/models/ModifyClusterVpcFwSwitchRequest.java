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

public class ModifyClusterVpcFwSwitchRequest extends AbstractModel {

    /**
    * <p>开关，0：关闭，1：开启</p>
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * <p>集群模式vpc间防火墙ccn开关信息</p>
    */
    @SerializedName("CcnSwitch")
    @Expose
    private CcnSwitchInfo [] CcnSwitch;

    /**
     * Get <p>开关，0：关闭，1：开启</p> 
     * @return Enable <p>开关，0：关闭，1：开启</p>
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>开关，0：关闭，1：开启</p>
     * @param Enable <p>开关，0：关闭，1：开启</p>
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>集群模式vpc间防火墙ccn开关信息</p> 
     * @return CcnSwitch <p>集群模式vpc间防火墙ccn开关信息</p>
     */
    public CcnSwitchInfo [] getCcnSwitch() {
        return this.CcnSwitch;
    }

    /**
     * Set <p>集群模式vpc间防火墙ccn开关信息</p>
     * @param CcnSwitch <p>集群模式vpc间防火墙ccn开关信息</p>
     */
    public void setCcnSwitch(CcnSwitchInfo [] CcnSwitch) {
        this.CcnSwitch = CcnSwitch;
    }

    public ModifyClusterVpcFwSwitchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyClusterVpcFwSwitchRequest(ModifyClusterVpcFwSwitchRequest source) {
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.CcnSwitch != null) {
            this.CcnSwitch = new CcnSwitchInfo[source.CcnSwitch.length];
            for (int i = 0; i < source.CcnSwitch.length; i++) {
                this.CcnSwitch[i] = new CcnSwitchInfo(source.CcnSwitch[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamArrayObj(map, prefix + "CcnSwitch.", this.CcnSwitch);

    }
}

