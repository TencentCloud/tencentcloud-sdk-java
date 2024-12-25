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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDReadableRequest extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 操作类型。enable-开启备机只读，disable-关闭备机只读
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 备机网络ID，不填默认和主实例保持一致
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 备机网络子网ID，不填默认和主实例保持一致
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 指定的备机只读vip，不填自动分配。多节点SingleReadOnly模式不支持指定vip。
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 备机只读模式，多节点架构默认取值BalancedReadOnly。SingleReadOnly-每个备机各对应一个只读地址（多节点架构），BalancedReadOnly-所有备机共用一个只读地址。当实例是双节点架构时，固定取值SingleReadOnly。
    */
    @SerializedName("ReadMode")
    @Expose
    private String ReadMode;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 操作类型。enable-开启备机只读，disable-关闭备机只读 
     * @return Type 操作类型。enable-开启备机只读，disable-关闭备机只读
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 操作类型。enable-开启备机只读，disable-关闭备机只读
     * @param Type 操作类型。enable-开启备机只读，disable-关闭备机只读
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 备机网络ID，不填默认和主实例保持一致 
     * @return VpcId 备机网络ID，不填默认和主实例保持一致
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 备机网络ID，不填默认和主实例保持一致
     * @param VpcId 备机网络ID，不填默认和主实例保持一致
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 备机网络子网ID，不填默认和主实例保持一致 
     * @return SubnetId 备机网络子网ID，不填默认和主实例保持一致
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 备机网络子网ID，不填默认和主实例保持一致
     * @param SubnetId 备机网络子网ID，不填默认和主实例保持一致
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 指定的备机只读vip，不填自动分配。多节点SingleReadOnly模式不支持指定vip。 
     * @return Vip 指定的备机只读vip，不填自动分配。多节点SingleReadOnly模式不支持指定vip。
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 指定的备机只读vip，不填自动分配。多节点SingleReadOnly模式不支持指定vip。
     * @param Vip 指定的备机只读vip，不填自动分配。多节点SingleReadOnly模式不支持指定vip。
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 备机只读模式，多节点架构默认取值BalancedReadOnly。SingleReadOnly-每个备机各对应一个只读地址（多节点架构），BalancedReadOnly-所有备机共用一个只读地址。当实例是双节点架构时，固定取值SingleReadOnly。 
     * @return ReadMode 备机只读模式，多节点架构默认取值BalancedReadOnly。SingleReadOnly-每个备机各对应一个只读地址（多节点架构），BalancedReadOnly-所有备机共用一个只读地址。当实例是双节点架构时，固定取值SingleReadOnly。
     */
    public String getReadMode() {
        return this.ReadMode;
    }

    /**
     * Set 备机只读模式，多节点架构默认取值BalancedReadOnly。SingleReadOnly-每个备机各对应一个只读地址（多节点架构），BalancedReadOnly-所有备机共用一个只读地址。当实例是双节点架构时，固定取值SingleReadOnly。
     * @param ReadMode 备机只读模式，多节点架构默认取值BalancedReadOnly。SingleReadOnly-每个备机各对应一个只读地址（多节点架构），BalancedReadOnly-所有备机共用一个只读地址。当实例是双节点架构时，固定取值SingleReadOnly。
     */
    public void setReadMode(String ReadMode) {
        this.ReadMode = ReadMode;
    }

    public ModifyDReadableRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDReadableRequest(ModifyDReadableRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.ReadMode != null) {
            this.ReadMode = new String(source.ReadMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "ReadMode", this.ReadMode);

    }
}

