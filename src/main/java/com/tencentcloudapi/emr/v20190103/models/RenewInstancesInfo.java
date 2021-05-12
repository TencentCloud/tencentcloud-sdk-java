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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RenewInstancesInfo extends AbstractModel{

    /**
    * 节点资源ID
    */
    @SerializedName("EmrResourceId")
    @Expose
    private String EmrResourceId;

    /**
    * 节点类型。0:common节点；1:master节点
；2:core节点；3:task节点
    */
    @SerializedName("Flag")
    @Expose
    private Long Flag;

    /**
    * 内网IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 节点内存描述
    */
    @SerializedName("MemDesc")
    @Expose
    private String MemDesc;

    /**
    * 节点核数
    */
    @SerializedName("CpuNum")
    @Expose
    private Long CpuNum;

    /**
    * 硬盘大小
    */
    @SerializedName("DiskSize")
    @Expose
    private String DiskSize;

    /**
    * 过期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 节点规格
    */
    @SerializedName("Spec")
    @Expose
    private String Spec;

    /**
    * 磁盘类型
    */
    @SerializedName("StorageType")
    @Expose
    private Long StorageType;

    /**
     * Get 节点资源ID 
     * @return EmrResourceId 节点资源ID
     */
    public String getEmrResourceId() {
        return this.EmrResourceId;
    }

    /**
     * Set 节点资源ID
     * @param EmrResourceId 节点资源ID
     */
    public void setEmrResourceId(String EmrResourceId) {
        this.EmrResourceId = EmrResourceId;
    }

    /**
     * Get 节点类型。0:common节点；1:master节点
；2:core节点；3:task节点 
     * @return Flag 节点类型。0:common节点；1:master节点
；2:core节点；3:task节点
     */
    public Long getFlag() {
        return this.Flag;
    }

    /**
     * Set 节点类型。0:common节点；1:master节点
；2:core节点；3:task节点
     * @param Flag 节点类型。0:common节点；1:master节点
；2:core节点；3:task节点
     */
    public void setFlag(Long Flag) {
        this.Flag = Flag;
    }

    /**
     * Get 内网IP 
     * @return Ip 内网IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 内网IP
     * @param Ip 内网IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 节点内存描述 
     * @return MemDesc 节点内存描述
     */
    public String getMemDesc() {
        return this.MemDesc;
    }

    /**
     * Set 节点内存描述
     * @param MemDesc 节点内存描述
     */
    public void setMemDesc(String MemDesc) {
        this.MemDesc = MemDesc;
    }

    /**
     * Get 节点核数 
     * @return CpuNum 节点核数
     */
    public Long getCpuNum() {
        return this.CpuNum;
    }

    /**
     * Set 节点核数
     * @param CpuNum 节点核数
     */
    public void setCpuNum(Long CpuNum) {
        this.CpuNum = CpuNum;
    }

    /**
     * Get 硬盘大小 
     * @return DiskSize 硬盘大小
     */
    public String getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 硬盘大小
     * @param DiskSize 硬盘大小
     */
    public void setDiskSize(String DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 过期时间 
     * @return ExpireTime 过期时间
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间
     * @param ExpireTime 过期时间
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 节点规格 
     * @return Spec 节点规格
     */
    public String getSpec() {
        return this.Spec;
    }

    /**
     * Set 节点规格
     * @param Spec 节点规格
     */
    public void setSpec(String Spec) {
        this.Spec = Spec;
    }

    /**
     * Get 磁盘类型 
     * @return StorageType 磁盘类型
     */
    public Long getStorageType() {
        return this.StorageType;
    }

    /**
     * Set 磁盘类型
     * @param StorageType 磁盘类型
     */
    public void setStorageType(Long StorageType) {
        this.StorageType = StorageType;
    }

    public RenewInstancesInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenewInstancesInfo(RenewInstancesInfo source) {
        if (source.EmrResourceId != null) {
            this.EmrResourceId = new String(source.EmrResourceId);
        }
        if (source.Flag != null) {
            this.Flag = new Long(source.Flag);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.MemDesc != null) {
            this.MemDesc = new String(source.MemDesc);
        }
        if (source.CpuNum != null) {
            this.CpuNum = new Long(source.CpuNum);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new String(source.DiskSize);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.Spec != null) {
            this.Spec = new String(source.Spec);
        }
        if (source.StorageType != null) {
            this.StorageType = new Long(source.StorageType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EmrResourceId", this.EmrResourceId);
        this.setParamSimple(map, prefix + "Flag", this.Flag);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "MemDesc", this.MemDesc);
        this.setParamSimple(map, prefix + "CpuNum", this.CpuNum);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Spec", this.Spec);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);

    }
}

