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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLoginTypeFailInfo extends AbstractModel {

    /**
    * <p>主机名称</p>
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * <p>主机实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>主机内网IP</p>
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * <p>主机公网IP</p>
    */
    @SerializedName("MachineWanIp")
    @Expose
    private String MachineWanIp;

    /**
    * <p>主机可用区</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>主机类型</p>
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * <p>以下几个固定值需要前端特殊处理，其他失败原因可直接展示：</p><ol><li>UNINSTALLED   -- 未安装</li><li>NEED_UPGRADE -- 需要升级</li><li>NOT_RUNNING -- 已关机</li><li>NO_PASSWORD -- 未开启密码登录，无法开启扫码</li></ol>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>失败原因</p>
    */
    @SerializedName("MessageDesc")
    @Expose
    private String MessageDesc;

    /**
     * Get <p>主机名称</p> 
     * @return MachineName <p>主机名称</p>
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set <p>主机名称</p>
     * @param MachineName <p>主机名称</p>
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get <p>主机实例ID</p> 
     * @return InstanceId <p>主机实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>主机实例ID</p>
     * @param InstanceId <p>主机实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>主机内网IP</p> 
     * @return MachineIp <p>主机内网IP</p>
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set <p>主机内网IP</p>
     * @param MachineIp <p>主机内网IP</p>
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get <p>主机公网IP</p> 
     * @return MachineWanIp <p>主机公网IP</p>
     */
    public String getMachineWanIp() {
        return this.MachineWanIp;
    }

    /**
     * Set <p>主机公网IP</p>
     * @param MachineWanIp <p>主机公网IP</p>
     */
    public void setMachineWanIp(String MachineWanIp) {
        this.MachineWanIp = MachineWanIp;
    }

    /**
     * Get <p>主机可用区</p> 
     * @return Region <p>主机可用区</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>主机可用区</p>
     * @param Region <p>主机可用区</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>主机类型</p> 
     * @return MachineType <p>主机类型</p>
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set <p>主机类型</p>
     * @param MachineType <p>主机类型</p>
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get <p>以下几个固定值需要前端特殊处理，其他失败原因可直接展示：</p><ol><li>UNINSTALLED   -- 未安装</li><li>NEED_UPGRADE -- 需要升级</li><li>NOT_RUNNING -- 已关机</li><li>NO_PASSWORD -- 未开启密码登录，无法开启扫码</li></ol> 
     * @return Message <p>以下几个固定值需要前端特殊处理，其他失败原因可直接展示：</p><ol><li>UNINSTALLED   -- 未安装</li><li>NEED_UPGRADE -- 需要升级</li><li>NOT_RUNNING -- 已关机</li><li>NO_PASSWORD -- 未开启密码登录，无法开启扫码</li></ol>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>以下几个固定值需要前端特殊处理，其他失败原因可直接展示：</p><ol><li>UNINSTALLED   -- 未安装</li><li>NEED_UPGRADE -- 需要升级</li><li>NOT_RUNNING -- 已关机</li><li>NO_PASSWORD -- 未开启密码登录，无法开启扫码</li></ol>
     * @param Message <p>以下几个固定值需要前端特殊处理，其他失败原因可直接展示：</p><ol><li>UNINSTALLED   -- 未安装</li><li>NEED_UPGRADE -- 需要升级</li><li>NOT_RUNNING -- 已关机</li><li>NO_PASSWORD -- 未开启密码登录，无法开启扫码</li></ol>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get <p>失败原因</p> 
     * @return MessageDesc <p>失败原因</p>
     */
    public String getMessageDesc() {
        return this.MessageDesc;
    }

    /**
     * Set <p>失败原因</p>
     * @param MessageDesc <p>失败原因</p>
     */
    public void setMessageDesc(String MessageDesc) {
        this.MessageDesc = MessageDesc;
    }

    public ModifyLoginTypeFailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLoginTypeFailInfo(ModifyLoginTypeFailInfo source) {
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.MachineIp != null) {
            this.MachineIp = new String(source.MachineIp);
        }
        if (source.MachineWanIp != null) {
            this.MachineWanIp = new String(source.MachineWanIp);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.MessageDesc != null) {
            this.MessageDesc = new String(source.MessageDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineWanIp", this.MachineWanIp);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "MessageDesc", this.MessageDesc);

    }
}

