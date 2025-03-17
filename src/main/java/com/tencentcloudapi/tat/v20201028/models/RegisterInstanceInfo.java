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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegisterInstanceInfo extends AbstractModel {

    /**
    * 注册码ID。
    */
    @SerializedName("RegisterCodeId")
    @Expose
    private String RegisterCodeId;

    /**
    * 托管实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 托管实例名。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 机器ID。
    */
    @SerializedName("MachineId")
    @Expose
    private String MachineId;

    /**
    * 系统名。取值：Linux | Windows。
    */
    @SerializedName("SystemName")
    @Expose
    private String SystemName;

    /**
    * 主机名。
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * 内网IP。
    */
    @SerializedName("LocalIp")
    @Expose
    private String LocalIp;

    /**
    * 公钥。
    */
    @SerializedName("PublicKey")
    @Expose
    private String PublicKey;

    /**
    * 托管状态。
返回Online表示实例正在托管，返回Offline表示实例未托管。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 创建时间。格式为：YYYY-MM-DDThh:mm:ssZ
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 上次更新时间。格式为：YYYY-MM-DDThh:mm:ssZ
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * 标签
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get 注册码ID。 
     * @return RegisterCodeId 注册码ID。
     */
    public String getRegisterCodeId() {
        return this.RegisterCodeId;
    }

    /**
     * Set 注册码ID。
     * @param RegisterCodeId 注册码ID。
     */
    public void setRegisterCodeId(String RegisterCodeId) {
        this.RegisterCodeId = RegisterCodeId;
    }

    /**
     * Get 托管实例ID。 
     * @return InstanceId 托管实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 托管实例ID。
     * @param InstanceId 托管实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 托管实例名。 
     * @return InstanceName 托管实例名。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 托管实例名。
     * @param InstanceName 托管实例名。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 机器ID。 
     * @return MachineId 机器ID。
     */
    public String getMachineId() {
        return this.MachineId;
    }

    /**
     * Set 机器ID。
     * @param MachineId 机器ID。
     */
    public void setMachineId(String MachineId) {
        this.MachineId = MachineId;
    }

    /**
     * Get 系统名。取值：Linux | Windows。 
     * @return SystemName 系统名。取值：Linux | Windows。
     */
    public String getSystemName() {
        return this.SystemName;
    }

    /**
     * Set 系统名。取值：Linux | Windows。
     * @param SystemName 系统名。取值：Linux | Windows。
     */
    public void setSystemName(String SystemName) {
        this.SystemName = SystemName;
    }

    /**
     * Get 主机名。 
     * @return HostName 主机名。
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set 主机名。
     * @param HostName 主机名。
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get 内网IP。 
     * @return LocalIp 内网IP。
     */
    public String getLocalIp() {
        return this.LocalIp;
    }

    /**
     * Set 内网IP。
     * @param LocalIp 内网IP。
     */
    public void setLocalIp(String LocalIp) {
        this.LocalIp = LocalIp;
    }

    /**
     * Get 公钥。 
     * @return PublicKey 公钥。
     */
    public String getPublicKey() {
        return this.PublicKey;
    }

    /**
     * Set 公钥。
     * @param PublicKey 公钥。
     */
    public void setPublicKey(String PublicKey) {
        this.PublicKey = PublicKey;
    }

    /**
     * Get 托管状态。
返回Online表示实例正在托管，返回Offline表示实例未托管。 
     * @return Status 托管状态。
返回Online表示实例正在托管，返回Offline表示实例未托管。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 托管状态。
返回Online表示实例正在托管，返回Offline表示实例未托管。
     * @param Status 托管状态。
返回Online表示实例正在托管，返回Offline表示实例未托管。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 创建时间。格式为：YYYY-MM-DDThh:mm:ssZ 
     * @return CreatedTime 创建时间。格式为：YYYY-MM-DDThh:mm:ssZ
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间。格式为：YYYY-MM-DDThh:mm:ssZ
     * @param CreatedTime 创建时间。格式为：YYYY-MM-DDThh:mm:ssZ
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 上次更新时间。格式为：YYYY-MM-DDThh:mm:ssZ 
     * @return UpdatedTime 上次更新时间。格式为：YYYY-MM-DDThh:mm:ssZ
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set 上次更新时间。格式为：YYYY-MM-DDThh:mm:ssZ
     * @param UpdatedTime 上次更新时间。格式为：YYYY-MM-DDThh:mm:ssZ
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get 标签 
     * @return Tags 标签
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
     * @param Tags 标签
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public RegisterInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegisterInstanceInfo(RegisterInstanceInfo source) {
        if (source.RegisterCodeId != null) {
            this.RegisterCodeId = new String(source.RegisterCodeId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.MachineId != null) {
            this.MachineId = new String(source.MachineId);
        }
        if (source.SystemName != null) {
            this.SystemName = new String(source.SystemName);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.LocalIp != null) {
            this.LocalIp = new String(source.LocalIp);
        }
        if (source.PublicKey != null) {
            this.PublicKey = new String(source.PublicKey);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegisterCodeId", this.RegisterCodeId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "MachineId", this.MachineId);
        this.setParamSimple(map, prefix + "SystemName", this.SystemName);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "LocalIp", this.LocalIp);
        this.setParamSimple(map, prefix + "PublicKey", this.PublicKey);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

