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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateProjectRequest extends AbstractModel {

    /**
    * 项目名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * logo底色
    */
    @SerializedName("ColorCode")
    @Expose
    private String ColorCode;

    /**
    * 项目Logo
    */
    @SerializedName("Logo")
    @Expose
    private String Logo;

    /**
    * 备注
    */
    @SerializedName("Mark")
    @Expose
    private String Mark;

    /**
    * 是否允许用户申请
    */
    @SerializedName("IsApply")
    @Expose
    private Boolean IsApply;

    /**
    * 默认看板
    */
    @SerializedName("DefaultPanelType")
    @Expose
    private Long DefaultPanelType;

    /**
    * 管理平台
    */
    @SerializedName("ManagePlatform")
    @Expose
    private String ManagePlatform;

    /**
     * Get 项目名称 
     * @return Name 项目名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 项目名称
     * @param Name 项目名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get logo底色 
     * @return ColorCode logo底色
     */
    public String getColorCode() {
        return this.ColorCode;
    }

    /**
     * Set logo底色
     * @param ColorCode logo底色
     */
    public void setColorCode(String ColorCode) {
        this.ColorCode = ColorCode;
    }

    /**
     * Get 项目Logo 
     * @return Logo 项目Logo
     */
    public String getLogo() {
        return this.Logo;
    }

    /**
     * Set 项目Logo
     * @param Logo 项目Logo
     */
    public void setLogo(String Logo) {
        this.Logo = Logo;
    }

    /**
     * Get 备注 
     * @return Mark 备注
     */
    public String getMark() {
        return this.Mark;
    }

    /**
     * Set 备注
     * @param Mark 备注
     */
    public void setMark(String Mark) {
        this.Mark = Mark;
    }

    /**
     * Get 是否允许用户申请 
     * @return IsApply 是否允许用户申请
     */
    public Boolean getIsApply() {
        return this.IsApply;
    }

    /**
     * Set 是否允许用户申请
     * @param IsApply 是否允许用户申请
     */
    public void setIsApply(Boolean IsApply) {
        this.IsApply = IsApply;
    }

    /**
     * Get 默认看板 
     * @return DefaultPanelType 默认看板
     */
    public Long getDefaultPanelType() {
        return this.DefaultPanelType;
    }

    /**
     * Set 默认看板
     * @param DefaultPanelType 默认看板
     */
    public void setDefaultPanelType(Long DefaultPanelType) {
        this.DefaultPanelType = DefaultPanelType;
    }

    /**
     * Get 管理平台 
     * @return ManagePlatform 管理平台
     */
    public String getManagePlatform() {
        return this.ManagePlatform;
    }

    /**
     * Set 管理平台
     * @param ManagePlatform 管理平台
     */
    public void setManagePlatform(String ManagePlatform) {
        this.ManagePlatform = ManagePlatform;
    }

    public CreateProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateProjectRequest(CreateProjectRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ColorCode != null) {
            this.ColorCode = new String(source.ColorCode);
        }
        if (source.Logo != null) {
            this.Logo = new String(source.Logo);
        }
        if (source.Mark != null) {
            this.Mark = new String(source.Mark);
        }
        if (source.IsApply != null) {
            this.IsApply = new Boolean(source.IsApply);
        }
        if (source.DefaultPanelType != null) {
            this.DefaultPanelType = new Long(source.DefaultPanelType);
        }
        if (source.ManagePlatform != null) {
            this.ManagePlatform = new String(source.ManagePlatform);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ColorCode", this.ColorCode);
        this.setParamSimple(map, prefix + "Logo", this.Logo);
        this.setParamSimple(map, prefix + "Mark", this.Mark);
        this.setParamSimple(map, prefix + "IsApply", this.IsApply);
        this.setParamSimple(map, prefix + "DefaultPanelType", this.DefaultPanelType);
        this.setParamSimple(map, prefix + "ManagePlatform", this.ManagePlatform);

    }
}

