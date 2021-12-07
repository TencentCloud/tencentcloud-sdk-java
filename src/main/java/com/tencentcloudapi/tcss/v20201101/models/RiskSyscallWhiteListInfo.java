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

public class RiskSyscallWhiteListInfo extends AbstractModel{

    /**
    * 镜像id数组，为空代表全部
    */
    @SerializedName("ImageIds")
    @Expose
    private String [] ImageIds;

    /**
    * 系统调用名称，通过DescribeRiskSyscallNames接口获取枚举列表
    */
    @SerializedName("SyscallNames")
    @Expose
    private String [] SyscallNames;

    /**
    * 目标进程
    */
    @SerializedName("ProcessPath")
    @Expose
    private String ProcessPath;

    /**
    * 白名单id，如果新建则id为空
    */
    @SerializedName("Id")
    @Expose
    private String Id;

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

    /**
     * Get 系统调用名称，通过DescribeRiskSyscallNames接口获取枚举列表 
     * @return SyscallNames 系统调用名称，通过DescribeRiskSyscallNames接口获取枚举列表
     */
    public String [] getSyscallNames() {
        return this.SyscallNames;
    }

    /**
     * Set 系统调用名称，通过DescribeRiskSyscallNames接口获取枚举列表
     * @param SyscallNames 系统调用名称，通过DescribeRiskSyscallNames接口获取枚举列表
     */
    public void setSyscallNames(String [] SyscallNames) {
        this.SyscallNames = SyscallNames;
    }

    /**
     * Get 目标进程 
     * @return ProcessPath 目标进程
     */
    public String getProcessPath() {
        return this.ProcessPath;
    }

    /**
     * Set 目标进程
     * @param ProcessPath 目标进程
     */
    public void setProcessPath(String ProcessPath) {
        this.ProcessPath = ProcessPath;
    }

    /**
     * Get 白名单id，如果新建则id为空 
     * @return Id 白名单id，如果新建则id为空
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 白名单id，如果新建则id为空
     * @param Id 白名单id，如果新建则id为空
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    public RiskSyscallWhiteListInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RiskSyscallWhiteListInfo(RiskSyscallWhiteListInfo source) {
        if (source.ImageIds != null) {
            this.ImageIds = new String[source.ImageIds.length];
            for (int i = 0; i < source.ImageIds.length; i++) {
                this.ImageIds[i] = new String(source.ImageIds[i]);
            }
        }
        if (source.SyscallNames != null) {
            this.SyscallNames = new String[source.SyscallNames.length];
            for (int i = 0; i < source.SyscallNames.length; i++) {
                this.SyscallNames[i] = new String(source.SyscallNames[i]);
            }
        }
        if (source.ProcessPath != null) {
            this.ProcessPath = new String(source.ProcessPath);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ImageIds.", this.ImageIds);
        this.setParamArraySimple(map, prefix + "SyscallNames.", this.SyscallNames);
        this.setParamSimple(map, prefix + "ProcessPath", this.ProcessPath);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

