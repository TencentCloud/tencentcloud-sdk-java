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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileSystemClient extends AbstractModel{

    /**
    * 文件系统IP地址
    */
    @SerializedName("CfsVip")
    @Expose
    private String CfsVip;

    /**
    * 客户端IP地址
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
    * 文件系统所属VPCID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 可用区名称，例如ap-beijing-1，请参考 概览文档中的地域与可用区列表
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 可用区中文名称
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 该文件系统被挂载到客户端上的路径信息
    */
    @SerializedName("MountDirectory")
    @Expose
    private String MountDirectory;

    /**
     * Get 文件系统IP地址 
     * @return CfsVip 文件系统IP地址
     */
    public String getCfsVip() {
        return this.CfsVip;
    }

    /**
     * Set 文件系统IP地址
     * @param CfsVip 文件系统IP地址
     */
    public void setCfsVip(String CfsVip) {
        this.CfsVip = CfsVip;
    }

    /**
     * Get 客户端IP地址 
     * @return ClientIp 客户端IP地址
     */
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * Set 客户端IP地址
     * @param ClientIp 客户端IP地址
     */
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
    }

    /**
     * Get 文件系统所属VPCID 
     * @return VpcId 文件系统所属VPCID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 文件系统所属VPCID
     * @param VpcId 文件系统所属VPCID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 可用区名称，例如ap-beijing-1，请参考 概览文档中的地域与可用区列表 
     * @return Zone 可用区名称，例如ap-beijing-1，请参考 概览文档中的地域与可用区列表
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区名称，例如ap-beijing-1，请参考 概览文档中的地域与可用区列表
     * @param Zone 可用区名称，例如ap-beijing-1，请参考 概览文档中的地域与可用区列表
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 可用区中文名称 
     * @return ZoneName 可用区中文名称
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 可用区中文名称
     * @param ZoneName 可用区中文名称
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get 该文件系统被挂载到客户端上的路径信息 
     * @return MountDirectory 该文件系统被挂载到客户端上的路径信息
     */
    public String getMountDirectory() {
        return this.MountDirectory;
    }

    /**
     * Set 该文件系统被挂载到客户端上的路径信息
     * @param MountDirectory 该文件系统被挂载到客户端上的路径信息
     */
    public void setMountDirectory(String MountDirectory) {
        this.MountDirectory = MountDirectory;
    }

    public FileSystemClient() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileSystemClient(FileSystemClient source) {
        if (source.CfsVip != null) {
            this.CfsVip = new String(source.CfsVip);
        }
        if (source.ClientIp != null) {
            this.ClientIp = new String(source.ClientIp);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.MountDirectory != null) {
            this.MountDirectory = new String(source.MountDirectory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CfsVip", this.CfsVip);
        this.setParamSimple(map, prefix + "ClientIp", this.ClientIp);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "MountDirectory", this.MountDirectory);

    }
}

