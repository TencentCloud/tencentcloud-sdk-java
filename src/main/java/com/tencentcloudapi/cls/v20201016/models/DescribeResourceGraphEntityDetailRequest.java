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

public class DescribeResourceGraphEntityDetailRequest extends AbstractModel {

    /**
    * <p>实体 ID</p>
    */
    @SerializedName("EntityId")
    @Expose
    private String EntityId;

    /**
    * <p>资源图谱id</p>
    */
    @SerializedName("ResourceGraphId")
    @Expose
    private String ResourceGraphId;

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
     * Get <p>实体 ID</p> 
     * @return EntityId <p>实体 ID</p>
     */
    public String getEntityId() {
        return this.EntityId;
    }

    /**
     * Set <p>实体 ID</p>
     * @param EntityId <p>实体 ID</p>
     */
    public void setEntityId(String EntityId) {
        this.EntityId = EntityId;
    }

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

    public DescribeResourceGraphEntityDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourceGraphEntityDetailRequest(DescribeResourceGraphEntityDetailRequest source) {
        if (source.EntityId != null) {
            this.EntityId = new String(source.EntityId);
        }
        if (source.ResourceGraphId != null) {
            this.ResourceGraphId = new String(source.ResourceGraphId);
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
        this.setParamSimple(map, prefix + "EntityId", this.EntityId);
        this.setParamSimple(map, prefix + "ResourceGraphId", this.ResourceGraphId);
        this.setParamSimple(map, prefix + "FromTime", this.FromTime);
        this.setParamSimple(map, prefix + "ToTime", this.ToTime);

    }
}

