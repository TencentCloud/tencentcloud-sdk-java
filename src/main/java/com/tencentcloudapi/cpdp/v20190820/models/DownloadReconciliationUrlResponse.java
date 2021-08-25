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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DownloadReconciliationUrlResponse extends AbstractModel{

    /**
    * 下载地址
    */
    @SerializedName("DownloadUrl")
    @Expose
    private String DownloadUrl;

    /**
    * hash类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HashType")
    @Expose
    private String HashType;

    /**
    * hash值
    */
    @SerializedName("HashValue")
    @Expose
    private String HashValue;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 下载地址 
     * @return DownloadUrl 下载地址
     */
    public String getDownloadUrl() {
        return this.DownloadUrl;
    }

    /**
     * Set 下载地址
     * @param DownloadUrl 下载地址
     */
    public void setDownloadUrl(String DownloadUrl) {
        this.DownloadUrl = DownloadUrl;
    }

    /**
     * Get hash类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HashType hash类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHashType() {
        return this.HashType;
    }

    /**
     * Set hash类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param HashType hash类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHashType(String HashType) {
        this.HashType = HashType;
    }

    /**
     * Get hash值 
     * @return HashValue hash值
     */
    public String getHashValue() {
        return this.HashValue;
    }

    /**
     * Set hash值
     * @param HashValue hash值
     */
    public void setHashValue(String HashValue) {
        this.HashValue = HashValue;
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

    public DownloadReconciliationUrlResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DownloadReconciliationUrlResponse(DownloadReconciliationUrlResponse source) {
        if (source.DownloadUrl != null) {
            this.DownloadUrl = new String(source.DownloadUrl);
        }
        if (source.HashType != null) {
            this.HashType = new String(source.HashType);
        }
        if (source.HashValue != null) {
            this.HashValue = new String(source.HashValue);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DownloadUrl", this.DownloadUrl);
        this.setParamSimple(map, prefix + "HashType", this.HashType);
        this.setParamSimple(map, prefix + "HashValue", this.HashValue);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

