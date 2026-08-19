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

public class ClientSettingHost extends AbstractModel {

    /**
    * <p>host对应的数据库记录ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>主机名字</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>公网IP</p>
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * <p>内网IP</p>
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * <p>主机Quuid</p>
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * <p>主机状态<br>OFFLINE: 离线<br>ONLINE: 在线<br>SHUTDOWN: 已关机<br>UNINSTALLED: 未防护</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>ins-sad143</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>地域信息</p>
    */
    @SerializedName("RegionInfo")
    @Expose
    private RegionInfo RegionInfo;

    /**
    * <p>附加信息</p>
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
    * <p>0: 关闭<br>1:  开启<br>2: 开启中<br>3:  关闭中<br>9: 未设置</p>
    */
    @SerializedName("FunctionStatus")
    @Expose
    private Long FunctionStatus;

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
    * <p>实例状态<br>RUNNING: 运行中<br>STOPED: 已关机<br>EXPIRED: 待回收</p>
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
     * Get <p>host对应的数据库记录ID</p> 
     * @return Id <p>host对应的数据库记录ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>host对应的数据库记录ID</p>
     * @param Id <p>host对应的数据库记录ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>主机名字</p> 
     * @return Name <p>主机名字</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>主机名字</p>
     * @param Name <p>主机名字</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>公网IP</p> 
     * @return PublicIp <p>公网IP</p>
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set <p>公网IP</p>
     * @param PublicIp <p>公网IP</p>
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get <p>内网IP</p> 
     * @return PrivateIp <p>内网IP</p>
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set <p>内网IP</p>
     * @param PrivateIp <p>内网IP</p>
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get <p>主机Quuid</p> 
     * @return Quuid <p>主机Quuid</p>
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set <p>主机Quuid</p>
     * @param Quuid <p>主机Quuid</p>
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get <p>主机状态<br>OFFLINE: 离线<br>ONLINE: 在线<br>SHUTDOWN: 已关机<br>UNINSTALLED: 未防护</p> 
     * @return Status <p>主机状态<br>OFFLINE: 离线<br>ONLINE: 在线<br>SHUTDOWN: 已关机<br>UNINSTALLED: 未防护</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>主机状态<br>OFFLINE: 离线<br>ONLINE: 在线<br>SHUTDOWN: 已关机<br>UNINSTALLED: 未防护</p>
     * @param Status <p>主机状态<br>OFFLINE: 离线<br>ONLINE: 在线<br>SHUTDOWN: 已关机<br>UNINSTALLED: 未防护</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>ins-sad143</p> 
     * @return VpcId <p>ins-sad143</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>ins-sad143</p>
     * @param VpcId <p>ins-sad143</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>地域信息</p> 
     * @return RegionInfo <p>地域信息</p>
     */
    public RegionInfo getRegionInfo() {
        return this.RegionInfo;
    }

    /**
     * Set <p>地域信息</p>
     * @param RegionInfo <p>地域信息</p>
     */
    public void setRegionInfo(RegionInfo RegionInfo) {
        this.RegionInfo = RegionInfo;
    }

    /**
     * Get <p>附加信息</p> 
     * @return MachineExtraInfo <p>附加信息</p>
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set <p>附加信息</p>
     * @param MachineExtraInfo <p>附加信息</p>
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
    }

    /**
     * Get <p>0: 关闭<br>1:  开启<br>2: 开启中<br>3:  关闭中<br>9: 未设置</p> 
     * @return FunctionStatus <p>0: 关闭<br>1:  开启<br>2: 开启中<br>3:  关闭中<br>9: 未设置</p>
     */
    public Long getFunctionStatus() {
        return this.FunctionStatus;
    }

    /**
     * Set <p>0: 关闭<br>1:  开启<br>2: 开启中<br>3:  关闭中<br>9: 未设置</p>
     * @param FunctionStatus <p>0: 关闭<br>1:  开启<br>2: 开启中<br>3:  关闭中<br>9: 未设置</p>
     */
    public void setFunctionStatus(Long FunctionStatus) {
        this.FunctionStatus = FunctionStatus;
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

    /**
     * Get <p>实例状态<br>RUNNING: 运行中<br>STOPED: 已关机<br>EXPIRED: 待回收</p> 
     * @return InstanceStatus <p>实例状态<br>RUNNING: 运行中<br>STOPED: 已关机<br>EXPIRED: 待回收</p>
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set <p>实例状态<br>RUNNING: 运行中<br>STOPED: 已关机<br>EXPIRED: 待回收</p>
     * @param InstanceStatus <p>实例状态<br>RUNNING: 运行中<br>STOPED: 已关机<br>EXPIRED: 待回收</p>
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    public ClientSettingHost() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClientSettingHost(ClientSettingHost source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.RegionInfo != null) {
            this.RegionInfo = new RegionInfo(source.RegionInfo);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
        if (source.FunctionStatus != null) {
            this.FunctionStatus = new Long(source.FunctionStatus);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.MessageDesc != null) {
            this.MessageDesc = new String(source.MessageDesc);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamObj(map, prefix + "RegionInfo.", this.RegionInfo);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);
        this.setParamSimple(map, prefix + "FunctionStatus", this.FunctionStatus);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "MessageDesc", this.MessageDesc);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);

    }
}

