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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIModelGroup extends AbstractModel {

    /**
    * <p>模型分组</p><p>枚举值：</p><ul><li>hunyuan-exp： 内置 hunyuan 分组，Models 中包含混元生文模型</li><li>hunyuan-image： 内置 hunyuan 分组，Models 中包含混元生图模型</li><li>deepseek： 内置 deepseek 分组，Models 中包含Deepseek生文模型</li><li>cloudbase： 内置 cloudbase 分组，Models 中包含云开发提供的模型，支持的所有模型可从 DescribeManagedAIModelList 获取</li><li>custom-xxxx： 自定义模型分组，Models 中包含用户自行配置的模型</li></ul>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>模型列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Models")
    @Expose
    private AIModel [] Models;

    /**
    * <p>模型类型</p><p>枚举值：</p><ul><li>builtin： 内置模型分组类别</li><li>custom： 用户自定义模型分组类别</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>原始模型类型</p><p>枚举值：</p><ul><li>builtin： 内置模型类型</li><li>custom： 用户自定义模型类型</li></ul>
    */
    @SerializedName("OriginType")
    @Expose
    private String OriginType;

    /**
    * <p>备注</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>模型地址</p>
    */
    @SerializedName("BaseUrl")
    @Expose
    private String BaseUrl;

    /**
    * <p>模型状态, 1: 开启, 2: 关闭</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>模型密钥</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Secret")
    @Expose
    private AIModelSecret Secret;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get <p>模型分组</p><p>枚举值：</p><ul><li>hunyuan-exp： 内置 hunyuan 分组，Models 中包含混元生文模型</li><li>hunyuan-image： 内置 hunyuan 分组，Models 中包含混元生图模型</li><li>deepseek： 内置 deepseek 分组，Models 中包含Deepseek生文模型</li><li>cloudbase： 内置 cloudbase 分组，Models 中包含云开发提供的模型，支持的所有模型可从 DescribeManagedAIModelList 获取</li><li>custom-xxxx： 自定义模型分组，Models 中包含用户自行配置的模型</li></ul> 
     * @return GroupName <p>模型分组</p><p>枚举值：</p><ul><li>hunyuan-exp： 内置 hunyuan 分组，Models 中包含混元生文模型</li><li>hunyuan-image： 内置 hunyuan 分组，Models 中包含混元生图模型</li><li>deepseek： 内置 deepseek 分组，Models 中包含Deepseek生文模型</li><li>cloudbase： 内置 cloudbase 分组，Models 中包含云开发提供的模型，支持的所有模型可从 DescribeManagedAIModelList 获取</li><li>custom-xxxx： 自定义模型分组，Models 中包含用户自行配置的模型</li></ul>
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>模型分组</p><p>枚举值：</p><ul><li>hunyuan-exp： 内置 hunyuan 分组，Models 中包含混元生文模型</li><li>hunyuan-image： 内置 hunyuan 分组，Models 中包含混元生图模型</li><li>deepseek： 内置 deepseek 分组，Models 中包含Deepseek生文模型</li><li>cloudbase： 内置 cloudbase 分组，Models 中包含云开发提供的模型，支持的所有模型可从 DescribeManagedAIModelList 获取</li><li>custom-xxxx： 自定义模型分组，Models 中包含用户自行配置的模型</li></ul>
     * @param GroupName <p>模型分组</p><p>枚举值：</p><ul><li>hunyuan-exp： 内置 hunyuan 分组，Models 中包含混元生文模型</li><li>hunyuan-image： 内置 hunyuan 分组，Models 中包含混元生图模型</li><li>deepseek： 内置 deepseek 分组，Models 中包含Deepseek生文模型</li><li>cloudbase： 内置 cloudbase 分组，Models 中包含云开发提供的模型，支持的所有模型可从 DescribeManagedAIModelList 获取</li><li>custom-xxxx： 自定义模型分组，Models 中包含用户自行配置的模型</li></ul>
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get <p>模型列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Models <p>模型列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AIModel [] getModels() {
        return this.Models;
    }

    /**
     * Set <p>模型列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Models <p>模型列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModels(AIModel [] Models) {
        this.Models = Models;
    }

    /**
     * Get <p>模型类型</p><p>枚举值：</p><ul><li>builtin： 内置模型分组类别</li><li>custom： 用户自定义模型分组类别</li></ul> 
     * @return Type <p>模型类型</p><p>枚举值：</p><ul><li>builtin： 内置模型分组类别</li><li>custom： 用户自定义模型分组类别</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>模型类型</p><p>枚举值：</p><ul><li>builtin： 内置模型分组类别</li><li>custom： 用户自定义模型分组类别</li></ul>
     * @param Type <p>模型类型</p><p>枚举值：</p><ul><li>builtin： 内置模型分组类别</li><li>custom： 用户自定义模型分组类别</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>原始模型类型</p><p>枚举值：</p><ul><li>builtin： 内置模型类型</li><li>custom： 用户自定义模型类型</li></ul> 
     * @return OriginType <p>原始模型类型</p><p>枚举值：</p><ul><li>builtin： 内置模型类型</li><li>custom： 用户自定义模型类型</li></ul>
     */
    public String getOriginType() {
        return this.OriginType;
    }

    /**
     * Set <p>原始模型类型</p><p>枚举值：</p><ul><li>builtin： 内置模型类型</li><li>custom： 用户自定义模型类型</li></ul>
     * @param OriginType <p>原始模型类型</p><p>枚举值：</p><ul><li>builtin： 内置模型类型</li><li>custom： 用户自定义模型类型</li></ul>
     */
    public void setOriginType(String OriginType) {
        this.OriginType = OriginType;
    }

    /**
     * Get <p>备注</p> 
     * @return Remark <p>备注</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注</p>
     * @param Remark <p>备注</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>模型地址</p> 
     * @return BaseUrl <p>模型地址</p>
     */
    public String getBaseUrl() {
        return this.BaseUrl;
    }

    /**
     * Set <p>模型地址</p>
     * @param BaseUrl <p>模型地址</p>
     */
    public void setBaseUrl(String BaseUrl) {
        this.BaseUrl = BaseUrl;
    }

    /**
     * Get <p>模型状态, 1: 开启, 2: 关闭</p> 
     * @return Status <p>模型状态, 1: 开启, 2: 关闭</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>模型状态, 1: 开启, 2: 关闭</p>
     * @param Status <p>模型状态, 1: 开启, 2: 关闭</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>模型密钥</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Secret <p>模型密钥</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AIModelSecret getSecret() {
        return this.Secret;
    }

    /**
     * Set <p>模型密钥</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Secret <p>模型密钥</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecret(AIModelSecret Secret) {
        this.Secret = Secret;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdateTime <p>更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateTime <p>更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public AIModelGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIModelGroup(AIModelGroup source) {
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.Models != null) {
            this.Models = new AIModel[source.Models.length];
            for (int i = 0; i < source.Models.length; i++) {
                this.Models[i] = new AIModel(source.Models[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.OriginType != null) {
            this.OriginType = new String(source.OriginType);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.BaseUrl != null) {
            this.BaseUrl = new String(source.BaseUrl);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Secret != null) {
            this.Secret = new AIModelSecret(source.Secret);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamArrayObj(map, prefix + "Models.", this.Models);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "OriginType", this.OriginType);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "BaseUrl", this.BaseUrl);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "Secret.", this.Secret);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

