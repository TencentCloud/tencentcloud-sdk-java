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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSecurityPolicyRequest extends AbstractModel{

    /**
    * 默认策略：ACCEPT或DROP
    */
    @SerializedName("DefaultAction")
    @Expose
    private String DefaultAction;

    /**
    * 加速通道ID
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * 通道组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
     * Get 默认策略：ACCEPT或DROP 
     * @return DefaultAction 默认策略：ACCEPT或DROP
     */
    public String getDefaultAction() {
        return this.DefaultAction;
    }

    /**
     * Set 默认策略：ACCEPT或DROP
     * @param DefaultAction 默认策略：ACCEPT或DROP
     */
    public void setDefaultAction(String DefaultAction) {
        this.DefaultAction = DefaultAction;
    }

    /**
     * Get 加速通道ID 
     * @return ProxyId 加速通道ID
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set 加速通道ID
     * @param ProxyId 加速通道ID
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get 通道组ID 
     * @return GroupId 通道组ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 通道组ID
     * @param GroupId 通道组ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    public CreateSecurityPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSecurityPolicyRequest(CreateSecurityPolicyRequest source) {
        if (source.DefaultAction != null) {
            this.DefaultAction = new String(source.DefaultAction);
        }
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DefaultAction", this.DefaultAction);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);

    }
}

