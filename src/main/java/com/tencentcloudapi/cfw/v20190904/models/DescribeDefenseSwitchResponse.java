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

public class DescribeDefenseSwitchResponse extends AbstractModel {

    /**
    * <p>基础防御开关</p>
    */
    @SerializedName("BasicRuleSwitch")
    @Expose
    private Long BasicRuleSwitch;

    /**
    * <p>安全基线开关</p>
    */
    @SerializedName("BaselineAllSwitch")
    @Expose
    private Long BaselineAllSwitch;

    /**
    * <p>威胁情报开关</p>
    */
    @SerializedName("TiSwitch")
    @Expose
    private Long TiSwitch;

    /**
    * <p>虚拟补丁开关</p>
    */
    @SerializedName("VirtualPatchSwitch")
    @Expose
    private Long VirtualPatchSwitch;

    /**
    * <p>是否历史开启</p>
    */
    @SerializedName("HistoryOpen")
    @Expose
    private Long HistoryOpen;

    /**
    * <p>状态值，0：查询成功，非0：查询失败</p>
    */
    @SerializedName("ReturnCode")
    @Expose
    private Long ReturnCode;

    /**
    * <p>状态信息，success：查询成功，fail：查询失败</p>
    */
    @SerializedName("ReturnMsg")
    @Expose
    private String ReturnMsg;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>基础防御开关</p> 
     * @return BasicRuleSwitch <p>基础防御开关</p>
     */
    public Long getBasicRuleSwitch() {
        return this.BasicRuleSwitch;
    }

    /**
     * Set <p>基础防御开关</p>
     * @param BasicRuleSwitch <p>基础防御开关</p>
     */
    public void setBasicRuleSwitch(Long BasicRuleSwitch) {
        this.BasicRuleSwitch = BasicRuleSwitch;
    }

    /**
     * Get <p>安全基线开关</p> 
     * @return BaselineAllSwitch <p>安全基线开关</p>
     */
    public Long getBaselineAllSwitch() {
        return this.BaselineAllSwitch;
    }

    /**
     * Set <p>安全基线开关</p>
     * @param BaselineAllSwitch <p>安全基线开关</p>
     */
    public void setBaselineAllSwitch(Long BaselineAllSwitch) {
        this.BaselineAllSwitch = BaselineAllSwitch;
    }

    /**
     * Get <p>威胁情报开关</p> 
     * @return TiSwitch <p>威胁情报开关</p>
     */
    public Long getTiSwitch() {
        return this.TiSwitch;
    }

    /**
     * Set <p>威胁情报开关</p>
     * @param TiSwitch <p>威胁情报开关</p>
     */
    public void setTiSwitch(Long TiSwitch) {
        this.TiSwitch = TiSwitch;
    }

    /**
     * Get <p>虚拟补丁开关</p> 
     * @return VirtualPatchSwitch <p>虚拟补丁开关</p>
     */
    public Long getVirtualPatchSwitch() {
        return this.VirtualPatchSwitch;
    }

    /**
     * Set <p>虚拟补丁开关</p>
     * @param VirtualPatchSwitch <p>虚拟补丁开关</p>
     */
    public void setVirtualPatchSwitch(Long VirtualPatchSwitch) {
        this.VirtualPatchSwitch = VirtualPatchSwitch;
    }

    /**
     * Get <p>是否历史开启</p> 
     * @return HistoryOpen <p>是否历史开启</p>
     */
    public Long getHistoryOpen() {
        return this.HistoryOpen;
    }

    /**
     * Set <p>是否历史开启</p>
     * @param HistoryOpen <p>是否历史开启</p>
     */
    public void setHistoryOpen(Long HistoryOpen) {
        this.HistoryOpen = HistoryOpen;
    }

    /**
     * Get <p>状态值，0：查询成功，非0：查询失败</p> 
     * @return ReturnCode <p>状态值，0：查询成功，非0：查询失败</p>
     */
    public Long getReturnCode() {
        return this.ReturnCode;
    }

    /**
     * Set <p>状态值，0：查询成功，非0：查询失败</p>
     * @param ReturnCode <p>状态值，0：查询成功，非0：查询失败</p>
     */
    public void setReturnCode(Long ReturnCode) {
        this.ReturnCode = ReturnCode;
    }

    /**
     * Get <p>状态信息，success：查询成功，fail：查询失败</p> 
     * @return ReturnMsg <p>状态信息，success：查询成功，fail：查询失败</p>
     */
    public String getReturnMsg() {
        return this.ReturnMsg;
    }

    /**
     * Set <p>状态信息，success：查询成功，fail：查询失败</p>
     * @param ReturnMsg <p>状态信息，success：查询成功，fail：查询失败</p>
     */
    public void setReturnMsg(String ReturnMsg) {
        this.ReturnMsg = ReturnMsg;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
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

