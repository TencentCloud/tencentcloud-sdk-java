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

public class DescribeLiveDomainsRequest extends AbstractModel{

    /**
    * 域名状态过滤。0-停用，1-启用。
    */
    @SerializedName("DomainStatus")
    @Expose
    private Long DomainStatus;

    /**
    * 域名类型过滤。0-推流，1-播放。
    */
    @SerializedName("DomainType")
    @Expose
    private Long DomainType;

    /**
    * 分页大小，范围：10~100。默认10。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 取第几页，范围：1~100000。默认1。
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * 0 普通直播 1慢直播 默认0。
    */
    @SerializedName("IsDelayLive")
    @Expose
    private Long IsDelayLive;

    /**
    * 域名前缀。
    */
    @SerializedName("DomainPrefix")
    @Expose
    private String DomainPrefix;

    /**
     * Get 域名状态过滤。0-停用，1-启用。 
     * @return DomainStatus 域名状态过滤。0-停用，1-启用。
     */
    public Long getDomainStatus() {
        return this.DomainStatus;
    }

    /**
     * Set 域名状态过滤。0-停用，1-启用。
     * @param DomainStatus 域名状态过滤。0-停用，1-启用。
     */
    public void setDomainStatus(Long DomainStatus) {
        this.DomainStatus = DomainStatus;
    }

    /**
     * Get 域名类型过滤。0-推流，1-播放。 
     * @return DomainType 域名类型过滤。0-推流，1-播放。
     */
    public Long getDomainType() {
        return this.DomainType;
    }

    /**
     * Set 域名类型过滤。0-推流，1-播放。
     * @param DomainType 域名类型过滤。0-推流，1-播放。
     */
    public void setDomainType(Long DomainType) {
        this.DomainType = DomainType;
    }

    /**
     * Get 分页大小，范围：10~100。默认10。 
     * @return PageSize 分页大小，范围：10~100。默认10。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页大小，范围：10~100。默认10。
     * @param PageSize 分页大小，范围：10~100。默认10。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 取第几页，范围：1~100000。默认1。 
     * @return PageNum 取第几页，范围：1~100000。默认1。
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set 取第几页，范围：1~100000。默认1。
     * @param PageNum 取第几页，范围：1~100000。默认1。
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get 0 普通直播 1慢直播 默认0。 
     * @return IsDelayLive 0 普通直播 1慢直播 默认0。
     */
    public Long getIsDelayLive() {
        return this.IsDelayLive;
    }

    /**
     * Set 0 普通直播 1慢直播 默认0。
     * @param IsDelayLive 0 普通直播 1慢直播 默认0。
     */
    public void setIsDelayLive(Long IsDelayLive) {
        this.IsDelayLive = IsDelayLive;
    }

    /**
     * Get 域名前缀。 
     * @return DomainPrefix 域名前缀。
     */
    public String getDomainPrefix() {
        return this.DomainPrefix;
    }

    /**
     * Set 域名前缀。
     * @param DomainPrefix 域名前缀。
     */
    public void setDomainPrefix(String DomainPrefix) {
        this.DomainPrefix = DomainPrefix;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainStatus", this.DomainStatus);
        this.setParamSimple(map, prefix + "DomainType", this.DomainType);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "IsDelayLive", this.IsDelayLive);
        this.setParamSimple(map, prefix + "DomainPrefix", this.DomainPrefix);

    }
}

