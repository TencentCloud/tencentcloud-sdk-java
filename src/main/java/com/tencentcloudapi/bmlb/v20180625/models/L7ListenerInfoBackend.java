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
package com.tencentcloudapi.bmlb.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class L7ListenerInfoBackend extends AbstractModel {

    /**
    * 绑定类别（0代表黑石物理机，1代表虚拟机IP）。
    */
    @SerializedName("BindType")
    @Expose
    private Long BindType;

    /**
    * 主机端口。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 权重。
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * 当前绑定关系的健康检查状态（Dead代表不健康，Alive代表健康）。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 黑石物理机的主机ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 黑石物理机的别名。
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 主机IP。
    */
    @SerializedName("LanIp")
    @Expose
    private String LanIp;

    /**
     * Get 绑定类别（0代表黑石物理机，1代表虚拟机IP）。 
     * @return BindType 绑定类别（0代表黑石物理机，1代表虚拟机IP）。
     */
    public Long getBindType() {
        return this.BindType;
    }

    /**
     * Set 绑定类别（0代表黑石物理机，1代表虚拟机IP）。
     * @param BindType 绑定类别（0代表黑石物理机，1代表虚拟机IP）。
     */
    public void setBindType(Long BindType) {
        this.BindType = BindType;
    }

    /**
     * Get 主机端口。 
     * @return Port 主机端口。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 主机端口。
     * @param Port 主机端口。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 权重。 
     * @return Weight 权重。
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 权重。
     * @param Weight 权重。
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 当前绑定关系的健康检查状态（Dead代表不健康，Alive代表健康）。 
     * @return Status 当前绑定关系的健康检查状态（Dead代表不健康，Alive代表健康）。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 当前绑定关系的健康检查状态（Dead代表不健康，Alive代表健康）。
     * @param Status 当前绑定关系的健康检查状态（Dead代表不健康，Alive代表健康）。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 黑石物理机的主机ID。 
     * @return InstanceId 黑石物理机的主机ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 黑石物理机的主机ID。
     * @param InstanceId 黑石物理机的主机ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 黑石物理机的别名。 
     * @return Alias 黑石物理机的别名。
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 黑石物理机的别名。
     * @param Alias 黑石物理机的别名。
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 主机IP。 
     * @return LanIp 主机IP。
     */
    public String getLanIp() {
        return this.LanIp;
    }

    /**
     * Set 主机IP。
     * @param LanIp 主机IP。
     */
    public void setLanIp(String LanIp) {
        this.LanIp = LanIp;
    }

    public L7ListenerInfoBackend() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public L7ListenerInfoBackend(L7ListenerInfoBackend source) {
        if (source.BindType != null) {
            this.BindType = new Long(source.BindType);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.LanIp != null) {
            this.LanIp = new String(source.LanIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BindType", this.BindType);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "LanIp", this.LanIp);

    }
}

