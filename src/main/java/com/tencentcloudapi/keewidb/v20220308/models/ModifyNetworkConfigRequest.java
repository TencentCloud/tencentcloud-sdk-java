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
package com.tencentcloudapi.keewidb.v20220308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNetworkConfigRequest extends AbstractModel{

    /**
    * 实例 ID，如：kee-6ubh****。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 操作类型。<ul><li>changeVip：修改实例私有网络。</li><li>changeVpc：修改实例私有网络所属子网。</li><li>changeBaseToVpc：基础网络转为私有网络。</li></ul>
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 修改后的 VIP 地址。
当参数<b>Operation</b>为<b>changeVip</b>时，需设置实例修改后的 VIP 地址。该参数不配置，则自动分配。
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 修改后的私有网络 ID。
当参数<b>Operation</b>为<b>changeVip</b>或者为<b>changeBaseToVpc</b>时，务必设置实例修改后的私有网络 ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 修改后的所属子网 ID。
当参数<b>Operation</b>为<b>changeVpc</b>或者为<b>changeBaseToVpc</b>时，务必设置实例修改后的子网 ID。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 原 VIP 保留时长。
单位：天。取值范围：0、1、2、3、7、15。
    */
    @SerializedName("Recycle")
    @Expose
    private Long Recycle;

    /**
     * Get 实例 ID，如：kee-6ubh****。 
     * @return InstanceId 实例 ID，如：kee-6ubh****。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，如：kee-6ubh****。
     * @param InstanceId 实例 ID，如：kee-6ubh****。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 操作类型。<ul><li>changeVip：修改实例私有网络。</li><li>changeVpc：修改实例私有网络所属子网。</li><li>changeBaseToVpc：基础网络转为私有网络。</li></ul> 
     * @return Operation 操作类型。<ul><li>changeVip：修改实例私有网络。</li><li>changeVpc：修改实例私有网络所属子网。</li><li>changeBaseToVpc：基础网络转为私有网络。</li></ul>
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作类型。<ul><li>changeVip：修改实例私有网络。</li><li>changeVpc：修改实例私有网络所属子网。</li><li>changeBaseToVpc：基础网络转为私有网络。</li></ul>
     * @param Operation 操作类型。<ul><li>changeVip：修改实例私有网络。</li><li>changeVpc：修改实例私有网络所属子网。</li><li>changeBaseToVpc：基础网络转为私有网络。</li></ul>
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 修改后的 VIP 地址。
当参数<b>Operation</b>为<b>changeVip</b>时，需设置实例修改后的 VIP 地址。该参数不配置，则自动分配。 
     * @return Vip 修改后的 VIP 地址。
当参数<b>Operation</b>为<b>changeVip</b>时，需设置实例修改后的 VIP 地址。该参数不配置，则自动分配。
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 修改后的 VIP 地址。
当参数<b>Operation</b>为<b>changeVip</b>时，需设置实例修改后的 VIP 地址。该参数不配置，则自动分配。
     * @param Vip 修改后的 VIP 地址。
当参数<b>Operation</b>为<b>changeVip</b>时，需设置实例修改后的 VIP 地址。该参数不配置，则自动分配。
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 修改后的私有网络 ID。
当参数<b>Operation</b>为<b>changeVip</b>或者为<b>changeBaseToVpc</b>时，务必设置实例修改后的私有网络 ID。 
     * @return VpcId 修改后的私有网络 ID。
当参数<b>Operation</b>为<b>changeVip</b>或者为<b>changeBaseToVpc</b>时，务必设置实例修改后的私有网络 ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 修改后的私有网络 ID。
当参数<b>Operation</b>为<b>changeVip</b>或者为<b>changeBaseToVpc</b>时，务必设置实例修改后的私有网络 ID。
     * @param VpcId 修改后的私有网络 ID。
当参数<b>Operation</b>为<b>changeVip</b>或者为<b>changeBaseToVpc</b>时，务必设置实例修改后的私有网络 ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 修改后的所属子网 ID。
当参数<b>Operation</b>为<b>changeVpc</b>或者为<b>changeBaseToVpc</b>时，务必设置实例修改后的子网 ID。 
     * @return SubnetId 修改后的所属子网 ID。
当参数<b>Operation</b>为<b>changeVpc</b>或者为<b>changeBaseToVpc</b>时，务必设置实例修改后的子网 ID。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 修改后的所属子网 ID。
当参数<b>Operation</b>为<b>changeVpc</b>或者为<b>changeBaseToVpc</b>时，务必设置实例修改后的子网 ID。
     * @param SubnetId 修改后的所属子网 ID。
当参数<b>Operation</b>为<b>changeVpc</b>或者为<b>changeBaseToVpc</b>时，务必设置实例修改后的子网 ID。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 原 VIP 保留时长。
单位：天。取值范围：0、1、2、3、7、15。 
     * @return Recycle 原 VIP 保留时长。
单位：天。取值范围：0、1、2、3、7、15。
     */
    public Long getRecycle() {
        return this.Recycle;
    }

    /**
     * Set 原 VIP 保留时长。
单位：天。取值范围：0、1、2、3、7、15。
     * @param Recycle 原 VIP 保留时长。
单位：天。取值范围：0、1、2、3、7、15。
     */
    public void setRecycle(Long Recycle) {
        this.Recycle = Recycle;
    }

    public ModifyNetworkConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNetworkConfigRequest(ModifyNetworkConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Recycle != null) {
            this.Recycle = new Long(source.Recycle);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Recycle", this.Recycle);

    }
}

