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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetOutput extends AbstractModel {

    /**
    * 弹性网卡 ID。
    */
    @SerializedName("EniId")
    @Expose
    private String EniId;

    /**
    * 后端服务器使用的端口。取值范围：**1 - 65535**。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 后端服务实例 ID，CVM 实例格式为 ins- 后接 8 位字母数字。
    */
    @SerializedName("TargetId")
    @Expose
    private String TargetId;

    /**
    * 后端服务IP。**TargetIp**和**TargetId**需要至少传一个。

- 当服务器组为 **Instance** 类型时，该参数为 **Eni** 的主内网 IP 或辅助内网 IP。

    */
    @SerializedName("TargetIp")
    @Expose
    private String TargetIp;

    /**
    * 后端服务名称。当前只有CVM后端类型后端服务返回有效名称。
    */
    @SerializedName("TargetName")
    @Expose
    private String TargetName;

    /**
    * 后端服务的状态。取值：
- **Adding**：添加中。
- **Active**：正常可用状态。
- **Configuring**：配置中。
- **Removing**：移除中。
    */
    @SerializedName("TargetStatus")
    @Expose
    private String TargetStatus;

    /**
    * 后端服务类型。
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * 后端服务的权重，取值范围：**0 - 100**。默认值为**100**。如果设置权重为**0**，则不会将请求转发给该后端服务。
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
     * Get 弹性网卡 ID。 
     * @return EniId 弹性网卡 ID。
     */
    public String getEniId() {
        return this.EniId;
    }

    /**
     * Set 弹性网卡 ID。
     * @param EniId 弹性网卡 ID。
     */
    public void setEniId(String EniId) {
        this.EniId = EniId;
    }

    /**
     * Get 后端服务器使用的端口。取值范围：**1 - 65535**。 
     * @return Port 后端服务器使用的端口。取值范围：**1 - 65535**。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 后端服务器使用的端口。取值范围：**1 - 65535**。
     * @param Port 后端服务器使用的端口。取值范围：**1 - 65535**。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 后端服务实例 ID，CVM 实例格式为 ins- 后接 8 位字母数字。 
     * @return TargetId 后端服务实例 ID，CVM 实例格式为 ins- 后接 8 位字母数字。
     */
    public String getTargetId() {
        return this.TargetId;
    }

    /**
     * Set 后端服务实例 ID，CVM 实例格式为 ins- 后接 8 位字母数字。
     * @param TargetId 后端服务实例 ID，CVM 实例格式为 ins- 后接 8 位字母数字。
     */
    public void setTargetId(String TargetId) {
        this.TargetId = TargetId;
    }

    /**
     * Get 后端服务IP。**TargetIp**和**TargetId**需要至少传一个。

- 当服务器组为 **Instance** 类型时，该参数为 **Eni** 的主内网 IP 或辅助内网 IP。
 
     * @return TargetIp 后端服务IP。**TargetIp**和**TargetId**需要至少传一个。

- 当服务器组为 **Instance** 类型时，该参数为 **Eni** 的主内网 IP 或辅助内网 IP。

     */
    public String getTargetIp() {
        return this.TargetIp;
    }

    /**
     * Set 后端服务IP。**TargetIp**和**TargetId**需要至少传一个。

- 当服务器组为 **Instance** 类型时，该参数为 **Eni** 的主内网 IP 或辅助内网 IP。

     * @param TargetIp 后端服务IP。**TargetIp**和**TargetId**需要至少传一个。

- 当服务器组为 **Instance** 类型时，该参数为 **Eni** 的主内网 IP 或辅助内网 IP。

     */
    public void setTargetIp(String TargetIp) {
        this.TargetIp = TargetIp;
    }

    /**
     * Get 后端服务名称。当前只有CVM后端类型后端服务返回有效名称。 
     * @return TargetName 后端服务名称。当前只有CVM后端类型后端服务返回有效名称。
     */
    public String getTargetName() {
        return this.TargetName;
    }

    /**
     * Set 后端服务名称。当前只有CVM后端类型后端服务返回有效名称。
     * @param TargetName 后端服务名称。当前只有CVM后端类型后端服务返回有效名称。
     */
    public void setTargetName(String TargetName) {
        this.TargetName = TargetName;
    }

    /**
     * Get 后端服务的状态。取值：
- **Adding**：添加中。
- **Active**：正常可用状态。
- **Configuring**：配置中。
- **Removing**：移除中。 
     * @return TargetStatus 后端服务的状态。取值：
- **Adding**：添加中。
- **Active**：正常可用状态。
- **Configuring**：配置中。
- **Removing**：移除中。
     */
    public String getTargetStatus() {
        return this.TargetStatus;
    }

    /**
     * Set 后端服务的状态。取值：
- **Adding**：添加中。
- **Active**：正常可用状态。
- **Configuring**：配置中。
- **Removing**：移除中。
     * @param TargetStatus 后端服务的状态。取值：
- **Adding**：添加中。
- **Active**：正常可用状态。
- **Configuring**：配置中。
- **Removing**：移除中。
     */
    public void setTargetStatus(String TargetStatus) {
        this.TargetStatus = TargetStatus;
    }

    /**
     * Get 后端服务类型。 
     * @return TargetType 后端服务类型。
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set 后端服务类型。
     * @param TargetType 后端服务类型。
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get 后端服务的权重，取值范围：**0 - 100**。默认值为**100**。如果设置权重为**0**，则不会将请求转发给该后端服务。 
     * @return Weight 后端服务的权重，取值范围：**0 - 100**。默认值为**100**。如果设置权重为**0**，则不会将请求转发给该后端服务。
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 后端服务的权重，取值范围：**0 - 100**。默认值为**100**。如果设置权重为**0**，则不会将请求转发给该后端服务。
     * @param Weight 后端服务的权重，取值范围：**0 - 100**。默认值为**100**。如果设置权重为**0**，则不会将请求转发给该后端服务。
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    public TargetOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetOutput(TargetOutput source) {
        if (source.EniId != null) {
            this.EniId = new String(source.EniId);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.TargetId != null) {
            this.TargetId = new String(source.TargetId);
        }
        if (source.TargetIp != null) {
            this.TargetIp = new String(source.TargetIp);
        }
        if (source.TargetName != null) {
            this.TargetName = new String(source.TargetName);
        }
        if (source.TargetStatus != null) {
            this.TargetStatus = new String(source.TargetStatus);
        }
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EniId", this.EniId);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "TargetId", this.TargetId);
        this.setParamSimple(map, prefix + "TargetIp", this.TargetIp);
        this.setParamSimple(map, prefix + "TargetName", this.TargetName);
        this.setParamSimple(map, prefix + "TargetStatus", this.TargetStatus);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "Weight", this.Weight);

    }
}

