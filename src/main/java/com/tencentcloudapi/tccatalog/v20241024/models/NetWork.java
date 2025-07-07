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
package com.tencentcloudapi.tccatalog.v20241024.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetWork extends AbstractModel {

    /**
    * vpc实例id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * vpc网段
    */
    @SerializedName("VpcCidrBlock")
    @Expose
    private String VpcCidrBlock;

    /**
    * 子网实例id
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 子网网段
    */
    @SerializedName("SubnetCidrBlock")
    @Expose
    private String SubnetCidrBlock;

    /**
    * 服务clbip
    */
    @SerializedName("ClbIp")
    @Expose
    private String ClbIp;

    /**
    * 服务clbPort
    */
    @SerializedName("ClbPort")
    @Expose
    private String ClbPort;

    /**
     * Get vpc实例id 
     * @return VpcId vpc实例id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc实例id
     * @param VpcId vpc实例id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get vpc网段 
     * @return VpcCidrBlock vpc网段
     */
    public String getVpcCidrBlock() {
        return this.VpcCidrBlock;
    }

    /**
     * Set vpc网段
     * @param VpcCidrBlock vpc网段
     */
    public void setVpcCidrBlock(String VpcCidrBlock) {
        this.VpcCidrBlock = VpcCidrBlock;
    }

    /**
     * Get 子网实例id 
     * @return SubnetId 子网实例id
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网实例id
     * @param SubnetId 子网实例id
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 子网网段 
     * @return SubnetCidrBlock 子网网段
     */
    public String getSubnetCidrBlock() {
        return this.SubnetCidrBlock;
    }

    /**
     * Set 子网网段
     * @param SubnetCidrBlock 子网网段
     */
    public void setSubnetCidrBlock(String SubnetCidrBlock) {
        this.SubnetCidrBlock = SubnetCidrBlock;
    }

    /**
     * Get 服务clbip 
     * @return ClbIp 服务clbip
     */
    public String getClbIp() {
        return this.ClbIp;
    }

    /**
     * Set 服务clbip
     * @param ClbIp 服务clbip
     */
    public void setClbIp(String ClbIp) {
        this.ClbIp = ClbIp;
    }

    /**
     * Get 服务clbPort 
     * @return ClbPort 服务clbPort
     */
    public String getClbPort() {
        return this.ClbPort;
    }

    /**
     * Set 服务clbPort
     * @param ClbPort 服务clbPort
     */
    public void setClbPort(String ClbPort) {
        this.ClbPort = ClbPort;
    }

    public NetWork() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetWork(NetWork source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VpcCidrBlock != null) {
            this.VpcCidrBlock = new String(source.VpcCidrBlock);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.SubnetCidrBlock != null) {
            this.SubnetCidrBlock = new String(source.SubnetCidrBlock);
        }
        if (source.ClbIp != null) {
            this.ClbIp = new String(source.ClbIp);
        }
        if (source.ClbPort != null) {
            this.ClbPort = new String(source.ClbPort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcCidrBlock", this.VpcCidrBlock);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "SubnetCidrBlock", this.SubnetCidrBlock);
        this.setParamSimple(map, prefix + "ClbIp", this.ClbIp);
        this.setParamSimple(map, prefix + "ClbPort", this.ClbPort);

    }
}

