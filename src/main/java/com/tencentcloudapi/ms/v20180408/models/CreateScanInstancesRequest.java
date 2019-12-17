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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateScanInstancesRequest extends AbstractModel{

    /**
    * 待扫描的app信息列表，一次最多提交20个
    */
    @SerializedName("AppInfos")
    @Expose
    private AppInfo [] AppInfos;

    /**
    * 扫描信息
    */
    @SerializedName("ScanInfo")
    @Expose
    private ScanInfo ScanInfo;

    /**
     * Get 待扫描的app信息列表，一次最多提交20个 
     * @return AppInfos 待扫描的app信息列表，一次最多提交20个
     */
    public AppInfo [] getAppInfos() {
        return this.AppInfos;
    }

    /**
     * Set 待扫描的app信息列表，一次最多提交20个
     * @param AppInfos 待扫描的app信息列表，一次最多提交20个
     */
    public void setAppInfos(AppInfo [] AppInfos) {
        this.AppInfos = AppInfos;
    }

    /**
     * Get 扫描信息 
     * @return ScanInfo 扫描信息
     */
    public ScanInfo getScanInfo() {
        return this.ScanInfo;
    }

    /**
     * Set 扫描信息
     * @param ScanInfo 扫描信息
     */
    public void setScanInfo(ScanInfo ScanInfo) {
        this.ScanInfo = ScanInfo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AppInfos.", this.AppInfos);
        this.setParamObj(map, prefix + "ScanInfo.", this.ScanInfo);

    }
}

