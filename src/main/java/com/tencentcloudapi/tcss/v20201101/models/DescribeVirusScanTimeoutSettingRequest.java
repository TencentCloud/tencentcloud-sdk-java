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

public class DescribeVirusScanTimeoutSettingRequest extends AbstractModel{

    /**
    * 设置类型0一键检测，1定时检测
    */
    @SerializedName("ScanType")
    @Expose
    private Long ScanType;

    /**
     * Get 设置类型0一键检测，1定时检测 
     * @return ScanType 设置类型0一键检测，1定时检测
     */
    public Long getScanType() {
        return this.ScanType;
    }

    /**
     * Set 设置类型0一键检测，1定时检测
     * @param ScanType 设置类型0一键检测，1定时检测
     */
    public void setScanType(Long ScanType) {
        this.ScanType = ScanType;
    }

    public DescribeVirusScanTimeoutSettingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVirusScanTimeoutSettingRequest(DescribeVirusScanTimeoutSettingRequest source) {
        if (source.ScanType != null) {
            this.ScanType = new Long(source.ScanType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScanType", this.ScanType);

    }
}

