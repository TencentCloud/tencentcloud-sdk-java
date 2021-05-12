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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateHaVipRequest extends AbstractModel{

    /**
    * HAVIP所在私有网络ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * HAVIP所在子网ID。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * HAVIP名称。
    */
    @SerializedName("HaVipName")
    @Expose
    private String HaVipName;

    /**
    * 指定虚拟IP地址，必须在VPC网段内且未被占用。不指定则自动分配。
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
     * Get HAVIP所在私有网络ID。 
     * @return VpcId HAVIP所在私有网络ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set HAVIP所在私有网络ID。
     * @param VpcId HAVIP所在私有网络ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get HAVIP所在子网ID。 
     * @return SubnetId HAVIP所在子网ID。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set HAVIP所在子网ID。
     * @param SubnetId HAVIP所在子网ID。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get HAVIP名称。 
     * @return HaVipName HAVIP名称。
     */
    public String getHaVipName() {
        return this.HaVipName;
    }

    /**
     * Set HAVIP名称。
     * @param HaVipName HAVIP名称。
     */
    public void setHaVipName(String HaVipName) {
        this.HaVipName = HaVipName;
    }

    /**
     * Get 指定虚拟IP地址，必须在VPC网段内且未被占用。不指定则自动分配。 
     * @return Vip 指定虚拟IP地址，必须在VPC网段内且未被占用。不指定则自动分配。
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 指定虚拟IP地址，必须在VPC网段内且未被占用。不指定则自动分配。
     * @param Vip 指定虚拟IP地址，必须在VPC网段内且未被占用。不指定则自动分配。
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    public CreateHaVipRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateHaVipRequest(CreateHaVipRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.HaVipName != null) {
            this.HaVipName = new String(source.HaVipName);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "HaVipName", this.HaVipName);
        this.setParamSimple(map, prefix + "Vip", this.Vip);

    }
}

