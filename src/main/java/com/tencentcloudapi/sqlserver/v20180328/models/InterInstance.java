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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InterInstance extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例互通IP，用于加入互通组后访问
    */
    @SerializedName("InterVip")
    @Expose
    private String InterVip;

    /**
    * 实例互通端口，用于加入互通组后访问
    */
    @SerializedName("InterPort")
    @Expose
    private Long InterPort;

    /**
    * 实例互通状态，1 -互通ipprot打开中 2 -互通ipprot已经打开 3 -已经打开互通ip的实例加入到互通组中 4 -已经打开互通ip的实例已加入到互通组 5 -互通ipprot回收中 6 -互通ipprot已回收 7 -已回收的实例从互通组中移除中 8 -已回收的实例从互通组中已经移除
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 实例所在地域名称，如 ap-guangzhou
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 实例所在可用区名称，如 ap-guangzhou-1
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 实例版本代号
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 实例版本
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * 实例名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 实例访问IP
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 实例访问端口
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

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
     * Get 实例互通IP，用于加入互通组后访问 
     * @return InterVip 实例互通IP，用于加入互通组后访问
     */
    public String getInterVip() {
        return this.InterVip;
    }

    /**
     * Set 实例互通IP，用于加入互通组后访问
     * @param InterVip 实例互通IP，用于加入互通组后访问
     */
    public void setInterVip(String InterVip) {
        this.InterVip = InterVip;
    }

    /**
     * Get 实例互通端口，用于加入互通组后访问 
     * @return InterPort 实例互通端口，用于加入互通组后访问
     */
    public Long getInterPort() {
        return this.InterPort;
    }

    /**
     * Set 实例互通端口，用于加入互通组后访问
     * @param InterPort 实例互通端口，用于加入互通组后访问
     */
    public void setInterPort(Long InterPort) {
        this.InterPort = InterPort;
    }

    /**
     * Get 实例互通状态，1 -互通ipprot打开中 2 -互通ipprot已经打开 3 -已经打开互通ip的实例加入到互通组中 4 -已经打开互通ip的实例已加入到互通组 5 -互通ipprot回收中 6 -互通ipprot已回收 7 -已回收的实例从互通组中移除中 8 -已回收的实例从互通组中已经移除 
     * @return Status 实例互通状态，1 -互通ipprot打开中 2 -互通ipprot已经打开 3 -已经打开互通ip的实例加入到互通组中 4 -已经打开互通ip的实例已加入到互通组 5 -互通ipprot回收中 6 -互通ipprot已回收 7 -已回收的实例从互通组中移除中 8 -已回收的实例从互通组中已经移除
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 实例互通状态，1 -互通ipprot打开中 2 -互通ipprot已经打开 3 -已经打开互通ip的实例加入到互通组中 4 -已经打开互通ip的实例已加入到互通组 5 -互通ipprot回收中 6 -互通ipprot已回收 7 -已回收的实例从互通组中移除中 8 -已回收的实例从互通组中已经移除
     * @param Status 实例互通状态，1 -互通ipprot打开中 2 -互通ipprot已经打开 3 -已经打开互通ip的实例加入到互通组中 4 -已经打开互通ip的实例已加入到互通组 5 -互通ipprot回收中 6 -互通ipprot已回收 7 -已回收的实例从互通组中移除中 8 -已回收的实例从互通组中已经移除
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 实例所在地域名称，如 ap-guangzhou 
     * @return Region 实例所在地域名称，如 ap-guangzhou
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 实例所在地域名称，如 ap-guangzhou
     * @param Region 实例所在地域名称，如 ap-guangzhou
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 实例所在可用区名称，如 ap-guangzhou-1 
     * @return Zone 实例所在可用区名称，如 ap-guangzhou-1
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 实例所在可用区名称，如 ap-guangzhou-1
     * @param Zone 实例所在可用区名称，如 ap-guangzhou-1
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 实例版本代号 
     * @return Version 实例版本代号
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 实例版本代号
     * @param Version 实例版本代号
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 实例版本 
     * @return VersionName 实例版本
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set 实例版本
     * @param VersionName 实例版本
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get 实例名称 
     * @return Name 实例名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 实例名称
     * @param Name 实例名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 实例访问IP 
     * @return Vip 实例访问IP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 实例访问IP
     * @param Vip 实例访问IP
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 实例访问端口 
     * @return Vport 实例访问端口
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set 实例访问端口
     * @param Vport 实例访问端口
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    public InterInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InterInstance(InterInstance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InterVip != null) {
            this.InterVip = new String(source.InterVip);
        }
        if (source.InterPort != null) {
            this.InterPort = new Long(source.InterPort);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InterVip", this.InterVip);
        this.setParamSimple(map, prefix + "InterPort", this.InterPort);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);

    }
}

