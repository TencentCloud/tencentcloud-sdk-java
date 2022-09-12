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

public class DescribeDefenseSwitchResponse extends AbstractModel{

    /**
    * 基础防御开关
    */
    @SerializedName("BasicRuleSwitch")
    @Expose
    private Long BasicRuleSwitch;

    /**
    * 安全基线开关
    */
    @SerializedName("BaselineAllSwitch")
    @Expose
    private Long BaselineAllSwitch;

    /**
    * 威胁情报开关
    */
    @SerializedName("TiSwitch")
    @Expose
    private Long TiSwitch;

    /**
    * 虚拟补丁开关
    */
    @SerializedName("VirtualPatchSwitch")
    @Expose
    private Long VirtualPatchSwitch;

    /**
    * 是否历史开启
    */
    @SerializedName("HistoryOpen")
    @Expose
    private Long HistoryOpen;

    /**
    * 状态值，0：查询成功，非0：查询失败
    */
    @SerializedName("ReturnCode")
    @Expose
    private Long ReturnCode;

    /**
    * 状态信息，success：查询成功，fail：查询失败
    */
    @SerializedName("ReturnMsg")
    @Expose
    private String ReturnMsg;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 基础防御开关 
     * @return BasicRuleSwitch 基础防御开关
     */
    public Long getBasicRuleSwitch() {
        return this.BasicRuleSwitch;
    }

    /**
     * Set 基础防御开关
     * @param BasicRuleSwitch 基础防御开关
     */
    public void setBasicRuleSwitch(Long BasicRuleSwitch) {
        this.BasicRuleSwitch = BasicRuleSwitch;
    }

    /**
     * Get 安全基线开关 
     * @return BaselineAllSwitch 安全基线开关
     */
    public Long getBaselineAllSwitch() {
        return this.BaselineAllSwitch;
    }

    /**
     * Set 安全基线开关
     * @param BaselineAllSwitch 安全基线开关
     */
    public void setBaselineAllSwitch(Long BaselineAllSwitch) {
        this.BaselineAllSwitch = BaselineAllSwitch;
    }

    /**
     * Get 威胁情报开关 
     * @return TiSwitch 威胁情报开关
     */
    public Long getTiSwitch() {
        return this.TiSwitch;
    }

    /**
     * Set 威胁情报开关
     * @param TiSwitch 威胁情报开关
     */
    public void setTiSwitch(Long TiSwitch) {
        this.TiSwitch = TiSwitch;
    }

    /**
     * Get 虚拟补丁开关 
     * @return VirtualPatchSwitch 虚拟补丁开关
     */
    public Long getVirtualPatchSwitch() {
        return this.VirtualPatchSwitch;
    }

    /**
     * Set 虚拟补丁开关
     * @param VirtualPatchSwitch 虚拟补丁开关
     */
    public void setVirtualPatchSwitch(Long VirtualPatchSwitch) {
        this.VirtualPatchSwitch = VirtualPatchSwitch;
    }

    /**
     * Get 是否历史开启 
     * @return HistoryOpen 是否历史开启
     */
    public Long getHistoryOpen() {
        return this.HistoryOpen;
    }

    /**
     * Set 是否历史开启
     * @param HistoryOpen 是否历史开启
     */
    public void setHistoryOpen(Long HistoryOpen) {
        this.HistoryOpen = HistoryOpen;
    }

    /**
     * Get 状态值，0：查询成功，非0：查询失败 
     * @return ReturnCode 状态值，0：查询成功，非0：查询失败
     */
    public Long getReturnCode() {
        return this.ReturnCode;
    }

    /**
     * Set 状态值，0：查询成功，非0：查询失败
     * @param ReturnCode 状态值，0：查询成功，非0：查询失败
     */
    public void setReturnCode(Long ReturnCode) {
        this.ReturnCode = ReturnCode;
    }

    /**
     * Get 状态信息，success：查询成功，fail：查询失败 
     * @return ReturnMsg 状态信息，success：查询成功，fail：查询失败
     */
    public String getReturnMsg() {
        return this.ReturnMsg;
    }

    /**
     * Set 状态信息，success：查询成功，fail：查询失败
     * @param ReturnMsg 状态信息，success：查询成功，fail：查询失败
     */
    public void setReturnMsg(String ReturnMsg) {
        this.ReturnMsg = ReturnMsg;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDefenseSwitchResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDefenseSwitchResponse(DescribeDefenseSwitchResponse source) {
        if (source.BasicRuleSwitch != null) {
            this.BasicRuleSwitch = new Long(source.BasicRuleSwitch);
        }
        if (source.BaselineAllSwitch != null) {
            this.BaselineAllSwitch = new Long(source.BaselineAllSwitch);
        }
        if (source.TiSwitch != null) {
            this.TiSwitch = new Long(source.TiSwitch);
        }
        if (source.VirtualPatchSwitch != null) {
            this.VirtualPatchSwitch = new Long(source.VirtualPatchSwitch);
        }
        if (source.HistoryOpen != null) {
            this.HistoryOpen = new Long(source.HistoryOpen);
        }
        if (source.ReturnCode != null) {
            this.ReturnCode = new Long(source.ReturnCode);
        }
        if (source.ReturnMsg != null) {
            this.ReturnMsg = new String(source.ReturnMsg);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BasicRuleSwitch", this.BasicRuleSwitch);
        this.setParamSimple(map, prefix + "BaselineAllSwitch", this.BaselineAllSwitch);
        this.setParamSimple(map, prefix + "TiSwitch", this.TiSwitch);
        this.setParamSimple(map, prefix + "VirtualPatchSwitch", this.VirtualPatchSwitch);
        this.setParamSimple(map, prefix + "HistoryOpen", this.HistoryOpen);
        this.setParamSimple(map, prefix + "ReturnCode", this.ReturnCode);
        this.setParamSimple(map, prefix + "ReturnMsg", this.ReturnMsg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

