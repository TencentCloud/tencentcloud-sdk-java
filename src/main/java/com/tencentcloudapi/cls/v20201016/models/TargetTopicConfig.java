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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetTopicConfig extends AbstractModel {

    /**
    * <p>目标账号类型。</p><p>枚举值：</p><ul><li>1： 当前主账号</li><li>2： 其他主账号</li></ul>
    */
    @SerializedName("AccountType")
    @Expose
    private Long AccountType;

    /**
    * <p>目标地域</p><p>参数格式：ap-guangzhou</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>目标日志集id</p>
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * <p>目标日志主题id</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>角色ARN</p><p>AccountType=2时必填</p>
    */
    @SerializedName("RoleArn")
    @Expose
    private String RoleArn;

    /**
    * <p>外部ID</p><p>AccountType=2时必填</p>
    */
    @SerializedName("ExternalId")
    @Expose
    private String ExternalId;

    /**
     * Get <p>目标账号类型。</p><p>枚举值：</p><ul><li>1： 当前主账号</li><li>2： 其他主账号</li></ul> 
     * @return AccountType <p>目标账号类型。</p><p>枚举值：</p><ul><li>1： 当前主账号</li><li>2： 其他主账号</li></ul>
     */
    public Long getAccountType() {
        return this.AccountType;
    }

    /**
     * Set <p>目标账号类型。</p><p>枚举值：</p><ul><li>1： 当前主账号</li><li>2： 其他主账号</li></ul>
     * @param AccountType <p>目标账号类型。</p><p>枚举值：</p><ul><li>1： 当前主账号</li><li>2： 其他主账号</li></ul>
     */
    public void setAccountType(Long AccountType) {
        this.AccountType = AccountType;
    }

    /**
     * Get <p>目标地域</p><p>参数格式：ap-guangzhou</p> 
     * @return Region <p>目标地域</p><p>参数格式：ap-guangzhou</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>目标地域</p><p>参数格式：ap-guangzhou</p>
     * @param Region <p>目标地域</p><p>参数格式：ap-guangzhou</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>目标日志集id</p> 
     * @return LogsetId <p>目标日志集id</p>
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set <p>目标日志集id</p>
     * @param LogsetId <p>目标日志集id</p>
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get <p>目标日志主题id</p> 
     * @return TopicId <p>目标日志主题id</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>目标日志主题id</p>
     * @param TopicId <p>目标日志主题id</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>角色ARN</p><p>AccountType=2时必填</p> 
     * @return RoleArn <p>角色ARN</p><p>AccountType=2时必填</p>
     */
    public String getRoleArn() {
        return this.RoleArn;
    }

    /**
     * Set <p>角色ARN</p><p>AccountType=2时必填</p>
     * @param RoleArn <p>角色ARN</p><p>AccountType=2时必填</p>
     */
    public void setRoleArn(String RoleArn) {
        this.RoleArn = RoleArn;
    }

    /**
     * Get <p>外部ID</p><p>AccountType=2时必填</p> 
     * @return ExternalId <p>外部ID</p><p>AccountType=2时必填</p>
     */
    public String getExternalId() {
        return this.ExternalId;
    }

    /**
     * Set <p>外部ID</p><p>AccountType=2时必填</p>
     * @param ExternalId <p>外部ID</p><p>AccountType=2时必填</p>
     */
    public void setExternalId(String ExternalId) {
        this.ExternalId = ExternalId;
    }

    public TargetTopicConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetTopicConfig(TargetTopicConfig source) {
        if (source.AccountType != null) {
            this.AccountType = new Long(source.AccountType);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.RoleArn != null) {
            this.RoleArn = new String(source.RoleArn);
        }
        if (source.ExternalId != null) {
            this.ExternalId = new String(source.ExternalId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "RoleArn", this.RoleArn);
        this.setParamSimple(map, prefix + "ExternalId", this.ExternalId);

    }
}

