/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeNatGatewayProductVersionRequest extends AbstractModel {

    /**
    * VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * NAT网关的ID，形如：`nat-ig8xpno8`。
    */
    @SerializedName("NatGatewayId")
    @Expose
    private String NatGatewayId;

    /**
    * 是否热迁移。1表示冷迁移，0表示热迁移，默认值是0。
    */
    @SerializedName("Force")
    @Expose
    private Long Force;

    /**
    * 是否仅校验迁移可能性。true表示仅校验能否迁移，不做实际迁移。false表示正常迁移。默认值为false。
仅校验模式，不报错表示校验迁移成功。
    */
    @SerializedName("CheckOnlyMode")
    @Expose
    private Boolean CheckOnlyMode;

    /**
     * Get VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。 
     * @return VpcId VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。
     * @param VpcId VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get NAT网关的ID，形如：`nat-ig8xpno8`。 
     * @return NatGatewayId NAT网关的ID，形如：`nat-ig8xpno8`。
     */
    public String getNatGatewayId() {
        return this.NatGatewayId;
    }

    /**
     * Set NAT网关的ID，形如：`nat-ig8xpno8`。
     * @param NatGatewayId NAT网关的ID，形如：`nat-ig8xpno8`。
     */
    public void setNatGatewayId(String NatGatewayId) {
        this.NatGatewayId = NatGatewayId;
    }

    /**
     * Get 是否热迁移。1表示冷迁移，0表示热迁移，默认值是0。 
     * @return Force 是否热迁移。1表示冷迁移，0表示热迁移，默认值是0。
     */
    public Long getForce() {
        return this.Force;
    }

    /**
     * Set 是否热迁移。1表示冷迁移，0表示热迁移，默认值是0。
     * @param Force 是否热迁移。1表示冷迁移，0表示热迁移，默认值是0。
     */
    public void setForce(Long Force) {
        this.Force = Force;
    }

    /**
     * Get 是否仅校验迁移可能性。true表示仅校验能否迁移，不做实际迁移。false表示正常迁移。默认值为false。
仅校验模式，不报错表示校验迁移成功。 
     * @return CheckOnlyMode 是否仅校验迁移可能性。true表示仅校验能否迁移，不做实际迁移。false表示正常迁移。默认值为false。
仅校验模式，不报错表示校验迁移成功。
     */
    public Boolean getCheckOnlyMode() {
        return this.CheckOnlyMode;
    }

    /**
     * Set 是否仅校验迁移可能性。true表示仅校验能否迁移，不做实际迁移。false表示正常迁移。默认值为false。
仅校验模式，不报错表示校验迁移成功。
     * @param CheckOnlyMode 是否仅校验迁移可能性。true表示仅校验能否迁移，不做实际迁移。false表示正常迁移。默认值为false。
仅校验模式，不报错表示校验迁移成功。
     */
    public void setCheckOnlyMode(Boolean CheckOnlyMode) {
        this.CheckOnlyMode = CheckOnlyMode;
    }

    public UpgradeNatGatewayProductVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeNatGatewayProductVersionRequest(UpgradeNatGatewayProductVersionRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.NatGatewayId != null) {
            this.NatGatewayId = new String(source.NatGatewayId);
        }
        if (source.Force != null) {
            this.Force = new Long(source.Force);
        }
        if (source.CheckOnlyMode != null) {
            this.CheckOnlyMode = new Boolean(source.CheckOnlyMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "NatGatewayId", this.NatGatewayId);
        this.setParamSimple(map, prefix + "Force", this.Force);
        this.setParamSimple(map, prefix + "CheckOnlyMode", this.CheckOnlyMode);

    }
}

