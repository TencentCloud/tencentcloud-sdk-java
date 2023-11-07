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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserSignatureRule extends AbstractModel {

    /**
    * 特征ID
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * 规则开关
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 主类ID
    */
    @SerializedName("MainClassID")
    @Expose
    private String MainClassID;

    /**
    * 子类ID
    */
    @SerializedName("SubClassID")
    @Expose
    private String SubClassID;

    /**
    * CVE ID
    */
    @SerializedName("CveID")
    @Expose
    private String CveID;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 主类名字，根据Language字段输出中文/英文
    */
    @SerializedName("MainClassName")
    @Expose
    private String MainClassName;

    /**
    * 子类名字，根据Language字段输出中文/英文，若子类id为00000000，此字段为空
    */
    @SerializedName("SubClassName")
    @Expose
    private String SubClassName;

    /**
    * 规则描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 0/1
    */
    @SerializedName("Reason")
    @Expose
    private Long Reason;

    /**
     * Get 特征ID 
     * @return ID 特征ID
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set 特征ID
     * @param ID 特征ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get 规则开关 
     * @return Status 规则开关
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 规则开关
     * @param Status 规则开关
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 主类ID 
     * @return MainClassID 主类ID
     */
    public String getMainClassID() {
        return this.MainClassID;
    }

    /**
     * Set 主类ID
     * @param MainClassID 主类ID
     */
    public void setMainClassID(String MainClassID) {
        this.MainClassID = MainClassID;
    }

    /**
     * Get 子类ID 
     * @return SubClassID 子类ID
     */
    public String getSubClassID() {
        return this.SubClassID;
    }

    /**
     * Set 子类ID
     * @param SubClassID 子类ID
     */
    public void setSubClassID(String SubClassID) {
        this.SubClassID = SubClassID;
    }

    /**
     * Get CVE ID 
     * @return CveID CVE ID
     */
    public String getCveID() {
        return this.CveID;
    }

    /**
     * Set CVE ID
     * @param CveID CVE ID
     */
    public void setCveID(String CveID) {
        this.CveID = CveID;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间 
     * @return ModifyTime 更新时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 更新时间
     * @param ModifyTime 更新时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 主类名字，根据Language字段输出中文/英文 
     * @return MainClassName 主类名字，根据Language字段输出中文/英文
     */
    public String getMainClassName() {
        return this.MainClassName;
    }

    /**
     * Set 主类名字，根据Language字段输出中文/英文
     * @param MainClassName 主类名字，根据Language字段输出中文/英文
     */
    public void setMainClassName(String MainClassName) {
        this.MainClassName = MainClassName;
    }

    /**
     * Get 子类名字，根据Language字段输出中文/英文，若子类id为00000000，此字段为空 
     * @return SubClassName 子类名字，根据Language字段输出中文/英文，若子类id为00000000，此字段为空
     */
    public String getSubClassName() {
        return this.SubClassName;
    }

    /**
     * Set 子类名字，根据Language字段输出中文/英文，若子类id为00000000，此字段为空
     * @param SubClassName 子类名字，根据Language字段输出中文/英文，若子类id为00000000，此字段为空
     */
    public void setSubClassName(String SubClassName) {
        this.SubClassName = SubClassName;
    }

    /**
     * Get 规则描述 
     * @return Description 规则描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 规则描述
     * @param Description 规则描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 0/1 
     * @return Reason 0/1
     */
    public Long getReason() {
        return this.Reason;
    }

    /**
     * Set 0/1
     * @param Reason 0/1
     */
    public void setReason(Long Reason) {
        this.Reason = Reason;
    }

    public UserSignatureRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserSignatureRule(UserSignatureRule source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.MainClassID != null) {
            this.MainClassID = new String(source.MainClassID);
        }
        if (source.SubClassID != null) {
            this.SubClassID = new String(source.SubClassID);
        }
        if (source.CveID != null) {
            this.CveID = new String(source.CveID);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.MainClassName != null) {
            this.MainClassName = new String(source.MainClassName);
        }
        if (source.SubClassName != null) {
            this.SubClassName = new String(source.SubClassName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Reason != null) {
            this.Reason = new Long(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "MainClassID", this.MainClassID);
        this.setParamSimple(map, prefix + "SubClassID", this.SubClassID);
        this.setParamSimple(map, prefix + "CveID", this.CveID);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "MainClassName", this.MainClassName);
        this.setParamSimple(map, prefix + "SubClassName", this.SubClassName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

