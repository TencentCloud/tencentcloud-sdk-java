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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAggrSoftDeviceListRequest extends AbstractModel {

    /**
    * 软件名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 操作系统
    */
    @SerializedName("OsType")
    @Expose
    private Long OsType;

    /**
     * Get 软件名 
     * @return Name 软件名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 软件名
     * @param Name 软件名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 操作系统 
     * @return OsType 操作系统
     */
    public Long getOsType() {
        return this.OsType;
    }

    /**
     * Set 操作系统
     * @param OsType 操作系统
     */
    public void setOsType(Long OsType) {
        this.OsType = OsType;
    }

    public DescribeAggrSoftDeviceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAggrSoftDeviceListRequest(DescribeAggrSoftDeviceListRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.OsType != null) {
            this.OsType = new Long(source.OsType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "OsType", this.OsType);

    }
}

