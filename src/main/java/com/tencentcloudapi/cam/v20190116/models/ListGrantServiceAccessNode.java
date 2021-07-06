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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListGrantServiceAccessNode extends AbstractModel{

    /**
    * 服务
    */
    @SerializedName("Service")
    @Expose
    private ListGrantServiceAccessService Service;

    /**
    * 接口信息
    */
    @SerializedName("Action")
    @Expose
    private ListGrantServiceAccessActionNode [] Action;

    /**
    * 授权的策略
    */
    @SerializedName("Policy")
    @Expose
    private ListGrantServiceAccessPolicy [] Policy;

    /**
     * Get 服务 
     * @return Service 服务
     */
    public ListGrantServiceAccessService getService() {
        return this.Service;
    }

    /**
     * Set 服务
     * @param Service 服务
     */
    public void setService(ListGrantServiceAccessService Service) {
        this.Service = Service;
    }

    /**
     * Get 接口信息 
     * @return Action 接口信息
     */
    public ListGrantServiceAccessActionNode [] getAction() {
        return this.Action;
    }

    /**
     * Set 接口信息
     * @param Action 接口信息
     */
    public void setAction(ListGrantServiceAccessActionNode [] Action) {
        this.Action = Action;
    }

    /**
     * Get 授权的策略 
     * @return Policy 授权的策略
     */
    public ListGrantServiceAccessPolicy [] getPolicy() {
        return this.Policy;
    }

    /**
     * Set 授权的策略
     * @param Policy 授权的策略
     */
    public void setPolicy(ListGrantServiceAccessPolicy [] Policy) {
        this.Policy = Policy;
    }

    public ListGrantServiceAccessNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListGrantServiceAccessNode(ListGrantServiceAccessNode source) {
        if (source.Service != null) {
            this.Service = new ListGrantServiceAccessService(source.Service);
        }
        if (source.Action != null) {
            this.Action = new ListGrantServiceAccessActionNode[source.Action.length];
            for (int i = 0; i < source.Action.length; i++) {
                this.Action[i] = new ListGrantServiceAccessActionNode(source.Action[i]);
            }
        }
        if (source.Policy != null) {
            this.Policy = new ListGrantServiceAccessPolicy[source.Policy.length];
            for (int i = 0; i < source.Policy.length; i++) {
                this.Policy[i] = new ListGrantServiceAccessPolicy(source.Policy[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Service.", this.Service);
        this.setParamArrayObj(map, prefix + "Action.", this.Action);
        this.setParamArrayObj(map, prefix + "Policy.", this.Policy);

    }
}

