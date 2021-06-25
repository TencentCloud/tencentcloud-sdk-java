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

public class MySqlProcess extends AbstractModel{

    /**
    * 线程ID。
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * 线程的操作账号名。
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 线程的操作主机地址。
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 线程的操作数据库。
    */
    @SerializedName("DB")
    @Expose
    private String DB;

    /**
    * 线程的操作状态。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 线程的执行类型。
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * 线程的操作时长，单位秒。
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 线程的操作语句。
    */
    @SerializedName("Info")
    @Expose
    private String Info;

    /**
     * Get 线程ID。 
     * @return ID 线程ID。
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set 线程ID。
     * @param ID 线程ID。
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get 线程的操作账号名。 
     * @return User 线程的操作账号名。
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 线程的操作账号名。
     * @param User 线程的操作账号名。
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 线程的操作主机地址。 
     * @return Host 线程的操作主机地址。
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 线程的操作主机地址。
     * @param Host 线程的操作主机地址。
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 线程的操作数据库。 
     * @return DB 线程的操作数据库。
     */
    public String getDB() {
        return this.DB;
    }

    /**
     * Set 线程的操作数据库。
     * @param DB 线程的操作数据库。
     */
    public void setDB(String DB) {
        this.DB = DB;
    }

    /**
     * Get 线程的操作状态。 
     * @return State 线程的操作状态。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 线程的操作状态。
     * @param State 线程的操作状态。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 线程的执行类型。 
     * @return Command 线程的执行类型。
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set 线程的执行类型。
     * @param Command 线程的执行类型。
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * Get 线程的操作时长，单位秒。 
     * @return Time 线程的操作时长，单位秒。
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 线程的操作时长，单位秒。
     * @param Time 线程的操作时长，单位秒。
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 线程的操作语句。 
     * @return Info 线程的操作语句。
     */
    public String getInfo() {
        return this.Info;
    }

    /**
     * Set 线程的操作语句。
     * @param Info 线程的操作语句。
     */
    public void setInfo(String Info) {
        this.Info = Info;
    }

    public MySqlProcess() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MySqlProcess(MySqlProcess source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
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
            this.Time = new String(source.Time);
        }
        if (source.Info != null) {
            this.Info = new String(source.Info);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "DB", this.DB);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Info", this.Info);

    }
}

