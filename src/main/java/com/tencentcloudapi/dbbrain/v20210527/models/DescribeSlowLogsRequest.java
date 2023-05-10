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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSlowLogsRequest extends AbstractModel{

    /**
    * 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 CynosDB for MySQL，默认为"mysql"。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 实例id。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * sql模板的md5值
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
    * 开始时间，如“2019-09-10 12:13:14”。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 截止时间，如“2019-09-11 10:13:14”，截止时间与开始时间的间隔小于7天。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询数目，默认为20，最大为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 数据库列表
    */
    @SerializedName("DB")
    @Expose
    private String [] DB;

    /**
    * 关键字
    */
    @SerializedName("Key")
    @Expose
    private String [] Key;

    /**
    * 用户
    */
    @SerializedName("User")
    @Expose
    private String [] User;

    /**
    * IP
    */
    @SerializedName("Ip")
    @Expose
    private String [] Ip;

    /**
    * 耗时区间,耗时区间的左右边界分别对应数组的第0个元素和第一个元素
    */
    @SerializedName("Time")
    @Expose
    private Long [] Time;

    /**
     * Get 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 CynosDB for MySQL，默认为"mysql"。 
     * @return Product 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 CynosDB for MySQL，默认为"mysql"。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 CynosDB for MySQL，默认为"mysql"。
     * @param Product 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 CynosDB for MySQL，默认为"mysql"。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 实例id。 
     * @return InstanceId 实例id。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id。
     * @param InstanceId 实例id。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get sql模板的md5值 
     * @return Md5 sql模板的md5值
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set sql模板的md5值
     * @param Md5 sql模板的md5值
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    /**
     * Get 开始时间，如“2019-09-10 12:13:14”。 
     * @return StartTime 开始时间，如“2019-09-10 12:13:14”。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间，如“2019-09-10 12:13:14”。
     * @param StartTime 开始时间，如“2019-09-10 12:13:14”。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 截止时间，如“2019-09-11 10:13:14”，截止时间与开始时间的间隔小于7天。 
     * @return EndTime 截止时间，如“2019-09-11 10:13:14”，截止时间与开始时间的间隔小于7天。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 截止时间，如“2019-09-11 10:13:14”，截止时间与开始时间的间隔小于7天。
     * @param EndTime 截止时间，如“2019-09-11 10:13:14”，截止时间与开始时间的间隔小于7天。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
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
     * Get 查询数目，默认为20，最大为100。 
     * @return Limit 查询数目，默认为20，最大为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询数目，默认为20，最大为100。
     * @param Limit 查询数目，默认为20，最大为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 数据库列表 
     * @return DB 数据库列表
     */
    public String [] getDB() {
        return this.DB;
    }

    /**
     * Set 数据库列表
     * @param DB 数据库列表
     */
    public void setDB(String [] DB) {
        this.DB = DB;
    }

    /**
     * Get 关键字 
     * @return Key 关键字
     */
    public String [] getKey() {
        return this.Key;
    }

    /**
     * Set 关键字
     * @param Key 关键字
     */
    public void setKey(String [] Key) {
        this.Key = Key;
    }

    /**
     * Get 用户 
     * @return User 用户
     */
    public String [] getUser() {
        return this.User;
    }

    /**
     * Set 用户
     * @param User 用户
     */
    public void setUser(String [] User) {
        this.User = User;
    }

    /**
     * Get IP 
     * @return Ip IP
     */
    public String [] getIp() {
        return this.Ip;
    }

    /**
     * Set IP
     * @param Ip IP
     */
    public void setIp(String [] Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 耗时区间,耗时区间的左右边界分别对应数组的第0个元素和第一个元素 
     * @return Time 耗时区间,耗时区间的左右边界分别对应数组的第0个元素和第一个元素
     */
    public Long [] getTime() {
        return this.Time;
    }

    /**
     * Set 耗时区间,耗时区间的左右边界分别对应数组的第0个元素和第一个元素
     * @param Time 耗时区间,耗时区间的左右边界分别对应数组的第0个元素和第一个元素
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

