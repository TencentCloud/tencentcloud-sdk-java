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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateProjectRequest extends AbstractModel {

    /**
    * <p>项目名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>logo底色</p>
    */
    @SerializedName("ColorCode")
    @Expose
    private String ColorCode;

    /**
    * <p>项目Logo</p>
    */
    @SerializedName("Logo")
    @Expose
    private String Logo;

    /**
    * <p>备注</p>
    */
    @SerializedName("Mark")
    @Expose
    private String Mark;

    /**
    * <p>是否允许用户申请</p>
    */
    @SerializedName("IsApply")
    @Expose
    private Boolean IsApply;

    /**
    * <p>默认看板</p><p>枚举值：</p><ul><li>1： 项目看板</li><li>2： 我的看板</li></ul>
    */
    @SerializedName("DefaultPanelType")
    @Expose
    private Long DefaultPanelType;

    /**
    * <p>管理平台</p>
    */
    @SerializedName("ManagePlatform")
    @Expose
    private String ManagePlatform;

    /**
     * Get <p>项目名称</p> 
     * @return Name <p>项目名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>项目名称</p>
     * @param Name <p>项目名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>logo底色</p> 
     * @return ColorCode <p>logo底色</p>
     */
    public String getColorCode() {
        return this.ColorCode;
    }

    /**
     * Set <p>logo底色</p>
     * @param ColorCode <p>logo底色</p>
     */
    public void setColorCode(String ColorCode) {
        this.ColorCode = ColorCode;
    }

    /**
     * Get <p>项目Logo</p> 
     * @return Logo <p>项目Logo</p>
     */
    public String getLogo() {
        return this.Logo;
    }

    /**
     * Set <p>项目Logo</p>
     * @param Logo <p>项目Logo</p>
     */
    public void setLogo(String Logo) {
        this.Logo = Logo;
    }

    /**
     * Get <p>备注</p> 
     * @return Mark <p>备注</p>
     */
    public String getMark() {
        return this.Mark;
    }

    /**
     * Set <p>备注</p>
     * @param Mark <p>备注</p>
     */
    public void setMark(String Mark) {
        this.Mark = Mark;
    }

    /**
     * Get <p>是否允许用户申请</p> 
     * @return IsApply <p>是否允许用户申请</p>
     */
    public Boolean getIsApply() {
        return this.IsApply;
    }

    /**
     * Set <p>是否允许用户申请</p>
     * @param IsApply <p>是否允许用户申请</p>
     */
    public void setIsApply(Boolean IsApply) {
        this.IsApply = IsApply;
    }

    /**
     * Get <p>默认看板</p><p>枚举值：</p><ul><li>1： 项目看板</li><li>2： 我的看板</li></ul> 
     * @return DefaultPanelType <p>默认看板</p><p>枚举值：</p><ul><li>1： 项目看板</li><li>2： 我的看板</li></ul>
     */
    public Long getDefaultPanelType() {
        return this.DefaultPanelType;
    }

    /**
     * Set <p>默认看板</p><p>枚举值：</p><ul><li>1： 项目看板</li><li>2： 我的看板</li></ul>
     * @param DefaultPanelType <p>默认看板</p><p>枚举值：</p><ul><li>1： 项目看板</li><li>2： 我的看板</li></ul>
     */
    public void setDefaultPanelType(Long DefaultPanelType) {
        this.DefaultPanelType = DefaultPanelType;
    }

    /**
     * Get <p>管理平台</p> 
     * @return ManagePlatform <p>管理平台</p>
     */
    public String getManagePlatform() {
        return this.ManagePlatform;
    }

    /**
     * Set <p>管理平台</p>
     * @param ManagePlatform <p>管理平台</p>
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

