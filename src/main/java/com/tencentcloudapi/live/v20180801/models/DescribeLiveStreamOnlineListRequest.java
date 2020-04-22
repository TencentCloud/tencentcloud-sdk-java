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

public class DescribeLiveStreamOnlineListRequest extends AbstractModel{

    /**
    * 推流域名。多域名用户需要填写 DomainName。
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 推流路径，与推流和播放地址中的 AppName 保持一致，默认为 live。多路径用户需要填写 AppName。
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 取得第几页，默认1。
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * 每页大小，最大100。 
取值：10~100之间的任意整数。
默认值：10。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 流名称，用于精确查询。
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
     * Get 推流域名。多域名用户需要填写 DomainName。 
     * @return DomainName 推流域名。多域名用户需要填写 DomainName。
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 推流域名。多域名用户需要填写 DomainName。
     * @param DomainName 推流域名。多域名用户需要填写 DomainName。
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get 推流路径，与推流和播放地址中的 AppName 保持一致，默认为 live。多路径用户需要填写 AppName。 
     * @return AppName 推流路径，与推流和播放地址中的 AppName 保持一致，默认为 live。多路径用户需要填写 AppName。
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 推流路径，与推流和播放地址中的 AppName 保持一致，默认为 live。多路径用户需要填写 AppName。
     * @param AppName 推流路径，与推流和播放地址中的 AppName 保持一致，默认为 live。多路径用户需要填写 AppName。
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 取得第几页，默认1。 
     * @return PageNum 取得第几页，默认1。
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set 取得第几页，默认1。
     * @param PageNum 取得第几页，默认1。
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get 每页大小，最大100。 
取值：10~100之间的任意整数。
默认值：10。 
     * @return PageSize 每页大小，最大100。 
取值：10~100之间的任意整数。
默认值：10。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页大小，最大100。 
取值：10~100之间的任意整数。
默认值：10。
     * @param PageSize 每页大小，最大100。 
取值：10~100之间的任意整数。
默认值：10。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 流名称，用于精确查询。 
     * @return StreamName 流名称，用于精确查询。
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set 流名称，用于精确查询。
     * @param StreamName 流名称，用于精确查询。
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);

    }
}

