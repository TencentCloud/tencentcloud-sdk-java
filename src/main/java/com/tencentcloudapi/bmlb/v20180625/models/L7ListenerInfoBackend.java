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
package com.tencentcloudapi.bmlb.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class L7ListenerInfoBackend  extends AbstractModel{

    /**
    * 绑定类别（0代表黑石物理机，1代表虚拟机IP）。
    */
    @SerializedName("BindType")
    @Expose
    private Integer BindType;

    /**
    * 主机端口。
    */
    @SerializedName("Port")
    @Expose
    private Integer Port;

    /**
    * 权重。
    */
    @SerializedName("Weight")
    @Expose
    private Integer Weight;

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
     * 获取绑定类别（0代表黑石物理机，1代表虚拟机IP）。
     * @return BindType 绑定类别（0代表黑石物理机，1代表虚拟机IP）。
     */
    public Integer getBindType() {
        return this.BindType;
    }

    /**
     * 设置绑定类别（0代表黑石物理机，1代表虚拟机IP）。
     * @param BindType 绑定类别（0代表黑石物理机，1代表虚拟机IP）。
     */
    public void setBindType(Integer BindType) {
        this.BindType = BindType;
    }

    /**
     * 获取主机端口。
     * @return Port 主机端口。
     */
    public Integer getPort() {
        return this.Port;
    }

    /**
     * 设置主机端口。
     * @param Port 主机端口。
     */
    public void setPort(Integer Port) {
        this.Port = Port;
    }

    /**
     * 获取权重。
     * @return Weight 权重。
     */
    public Integer getWeight() {
        return this.Weight;
    }

    /**
     * 设置权重。
     * @param Weight 权重。
     */
    public void setWeight(Integer Weight) {
        this.Weight = Weight;
    }

    /**
     * 获取当前绑定关系的健康检查状态（Dead代表不健康，Alive代表健康）。
     * @return Status 当前绑定关系的健康检查状态（Dead代表不健康，Alive代表健康）。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * 设置当前绑定关系的健康检查状态（Dead代表不健康，Alive代表健康）。
     * @param Status 当前绑定关系的健康检查状态（Dead代表不健康，Alive代表健康）。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * 获取黑石物理机的主机ID。
     * @return InstanceId 黑石物理机的主机ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置黑石物理机的主机ID。
     * @param InstanceId 黑石物理机的主机ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取黑石物理机的别名。
     * @return Alias 黑石物理机的别名。
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * 设置黑石物理机的别名。
     * @param Alias 黑石物理机的别名。
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * 获取主机IP。
     * @return LanIp 主机IP。
     */
    public String getLanIp() {
        return this.LanIp;
    }

    /**
     * 设置主机IP。
     * @param LanIp 主机IP。
     */
    public void setLanIp(String LanIp) {
        this.LanIp = LanIp;
    }

    /**
     * 内部实现，用户禁止调用
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

