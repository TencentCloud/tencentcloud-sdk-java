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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyModuleConfigRequest extends AbstractModel{

    /**
    * 模块ID。
    */
    @SerializedName("ModuleId")
    @Expose
    private String ModuleId;

    /**
    * 机型ID。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 默认数据盘大小，单位：G。范围不得超过数据盘范围大小，详看DescribeConfig。
    */
    @SerializedName("DefaultDataDiskSize")
    @Expose
    private Long DefaultDataDiskSize;

    /**
     * Get 模块ID。 
     * @return ModuleId 模块ID。
     */
    public String getModuleId() {
        return this.ModuleId;
    }

    /**
     * Set 模块ID。
     * @param ModuleId 模块ID。
     */
    public void setModuleId(String ModuleId) {
        this.ModuleId = ModuleId;
    }

    /**
     * Get 机型ID。 
     * @return InstanceType 机型ID。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 机型ID。
     * @param InstanceType 机型ID。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 默认数据盘大小，单位：G。范围不得超过数据盘范围大小，详看DescribeConfig。 
     * @return DefaultDataDiskSize 默认数据盘大小，单位：G。范围不得超过数据盘范围大小，详看DescribeConfig。
     */
    public Long getDefaultDataDiskSize() {
        return this.DefaultDataDiskSize;
    }

    /**
     * Set 默认数据盘大小，单位：G。范围不得超过数据盘范围大小，详看DescribeConfig。
     * @param DefaultDataDiskSize 默认数据盘大小，单位：G。范围不得超过数据盘范围大小，详看DescribeConfig。
     */
    public void setDefaultDataDiskSize(Long DefaultDataDiskSize) {
        this.DefaultDataDiskSize = DefaultDataDiskSize;
    }

    public ModifyModuleConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyModuleConfigRequest(ModifyModuleConfigRequest source) {
        if (source.ModuleId != null) {
            this.ModuleId = new String(source.ModuleId);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.DefaultDataDiskSize != null) {
            this.DefaultDataDiskSize = new Long(source.DefaultDataDiskSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModuleId", this.ModuleId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "DefaultDataDiskSize", this.DefaultDataDiskSize);

    }
}

