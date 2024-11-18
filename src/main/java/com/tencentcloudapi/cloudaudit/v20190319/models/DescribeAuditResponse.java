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
package com.tencentcloudapi.cloudaudit.v20190319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAuditResponse extends AbstractModel {

    /**
    * 是否开启cmq消息通知。1：是，0：否。
    */
    @SerializedName("IsEnableCmqNotify")
    @Expose
    private Long IsEnableCmqNotify;

    /**
    * 管理事件读写属性，1：只读，2：只写，3：全部
    */
    @SerializedName("ReadWriteAttribute")
    @Expose
    private Long ReadWriteAttribute;

    /**
    * CMK的全局唯一标识符。
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 跟踪集状态，1：开启，0：停止。
    */
    @SerializedName("AuditStatus")
    @Expose
    private Long AuditStatus;

    /**
    * 跟踪集名称。
    */
    @SerializedName("AuditName")
    @Expose
    private String AuditName;

    /**
    * cos存储桶所在地域。
    */
    @SerializedName("CosRegion")
    @Expose
    private String CosRegion;

    /**
    * 队列名称。
    */
    @SerializedName("CmqQueueName")
    @Expose
    private String CmqQueueName;

    /**
    * CMK别名。
    */
    @SerializedName("KmsAlias")
    @Expose
    private String KmsAlias;

    /**
    * kms地域。
    */
    @SerializedName("KmsRegion")
    @Expose
    private String KmsRegion;

    /**
    * 是否开启kms加密。1：是，0：否。如果开启KMS加密，数据在投递到cos时，会将数据加密。
    */
    @SerializedName("IsEnableKmsEncry")
    @Expose
    private Long IsEnableKmsEncry;

    /**
    * cos存储桶名称。
    */
    @SerializedName("CosBucketName")
    @Expose
    private String CosBucketName;

    /**
    * 队列所在地域。
    */
    @SerializedName("CmqRegion")
    @Expose
    private String CmqRegion;

    /**
    * 日志前缀。
    */
    @SerializedName("LogFilePrefix")
    @Expose
    private String LogFilePrefix;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 是否开启cmq消息通知。1：是，0：否。 
     * @return IsEnableCmqNotify 是否开启cmq消息通知。1：是，0：否。
     */
    public Long getIsEnableCmqNotify() {
        return this.IsEnableCmqNotify;
    }

    /**
     * Set 是否开启cmq消息通知。1：是，0：否。
     * @param IsEnableCmqNotify 是否开启cmq消息通知。1：是，0：否。
     */
    public void setIsEnableCmqNotify(Long IsEnableCmqNotify) {
        this.IsEnableCmqNotify = IsEnableCmqNotify;
    }

    /**
     * Get 管理事件读写属性，1：只读，2：只写，3：全部 
     * @return ReadWriteAttribute 管理事件读写属性，1：只读，2：只写，3：全部
     */
    public Long getReadWriteAttribute() {
        return this.ReadWriteAttribute;
    }

    /**
     * Set 管理事件读写属性，1：只读，2：只写，3：全部
     * @param ReadWriteAttribute 管理事件读写属性，1：只读，2：只写，3：全部
     */
    public void setReadWriteAttribute(Long ReadWriteAttribute) {
        this.ReadWriteAttribute = ReadWriteAttribute;
    }

    /**
     * Get CMK的全局唯一标识符。 
     * @return KeyId CMK的全局唯一标识符。
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set CMK的全局唯一标识符。
     * @param KeyId CMK的全局唯一标识符。
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get 跟踪集状态，1：开启，0：停止。 
     * @return AuditStatus 跟踪集状态，1：开启，0：停止。
     */
    public Long getAuditStatus() {
        return this.AuditStatus;
    }

    /**
     * Set 跟踪集状态，1：开启，0：停止。
     * @param AuditStatus 跟踪集状态，1：开启，0：停止。
     */
    public void setAuditStatus(Long AuditStatus) {
        this.AuditStatus = AuditStatus;
    }

    /**
     * Get 跟踪集名称。 
     * @return AuditName 跟踪集名称。
     */
    public String getAuditName() {
        return this.AuditName;
    }

    /**
     * Set 跟踪集名称。
     * @param AuditName 跟踪集名称。
     */
    public void setAuditName(String AuditName) {
        this.AuditName = AuditName;
    }

    /**
     * Get cos存储桶所在地域。 
     * @return CosRegion cos存储桶所在地域。
     */
    public String getCosRegion() {
        return this.CosRegion;
    }

    /**
     * Set cos存储桶所在地域。
     * @param CosRegion cos存储桶所在地域。
     */
    public void setCosRegion(String CosRegion) {
        this.CosRegion = CosRegion;
    }

    /**
     * Get 队列名称。 
     * @return CmqQueueName 队列名称。
     */
    public String getCmqQueueName() {
        return this.CmqQueueName;
    }

    /**
     * Set 队列名称。
     * @param CmqQueueName 队列名称。
     */
    public void setCmqQueueName(String CmqQueueName) {
        this.CmqQueueName = CmqQueueName;
    }

    /**
     * Get CMK别名。 
     * @return KmsAlias CMK别名。
     */
    public String getKmsAlias() {
        return this.KmsAlias;
    }

    /**
     * Set CMK别名。
     * @param KmsAlias CMK别名。
     */
    public void setKmsAlias(String KmsAlias) {
        this.KmsAlias = KmsAlias;
    }

    /**
     * Get kms地域。 
     * @return KmsRegion kms地域。
     */
    public String getKmsRegion() {
        return this.KmsRegion;
    }

    /**
     * Set kms地域。
     * @param KmsRegion kms地域。
     */
    public void setKmsRegion(String KmsRegion) {
        this.KmsRegion = KmsRegion;
    }

    /**
     * Get 是否开启kms加密。1：是，0：否。如果开启KMS加密，数据在投递到cos时，会将数据加密。 
     * @return IsEnableKmsEncry 是否开启kms加密。1：是，0：否。如果开启KMS加密，数据在投递到cos时，会将数据加密。
     */
    public Long getIsEnableKmsEncry() {
        return this.IsEnableKmsEncry;
    }

    /**
     * Set 是否开启kms加密。1：是，0：否。如果开启KMS加密，数据在投递到cos时，会将数据加密。
     * @param IsEnableKmsEncry 是否开启kms加密。1：是，0：否。如果开启KMS加密，数据在投递到cos时，会将数据加密。
     */
    public void setIsEnableKmsEncry(Long IsEnableKmsEncry) {
        this.IsEnableKmsEncry = IsEnableKmsEncry;
    }

    /**
     * Get cos存储桶名称。 
     * @return CosBucketName cos存储桶名称。
     */
    public String getCosBucketName() {
        return this.CosBucketName;
    }

    /**
     * Set cos存储桶名称。
     * @param CosBucketName cos存储桶名称。
     */
    public void setCosBucketName(String CosBucketName) {
        this.CosBucketName = CosBucketName;
    }

    /**
     * Get 队列所在地域。 
     * @return CmqRegion 队列所在地域。
     */
    public String getCmqRegion() {
        return this.CmqRegion;
    }

    /**
     * Set 队列所在地域。
     * @param CmqRegion 队列所在地域。
     */
    public void setCmqRegion(String CmqRegion) {
        this.CmqRegion = CmqRegion;
    }

    /**
     * Get 日志前缀。 
     * @return LogFilePrefix 日志前缀。
     */
    public String getLogFilePrefix() {
        return this.LogFilePrefix;
    }

    /**
     * Set 日志前缀。
     * @param LogFilePrefix 日志前缀。
     */
    public void setLogFilePrefix(String LogFilePrefix) {
        this.LogFilePrefix = LogFilePrefix;
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

    public DescribeAuditResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAuditResponse(DescribeAuditResponse source) {
        if (source.IsEnableCmqNotify != null) {
            this.IsEnableCmqNotify = new Long(source.IsEnableCmqNotify);
        }
        if (source.ReadWriteAttribute != null) {
            this.ReadWriteAttribute = new Long(source.ReadWriteAttribute);
        }
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.AuditStatus != null) {
            this.AuditStatus = new Long(source.AuditStatus);
        }
        if (source.AuditName != null) {
            this.AuditName = new String(source.AuditName);
        }
        if (source.CosRegion != null) {
            this.CosRegion = new String(source.CosRegion);
        }
        if (source.CmqQueueName != null) {
            this.CmqQueueName = new String(source.CmqQueueName);
        }
        if (source.KmsAlias != null) {
            this.KmsAlias = new String(source.KmsAlias);
        }
        if (source.KmsRegion != null) {
            this.KmsRegion = new String(source.KmsRegion);
        }
        if (source.IsEnableKmsEncry != null) {
            this.IsEnableKmsEncry = new Long(source.IsEnableKmsEncry);
        }
        if (source.CosBucketName != null) {
            this.CosBucketName = new String(source.CosBucketName);
        }
        if (source.CmqRegion != null) {
            this.CmqRegion = new String(source.CmqRegion);
        }
        if (source.LogFilePrefix != null) {
            this.LogFilePrefix = new String(source.LogFilePrefix);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsEnableCmqNotify", this.IsEnableCmqNotify);
        this.setParamSimple(map, prefix + "ReadWriteAttribute", this.ReadWriteAttribute);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "AuditStatus", this.AuditStatus);
        this.setParamSimple(map, prefix + "AuditName", this.AuditName);
        this.setParamSimple(map, prefix + "CosRegion", this.CosRegion);
        this.setParamSimple(map, prefix + "CmqQueueName", this.CmqQueueName);
        this.setParamSimple(map, prefix + "KmsAlias", this.KmsAlias);
        this.setParamSimple(map, prefix + "KmsRegion", this.KmsRegion);
        this.setParamSimple(map, prefix + "IsEnableKmsEncry", this.IsEnableKmsEncry);
        this.setParamSimple(map, prefix + "CosBucketName", this.CosBucketName);
        this.setParamSimple(map, prefix + "CmqRegion", this.CmqRegion);
        this.setParamSimple(map, prefix + "LogFilePrefix", this.LogFilePrefix);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

