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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateKeyResponse extends AbstractModel{

    /**
    * CMK的全局唯一标识符
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 作为密钥更容易辨识，更容易被人看懂的别名
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 密钥创建时间，unix时间戳
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * CMK的描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * CMK的状态
    */
    @SerializedName("KeyState")
    @Expose
    private String KeyState;

    /**
    * CMK的用途
    */
    @SerializedName("KeyUsage")
    @Expose
    private String KeyUsage;

    /**
    * 标签操作的返回码. 0: 成功；1: 内部错误；2: 业务处理错误
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagCode")
    @Expose
    private Long TagCode;

    /**
    * 标签操作的返回信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagMsg")
    @Expose
    private String TagMsg;

    /**
    * HSM 集群 ID（仅对 KMS 独占版/托管版服务实例有效）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HsmClusterId")
    @Expose
    private String HsmClusterId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get CMK的全局唯一标识符 
     * @return KeyId CMK的全局唯一标识符
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set CMK的全局唯一标识符
     * @param KeyId CMK的全局唯一标识符
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get 作为密钥更容易辨识，更容易被人看懂的别名 
     * @return Alias 作为密钥更容易辨识，更容易被人看懂的别名
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 作为密钥更容易辨识，更容易被人看懂的别名
     * @param Alias 作为密钥更容易辨识，更容易被人看懂的别名
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 密钥创建时间，unix时间戳 
     * @return CreateTime 密钥创建时间，unix时间戳
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 密钥创建时间，unix时间戳
     * @param CreateTime 密钥创建时间，unix时间戳
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get CMK的描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description CMK的描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set CMK的描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description CMK的描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get CMK的状态 
     * @return KeyState CMK的状态
     */
    public String getKeyState() {
        return this.KeyState;
    }

    /**
     * Set CMK的状态
     * @param KeyState CMK的状态
     */
    public void setKeyState(String KeyState) {
        this.KeyState = KeyState;
    }

    /**
     * Get CMK的用途 
     * @return KeyUsage CMK的用途
     */
    public String getKeyUsage() {
        return this.KeyUsage;
    }

    /**
     * Set CMK的用途
     * @param KeyUsage CMK的用途
     */
    public void setKeyUsage(String KeyUsage) {
        this.KeyUsage = KeyUsage;
    }

    /**
     * Get 标签操作的返回码. 0: 成功；1: 内部错误；2: 业务处理错误
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagCode 标签操作的返回码. 0: 成功；1: 内部错误；2: 业务处理错误
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTagCode() {
        return this.TagCode;
    }

    /**
     * Set 标签操作的返回码. 0: 成功；1: 内部错误；2: 业务处理错误
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagCode 标签操作的返回码. 0: 成功；1: 内部错误；2: 业务处理错误
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagCode(Long TagCode) {
        this.TagCode = TagCode;
    }

    /**
     * Get 标签操作的返回信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagMsg 标签操作的返回信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTagMsg() {
        return this.TagMsg;
    }

    /**
     * Set 标签操作的返回信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagMsg 标签操作的返回信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagMsg(String TagMsg) {
        this.TagMsg = TagMsg;
    }

    /**
     * Get HSM 集群 ID（仅对 KMS 独占版/托管版服务实例有效）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HsmClusterId HSM 集群 ID（仅对 KMS 独占版/托管版服务实例有效）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHsmClusterId() {
        return this.HsmClusterId;
    }

    /**
     * Set HSM 集群 ID（仅对 KMS 独占版/托管版服务实例有效）
注意：此字段可能返回 null，表示取不到有效值。
     * @param HsmClusterId HSM 集群 ID（仅对 KMS 独占版/托管版服务实例有效）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHsmClusterId(String HsmClusterId) {
        this.HsmClusterId = HsmClusterId;
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

    public CreateKeyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateKeyResponse(CreateKeyResponse source) {
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.KeyState != null) {
            this.KeyState = new String(source.KeyState);
        }
        if (source.KeyUsage != null) {
            this.KeyUsage = new String(source.KeyUsage);
        }
        if (source.TagCode != null) {
            this.TagCode = new Long(source.TagCode);
        }
        if (source.TagMsg != null) {
            this.TagMsg = new String(source.TagMsg);
        }
        if (source.HsmClusterId != null) {
            this.HsmClusterId = new String(source.HsmClusterId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "KeyState", this.KeyState);
        this.setParamSimple(map, prefix + "KeyUsage", this.KeyUsage);
        this.setParamSimple(map, prefix + "TagCode", this.TagCode);
        this.setParamSimple(map, prefix + "TagMsg", this.TagMsg);
        this.setParamSimple(map, prefix + "HsmClusterId", this.HsmClusterId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

