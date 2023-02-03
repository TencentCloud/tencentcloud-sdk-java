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

public class DescribeTimeShiftStreamListRequest extends AbstractModel{

    /**
    * 查询范围起始时间，Unix 时间戳。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 查询范围结束时间，Unix 时间戳。
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 流名称。
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * 推流域名。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 推流域名所属域名组。
    */
    @SerializedName("DomainGroup")
    @Expose
    private String DomainGroup;

    /**
    * 用户指定要返回的最大结果数，取值范围[0,100]，不指定或者指定为0时，API 
默认值为100。指定超过100时，API 强制使用100。指定值为负数时，接口返回错误。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 指定拉取的页码，不传时默认为1。
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
     * Get 查询范围起始时间，Unix 时间戳。 
     * @return StartTime 查询范围起始时间，Unix 时间戳。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询范围起始时间，Unix 时间戳。
     * @param StartTime 查询范围起始时间，Unix 时间戳。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询范围结束时间，Unix 时间戳。 
     * @return EndTime 查询范围结束时间，Unix 时间戳。
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询范围结束时间，Unix 时间戳。
     * @param EndTime 查询范围结束时间，Unix 时间戳。
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 流名称。 
     * @return StreamName 流名称。
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set 流名称。
     * @param StreamName 流名称。
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get 推流域名。 
     * @return Domain 推流域名。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 推流域名。
     * @param Domain 推流域名。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 推流域名所属域名组。 
     * @return DomainGroup 推流域名所属域名组。
     */
    public String getDomainGroup() {
        return this.DomainGroup;
    }

    /**
     * Set 推流域名所属域名组。
     * @param DomainGroup 推流域名所属域名组。
     */
    public void setDomainGroup(String DomainGroup) {
        this.DomainGroup = DomainGroup;
    }

    /**
     * Get 用户指定要返回的最大结果数，取值范围[0,100]，不指定或者指定为0时，API 
默认值为100。指定超过100时，API 强制使用100。指定值为负数时，接口返回错误。 
     * @return PageSize 用户指定要返回的最大结果数，取值范围[0,100]，不指定或者指定为0时，API 
默认值为100。指定超过100时，API 强制使用100。指定值为负数时，接口返回错误。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 用户指定要返回的最大结果数，取值范围[0,100]，不指定或者指定为0时，API 
默认值为100。指定超过100时，API 强制使用100。指定值为负数时，接口返回错误。
     * @param PageSize 用户指定要返回的最大结果数，取值范围[0,100]，不指定或者指定为0时，API 
默认值为100。指定超过100时，API 强制使用100。指定值为负数时，接口返回错误。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 指定拉取的页码，不传时默认为1。 
     * @return PageNum 指定拉取的页码，不传时默认为1。
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set 指定拉取的页码，不传时默认为1。
     * @param PageNum 指定拉取的页码，不传时默认为1。
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    public DescribeTimeShiftStreamListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTimeShiftStreamListRequest(DescribeTimeShiftStreamListRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainGroup != null) {
            this.DomainGroup = new String(source.DomainGroup);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainGroup", this.DomainGroup);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);

    }
}

