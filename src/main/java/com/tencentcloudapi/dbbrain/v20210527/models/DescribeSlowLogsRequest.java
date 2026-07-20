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

public class DescribeSlowLogsRequest extends AbstractModel {

    /**
    * <p>服务产品类型，支持值包括： &quot;mysql&quot; - 云数据库 MySQL， &quot;cynosdb&quot; - 云数据库 CynosDB for MySQL，&quot;tdstore&quot; - 云数据库TDSQL Boundless，默认为&quot;mysql&quot;。</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>sql 模板的 md5 值，可通过 <a href="https://cloud.tencent.com/document/product/1130/57784">DescribeSlowLogTopSqls</a> 接口获取。</p>
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
    * <p>开始时间，如“2019-09-10 12:13:14”。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>截止时间，如“2019-09-11 10:13:14”，截止时间与开始时间的间隔小于7天。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>偏移量，默认为0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>查询数目，默认为20，最大为100。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>数据库列表</p>
    */
    @SerializedName("DB")
    @Expose
    private String [] DB;

    /**
    * <p>关键字</p>
    */
    @SerializedName("Key")
    @Expose
    private String [] Key;

    /**
    * <p>用户</p>
    */
    @SerializedName("User")
    @Expose
    private String [] User;

    /**
    * <p>IP 来源</p>
    */
    @SerializedName("Ip")
    @Expose
    private String [] Ip;

    /**
    * <p>耗时区间,耗时区间的左右边界分别对应数组的第0个元素和第一个元素</p>
    */
    @SerializedName("Time")
    @Expose
    private Long [] Time;

    /**
     * Get <p>服务产品类型，支持值包括： &quot;mysql&quot; - 云数据库 MySQL， &quot;cynosdb&quot; - 云数据库 CynosDB for MySQL，&quot;tdstore&quot; - 云数据库TDSQL Boundless，默认为&quot;mysql&quot;。</p> 
     * @return Product <p>服务产品类型，支持值包括： &quot;mysql&quot; - 云数据库 MySQL， &quot;cynosdb&quot; - 云数据库 CynosDB for MySQL，&quot;tdstore&quot; - 云数据库TDSQL Boundless，默认为&quot;mysql&quot;。</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>服务产品类型，支持值包括： &quot;mysql&quot; - 云数据库 MySQL， &quot;cynosdb&quot; - 云数据库 CynosDB for MySQL，&quot;tdstore&quot; - 云数据库TDSQL Boundless，默认为&quot;mysql&quot;。</p>
     * @param Product <p>服务产品类型，支持值包括： &quot;mysql&quot; - 云数据库 MySQL， &quot;cynosdb&quot; - 云数据库 CynosDB for MySQL，&quot;tdstore&quot; - 云数据库TDSQL Boundless，默认为&quot;mysql&quot;。</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。</p> 
     * @return InstanceId <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。</p>
     * @param InstanceId <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>sql 模板的 md5 值，可通过 <a href="https://cloud.tencent.com/document/product/1130/57784">DescribeSlowLogTopSqls</a> 接口获取。</p> 
     * @return Md5 <p>sql 模板的 md5 值，可通过 <a href="https://cloud.tencent.com/document/product/1130/57784">DescribeSlowLogTopSqls</a> 接口获取。</p>
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set <p>sql 模板的 md5 值，可通过 <a href="https://cloud.tencent.com/document/product/1130/57784">DescribeSlowLogTopSqls</a> 接口获取。</p>
     * @param Md5 <p>sql 模板的 md5 值，可通过 <a href="https://cloud.tencent.com/document/product/1130/57784">DescribeSlowLogTopSqls</a> 接口获取。</p>
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    /**
     * Get <p>开始时间，如“2019-09-10 12:13:14”。</p> 
     * @return StartTime <p>开始时间，如“2019-09-10 12:13:14”。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间，如“2019-09-10 12:13:14”。</p>
     * @param StartTime <p>开始时间，如“2019-09-10 12:13:14”。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>截止时间，如“2019-09-11 10:13:14”，截止时间与开始时间的间隔小于7天。</p> 
     * @return EndTime <p>截止时间，如“2019-09-11 10:13:14”，截止时间与开始时间的间隔小于7天。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>截止时间，如“2019-09-11 10:13:14”，截止时间与开始时间的间隔小于7天。</p>
     * @param EndTime <p>截止时间，如“2019-09-11 10:13:14”，截止时间与开始时间的间隔小于7天。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>偏移量，默认为0。</p> 
     * @return Offset <p>偏移量，默认为0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，默认为0。</p>
     * @param Offset <p>偏移量，默认为0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>查询数目，默认为20，最大为100。</p> 
     * @return Limit <p>查询数目，默认为20，最大为100。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>查询数目，默认为20，最大为100。</p>
     * @param Limit <p>查询数目，默认为20，最大为100。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>数据库列表</p> 
     * @return DB <p>数据库列表</p>
     */
    public String [] getDB() {
        return this.DB;
    }

    /**
     * Set <p>数据库列表</p>
     * @param DB <p>数据库列表</p>
     */
    public void setDB(String [] DB) {
        this.DB = DB;
    }

    /**
     * Get <p>关键字</p> 
     * @return Key <p>关键字</p>
     */
    public String [] getKey() {
        return this.Key;
    }

    /**
     * Set <p>关键字</p>
     * @param Key <p>关键字</p>
     */
    public void setKey(String [] Key) {
        this.Key = Key;
    }

    /**
     * Get <p>用户</p> 
     * @return User <p>用户</p>
     */
    public String [] getUser() {
        return this.User;
    }

    /**
     * Set <p>用户</p>
     * @param User <p>用户</p>
     */
    public void setUser(String [] User) {
        this.User = User;
    }

    /**
     * Get <p>IP 来源</p> 
     * @return Ip <p>IP 来源</p>
     */
    public String [] getIp() {
        return this.Ip;
    }

    /**
     * Set <p>IP 来源</p>
     * @param Ip <p>IP 来源</p>
     */
    public void setIp(String [] Ip) {
        this.Ip = Ip;
    }

    /**
     * Get <p>耗时区间,耗时区间的左右边界分别对应数组的第0个元素和第一个元素</p> 
     * @return Time <p>耗时区间,耗时区间的左右边界分别对应数组的第0个元素和第一个元素</p>
     */
    public Long [] getTime() {
        return this.Time;
    }

    /**
     * Set <p>耗时区间,耗时区间的左右边界分别对应数组的第0个元素和第一个元素</p>
     * @param Time <p>耗时区间,耗时区间的左右边界分别对应数组的第0个元素和第一个元素</p>
     */
    public void setTime(Long [] Time) {
        this.Time = Time;
    }

    public DescribeSlowLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSlowLogsRequest(DescribeSlowLogsRequest source) {
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Md5 != null) {
            this.Md5 = new String(source.Md5);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.DB != null) {
            this.DB = new String[source.DB.length];
            for (int i = 0; i < source.DB.length; i++) {
                this.DB[i] = new String(source.DB[i]);
            }
        }
        if (source.Key != null) {
            this.Key = new String[source.Key.length];
            for (int i = 0; i < source.Key.length; i++) {
                this.Key[i] = new String(source.Key[i]);
            }
        }
        if (source.User != null) {
            this.User = new String[source.User.length];
            for (int i = 0; i < source.User.length; i++) {
                this.User[i] = new String(source.User[i]);
            }
        }
        if (source.Ip != null) {
            this.Ip = new String[source.Ip.length];
            for (int i = 0; i < source.Ip.length; i++) {
                this.Ip[i] = new String(source.Ip[i]);
            }
        }
        if (source.Time != null) {
            this.Time = new Long[source.Time.length];
            for (int i = 0; i < source.Time.length; i++) {
                this.Time[i] = new Long(source.Time[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Md5", this.Md5);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "DB.", this.DB);
        this.setParamArraySimple(map, prefix + "Key.", this.Key);
        this.setParamArraySimple(map, prefix + "User.", this.User);
        this.setParamArraySimple(map, prefix + "Ip.", this.Ip);
        this.setParamArraySimple(map, prefix + "Time.", this.Time);

    }
}

