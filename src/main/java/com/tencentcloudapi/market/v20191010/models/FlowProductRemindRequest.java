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
package com.tencentcloudapi.market.v20191010.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowProductRemindRequest extends AbstractModel{

    /**
    * 服务商uin
    */
    @SerializedName("ProviderUin")
    @Expose
    private String ProviderUin;

    /**
    * 服务商实例ID
    */
    @SerializedName("SignId")
    @Expose
    private String SignId;

    /**
    * 云市场实例ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 实例总流量
    */
    @SerializedName("TotalFlow")
    @Expose
    private String TotalFlow;

    /**
    * 剩余流量
    */
    @SerializedName("LeftFlow")
    @Expose
    private String LeftFlow;

    /**
    * 流量单位
    */
    @SerializedName("FlowUnit")
    @Expose
    private String FlowUnit;

    /**
     * Get 服务商uin 
     * @return ProviderUin 服务商uin
     */
    public String getProviderUin() {
        return this.ProviderUin;
    }

    /**
     * Set 服务商uin
     * @param ProviderUin 服务商uin
     */
    public void setProviderUin(String ProviderUin) {
        this.ProviderUin = ProviderUin;
    }

    /**
     * Get 服务商实例ID 
     * @return SignId 服务商实例ID
     */
    public String getSignId() {
        return this.SignId;
    }

    /**
     * Set 服务商实例ID
     * @param SignId 服务商实例ID
     */
    public void setSignId(String SignId) {
        this.SignId = SignId;
    }

    /**
     * Get 云市场实例ID 
     * @return ResourceId 云市场实例ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 云市场实例ID
     * @param ResourceId 云市场实例ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 实例总流量 
     * @return TotalFlow 实例总流量
     */
    public String getTotalFlow() {
        return this.TotalFlow;
    }

    /**
     * Set 实例总流量
     * @param TotalFlow 实例总流量
     */
    public void setTotalFlow(String TotalFlow) {
        this.TotalFlow = TotalFlow;
    }

    /**
     * Get 剩余流量 
     * @return LeftFlow 剩余流量
     */
    public String getLeftFlow() {
        return this.LeftFlow;
    }

    /**
     * Set 剩余流量
     * @param LeftFlow 剩余流量
     */
    public void setLeftFlow(String LeftFlow) {
        this.LeftFlow = LeftFlow;
    }

    /**
     * Get 流量单位 
     * @return FlowUnit 流量单位
     */
    public String getFlowUnit() {
        return this.FlowUnit;
    }

    /**
     * Set 流量单位
     * @param FlowUnit 流量单位
     */
    public void setFlowUnit(String FlowUnit) {
        this.FlowUnit = FlowUnit;
    }

    public FlowProductRemindRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowProductRemindRequest(FlowProductRemindRequest source) {
        if (source.ProviderUin != null) {
            this.ProviderUin = new String(source.ProviderUin);
        }
        if (source.SignId != null) {
            this.SignId = new String(source.SignId);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.TotalFlow != null) {
            this.TotalFlow = new String(source.TotalFlow);
        }
        if (source.LeftFlow != null) {
            this.LeftFlow = new String(source.LeftFlow);
        }
        if (source.FlowUnit != null) {
            this.FlowUnit = new String(source.FlowUnit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProviderUin", this.ProviderUin);
        this.setParamSimple(map, prefix + "SignId", this.SignId);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "TotalFlow", this.TotalFlow);
        this.setParamSimple(map, prefix + "LeftFlow", this.LeftFlow);
        this.setParamSimple(map, prefix + "FlowUnit", this.FlowUnit);

    }
}

