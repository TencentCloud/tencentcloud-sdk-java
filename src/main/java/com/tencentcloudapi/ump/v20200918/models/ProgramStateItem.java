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
package com.tencentcloudapi.ump.v20200918.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProgramStateItem extends AbstractModel{

    /**
    * 服务器IP
    */
    @SerializedName("ServerIp")
    @Expose
    private String ServerIp;

    /**
    * 进程名字
    */
    @SerializedName("ProgramName")
    @Expose
    private String ProgramName;

    /**
    * 在线个数
    */
    @SerializedName("OnlineCount")
    @Expose
    private Long OnlineCount;

    /**
    * 离线个数
    */
    @SerializedName("OfflineCount")
    @Expose
    private Long OfflineCount;

    /**
    * 上报状态:
1: 正常上报
2: 异常上报
注：此处异常上报是指本次上报由于场内服务内部原因导致上报数据不可信等。此时离线个数重置为1，在线个数重置为0
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
     * Get 服务器IP 
     * @return ServerIp 服务器IP
     */
    public String getServerIp() {
        return this.ServerIp;
    }

    /**
     * Set 服务器IP
     * @param ServerIp 服务器IP
     */
    public void setServerIp(String ServerIp) {
        this.ServerIp = ServerIp;
    }

    /**
     * Get 进程名字 
     * @return ProgramName 进程名字
     */
    public String getProgramName() {
        return this.ProgramName;
    }

    /**
     * Set 进程名字
     * @param ProgramName 进程名字
     */
    public void setProgramName(String ProgramName) {
        this.ProgramName = ProgramName;
    }

    /**
     * Get 在线个数 
     * @return OnlineCount 在线个数
     */
    public Long getOnlineCount() {
        return this.OnlineCount;
    }

    /**
     * Set 在线个数
     * @param OnlineCount 在线个数
     */
    public void setOnlineCount(Long OnlineCount) {
        this.OnlineCount = OnlineCount;
    }

    /**
     * Get 离线个数 
     * @return OfflineCount 离线个数
     */
    public Long getOfflineCount() {
        return this.OfflineCount;
    }

    /**
     * Set 离线个数
     * @param OfflineCount 离线个数
     */
    public void setOfflineCount(Long OfflineCount) {
        this.OfflineCount = OfflineCount;
    }

    /**
     * Get 上报状态:
1: 正常上报
2: 异常上报
注：此处异常上报是指本次上报由于场内服务内部原因导致上报数据不可信等。此时离线个数重置为1，在线个数重置为0 
     * @return State 上报状态:
1: 正常上报
2: 异常上报
注：此处异常上报是指本次上报由于场内服务内部原因导致上报数据不可信等。此时离线个数重置为1，在线个数重置为0
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 上报状态:
1: 正常上报
2: 异常上报
注：此处异常上报是指本次上报由于场内服务内部原因导致上报数据不可信等。此时离线个数重置为1，在线个数重置为0
     * @param State 上报状态:
1: 正常上报
2: 异常上报
注：此处异常上报是指本次上报由于场内服务内部原因导致上报数据不可信等。此时离线个数重置为1，在线个数重置为0
     */
    public void setState(Long State) {
        this.State = State;
    }

    public ProgramStateItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProgramStateItem(ProgramStateItem source) {
        if (source.ServerIp != null) {
            this.ServerIp = new String(source.ServerIp);
        }
        if (source.ProgramName != null) {
            this.ProgramName = new String(source.ProgramName);
        }
        if (source.OnlineCount != null) {
            this.OnlineCount = new Long(source.OnlineCount);
        }
        if (source.OfflineCount != null) {
            this.OfflineCount = new Long(source.OfflineCount);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServerIp", this.ServerIp);
        this.setParamSimple(map, prefix + "ProgramName", this.ProgramName);
        this.setParamSimple(map, prefix + "OnlineCount", this.OnlineCount);
        this.setParamSimple(map, prefix + "OfflineCount", this.OfflineCount);
        this.setParamSimple(map, prefix + "State", this.State);

    }
}

