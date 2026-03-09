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

public class CreateMongoDBKillTaskRequest extends AbstractModel {

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
    * 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 CynosDB  for MySQL，默认为"mysql"。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 任务过滤条件，客户端IP。
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 命名空间
    */
    @SerializedName("DB")
    @Expose
    private String [] DB;

    /**
    * update,insert,query,getmore,remove,killcursors,command,compressed,none
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * kill任务过滤条件，会话持续时长，单位秒。
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

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
     * Get 命名空间 
     * @return DB 命名空间
     */
    public String [] getDB() {
        return this.DB;
    }

    /**
     * Set 命名空间
     * @param DB 命名空间
     */
    public void setDB(String [] DB) {
        this.DB = DB;
    }

    /**
     * Get update,insert,query,getmore,remove,killcursors,command,compressed,none 
     * @return Type update,insert,query,getmore,remove,killcursors,command,compressed,none
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set update,insert,query,getmore,remove,killcursors,command,compressed,none
     * @param Type update,insert,query,getmore,remove,killcursors,command,compressed,none
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get kill任务过滤条件，会话持续时长，单位秒。 
     * @return Time kill任务过滤条件，会话持续时长，单位秒。
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set kill任务过滤条件，会话持续时长，单位秒。
     * @param Time kill任务过滤条件，会话持续时长，单位秒。
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    public CreateMongoDBKillTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMongoDBKillTaskRequest(CreateMongoDBKillTaskRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.DB != null) {
            this.DB = new String[source.DB.length];
            for (int i = 0; i < source.DB.length; i++) {
                this.DB[i] = new String(source.DB[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Time != null) {
            this.Time = new Long(source.Time);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamArraySimple(map, prefix + "DB.", this.DB);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Time", this.Time);

    }
}

