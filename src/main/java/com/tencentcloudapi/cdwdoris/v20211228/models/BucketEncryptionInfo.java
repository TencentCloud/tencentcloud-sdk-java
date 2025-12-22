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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BucketEncryptionInfo extends AbstractModel {

    /**
    * 是否已加密
    */
    @SerializedName("IsEncrypted")
    @Expose
    private Boolean IsEncrypted;

    /**
    * 加密类型：SSE-COS/SSE-KMS/disabled
    */
    @SerializedName("EncryptionType")
    @Expose
    private String EncryptionType;

    /**
    * 最后操作类型：enable/disable
    */
    @SerializedName("LastOperation")
    @Expose
    private String LastOperation;

    /**
    * 最后更新时间
    */
    @SerializedName("LastUpdateTime")
    @Expose
    private String LastUpdateTime;

    /**
     * Get 是否已加密 
     * @return IsEncrypted 是否已加密
     */
    public Boolean getIsEncrypted() {
        return this.IsEncrypted;
    }

    /**
     * Set 是否已加密
     * @param IsEncrypted 是否已加密
     */
    public void setIsEncrypted(Boolean IsEncrypted) {
        this.IsEncrypted = IsEncrypted;
    }

    /**
     * Get 加密类型：SSE-COS/SSE-KMS/disabled 
     * @return EncryptionType 加密类型：SSE-COS/SSE-KMS/disabled
     */
    public String getEncryptionType() {
        return this.EncryptionType;
    }

    /**
     * Set 加密类型：SSE-COS/SSE-KMS/disabled
     * @param EncryptionType 加密类型：SSE-COS/SSE-KMS/disabled
     */
    public void setEncryptionType(String EncryptionType) {
        this.EncryptionType = EncryptionType;
    }

    /**
     * Get 最后操作类型：enable/disable 
     * @return LastOperation 最后操作类型：enable/disable
     */
    public String getLastOperation() {
        return this.LastOperation;
    }

    /**
     * Set 最后操作类型：enable/disable
     * @param LastOperation 最后操作类型：enable/disable
     */
    public void setLastOperation(String LastOperation) {
        this.LastOperation = LastOperation;
    }

    /**
     * Get 最后更新时间 
     * @return LastUpdateTime 最后更新时间
     */
    public String getLastUpdateTime() {
        return this.LastUpdateTime;
    }

    /**
     * Set 最后更新时间
     * @param LastUpdateTime 最后更新时间
     */
    public void setLastUpdateTime(String LastUpdateTime) {
        this.LastUpdateTime = LastUpdateTime;
    }

    public BucketEncryptionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BucketEncryptionInfo(BucketEncryptionInfo source) {
        if (source.IsEncrypted != null) {
            this.IsEncrypted = new Boolean(source.IsEncrypted);
        }
        if (source.EncryptionType != null) {
            this.EncryptionType = new String(source.EncryptionType);
        }
        if (source.LastOperation != null) {
            this.LastOperation = new String(source.LastOperation);
        }
        if (source.LastUpdateTime != null) {
            this.LastUpdateTime = new String(source.LastUpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsEncrypted", this.IsEncrypted);
        this.setParamSimple(map, prefix + "EncryptionType", this.EncryptionType);
        this.setParamSimple(map, prefix + "LastOperation", this.LastOperation);
        this.setParamSimple(map, prefix + "LastUpdateTime", this.LastUpdateTime);

    }
}

