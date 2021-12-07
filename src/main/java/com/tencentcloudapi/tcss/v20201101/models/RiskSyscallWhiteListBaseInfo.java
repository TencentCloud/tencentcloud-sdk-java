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

public class RiskSyscallWhiteListBaseInfo extends AbstractModel{

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
    * 连接进程路径
    */
    @SerializedName("ProcessPath")
    @Expose
    private String ProcessPath;

    /**
    * 系统调用名称列表
    */
    @SerializedName("SyscallNames")
    @Expose
    private String [] SyscallNames;

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
    * 是否是全局白名单，true全局
    */
    @SerializedName("IsGlobal")
    @Expose
    private Boolean IsGlobal;

    /**
    * 镜像id数组
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
     * Get 连接进程路径 
     * @return ProcessPath 连接进程路径
     */
    public String getProcessPath() {
        return this.ProcessPath;
    }

    /**
     * Set 连接进程路径
     * @param ProcessPath 连接进程路径
     */
    public void setProcessPath(String ProcessPath) {
        this.ProcessPath = ProcessPath;
    }

    /**
     * Get 系统调用名称列表 
     * @return SyscallNames 系统调用名称列表
     */
    public String [] getSyscallNames() {
        return this.SyscallNames;
    }

    /**
     * Set 系统调用名称列表
     * @param SyscallNames 系统调用名称列表
     */
    public void setSyscallNames(String [] SyscallNames) {
        this.SyscallNames = SyscallNames;
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
     * Get 镜像id数组 
     * @return ImageIds 镜像id数组
     */
    public String [] getImageIds() {
        return this.ImageIds;
    }

    /**
     * Set 镜像id数组
     * @param ImageIds 镜像id数组
     */
    public void setImageIds(String [] ImageIds) {
        this.ImageIds = ImageIds;
    }

    public RiskSyscallWhiteListBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RiskSyscallWhiteListBaseInfo(RiskSyscallWhiteListBaseInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.ImageCount != null) {
            this.ImageCount = new Long(source.ImageCount);
        }
        if (source.ProcessPath != null) {
            this.ProcessPath = new String(source.ProcessPath);
        }
        if (source.SyscallNames != null) {
            this.SyscallNames = new String[source.SyscallNames.length];
            for (int i = 0; i < source.SyscallNames.length; i++) {
                this.SyscallNames[i] = new String(source.SyscallNames[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
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
        this.setParamSimple(map, prefix + "ProcessPath", this.ProcessPath);
        this.setParamArraySimple(map, prefix + "SyscallNames.", this.SyscallNames);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamArraySimple(map, prefix + "ImageIds.", this.ImageIds);

    }
}

