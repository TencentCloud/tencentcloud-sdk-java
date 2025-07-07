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

public class ModifyProjectRequest extends AbstractModel {

    /**
    * 项目Id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 名字
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 颜色值
    */
    @SerializedName("ColorCode")
    @Expose
    private String ColorCode;

    /**
    * 图标
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
    * 可申请
    */
    @SerializedName("IsApply")
    @Expose
    private Boolean IsApply;

    /**
    * 种子
    */
    @SerializedName("Seed")
    @Expose
    private String Seed;

    /**
    * 默认看板
    */
    @SerializedName("DefaultPanelType")
    @Expose
    private Long DefaultPanelType;

    /**
    * 2
    */
    @SerializedName("PanelScope")
    @Expose
    private String PanelScope;

    /**
    * 项目管理平台
    */
    @SerializedName("ManagePlatform")
    @Expose
    private String ManagePlatform;

    /**
     * Get 项目Id 
     * @return Id 项目Id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 项目Id
     * @param Id 项目Id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 名字 
     * @return Name 名字
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名字
     * @param Name 名字
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 颜色值 
     * @return ColorCode 颜色值
     */
    public String getColorCode() {
        return this.ColorCode;
    }

    /**
     * Set 颜色值
     * @param ColorCode 颜色值
     */
    public void setColorCode(String ColorCode) {
        this.ColorCode = ColorCode;
    }

    /**
     * Get 图标 
     * @return Logo 图标
     */
    public String getLogo() {
        return this.Logo;
    }

    /**
     * Set 图标
     * @param Logo 图标
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
     * Get 可申请 
     * @return IsApply 可申请
     */
    public Boolean getIsApply() {
        return this.IsApply;
    }

    /**
     * Set 可申请
     * @param IsApply 可申请
     */
    public void setIsApply(Boolean IsApply) {
        this.IsApply = IsApply;
    }

    /**
     * Get 种子 
     * @return Seed 种子
     */
    public String getSeed() {
        return this.Seed;
    }

    /**
     * Set 种子
     * @param Seed 种子
     */
    public void setSeed(String Seed) {
        this.Seed = Seed;
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
     * Get 2 
     * @return PanelScope 2
     */
    public String getPanelScope() {
        return this.PanelScope;
    }

    /**
     * Set 2
     * @param PanelScope 2
     */
    public void setPanelScope(String PanelScope) {
        this.PanelScope = PanelScope;
    }

    /**
     * Get 项目管理平台 
     * @return ManagePlatform 项目管理平台
     */
    public String getManagePlatform() {
        return this.ManagePlatform;
    }

    /**
     * Set 项目管理平台
     * @param ManagePlatform 项目管理平台
     */
    public void setManagePlatform(String ManagePlatform) {
        this.ManagePlatform = ManagePlatform;
    }

    public ModifyProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyProjectRequest(ModifyProjectRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
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
        if (source.Seed != null) {
            this.Seed = new String(source.Seed);
        }
        if (source.DefaultPanelType != null) {
            this.DefaultPanelType = new Long(source.DefaultPanelType);
        }
        if (source.PanelScope != null) {
            this.PanelScope = new String(source.PanelScope);
        }
        if (source.ManagePlatform != null) {
            this.ManagePlatform = new String(source.ManagePlatform);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ColorCode", this.ColorCode);
        this.setParamSimple(map, prefix + "Logo", this.Logo);
        this.setParamSimple(map, prefix + "Mark", this.Mark);
        this.setParamSimple(map, prefix + "IsApply", this.IsApply);
        this.setParamSimple(map, prefix + "Seed", this.Seed);
        this.setParamSimple(map, prefix + "DefaultPanelType", this.DefaultPanelType);
        this.setParamSimple(map, prefix + "PanelScope", this.PanelScope);
        this.setParamSimple(map, prefix + "ManagePlatform", this.ManagePlatform);

    }
}

