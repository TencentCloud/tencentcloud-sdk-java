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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateProjectRequest extends AbstractModel{

    /**
    * 平台名称，指定访问的平台。
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 项目类别，取值有：
<li>VIDEO_EDIT：视频编辑。</li>
<li>SWITCHER：导播台。</li>
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * 项目名称，不可超过30个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 画布宽高比，取值有：
<li>16:9；</li>
<li>9:16。</li>
    */
    @SerializedName("AspectRatio")
    @Expose
    private String AspectRatio;

    /**
    * 归属者。
    */
    @SerializedName("Owner")
    @Expose
    private Entity Owner;

    /**
    * 项目描述信息。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 导播台信息，仅当项目类型为 SWITCHER 时有效。
    */
    @SerializedName("SwitcherProjectInput")
    @Expose
    private SwitcherProjectInput SwitcherProjectInput;

    /**
     * Get 平台名称，指定访问的平台。 
     * @return Platform 平台名称，指定访问的平台。
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 平台名称，指定访问的平台。
     * @param Platform 平台名称，指定访问的平台。
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 项目类别，取值有：
<li>VIDEO_EDIT：视频编辑。</li>
<li>SWITCHER：导播台。</li> 
     * @return Category 项目类别，取值有：
<li>VIDEO_EDIT：视频编辑。</li>
<li>SWITCHER：导播台。</li>
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set 项目类别，取值有：
<li>VIDEO_EDIT：视频编辑。</li>
<li>SWITCHER：导播台。</li>
     * @param Category 项目类别，取值有：
<li>VIDEO_EDIT：视频编辑。</li>
<li>SWITCHER：导播台。</li>
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get 项目名称，不可超过30个字符。 
     * @return Name 项目名称，不可超过30个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 项目名称，不可超过30个字符。
     * @param Name 项目名称，不可超过30个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 画布宽高比，取值有：
<li>16:9；</li>
<li>9:16。</li> 
     * @return AspectRatio 画布宽高比，取值有：
<li>16:9；</li>
<li>9:16。</li>
     */
    public String getAspectRatio() {
        return this.AspectRatio;
    }

    /**
     * Set 画布宽高比，取值有：
<li>16:9；</li>
<li>9:16。</li>
     * @param AspectRatio 画布宽高比，取值有：
<li>16:9；</li>
<li>9:16。</li>
     */
    public void setAspectRatio(String AspectRatio) {
        this.AspectRatio = AspectRatio;
    }

    /**
     * Get 归属者。 
     * @return Owner 归属者。
     */
    public Entity getOwner() {
        return this.Owner;
    }

    /**
     * Set 归属者。
     * @param Owner 归属者。
     */
    public void setOwner(Entity Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 项目描述信息。 
     * @return Description 项目描述信息。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 项目描述信息。
     * @param Description 项目描述信息。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 导播台信息，仅当项目类型为 SWITCHER 时有效。 
     * @return SwitcherProjectInput 导播台信息，仅当项目类型为 SWITCHER 时有效。
     */
    public SwitcherProjectInput getSwitcherProjectInput() {
        return this.SwitcherProjectInput;
    }

    /**
     * Set 导播台信息，仅当项目类型为 SWITCHER 时有效。
     * @param SwitcherProjectInput 导播台信息，仅当项目类型为 SWITCHER 时有效。
     */
    public void setSwitcherProjectInput(SwitcherProjectInput SwitcherProjectInput) {
        this.SwitcherProjectInput = SwitcherProjectInput;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AspectRatio", this.AspectRatio);
        this.setParamObj(map, prefix + "Owner.", this.Owner);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamObj(map, prefix + "SwitcherProjectInput.", this.SwitcherProjectInput);

    }
}

