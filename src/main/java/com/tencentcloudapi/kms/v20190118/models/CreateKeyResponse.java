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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateKeyResponse extends AbstractModel {

    /**
    * <p>CMK的全局唯一标识符</p>
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * <p>作为密钥更容易辨识，更容易被人看懂的别名</p>
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * <p>密钥创建时间，unix时间戳</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>CMK的描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>CMK的状态</p>
    */
    @SerializedName("KeyState")
    @Expose
    private String KeyState;

    /**
    * <p>CMK的用途</p>
    */
    @SerializedName("KeyUsage")
    @Expose
    private String KeyUsage;

    /**
    * <p>标签操作的返回码. 0: 成功；1: 内部错误；2: 业务处理错误</p>
    */
    @SerializedName("TagCode")
    @Expose
    private Long TagCode;

    /**
    * <p>标签操作的返回信息</p>
    */
    @SerializedName("TagMsg")
    @Expose
    private String TagMsg;

    /**
    * <p>HSM 集群 ID（仅对 KMS 独占版/托管版服务实例有效）</p>
    */
    @SerializedName("HsmClusterId")
    @Expose
    private String HsmClusterId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>CMK的全局唯一标识符</p> 
     * @return KeyId <p>CMK的全局唯一标识符</p>
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set <p>CMK的全局唯一标识符</p>
     * @param KeyId <p>CMK的全局唯一标识符</p>
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get <p>作为密钥更容易辨识，更容易被人看懂的别名</p> 
     * @return Alias <p>作为密钥更容易辨识，更容易被人看懂的别名</p>
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set <p>作为密钥更容易辨识，更容易被人看懂的别名</p>
     * @param Alias <p>作为密钥更容易辨识，更容易被人看懂的别名</p>
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get <p>密钥创建时间，unix时间戳</p> 
     * @return CreateTime <p>密钥创建时间，unix时间戳</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>密钥创建时间，unix时间戳</p>
     * @param CreateTime <p>密钥创建时间，unix时间戳</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>CMK的描述</p> 
     * @return Description <p>CMK的描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>CMK的描述</p>
     * @param Description <p>CMK的描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>CMK的状态</p> 
     * @return KeyState <p>CMK的状态</p>
     */
    public String getKeyState() {
        return this.KeyState;
    }

    /**
     * Set <p>CMK的状态</p>
     * @param KeyState <p>CMK的状态</p>
     */
    public void setKeyState(String KeyState) {
        this.KeyState = KeyState;
    }

    /**
     * Get <p>CMK的用途</p> 
     * @return KeyUsage <p>CMK的用途</p>
     */
    public String getKeyUsage() {
        return this.KeyUsage;
    }

    /**
     * Set <p>CMK的用途</p>
     * @param KeyUsage <p>CMK的用途</p>
     */
    public void setKeyUsage(String KeyUsage) {
        this.KeyUsage = KeyUsage;
    }

    /**
     * Get <p>标签操作的返回码. 0: 成功；1: 内部错误；2: 业务处理错误</p> 
     * @return TagCode <p>标签操作的返回码. 0: 成功；1: 内部错误；2: 业务处理错误</p>
     */
    public Long getTagCode() {
        return this.TagCode;
    }

    /**
     * Set <p>标签操作的返回码. 0: 成功；1: 内部错误；2: 业务处理错误</p>
     * @param TagCode <p>标签操作的返回码. 0: 成功；1: 内部错误；2: 业务处理错误</p>
     */
    public void setTagCode(Long TagCode) {
        this.TagCode = TagCode;
    }

    /**
     * Get <p>标签操作的返回信息</p> 
     * @return TagMsg <p>标签操作的返回信息</p>
     */
    public String getTagMsg() {
        return this.TagMsg;
    }

    /**
     * Set <p>标签操作的返回信息</p>
     * @param TagMsg <p>标签操作的返回信息</p>
     */
    public void setTagMsg(String TagMsg) {
        this.TagMsg = TagMsg;
    }

    /**
     * Get <p>HSM 集群 ID（仅对 KMS 独占版/托管版服务实例有效）</p> 
     * @return HsmClusterId <p>HSM 集群 ID（仅对 KMS 独占版/托管版服务实例有效）</p>
     */
    public String getHsmClusterId() {
        return this.HsmClusterId;
    }

    /**
     * Set <p>HSM 集群 ID（仅对 KMS 独占版/托管版服务实例有效）</p>
     * @param HsmClusterId <p>HSM 集群 ID（仅对 KMS 独占版/托管版服务实例有效）</p>
     */
    public void setHsmClusterId(String HsmClusterId) {
        this.HsmClusterId = HsmClusterId;
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

