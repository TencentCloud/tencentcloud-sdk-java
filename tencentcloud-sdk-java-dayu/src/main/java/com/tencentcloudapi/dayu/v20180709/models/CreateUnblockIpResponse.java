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

public class CreateUnblockIpResponse extends AbstractModel{

    /**
    * IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 解封类型（user：自助解封；auto：自动解封； update：升级解封；bind：绑定高防包解封）
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * 解封时间（预计解封时间）
    */
    @SerializedName("UnblockTime")
    @Expose
    private String UnblockTime;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get 解封时间（预计解封时间） 
     * @return UnblockTime 解封时间（预计解封时间）
     */
    public String getUnblockTime() {
        return this.UnblockTime;
    }

    /**
     * Set 解封时间（预计解封时间）
     * @param UnblockTime 解封时间（预计解封时间）
     */
    public void setUnblockTime(String UnblockTime) {
        this.UnblockTime = UnblockTime;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "UnblockTime", this.UnblockTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

