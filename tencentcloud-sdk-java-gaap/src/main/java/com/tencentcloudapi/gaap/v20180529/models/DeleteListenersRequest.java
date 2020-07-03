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

public class DeleteListenersRequest extends AbstractModel{

    /**
    * 待删除的监听器ID列表
    */
    @SerializedName("ListenerIds")
    @Expose
    private String [] ListenerIds;

    /**
    * 已绑定源站的监听器是否允许强制删除，1：允许， 0：不允许
    */
    @SerializedName("Force")
    @Expose
    private Long Force;

    /**
    * 通道组ID，该参数和GroupId必须设置一个，但不能同时设置。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 通道ID，该参数和GroupId必须设置一个，但不能同时设置。
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
     * Get 待删除的监听器ID列表 
     * @return ListenerIds 待删除的监听器ID列表
     */
    public String [] getListenerIds() {
        return this.ListenerIds;
    }

    /**
     * Set 待删除的监听器ID列表
     * @param ListenerIds 待删除的监听器ID列表
     */
    public void setListenerIds(String [] ListenerIds) {
        this.ListenerIds = ListenerIds;
    }

    /**
     * Get 已绑定源站的监听器是否允许强制删除，1：允许， 0：不允许 
     * @return Force 已绑定源站的监听器是否允许强制删除，1：允许， 0：不允许
     */
    public Long getForce() {
        return this.Force;
    }

    /**
     * Set 已绑定源站的监听器是否允许强制删除，1：允许， 0：不允许
     * @param Force 已绑定源站的监听器是否允许强制删除，1：允许， 0：不允许
     */
    public void setForce(Long Force) {
        this.Force = Force;
    }

    /**
     * Get 通道组ID，该参数和GroupId必须设置一个，但不能同时设置。 
     * @return GroupId 通道组ID，该参数和GroupId必须设置一个，但不能同时设置。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 通道组ID，该参数和GroupId必须设置一个，但不能同时设置。
     * @param GroupId 通道组ID，该参数和GroupId必须设置一个，但不能同时设置。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 通道ID，该参数和GroupId必须设置一个，但不能同时设置。 
     * @return ProxyId 通道ID，该参数和GroupId必须设置一个，但不能同时设置。
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set 通道ID，该参数和GroupId必须设置一个，但不能同时设置。
     * @param ProxyId 通道ID，该参数和GroupId必须设置一个，但不能同时设置。
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ListenerIds.", this.ListenerIds);
        this.setParamSimple(map, prefix + "Force", this.Force);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);

    }
}

