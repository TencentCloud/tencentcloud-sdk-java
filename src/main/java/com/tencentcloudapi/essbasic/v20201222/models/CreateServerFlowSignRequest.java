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
package com.tencentcloudapi.essbasic.v20201222.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateServerFlowSignRequest extends AbstractModel{

    /**
    * 调用方信息
    */
    @SerializedName("Caller")
    @Expose
    private Caller Caller;

    /**
    * 流程ID
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 签署区域信息
    */
    @SerializedName("SignComponents")
    @Expose
    private Component [] SignComponents;

    /**
    * 客户端IP
    */
    @SerializedName("SourceIp")
    @Expose
    private String SourceIp;

    /**
     * Get 调用方信息 
     * @return Caller 调用方信息
     */
    public Caller getCaller() {
        return this.Caller;
    }

    /**
     * Set 调用方信息
     * @param Caller 调用方信息
     */
    public void setCaller(Caller Caller) {
        this.Caller = Caller;
    }

    /**
     * Get 流程ID 
     * @return FlowId 流程ID
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 流程ID
     * @param FlowId 流程ID
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 签署区域信息 
     * @return SignComponents 签署区域信息
     */
    public Component [] getSignComponents() {
        return this.SignComponents;
    }

    /**
     * Set 签署区域信息
     * @param SignComponents 签署区域信息
     */
    public void setSignComponents(Component [] SignComponents) {
        this.SignComponents = SignComponents;
    }

    /**
     * Get 客户端IP 
     * @return SourceIp 客户端IP
     */
    public String getSourceIp() {
        return this.SourceIp;
    }

    /**
     * Set 客户端IP
     * @param SourceIp 客户端IP
     */
    public void setSourceIp(String SourceIp) {
        this.SourceIp = SourceIp;
    }

    public CreateServerFlowSignRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateServerFlowSignRequest(CreateServerFlowSignRequest source) {
        if (source.Caller != null) {
            this.Caller = new Caller(source.Caller);
        }
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.SignComponents != null) {
            this.SignComponents = new Component[source.SignComponents.length];
            for (int i = 0; i < source.SignComponents.length; i++) {
                this.SignComponents[i] = new Component(source.SignComponents[i]);
            }
        }
        if (source.SourceIp != null) {
            this.SourceIp = new String(source.SourceIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Caller.", this.Caller);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamArrayObj(map, prefix + "SignComponents.", this.SignComponents);
        this.setParamSimple(map, prefix + "SourceIp", this.SourceIp);

    }
}

