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

public class ModifyEdgeIpSwitchRequest extends AbstractModel {

    /**
    * <p>0 关闭开关<br>1 打开开关<br>2 不操作开关，此次切换模式</p>
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * <p>操作开关详情</p>
    */
    @SerializedName("EdgeIpSwitchLst")
    @Expose
    private EdgeIpSwitch [] EdgeIpSwitchLst;

    /**
    * <p>0 不自动选择子网<br>1 自动选择子网创建私有连接</p>
    */
    @SerializedName("AutoChooseSubnet")
    @Expose
    private Long AutoChooseSubnet;

    /**
    * <p>0 切换为旁路<br>1 切换为串行<br>2 不切换模式，此次操作开关</p>
    */
    @SerializedName("SwitchMode")
    @Expose
    private Long SwitchMode;

    /**
     * Get <p>0 关闭开关<br>1 打开开关<br>2 不操作开关，此次切换模式</p> 
     * @return Enable <p>0 关闭开关<br>1 打开开关<br>2 不操作开关，此次切换模式</p>
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>0 关闭开关<br>1 打开开关<br>2 不操作开关，此次切换模式</p>
     * @param Enable <p>0 关闭开关<br>1 打开开关<br>2 不操作开关，此次切换模式</p>
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>操作开关详情</p> 
     * @return EdgeIpSwitchLst <p>操作开关详情</p>
     */
    public EdgeIpSwitch [] getEdgeIpSwitchLst() {
        return this.EdgeIpSwitchLst;
    }

    /**
     * Set <p>操作开关详情</p>
     * @param EdgeIpSwitchLst <p>操作开关详情</p>
     */
    public void setEdgeIpSwitchLst(EdgeIpSwitch [] EdgeIpSwitchLst) {
        this.EdgeIpSwitchLst = EdgeIpSwitchLst;
    }

    /**
     * Get <p>0 不自动选择子网<br>1 自动选择子网创建私有连接</p> 
     * @return AutoChooseSubnet <p>0 不自动选择子网<br>1 自动选择子网创建私有连接</p>
     */
    public Long getAutoChooseSubnet() {
        return this.AutoChooseSubnet;
    }

    /**
     * Set <p>0 不自动选择子网<br>1 自动选择子网创建私有连接</p>
     * @param AutoChooseSubnet <p>0 不自动选择子网<br>1 自动选择子网创建私有连接</p>
     */
    public void setAutoChooseSubnet(Long AutoChooseSubnet) {
        this.AutoChooseSubnet = AutoChooseSubnet;
    }

    /**
     * Get <p>0 切换为旁路<br>1 切换为串行<br>2 不切换模式，此次操作开关</p> 
     * @return SwitchMode <p>0 切换为旁路<br>1 切换为串行<br>2 不切换模式，此次操作开关</p>
     */
    public Long getSwitchMode() {
        return this.SwitchMode;
    }

    /**
     * Set <p>0 切换为旁路<br>1 切换为串行<br>2 不切换模式，此次操作开关</p>
     * @param SwitchMode <p>0 切换为旁路<br>1 切换为串行<br>2 不切换模式，此次操作开关</p>
     */
    public void setSwitchMode(Long SwitchMode) {
        this.SwitchMode = SwitchMode;
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
        if (source.AutoChooseSubnet != null) {
            this.AutoChooseSubnet = new Long(source.AutoChooseSubnet);
        }
        if (source.SwitchMode != null) {
            this.SwitchMode = new Long(source.SwitchMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamArrayObj(map, prefix + "EdgeIpSwitchLst.", this.EdgeIpSwitchLst);
        this.setParamSimple(map, prefix + "AutoChooseSubnet", this.AutoChooseSubnet);
        this.setParamSimple(map, prefix + "SwitchMode", this.SwitchMode);

    }
}

