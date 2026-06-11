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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBDiagEventsRequest extends AbstractModel {

    /**
    * <p>开始时间，如“2021-05-27 00:00:00”，支持的最早查询时间为当前时间的前30天。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>结束时间，如“2021-05-27 01:00:00”，支持的最早查询时间为当前时间的前30天。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>风险等级列表，取值按影响程度从高至低分别为：1 - 致命、2 -严重、3 - 告警、4 - 提示、5 -健康。</p>
    */
    @SerializedName("Severities")
    @Expose
    private Long [] Severities;

    /**
    * <p>实例ID列表。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。<br>查询TDSQL MySQL分布式实例:Instanceld：填写集群ID&amp;Shard实例ID，如：dcdbt-157xxxk&amp;shard-qxxxx</p>
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * <p>服务产品类型，支持值包括：&quot;mysql&quot; - 云数据库 MySQL，&quot;mongodb&quot;- 云数据库MongoDB, &quot;postgres&quot;-云数据库postgres,云数据库&quot;redis&quot; - 云数据库 Redis，&quot;mariadb&quot;-数据库mariadb，&quot;cynosdb&quot;-数据库 TDSQL-C, &quot;dcdb&quot;-数据库TDSQL MySQL    默认为&quot;mysql&quot;。</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * <p>偏移量，默认0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>返回数量，默认20，最大值为50。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p>开始时间，如“2021-05-27 00:00:00”，支持的最早查询时间为当前时间的前30天。</p> 
     * @return StartTime <p>开始时间，如“2021-05-27 00:00:00”，支持的最早查询时间为当前时间的前30天。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间，如“2021-05-27 00:00:00”，支持的最早查询时间为当前时间的前30天。</p>
     * @param StartTime <p>开始时间，如“2021-05-27 00:00:00”，支持的最早查询时间为当前时间的前30天。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间，如“2021-05-27 01:00:00”，支持的最早查询时间为当前时间的前30天。</p> 
     * @return EndTime <p>结束时间，如“2021-05-27 01:00:00”，支持的最早查询时间为当前时间的前30天。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间，如“2021-05-27 01:00:00”，支持的最早查询时间为当前时间的前30天。</p>
     * @param EndTime <p>结束时间，如“2021-05-27 01:00:00”，支持的最早查询时间为当前时间的前30天。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>风险等级列表，取值按影响程度从高至低分别为：1 - 致命、2 -严重、3 - 告警、4 - 提示、5 -健康。</p> 
     * @return Severities <p>风险等级列表，取值按影响程度从高至低分别为：1 - 致命、2 -严重、3 - 告警、4 - 提示、5 -健康。</p>
     */
    public Long [] getSeverities() {
        return this.Severities;
    }

    /**
     * Set <p>风险等级列表，取值按影响程度从高至低分别为：1 - 致命、2 -严重、3 - 告警、4 - 提示、5 -健康。</p>
     * @param Severities <p>风险等级列表，取值按影响程度从高至低分别为：1 - 致命、2 -严重、3 - 告警、4 - 提示、5 -健康。</p>
     */
    public void setSeverities(Long [] Severities) {
        this.Severities = Severities;
    }

    /**
     * Get <p>实例ID列表。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。<br>查询TDSQL MySQL分布式实例:Instanceld：填写集群ID&amp;Shard实例ID，如：dcdbt-157xxxk&amp;shard-qxxxx</p> 
     * @return InstanceIds <p>实例ID列表。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。<br>查询TDSQL MySQL分布式实例:Instanceld：填写集群ID&amp;Shard实例ID，如：dcdbt-157xxxk&amp;shard-qxxxx</p>
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set <p>实例ID列表。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。<br>查询TDSQL MySQL分布式实例:Instanceld：填写集群ID&amp;Shard实例ID，如：dcdbt-157xxxk&amp;shard-qxxxx</p>
     * @param InstanceIds <p>实例ID列表。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。<br>查询TDSQL MySQL分布式实例:Instanceld：填写集群ID&amp;Shard实例ID，如：dcdbt-157xxxk&amp;shard-qxxxx</p>
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get <p>服务产品类型，支持值包括：&quot;mysql&quot; - 云数据库 MySQL，&quot;mongodb&quot;- 云数据库MongoDB, &quot;postgres&quot;-云数据库postgres,云数据库&quot;redis&quot; - 云数据库 Redis，&quot;mariadb&quot;-数据库mariadb，&quot;cynosdb&quot;-数据库 TDSQL-C, &quot;dcdb&quot;-数据库TDSQL MySQL    默认为&quot;mysql&quot;。</p> 
     * @return Product <p>服务产品类型，支持值包括：&quot;mysql&quot; - 云数据库 MySQL，&quot;mongodb&quot;- 云数据库MongoDB, &quot;postgres&quot;-云数据库postgres,云数据库&quot;redis&quot; - 云数据库 Redis，&quot;mariadb&quot;-数据库mariadb，&quot;cynosdb&quot;-数据库 TDSQL-C, &quot;dcdb&quot;-数据库TDSQL MySQL    默认为&quot;mysql&quot;。</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>服务产品类型，支持值包括：&quot;mysql&quot; - 云数据库 MySQL，&quot;mongodb&quot;- 云数据库MongoDB, &quot;postgres&quot;-云数据库postgres,云数据库&quot;redis&quot; - 云数据库 Redis，&quot;mariadb&quot;-数据库mariadb，&quot;cynosdb&quot;-数据库 TDSQL-C, &quot;dcdb&quot;-数据库TDSQL MySQL    默认为&quot;mysql&quot;。</p>
     * @param Product <p>服务产品类型，支持值包括：&quot;mysql&quot; - 云数据库 MySQL，&quot;mongodb&quot;- 云数据库MongoDB, &quot;postgres&quot;-云数据库postgres,云数据库&quot;redis&quot; - 云数据库 Redis，&quot;mariadb&quot;-数据库mariadb，&quot;cynosdb&quot;-数据库 TDSQL-C, &quot;dcdb&quot;-数据库TDSQL MySQL    默认为&quot;mysql&quot;。</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get <p>偏移量，默认0。</p> 
     * @return Offset <p>偏移量，默认0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，默认0。</p>
     * @param Offset <p>偏移量，默认0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>返回数量，默认20，最大值为50。</p> 
     * @return Limit <p>返回数量，默认20，最大值为50。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数量，默认20，最大值为50。</p>
     * @param Limit <p>返回数量，默认20，最大值为50。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeDBDiagEventsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBDiagEventsRequest(DescribeDBDiagEventsRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Severities != null) {
            this.Severities = new Long[source.Severities.length];
            for (int i = 0; i < source.Severities.length; i++) {
                this.Severities[i] = new Long(source.Severities[i]);
            }
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
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
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "Severities.", this.Severities);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

