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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCertificateVerifyResultResponse extends AbstractModel {

    /**
    * 状态码
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 错误详情
    */
    @SerializedName("Detail")
    @Expose
    private String [] Detail;

    /**
    * 过期时间
    */
    @SerializedName("NotAfter")
    @Expose
    private String NotAfter;

    /**
    * 证书是否改变:1有改变，0没有改变
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Changed")
    @Expose
    private Long Changed;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 状态码 
     * @return Status 状态码
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态码
     * @param Status 状态码
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 错误详情 
     * @return Detail 错误详情
     */
    public String [] getDetail() {
        return this.Detail;
    }

    /**
     * Set 错误详情
     * @param Detail 错误详情
     */
    public void setDetail(String [] Detail) {
        this.Detail = Detail;
    }

    /**
     * Get 过期时间 
     * @return NotAfter 过期时间
     */
    public String getNotAfter() {
        return this.NotAfter;
    }

    /**
     * Set 过期时间
     * @param NotAfter 过期时间
     */
    public void setNotAfter(String NotAfter) {
        this.NotAfter = NotAfter;
    }

    /**
     * Get 证书是否改变:1有改变，0没有改变
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Changed 证书是否改变:1有改变，0没有改变
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getChanged() {
        return this.Changed;
    }

    /**
     * Set 证书是否改变:1有改变，0没有改变
注意：此字段可能返回 null，表示取不到有效值。
     * @param Changed 证书是否改变:1有改变，0没有改变
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChanged(Long Changed) {
        this.Changed = Changed;
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

    public DescribeCertificateVerifyResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCertificateVerifyResultResponse(DescribeCertificateVerifyResultResponse source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Detail != null) {
            this.Detail = new String[source.Detail.length];
            for (int i = 0; i < source.Detail.length; i++) {
                this.Detail[i] = new String(source.Detail[i]);
            }
        }
        if (source.NotAfter != null) {
            this.NotAfter = new String(source.NotAfter);
        }
        if (source.Changed != null) {
            this.Changed = new Long(source.Changed);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "Detail.", this.Detail);
        this.setParamSimple(map, prefix + "NotAfter", this.NotAfter);
        this.setParamSimple(map, prefix + "Changed", this.Changed);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

