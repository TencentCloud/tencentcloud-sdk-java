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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLivePackageInfoRequest extends AbstractModel{

    /**
    * 包类型，可选值：
0：流量包；
1：转码包。
    */
    @SerializedName("PackageType")
    @Expose
    private Long PackageType;

    /**
     * Get 包类型，可选值：
0：流量包；
1：转码包。 
     * @return PackageType 包类型，可选值：
0：流量包；
1：转码包。
     */
    public Long getPackageType() {
        return this.PackageType;
    }

    /**
     * Set 包类型，可选值：
0：流量包；
1：转码包。
     * @param PackageType 包类型，可选值：
0：流量包；
1：转码包。
     */
    public void setPackageType(Long PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);

    }
}

