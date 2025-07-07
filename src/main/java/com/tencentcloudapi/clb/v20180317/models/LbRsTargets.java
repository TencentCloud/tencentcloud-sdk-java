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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LbRsTargets extends AbstractModel {

    /**
    * 内网ip类型。“cvm”或“eni”
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 后端实例的内网ip。
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * 绑定后端实例的端口。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * rs的vpcId
    */
    @SerializedName("VpcId")
    @Expose
    private Long VpcId;

    /**
    * rs的权重
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
     * Get 内网ip类型。“cvm”或“eni” 
     * @return Type 内网ip类型。“cvm”或“eni”
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 内网ip类型。“cvm”或“eni”
     * @param Type 内网ip类型。“cvm”或“eni”
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 后端实例的内网ip。 
     * @return PrivateIp 后端实例的内网ip。
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set 后端实例的内网ip。
     * @param PrivateIp 后端实例的内网ip。
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get 绑定后端实例的端口。 
     * @return Port 绑定后端实例的端口。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 绑定后端实例的端口。
     * @param Port 绑定后端实例的端口。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get rs的vpcId 
     * @return VpcId rs的vpcId
     */
    public Long getVpcId() {
        return this.VpcId;
    }

    /**
     * Set rs的vpcId
     * @param VpcId rs的vpcId
     */
    public void setVpcId(Long VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get rs的权重 
     * @return Weight rs的权重
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set rs的权重
     * @param Weight rs的权重
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    public LbRsTargets() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LbRsTargets(LbRsTargets source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.VpcId != null) {
            this.VpcId = new Long(source.VpcId);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Weight", this.Weight);

    }
}

