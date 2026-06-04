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

public class DescribeNatCcnFwSwitchResponse extends AbstractModel {

    /**
    * <p>开关接入模式，1-自动接入，2-手动接入</p><p>枚举值：</p><ul><li>1： 自动接入</li><li>2： 手动接入</li></ul>
    */
    @SerializedName("SwitchMode")
    @Expose
    private Long SwitchMode;

    /**
    * <p>引流路由方法，0-多路由表，1-策略路由</p><p>枚举值：</p><ul><li>0： 多路由表</li><li>1： 策略路由</li></ul>
    */
    @SerializedName("RoutingMode")
    @Expose
    private Long RoutingMode;

    /**
    * <p>Bypass状态，0-关闭，1-开启</p><p>枚举值：</p><ul><li>0： 关闭</li><li>1： 开启</li></ul>
    */
    @SerializedName("Bypass")
    @Expose
    private Long Bypass;

    /**
    * <p>云联网实例ID</p>
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * <p>接入的实例列表</p>
    */
    @SerializedName("AccessInstanceList")
    @Expose
    private AccessInstanceInfo [] AccessInstanceList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>开关接入模式，1-自动接入，2-手动接入</p><p>枚举值：</p><ul><li>1： 自动接入</li><li>2： 手动接入</li></ul> 
     * @return SwitchMode <p>开关接入模式，1-自动接入，2-手动接入</p><p>枚举值：</p><ul><li>1： 自动接入</li><li>2： 手动接入</li></ul>
     */
    public Long getSwitchMode() {
        return this.SwitchMode;
    }

    /**
     * Set <p>开关接入模式，1-自动接入，2-手动接入</p><p>枚举值：</p><ul><li>1： 自动接入</li><li>2： 手动接入</li></ul>
     * @param SwitchMode <p>开关接入模式，1-自动接入，2-手动接入</p><p>枚举值：</p><ul><li>1： 自动接入</li><li>2： 手动接入</li></ul>
     */
    public void setSwitchMode(Long SwitchMode) {
        this.SwitchMode = SwitchMode;
    }

    /**
     * Get <p>引流路由方法，0-多路由表，1-策略路由</p><p>枚举值：</p><ul><li>0： 多路由表</li><li>1： 策略路由</li></ul> 
     * @return RoutingMode <p>引流路由方法，0-多路由表，1-策略路由</p><p>枚举值：</p><ul><li>0： 多路由表</li><li>1： 策略路由</li></ul>
     */
    public Long getRoutingMode() {
        return this.RoutingMode;
    }

    /**
     * Set <p>引流路由方法，0-多路由表，1-策略路由</p><p>枚举值：</p><ul><li>0： 多路由表</li><li>1： 策略路由</li></ul>
     * @param RoutingMode <p>引流路由方法，0-多路由表，1-策略路由</p><p>枚举值：</p><ul><li>0： 多路由表</li><li>1： 策略路由</li></ul>
     */
    public void setRoutingMode(Long RoutingMode) {
        this.RoutingMode = RoutingMode;
    }

    /**
     * Get <p>Bypass状态，0-关闭，1-开启</p><p>枚举值：</p><ul><li>0： 关闭</li><li>1： 开启</li></ul> 
     * @return Bypass <p>Bypass状态，0-关闭，1-开启</p><p>枚举值：</p><ul><li>0： 关闭</li><li>1： 开启</li></ul>
     */
    public Long getBypass() {
        return this.Bypass;
    }

    /**
     * Set <p>Bypass状态，0-关闭，1-开启</p><p>枚举值：</p><ul><li>0： 关闭</li><li>1： 开启</li></ul>
     * @param Bypass <p>Bypass状态，0-关闭，1-开启</p><p>枚举值：</p><ul><li>0： 关闭</li><li>1： 开启</li></ul>
     */
    public void setBypass(Long Bypass) {
        this.Bypass = Bypass;
    }

    /**
     * Get <p>云联网实例ID</p> 
     * @return CcnId <p>云联网实例ID</p>
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set <p>云联网实例ID</p>
     * @param CcnId <p>云联网实例ID</p>
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get <p>接入的实例列表</p> 
     * @return AccessInstanceList <p>接入的实例列表</p>
     */
    public AccessInstanceInfo [] getAccessInstanceList() {
        return this.AccessInstanceList;
    }

    /**
     * Set <p>接入的实例列表</p>
     * @param AccessInstanceList <p>接入的实例列表</p>
     */
    public void setAccessInstanceList(AccessInstanceInfo [] AccessInstanceList) {
        this.AccessInstanceList = AccessInstanceList;
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

    public DescribeNatCcnFwSwitchResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNatCcnFwSwitchResponse(DescribeNatCcnFwSwitchResponse source) {
        if (source.SwitchMode != null) {
            this.SwitchMode = new Long(source.SwitchMode);
        }
        if (source.RoutingMode != null) {
            this.RoutingMode = new Long(source.RoutingMode);
        }
        if (source.Bypass != null) {
            this.Bypass = new Long(source.Bypass);
        }
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
        if (source.AccessInstanceList != null) {
            this.AccessInstanceList = new AccessInstanceInfo[source.AccessInstanceList.length];
            for (int i = 0; i < source.AccessInstanceList.length; i++) {
                this.AccessInstanceList[i] = new AccessInstanceInfo(source.AccessInstanceList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SwitchMode", this.SwitchMode);
        this.setParamSimple(map, prefix + "RoutingMode", this.RoutingMode);
        this.setParamSimple(map, prefix + "Bypass", this.Bypass);
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamArrayObj(map, prefix + "AccessInstanceList.", this.AccessInstanceList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

