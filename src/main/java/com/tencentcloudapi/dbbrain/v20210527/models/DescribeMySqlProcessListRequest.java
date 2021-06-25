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

public class DescribeMySqlProcessListRequest extends AbstractModel{

    /**
    * 实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 线程的ID，用于筛选线程列表。
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 线程的操作账号名，用于筛选线程列表。
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 线程的操作主机地址，用于筛选线程列表。
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 线程的操作数据库，用于筛选线程列表。
    */
    @SerializedName("DB")
    @Expose
    private String DB;

    /**
    * 线程的操作状态，用于筛选线程列表。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 线程的执行类型，用于筛选线程列表。
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * 线程的操作时长最小值，单位秒，用于筛选操作时长大于该值的线程列表。
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
    * 线程的操作语句，用于筛选线程列表。
    */
    @SerializedName("Info")
    @Expose
    private String Info;

    /**
    * 返回数量，默认20。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 服务产品类型，支持值："mysql" - 云数据库 MySQL；"cynosdb" - 云数据库 TDSQL-C for MySQL，默认为"mysql"。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get 实例ID。 
     * @return InstanceId 实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID。
     * @param InstanceId 实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 线程的ID，用于筛选线程列表。 
     * @return ID 线程的ID，用于筛选线程列表。
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 线程的ID，用于筛选线程列表。
     * @param ID 线程的ID，用于筛选线程列表。
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 线程的操作账号名，用于筛选线程列表。 
     * @return User 线程的操作账号名，用于筛选线程列表。
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 线程的操作账号名，用于筛选线程列表。
     * @param User 线程的操作账号名，用于筛选线程列表。
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 线程的操作主机地址，用于筛选线程列表。 
     * @return Host 线程的操作主机地址，用于筛选线程列表。
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 线程的操作主机地址，用于筛选线程列表。
     * @param Host 线程的操作主机地址，用于筛选线程列表。
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 线程的操作数据库，用于筛选线程列表。 
     * @return DB 线程的操作数据库，用于筛选线程列表。
     */
    public String getDB() {
        return this.DB;
    }

    /**
     * Set 线程的操作数据库，用于筛选线程列表。
     * @param DB 线程的操作数据库，用于筛选线程列表。
     */
    public void setDB(String DB) {
        this.DB = DB;
    }

    /**
     * Get 线程的操作状态，用于筛选线程列表。 
     * @return State 线程的操作状态，用于筛选线程列表。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 线程的操作状态，用于筛选线程列表。
     * @param State 线程的操作状态，用于筛选线程列表。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 线程的执行类型，用于筛选线程列表。 
     * @return Command 线程的执行类型，用于筛选线程列表。
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set 线程的执行类型，用于筛选线程列表。
     * @param Command 线程的执行类型，用于筛选线程列表。
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * Get 线程的操作时长最小值，单位秒，用于筛选操作时长大于该值的线程列表。 
     * @return Time 线程的操作时长最小值，单位秒，用于筛选操作时长大于该值的线程列表。
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set 线程的操作时长最小值，单位秒，用于筛选操作时长大于该值的线程列表。
     * @param Time 线程的操作时长最小值，单位秒，用于筛选操作时长大于该值的线程列表。
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    /**
     * Get 线程的操作语句，用于筛选线程列表。 
     * @return Info 线程的操作语句，用于筛选线程列表。
     */
    public String getInfo() {
        return this.Info;
    }

    /**
     * Set 线程的操作语句，用于筛选线程列表。
     * @param Info 线程的操作语句，用于筛选线程列表。
     */
    public void setInfo(String Info) {
        this.Info = Info;
    }

    /**
     * Get 返回数量，默认20。 
     * @return Limit 返回数量，默认20。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认20。
     * @param Limit 返回数量，默认20。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 服务产品类型，支持值："mysql" - 云数据库 MySQL；"cynosdb" - 云数据库 TDSQL-C for MySQL，默认为"mysql"。 
     * @return Product 服务产品类型，支持值："mysql" - 云数据库 MySQL；"cynosdb" - 云数据库 TDSQL-C for MySQL，默认为"mysql"。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 服务产品类型，支持值："mysql" - 云数据库 MySQL；"cynosdb" - 云数据库 TDSQL-C for MySQL，默认为"mysql"。
     * @param Product 服务产品类型，支持值："mysql" - 云数据库 MySQL；"cynosdb" - 云数据库 TDSQL-C for MySQL，默认为"mysql"。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    public DescribeMySqlProcessListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMySqlProcessListRequest(DescribeMySqlProcessListRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.DB != null) {
            this.DB = new String(source.DB);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.Command != null) {
            this.Command = new String(source.Command);
        }
        if (source.Time != null) {
            this.Time = new Long(source.Time);
        }
        if (source.Info != null) {
            this.Info = new String(source.Info);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "DB", this.DB);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Info", this.Info);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

