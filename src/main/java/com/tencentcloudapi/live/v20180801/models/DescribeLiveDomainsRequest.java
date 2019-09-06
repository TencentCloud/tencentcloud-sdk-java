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

public class DescribeLiveDomainsRequest  extends AbstractModel{

    /**
    * 域名状态过滤。0-停用，1-启用
    */
    @SerializedName("DomainStatus")
    @Expose
    private Integer DomainStatus;

    /**
    * 域名类型过滤。0-推流，1-播放
    */
    @SerializedName("DomainType")
    @Expose
    private Integer DomainType;

    /**
    * 分页大小，范围：10~100。默认10
    */
    @SerializedName("PageSize")
    @Expose
    private Integer PageSize;

    /**
    * 取第几页，范围：1~100000。默认1
    */
    @SerializedName("PageNum")
    @Expose
    private Integer PageNum;

    /**
    * 0 普通直播 1慢直播 默认0
    */
    @SerializedName("IsDelayLive")
    @Expose
    private Integer IsDelayLive;

    /**
    * 域名前缀
    */
    @SerializedName("DomainPrefix")
    @Expose
    private String DomainPrefix;

    /**
     * 获取域名状态过滤。0-停用，1-启用
     * @return DomainStatus 域名状态过滤。0-停用，1-启用
     */
    public Integer getDomainStatus() {
        return this.DomainStatus;
    }

    /**
     * 设置域名状态过滤。0-停用，1-启用
     * @param DomainStatus 域名状态过滤。0-停用，1-启用
     */
    public void setDomainStatus(Integer DomainStatus) {
        this.DomainStatus = DomainStatus;
    }

    /**
     * 获取域名类型过滤。0-推流，1-播放
     * @return DomainType 域名类型过滤。0-推流，1-播放
     */
    public Integer getDomainType() {
        return this.DomainType;
    }

    /**
     * 设置域名类型过滤。0-推流，1-播放
     * @param DomainType 域名类型过滤。0-推流，1-播放
     */
    public void setDomainType(Integer DomainType) {
        this.DomainType = DomainType;
    }

    /**
     * 获取分页大小，范围：10~100。默认10
     * @return PageSize 分页大小，范围：10~100。默认10
     */
    public Integer getPageSize() {
        return this.PageSize;
    }

    /**
     * 设置分页大小，范围：10~100。默认10
     * @param PageSize 分页大小，范围：10~100。默认10
     */
    public void setPageSize(Integer PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * 获取取第几页，范围：1~100000。默认1
     * @return PageNum 取第几页，范围：1~100000。默认1
     */
    public Integer getPageNum() {
        return this.PageNum;
    }

    /**
     * 设置取第几页，范围：1~100000。默认1
     * @param PageNum 取第几页，范围：1~100000。默认1
     */
    public void setPageNum(Integer PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * 获取0 普通直播 1慢直播 默认0
     * @return IsDelayLive 0 普通直播 1慢直播 默认0
     */
    public Integer getIsDelayLive() {
        return this.IsDelayLive;
    }

    /**
     * 设置0 普通直播 1慢直播 默认0
     * @param IsDelayLive 0 普通直播 1慢直播 默认0
     */
    public void setIsDelayLive(Integer IsDelayLive) {
        this.IsDelayLive = IsDelayLive;
    }

    /**
     * 获取域名前缀
     * @return DomainPrefix 域名前缀
     */
    public String getDomainPrefix() {
        return this.DomainPrefix;
    }

    /**
     * 设置域名前缀
     * @param DomainPrefix 域名前缀
     */
    public void setDomainPrefix(String DomainPrefix) {
        this.DomainPrefix = DomainPrefix;
    }

    /**
     * 内部实现，用户禁止调用
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

