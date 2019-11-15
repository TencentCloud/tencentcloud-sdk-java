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
package com.tencentcloudapi.tiems.v20190416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExposeInfo  extends AbstractModel{

    /**
    * 暴露方式，支持 EXTERNAL（外网暴露），VPC （VPC内网打通）
    */
    @SerializedName("ExposeType")
    @Expose
    private String ExposeType;

    /**
    * 暴露Ip。暴露方式为 EXTERNAL 为外网 Ip，暴露方式为 VPC 时为指定 Vpc 下的Vip
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 暴露方式为 VPC 时，打通的私有网络Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 暴露方式为 VPC 时，打通的子网Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
     * 获取暴露方式，支持 EXTERNAL（外网暴露），VPC （VPC内网打通）
     * @return ExposeType 暴露方式，支持 EXTERNAL（外网暴露），VPC （VPC内网打通）
     */
    public String getExposeType() {
        return this.ExposeType;
    }

    /**
     * 设置暴露方式，支持 EXTERNAL（外网暴露），VPC （VPC内网打通）
     * @param ExposeType 暴露方式，支持 EXTERNAL（外网暴露），VPC （VPC内网打通）
     */
    public void setExposeType(String ExposeType) {
        this.ExposeType = ExposeType;
    }

    /**
     * 获取暴露Ip。暴露方式为 EXTERNAL 为外网 Ip，暴露方式为 VPC 时为指定 Vpc 下的Vip
     * @return Ip 暴露Ip。暴露方式为 EXTERNAL 为外网 Ip，暴露方式为 VPC 时为指定 Vpc 下的Vip
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * 设置暴露Ip。暴露方式为 EXTERNAL 为外网 Ip，暴露方式为 VPC 时为指定 Vpc 下的Vip
     * @param Ip 暴露Ip。暴露方式为 EXTERNAL 为外网 Ip，暴露方式为 VPC 时为指定 Vpc 下的Vip
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * 获取暴露方式为 VPC 时，打通的私有网络Id
注意：此字段可能返回 null，表示取不到有效值。
     * @return VpcId 暴露方式为 VPC 时，打通的私有网络Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置暴露方式为 VPC 时，打通的私有网络Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId 暴露方式为 VPC 时，打通的私有网络Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取暴露方式为 VPC 时，打通的子网Id
注意：此字段可能返回 null，表示取不到有效值。
     * @return SubnetId 暴露方式为 VPC 时，打通的子网Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置暴露方式为 VPC 时，打通的子网Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId 暴露方式为 VPC 时，打通的子网Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExposeType", this.ExposeType);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);

    }
}

