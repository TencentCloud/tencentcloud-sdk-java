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

public class CreateInstanceDrillPairsRequest extends AbstractModel {

    /**
    * 所属容灾保护组
    */
    @SerializedName("ProtectGroupId")
    @Expose
    private String ProtectGroupId;

    /**
    * 演练组vpc
    */
    @SerializedName("DrillPairGroupVpc")
    @Expose
    private String DrillPairGroupVpc;

    /**
    * 文件系统复制对名称,不传则新名称为“未命名”
    */
    @SerializedName("DrillPairGroupName")
    @Expose
    private String DrillPairGroupName;

    /**
    * 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性
    */
    @SerializedName("CreationToken")
    @Expose
    private String CreationToken;

    /**
    * 指定创建入哪个演练组
    */
    @SerializedName("DrillPairGroupId")
    @Expose
    private String DrillPairGroupId;

    /**
    * 创建目标演练实例的参数列表
    */
    @SerializedName("CreateTargetInstanceParameters")
    @Expose
    private CreateInstanceModel [] CreateTargetInstanceParameters;

    /**
     * Get 所属容灾保护组 
     * @return ProtectGroupId 所属容灾保护组
     */
    public String getProtectGroupId() {
        return this.ProtectGroupId;
    }

    /**
     * Set 所属容灾保护组
     * @param ProtectGroupId 所属容灾保护组
     */
    public void setProtectGroupId(String ProtectGroupId) {
        this.ProtectGroupId = ProtectGroupId;
    }

    /**
     * Get 演练组vpc 
     * @return DrillPairGroupVpc 演练组vpc
     */
    public String getDrillPairGroupVpc() {
        return this.DrillPairGroupVpc;
    }

    /**
     * Set 演练组vpc
     * @param DrillPairGroupVpc 演练组vpc
     */
    public void setDrillPairGroupVpc(String DrillPairGroupVpc) {
        this.DrillPairGroupVpc = DrillPairGroupVpc;
    }

    /**
     * Get 文件系统复制对名称,不传则新名称为“未命名” 
     * @return DrillPairGroupName 文件系统复制对名称,不传则新名称为“未命名”
     */
    public String getDrillPairGroupName() {
        return this.DrillPairGroupName;
    }

    /**
     * Set 文件系统复制对名称,不传则新名称为“未命名”
     * @param DrillPairGroupName 文件系统复制对名称,不传则新名称为“未命名”
     */
    public void setDrillPairGroupName(String DrillPairGroupName) {
        this.DrillPairGroupName = DrillPairGroupName;
    }

    /**
     * Get 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性 
     * @return CreationToken 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性
     */
    public String getCreationToken() {
        return this.CreationToken;
    }

    /**
     * Set 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性
     * @param CreationToken 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性
     */
    public void setCreationToken(String CreationToken) {
        this.CreationToken = CreationToken;
    }

    /**
     * Get 指定创建入哪个演练组 
     * @return DrillPairGroupId 指定创建入哪个演练组
     */
    public String getDrillPairGroupId() {
        return this.DrillPairGroupId;
    }

    /**
     * Set 指定创建入哪个演练组
     * @param DrillPairGroupId 指定创建入哪个演练组
     */
    public void setDrillPairGroupId(String DrillPairGroupId) {
        this.DrillPairGroupId = DrillPairGroupId;
    }

    /**
     * Get 创建目标演练实例的参数列表 
     * @return CreateTargetInstanceParameters 创建目标演练实例的参数列表
     */
    public CreateInstanceModel [] getCreateTargetInstanceParameters() {
        return this.CreateTargetInstanceParameters;
    }

    /**
     * Set 创建目标演练实例的参数列表
     * @param CreateTargetInstanceParameters 创建目标演练实例的参数列表
     */
    public void setCreateTargetInstanceParameters(CreateInstanceModel [] CreateTargetInstanceParameters) {
        this.CreateTargetInstanceParameters = CreateTargetInstanceParameters;
    }

    public CreateInstanceDrillPairsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstanceDrillPairsRequest(CreateInstanceDrillPairsRequest source) {
        if (source.ProtectGroupId != null) {
            this.ProtectGroupId = new String(source.ProtectGroupId);
        }
        if (source.DrillPairGroupVpc != null) {
            this.DrillPairGroupVpc = new String(source.DrillPairGroupVpc);
        }
        if (source.DrillPairGroupName != null) {
            this.DrillPairGroupName = new String(source.DrillPairGroupName);
        }
        if (source.CreationToken != null) {
            this.CreationToken = new String(source.CreationToken);
        }
        if (source.DrillPairGroupId != null) {
            this.DrillPairGroupId = new String(source.DrillPairGroupId);
        }
        if (source.CreateTargetInstanceParameters != null) {
            this.CreateTargetInstanceParameters = new CreateInstanceModel[source.CreateTargetInstanceParameters.length];
            for (int i = 0; i < source.CreateTargetInstanceParameters.length; i++) {
                this.CreateTargetInstanceParameters[i] = new CreateInstanceModel(source.CreateTargetInstanceParameters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProtectGroupId", this.ProtectGroupId);
        this.setParamSimple(map, prefix + "DrillPairGroupVpc", this.DrillPairGroupVpc);
        this.setParamSimple(map, prefix + "DrillPairGroupName", this.DrillPairGroupName);
        this.setParamSimple(map, prefix + "CreationToken", this.CreationToken);
        this.setParamSimple(map, prefix + "DrillPairGroupId", this.DrillPairGroupId);
        this.setParamArrayObj(map, prefix + "CreateTargetInstanceParameters.", this.CreateTargetInstanceParameters);

    }
}

