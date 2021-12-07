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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReverseShellWhiteListBaseInfo extends AbstractModel{

    /**
    * 白名单id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 镜像数量
    */
    @SerializedName("ImageCount")
    @Expose
    private Long ImageCount;

    /**
    * 连接进程名字
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * 目标地址ip
    */
    @SerializedName("DstIp")
    @Expose
    private String DstIp;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 目标端口
    */
    @SerializedName("DstPort")
    @Expose
    private String DstPort;

    /**
    * 是否是全局白名单，true全局
    */
    @SerializedName("IsGlobal")
    @Expose
    private Boolean IsGlobal;

    /**
    * 镜像id数组，为空代表全部
    */
    @SerializedName("ImageIds")
    @Expose
    private String [] ImageIds;

    /**
     * Get 白名单id 
     * @return Id 白名单id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 白名单id
     * @param Id 白名单id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 镜像数量 
     * @return ImageCount 镜像数量
     */
    public Long getImageCount() {
        return this.ImageCount;
    }

    /**
     * Set 镜像数量
     * @param ImageCount 镜像数量
     */
    public void setImageCount(Long ImageCount) {
        this.ImageCount = ImageCount;
    }

    /**
     * Get 连接进程名字 
     * @return ProcessName 连接进程名字
     */
    public String getProcessName() {
        return this.ProcessName;
    }

    /**
     * Set 连接进程名字
     * @param ProcessName 连接进程名字
     */
    public void setProcessName(String ProcessName) {
        this.ProcessName = ProcessName;
    }

    /**
     * Get 目标地址ip 
     * @return DstIp 目标地址ip
     */
    public String getDstIp() {
        return this.DstIp;
    }

    /**
     * Set 目标地址ip
     * @param DstIp 目标地址ip
     */
    public void setDstIp(String DstIp) {
        this.DstIp = DstIp;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 目标端口 
     * @return DstPort 目标端口
     */
    public String getDstPort() {
        return this.DstPort;
    }

    /**
     * Set 目标端口
     * @param DstPort 目标端口
     */
    public void setDstPort(String DstPort) {
        this.DstPort = DstPort;
    }

    /**
     * Get 是否是全局白名单，true全局 
     * @return IsGlobal 是否是全局白名单，true全局
     */
    public Boolean getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set 是否是全局白名单，true全局
     * @param IsGlobal 是否是全局白名单，true全局
     */
    public void setIsGlobal(Boolean IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get 镜像id数组，为空代表全部 
     * @return ImageIds 镜像id数组，为空代表全部
     */
    public String [] getImageIds() {
        return this.ImageIds;
    }

    /**
     * Set 镜像id数组，为空代表全部
     * @param ImageIds 镜像id数组，为空代表全部
     */
    public void setImageIds(String [] ImageIds) {
        this.ImageIds = ImageIds;
    }

    public ReverseShellWhiteListBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReverseShellWhiteListBaseInfo(ReverseShellWhiteListBaseInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.ImageCount != null) {
            this.ImageCount = new Long(source.ImageCount);
        }
        if (source.ProcessName != null) {
            this.ProcessName = new String(source.ProcessName);
        }
        if (source.DstIp != null) {
            this.DstIp = new String(source.DstIp);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.DstPort != null) {
            this.DstPort = new String(source.DstPort);
        }
        if (source.IsGlobal != null) {
            this.IsGlobal = new Boolean(source.IsGlobal);
        }
        if (source.ImageIds != null) {
            this.ImageIds = new String[source.ImageIds.length];
            for (int i = 0; i < source.ImageIds.length; i++) {
                this.ImageIds[i] = new String(source.ImageIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ImageCount", this.ImageCount);
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamSimple(map, prefix + "DstIp", this.DstIp);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "DstPort", this.DstPort);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamArraySimple(map, prefix + "ImageIds.", this.ImageIds);

    }
}

