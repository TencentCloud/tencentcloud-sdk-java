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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAgentRunPolicyRequest extends AbstractModel {

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>自定义运行策略（CPU/Memory/NetworkPps），不传则不修改</p>
    */
    @SerializedName("CustomPolicy")
    @Expose
    private CustomAgentRunModePolicy CustomPolicy;

    /**
    * <p>高级模式机器instance_id列表，后台自动转为quuid存储</p>
    */
    @SerializedName("AdvanceModeInstanceIDs")
    @Expose
    private String [] AdvanceModeInstanceIDs;

    /**
    * <p>自定义模式机器instance_id列表，后台自动转为quuid存储</p>
    */
    @SerializedName("CustomModeInstanceIDs")
    @Expose
    private String [] CustomModeInstanceIDs;

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>自定义运行策略（CPU/Memory/NetworkPps），不传则不修改</p> 
     * @return CustomPolicy <p>自定义运行策略（CPU/Memory/NetworkPps），不传则不修改</p>
     */
    public CustomAgentRunModePolicy getCustomPolicy() {
        return this.CustomPolicy;
    }

    /**
     * Set <p>自定义运行策略（CPU/Memory/NetworkPps），不传则不修改</p>
     * @param CustomPolicy <p>自定义运行策略（CPU/Memory/NetworkPps），不传则不修改</p>
     */
    public void setCustomPolicy(CustomAgentRunModePolicy CustomPolicy) {
        this.CustomPolicy = CustomPolicy;
    }

    /**
     * Get <p>高级模式机器instance_id列表，后台自动转为quuid存储</p> 
     * @return AdvanceModeInstanceIDs <p>高级模式机器instance_id列表，后台自动转为quuid存储</p>
     */
    public String [] getAdvanceModeInstanceIDs() {
        return this.AdvanceModeInstanceIDs;
    }

    /**
     * Set <p>高级模式机器instance_id列表，后台自动转为quuid存储</p>
     * @param AdvanceModeInstanceIDs <p>高级模式机器instance_id列表，后台自动转为quuid存储</p>
     */
    public void setAdvanceModeInstanceIDs(String [] AdvanceModeInstanceIDs) {
        this.AdvanceModeInstanceIDs = AdvanceModeInstanceIDs;
    }

    /**
     * Get <p>自定义模式机器instance_id列表，后台自动转为quuid存储</p> 
     * @return CustomModeInstanceIDs <p>自定义模式机器instance_id列表，后台自动转为quuid存储</p>
     */
    public String [] getCustomModeInstanceIDs() {
        return this.CustomModeInstanceIDs;
    }

    /**
     * Set <p>自定义模式机器instance_id列表，后台自动转为quuid存储</p>
     * @param CustomModeInstanceIDs <p>自定义模式机器instance_id列表，后台自动转为quuid存储</p>
     */
    public void setCustomModeInstanceIDs(String [] CustomModeInstanceIDs) {
        this.CustomModeInstanceIDs = CustomModeInstanceIDs;
    }

    public ModifyAgentRunPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAgentRunPolicyRequest(ModifyAgentRunPolicyRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.CustomPolicy != null) {
            this.CustomPolicy = new CustomAgentRunModePolicy(source.CustomPolicy);
        }
        if (source.AdvanceModeInstanceIDs != null) {
            this.AdvanceModeInstanceIDs = new String[source.AdvanceModeInstanceIDs.length];
            for (int i = 0; i < source.AdvanceModeInstanceIDs.length; i++) {
                this.AdvanceModeInstanceIDs[i] = new String(source.AdvanceModeInstanceIDs[i]);
            }
        }
        if (source.CustomModeInstanceIDs != null) {
            this.CustomModeInstanceIDs = new String[source.CustomModeInstanceIDs.length];
            for (int i = 0; i < source.CustomModeInstanceIDs.length; i++) {
                this.CustomModeInstanceIDs[i] = new String(source.CustomModeInstanceIDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamObj(map, prefix + "CustomPolicy.", this.CustomPolicy);
        this.setParamArraySimple(map, prefix + "AdvanceModeInstanceIDs.", this.AdvanceModeInstanceIDs);
        this.setParamArraySimple(map, prefix + "CustomModeInstanceIDs.", this.CustomModeInstanceIDs);

    }
}

