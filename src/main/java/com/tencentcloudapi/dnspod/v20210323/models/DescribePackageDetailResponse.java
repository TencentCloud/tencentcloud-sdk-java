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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePackageDetailResponse extends AbstractModel{

    /**
    * 套餐配置详情
    */
    @SerializedName("Info")
    @Expose
    private PackageDetailItem [] Info;

    /**
    * 套餐代码列表
    */
    @SerializedName("LevelMap")
    @Expose
    private String [] LevelMap;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 套餐配置详情 
     * @return Info 套餐配置详情
     */
    public PackageDetailItem [] getInfo() {
        return this.Info;
    }

    /**
     * Set 套餐配置详情
     * @param Info 套餐配置详情
     */
    public void setInfo(PackageDetailItem [] Info) {
        this.Info = Info;
    }

    /**
     * Get 套餐代码列表 
     * @return LevelMap 套餐代码列表
     */
    public String [] getLevelMap() {
        return this.LevelMap;
    }

    /**
     * Set 套餐代码列表
     * @param LevelMap 套餐代码列表
     */
    public void setLevelMap(String [] LevelMap) {
        this.LevelMap = LevelMap;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribePackageDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePackageDetailResponse(DescribePackageDetailResponse source) {
        if (source.Info != null) {
            this.Info = new PackageDetailItem[source.Info.length];
            for (int i = 0; i < source.Info.length; i++) {
                this.Info[i] = new PackageDetailItem(source.Info[i]);
            }
        }
        if (source.LevelMap != null) {
            this.LevelMap = new String[source.LevelMap.length];
            for (int i = 0; i < source.LevelMap.length; i++) {
                this.LevelMap[i] = new String(source.LevelMap[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Info.", this.Info);
        this.setParamArraySimple(map, prefix + "LevelMap.", this.LevelMap);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

