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
package com.tencentcloudapi.bmlb.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DevicesBindInfoLoadBalancer extends AbstractModel{

    /**
    * 负载均衡实例ID。
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 开发商AppId。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 负载均衡所属的项目ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 黑石私有网络唯一ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 负载均衡的IP地址。
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 负载均衡对应的TGW集群类别，取值为tunnel或fullnat。tunnel表示隧道集群，fullnat表示FULLNAT集群。
    */
    @SerializedName("TgwSetType")
    @Expose
    private String TgwSetType;

    /**
    * 是否独占TGW集群。
    */
    @SerializedName("Exclusive")
    @Expose
    private Long Exclusive;

    /**
    * 具有该绑定关系的四层监听器列表。
    */
    @SerializedName("L4ListenerSet")
    @Expose
    private DevicesBindInfoL4Listener [] L4ListenerSet;

    /**
    * 具有该绑定关系的七层监听器列表。
    */
    @SerializedName("L7ListenerSet")
    @Expose
    private DevicesBindInfoL7Listener [] L7ListenerSet;

    /**
     * Get 负载均衡实例ID。 
     * @return LoadBalancerId 负载均衡实例ID。
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡实例ID。
     * @param LoadBalancerId 负载均衡实例ID。
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 开发商AppId。 
     * @return AppId 开发商AppId。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 开发商AppId。
     * @param AppId 开发商AppId。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 负载均衡所属的项目ID。 
     * @return ProjectId 负载均衡所属的项目ID。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 负载均衡所属的项目ID。
     * @param ProjectId 负载均衡所属的项目ID。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 黑石私有网络唯一ID。 
     * @return VpcId 黑石私有网络唯一ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 黑石私有网络唯一ID。
     * @param VpcId 黑石私有网络唯一ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 负载均衡的IP地址。 
     * @return Vip 负载均衡的IP地址。
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 负载均衡的IP地址。
     * @param Vip 负载均衡的IP地址。
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 负载均衡对应的TGW集群类别，取值为tunnel或fullnat。tunnel表示隧道集群，fullnat表示FULLNAT集群。 
     * @return TgwSetType 负载均衡对应的TGW集群类别，取值为tunnel或fullnat。tunnel表示隧道集群，fullnat表示FULLNAT集群。
     */
    public String getTgwSetType() {
        return this.TgwSetType;
    }

    /**
     * Set 负载均衡对应的TGW集群类别，取值为tunnel或fullnat。tunnel表示隧道集群，fullnat表示FULLNAT集群。
     * @param TgwSetType 负载均衡对应的TGW集群类别，取值为tunnel或fullnat。tunnel表示隧道集群，fullnat表示FULLNAT集群。
     */
    public void setTgwSetType(String TgwSetType) {
        this.TgwSetType = TgwSetType;
    }

    /**
     * Get 是否独占TGW集群。 
     * @return Exclusive 是否独占TGW集群。
     */
    public Long getExclusive() {
        return this.Exclusive;
    }

    /**
     * Set 是否独占TGW集群。
     * @param Exclusive 是否独占TGW集群。
     */
    public void setExclusive(Long Exclusive) {
        this.Exclusive = Exclusive;
    }

    /**
     * Get 具有该绑定关系的四层监听器列表。 
     * @return L4ListenerSet 具有该绑定关系的四层监听器列表。
     */
    public DevicesBindInfoL4Listener [] getL4ListenerSet() {
        return this.L4ListenerSet;
    }

    /**
     * Set 具有该绑定关系的四层监听器列表。
     * @param L4ListenerSet 具有该绑定关系的四层监听器列表。
     */
    public void setL4ListenerSet(DevicesBindInfoL4Listener [] L4ListenerSet) {
        this.L4ListenerSet = L4ListenerSet;
    }

    /**
     * Get 具有该绑定关系的七层监听器列表。 
     * @return L7ListenerSet 具有该绑定关系的七层监听器列表。
     */
    public DevicesBindInfoL7Listener [] getL7ListenerSet() {
        return this.L7ListenerSet;
    }

    /**
     * Set 具有该绑定关系的七层监听器列表。
     * @param L7ListenerSet 具有该绑定关系的七层监听器列表。
     */
    public void setL7ListenerSet(DevicesBindInfoL7Listener [] L7ListenerSet) {
        this.L7ListenerSet = L7ListenerSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "TgwSetType", this.TgwSetType);
        this.setParamSimple(map, prefix + "Exclusive", this.Exclusive);
        this.setParamArrayObj(map, prefix + "L4ListenerSet.", this.L4ListenerSet);
        this.setParamArrayObj(map, prefix + "L7ListenerSet.", this.L7ListenerSet);

    }
}

