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

public class CreateSSHKeyPairSecretResponse extends AbstractModel{

    /**
    * 创建的凭据名称。
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * 创建的SSH密钥ID。
    */
    @SerializedName("SSHKeyID")
    @Expose
    private String SSHKeyID;

    /**
    * 创建的SSH密钥名称。
    */
    @SerializedName("SSHKeyName")
    @Expose
    private String SSHKeyName;

    /**
    * 标签操作的返回码. 0: 成功；1: 内部错误；2: 业务处理错误。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagCode")
    @Expose
    private Long TagCode;

    /**
    * 标签操作的返回信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagMsg")
    @Expose
    private String TagMsg;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 创建的凭据名称。 
     * @return SecretName 创建的凭据名称。
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set 创建的凭据名称。
     * @param SecretName 创建的凭据名称。
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get 创建的SSH密钥ID。 
     * @return SSHKeyID 创建的SSH密钥ID。
     */
    public String getSSHKeyID() {
        return this.SSHKeyID;
    }

    /**
     * Set 创建的SSH密钥ID。
     * @param SSHKeyID 创建的SSH密钥ID。
     */
    public void setSSHKeyID(String SSHKeyID) {
        this.SSHKeyID = SSHKeyID;
    }

    /**
     * Get 创建的SSH密钥名称。 
     * @return SSHKeyName 创建的SSH密钥名称。
     */
    public String getSSHKeyName() {
        return this.SSHKeyName;
    }

    /**
     * Set 创建的SSH密钥名称。
     * @param SSHKeyName 创建的SSH密钥名称。
     */
    public void setSSHKeyName(String SSHKeyName) {
        this.SSHKeyName = SSHKeyName;
    }

    /**
     * Get 标签操作的返回码. 0: 成功；1: 内部错误；2: 业务处理错误。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagCode 标签操作的返回码. 0: 成功；1: 内部错误；2: 业务处理错误。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTagCode() {
        return this.TagCode;
    }

    /**
     * Set 标签操作的返回码. 0: 成功；1: 内部错误；2: 业务处理错误。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagCode 标签操作的返回码. 0: 成功；1: 内部错误；2: 业务处理错误。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagCode(Long TagCode) {
        this.TagCode = TagCode;
    }

    /**
     * Get 标签操作的返回信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagMsg 标签操作的返回信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTagMsg() {
        return this.TagMsg;
    }

    /**
     * Set 标签操作的返回信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagMsg 标签操作的返回信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagMsg(String TagMsg) {
        this.TagMsg = TagMsg;
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

    public CreateSSHKeyPairSecretResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSSHKeyPairSecretResponse(CreateSSHKeyPairSecretResponse source) {
        if (source.SecretName != null) {
            this.SecretName = new String(source.SecretName);
        }
        if (source.SSHKeyID != null) {
            this.SSHKeyID = new String(source.SSHKeyID);
        }
        if (source.SSHKeyName != null) {
            this.SSHKeyName = new String(source.SSHKeyName);
        }
        if (source.TagCode != null) {
            this.TagCode = new Long(source.TagCode);
        }
        if (source.TagMsg != null) {
            this.TagMsg = new String(source.TagMsg);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "SSHKeyID", this.SSHKeyID);
        this.setParamSimple(map, prefix + "SSHKeyName", this.SSHKeyName);
        this.setParamSimple(map, prefix + "TagCode", this.TagCode);
        this.setParamSimple(map, prefix + "TagMsg", this.TagMsg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

