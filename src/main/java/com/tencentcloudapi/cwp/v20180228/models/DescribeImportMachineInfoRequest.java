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

public class DescribeImportMachineInfoRequest extends AbstractModel{

    /**
    * 服务器内网IP（默认）/ 服务器名称 / 服务器ID 数组
    */
    @SerializedName("MachineList")
    @Expose
    private String [] MachineList;

    /**
    * 批量导入的数据类型：Ip、Name、Id 三选一
    */
    @SerializedName("ImportType")
    @Expose
    private String ImportType;

    /**
     * Get 服务器内网IP（默认）/ 服务器名称 / 服务器ID 数组 
     * @return MachineList 服务器内网IP（默认）/ 服务器名称 / 服务器ID 数组
     */
    public String [] getMachineList() {
        return this.MachineList;
    }

    /**
     * Set 服务器内网IP（默认）/ 服务器名称 / 服务器ID 数组
     * @param MachineList 服务器内网IP（默认）/ 服务器名称 / 服务器ID 数组
     */
    public void setMachineList(String [] MachineList) {
        this.MachineList = MachineList;
    }

    /**
     * Get 批量导入的数据类型：Ip、Name、Id 三选一 
     * @return ImportType 批量导入的数据类型：Ip、Name、Id 三选一
     */
    public String getImportType() {
        return this.ImportType;
    }

    /**
     * Set 批量导入的数据类型：Ip、Name、Id 三选一
     * @param ImportType 批量导入的数据类型：Ip、Name、Id 三选一
     */
    public void setImportType(String ImportType) {
        this.ImportType = ImportType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MachineList.", this.MachineList);
        this.setParamSimple(map, prefix + "ImportType", this.ImportType);

    }
}

