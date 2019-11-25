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

public class CCEventRecord  extends AbstractModel{

    /**
    * 大禹子产品代号（shield表示棋牌；bgpip表示高防IP；bgp表示高防包；bgp-multip表示多ip高防包；net表示高防IP专业版；basic表示DDos基础防护）
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * 资源ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 资源的IP
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 攻击开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 攻击结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 总请求QPS峰值
    */
    @SerializedName("ReqQps")
    @Expose
    private Long ReqQps;

    /**
    * 攻击QPS峰值
    */
    @SerializedName("DropQps")
    @Expose
    private Long DropQps;

    /**
    * 攻击状态，取值[0（攻击中）, 1（攻击结束）]
    */
    @SerializedName("AttackStatus")
    @Expose
    private Long AttackStatus;

    /**
    * 资源名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * 域名列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DomainList")
    @Expose
    private String DomainList;

    /**
    * uri列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UriList")
    @Expose
    private String UriList;

    /**
    * 攻击源列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttackipList")
    @Expose
    private String AttackipList;

    /**
     * 获取大禹子产品代号（shield表示棋牌；bgpip表示高防IP；bgp表示高防包；bgp-multip表示多ip高防包；net表示高防IP专业版；basic表示DDos基础防护）
     * @return Business 大禹子产品代号（shield表示棋牌；bgpip表示高防IP；bgp表示高防包；bgp-multip表示多ip高防包；net表示高防IP专业版；basic表示DDos基础防护）
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * 设置大禹子产品代号（shield表示棋牌；bgpip表示高防IP；bgp表示高防包；bgp-multip表示多ip高防包；net表示高防IP专业版；basic表示DDos基础防护）
     * @param Business 大禹子产品代号（shield表示棋牌；bgpip表示高防IP；bgp表示高防包；bgp-multip表示多ip高防包；net表示高防IP专业版；basic表示DDos基础防护）
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * 获取资源ID
     * @return Id 资源ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * 设置资源ID
     * @param Id 资源ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * 获取资源的IP
     * @return Vip 资源的IP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * 设置资源的IP
     * @param Vip 资源的IP
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * 获取攻击开始时间
     * @return StartTime 攻击开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * 设置攻击开始时间
     * @param StartTime 攻击开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * 获取攻击结束时间
     * @return EndTime 攻击结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * 设置攻击结束时间
     * @param EndTime 攻击结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * 获取总请求QPS峰值
     * @return ReqQps 总请求QPS峰值
     */
    public Long getReqQps() {
        return this.ReqQps;
    }

    /**
     * 设置总请求QPS峰值
     * @param ReqQps 总请求QPS峰值
     */
    public void setReqQps(Long ReqQps) {
        this.ReqQps = ReqQps;
    }

    /**
     * 获取攻击QPS峰值
     * @return DropQps 攻击QPS峰值
     */
    public Long getDropQps() {
        return this.DropQps;
    }

    /**
     * 设置攻击QPS峰值
     * @param DropQps 攻击QPS峰值
     */
    public void setDropQps(Long DropQps) {
        this.DropQps = DropQps;
    }

    /**
     * 获取攻击状态，取值[0（攻击中）, 1（攻击结束）]
     * @return AttackStatus 攻击状态，取值[0（攻击中）, 1（攻击结束）]
     */
    public Long getAttackStatus() {
        return this.AttackStatus;
    }

    /**
     * 设置攻击状态，取值[0（攻击中）, 1（攻击结束）]
     * @param AttackStatus 攻击状态，取值[0（攻击中）, 1（攻击结束）]
     */
    public void setAttackStatus(Long AttackStatus) {
        this.AttackStatus = AttackStatus;
    }

    /**
     * 获取资源名称
注意：此字段可能返回 null，表示取不到有效值。
     * @return ResourceName 资源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * 设置资源名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceName 资源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * 获取域名列表
注意：此字段可能返回 null，表示取不到有效值。
     * @return DomainList 域名列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomainList() {
        return this.DomainList;
    }

    /**
     * 设置域名列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param DomainList 域名列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomainList(String DomainList) {
        this.DomainList = DomainList;
    }

    /**
     * 获取uri列表
注意：此字段可能返回 null，表示取不到有效值。
     * @return UriList uri列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUriList() {
        return this.UriList;
    }

    /**
     * 设置uri列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param UriList uri列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUriList(String UriList) {
        this.UriList = UriList;
    }

    /**
     * 获取攻击源列表
注意：此字段可能返回 null，表示取不到有效值。
     * @return AttackipList 攻击源列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAttackipList() {
        return this.AttackipList;
    }

    /**
     * 设置攻击源列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttackipList 攻击源列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttackipList(String AttackipList) {
        this.AttackipList = AttackipList;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ReqQps", this.ReqQps);
        this.setParamSimple(map, prefix + "DropQps", this.DropQps);
        this.setParamSimple(map, prefix + "AttackStatus", this.AttackStatus);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "DomainList", this.DomainList);
        this.setParamSimple(map, prefix + "UriList", this.UriList);
        this.setParamSimple(map, prefix + "AttackipList", this.AttackipList);

    }
}

