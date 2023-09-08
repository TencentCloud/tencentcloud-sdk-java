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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyEdgeIpSwitchRequest extends AbstractModel{

    /**
    * 0 关闭开关
1 打开开关
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 操作开关详情
    */
    @SerializedName("EdgeIpSwitchLst")
    @Expose
    private EdgeIpSwitch [] EdgeIpSwitchLst;

    /**
     * Get 0 关闭开关
1 打开开关 
     * @return Enable 0 关闭开关
1 打开开关
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 0 关闭开关
1 打开开关
     * @param Enable 0 关闭开关
1 打开开关
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 操作开关详情 
     * @return EdgeIpSwitchLst 操作开关详情
     */
    public EdgeIpSwitch [] getEdgeIpSwitchLst() {
        return this.EdgeIpSwitchLst;
    }

    /**
     * Set 操作开关详情
     * @param EdgeIpSwitchLst 操作开关详情
     */
    public void setEdgeIpSwitchLst(EdgeIpSwitch [] EdgeIpSwitchLst) {
        this.EdgeIpSwitchLst = EdgeIpSwitchLst;
    }

    public ModifyEdgeIpSwitchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyEdgeIpSwitchRequest(ModifyEdgeIpSwitchRequest source) {
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.EdgeIpSwitchLst != null) {
            this.EdgeIpSwitchLst = new EdgeIpSwitch[source.EdgeIpSwitchLst.length];
            for (int i = 0; i < source.EdgeIpSwitchLst.length; i++) {
                this.EdgeIpSwitchLst[i] = new EdgeIpSwitch(source.EdgeIpSwitchLst[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamArrayObj(map, prefix + "EdgeIpSwitchLst.", this.EdgeIpSwitchLst);

    }
}

