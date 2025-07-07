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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateIVRSessionRequest extends AbstractModel {

    /**
    * 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 被叫
    */
    @SerializedName("Callee")
    @Expose
    private String Callee;

    /**
    * 指定的 IVR Id，目前支持呼入和自动外呼两种类型
    */
    @SerializedName("IVRId")
    @Expose
    private Long IVRId;

    /**
    * 主叫号码列表
    */
    @SerializedName("Callers")
    @Expose
    private String [] Callers;

    /**
    * 自定义变量
    */
    @SerializedName("Variables")
    @Expose
    private Variable [] Variables;

    /**
    * 用户数据
    */
    @SerializedName("UUI")
    @Expose
    private String UUI;

    /**
     * Get 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc 
     * @return SdkAppId 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
     * @param SdkAppId 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 被叫 
     * @return Callee 被叫
     */
    public String getCallee() {
        return this.Callee;
    }

    /**
     * Set 被叫
     * @param Callee 被叫
     */
    public void setCallee(String Callee) {
        this.Callee = Callee;
    }

    /**
     * Get 指定的 IVR Id，目前支持呼入和自动外呼两种类型 
     * @return IVRId 指定的 IVR Id，目前支持呼入和自动外呼两种类型
     */
    public Long getIVRId() {
        return this.IVRId;
    }

    /**
     * Set 指定的 IVR Id，目前支持呼入和自动外呼两种类型
     * @param IVRId 指定的 IVR Id，目前支持呼入和自动外呼两种类型
     */
    public void setIVRId(Long IVRId) {
        this.IVRId = IVRId;
    }

    /**
     * Get 主叫号码列表 
     * @return Callers 主叫号码列表
     */
    public String [] getCallers() {
        return this.Callers;
    }

    /**
     * Set 主叫号码列表
     * @param Callers 主叫号码列表
     */
    public void setCallers(String [] Callers) {
        this.Callers = Callers;
    }

    /**
     * Get 自定义变量 
     * @return Variables 自定义变量
     */
    public Variable [] getVariables() {
        return this.Variables;
    }

    /**
     * Set 自定义变量
     * @param Variables 自定义变量
     */
    public void setVariables(Variable [] Variables) {
        this.Variables = Variables;
    }

    /**
     * Get 用户数据 
     * @return UUI 用户数据
     */
    public String getUUI() {
        return this.UUI;
    }

    /**
     * Set 用户数据
     * @param UUI 用户数据
     */
    public void setUUI(String UUI) {
        this.UUI = UUI;
    }

    public CreateIVRSessionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateIVRSessionRequest(CreateIVRSessionRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.Callee != null) {
            this.Callee = new String(source.Callee);
        }
        if (source.IVRId != null) {
            this.IVRId = new Long(source.IVRId);
        }
        if (source.Callers != null) {
            this.Callers = new String[source.Callers.length];
            for (int i = 0; i < source.Callers.length; i++) {
                this.Callers[i] = new String(source.Callers[i]);
            }
        }
        if (source.Variables != null) {
            this.Variables = new Variable[source.Variables.length];
            for (int i = 0; i < source.Variables.length; i++) {
                this.Variables[i] = new Variable(source.Variables[i]);
            }
        }
        if (source.UUI != null) {
            this.UUI = new String(source.UUI);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "Callee", this.Callee);
        this.setParamSimple(map, prefix + "IVRId", this.IVRId);
        this.setParamArraySimple(map, prefix + "Callers.", this.Callers);
        this.setParamArrayObj(map, prefix + "Variables.", this.Variables);
        this.setParamSimple(map, prefix + "UUI", this.UUI);

    }
}

