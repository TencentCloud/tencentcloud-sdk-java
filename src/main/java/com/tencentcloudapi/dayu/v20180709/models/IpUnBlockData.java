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

public class IpUnBlockData extends AbstractModel{

    /**
    * IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 封堵时间
    */
    @SerializedName("BlockTime")
    @Expose
    private String BlockTime;

    /**
    * 解封时间（实际解封时间）
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
     * Get IP 
     * @return Ip IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP
     * @param Ip IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 封堵时间 
     * @return BlockTime 封堵时间
     */
    public String getBlockTime() {
        return this.BlockTime;
    }

    /**
     * Set 封堵时间
     * @param BlockTime 封堵时间
     */
    public void setBlockTime(String BlockTime) {
        this.BlockTime = BlockTime;
    }

    /**
     * Get 解封时间（实际解封时间） 
     * @return UnBlockTime 解封时间（实际解封时间）
     */
    public String getUnBlockTime() {
        return this.UnBlockTime;
    }

    /**
     * Set 解封时间（实际解封时间）
     * @param UnBlockTime 解封时间（实际解封时间）
     */
    public void setUnBlockTime(String UnBlockTime) {
        this.UnBlockTime = UnBlockTime;
    }

    /**
     * Get 解封类型（user：自助解封；auto：自动解封； update：升级解封；bind：绑定高防包解封） 
     * @return ActionType 解封类型（user：自助解封；auto：自动解封； update：升级解封；bind：绑定高防包解封）
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set 解封类型（user：自助解封；auto：自动解封； update：升级解封；bind：绑定高防包解封）
     * @param ActionType 解封类型（user：自助解封；auto：自动解封； update：升级解封；bind：绑定高防包解封）
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "BlockTime", this.BlockTime);
        this.setParamSimple(map, prefix + "UnBlockTime", this.UnBlockTime);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);

    }
}

