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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulInfoHostInfo extends AbstractModel {

    /**
    * 主机名
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * 主机ip
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * 主机标签
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * 主机quuid
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 0 :漏洞不可自动修复，  1：可自动修复， 2：客户端已离线， 3：主机不是旗舰版只能手动修复， 4：机型不允许 ，5：修复中 ，6：已修复， 7：检测中, 9:修复失败, 10:已忽略 ,11:漏洞只支持linux不支持Windows, 12：漏洞只支持Windows不支持linux
    */
    @SerializedName("IsSupportAutoFix")
    @Expose
    private Long IsSupportAutoFix;

    /**
    * 主机uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 主机InstanceId
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 主机类型
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
     * Get 主机名 
     * @return HostName 主机名
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set 主机名
     * @param HostName 主机名
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get 主机ip 
     * @return HostIp 主机ip
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set 主机ip
     * @param HostIp 主机ip
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get 主机标签 
     * @return Tags 主机标签
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 主机标签
     * @param Tags 主机标签
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 主机quuid 
     * @return Quuid 主机quuid
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 主机quuid
     * @param Quuid 主机quuid
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 0 :漏洞不可自动修复，  1：可自动修复， 2：客户端已离线， 3：主机不是旗舰版只能手动修复， 4：机型不允许 ，5：修复中 ，6：已修复， 7：检测中, 9:修复失败, 10:已忽略 ,11:漏洞只支持linux不支持Windows, 12：漏洞只支持Windows不支持linux 
     * @return IsSupportAutoFix 0 :漏洞不可自动修复，  1：可自动修复， 2：客户端已离线， 3：主机不是旗舰版只能手动修复， 4：机型不允许 ，5：修复中 ，6：已修复， 7：检测中, 9:修复失败, 10:已忽略 ,11:漏洞只支持linux不支持Windows, 12：漏洞只支持Windows不支持linux
     */
    public Long getIsSupportAutoFix() {
        return this.IsSupportAutoFix;
    }

    /**
     * Set 0 :漏洞不可自动修复，  1：可自动修复， 2：客户端已离线， 3：主机不是旗舰版只能手动修复， 4：机型不允许 ，5：修复中 ，6：已修复， 7：检测中, 9:修复失败, 10:已忽略 ,11:漏洞只支持linux不支持Windows, 12：漏洞只支持Windows不支持linux
     * @param IsSupportAutoFix 0 :漏洞不可自动修复，  1：可自动修复， 2：客户端已离线， 3：主机不是旗舰版只能手动修复， 4：机型不允许 ，5：修复中 ，6：已修复， 7：检测中, 9:修复失败, 10:已忽略 ,11:漏洞只支持linux不支持Windows, 12：漏洞只支持Windows不支持linux
     */
    public void setIsSupportAutoFix(Long IsSupportAutoFix) {
        this.IsSupportAutoFix = IsSupportAutoFix;
    }

    /**
     * Get 主机uuid 
     * @return Uuid 主机uuid
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 主机uuid
     * @param Uuid 主机uuid
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 主机InstanceId 
     * @return InstanceId 主机InstanceId
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 主机InstanceId
     * @param InstanceId 主机InstanceId
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 主机类型 
     * @return MachineType 主机类型
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set 主机类型
     * @param MachineType 主机类型
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    public VulInfoHostInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulInfoHostInfo(VulInfoHostInfo source) {
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.IsSupportAutoFix != null) {
            this.IsSupportAutoFix = new Long(source.IsSupportAutoFix);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "IsSupportAutoFix", this.IsSupportAutoFix);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);

    }
}

