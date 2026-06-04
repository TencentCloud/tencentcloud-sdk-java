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

public class DescribeMySqlProcessListRequest extends AbstractModel {

    /**
    * <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。<strong>其中 dcdb(即TDSQL MySQL) 的查询入参InstanceId特殊，需要使用 ClusterId + &amp; + InstanceId 来组合代替， 如：<code>tdsqlshard-s1230&amp;shard-abcd</code></strong></p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>线程的ID，用于筛选线程列表。</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>线程的操作账号名，用于筛选线程列表。</p>
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * <p>线程的操作主机地址，用于筛选线程列表。</p>
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * <p>线程的操作数据库，用于筛选线程列表。</p>
    */
    @SerializedName("DB")
    @Expose
    private String DB;

    /**
    * <p>线程的操作状态。包含以下枚举值：Sending data​-线程正在处理查询结果， ​Sorting result​-线程正在对查询结果进行排序​，Creating tmp table​-线程正在创建临时表，Altering table​-线程正在执行表结构变更，Updating-线程执行更新中。</p>
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * <p>线程的执行类型。包含以下枚举值：Sleep-线程处于空闲状态，Query-线程正在执行一个查询，Connect-从服务器连接到主服务器，Execute-线程正在执行预处理语句。</p>
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * <p>线程的操作时长最小值，单位秒，用于筛选操作时长大于该值的线程列表。</p>
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
    * <p>线程的操作语句，用于筛选线程列表。</p>
    */
    @SerializedName("Info")
    @Expose
    private String Info;

    /**
    * <p>返回数量，默认20。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>服务产品类型，支持值：&quot;mysql&quot; - 云数据库 MySQL；&quot;mariadb&quot;-mariadb;&quot;cynosdb&quot;-TDSQL-C for MySQL ;&quot;dcdb&quot;-TDSQL MySQL 默认为&quot;mysql&quot;。</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * <p>会话统计的维度信息,可以多个维度。</p>
    */
    @SerializedName("StatDimensions")
    @Expose
    private StatDimension [] StatDimensions;

    /**
     * Get <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。<strong>其中 dcdb(即TDSQL MySQL) 的查询入参InstanceId特殊，需要使用 ClusterId + &amp; + InstanceId 来组合代替， 如：<code>tdsqlshard-s1230&amp;shard-abcd</code></strong></p> 
     * @return InstanceId <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。<strong>其中 dcdb(即TDSQL MySQL) 的查询入参InstanceId特殊，需要使用 ClusterId + &amp; + InstanceId 来组合代替， 如：<code>tdsqlshard-s1230&amp;shard-abcd</code></strong></p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。<strong>其中 dcdb(即TDSQL MySQL) 的查询入参InstanceId特殊，需要使用 ClusterId + &amp; + InstanceId 来组合代替， 如：<code>tdsqlshard-s1230&amp;shard-abcd</code></strong></p>
     * @param InstanceId <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。<strong>其中 dcdb(即TDSQL MySQL) 的查询入参InstanceId特殊，需要使用 ClusterId + &amp; + InstanceId 来组合代替， 如：<code>tdsqlshard-s1230&amp;shard-abcd</code></strong></p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>线程的ID，用于筛选线程列表。</p> 
     * @return ID <p>线程的ID，用于筛选线程列表。</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>线程的ID，用于筛选线程列表。</p>
     * @param ID <p>线程的ID，用于筛选线程列表。</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>线程的操作账号名，用于筛选线程列表。</p> 
     * @return User <p>线程的操作账号名，用于筛选线程列表。</p>
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set <p>线程的操作账号名，用于筛选线程列表。</p>
     * @param User <p>线程的操作账号名，用于筛选线程列表。</p>
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get <p>线程的操作主机地址，用于筛选线程列表。</p> 
     * @return Host <p>线程的操作主机地址，用于筛选线程列表。</p>
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set <p>线程的操作主机地址，用于筛选线程列表。</p>
     * @param Host <p>线程的操作主机地址，用于筛选线程列表。</p>
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get <p>线程的操作数据库，用于筛选线程列表。</p> 
     * @return DB <p>线程的操作数据库，用于筛选线程列表。</p>
     */
    public String getDB() {
        return this.DB;
    }

    /**
     * Set <p>线程的操作数据库，用于筛选线程列表。</p>
     * @param DB <p>线程的操作数据库，用于筛选线程列表。</p>
     */
    public void setDB(String DB) {
        this.DB = DB;
    }

    /**
     * Get <p>线程的操作状态。包含以下枚举值：Sending data​-线程正在处理查询结果， ​Sorting result​-线程正在对查询结果进行排序​，Creating tmp table​-线程正在创建临时表，Altering table​-线程正在执行表结构变更，Updating-线程执行更新中。</p> 
     * @return State <p>线程的操作状态。包含以下枚举值：Sending data​-线程正在处理查询结果， ​Sorting result​-线程正在对查询结果进行排序​，Creating tmp table​-线程正在创建临时表，Altering table​-线程正在执行表结构变更，Updating-线程执行更新中。</p>
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set <p>线程的操作状态。包含以下枚举值：Sending data​-线程正在处理查询结果， ​Sorting result​-线程正在对查询结果进行排序​，Creating tmp table​-线程正在创建临时表，Altering table​-线程正在执行表结构变更，Updating-线程执行更新中。</p>
     * @param State <p>线程的操作状态。包含以下枚举值：Sending data​-线程正在处理查询结果， ​Sorting result​-线程正在对查询结果进行排序​，Creating tmp table​-线程正在创建临时表，Altering table​-线程正在执行表结构变更，Updating-线程执行更新中。</p>
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get <p>线程的执行类型。包含以下枚举值：Sleep-线程处于空闲状态，Query-线程正在执行一个查询，Connect-从服务器连接到主服务器，Execute-线程正在执行预处理语句。</p> 
     * @return Command <p>线程的执行类型。包含以下枚举值：Sleep-线程处于空闲状态，Query-线程正在执行一个查询，Connect-从服务器连接到主服务器，Execute-线程正在执行预处理语句。</p>
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set <p>线程的执行类型。包含以下枚举值：Sleep-线程处于空闲状态，Query-线程正在执行一个查询，Connect-从服务器连接到主服务器，Execute-线程正在执行预处理语句。</p>
     * @param Command <p>线程的执行类型。包含以下枚举值：Sleep-线程处于空闲状态，Query-线程正在执行一个查询，Connect-从服务器连接到主服务器，Execute-线程正在执行预处理语句。</p>
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * Get <p>线程的操作时长最小值，单位秒，用于筛选操作时长大于该值的线程列表。</p> 
     * @return Time <p>线程的操作时长最小值，单位秒，用于筛选操作时长大于该值的线程列表。</p>
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set <p>线程的操作时长最小值，单位秒，用于筛选操作时长大于该值的线程列表。</p>
     * @param Time <p>线程的操作时长最小值，单位秒，用于筛选操作时长大于该值的线程列表。</p>
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    /**
     * Get <p>线程的操作语句，用于筛选线程列表。</p> 
     * @return Info <p>线程的操作语句，用于筛选线程列表。</p>
     */
    public String getInfo() {
        return this.Info;
    }

    /**
     * Set <p>线程的操作语句，用于筛选线程列表。</p>
     * @param Info <p>线程的操作语句，用于筛选线程列表。</p>
     */
    public void setInfo(String Info) {
        this.Info = Info;
    }

    /**
     * Get <p>返回数量，默认20。</p> 
     * @return Limit <p>返回数量，默认20。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数量，默认20。</p>
     * @param Limit <p>返回数量，默认20。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>服务产品类型，支持值：&quot;mysql&quot; - 云数据库 MySQL；&quot;mariadb&quot;-mariadb;&quot;cynosdb&quot;-TDSQL-C for MySQL ;&quot;dcdb&quot;-TDSQL MySQL 默认为&quot;mysql&quot;。</p> 
     * @return Product <p>服务产品类型，支持值：&quot;mysql&quot; - 云数据库 MySQL；&quot;mariadb&quot;-mariadb;&quot;cynosdb&quot;-TDSQL-C for MySQL ;&quot;dcdb&quot;-TDSQL MySQL 默认为&quot;mysql&quot;。</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>服务产品类型，支持值：&quot;mysql&quot; - 云数据库 MySQL；&quot;mariadb&quot;-mariadb;&quot;cynosdb&quot;-TDSQL-C for MySQL ;&quot;dcdb&quot;-TDSQL MySQL 默认为&quot;mysql&quot;。</p>
     * @param Product <p>服务产品类型，支持值：&quot;mysql&quot; - 云数据库 MySQL；&quot;mariadb&quot;-mariadb;&quot;cynosdb&quot;-TDSQL-C for MySQL ;&quot;dcdb&quot;-TDSQL MySQL 默认为&quot;mysql&quot;。</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get <p>会话统计的维度信息,可以多个维度。</p> 
     * @return StatDimensions <p>会话统计的维度信息,可以多个维度。</p>
     */
    public StatDimension [] getStatDimensions() {
        return this.StatDimensions;
    }

    /**
     * Set <p>会话统计的维度信息,可以多个维度。</p>
     * @param StatDimensions <p>会话统计的维度信息,可以多个维度。</p>
     */
    public void setStatDimensions(StatDimension [] StatDimensions) {
        this.StatDimensions = StatDimensions;
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
        if (source.StatDimensions != null) {
            this.StatDimensions = new StatDimension[source.StatDimensions.length];
            for (int i = 0; i < source.StatDimensions.length; i++) {
                this.StatDimensions[i] = new StatDimension(source.StatDimensions[i]);
            }
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
        this.setParamArrayObj(map, prefix + "StatDimensions.", this.StatDimensions);

    }
}

