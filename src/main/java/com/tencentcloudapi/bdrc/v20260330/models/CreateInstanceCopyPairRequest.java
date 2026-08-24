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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstanceCopyPairRequest extends AbstractModel {

    /**
    * 所属保护组
    */
    @SerializedName("ProtectGroupId")
    @Expose
    private String ProtectGroupId;

    /**
    * 目标端CVM创建参数列表（1~10 个）
    */
    @SerializedName("CreateTargetInstanceParameters")
    @Expose
    private CreateInstanceModel [] CreateTargetInstanceParameters;

    /**
    * 复制对名称，不传则新名称为"未命名"
    */
    @SerializedName("InstanceCopyPairName")
    @Expose
    private String InstanceCopyPairName;

    /**
    * 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * 用户期望的RPO，单位分钟，目前仅支持15分钟
    */
    @SerializedName("RecoveryPointObjective")
    @Expose
    private Long RecoveryPointObjective;

    /**
     * Get 所属保护组 
     * @return ProtectGroupId 所属保护组
     */
    public String getProtectGroupId() {
        return this.ProtectGroupId;
    }

    /**
     * Set 所属保护组
     * @param ProtectGroupId 所属保护组
     */
    public void setProtectGroupId(String ProtectGroupId) {
        this.ProtectGroupId = ProtectGroupId;
    }

    /**
     * Get 目标端CVM创建参数列表（1~10 个） 
     * @return CreateTargetInstanceParameters 目标端CVM创建参数列表（1~10 个）
     */
    public CreateInstanceModel [] getCreateTargetInstanceParameters() {
        return this.CreateTargetInstanceParameters;
    }

    /**
     * Set 目标端CVM创建参数列表（1~10 个）
     * @param CreateTargetInstanceParameters 目标端CVM创建参数列表（1~10 个）
     */
    public void setCreateTargetInstanceParameters(CreateInstanceModel [] CreateTargetInstanceParameters) {
        this.CreateTargetInstanceParameters = CreateTargetInstanceParameters;
    }

    /**
     * Get 复制对名称，不传则新名称为"未命名" 
     * @return InstanceCopyPairName 复制对名称，不传则新名称为"未命名"
     */
    public String getInstanceCopyPairName() {
        return this.InstanceCopyPairName;
    }

    /**
     * Set 复制对名称，不传则新名称为"未命名"
     * @param InstanceCopyPairName 复制对名称，不传则新名称为"未命名"
     */
    public void setInstanceCopyPairName(String InstanceCopyPairName) {
        this.InstanceCopyPairName = InstanceCopyPairName;
    }

    /**
     * Get 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性 
     * @return ClientToken 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性
     * @param ClientToken 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get 用户期望的RPO，单位分钟，目前仅支持15分钟 
     * @return RecoveryPointObjective 用户期望的RPO，单位分钟，目前仅支持15分钟
     */
    public Long getRecoveryPointObjective() {
        return this.RecoveryPointObjective;
    }

    /**
     * Set 用户期望的RPO，单位分钟，目前仅支持15分钟
     * @param RecoveryPointObjective 用户期望的RPO，单位分钟，目前仅支持15分钟
     */
    public void setRecoveryPointObjective(Long RecoveryPointObjective) {
        this.RecoveryPointObjective = RecoveryPointObjective;
    }

    public CreateInstanceCopyPairRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstanceCopyPairRequest(CreateInstanceCopyPairRequest source) {
        if (source.ProtectGroupId != null) {
            this.ProtectGroupId = new String(source.ProtectGroupId);
        }
        if (source.CreateTargetInstanceParameters != null) {
            this.CreateTargetInstanceParameters = new CreateInstanceModel[source.CreateTargetInstanceParameters.length];
            for (int i = 0; i < source.CreateTargetInstanceParameters.length; i++) {
                this.CreateTargetInstanceParameters[i] = new CreateInstanceModel(source.CreateTargetInstanceParameters[i]);
            }
        }
        if (source.InstanceCopyPairName != null) {
            this.InstanceCopyPairName = new String(source.InstanceCopyPairName);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.RecoveryPointObjective != null) {
            this.RecoveryPointObjective = new Long(source.RecoveryPointObjective);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProtectGroupId", this.ProtectGroupId);
        this.setParamArrayObj(map, prefix + "CreateTargetInstanceParameters.", this.CreateTargetInstanceParameters);
        this.setParamSimple(map, prefix + "InstanceCopyPairName", this.InstanceCopyPairName);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "RecoveryPointObjective", this.RecoveryPointObjective);

    }
}

