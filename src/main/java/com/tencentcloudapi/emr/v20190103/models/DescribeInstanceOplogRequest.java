/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceOplogRequest extends AbstractModel {

    /**
    * EMR实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 页大小
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 开头时间时间戳
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结尾时间时间戳
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 搜索项数组
    */
    @SerializedName("SearchFields")
    @Expose
    private SearchItem [] SearchFields;

    /**
    * 集群、节点、组件
    */
    @SerializedName("Operand")
    @Expose
    private String Operand;

    /**
    * 一般、危险、高危
    */
    @SerializedName("SecurityLevel")
    @Expose
    private String SecurityLevel;

    /**
     * Get EMR实例ID 
     * @return InstanceId EMR实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set EMR实例ID
     * @param InstanceId EMR实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 页大小 
     * @return Limit 页大小
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 页大小
     * @param Limit 页大小
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 开头时间时间戳 
     * @return StartTime 开头时间时间戳
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开头时间时间戳
     * @param StartTime 开头时间时间戳
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结尾时间时间戳 
     * @return EndTime 结尾时间时间戳
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结尾时间时间戳
     * @param EndTime 结尾时间时间戳
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 搜索项数组 
     * @return SearchFields 搜索项数组
     */
    public SearchItem [] getSearchFields() {
        return this.SearchFields;
    }

    /**
     * Set 搜索项数组
     * @param SearchFields 搜索项数组
     */
    public void setSearchFields(SearchItem [] SearchFields) {
        this.SearchFields = SearchFields;
    }

    /**
     * Get 集群、节点、组件 
     * @return Operand 集群、节点、组件
     */
    public String getOperand() {
        return this.Operand;
    }

    /**
     * Set 集群、节点、组件
     * @param Operand 集群、节点、组件
     */
    public void setOperand(String Operand) {
        this.Operand = Operand;
    }

    /**
     * Get 一般、危险、高危 
     * @return SecurityLevel 一般、危险、高危
     */
    public String getSecurityLevel() {
        return this.SecurityLevel;
    }

    /**
     * Set 一般、危险、高危
     * @param SecurityLevel 一般、危险、高危
     */
    public void setSecurityLevel(String SecurityLevel) {
        this.SecurityLevel = SecurityLevel;
    }

    public DescribeInstanceOplogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceOplogRequest(DescribeInstanceOplogRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.SearchFields != null) {
            this.SearchFields = new SearchItem[source.SearchFields.length];
            for (int i = 0; i < source.SearchFields.length; i++) {
                this.SearchFields[i] = new SearchItem(source.SearchFields[i]);
            }
        }
        if (source.Operand != null) {
            this.Operand = new String(source.Operand);
        }
        if (source.SecurityLevel != null) {
            this.SecurityLevel = new String(source.SecurityLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArrayObj(map, prefix + "SearchFields.", this.SearchFields);
        this.setParamSimple(map, prefix + "Operand", this.Operand);
        this.setParamSimple(map, prefix + "SecurityLevel", this.SecurityLevel);

    }
}

