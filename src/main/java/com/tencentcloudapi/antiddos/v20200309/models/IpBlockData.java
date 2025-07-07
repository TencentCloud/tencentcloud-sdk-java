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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IpBlockData extends AbstractModel {

    /**
    * 状态（Blocked：被封堵；UnBlocking：解封中；UnBlockFailed：解封失败）
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 资源IP
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
    * 高防标记，0：非高防，1：高防
    */
    @SerializedName("ProtectFlag")
    @Expose
    private Long ProtectFlag;

    /**
     * Get 状态（Blocked：被封堵；UnBlocking：解封中；UnBlockFailed：解封失败） 
     * @return Status 状态（Blocked：被封堵；UnBlocking：解封中；UnBlockFailed：解封失败）
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态（Blocked：被封堵；UnBlocking：解封中；UnBlockFailed：解封失败）
     * @param Status 状态（Blocked：被封堵；UnBlocking：解封中；UnBlockFailed：解封失败）
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 资源IP 
     * @return Ip 资源IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 资源IP
     * @param Ip 资源IP
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
     * Get 解封时间（预计解封时间） 
     * @return UnBlockTime 解封时间（预计解封时间）
     */
    public String getUnBlockTime() {
        return this.UnBlockTime;
    }

    /**
     * Set 解封时间（预计解封时间）
     * @param UnBlockTime 解封时间（预计解封时间）
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
     * Get 高防标记，0：非高防，1：高防 
     * @return ProtectFlag 高防标记，0：非高防，1：高防
     */
    public Long getProtectFlag() {
        return this.ProtectFlag;
    }

    /**
     * Set 高防标记，0：非高防，1：高防
     * @param ProtectFlag 高防标记，0：非高防，1：高防
     */
    public void setProtectFlag(Long ProtectFlag) {
        this.ProtectFlag = ProtectFlag;
    }

    public IpBlockData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IpBlockData(IpBlockData source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.BlockTime != null) {
            this.BlockTime = new String(source.BlockTime);
        }
        if (source.UnBlockTime != null) {
            this.UnBlockTime = new String(source.UnBlockTime);
        }
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.ProtectFlag != null) {
            this.ProtectFlag = new Long(source.ProtectFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "BlockTime", this.BlockTime);
        this.setParamSimple(map, prefix + "UnBlockTime", this.UnBlockTime);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "ProtectFlag", this.ProtectFlag);

    }
}

