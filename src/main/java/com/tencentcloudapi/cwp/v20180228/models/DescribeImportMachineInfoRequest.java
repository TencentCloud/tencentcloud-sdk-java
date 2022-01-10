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
    * 服务器内网IP（默认）/ 服务器名称 / 服务器ID 数组 (最大 1000条)
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
    * 该参数已作废.
    */
    @SerializedName("IsQueryProMachine")
    @Expose
    private Boolean IsQueryProMachine;

    /**
    * 过滤条件。
<li>Version - String  是否必填：否 - 当前防护版本（ PRO_VERSION：专业版 | BASIC_VERSION：基础版 | Flagship : 旗舰版 | ProtectedMachines: 专业版+旗舰版）</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
     * Get 服务器内网IP（默认）/ 服务器名称 / 服务器ID 数组 (最大 1000条) 
     * @return MachineList 服务器内网IP（默认）/ 服务器名称 / 服务器ID 数组 (最大 1000条)
     */
    public String [] getMachineList() {
        return this.MachineList;
    }

    /**
     * Set 服务器内网IP（默认）/ 服务器名称 / 服务器ID 数组 (最大 1000条)
     * @param MachineList 服务器内网IP（默认）/ 服务器名称 / 服务器ID 数组 (最大 1000条)
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
     * Get 该参数已作废. 
     * @return IsQueryProMachine 该参数已作废.
     */
    public Boolean getIsQueryProMachine() {
        return this.IsQueryProMachine;
    }

    /**
     * Set 该参数已作废.
     * @param IsQueryProMachine 该参数已作废.
     */
    public void setIsQueryProMachine(Boolean IsQueryProMachine) {
        this.IsQueryProMachine = IsQueryProMachine;
    }

    /**
     * Get 过滤条件。
<li>Version - String  是否必填：否 - 当前防护版本（ PRO_VERSION：专业版 | BASIC_VERSION：基础版 | Flagship : 旗舰版 | ProtectedMachines: 专业版+旗舰版）</li> 
     * @return Filters 过滤条件。
<li>Version - String  是否必填：否 - 当前防护版本（ PRO_VERSION：专业版 | BASIC_VERSION：基础版 | Flagship : 旗舰版 | ProtectedMachines: 专业版+旗舰版）</li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。
<li>Version - String  是否必填：否 - 当前防护版本（ PRO_VERSION：专业版 | BASIC_VERSION：基础版 | Flagship : 旗舰版 | ProtectedMachines: 专业版+旗舰版）</li>
     * @param Filters 过滤条件。
<li>Version - String  是否必填：否 - 当前防护版本（ PRO_VERSION：专业版 | BASIC_VERSION：基础版 | Flagship : 旗舰版 | ProtectedMachines: 专业版+旗舰版）</li>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    public DescribeImportMachineInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImportMachineInfoRequest(DescribeImportMachineInfoRequest source) {
        if (source.MachineList != null) {
            this.MachineList = new String[source.MachineList.length];
            for (int i = 0; i < source.MachineList.length; i++) {
                this.MachineList[i] = new String(source.MachineList[i]);
            }
        }
        if (source.ImportType != null) {
            this.ImportType = new String(source.ImportType);
        }
        if (source.IsQueryProMachine != null) {
            this.IsQueryProMachine = new Boolean(source.IsQueryProMachine);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MachineList.", this.MachineList);
        this.setParamSimple(map, prefix + "ImportType", this.ImportType);
        this.setParamSimple(map, prefix + "IsQueryProMachine", this.IsQueryProMachine);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

