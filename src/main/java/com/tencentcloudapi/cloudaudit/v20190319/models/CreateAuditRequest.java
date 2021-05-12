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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAuditRequest extends AbstractModel{

    /**
    * 是否开启cmq消息通知。1：是，0：否。目前仅支持cmq的队列服务。如果开启cmq消息通知服务，云审计会将您的日志内容实时投递到您指定地域的指定队列中。
    */
    @SerializedName("IsEnableCmqNotify")
    @Expose
    private Long IsEnableCmqNotify;

    /**
    * 管理事件的读写属性。1：只读，2：只写，3：全部。
    */
    @SerializedName("ReadWriteAttribute")
    @Expose
    private Long ReadWriteAttribute;

    /**
    * 跟踪集名称。3-128字符，只能包含 ASCII 编码字母 a-z，A-Z，数字 0-9，下划线 _。
    */
    @SerializedName("AuditName")
    @Expose
    private String AuditName;

    /**
    * cos地域。目前支持的地域可以使用ListCosEnableRegion来获取。
    */
    @SerializedName("CosRegion")
    @Expose
    private String CosRegion;

    /**
    * 是否创建新的cos存储桶。1：是，0：否。
    */
    @SerializedName("IsCreateNewBucket")
    @Expose
    private Long IsCreateNewBucket;

    /**
    * cos的存储桶名称。仅支持小写英文字母和数字即[a-z，0-9]、中划线“-”及其组合。用户自定义的字符串支持1 - 40个字符。存储桶命名不能以“-”开头或结尾。如果不是新创建的存储桶，云审计不会去校验该存储桶是否真的存在，请谨慎填写，避免日志投递不成功，导致您的数据丢失。
    */
    @SerializedName("CosBucketName")
    @Expose
    private String CosBucketName;

    /**
    * CMK的全局唯一标识符，如果不是新创建的kms，该值是必填值。可以通过ListKeyAliasByRegion来获取。云审计不会校验KeyId的合法性，请您谨慎填写，避免给您的数据造成损失。
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 队列名称。队列名称是一个不超过64个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)。如果IsEnableCmqNotify值是1的话，此值属于必填字段。如果不是新创建的队列，云审计不会去校验该队列是否真的存在，请谨慎填写，避免日志通知不成功，导致您的数据丢失。
    */
    @SerializedName("CmqQueueName")
    @Expose
    private String CmqQueueName;

    /**
    * kms地域。目前支持的地域可以使用ListKmsEnableRegion来获取。必须要和cos的地域保持一致。
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
    * 队列所在的地域。可以通过ListCmqEnableRegion获取支持的cmq地域。如果IsEnableCmqNotify值是1的话，此值属于必填字段。
    */
    @SerializedName("CmqRegion")
    @Expose
    private String CmqRegion;

    /**
    * 日志文件前缀。3-40个字符，只能包含 ASCII 编码字母 a-z，A-Z，数字 0-9。可以不填，默认以账号ID作为日志前缀。
    */
    @SerializedName("LogFilePrefix")
    @Expose
    private String LogFilePrefix;

    /**
    * 是否创建新的队列。1：是，0：否。如果IsEnableCmqNotify值是1的话，此值属于必填字段。
    */
    @SerializedName("IsCreateNewQueue")
    @Expose
    private Long IsCreateNewQueue;

    /**
     * Get 是否开启cmq消息通知。1：是，0：否。目前仅支持cmq的队列服务。如果开启cmq消息通知服务，云审计会将您的日志内容实时投递到您指定地域的指定队列中。 
     * @return IsEnableCmqNotify 是否开启cmq消息通知。1：是，0：否。目前仅支持cmq的队列服务。如果开启cmq消息通知服务，云审计会将您的日志内容实时投递到您指定地域的指定队列中。
     */
    public Long getIsEnableCmqNotify() {
        return this.IsEnableCmqNotify;
    }

    /**
     * Set 是否开启cmq消息通知。1：是，0：否。目前仅支持cmq的队列服务。如果开启cmq消息通知服务，云审计会将您的日志内容实时投递到您指定地域的指定队列中。
     * @param IsEnableCmqNotify 是否开启cmq消息通知。1：是，0：否。目前仅支持cmq的队列服务。如果开启cmq消息通知服务，云审计会将您的日志内容实时投递到您指定地域的指定队列中。
     */
    public void setIsEnableCmqNotify(Long IsEnableCmqNotify) {
        this.IsEnableCmqNotify = IsEnableCmqNotify;
    }

    /**
     * Get 管理事件的读写属性。1：只读，2：只写，3：全部。 
     * @return ReadWriteAttribute 管理事件的读写属性。1：只读，2：只写，3：全部。
     */
    public Long getReadWriteAttribute() {
        return this.ReadWriteAttribute;
    }

    /**
     * Set 管理事件的读写属性。1：只读，2：只写，3：全部。
     * @param ReadWriteAttribute 管理事件的读写属性。1：只读，2：只写，3：全部。
     */
    public void setReadWriteAttribute(Long ReadWriteAttribute) {
        this.ReadWriteAttribute = ReadWriteAttribute;
    }

    /**
     * Get 跟踪集名称。3-128字符，只能包含 ASCII 编码字母 a-z，A-Z，数字 0-9，下划线 _。 
     * @return AuditName 跟踪集名称。3-128字符，只能包含 ASCII 编码字母 a-z，A-Z，数字 0-9，下划线 _。
     */
    public String getAuditName() {
        return this.AuditName;
    }

    /**
     * Set 跟踪集名称。3-128字符，只能包含 ASCII 编码字母 a-z，A-Z，数字 0-9，下划线 _。
     * @param AuditName 跟踪集名称。3-128字符，只能包含 ASCII 编码字母 a-z，A-Z，数字 0-9，下划线 _。
     */
    public void setAuditName(String AuditName) {
        this.AuditName = AuditName;
    }

    /**
     * Get cos地域。目前支持的地域可以使用ListCosEnableRegion来获取。 
     * @return CosRegion cos地域。目前支持的地域可以使用ListCosEnableRegion来获取。
     */
    public String getCosRegion() {
        return this.CosRegion;
    }

    /**
     * Set cos地域。目前支持的地域可以使用ListCosEnableRegion来获取。
     * @param CosRegion cos地域。目前支持的地域可以使用ListCosEnableRegion来获取。
     */
    public void setCosRegion(String CosRegion) {
        this.CosRegion = CosRegion;
    }

    /**
     * Get 是否创建新的cos存储桶。1：是，0：否。 
     * @return IsCreateNewBucket 是否创建新的cos存储桶。1：是，0：否。
     */
    public Long getIsCreateNewBucket() {
        return this.IsCreateNewBucket;
    }

    /**
     * Set 是否创建新的cos存储桶。1：是，0：否。
     * @param IsCreateNewBucket 是否创建新的cos存储桶。1：是，0：否。
     */
    public void setIsCreateNewBucket(Long IsCreateNewBucket) {
        this.IsCreateNewBucket = IsCreateNewBucket;
    }

    /**
     * Get cos的存储桶名称。仅支持小写英文字母和数字即[a-z，0-9]、中划线“-”及其组合。用户自定义的字符串支持1 - 40个字符。存储桶命名不能以“-”开头或结尾。如果不是新创建的存储桶，云审计不会去校验该存储桶是否真的存在，请谨慎填写，避免日志投递不成功，导致您的数据丢失。 
     * @return CosBucketName cos的存储桶名称。仅支持小写英文字母和数字即[a-z，0-9]、中划线“-”及其组合。用户自定义的字符串支持1 - 40个字符。存储桶命名不能以“-”开头或结尾。如果不是新创建的存储桶，云审计不会去校验该存储桶是否真的存在，请谨慎填写，避免日志投递不成功，导致您的数据丢失。
     */
    public String getCosBucketName() {
        return this.CosBucketName;
    }

    /**
     * Set cos的存储桶名称。仅支持小写英文字母和数字即[a-z，0-9]、中划线“-”及其组合。用户自定义的字符串支持1 - 40个字符。存储桶命名不能以“-”开头或结尾。如果不是新创建的存储桶，云审计不会去校验该存储桶是否真的存在，请谨慎填写，避免日志投递不成功，导致您的数据丢失。
     * @param CosBucketName cos的存储桶名称。仅支持小写英文字母和数字即[a-z，0-9]、中划线“-”及其组合。用户自定义的字符串支持1 - 40个字符。存储桶命名不能以“-”开头或结尾。如果不是新创建的存储桶，云审计不会去校验该存储桶是否真的存在，请谨慎填写，避免日志投递不成功，导致您的数据丢失。
     */
    public void setCosBucketName(String CosBucketName) {
        this.CosBucketName = CosBucketName;
    }

    /**
     * Get CMK的全局唯一标识符，如果不是新创建的kms，该值是必填值。可以通过ListKeyAliasByRegion来获取。云审计不会校验KeyId的合法性，请您谨慎填写，避免给您的数据造成损失。 
     * @return KeyId CMK的全局唯一标识符，如果不是新创建的kms，该值是必填值。可以通过ListKeyAliasByRegion来获取。云审计不会校验KeyId的合法性，请您谨慎填写，避免给您的数据造成损失。
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set CMK的全局唯一标识符，如果不是新创建的kms，该值是必填值。可以通过ListKeyAliasByRegion来获取。云审计不会校验KeyId的合法性，请您谨慎填写，避免给您的数据造成损失。
     * @param KeyId CMK的全局唯一标识符，如果不是新创建的kms，该值是必填值。可以通过ListKeyAliasByRegion来获取。云审计不会校验KeyId的合法性，请您谨慎填写，避免给您的数据造成损失。
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get 队列名称。队列名称是一个不超过64个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)。如果IsEnableCmqNotify值是1的话，此值属于必填字段。如果不是新创建的队列，云审计不会去校验该队列是否真的存在，请谨慎填写，避免日志通知不成功，导致您的数据丢失。 
     * @return CmqQueueName 队列名称。队列名称是一个不超过64个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)。如果IsEnableCmqNotify值是1的话，此值属于必填字段。如果不是新创建的队列，云审计不会去校验该队列是否真的存在，请谨慎填写，避免日志通知不成功，导致您的数据丢失。
     */
    public String getCmqQueueName() {
        return this.CmqQueueName;
    }

    /**
     * Set 队列名称。队列名称是一个不超过64个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)。如果IsEnableCmqNotify值是1的话，此值属于必填字段。如果不是新创建的队列，云审计不会去校验该队列是否真的存在，请谨慎填写，避免日志通知不成功，导致您的数据丢失。
     * @param CmqQueueName 队列名称。队列名称是一个不超过64个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)。如果IsEnableCmqNotify值是1的话，此值属于必填字段。如果不是新创建的队列，云审计不会去校验该队列是否真的存在，请谨慎填写，避免日志通知不成功，导致您的数据丢失。
     */
    public void setCmqQueueName(String CmqQueueName) {
        this.CmqQueueName = CmqQueueName;
    }

    /**
     * Get kms地域。目前支持的地域可以使用ListKmsEnableRegion来获取。必须要和cos的地域保持一致。 
     * @return KmsRegion kms地域。目前支持的地域可以使用ListKmsEnableRegion来获取。必须要和cos的地域保持一致。
     */
    public String getKmsRegion() {
        return this.KmsRegion;
    }

    /**
     * Set kms地域。目前支持的地域可以使用ListKmsEnableRegion来获取。必须要和cos的地域保持一致。
     * @param KmsRegion kms地域。目前支持的地域可以使用ListKmsEnableRegion来获取。必须要和cos的地域保持一致。
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
     * Get 队列所在的地域。可以通过ListCmqEnableRegion获取支持的cmq地域。如果IsEnableCmqNotify值是1的话，此值属于必填字段。 
     * @return CmqRegion 队列所在的地域。可以通过ListCmqEnableRegion获取支持的cmq地域。如果IsEnableCmqNotify值是1的话，此值属于必填字段。
     */
    public String getCmqRegion() {
        return this.CmqRegion;
    }

    /**
     * Set 队列所在的地域。可以通过ListCmqEnableRegion获取支持的cmq地域。如果IsEnableCmqNotify值是1的话，此值属于必填字段。
     * @param CmqRegion 队列所在的地域。可以通过ListCmqEnableRegion获取支持的cmq地域。如果IsEnableCmqNotify值是1的话，此值属于必填字段。
     */
    public void setCmqRegion(String CmqRegion) {
        this.CmqRegion = CmqRegion;
    }

    /**
     * Get 日志文件前缀。3-40个字符，只能包含 ASCII 编码字母 a-z，A-Z，数字 0-9。可以不填，默认以账号ID作为日志前缀。 
     * @return LogFilePrefix 日志文件前缀。3-40个字符，只能包含 ASCII 编码字母 a-z，A-Z，数字 0-9。可以不填，默认以账号ID作为日志前缀。
     */
    public String getLogFilePrefix() {
        return this.LogFilePrefix;
    }

    /**
     * Set 日志文件前缀。3-40个字符，只能包含 ASCII 编码字母 a-z，A-Z，数字 0-9。可以不填，默认以账号ID作为日志前缀。
     * @param LogFilePrefix 日志文件前缀。3-40个字符，只能包含 ASCII 编码字母 a-z，A-Z，数字 0-9。可以不填，默认以账号ID作为日志前缀。
     */
    public void setLogFilePrefix(String LogFilePrefix) {
        this.LogFilePrefix = LogFilePrefix;
    }

    /**
     * Get 是否创建新的队列。1：是，0：否。如果IsEnableCmqNotify值是1的话，此值属于必填字段。 
     * @return IsCreateNewQueue 是否创建新的队列。1：是，0：否。如果IsEnableCmqNotify值是1的话，此值属于必填字段。
     */
    public Long getIsCreateNewQueue() {
        return this.IsCreateNewQueue;
    }

    /**
     * Set 是否创建新的队列。1：是，0：否。如果IsEnableCmqNotify值是1的话，此值属于必填字段。
     * @param IsCreateNewQueue 是否创建新的队列。1：是，0：否。如果IsEnableCmqNotify值是1的话，此值属于必填字段。
     */
    public void setIsCreateNewQueue(Long IsCreateNewQueue) {
        this.IsCreateNewQueue = IsCreateNewQueue;
    }

    public CreateAuditRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAuditRequest(CreateAuditRequest source) {
        if (source.IsEnableCmqNotify != null) {
            this.IsEnableCmqNotify = new Long(source.IsEnableCmqNotify);
        }
        if (source.ReadWriteAttribute != null) {
            this.ReadWriteAttribute = new Long(source.ReadWriteAttribute);
        }
        if (source.AuditName != null) {
            this.AuditName = new String(source.AuditName);
        }
        if (source.CosRegion != null) {
            this.CosRegion = new String(source.CosRegion);
        }
        if (source.IsCreateNewBucket != null) {
            this.IsCreateNewBucket = new Long(source.IsCreateNewBucket);
        }
        if (source.CosBucketName != null) {
            this.CosBucketName = new String(source.CosBucketName);
        }
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.CmqQueueName != null) {
            this.CmqQueueName = new String(source.CmqQueueName);
        }
        if (source.KmsRegion != null) {
            this.KmsRegion = new String(source.KmsRegion);
        }
        if (source.IsEnableKmsEncry != null) {
            this.IsEnableKmsEncry = new Long(source.IsEnableKmsEncry);
        }
        if (source.CmqRegion != null) {
            this.CmqRegion = new String(source.CmqRegion);
        }
        if (source.LogFilePrefix != null) {
            this.LogFilePrefix = new String(source.LogFilePrefix);
        }
        if (source.IsCreateNewQueue != null) {
            this.IsCreateNewQueue = new Long(source.IsCreateNewQueue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsEnableCmqNotify", this.IsEnableCmqNotify);
        this.setParamSimple(map, prefix + "ReadWriteAttribute", this.ReadWriteAttribute);
        this.setParamSimple(map, prefix + "AuditName", this.AuditName);
        this.setParamSimple(map, prefix + "CosRegion", this.CosRegion);
        this.setParamSimple(map, prefix + "IsCreateNewBucket", this.IsCreateNewBucket);
        this.setParamSimple(map, prefix + "CosBucketName", this.CosBucketName);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "CmqQueueName", this.CmqQueueName);
        this.setParamSimple(map, prefix + "KmsRegion", this.KmsRegion);
        this.setParamSimple(map, prefix + "IsEnableKmsEncry", this.IsEnableKmsEncry);
        this.setParamSimple(map, prefix + "CmqRegion", this.CmqRegion);
        this.setParamSimple(map, prefix + "LogFilePrefix", this.LogFilePrefix);
        this.setParamSimple(map, prefix + "IsCreateNewQueue", this.IsCreateNewQueue);

    }
}

