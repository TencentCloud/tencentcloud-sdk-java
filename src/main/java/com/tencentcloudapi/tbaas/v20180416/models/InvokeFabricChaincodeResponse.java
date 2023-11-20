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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InvokeFabricChaincodeResponse extends AbstractModel {

    /**
    * 交易ID
    */
    @SerializedName("TxId")
    @Expose
    private String TxId;

    /**
    * 交易状态
    */
    @SerializedName("TxStatus")
    @Expose
    private String TxStatus;

    /**
    * 交易结果
    */
    @SerializedName("TxResult")
    @Expose
    private String TxResult;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get 交易状态 
     * @return TxStatus 交易状态
     */
    public String getTxStatus() {
        return this.TxStatus;
    }

    /**
     * Set 交易状态
     * @param TxStatus 交易状态
     */
    public void setTxStatus(String TxStatus) {
        this.TxStatus = TxStatus;
    }

    /**
     * Get 交易结果 
     * @return TxResult 交易结果
     */
    public String getTxResult() {
        return this.TxResult;
    }

    /**
     * Set 交易结果
     * @param TxResult 交易结果
     */
    public void setTxResult(String TxResult) {
        this.TxResult = TxResult;
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

    public InvokeFabricChaincodeResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InvokeFabricChaincodeResponse(InvokeFabricChaincodeResponse source) {
        if (source.TxId != null) {
            this.TxId = new String(source.TxId);
        }
        if (source.TxStatus != null) {
            this.TxStatus = new String(source.TxStatus);
        }
        if (source.TxResult != null) {
            this.TxResult = new String(source.TxResult);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TxId", this.TxId);
        this.setParamSimple(map, prefix + "TxStatus", this.TxStatus);
        this.setParamSimple(map, prefix + "TxResult", this.TxResult);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

