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
package com.tencentcloudapi.cws.v20180312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSitesScansRequest extends AbstractModel{

    /**
    * 站点的ID列表
    */
    @SerializedName("SiteIds")
    @Expose
    private Long [] SiteIds;

    /**
    * 扫描模式，normal-正常扫描；deep-深度扫描
    */
    @SerializedName("ScannerType")
    @Expose
    private String ScannerType;

    /**
    * 扫描速率限制，每秒发送X个HTTP请求
    */
    @SerializedName("RateLimit")
    @Expose
    private Long RateLimit;

    /**
     * Get 站点的ID列表 
     * @return SiteIds 站点的ID列表
     */
    public Long [] getSiteIds() {
        return this.SiteIds;
    }

    /**
     * Set 站点的ID列表
     * @param SiteIds 站点的ID列表
     */
    public void setSiteIds(Long [] SiteIds) {
        this.SiteIds = SiteIds;
    }

    /**
     * Get 扫描模式，normal-正常扫描；deep-深度扫描 
     * @return ScannerType 扫描模式，normal-正常扫描；deep-深度扫描
     */
    public String getScannerType() {
        return this.ScannerType;
    }

    /**
     * Set 扫描模式，normal-正常扫描；deep-深度扫描
     * @param ScannerType 扫描模式，normal-正常扫描；deep-深度扫描
     */
    public void setScannerType(String ScannerType) {
        this.ScannerType = ScannerType;
    }

    /**
     * Get 扫描速率限制，每秒发送X个HTTP请求 
     * @return RateLimit 扫描速率限制，每秒发送X个HTTP请求
     */
    public Long getRateLimit() {
        return this.RateLimit;
    }

    /**
     * Set 扫描速率限制，每秒发送X个HTTP请求
     * @param RateLimit 扫描速率限制，每秒发送X个HTTP请求
     */
    public void setRateLimit(Long RateLimit) {
        this.RateLimit = RateLimit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SiteIds.", this.SiteIds);
        this.setParamSimple(map, prefix + "ScannerType", this.ScannerType);
        this.setParamSimple(map, prefix + "RateLimit", this.RateLimit);

    }
}

