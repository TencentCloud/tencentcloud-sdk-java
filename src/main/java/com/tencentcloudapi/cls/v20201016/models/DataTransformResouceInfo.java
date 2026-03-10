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

public class DataTransformResouceInfo extends AbstractModel {

    /**
    * <p>日志主题ID</p><ul><li>通过<a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取日志主题Id。</li></ul>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>别名<br>限制：不能包含字符 |。</p>
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * <p>是否是跨账号主题，false不是跨账号主题，true是跨账号主题</p><p>默认值：false</p>
    */
    @SerializedName("IsCrossAccount")
    @Expose
    private Boolean IsCrossAccount;

    /**
    * <p>跨账号场景下，被投递账号给投递账号创建的角色ARN值，在被投递账号的角色里查找</p>
    */
    @SerializedName("RoleARN")
    @Expose
    private String RoleARN;

    /**
    * <p>外部ID值，可以在被投递账号的角色-载体里找到该值</p>
    */
    @SerializedName("ExternalId")
    @Expose
    private String ExternalId;

    /**
    * <p>topic名称</p>
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * <p>日志集的名称</p>
    */
    @SerializedName("LogsetName")
    @Expose
    private String LogsetName;

    /**
     * Get <p>日志主题ID</p><ul><li>通过<a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取日志主题Id。</li></ul> 
     * @return TopicId <p>日志主题ID</p><ul><li>通过<a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取日志主题Id。</li></ul>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>日志主题ID</p><ul><li>通过<a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取日志主题Id。</li></ul>
     * @param TopicId <p>日志主题ID</p><ul><li>通过<a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取日志主题Id。</li></ul>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>别名<br>限制：不能包含字符 |。</p> 
     * @return Alias <p>别名<br>限制：不能包含字符 |。</p>
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set <p>别名<br>限制：不能包含字符 |。</p>
     * @param Alias <p>别名<br>限制：不能包含字符 |。</p>
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get <p>是否是跨账号主题，false不是跨账号主题，true是跨账号主题</p><p>默认值：false</p> 
     * @return IsCrossAccount <p>是否是跨账号主题，false不是跨账号主题，true是跨账号主题</p><p>默认值：false</p>
     */
    public Boolean getIsCrossAccount() {
        return this.IsCrossAccount;
    }

    /**
     * Set <p>是否是跨账号主题，false不是跨账号主题，true是跨账号主题</p><p>默认值：false</p>
     * @param IsCrossAccount <p>是否是跨账号主题，false不是跨账号主题，true是跨账号主题</p><p>默认值：false</p>
     */
    public void setIsCrossAccount(Boolean IsCrossAccount) {
        this.IsCrossAccount = IsCrossAccount;
    }

    /**
     * Get <p>跨账号场景下，被投递账号给投递账号创建的角色ARN值，在被投递账号的角色里查找</p> 
     * @return RoleARN <p>跨账号场景下，被投递账号给投递账号创建的角色ARN值，在被投递账号的角色里查找</p>
     */
    public String getRoleARN() {
        return this.RoleARN;
    }

    /**
     * Set <p>跨账号场景下，被投递账号给投递账号创建的角色ARN值，在被投递账号的角色里查找</p>
     * @param RoleARN <p>跨账号场景下，被投递账号给投递账号创建的角色ARN值，在被投递账号的角色里查找</p>
     */
    public void setRoleARN(String RoleARN) {
        this.RoleARN = RoleARN;
    }

    /**
     * Get <p>外部ID值，可以在被投递账号的角色-载体里找到该值</p> 
     * @return ExternalId <p>外部ID值，可以在被投递账号的角色-载体里找到该值</p>
     */
    public String getExternalId() {
        return this.ExternalId;
    }

    /**
     * Set <p>外部ID值，可以在被投递账号的角色-载体里找到该值</p>
     * @param ExternalId <p>外部ID值，可以在被投递账号的角色-载体里找到该值</p>
     */
    public void setExternalId(String ExternalId) {
        this.ExternalId = ExternalId;
    }

    /**
     * Get <p>topic名称</p> 
     * @return TopicName <p>topic名称</p>
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set <p>topic名称</p>
     * @param TopicName <p>topic名称</p>
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get <p>日志集的名称</p> 
     * @return LogsetName <p>日志集的名称</p>
     */
    public String getLogsetName() {
        return this.LogsetName;
    }

    /**
     * Set <p>日志集的名称</p>
     * @param LogsetName <p>日志集的名称</p>
     */
    public void setLogsetName(String LogsetName) {
        this.LogsetName = LogsetName;
    }

    public DataTransformResouceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataTransformResouceInfo(DataTransformResouceInfo source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.IsCrossAccount != null) {
            this.IsCrossAccount = new Boolean(source.IsCrossAccount);
        }
        if (source.RoleARN != null) {
            this.RoleARN = new String(source.RoleARN);
        }
        if (source.ExternalId != null) {
            this.ExternalId = new String(source.ExternalId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.LogsetName != null) {
            this.LogsetName = new String(source.LogsetName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "IsCrossAccount", this.IsCrossAccount);
        this.setParamSimple(map, prefix + "RoleARN", this.RoleARN);
        this.setParamSimple(map, prefix + "ExternalId", this.ExternalId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "LogsetName", this.LogsetName);

    }
}

