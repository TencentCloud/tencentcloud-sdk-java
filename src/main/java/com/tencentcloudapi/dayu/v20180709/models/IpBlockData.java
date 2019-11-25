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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IpBlockData  extends AbstractModel{

    /**
    * IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 状态（Blocked：被封堵；UnBlocking：解封中；UnBlockFailed：解封失败）
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 封堵时间
    */
    @SerializedName("BlockTime")
    @Expose
    private String BlockTime;

    /**
    * 解封时间（预计解封时间）
    */
    @SerializedName("UnBlockTime")
    @Expose
    private String UnBlockTime;

    /**
    * 解封类型（user：自助解封；auto：自动解封； update：升级解封；bind：绑定高防包解封）
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
     * 获取IP
     * @return Ip IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * 设置IP
     * @param Ip IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * 获取状态（Blocked：被封堵；UnBlocking：解封中；UnBlockFailed：解封失败）
     * @return Status 状态（Blocked：被封堵；UnBlocking：解封中；UnBlockFailed：解封失败）
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * 设置状态（Blocked：被封堵；UnBlocking：解封中；UnBlockFailed：解封失败）
     * @param Status 状态（Blocked：被封堵；UnBlocking：解封中；UnBlockFailed：解封失败）
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * 获取封堵时间
     * @return BlockTime 封堵时间
     */
    public String getBlockTime() {
        return this.BlockTime;
    }

    /**
     * 设置封堵时间
     * @param BlockTime 封堵时间
     */
    public void setBlockTime(String BlockTime) {
        this.BlockTime = BlockTime;
    }

    /**
     * 获取解封时间（预计解封时间）
     * @return UnBlockTime 解封时间（预计解封时间）
     */
    public String getUnBlockTime() {
        return this.UnBlockTime;
    }

    /**
     * 设置解封时间（预计解封时间）
     * @param UnBlockTime 解封时间（预计解封时间）
     */
    public void setUnBlockTime(String UnBlockTime) {
        this.UnBlockTime = UnBlockTime;
    }

    /**
     * 获取解封类型（user：自助解封；auto：自动解封； update：升级解封；bind：绑定高防包解封）
     * @return ActionType 解封类型（user：自助解封；auto：自动解封； update：升级解封；bind：绑定高防包解封）
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * 设置解封类型（user：自助解封；auto：自动解封； update：升级解封；bind：绑定高防包解封）
     * @param ActionType 解封类型（user：自助解封；auto：自动解封； update：升级解封；bind：绑定高防包解封）
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "BlockTime", this.BlockTime);
        this.setParamSimple(map, prefix + "UnBlockTime", this.UnBlockTime);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);

    }
}

