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

public class CcnInstance  extends AbstractModel{

    /**
    * 关联实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 关联实例ID所属大区，例如：ap-guangzhou
    */
    @SerializedName("InstanceRegion")
    @Expose
    private String InstanceRegion;

    /**
    * 云联网实例ID
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * 关联实例类型，可选值：VPC、DIRECTCONNECT
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 关联实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 关联实例CIDR
    */
    @SerializedName("CidrBlock")
    @Expose
    private String [] CidrBlock;

    /**
     * 获取关联实例ID
     * @return InstanceId 关联实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置关联实例ID
     * @param InstanceId 关联实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取关联实例ID所属大区，例如：ap-guangzhou
     * @return InstanceRegion 关联实例ID所属大区，例如：ap-guangzhou
     */
    public String getInstanceRegion() {
        return this.InstanceRegion;
    }

    /**
     * 设置关联实例ID所属大区，例如：ap-guangzhou
     * @param InstanceRegion 关联实例ID所属大区，例如：ap-guangzhou
     */
    public void setInstanceRegion(String InstanceRegion) {
        this.InstanceRegion = InstanceRegion;
    }

    /**
     * 获取云联网实例ID
     * @return CcnId 云联网实例ID
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * 设置云联网实例ID
     * @param CcnId 云联网实例ID
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * 获取关联实例类型，可选值：VPC、DIRECTCONNECT
     * @return InstanceType 关联实例类型，可选值：VPC、DIRECTCONNECT
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * 设置关联实例类型，可选值：VPC、DIRECTCONNECT
     * @param InstanceType 关联实例类型，可选值：VPC、DIRECTCONNECT
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * 获取关联实例名称
     * @return InstanceName 关联实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * 设置关联实例名称
     * @param InstanceName 关联实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * 获取关联实例CIDR
     * @return CidrBlock 关联实例CIDR
     */
    public String [] getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * 设置关联实例CIDR
     * @param CidrBlock 关联实例CIDR
     */
    public void setCidrBlock(String [] CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceRegion", this.InstanceRegion);
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArraySimple(map, prefix + "CidrBlock.", this.CidrBlock);

    }
}

