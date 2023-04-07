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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VertexDetail extends AbstractModel{

    /**
    * 该节点类型，进程:1；网络:2；文件:3；ssh:4
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 各节点类型用到的时间，2022-11-29 00:00:00 格式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 告警信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmInfo")
    @Expose
    private AlarmInfo [] AlarmInfo;

    /**
    * 进程名，当该节点为进程时生效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcName")
    @Expose
    private String ProcName;

    /**
    * 命令行，当该节点为进程时生效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CmdLine")
    @Expose
    private String CmdLine;

    /**
    * 进程id，当该节点为进程时生效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Pid")
    @Expose
    private String Pid;

    /**
    * 文件md5，当该节点为文件时生效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileMd5")
    @Expose
    private String FileMd5;

    /**
    * 文件写入内容，当该节点为文件时生效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileContent")
    @Expose
    private String FileContent;

    /**
    * 文件路径，当该节点为文件时生效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * 文件创建时间，当该节点为文件时生效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileCreateTime")
    @Expose
    private String FileCreateTime;

    /**
    * 请求目的地址，当该节点为网络时生效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 目标端口，当该节点为网络时生效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DstPort")
    @Expose
    private Long DstPort;

    /**
    * 登录源ip，当该节点为ssh时生效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SrcIP")
    @Expose
    private String SrcIP;

    /**
    * 登录用户名用户组，当该节点为ssh时生效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 漏洞名称，当该节点为漏洞时生效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * 漏洞利用时间，当该节点为漏洞时生效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VulTime")
    @Expose
    private String VulTime;

    /**
    * http请求内容，当该节点为漏洞时生效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HttpContent")
    @Expose
    private String HttpContent;

    /**
    * 漏洞利用者来源ip，当该节点为漏洞时生效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VulSrcIP")
    @Expose
    private String VulSrcIP;

    /**
    * 点id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VertexId")
    @Expose
    private String VertexId;

    /**
     * Get 该节点类型，进程:1；网络:2；文件:3；ssh:4
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 该节点类型，进程:1；网络:2；文件:3；ssh:4
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 该节点类型，进程:1；网络:2；文件:3；ssh:4
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 该节点类型，进程:1；网络:2；文件:3；ssh:4
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 各节点类型用到的时间，2022-11-29 00:00:00 格式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Time 各节点类型用到的时间，2022-11-29 00:00:00 格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 各节点类型用到的时间，2022-11-29 00:00:00 格式
注意：此字段可能返回 null，表示取不到有效值。
     * @param Time 各节点类型用到的时间，2022-11-29 00:00:00 格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 告警信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmInfo 告警信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AlarmInfo [] getAlarmInfo() {
        return this.AlarmInfo;
    }

    /**
     * Set 告警信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmInfo 告警信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmInfo(AlarmInfo [] AlarmInfo) {
        this.AlarmInfo = AlarmInfo;
    }

    /**
     * Get 进程名，当该节点为进程时生效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcName 进程名，当该节点为进程时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProcName() {
        return this.ProcName;
    }

    /**
     * Set 进程名，当该节点为进程时生效
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcName 进程名，当该节点为进程时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcName(String ProcName) {
        this.ProcName = ProcName;
    }

    /**
     * Get 命令行，当该节点为进程时生效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CmdLine 命令行，当该节点为进程时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCmdLine() {
        return this.CmdLine;
    }

    /**
     * Set 命令行，当该节点为进程时生效
注意：此字段可能返回 null，表示取不到有效值。
     * @param CmdLine 命令行，当该节点为进程时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCmdLine(String CmdLine) {
        this.CmdLine = CmdLine;
    }

    /**
     * Get 进程id，当该节点为进程时生效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Pid 进程id，当该节点为进程时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPid() {
        return this.Pid;
    }

    /**
     * Set 进程id，当该节点为进程时生效
注意：此字段可能返回 null，表示取不到有效值。
     * @param Pid 进程id，当该节点为进程时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPid(String Pid) {
        this.Pid = Pid;
    }

    /**
     * Get 文件md5，当该节点为文件时生效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileMd5 文件md5，当该节点为文件时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileMd5() {
        return this.FileMd5;
    }

    /**
     * Set 文件md5，当该节点为文件时生效
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileMd5 文件md5，当该节点为文件时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileMd5(String FileMd5) {
        this.FileMd5 = FileMd5;
    }

    /**
     * Get 文件写入内容，当该节点为文件时生效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileContent 文件写入内容，当该节点为文件时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileContent() {
        return this.FileContent;
    }

    /**
     * Set 文件写入内容，当该节点为文件时生效
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileContent 文件写入内容，当该节点为文件时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileContent(String FileContent) {
        this.FileContent = FileContent;
    }

    /**
     * Get 文件路径，当该节点为文件时生效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FilePath 文件路径，当该节点为文件时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set 文件路径，当该节点为文件时生效
注意：此字段可能返回 null，表示取不到有效值。
     * @param FilePath 文件路径，当该节点为文件时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    /**
     * Get 文件创建时间，当该节点为文件时生效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileCreateTime 文件创建时间，当该节点为文件时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileCreateTime() {
        return this.FileCreateTime;
    }

    /**
     * Set 文件创建时间，当该节点为文件时生效
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileCreateTime 文件创建时间，当该节点为文件时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileCreateTime(String FileCreateTime) {
        this.FileCreateTime = FileCreateTime;
    }

    /**
     * Get 请求目的地址，当该节点为网络时生效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Address 请求目的地址，当该节点为网络时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 请求目的地址，当该节点为网络时生效
注意：此字段可能返回 null，表示取不到有效值。
     * @param Address 请求目的地址，当该节点为网络时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 目标端口，当该节点为网络时生效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DstPort 目标端口，当该节点为网络时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDstPort() {
        return this.DstPort;
    }

    /**
     * Set 目标端口，当该节点为网络时生效
注意：此字段可能返回 null，表示取不到有效值。
     * @param DstPort 目标端口，当该节点为网络时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDstPort(Long DstPort) {
        this.DstPort = DstPort;
    }

    /**
     * Get 登录源ip，当该节点为ssh时生效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SrcIP 登录源ip，当该节点为ssh时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSrcIP() {
        return this.SrcIP;
    }

    /**
     * Set 登录源ip，当该节点为ssh时生效
注意：此字段可能返回 null，表示取不到有效值。
     * @param SrcIP 登录源ip，当该节点为ssh时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSrcIP(String SrcIP) {
        this.SrcIP = SrcIP;
    }

    /**
     * Get 登录用户名用户组，当该节点为ssh时生效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return User 登录用户名用户组，当该节点为ssh时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 登录用户名用户组，当该节点为ssh时生效
注意：此字段可能返回 null，表示取不到有效值。
     * @param User 登录用户名用户组，当该节点为ssh时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 漏洞名称，当该节点为漏洞时生效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VulName 漏洞名称，当该节点为漏洞时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set 漏洞名称，当该节点为漏洞时生效
注意：此字段可能返回 null，表示取不到有效值。
     * @param VulName 漏洞名称，当该节点为漏洞时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * Get 漏洞利用时间，当该节点为漏洞时生效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VulTime 漏洞利用时间，当该节点为漏洞时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVulTime() {
        return this.VulTime;
    }

    /**
     * Set 漏洞利用时间，当该节点为漏洞时生效
注意：此字段可能返回 null，表示取不到有效值。
     * @param VulTime 漏洞利用时间，当该节点为漏洞时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVulTime(String VulTime) {
        this.VulTime = VulTime;
    }

    /**
     * Get http请求内容，当该节点为漏洞时生效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HttpContent http请求内容，当该节点为漏洞时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHttpContent() {
        return this.HttpContent;
    }

    /**
     * Set http请求内容，当该节点为漏洞时生效
注意：此字段可能返回 null，表示取不到有效值。
     * @param HttpContent http请求内容，当该节点为漏洞时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttpContent(String HttpContent) {
        this.HttpContent = HttpContent;
    }

    /**
     * Get 漏洞利用者来源ip，当该节点为漏洞时生效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VulSrcIP 漏洞利用者来源ip，当该节点为漏洞时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVulSrcIP() {
        return this.VulSrcIP;
    }

    /**
     * Set 漏洞利用者来源ip，当该节点为漏洞时生效
注意：此字段可能返回 null，表示取不到有效值。
     * @param VulSrcIP 漏洞利用者来源ip，当该节点为漏洞时生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVulSrcIP(String VulSrcIP) {
        this.VulSrcIP = VulSrcIP;
    }

    /**
     * Get 点id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VertexId 点id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVertexId() {
        return this.VertexId;
    }

    /**
     * Set 点id
注意：此字段可能返回 null，表示取不到有效值。
     * @param VertexId 点id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVertexId(String VertexId) {
        this.VertexId = VertexId;
    }

    public VertexDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VertexDetail(VertexDetail source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.AlarmInfo != null) {
            this.AlarmInfo = new AlarmInfo[source.AlarmInfo.length];
            for (int i = 0; i < source.AlarmInfo.length; i++) {
                this.AlarmInfo[i] = new AlarmInfo(source.AlarmInfo[i]);
            }
        }
        if (source.ProcName != null) {
            this.ProcName = new String(source.ProcName);
        }
        if (source.CmdLine != null) {
            this.CmdLine = new String(source.CmdLine);
        }
        if (source.Pid != null) {
            this.Pid = new String(source.Pid);
        }
        if (source.FileMd5 != null) {
            this.FileMd5 = new String(source.FileMd5);
        }
        if (source.FileContent != null) {
            this.FileContent = new String(source.FileContent);
        }
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
        }
        if (source.FileCreateTime != null) {
            this.FileCreateTime = new String(source.FileCreateTime);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.DstPort != null) {
            this.DstPort = new Long(source.DstPort);
        }
        if (source.SrcIP != null) {
            this.SrcIP = new String(source.SrcIP);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.VulTime != null) {
            this.VulTime = new String(source.VulTime);
        }
        if (source.HttpContent != null) {
            this.HttpContent = new String(source.HttpContent);
        }
        if (source.VulSrcIP != null) {
            this.VulSrcIP = new String(source.VulSrcIP);
        }
        if (source.VertexId != null) {
            this.VertexId = new String(source.VertexId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamArrayObj(map, prefix + "AlarmInfo.", this.AlarmInfo);
        this.setParamSimple(map, prefix + "ProcName", this.ProcName);
        this.setParamSimple(map, prefix + "CmdLine", this.CmdLine);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "FileMd5", this.FileMd5);
        this.setParamSimple(map, prefix + "FileContent", this.FileContent);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);
        this.setParamSimple(map, prefix + "FileCreateTime", this.FileCreateTime);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "DstPort", this.DstPort);
        this.setParamSimple(map, prefix + "SrcIP", this.SrcIP);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "VulTime", this.VulTime);
        this.setParamSimple(map, prefix + "HttpContent", this.HttpContent);
        this.setParamSimple(map, prefix + "VulSrcIP", this.VulSrcIP);
        this.setParamSimple(map, prefix + "VertexId", this.VertexId);

    }
}

