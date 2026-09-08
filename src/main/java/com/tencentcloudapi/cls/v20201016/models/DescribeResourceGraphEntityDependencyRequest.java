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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeResourceGraphEntityDependencyRequest extends AbstractModel {

    /**
    * <p>资源图谱id</p>
    */
    @SerializedName("ResourceGraphId")
    @Expose
    private String ResourceGraphId;

    /**
    * <p>实体id</p>
    */
    @SerializedName("EntityId")
    @Expose
    private String EntityId;

    /**
    * <p>距离Entity的深度</p>
    */
    @SerializedName("Depth")
    @Expose
    private Long Depth;

    /**
    * <p>返回数量</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>查询范围-开始时间</p><p>单位：毫秒</p>
    */
    @SerializedName("FromTime")
    @Expose
    private Long FromTime;

    /**
    * <p>查询范围-结束时间</p><p>单位：毫秒</p>
    */
    @SerializedName("ToTime")
    @Expose
    private Long ToTime;

    /**
     * Get <p>资源图谱id</p> 
     * @return ResourceGraphId <p>资源图谱id</p>
     */
    public String getResourceGraphId() {
        return this.ResourceGraphId;
    }

    /**
     * Set <p>资源图谱id</p>
     * @param ResourceGraphId <p>资源图谱id</p>
     */
    public void setResourceGraphId(String ResourceGraphId) {
        this.ResourceGraphId = ResourceGraphId;
    }

    /**
     * Get <p>实体id</p> 
     * @return EntityId <p>实体id</p>
     */
    public String getEntityId() {
        return this.EntityId;
    }

    /**
     * Set <p>实体id</p>
     * @param EntityId <p>实体id</p>
     */
    public void setEntityId(String EntityId) {
        this.EntityId = EntityId;
    }

    /**
     * Get <p>距离Entity的深度</p> 
     * @return Depth <p>距离Entity的深度</p>
     */
    public Long getDepth() {
        return this.Depth;
    }

    /**
     * Set <p>距离Entity的深度</p>
     * @param Depth <p>距离Entity的深度</p>
     */
    public void setDepth(Long Depth) {
        this.Depth = Depth;
    }

    /**
     * Get <p>返回数量</p> 
     * @return Limit <p>返回数量</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数量</p>
     * @param Limit <p>返回数量</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>查询范围-开始时间</p><p>单位：毫秒</p> 
     * @return FromTime <p>查询范围-开始时间</p><p>单位：毫秒</p>
     */
    public Long getFromTime() {
        return this.FromTime;
    }

    /**
     * Set <p>查询范围-开始时间</p><p>单位：毫秒</p>
     * @param FromTime <p>查询范围-开始时间</p><p>单位：毫秒</p>
     */
    public void setFromTime(Long FromTime) {
        this.FromTime = FromTime;
    }

    /**
     * Get <p>查询范围-结束时间</p><p>单位：毫秒</p> 
     * @return ToTime <p>查询范围-结束时间</p><p>单位：毫秒</p>
     */
    public Long getToTime() {
        return this.ToTime;
    }

    /**
     * Set <p>查询范围-结束时间</p><p>单位：毫秒</p>
     * @param ToTime <p>查询范围-结束时间</p><p>单位：毫秒</p>
     */
    public void setToTime(Long ToTime) {
        this.ToTime = ToTime;
    }

    public DescribeResourceGraphEntityDependencyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourceGraphEntityDependencyRequest(DescribeResourceGraphEntityDependencyRequest source) {
        if (source.ResourceGraphId != null) {
            this.ResourceGraphId = new String(source.ResourceGraphId);
        }
        if (source.EntityId != null) {
            this.EntityId = new String(source.EntityId);
        }
        if (source.Depth != null) {
            this.Depth = new Long(source.Depth);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.FromTime != null) {
            this.FromTime = new Long(source.FromTime);
        }
        if (source.ToTime != null) {
            this.ToTime = new Long(source.ToTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceGraphId", this.ResourceGraphId);
        this.setParamSimple(map, prefix + "EntityId", this.EntityId);
        this.setParamSimple(map, prefix + "Depth", this.Depth);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "FromTime", this.FromTime);
        this.setParamSimple(map, prefix + "ToTime", this.ToTime);

    }
}

