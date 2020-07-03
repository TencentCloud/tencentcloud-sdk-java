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
package com.tencentcloudapi.ssm.v20190923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSecretResponse extends AbstractModel{

    /**
    * 凭据名称。
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * 凭据描述信息。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 用于加密的KMS CMK ID。
    */
    @SerializedName("KmsKeyId")
    @Expose
    private String KmsKeyId;

    /**
    * 创建者UIN。
    */
    @SerializedName("CreateUin")
    @Expose
    private Long CreateUin;

    /**
    * 凭据状态：Enabled、Disabled、PendingDelete
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 删除日期，uinx 时间戳，非计划删除状态的凭据为0。
    */
    @SerializedName("DeleteTime")
    @Expose
    private Long DeleteTime;

    /**
    * 创建日期。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 凭据名称。 
     * @return SecretName 凭据名称。
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set 凭据名称。
     * @param SecretName 凭据名称。
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get 凭据描述信息。 
     * @return Description 凭据描述信息。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 凭据描述信息。
     * @param Description 凭据描述信息。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 用于加密的KMS CMK ID。 
     * @return KmsKeyId 用于加密的KMS CMK ID。
     */
    public String getKmsKeyId() {
        return this.KmsKeyId;
    }

    /**
     * Set 用于加密的KMS CMK ID。
     * @param KmsKeyId 用于加密的KMS CMK ID。
     */
    public void setKmsKeyId(String KmsKeyId) {
        this.KmsKeyId = KmsKeyId;
    }

    /**
     * Get 创建者UIN。 
     * @return CreateUin 创建者UIN。
     */
    public Long getCreateUin() {
        return this.CreateUin;
    }

    /**
     * Set 创建者UIN。
     * @param CreateUin 创建者UIN。
     */
    public void setCreateUin(Long CreateUin) {
        this.CreateUin = CreateUin;
    }

    /**
     * Get 凭据状态：Enabled、Disabled、PendingDelete 
     * @return Status 凭据状态：Enabled、Disabled、PendingDelete
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 凭据状态：Enabled、Disabled、PendingDelete
     * @param Status 凭据状态：Enabled、Disabled、PendingDelete
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 删除日期，uinx 时间戳，非计划删除状态的凭据为0。 
     * @return DeleteTime 删除日期，uinx 时间戳，非计划删除状态的凭据为0。
     */
    public Long getDeleteTime() {
        return this.DeleteTime;
    }

    /**
     * Set 删除日期，uinx 时间戳，非计划删除状态的凭据为0。
     * @param DeleteTime 删除日期，uinx 时间戳，非计划删除状态的凭据为0。
     */
    public void setDeleteTime(Long DeleteTime) {
        this.DeleteTime = DeleteTime;
    }

    /**
     * Get 创建日期。 
     * @return CreateTime 创建日期。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建日期。
     * @param CreateTime 创建日期。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
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
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "KmsKeyId", this.KmsKeyId);
        this.setParamSimple(map, prefix + "CreateUin", this.CreateUin);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DeleteTime", this.DeleteTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

