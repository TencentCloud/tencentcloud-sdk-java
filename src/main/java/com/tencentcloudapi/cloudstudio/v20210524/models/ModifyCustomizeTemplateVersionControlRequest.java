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
package com.tencentcloudapi.cloudstudio.v20210524.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCustomizeTemplateVersionControlRequest extends AbstractModel{

    /**
    * 用户所属组
    */
    @SerializedName("CloudStudioSessionTeam")
    @Expose
    private String CloudStudioSessionTeam;

    /**
    * 模板ID
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * 仓库地址
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 代码仓库分支/标签
    */
    @SerializedName("Ref")
    @Expose
    private String Ref;

    /**
    * 代码仓库 ref 类型
    */
    @SerializedName("RefType")
    @Expose
    private String RefType;

    /**
     * Get 用户所属组 
     * @return CloudStudioSessionTeam 用户所属组
     */
    public String getCloudStudioSessionTeam() {
        return this.CloudStudioSessionTeam;
    }

    /**
     * Set 用户所属组
     * @param CloudStudioSessionTeam 用户所属组
     */
    public void setCloudStudioSessionTeam(String CloudStudioSessionTeam) {
        this.CloudStudioSessionTeam = CloudStudioSessionTeam;
    }

    /**
     * Get 模板ID 
     * @return TemplateId 模板ID
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板ID
     * @param TemplateId 模板ID
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 仓库地址 
     * @return Url 仓库地址
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 仓库地址
     * @param Url 仓库地址
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 代码仓库分支/标签 
     * @return Ref 代码仓库分支/标签
     */
    public String getRef() {
        return this.Ref;
    }

    /**
     * Set 代码仓库分支/标签
     * @param Ref 代码仓库分支/标签
     */
    public void setRef(String Ref) {
        this.Ref = Ref;
    }

    /**
     * Get 代码仓库 ref 类型 
     * @return RefType 代码仓库 ref 类型
     */
    public String getRefType() {
        return this.RefType;
    }

    /**
     * Set 代码仓库 ref 类型
     * @param RefType 代码仓库 ref 类型
     */
    public void setRefType(String RefType) {
        this.RefType = RefType;
    }

    public ModifyCustomizeTemplateVersionControlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCustomizeTemplateVersionControlRequest(ModifyCustomizeTemplateVersionControlRequest source) {
        if (source.CloudStudioSessionTeam != null) {
            this.CloudStudioSessionTeam = new String(source.CloudStudioSessionTeam);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Ref != null) {
            this.Ref = new String(source.Ref);
        }
        if (source.RefType != null) {
            this.RefType = new String(source.RefType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CloudStudioSessionTeam", this.CloudStudioSessionTeam);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Ref", this.Ref);
        this.setParamSimple(map, prefix + "RefType", this.RefType);

    }
}

