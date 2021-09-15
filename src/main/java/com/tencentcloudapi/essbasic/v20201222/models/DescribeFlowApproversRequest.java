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

public class DescribeFlowApproversRequest extends AbstractModel{

    /**
    * 调用方信息
    */
    @SerializedName("Caller")
    @Expose
    private Caller Caller;

    /**
    * 需要查询的流程ID
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 需要查询的用户ID，为空则默认查询所有用户信息
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 需要查询的签署ID，为空则不按签署ID过滤
    */
    @SerializedName("SignId")
    @Expose
    private String SignId;

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
     * Get 需要查询的流程ID 
     * @return FlowId 需要查询的流程ID
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 需要查询的流程ID
     * @param FlowId 需要查询的流程ID
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 需要查询的用户ID，为空则默认查询所有用户信息 
     * @return UserId 需要查询的用户ID，为空则默认查询所有用户信息
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 需要查询的用户ID，为空则默认查询所有用户信息
     * @param UserId 需要查询的用户ID，为空则默认查询所有用户信息
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 需要查询的签署ID，为空则不按签署ID过滤 
     * @return SignId 需要查询的签署ID，为空则不按签署ID过滤
     */
    public String getSignId() {
        return this.SignId;
    }

    /**
     * Set 需要查询的签署ID，为空则不按签署ID过滤
     * @param SignId 需要查询的签署ID，为空则不按签署ID过滤
     */
    public void setSignId(String SignId) {
        this.SignId = SignId;
    }

    public DescribeFlowApproversRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFlowApproversRequest(DescribeFlowApproversRequest source) {
        if (source.Caller != null) {
            this.Caller = new Caller(source.Caller);
        }
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.SignId != null) {
            this.SignId = new String(source.SignId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Caller.", this.Caller);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "SignId", this.SignId);

    }
}

