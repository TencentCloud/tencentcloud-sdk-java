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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClientSettingHost extends AbstractModel {

    /**
    * host对应的数据库记录ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 主机名字
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 公网IP
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * 内网IP
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * 主机Quuid
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 主机状态
<li>OFFLINE: 离线  </li>
<li>ONLINE: 在线</li>
<li>SHUTDOWN: 已关机</li>
<li>UNINSTALLED: 未防护</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * ins-sad143
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 地域信息
    */
    @SerializedName("RegionInfo")
    @Expose
    private RegionInfo RegionInfo;

    /**
    * 附加信息
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
    * <li>0: 关闭 </li>
<li>1:  开启</li>
<li>2: 开启中 </li>
<li>3:  关闭中</li>
<li>9: 未设置</li>
    */
    @SerializedName("FunctionStatus")
    @Expose
    private Long FunctionStatus;

    /**
    * 以下几个固定值需要前端特殊处理，其他失败原因可直接展示：
1. UNINSTALLED   -- 未安装
2. NEED_UPGRADE -- 需要升级
3. NOT_RUNNING -- 已关机
4. NO_PASSWORD -- 未开启密码登录，无法开启扫码
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 失败原因
    */
    @SerializedName("MessageDesc")
    @Expose
    private String MessageDesc;

    /**
    * 实例状态
<li>RUNNING: 运行中</li>
<li>STOPED: 已关机</li>
<li>EXPIRED: 待回收</li>
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
     * Get host对应的数据库记录ID 
     * @return Id host对应的数据库记录ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set host对应的数据库记录ID
     * @param Id host对应的数据库记录ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 主机名字 
     * @return Name 主机名字
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 主机名字
     * @param Name 主机名字
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 公网IP 
     * @return PublicIp 公网IP
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set 公网IP
     * @param PublicIp 公网IP
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get 内网IP 
     * @return PrivateIp 内网IP
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set 内网IP
     * @param PrivateIp 内网IP
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get 主机Quuid 
     * @return Quuid 主机Quuid
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 主机Quuid
     * @param Quuid 主机Quuid
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 主机状态
<li>OFFLINE: 离线  </li>
<li>ONLINE: 在线</li>
<li>SHUTDOWN: 已关机</li>
<li>UNINSTALLED: 未防护</li> 
     * @return Status 主机状态
<li>OFFLINE: 离线  </li>
<li>ONLINE: 在线</li>
<li>SHUTDOWN: 已关机</li>
<li>UNINSTALLED: 未防护</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 主机状态
<li>OFFLINE: 离线  </li>
<li>ONLINE: 在线</li>
<li>SHUTDOWN: 已关机</li>
<li>UNINSTALLED: 未防护</li>
     * @param Status 主机状态
<li>OFFLINE: 离线  </li>
<li>ONLINE: 在线</li>
<li>SHUTDOWN: 已关机</li>
<li>UNINSTALLED: 未防护</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get ins-sad143 
     * @return VpcId ins-sad143
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set ins-sad143
     * @param VpcId ins-sad143
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 地域信息 
     * @return RegionInfo 地域信息
     */
    public RegionInfo getRegionInfo() {
        return this.RegionInfo;
    }

    /**
     * Set 地域信息
     * @param RegionInfo 地域信息
     */
    public void setRegionInfo(RegionInfo RegionInfo) {
        this.RegionInfo = RegionInfo;
    }

    /**
     * Get 附加信息 
     * @return MachineExtraInfo 附加信息
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set 附加信息
     * @param MachineExtraInfo 附加信息
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
    }

    /**
     * Get <li>0: 关闭 </li>
<li>1:  开启</li>
<li>2: 开启中 </li>
<li>3:  关闭中</li>
<li>9: 未设置</li> 
     * @return FunctionStatus <li>0: 关闭 </li>
<li>1:  开启</li>
<li>2: 开启中 </li>
<li>3:  关闭中</li>
<li>9: 未设置</li>
     */
    public Long getFunctionStatus() {
        return this.FunctionStatus;
    }

    /**
     * Set <li>0: 关闭 </li>
<li>1:  开启</li>
<li>2: 开启中 </li>
<li>3:  关闭中</li>
<li>9: 未设置</li>
     * @param FunctionStatus <li>0: 关闭 </li>
<li>1:  开启</li>
<li>2: 开启中 </li>
<li>3:  关闭中</li>
<li>9: 未设置</li>
     */
    public void setFunctionStatus(Long FunctionStatus) {
        this.FunctionStatus = FunctionStatus;
    }

    /**
     * Get 以下几个固定值需要前端特殊处理，其他失败原因可直接展示：
1. UNINSTALLED   -- 未安装
2. NEED_UPGRADE -- 需要升级
3. NOT_RUNNING -- 已关机
4. NO_PASSWORD -- 未开启密码登录，无法开启扫码 
     * @return Message 以下几个固定值需要前端特殊处理，其他失败原因可直接展示：
1. UNINSTALLED   -- 未安装
2. NEED_UPGRADE -- 需要升级
3. NOT_RUNNING -- 已关机
4. NO_PASSWORD -- 未开启密码登录，无法开启扫码
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 以下几个固定值需要前端特殊处理，其他失败原因可直接展示：
1. UNINSTALLED   -- 未安装
2. NEED_UPGRADE -- 需要升级
3. NOT_RUNNING -- 已关机
4. NO_PASSWORD -- 未开启密码登录，无法开启扫码
     * @param Message 以下几个固定值需要前端特殊处理，其他失败原因可直接展示：
1. UNINSTALLED   -- 未安装
2. NEED_UPGRADE -- 需要升级
3. NOT_RUNNING -- 已关机
4. NO_PASSWORD -- 未开启密码登录，无法开启扫码
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 失败原因 
     * @return MessageDesc 失败原因
     */
    public String getMessageDesc() {
        return this.MessageDesc;
    }

    /**
     * Set 失败原因
     * @param MessageDesc 失败原因
     */
    public void setMessageDesc(String MessageDesc) {
        this.MessageDesc = MessageDesc;
    }

    /**
     * Get 实例状态
<li>RUNNING: 运行中</li>
<li>STOPED: 已关机</li>
<li>EXPIRED: 待回收</li> 
     * @return InstanceStatus 实例状态
<li>RUNNING: 运行中</li>
<li>STOPED: 已关机</li>
<li>EXPIRED: 待回收</li>
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set 实例状态
<li>RUNNING: 运行中</li>
<li>STOPED: 已关机</li>
<li>EXPIRED: 待回收</li>
     * @param InstanceStatus 实例状态
<li>RUNNING: 运行中</li>
<li>STOPED: 已关机</li>
<li>EXPIRED: 待回收</li>
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

