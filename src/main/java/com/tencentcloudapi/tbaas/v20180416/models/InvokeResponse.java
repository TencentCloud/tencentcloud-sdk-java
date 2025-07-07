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
package com.tencentcloudapi.tbaas.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InvokeResponse extends AbstractModel {

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
    * 交易ID
    */
    @SerializedName("TxId")
    @Expose
    private String TxId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 交易ID 
     * @return Txid 交易ID
     * @deprecated
     */
    @Deprecated
    public String getTxid() {
        return this.Txid;
    }

    /**
     * Set 交易ID
     * @param Txid 交易ID
     * @deprecated
     */
    @Deprecated
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
     * Get 交易ID 
     * @return TxId 交易ID
     */
    public String getTxId() {
        return this.TxId;
    }

    /**
     * Set 交易ID
     * @param TxId 交易ID
     */
    public void setTxId(String TxId) {
        this.TxId = TxId;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public InvokeResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InvokeResponse(InvokeResponse source) {
        if (source.Txid != null) {
            this.Txid = new String(source.Txid);
        }
        if (source.Events != null) {
            this.Events = new String(source.Events);
        }
        if (source.TxId != null) {
            this.TxId = new String(source.TxId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Txid", this.Txid);
        this.setParamSimple(map, prefix + "Events", this.Events);
        this.setParamSimple(map, prefix + "TxId", this.TxId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

