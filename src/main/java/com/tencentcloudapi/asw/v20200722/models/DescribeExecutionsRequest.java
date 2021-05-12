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
package com.tencentcloudapi.asw.v20200722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeExecutionsRequest extends AbstractModel{

    /**
    * 状态机资源名
    */
    @SerializedName("StateMachineResourceName")
    @Expose
    private String StateMachineResourceName;

    /**
    * 页大小，最大100
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 页序号，从1开始
    */
    @SerializedName("PageIndex")
    @Expose
    private Long PageIndex;

    /**
    * 按状态过滤条件，INIT，RUNNING，SUCCEED，FAILED，TERMINATED
    */
    @SerializedName("FilterExecutionStatus")
    @Expose
    private String FilterExecutionStatus;

    /**
    * 按执行名过滤条件
    */
    @SerializedName("FilterExecutionResourceName")
    @Expose
    private String FilterExecutionResourceName;

    /**
     * Get 状态机资源名 
     * @return StateMachineResourceName 状态机资源名
     */
    public String getStateMachineResourceName() {
        return this.StateMachineResourceName;
    }

    /**
     * Set 状态机资源名
     * @param StateMachineResourceName 状态机资源名
     */
    public void setStateMachineResourceName(String StateMachineResourceName) {
        this.StateMachineResourceName = StateMachineResourceName;
    }

    /**
     * Get 页大小，最大100 
     * @return PageSize 页大小，最大100
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 页大小，最大100
     * @param PageSize 页大小，最大100
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 页序号，从1开始 
     * @return PageIndex 页序号，从1开始
     */
    public Long getPageIndex() {
        return this.PageIndex;
    }

    /**
     * Set 页序号，从1开始
     * @param PageIndex 页序号，从1开始
     */
    public void setPageIndex(Long PageIndex) {
        this.PageIndex = PageIndex;
    }

    /**
     * Get 按状态过滤条件，INIT，RUNNING，SUCCEED，FAILED，TERMINATED 
     * @return FilterExecutionStatus 按状态过滤条件，INIT，RUNNING，SUCCEED，FAILED，TERMINATED
     */
    public String getFilterExecutionStatus() {
        return this.FilterExecutionStatus;
    }

    /**
     * Set 按状态过滤条件，INIT，RUNNING，SUCCEED，FAILED，TERMINATED
     * @param FilterExecutionStatus 按状态过滤条件，INIT，RUNNING，SUCCEED，FAILED，TERMINATED
     */
    public void setFilterExecutionStatus(String FilterExecutionStatus) {
        this.FilterExecutionStatus = FilterExecutionStatus;
    }

    /**
     * Get 按执行名过滤条件 
     * @return FilterExecutionResourceName 按执行名过滤条件
     */
    public String getFilterExecutionResourceName() {
        return this.FilterExecutionResourceName;
    }

    /**
     * Set 按执行名过滤条件
     * @param FilterExecutionResourceName 按执行名过滤条件
     */
    public void setFilterExecutionResourceName(String FilterExecutionResourceName) {
        this.FilterExecutionResourceName = FilterExecutionResourceName;
    }

    public DescribeExecutionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeExecutionsRequest(DescribeExecutionsRequest source) {
        if (source.StateMachineResourceName != null) {
            this.StateMachineResourceName = new String(source.StateMachineResourceName);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageIndex != null) {
            this.PageIndex = new Long(source.PageIndex);
        }
        if (source.FilterExecutionStatus != null) {
            this.FilterExecutionStatus = new String(source.FilterExecutionStatus);
        }
        if (source.FilterExecutionResourceName != null) {
            this.FilterExecutionResourceName = new String(source.FilterExecutionResourceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StateMachineResourceName", this.StateMachineResourceName);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageIndex", this.PageIndex);
        this.setParamSimple(map, prefix + "FilterExecutionStatus", this.FilterExecutionStatus);
        this.setParamSimple(map, prefix + "FilterExecutionResourceName", this.FilterExecutionResourceName);

    }
}

