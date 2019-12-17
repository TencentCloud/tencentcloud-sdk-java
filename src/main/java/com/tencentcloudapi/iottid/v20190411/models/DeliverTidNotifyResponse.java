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
package com.tencentcloudapi.iottid.v20190411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeliverTidNotifyResponse extends AbstractModel{

    /**
    * 剩余空发数量
    */
    @SerializedName("RemaindCount")
    @Expose
    private Long RemaindCount;

    /**
    * 已回执的TID编码
    */
    @SerializedName("Tid")
    @Expose
    private String Tid;

    /**
    * 产品公钥
    */
    @SerializedName("ProductKey")
    @Expose
    private String ProductKey;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 剩余空发数量 
     * @return RemaindCount 剩余空发数量
     */
    public Long getRemaindCount() {
        return this.RemaindCount;
    }

    /**
     * Set 剩余空发数量
     * @param RemaindCount 剩余空发数量
     */
    public void setRemaindCount(Long RemaindCount) {
        this.RemaindCount = RemaindCount;
    }

    /**
     * Get 已回执的TID编码 
     * @return Tid 已回执的TID编码
     */
    public String getTid() {
        return this.Tid;
    }

    /**
     * Set 已回执的TID编码
     * @param Tid 已回执的TID编码
     */
    public void setTid(String Tid) {
        this.Tid = Tid;
    }

    /**
     * Get 产品公钥 
     * @return ProductKey 产品公钥
     */
    public String getProductKey() {
        return this.ProductKey;
    }

    /**
     * Set 产品公钥
     * @param ProductKey 产品公钥
     */
    public void setProductKey(String ProductKey) {
        this.ProductKey = ProductKey;
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
        this.setParamSimple(map, prefix + "RemaindCount", this.RemaindCount);
        this.setParamSimple(map, prefix + "Tid", this.Tid);
        this.setParamSimple(map, prefix + "ProductKey", this.ProductKey);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

