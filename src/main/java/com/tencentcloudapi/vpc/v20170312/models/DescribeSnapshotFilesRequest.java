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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSnapshotFilesRequest extends AbstractModel{

    /**
    * 业务类型，目前支持安全组：securitygroup。
    */
    @SerializedName("BusinessType")
    @Expose
    private String BusinessType;

    /**
    * 业务实例Id，和BusinessType对应。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 开始日期，格式%Y-%m-%d %H:%M:%S。
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * 结束日期，格式%Y-%m-%d %H:%M:%S。
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为20，最大为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 业务类型，目前支持安全组：securitygroup。 
     * @return BusinessType 业务类型，目前支持安全组：securitygroup。
     */
    public String getBusinessType() {
        return this.BusinessType;
    }

    /**
     * Set 业务类型，目前支持安全组：securitygroup。
     * @param BusinessType 业务类型，目前支持安全组：securitygroup。
     */
    public void setBusinessType(String BusinessType) {
        this.BusinessType = BusinessType;
    }

    /**
     * Get 业务实例Id，和BusinessType对应。 
     * @return InstanceId 业务实例Id，和BusinessType对应。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 业务实例Id，和BusinessType对应。
     * @param InstanceId 业务实例Id，和BusinessType对应。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 开始日期，格式%Y-%m-%d %H:%M:%S。 
     * @return StartDate 开始日期，格式%Y-%m-%d %H:%M:%S。
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set 开始日期，格式%Y-%m-%d %H:%M:%S。
     * @param StartDate 开始日期，格式%Y-%m-%d %H:%M:%S。
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get 结束日期，格式%Y-%m-%d %H:%M:%S。 
     * @return EndDate 结束日期，格式%Y-%m-%d %H:%M:%S。
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set 结束日期，格式%Y-%m-%d %H:%M:%S。
     * @param EndDate 结束日期，格式%Y-%m-%d %H:%M:%S。
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get 偏移量，默认为0。 
     * @return Offset 偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为20，最大为100。 
     * @return Limit 返回数量，默认为20，最大为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大为100。
     * @param Limit 返回数量，默认为20，最大为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeSnapshotFilesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSnapshotFilesRequest(DescribeSnapshotFilesRequest source) {
        if (source.BusinessType != null) {
            this.BusinessType = new String(source.BusinessType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartDate != null) {
            this.StartDate = new String(source.StartDate);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BusinessType", this.BusinessType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

