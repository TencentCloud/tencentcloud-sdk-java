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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CcnAttachedInstance extends AbstractModel{

    /**
    * 云联网实例ID。
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * 关联实例类型：
<li>`VPC`：私有网络</li>
<li>`DIRECTCONNECT`：专线网关</li>
<li>`BMVPC`：黑石私有网络</li>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 关联实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 关联实例名称。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 关联实例所属大区，例如：ap-guangzhou。
    */
    @SerializedName("InstanceRegion")
    @Expose
    private String InstanceRegion;

    /**
    * 关联实例所属UIN（根账号）。
    */
    @SerializedName("InstanceUin")
    @Expose
    private String InstanceUin;

    /**
    * 关联实例CIDR。
    */
    @SerializedName("CidrBlock")
    @Expose
    private String [] CidrBlock;

    /**
    * 关联实例状态：
<li>`PENDING`：申请中</li>
<li>`ACTIVE`：已连接</li>
<li>`EXPIRED`：已过期</li>
<li>`REJECTED`：已拒绝</li>
<li>`DELETED`：已删除</li>
<li>`FAILED`：失败的（2小时后将异步强制解关联）</li>
<li>`ATTACHING`：关联中</li>
<li>`DETACHING`：解关联中</li>
<li>`DETACHFAILED`：解关联失败（2小时后将异步强制解关联）</li>
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 关联时间。
    */
    @SerializedName("AttachedTime")
    @Expose
    private String AttachedTime;

    /**
    * 云联网所属UIN（根账号）。
    */
    @SerializedName("CcnUin")
    @Expose
    private String CcnUin;

    /**
    * 关联实例所属的大地域，如: CHINA_MAINLAND
    */
    @SerializedName("InstanceArea")
    @Expose
    private String InstanceArea;

    /**
     * Get 云联网实例ID。 
     * @return CcnId 云联网实例ID。
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set 云联网实例ID。
     * @param CcnId 云联网实例ID。
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get 关联实例类型：
<li>`VPC`：私有网络</li>
<li>`DIRECTCONNECT`：专线网关</li>
<li>`BMVPC`：黑石私有网络</li> 
     * @return InstanceType 关联实例类型：
<li>`VPC`：私有网络</li>
<li>`DIRECTCONNECT`：专线网关</li>
<li>`BMVPC`：黑石私有网络</li>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 关联实例类型：
<li>`VPC`：私有网络</li>
<li>`DIRECTCONNECT`：专线网关</li>
<li>`BMVPC`：黑石私有网络</li>
     * @param InstanceType 关联实例类型：
<li>`VPC`：私有网络</li>
<li>`DIRECTCONNECT`：专线网关</li>
<li>`BMVPC`：黑石私有网络</li>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 关联实例ID。 
     * @return InstanceId 关联实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 关联实例ID。
     * @param InstanceId 关联实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 关联实例名称。 
     * @return InstanceName 关联实例名称。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 关联实例名称。
     * @param InstanceName 关联实例名称。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 关联实例所属大区，例如：ap-guangzhou。 
     * @return InstanceRegion 关联实例所属大区，例如：ap-guangzhou。
     */
    public String getInstanceRegion() {
        return this.InstanceRegion;
    }

    /**
     * Set 关联实例所属大区，例如：ap-guangzhou。
     * @param InstanceRegion 关联实例所属大区，例如：ap-guangzhou。
     */
    public void setInstanceRegion(String InstanceRegion) {
        this.InstanceRegion = InstanceRegion;
    }

    /**
     * Get 关联实例所属UIN（根账号）。 
     * @return InstanceUin 关联实例所属UIN（根账号）。
     */
    public String getInstanceUin() {
        return this.InstanceUin;
    }

    /**
     * Set 关联实例所属UIN（根账号）。
     * @param InstanceUin 关联实例所属UIN（根账号）。
     */
    public void setInstanceUin(String InstanceUin) {
        this.InstanceUin = InstanceUin;
    }

    /**
     * Get 关联实例CIDR。 
     * @return CidrBlock 关联实例CIDR。
     */
    public String [] getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set 关联实例CIDR。
     * @param CidrBlock 关联实例CIDR。
     */
    public void setCidrBlock(String [] CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get 关联实例状态：
<li>`PENDING`：申请中</li>
<li>`ACTIVE`：已连接</li>
<li>`EXPIRED`：已过期</li>
<li>`REJECTED`：已拒绝</li>
<li>`DELETED`：已删除</li>
<li>`FAILED`：失败的（2小时后将异步强制解关联）</li>
<li>`ATTACHING`：关联中</li>
<li>`DETACHING`：解关联中</li>
<li>`DETACHFAILED`：解关联失败（2小时后将异步强制解关联）</li> 
     * @return State 关联实例状态：
<li>`PENDING`：申请中</li>
<li>`ACTIVE`：已连接</li>
<li>`EXPIRED`：已过期</li>
<li>`REJECTED`：已拒绝</li>
<li>`DELETED`：已删除</li>
<li>`FAILED`：失败的（2小时后将异步强制解关联）</li>
<li>`ATTACHING`：关联中</li>
<li>`DETACHING`：解关联中</li>
<li>`DETACHFAILED`：解关联失败（2小时后将异步强制解关联）</li>
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 关联实例状态：
<li>`PENDING`：申请中</li>
<li>`ACTIVE`：已连接</li>
<li>`EXPIRED`：已过期</li>
<li>`REJECTED`：已拒绝</li>
<li>`DELETED`：已删除</li>
<li>`FAILED`：失败的（2小时后将异步强制解关联）</li>
<li>`ATTACHING`：关联中</li>
<li>`DETACHING`：解关联中</li>
<li>`DETACHFAILED`：解关联失败（2小时后将异步强制解关联）</li>
     * @param State 关联实例状态：
<li>`PENDING`：申请中</li>
<li>`ACTIVE`：已连接</li>
<li>`EXPIRED`：已过期</li>
<li>`REJECTED`：已拒绝</li>
<li>`DELETED`：已删除</li>
<li>`FAILED`：失败的（2小时后将异步强制解关联）</li>
<li>`ATTACHING`：关联中</li>
<li>`DETACHING`：解关联中</li>
<li>`DETACHFAILED`：解关联失败（2小时后将异步强制解关联）</li>
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 关联时间。 
     * @return AttachedTime 关联时间。
     */
    public String getAttachedTime() {
        return this.AttachedTime;
    }

    /**
     * Set 关联时间。
     * @param AttachedTime 关联时间。
     */
    public void setAttachedTime(String AttachedTime) {
        this.AttachedTime = AttachedTime;
    }

    /**
     * Get 云联网所属UIN（根账号）。 
     * @return CcnUin 云联网所属UIN（根账号）。
     */
    public String getCcnUin() {
        return this.CcnUin;
    }

    /**
     * Set 云联网所属UIN（根账号）。
     * @param CcnUin 云联网所属UIN（根账号）。
     */
    public void setCcnUin(String CcnUin) {
        this.CcnUin = CcnUin;
    }

    /**
     * Get 关联实例所属的大地域，如: CHINA_MAINLAND 
     * @return InstanceArea 关联实例所属的大地域，如: CHINA_MAINLAND
     */
    public String getInstanceArea() {
        return this.InstanceArea;
    }

    /**
     * Set 关联实例所属的大地域，如: CHINA_MAINLAND
     * @param InstanceArea 关联实例所属的大地域，如: CHINA_MAINLAND
     */
    public void setInstanceArea(String InstanceArea) {
        this.InstanceArea = InstanceArea;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceRegion", this.InstanceRegion);
        this.setParamSimple(map, prefix + "InstanceUin", this.InstanceUin);
        this.setParamArraySimple(map, prefix + "CidrBlock.", this.CidrBlock);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "AttachedTime", this.AttachedTime);
        this.setParamSimple(map, prefix + "CcnUin", this.CcnUin);
        this.setParamSimple(map, prefix + "InstanceArea", this.InstanceArea);

    }
}

