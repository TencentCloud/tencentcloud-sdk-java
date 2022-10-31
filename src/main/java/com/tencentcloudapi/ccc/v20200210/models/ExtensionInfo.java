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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExtensionInfo extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 分机全名
    */
    @SerializedName("FullExtensionId")
    @Expose
    private String FullExtensionId;

    /**
    * 分机号
    */
    @SerializedName("ExtensionId")
    @Expose
    private String ExtensionId;

    /**
    * 所属技能组列表
    */
    @SerializedName("SkillGroupId")
    @Expose
    private String SkillGroupId;

    /**
    * 分机名称
    */
    @SerializedName("ExtensionName")
    @Expose
    private String ExtensionName;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 最后修改时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private Long ModifyTime;

    /**
    * 话机状态(0 离线、100 空闲、200忙碌）
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 是否注册
    */
    @SerializedName("Register")
    @Expose
    private Boolean Register;

    /**
    * 绑定坐席邮箱
    */
    @SerializedName("Relation")
    @Expose
    private String Relation;

    /**
    * 绑定坐席名称
    */
    @SerializedName("RelationName")
    @Expose
    private String RelationName;

    /**
     * Get 实例ID 
     * @return SdkAppId 实例ID
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 实例ID
     * @param SdkAppId 实例ID
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 分机全名 
     * @return FullExtensionId 分机全名
     */
    public String getFullExtensionId() {
        return this.FullExtensionId;
    }

    /**
     * Set 分机全名
     * @param FullExtensionId 分机全名
     */
    public void setFullExtensionId(String FullExtensionId) {
        this.FullExtensionId = FullExtensionId;
    }

    /**
     * Get 分机号 
     * @return ExtensionId 分机号
     */
    public String getExtensionId() {
        return this.ExtensionId;
    }

    /**
     * Set 分机号
     * @param ExtensionId 分机号
     */
    public void setExtensionId(String ExtensionId) {
        this.ExtensionId = ExtensionId;
    }

    /**
     * Get 所属技能组列表 
     * @return SkillGroupId 所属技能组列表
     */
    public String getSkillGroupId() {
        return this.SkillGroupId;
    }

    /**
     * Set 所属技能组列表
     * @param SkillGroupId 所属技能组列表
     */
    public void setSkillGroupId(String SkillGroupId) {
        this.SkillGroupId = SkillGroupId;
    }

    /**
     * Get 分机名称 
     * @return ExtensionName 分机名称
     */
    public String getExtensionName() {
        return this.ExtensionName;
    }

    /**
     * Set 分机名称
     * @param ExtensionName 分机名称
     */
    public void setExtensionName(String ExtensionName) {
        this.ExtensionName = ExtensionName;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 最后修改时间 
     * @return ModifyTime 最后修改时间
     */
    public Long getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 最后修改时间
     * @param ModifyTime 最后修改时间
     */
    public void setModifyTime(Long ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 话机状态(0 离线、100 空闲、200忙碌） 
     * @return Status 话机状态(0 离线、100 空闲、200忙碌）
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 话机状态(0 离线、100 空闲、200忙碌）
     * @param Status 话机状态(0 离线、100 空闲、200忙碌）
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 是否注册 
     * @return Register 是否注册
     */
    public Boolean getRegister() {
        return this.Register;
    }

    /**
     * Set 是否注册
     * @param Register 是否注册
     */
    public void setRegister(Boolean Register) {
        this.Register = Register;
    }

    /**
     * Get 绑定坐席邮箱 
     * @return Relation 绑定坐席邮箱
     */
    public String getRelation() {
        return this.Relation;
    }

    /**
     * Set 绑定坐席邮箱
     * @param Relation 绑定坐席邮箱
     */
    public void setRelation(String Relation) {
        this.Relation = Relation;
    }

    /**
     * Get 绑定坐席名称 
     * @return RelationName 绑定坐席名称
     */
    public String getRelationName() {
        return this.RelationName;
    }

    /**
     * Set 绑定坐席名称
     * @param RelationName 绑定坐席名称
     */
    public void setRelationName(String RelationName) {
        this.RelationName = RelationName;
    }

    public ExtensionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtensionInfo(ExtensionInfo source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.FullExtensionId != null) {
            this.FullExtensionId = new String(source.FullExtensionId);
        }
        if (source.ExtensionId != null) {
            this.ExtensionId = new String(source.ExtensionId);
        }
        if (source.SkillGroupId != null) {
            this.SkillGroupId = new String(source.SkillGroupId);
        }
        if (source.ExtensionName != null) {
            this.ExtensionName = new String(source.ExtensionName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new Long(source.ModifyTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Register != null) {
            this.Register = new Boolean(source.Register);
        }
        if (source.Relation != null) {
            this.Relation = new String(source.Relation);
        }
        if (source.RelationName != null) {
            this.RelationName = new String(source.RelationName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "FullExtensionId", this.FullExtensionId);
        this.setParamSimple(map, prefix + "ExtensionId", this.ExtensionId);
        this.setParamSimple(map, prefix + "SkillGroupId", this.SkillGroupId);
        this.setParamSimple(map, prefix + "ExtensionName", this.ExtensionName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Register", this.Register);
        this.setParamSimple(map, prefix + "Relation", this.Relation);
        this.setParamSimple(map, prefix + "RelationName", this.RelationName);

    }
}

