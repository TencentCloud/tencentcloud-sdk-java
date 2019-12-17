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
package com.tencentcloudapi.tbaas.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InvokeResponse extends AbstractModel{

    /**
    * 交易ID
    */
    @SerializedName("Txid")
    @Expose
    private String Txid;

    /**
    * 交易执行结果
    */
    @SerializedName("Events")
    @Expose
    private String Events;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 交易ID 
     * @return Txid 交易ID
     */
    public String getTxid() {
        return this.Txid;
    }

    /**
     * Set 交易ID
     * @param Txid 交易ID
     */
    public void setTxid(String Txid) {
        this.Txid = Txid;
    }

    /**
     * Get 交易执行结果 
     * @return Events 交易执行结果
     */
    public String getEvents() {
        return this.Events;
    }

    /**
     * Set 交易执行结果
     * @param Events 交易执行结果
     */
    public void setEvents(String Events) {
        this.Events = Events;
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
        this.setParamSimple(map, prefix + "Txid", this.Txid);
        this.setParamSimple(map, prefix + "Events", this.Events);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

