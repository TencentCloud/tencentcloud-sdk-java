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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGPUInfoRequest extends AbstractModel {

    /**
    * 实例机型名称，默认值""
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 操作系统oskey，默认值""
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
     * Get 实例机型名称，默认值"" 
     * @return InstanceType 实例机型名称，默认值""
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例机型名称，默认值""
     * @param InstanceType 实例机型名称，默认值""
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 操作系统oskey，默认值"" 
     * @return OsName 操作系统oskey，默认值""
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set 操作系统oskey，默认值""
     * @param OsName 操作系统oskey，默认值""
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    public DescribeGPUInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGPUInfoRequest(DescribeGPUInfoRequest source) {
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.OsName != null) {
            this.OsName = new String(source.OsName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "OsName", this.OsName);

    }
}

