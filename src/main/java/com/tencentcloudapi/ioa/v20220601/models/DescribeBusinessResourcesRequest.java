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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBusinessResourcesRequest extends AbstractModel {

    /**
    * 资源模块Id
    */
    @SerializedName("AreaId")
    @Expose
    private Long AreaId;

    /**
    * 搜索的业务资源名称
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * 获取业务资源列表的开始时间，时间格式：2006-01-02
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 搜索关键字
    */
    @SerializedName("Keywords")
    @Expose
    private String Keywords;

    /**
    * 获取业务资源列表的结束时间，时间格式：2006-01-02
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 滤条件、分页参数。分页内容不传，默认获取第1页，10条数据
排序条件
<li>CreateTime - string - 是否必填：否 - 排序支持：是 - 按业务资源创建时间排序。</li>
<li>Levels - int - 是否必填：否 - 排序支持：是 - 按业务资源优先级排序。</li>
<li>ReachableState - int - 是否必填：否 - 排序支持：是 - 按业务资源连通性排序(私有化版本不支持)。</li>
    */
    @SerializedName("Condition")
    @Expose
    private Condition Condition;

    /**
    * 资源类型
    */
    @SerializedName("AccessType")
    @Expose
    private String AccessType;

    /**
    * web资源前端地址
    */
    @SerializedName("FrontAddr")
    @Expose
    private String FrontAddr;

    /**
     * Get 资源模块Id 
     * @return AreaId 资源模块Id
     */
    public Long getAreaId() {
        return this.AreaId;
    }

    /**
     * Set 资源模块Id
     * @param AreaId 资源模块Id
     */
    public void setAreaId(Long AreaId) {
        this.AreaId = AreaId;
    }

    /**
     * Get 搜索的业务资源名称 
     * @return ServiceName 搜索的业务资源名称
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 搜索的业务资源名称
     * @param ServiceName 搜索的业务资源名称
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get 获取业务资源列表的开始时间，时间格式：2006-01-02 
     * @return StartTime 获取业务资源列表的开始时间，时间格式：2006-01-02
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 获取业务资源列表的开始时间，时间格式：2006-01-02
     * @param StartTime 获取业务资源列表的开始时间，时间格式：2006-01-02
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 搜索关键字 
     * @return Keywords 搜索关键字
     */
    public String getKeywords() {
        return this.Keywords;
    }

    /**
     * Set 搜索关键字
     * @param Keywords 搜索关键字
     */
    public void setKeywords(String Keywords) {
        this.Keywords = Keywords;
    }

    /**
     * Get 获取业务资源列表的结束时间，时间格式：2006-01-02 
     * @return EndTime 获取业务资源列表的结束时间，时间格式：2006-01-02
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 获取业务资源列表的结束时间，时间格式：2006-01-02
     * @param EndTime 获取业务资源列表的结束时间，时间格式：2006-01-02
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 滤条件、分页参数。分页内容不传，默认获取第1页，10条数据
排序条件
<li>CreateTime - string - 是否必填：否 - 排序支持：是 - 按业务资源创建时间排序。</li>
<li>Levels - int - 是否必填：否 - 排序支持：是 - 按业务资源优先级排序。</li>
<li>ReachableState - int - 是否必填：否 - 排序支持：是 - 按业务资源连通性排序(私有化版本不支持)。</li> 
     * @return Condition 滤条件、分页参数。分页内容不传，默认获取第1页，10条数据
排序条件
<li>CreateTime - string - 是否必填：否 - 排序支持：是 - 按业务资源创建时间排序。</li>
<li>Levels - int - 是否必填：否 - 排序支持：是 - 按业务资源优先级排序。</li>
<li>ReachableState - int - 是否必填：否 - 排序支持：是 - 按业务资源连通性排序(私有化版本不支持)。</li>
     */
    public Condition getCondition() {
        return this.Condition;
    }

    /**
     * Set 滤条件、分页参数。分页内容不传，默认获取第1页，10条数据
排序条件
<li>CreateTime - string - 是否必填：否 - 排序支持：是 - 按业务资源创建时间排序。</li>
<li>Levels - int - 是否必填：否 - 排序支持：是 - 按业务资源优先级排序。</li>
<li>ReachableState - int - 是否必填：否 - 排序支持：是 - 按业务资源连通性排序(私有化版本不支持)。</li>
     * @param Condition 滤条件、分页参数。分页内容不传，默认获取第1页，10条数据
排序条件
<li>CreateTime - string - 是否必填：否 - 排序支持：是 - 按业务资源创建时间排序。</li>
<li>Levels - int - 是否必填：否 - 排序支持：是 - 按业务资源优先级排序。</li>
<li>ReachableState - int - 是否必填：否 - 排序支持：是 - 按业务资源连通性排序(私有化版本不支持)。</li>
     */
    public void setCondition(Condition Condition) {
        this.Condition = Condition;
    }

    /**
     * Get 资源类型 
     * @return AccessType 资源类型
     */
    public String getAccessType() {
        return this.AccessType;
    }

    /**
     * Set 资源类型
     * @param AccessType 资源类型
     */
    public void setAccessType(String AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get web资源前端地址 
     * @return FrontAddr web资源前端地址
     */
    public String getFrontAddr() {
        return this.FrontAddr;
    }

    /**
     * Set web资源前端地址
     * @param FrontAddr web资源前端地址
     */
    public void setFrontAddr(String FrontAddr) {
        this.FrontAddr = FrontAddr;
    }

    public DescribeBusinessResourcesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBusinessResourcesRequest(DescribeBusinessResourcesRequest source) {
        if (source.AreaId != null) {
            this.AreaId = new Long(source.AreaId);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.Keywords != null) {
            this.Keywords = new String(source.Keywords);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Condition != null) {
            this.Condition = new Condition(source.Condition);
        }
        if (source.AccessType != null) {
            this.AccessType = new String(source.AccessType);
        }
        if (source.FrontAddr != null) {
            this.FrontAddr = new String(source.FrontAddr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AreaId", this.AreaId);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Keywords", this.Keywords);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamObj(map, prefix + "Condition.", this.Condition);
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamSimple(map, prefix + "FrontAddr", this.FrontAddr);

    }
}

