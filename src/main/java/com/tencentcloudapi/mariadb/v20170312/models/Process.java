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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Process extends AbstractModel {

    /**
    * 线程ID​​：唯一标识当前连接/线程的整数。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 用户名​​：发起连接的 MySQL 用户。
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 客户端地址​​：发起连接的客户端主机名及端口（格式：host:port）。
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 当前数据库​​：线程正在使用的数据库名（未选择数据库时为 空串）。
    */
    @SerializedName("Db")
    @Expose
    private String Db;

    /**
    * 命令类型​​：线程正在执行的命令类型。常见值：

- Sleep：空闲等待状态（等待新查询）。
- Query：正在执行查询或 SQL 语句。
- Binlog Dump：主服务器线程向从服务器发送二进制日志。
- Connect：客户端正在连接。
- Killed：线程被终止但未完全退出。
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * 执行时间（秒）​​：线程在当前状态持续的秒数。
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
    * 执行开始时间（秒）​​：线程在当前状态开始执行的时间。
    */
    @SerializedName("ProcessStartTime")
    @Expose
    private String ProcessStartTime;

    /**
    * ​​状态描述​​：线程当前的详细操作状态。常见值：

- Sending data：正在处理/发送数据。
- Locked：等待表锁释放（例如 MyISAM 表级锁）。
- Sorting result：排序查询结果。
- Updating：更新表中数据。
- 当为NULL返回空串：无明确状态（如 Sleep 时）。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 执行语句​​：正在执行的 SQL 语句（前 1024 字符）。
    */
    @SerializedName("Info")
    @Expose
    private String Info;

    /**
     * Get 线程ID​​：唯一标识当前连接/线程的整数。 
     * @return Id 线程ID​​：唯一标识当前连接/线程的整数。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 线程ID​​：唯一标识当前连接/线程的整数。
     * @param Id 线程ID​​：唯一标识当前连接/线程的整数。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 用户名​​：发起连接的 MySQL 用户。 
     * @return User 用户名​​：发起连接的 MySQL 用户。
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 用户名​​：发起连接的 MySQL 用户。
     * @param User 用户名​​：发起连接的 MySQL 用户。
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 客户端地址​​：发起连接的客户端主机名及端口（格式：host:port）。 
     * @return Host 客户端地址​​：发起连接的客户端主机名及端口（格式：host:port）。
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 客户端地址​​：发起连接的客户端主机名及端口（格式：host:port）。
     * @param Host 客户端地址​​：发起连接的客户端主机名及端口（格式：host:port）。
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 当前数据库​​：线程正在使用的数据库名（未选择数据库时为 空串）。 
     * @return Db 当前数据库​​：线程正在使用的数据库名（未选择数据库时为 空串）。
     */
    public String getDb() {
        return this.Db;
    }

    /**
     * Set 当前数据库​​：线程正在使用的数据库名（未选择数据库时为 空串）。
     * @param Db 当前数据库​​：线程正在使用的数据库名（未选择数据库时为 空串）。
     */
    public void setDb(String Db) {
        this.Db = Db;
    }

    /**
     * Get 命令类型​​：线程正在执行的命令类型。常见值：

- Sleep：空闲等待状态（等待新查询）。
- Query：正在执行查询或 SQL 语句。
- Binlog Dump：主服务器线程向从服务器发送二进制日志。
- Connect：客户端正在连接。
- Killed：线程被终止但未完全退出。 
     * @return Command 命令类型​​：线程正在执行的命令类型。常见值：

- Sleep：空闲等待状态（等待新查询）。
- Query：正在执行查询或 SQL 语句。
- Binlog Dump：主服务器线程向从服务器发送二进制日志。
- Connect：客户端正在连接。
- Killed：线程被终止但未完全退出。
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set 命令类型​​：线程正在执行的命令类型。常见值：

- Sleep：空闲等待状态（等待新查询）。
- Query：正在执行查询或 SQL 语句。
- Binlog Dump：主服务器线程向从服务器发送二进制日志。
- Connect：客户端正在连接。
- Killed：线程被终止但未完全退出。
     * @param Command 命令类型​​：线程正在执行的命令类型。常见值：

- Sleep：空闲等待状态（等待新查询）。
- Query：正在执行查询或 SQL 语句。
- Binlog Dump：主服务器线程向从服务器发送二进制日志。
- Connect：客户端正在连接。
- Killed：线程被终止但未完全退出。
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * Get 执行时间（秒）​​：线程在当前状态持续的秒数。 
     * @return Time 执行时间（秒）​​：线程在当前状态持续的秒数。
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set 执行时间（秒）​​：线程在当前状态持续的秒数。
     * @param Time 执行时间（秒）​​：线程在当前状态持续的秒数。
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    /**
     * Get 执行开始时间（秒）​​：线程在当前状态开始执行的时间。 
     * @return ProcessStartTime 执行开始时间（秒）​​：线程在当前状态开始执行的时间。
     */
    public String getProcessStartTime() {
        return this.ProcessStartTime;
    }

    /**
     * Set 执行开始时间（秒）​​：线程在当前状态开始执行的时间。
     * @param ProcessStartTime 执行开始时间（秒）​​：线程在当前状态开始执行的时间。
     */
    public void setProcessStartTime(String ProcessStartTime) {
        this.ProcessStartTime = ProcessStartTime;
    }

    /**
     * Get ​​状态描述​​：线程当前的详细操作状态。常见值：

- Sending data：正在处理/发送数据。
- Locked：等待表锁释放（例如 MyISAM 表级锁）。
- Sorting result：排序查询结果。
- Updating：更新表中数据。
- 当为NULL返回空串：无明确状态（如 Sleep 时）。 
     * @return State ​​状态描述​​：线程当前的详细操作状态。常见值：

- Sending data：正在处理/发送数据。
- Locked：等待表锁释放（例如 MyISAM 表级锁）。
- Sorting result：排序查询结果。
- Updating：更新表中数据。
- 当为NULL返回空串：无明确状态（如 Sleep 时）。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set ​​状态描述​​：线程当前的详细操作状态。常见值：

- Sending data：正在处理/发送数据。
- Locked：等待表锁释放（例如 MyISAM 表级锁）。
- Sorting result：排序查询结果。
- Updating：更新表中数据。
- 当为NULL返回空串：无明确状态（如 Sleep 时）。
     * @param State ​​状态描述​​：线程当前的详细操作状态。常见值：

- Sending data：正在处理/发送数据。
- Locked：等待表锁释放（例如 MyISAM 表级锁）。
- Sorting result：排序查询结果。
- Updating：更新表中数据。
- 当为NULL返回空串：无明确状态（如 Sleep 时）。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 执行语句​​：正在执行的 SQL 语句（前 1024 字符）。 
     * @return Info 执行语句​​：正在执行的 SQL 语句（前 1024 字符）。
     */
    public String getInfo() {
        return this.Info;
    }

    /**
     * Set 执行语句​​：正在执行的 SQL 语句（前 1024 字符）。
     * @param Info 执行语句​​：正在执行的 SQL 语句（前 1024 字符）。
     */
    public void setInfo(String Info) {
        this.Info = Info;
    }

    public Process() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Process(Process source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Db != null) {
            this.Db = new String(source.Db);
        }
        if (source.Command != null) {
            this.Command = new String(source.Command);
        }
        if (source.Time != null) {
            this.Time = new Long(source.Time);
        }
        if (source.ProcessStartTime != null) {
            this.ProcessStartTime = new String(source.ProcessStartTime);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.Info != null) {
            this.Info = new String(source.Info);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Db", this.Db);
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "ProcessStartTime", this.ProcessStartTime);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Info", this.Info);

    }
}

