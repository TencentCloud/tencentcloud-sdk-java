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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DDosPolicy extends AbstractModel{

    /**
    * 策略绑定的资源
    */
    @SerializedName("Resources")
    @Expose
    private ResourceIp [] Resources;

    /**
    * 禁用协议
    */
    @SerializedName("DropOptions")
    @Expose
    private DDoSPolicyDropOption DropOptions;

    /**
    * 禁用端口
    */
    @SerializedName("PortLimits")
    @Expose
    private DDoSPolicyPortLimit [] PortLimits;

    /**
    * 报文过滤
    */
    @SerializedName("PacketFilters")
    @Expose
    private DDoSPolicyPacketFilter [] PacketFilters;

    /**
    * 黑白IP名单
    */
    @SerializedName("IpBlackWhiteLists")
    @Expose
    private IpBlackWhite [] IpBlackWhiteLists;

    /**
    * 策略ID
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * 策略名称
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * 策略创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 水印策略参数，最多只有一个，当没有水印策略时数组为空
    */
    @SerializedName("WaterPrint")
    @Expose
    private WaterPrintPolicy [] WaterPrint;

    /**
    * 水印密钥，最多只有2个，当没有水印策略时数组为空
    */
    @SerializedName("WaterKey")
    @Expose
    private WaterPrintKey [] WaterKey;

    /**
    * 策略绑定的资源实例
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BoundResources")
    @Expose
    private String [] BoundResources;

    /**
    * 策略所属的策略场景
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SceneId")
    @Expose
    private String SceneId;

    /**
     * Get 策略绑定的资源 
     * @return Resources 策略绑定的资源
     */
    public ResourceIp [] getResources() {
        return this.Resources;
    }

    /**
     * Set 策略绑定的资源
     * @param Resources 策略绑定的资源
     */
    public void setResources(ResourceIp [] Resources) {
        this.Resources = Resources;
    }

    /**
     * Get 禁用协议 
     * @return DropOptions 禁用协议
     */
    public DDoSPolicyDropOption getDropOptions() {
        return this.DropOptions;
    }

    /**
     * Set 禁用协议
     * @param DropOptions 禁用协议
     */
    public void setDropOptions(DDoSPolicyDropOption DropOptions) {
        this.DropOptions = DropOptions;
    }

    /**
     * Get 禁用端口 
     * @return PortLimits 禁用端口
     */
    public DDoSPolicyPortLimit [] getPortLimits() {
        return this.PortLimits;
    }

    /**
     * Set 禁用端口
     * @param PortLimits 禁用端口
     */
    public void setPortLimits(DDoSPolicyPortLimit [] PortLimits) {
        this.PortLimits = PortLimits;
    }

    /**
     * Get 报文过滤 
     * @return PacketFilters 报文过滤
     */
    public DDoSPolicyPacketFilter [] getPacketFilters() {
        return this.PacketFilters;
    }

    /**
     * Set 报文过滤
     * @param PacketFilters 报文过滤
     */
    public void setPacketFilters(DDoSPolicyPacketFilter [] PacketFilters) {
        this.PacketFilters = PacketFilters;
    }

    /**
     * Get 黑白IP名单 
     * @return IpBlackWhiteLists 黑白IP名单
     */
    public IpBlackWhite [] getIpBlackWhiteLists() {
        return this.IpBlackWhiteLists;
    }

    /**
     * Set 黑白IP名单
     * @param IpBlackWhiteLists 黑白IP名单
     */
    public void setIpBlackWhiteLists(IpBlackWhite [] IpBlackWhiteLists) {
        this.IpBlackWhiteLists = IpBlackWhiteLists;
    }

    /**
     * Get 策略ID 
     * @return PolicyId 策略ID
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 策略ID
     * @param PolicyId 策略ID
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 策略名称 
     * @return PolicyName 策略名称
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set 策略名称
     * @param PolicyName 策略名称
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get 策略创建时间 
     * @return CreateTime 策略创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 策略创建时间
     * @param CreateTime 策略创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 水印策略参数，最多只有一个，当没有水印策略时数组为空 
     * @return WaterPrint 水印策略参数，最多只有一个，当没有水印策略时数组为空
     */
    public WaterPrintPolicy [] getWaterPrint() {
        return this.WaterPrint;
    }

    /**
     * Set 水印策略参数，最多只有一个，当没有水印策略时数组为空
     * @param WaterPrint 水印策略参数，最多只有一个，当没有水印策略时数组为空
     */
    public void setWaterPrint(WaterPrintPolicy [] WaterPrint) {
        this.WaterPrint = WaterPrint;
    }

    /**
     * Get 水印密钥，最多只有2个，当没有水印策略时数组为空 
     * @return WaterKey 水印密钥，最多只有2个，当没有水印策略时数组为空
     */
    public WaterPrintKey [] getWaterKey() {
        return this.WaterKey;
    }

    /**
     * Set 水印密钥，最多只有2个，当没有水印策略时数组为空
     * @param WaterKey 水印密钥，最多只有2个，当没有水印策略时数组为空
     */
    public void setWaterKey(WaterPrintKey [] WaterKey) {
        this.WaterKey = WaterKey;
    }

    /**
     * Get 策略绑定的资源实例
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BoundResources 策略绑定的资源实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getBoundResources() {
        return this.BoundResources;
    }

    /**
     * Set 策略绑定的资源实例
注意：此字段可能返回 null，表示取不到有效值。
     * @param BoundResources 策略绑定的资源实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBoundResources(String [] BoundResources) {
        this.BoundResources = BoundResources;
    }

    /**
     * Get 策略所属的策略场景
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SceneId 策略所属的策略场景
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSceneId() {
        return this.SceneId;
    }

    /**
     * Set 策略所属的策略场景
注意：此字段可能返回 null，表示取不到有效值。
     * @param SceneId 策略所属的策略场景
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSceneId(String SceneId) {
        this.SceneId = SceneId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Resources.", this.Resources);
        this.setParamObj(map, prefix + "DropOptions.", this.DropOptions);
        this.setParamArrayObj(map, prefix + "PortLimits.", this.PortLimits);
        this.setParamArrayObj(map, prefix + "PacketFilters.", this.PacketFilters);
        this.setParamArrayObj(map, prefix + "IpBlackWhiteLists.", this.IpBlackWhiteLists);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "WaterPrint.", this.WaterPrint);
        this.setParamArrayObj(map, prefix + "WaterKey.", this.WaterKey);
        this.setParamArraySimple(map, prefix + "BoundResources.", this.BoundResources);
        this.setParamSimple(map, prefix + "SceneId", this.SceneId);

    }
}

