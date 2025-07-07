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

public class RansomDefenseEvent extends AbstractModel {

    /**
    * 事件id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 主机uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * cvm uuid
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 主机名称
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * 事件状态 0待处理，1已处理，2已信任，3处理中，4已恢复备份
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 被篡改文件路径
    */
    @SerializedName("BaitFilePath")
    @Expose
    private String BaitFilePath;

    /**
    * 恶意文件路径
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * 恶意进程id
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * 恶意进程参数
    */
    @SerializedName("PidParam")
    @Expose
    private String PidParam;

    /**
    * 恶意文件大小
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * 恶意文件md5
    */
    @SerializedName("FileMd5")
    @Expose
    private String FileMd5;

    /**
    * 事件类型：0加密勒索，1文件篡改
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 事件发送时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * cvm 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 事件修改事件
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 策略id
    */
    @SerializedName("StrategyId")
    @Expose
    private Long StrategyId;

    /**
    * 策略名称
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * 主机外网ip
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * 主机内网ip
    */
    @SerializedName("WanIp")
    @Expose
    private String WanIp;

    /**
    * 进程树 base64 json
    */
    @SerializedName("PsTree")
    @Expose
    private String PsTree;

    /**
    * 进程启动时间
    */
    @SerializedName("ProcessStartTime")
    @Expose
    private String ProcessStartTime;

    /**
    * 主机拥有快照备份数
    */
    @SerializedName("SnapshotNum")
    @Expose
    private Long SnapshotNum;

    /**
     * Get 事件id 
     * @return Id 事件id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 事件id
     * @param Id 事件id
     */
    public void setId(Long Id) {
        this.Id = Id;
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
     * Get cvm uuid 
     * @return Quuid cvm uuid
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set cvm uuid
     * @param Quuid cvm uuid
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 主机名称 
     * @return HostName 主机名称
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set 主机名称
     * @param HostName 主机名称
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get 事件状态 0待处理，1已处理，2已信任，3处理中，4已恢复备份 
     * @return Status 事件状态 0待处理，1已处理，2已信任，3处理中，4已恢复备份
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 事件状态 0待处理，1已处理，2已信任，3处理中，4已恢复备份
     * @param Status 事件状态 0待处理，1已处理，2已信任，3处理中，4已恢复备份
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 被篡改文件路径 
     * @return BaitFilePath 被篡改文件路径
     */
    public String getBaitFilePath() {
        return this.BaitFilePath;
    }

    /**
     * Set 被篡改文件路径
     * @param BaitFilePath 被篡改文件路径
     */
    public void setBaitFilePath(String BaitFilePath) {
        this.BaitFilePath = BaitFilePath;
    }

    /**
     * Get 恶意文件路径 
     * @return FilePath 恶意文件路径
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set 恶意文件路径
     * @param FilePath 恶意文件路径
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    /**
     * Get 恶意进程id 
     * @return Pid 恶意进程id
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set 恶意进程id
     * @param Pid 恶意进程id
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get 恶意进程参数 
     * @return PidParam 恶意进程参数
     */
    public String getPidParam() {
        return this.PidParam;
    }

    /**
     * Set 恶意进程参数
     * @param PidParam 恶意进程参数
     */
    public void setPidParam(String PidParam) {
        this.PidParam = PidParam;
    }

    /**
     * Get 恶意文件大小 
     * @return FileSize 恶意文件大小
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 恶意文件大小
     * @param FileSize 恶意文件大小
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get 恶意文件md5 
     * @return FileMd5 恶意文件md5
     */
    public String getFileMd5() {
        return this.FileMd5;
    }

    /**
     * Set 恶意文件md5
     * @param FileMd5 恶意文件md5
     */
    public void setFileMd5(String FileMd5) {
        this.FileMd5 = FileMd5;
    }

    /**
     * Get 事件类型：0加密勒索，1文件篡改 
     * @return Type 事件类型：0加密勒索，1文件篡改
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 事件类型：0加密勒索，1文件篡改
     * @param Type 事件类型：0加密勒索，1文件篡改
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 事件发送时间 
     * @return CreateTime 事件发送时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 事件发送时间
     * @param CreateTime 事件发送时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get cvm 实例id 
     * @return InstanceId cvm 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set cvm 实例id
     * @param InstanceId cvm 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 事件修改事件 
     * @return ModifyTime 事件修改事件
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 事件修改事件
     * @param ModifyTime 事件修改事件
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 策略id 
     * @return StrategyId 策略id
     */
    public Long getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set 策略id
     * @param StrategyId 策略id
     */
    public void setStrategyId(Long StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get 策略名称 
     * @return StrategyName 策略名称
     */
    public String getStrategyName() {
        return this.StrategyName;
    }

    /**
     * Set 策略名称
     * @param StrategyName 策略名称
     */
    public void setStrategyName(String StrategyName) {
        this.StrategyName = StrategyName;
    }

    /**
     * Get 主机外网ip 
     * @return HostIp 主机外网ip
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set 主机外网ip
     * @param HostIp 主机外网ip
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get 主机内网ip 
     * @return WanIp 主机内网ip
     */
    public String getWanIp() {
        return this.WanIp;
    }

    /**
     * Set 主机内网ip
     * @param WanIp 主机内网ip
     */
    public void setWanIp(String WanIp) {
        this.WanIp = WanIp;
    }

    /**
     * Get 进程树 base64 json 
     * @return PsTree 进程树 base64 json
     */
    public String getPsTree() {
        return this.PsTree;
    }

    /**
     * Set 进程树 base64 json
     * @param PsTree 进程树 base64 json
     */
    public void setPsTree(String PsTree) {
        this.PsTree = PsTree;
    }

    /**
     * Get 进程启动时间 
     * @return ProcessStartTime 进程启动时间
     */
    public String getProcessStartTime() {
        return this.ProcessStartTime;
    }

    /**
     * Set 进程启动时间
     * @param ProcessStartTime 进程启动时间
     */
    public void setProcessStartTime(String ProcessStartTime) {
        this.ProcessStartTime = ProcessStartTime;
    }

    /**
     * Get 主机拥有快照备份数 
     * @return SnapshotNum 主机拥有快照备份数
     */
    public Long getSnapshotNum() {
        return this.SnapshotNum;
    }

    /**
     * Set 主机拥有快照备份数
     * @param SnapshotNum 主机拥有快照备份数
     */
    public void setSnapshotNum(Long SnapshotNum) {
        this.SnapshotNum = SnapshotNum;
    }

    public RansomDefenseEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RansomDefenseEvent(RansomDefenseEvent source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.BaitFilePath != null) {
            this.BaitFilePath = new String(source.BaitFilePath);
        }
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
        }
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
        if (source.PidParam != null) {
            this.PidParam = new String(source.PidParam);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.FileMd5 != null) {
            this.FileMd5 = new String(source.FileMd5);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.StrategyId != null) {
            this.StrategyId = new Long(source.StrategyId);
        }
        if (source.StrategyName != null) {
            this.StrategyName = new String(source.StrategyName);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.WanIp != null) {
            this.WanIp = new String(source.WanIp);
        }
        if (source.PsTree != null) {
            this.PsTree = new String(source.PsTree);
        }
        if (source.ProcessStartTime != null) {
            this.ProcessStartTime = new String(source.ProcessStartTime);
        }
        if (source.SnapshotNum != null) {
            this.SnapshotNum = new Long(source.SnapshotNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "BaitFilePath", this.BaitFilePath);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "PidParam", this.PidParam);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "FileMd5", this.FileMd5);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamSimple(map, prefix + "StrategyName", this.StrategyName);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "WanIp", this.WanIp);
        this.setParamSimple(map, prefix + "PsTree", this.PsTree);
        this.setParamSimple(map, prefix + "ProcessStartTime", this.ProcessStartTime);
        this.setParamSimple(map, prefix + "SnapshotNum", this.SnapshotNum);

    }
}

