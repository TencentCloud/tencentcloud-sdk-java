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
package com.tencentcloudapi.bmvpc.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VpcInfo  extends AbstractModel{

    /**
    * 私有网络的唯一ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * VPC的名称。
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * VPC的CIDR。
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * VPC状态
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * 获取私有网络的唯一ID。
     * @return VpcId 私有网络的唯一ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置私有网络的唯一ID。
     * @param VpcId 私有网络的唯一ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取VPC的名称。
     * @return VpcName VPC的名称。
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * 设置VPC的名称。
     * @param VpcName VPC的名称。
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * 获取VPC的CIDR。
     * @return CidrBlock VPC的CIDR。
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * 设置VPC的CIDR。
     * @param CidrBlock VPC的CIDR。
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * 获取可用区
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 获取VPC状态
     * @return State VPC状态
     */
    public String getState() {
        return this.State;
    }

    /**
     * 设置VPC状态
     * @param State VPC状态
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * 获取创建时间
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

