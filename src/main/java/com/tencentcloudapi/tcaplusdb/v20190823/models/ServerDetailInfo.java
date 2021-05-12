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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServerDetailInfo extends AbstractModel{

    /**
    * svr唯一id
    */
    @SerializedName("ServerUid")
    @Expose
    private String ServerUid;

    /**
    * 机器类型
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * 内存占用量
    */
    @SerializedName("MemoryRate")
    @Expose
    private Long MemoryRate;

    /**
    * 磁盘占用量
    */
    @SerializedName("DiskRate")
    @Expose
    private Long DiskRate;

    /**
    * 读次数
    */
    @SerializedName("ReadNum")
    @Expose
    private Long ReadNum;

    /**
    * 写次数
    */
    @SerializedName("WriteNum")
    @Expose
    private Long WriteNum;

    /**
     * Get svr唯一id 
     * @return ServerUid svr唯一id
     */
    public String getServerUid() {
        return this.ServerUid;
    }

    /**
     * Set svr唯一id
     * @param ServerUid svr唯一id
     */
    public void setServerUid(String ServerUid) {
        this.ServerUid = ServerUid;
    }

    /**
     * Get 机器类型 
     * @return MachineType 机器类型
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set 机器类型
     * @param MachineType 机器类型
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get 内存占用量 
     * @return MemoryRate 内存占用量
     */
    public Long getMemoryRate() {
        return this.MemoryRate;
    }

    /**
     * Set 内存占用量
     * @param MemoryRate 内存占用量
     */
    public void setMemoryRate(Long MemoryRate) {
        this.MemoryRate = MemoryRate;
    }

    /**
     * Get 磁盘占用量 
     * @return DiskRate 磁盘占用量
     */
    public Long getDiskRate() {
        return this.DiskRate;
    }

    /**
     * Set 磁盘占用量
     * @param DiskRate 磁盘占用量
     */
    public void setDiskRate(Long DiskRate) {
        this.DiskRate = DiskRate;
    }

    /**
     * Get 读次数 
     * @return ReadNum 读次数
     */
    public Long getReadNum() {
        return this.ReadNum;
    }

    /**
     * Set 读次数
     * @param ReadNum 读次数
     */
    public void setReadNum(Long ReadNum) {
        this.ReadNum = ReadNum;
    }

    /**
     * Get 写次数 
     * @return WriteNum 写次数
     */
    public Long getWriteNum() {
        return this.WriteNum;
    }

    /**
     * Set 写次数
     * @param WriteNum 写次数
     */
    public void setWriteNum(Long WriteNum) {
        this.WriteNum = WriteNum;
    }

    public ServerDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServerDetailInfo(ServerDetailInfo source) {
        if (source.ServerUid != null) {
            this.ServerUid = new String(source.ServerUid);
        }
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.MemoryRate != null) {
            this.MemoryRate = new Long(source.MemoryRate);
        }
        if (source.DiskRate != null) {
            this.DiskRate = new Long(source.DiskRate);
        }
        if (source.ReadNum != null) {
            this.ReadNum = new Long(source.ReadNum);
        }
        if (source.WriteNum != null) {
            this.WriteNum = new Long(source.WriteNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServerUid", this.ServerUid);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "MemoryRate", this.MemoryRate);
        this.setParamSimple(map, prefix + "DiskRate", this.DiskRate);
        this.setParamSimple(map, prefix + "ReadNum", this.ReadNum);
        this.setParamSimple(map, prefix + "WriteNum", this.WriteNum);

    }
}

