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

public class CreateKillTaskRequest extends AbstractModel{

    /**
    * kill会话任务的关联实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 任务持续时间，单位秒，手动关闭任务传-1。
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 任务过滤条件，客户端IP。
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 任务过滤条件，数据库库名,多个","隔开。
    */
    @SerializedName("DB")
    @Expose
    private String DB;

    /**
    * 任务过滤条件，相关命令，多个","隔开。
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * 任务过滤条件，支持单条件前缀匹配。
    */
    @SerializedName("Info")
    @Expose
    private String Info;

    /**
    * 任务过滤条件，用户类型。
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 任务过滤条件，会话持续时长，单位秒。
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
    * 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 CynosDB  for MySQL，默认为"mysql"。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get kill会话任务的关联实例ID。 
     * @return InstanceId kill会话任务的关联实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set kill会话任务的关联实例ID。
     * @param InstanceId kill会话任务的关联实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 任务持续时间，单位秒，手动关闭任务传-1。 
     * @return Duration 任务持续时间，单位秒，手动关闭任务传-1。
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 任务持续时间，单位秒，手动关闭任务传-1。
     * @param Duration 任务持续时间，单位秒，手动关闭任务传-1。
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 任务过滤条件，客户端IP。 
     * @return Host 任务过滤条件，客户端IP。
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 任务过滤条件，客户端IP。
     * @param Host 任务过滤条件，客户端IP。
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 任务过滤条件，数据库库名,多个","隔开。 
     * @return DB 任务过滤条件，数据库库名,多个","隔开。
     */
    public String getDB() {
        return this.DB;
    }

    /**
     * Set 任务过滤条件，数据库库名,多个","隔开。
     * @param DB 任务过滤条件，数据库库名,多个","隔开。
     */
    public void setDB(String DB) {
        this.DB = DB;
    }

    /**
     * Get 任务过滤条件，相关命令，多个","隔开。 
     * @return Command 任务过滤条件，相关命令，多个","隔开。
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set 任务过滤条件，相关命令，多个","隔开。
     * @param Command 任务过滤条件，相关命令，多个","隔开。
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * Get 任务过滤条件，支持单条件前缀匹配。 
     * @return Info 任务过滤条件，支持单条件前缀匹配。
     */
    public String getInfo() {
        return this.Info;
    }

    /**
     * Set 任务过滤条件，支持单条件前缀匹配。
     * @param Info 任务过滤条件，支持单条件前缀匹配。
     */
    public void setInfo(String Info) {
        this.Info = Info;
    }

    /**
     * Get 任务过滤条件，用户类型。 
     * @return User 任务过滤条件，用户类型。
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 任务过滤条件，用户类型。
     * @param User 任务过滤条件，用户类型。
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 任务过滤条件，会话持续时长，单位秒。 
     * @return Time 任务过滤条件，会话持续时长，单位秒。
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set 任务过滤条件，会话持续时长，单位秒。
     * @param Time 任务过滤条件，会话持续时长，单位秒。
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    /**
     * Get 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 CynosDB  for MySQL，默认为"mysql"。 
     * @return Product 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 CynosDB  for MySQL，默认为"mysql"。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 CynosDB  for MySQL，默认为"mysql"。
     * @param Product 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 CynosDB  for MySQL，默认为"mysql"。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    public CreateKillTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateKillTaskRequest(CreateKillTaskRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.DB != null) {
            this.DB = new String(source.DB);
        }
        if (source.Command != null) {
            this.Command = new String(source.Command);
        }
        if (source.Info != null) {
            this.Info = new String(source.Info);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Time != null) {
            this.Time = new Long(source.Time);
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
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "DB", this.DB);
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamSimple(map, prefix + "Info", this.Info);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

