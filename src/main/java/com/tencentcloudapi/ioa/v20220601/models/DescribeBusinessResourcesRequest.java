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
    * <p>滤条件、分页参数。分页内容不传，默认获取第1页，10条数据<br>排序条件</p><li>CreateTime - string - 是否必填：否 - 排序支持：是 - 按业务资源创建时间排序。</li><li>Levels - int - 是否必填：否 - 排序支持：是 - 按业务资源优先级排序。</li><li>ReachableState - int - 是否必填：否 - 排序支持：是 - 按业务资源连通性排序(私有化版本不支持)。</li>
    */
    @SerializedName("Condition")
    @Expose
    private Condition Condition;

    /**
    * <p>资源模块Id</p>
    */
    @SerializedName("AreaId")
    @Expose
    private Long AreaId;

    /**
    * <p>服务名称</p>
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * <p>搜索关键字</p>
    */
    @SerializedName("Keywords")
    @Expose
    private String Keywords;

    /**
    * <p>获取业务资源列表的开始时间，时间格式：2006-01-02</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>获取业务资源列表的结束时间，时间格式：2006-01-02</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>资源类型</p>
    */
    @SerializedName("AccessType")
    @Expose
    private String AccessType;

    /**
    * <p>web资源前端地址</p>
    */
    @SerializedName("FrontAddr")
    @Expose
    private String FrontAddr;

    /**
     * Get <p>滤条件、分页参数。分页内容不传，默认获取第1页，10条数据<br>排序条件</p><li>CreateTime - string - 是否必填：否 - 排序支持：是 - 按业务资源创建时间排序。</li><li>Levels - int - 是否必填：否 - 排序支持：是 - 按业务资源优先级排序。</li><li>ReachableState - int - 是否必填：否 - 排序支持：是 - 按业务资源连通性排序(私有化版本不支持)。</li> 
     * @return Condition <p>滤条件、分页参数。分页内容不传，默认获取第1页，10条数据<br>排序条件</p><li>CreateTime - string - 是否必填：否 - 排序支持：是 - 按业务资源创建时间排序。</li><li>Levels - int - 是否必填：否 - 排序支持：是 - 按业务资源优先级排序。</li><li>ReachableState - int - 是否必填：否 - 排序支持：是 - 按业务资源连通性排序(私有化版本不支持)。</li>
     */
    public Condition getCondition() {
        return this.Condition;
    }

    /**
     * Set <p>滤条件、分页参数。分页内容不传，默认获取第1页，10条数据<br>排序条件</p><li>CreateTime - string - 是否必填：否 - 排序支持：是 - 按业务资源创建时间排序。</li><li>Levels - int - 是否必填：否 - 排序支持：是 - 按业务资源优先级排序。</li><li>ReachableState - int - 是否必填：否 - 排序支持：是 - 按业务资源连通性排序(私有化版本不支持)。</li>
     * @param Condition <p>滤条件、分页参数。分页内容不传，默认获取第1页，10条数据<br>排序条件</p><li>CreateTime - string - 是否必填：否 - 排序支持：是 - 按业务资源创建时间排序。</li><li>Levels - int - 是否必填：否 - 排序支持：是 - 按业务资源优先级排序。</li><li>ReachableState - int - 是否必填：否 - 排序支持：是 - 按业务资源连通性排序(私有化版本不支持)。</li>
     */
    public void setCondition(Condition Condition) {
        this.Condition = Condition;
    }

    /**
     * Get <p>资源模块Id</p> 
     * @return AreaId <p>资源模块Id</p>
     */
    public Long getAreaId() {
        return this.AreaId;
    }

    /**
     * Set <p>资源模块Id</p>
     * @param AreaId <p>资源模块Id</p>
     */
    public void setAreaId(Long AreaId) {
        this.AreaId = AreaId;
    }

    /**
     * Get <p>服务名称</p> 
     * @return ServiceName <p>服务名称</p>
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set <p>服务名称</p>
     * @param ServiceName <p>服务名称</p>
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get <p>搜索关键字</p> 
     * @return Keywords <p>搜索关键字</p>
     */
    public String getKeywords() {
        return this.Keywords;
    }

    /**
     * Set <p>搜索关键字</p>
     * @param Keywords <p>搜索关键字</p>
     */
    public void setKeywords(String Keywords) {
        this.Keywords = Keywords;
    }

    /**
     * Get <p>获取业务资源列表的开始时间，时间格式：2006-01-02</p> 
     * @return StartTime <p>获取业务资源列表的开始时间，时间格式：2006-01-02</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>获取业务资源列表的开始时间，时间格式：2006-01-02</p>
     * @param StartTime <p>获取业务资源列表的开始时间，时间格式：2006-01-02</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>获取业务资源列表的结束时间，时间格式：2006-01-02</p> 
     * @return EndTime <p>获取业务资源列表的结束时间，时间格式：2006-01-02</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>获取业务资源列表的结束时间，时间格式：2006-01-02</p>
     * @param EndTime <p>获取业务资源列表的结束时间，时间格式：2006-01-02</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>资源类型</p> 
     * @return AccessType <p>资源类型</p>
     */
    public String getAccessType() {
        return this.AccessType;
    }

    /**
     * Set <p>资源类型</p>
     * @param AccessType <p>资源类型</p>
     */
    public void setAccessType(String AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get <p>web资源前端地址</p> 
     * @return FrontAddr <p>web资源前端地址</p>
     */
    public String getFrontAddr() {
        return this.FrontAddr;
    }

    /**
     * Set <p>web资源前端地址</p>
     * @param FrontAddr <p>web资源前端地址</p>
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
        if (source.Condition != null) {
            this.Condition = new Condition(source.Condition);
        }
        if (source.AreaId != null) {
            this.AreaId = new Long(source.AreaId);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.Keywords != null) {
            this.Keywords = new String(source.Keywords);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
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
        this.setParamObj(map, prefix + "Condition.", this.Condition);
        this.setParamSimple(map, prefix + "AreaId", this.AreaId);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "Keywords", this.Keywords);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamSimple(map, prefix + "FrontAddr", this.FrontAddr);

    }
}

