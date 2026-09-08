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

public class DescribeResourceGraphEntitiesRequest extends AbstractModel {

    /**
    * <p>资源图谱id</p>
    */
    @SerializedName("ResourceGraphId")
    @Expose
    private String ResourceGraphId;

    /**
    * <ul><li>Product 按【产品分组】精确匹配，可用参数：all / business_service / tke / cdb / redis / mongodb 。类型：String。必选：否</li><li>EntityClassName 按【实体类型】精确匹配，可用参数：all / app.service.application / tc.tke.cluster / tc.tkex.project / tc.cdb.instance / tc.redis.instance / tc.mongodb.instance / k8s.cluster / k8s.namespace / k8s.node / k8s.pod / k8s.ip / k8s.service / k8s.deployment / k8s.statefulset / k8s.statefulsetplus / k8s.daemonset / k8s.storageclass / k8s.persistentvolume / k8s.persistentvolumeclaim / k8s.secret。类型：String。必选：否</li><li>Name 按【实体名称】模糊匹配。类型：String。必选：否</li><li>ResourceId 按 【实体资源id】精确匹配。类型：String。必选：否</li></ul><p>注意：每次请求的 Filters 上限 10。</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>查询偏移</p>
    */
    @SerializedName("NextCursor")
    @Expose
    private String NextCursor;

    /**
    * <p>分页单页数量，默认 20，最大 100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>查询开始时间</p><p>单位：毫秒</p>
    */
    @SerializedName("FromTime")
    @Expose
    private Long FromTime;

    /**
    * <p>查询结束时间</p><p>单位：毫秒</p>
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
     * Get <ul><li>Product 按【产品分组】精确匹配，可用参数：all / business_service / tke / cdb / redis / mongodb 。类型：String。必选：否</li><li>EntityClassName 按【实体类型】精确匹配，可用参数：all / app.service.application / tc.tke.cluster / tc.tkex.project / tc.cdb.instance / tc.redis.instance / tc.mongodb.instance / k8s.cluster / k8s.namespace / k8s.node / k8s.pod / k8s.ip / k8s.service / k8s.deployment / k8s.statefulset / k8s.statefulsetplus / k8s.daemonset / k8s.storageclass / k8s.persistentvolume / k8s.persistentvolumeclaim / k8s.secret。类型：String。必选：否</li><li>Name 按【实体名称】模糊匹配。类型：String。必选：否</li><li>ResourceId 按 【实体资源id】精确匹配。类型：String。必选：否</li></ul><p>注意：每次请求的 Filters 上限 10。</p> 
     * @return Filters <ul><li>Product 按【产品分组】精确匹配，可用参数：all / business_service / tke / cdb / redis / mongodb 。类型：String。必选：否</li><li>EntityClassName 按【实体类型】精确匹配，可用参数：all / app.service.application / tc.tke.cluster / tc.tkex.project / tc.cdb.instance / tc.redis.instance / tc.mongodb.instance / k8s.cluster / k8s.namespace / k8s.node / k8s.pod / k8s.ip / k8s.service / k8s.deployment / k8s.statefulset / k8s.statefulsetplus / k8s.daemonset / k8s.storageclass / k8s.persistentvolume / k8s.persistentvolumeclaim / k8s.secret。类型：String。必选：否</li><li>Name 按【实体名称】模糊匹配。类型：String。必选：否</li><li>ResourceId 按 【实体资源id】精确匹配。类型：String。必选：否</li></ul><p>注意：每次请求的 Filters 上限 10。</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <ul><li>Product 按【产品分组】精确匹配，可用参数：all / business_service / tke / cdb / redis / mongodb 。类型：String。必选：否</li><li>EntityClassName 按【实体类型】精确匹配，可用参数：all / app.service.application / tc.tke.cluster / tc.tkex.project / tc.cdb.instance / tc.redis.instance / tc.mongodb.instance / k8s.cluster / k8s.namespace / k8s.node / k8s.pod / k8s.ip / k8s.service / k8s.deployment / k8s.statefulset / k8s.statefulsetplus / k8s.daemonset / k8s.storageclass / k8s.persistentvolume / k8s.persistentvolumeclaim / k8s.secret。类型：String。必选：否</li><li>Name 按【实体名称】模糊匹配。类型：String。必选：否</li><li>ResourceId 按 【实体资源id】精确匹配。类型：String。必选：否</li></ul><p>注意：每次请求的 Filters 上限 10。</p>
     * @param Filters <ul><li>Product 按【产品分组】精确匹配，可用参数：all / business_service / tke / cdb / redis / mongodb 。类型：String。必选：否</li><li>EntityClassName 按【实体类型】精确匹配，可用参数：all / app.service.application / tc.tke.cluster / tc.tkex.project / tc.cdb.instance / tc.redis.instance / tc.mongodb.instance / k8s.cluster / k8s.namespace / k8s.node / k8s.pod / k8s.ip / k8s.service / k8s.deployment / k8s.statefulset / k8s.statefulsetplus / k8s.daemonset / k8s.storageclass / k8s.persistentvolume / k8s.persistentvolumeclaim / k8s.secret。类型：String。必选：否</li><li>Name 按【实体名称】模糊匹配。类型：String。必选：否</li><li>ResourceId 按 【实体资源id】精确匹配。类型：String。必选：否</li></ul><p>注意：每次请求的 Filters 上限 10。</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>查询偏移</p> 
     * @return NextCursor <p>查询偏移</p>
     */
    public String getNextCursor() {
        return this.NextCursor;
    }

    /**
     * Set <p>查询偏移</p>
     * @param NextCursor <p>查询偏移</p>
     */
    public void setNextCursor(String NextCursor) {
        this.NextCursor = NextCursor;
    }

    /**
     * Get <p>分页单页数量，默认 20，最大 100</p> 
     * @return Limit <p>分页单页数量，默认 20，最大 100</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页单页数量，默认 20，最大 100</p>
     * @param Limit <p>分页单页数量，默认 20，最大 100</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>查询开始时间</p><p>单位：毫秒</p> 
     * @return FromTime <p>查询开始时间</p><p>单位：毫秒</p>
     */
    public Long getFromTime() {
        return this.FromTime;
    }

    /**
     * Set <p>查询开始时间</p><p>单位：毫秒</p>
     * @param FromTime <p>查询开始时间</p><p>单位：毫秒</p>
     */
    public void setFromTime(Long FromTime) {
        this.FromTime = FromTime;
    }

    /**
     * Get <p>查询结束时间</p><p>单位：毫秒</p> 
     * @return ToTime <p>查询结束时间</p><p>单位：毫秒</p>
     */
    public Long getToTime() {
        return this.ToTime;
    }

    /**
     * Set <p>查询结束时间</p><p>单位：毫秒</p>
     * @param ToTime <p>查询结束时间</p><p>单位：毫秒</p>
     */
    public void setToTime(Long ToTime) {
        this.ToTime = ToTime;
    }

    public DescribeResourceGraphEntitiesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourceGraphEntitiesRequest(DescribeResourceGraphEntitiesRequest source) {
        if (source.ResourceGraphId != null) {
            this.ResourceGraphId = new String(source.ResourceGraphId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.NextCursor != null) {
            this.NextCursor = new String(source.NextCursor);
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
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "NextCursor", this.NextCursor);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "FromTime", this.FromTime);
        this.setParamSimple(map, prefix + "ToTime", this.ToTime);

    }
}

