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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCarrierPrivilegeNumberApplicantRequest extends AbstractModel{

    /**
    * SdkAppId
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 主叫号码，必须为实例中存在的号码，格式为0086xxxx（暂时只支持国内号码）
    */
    @SerializedName("Callers")
    @Expose
    private String [] Callers;

    /**
    * 被叫号码，必须为实例中坐席绑定的手机号码，格式为0086xxxx（暂时只支持国内号码）
    */
    @SerializedName("Callees")
    @Expose
    private String [] Callees;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get SdkAppId 
     * @return SdkAppId SdkAppId
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set SdkAppId
     * @param SdkAppId SdkAppId
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 主叫号码，必须为实例中存在的号码，格式为0086xxxx（暂时只支持国内号码） 
     * @return Callers 主叫号码，必须为实例中存在的号码，格式为0086xxxx（暂时只支持国内号码）
     */
    public String [] getCallers() {
        return this.Callers;
    }

    /**
     * Set 主叫号码，必须为实例中存在的号码，格式为0086xxxx（暂时只支持国内号码）
     * @param Callers 主叫号码，必须为实例中存在的号码，格式为0086xxxx（暂时只支持国内号码）
     */
    public void setCallers(String [] Callers) {
        this.Callers = Callers;
    }

    /**
     * Get 被叫号码，必须为实例中坐席绑定的手机号码，格式为0086xxxx（暂时只支持国内号码） 
     * @return Callees 被叫号码，必须为实例中坐席绑定的手机号码，格式为0086xxxx（暂时只支持国内号码）
     */
    public String [] getCallees() {
        return this.Callees;
    }

    /**
     * Set 被叫号码，必须为实例中坐席绑定的手机号码，格式为0086xxxx（暂时只支持国内号码）
     * @param Callees 被叫号码，必须为实例中坐席绑定的手机号码，格式为0086xxxx（暂时只支持国内号码）
     */
    public void setCallees(String [] Callees) {
        this.Callees = Callees;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateCarrierPrivilegeNumberApplicantRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCarrierPrivilegeNumberApplicantRequest(CreateCarrierPrivilegeNumberApplicantRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.Callers != null) {
            this.Callers = new String[source.Callers.length];
            for (int i = 0; i < source.Callers.length; i++) {
                this.Callers[i] = new String(source.Callers[i]);
            }
        }
        if (source.Callees != null) {
            this.Callees = new String[source.Callees.length];
            for (int i = 0; i < source.Callees.length; i++) {
                this.Callees[i] = new String(source.Callees[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamArraySimple(map, prefix + "Callers.", this.Callers);
        this.setParamArraySimple(map, prefix + "Callees.", this.Callees);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

