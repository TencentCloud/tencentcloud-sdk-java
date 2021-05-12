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

public class ModifyProjectRequest extends AbstractModel{

    /**
    * 平台名称，指定访问的平台。
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 项目 Id。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

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
    * 项目归属者。
    */
    @SerializedName("Owner")
    @Expose
    private Entity Owner;

    /**
    * 项目模式，一个项目可以有多种模式并相互切换。
当 Category 为 VIDEO_EDIT 时，可选模式有：
<li>Defualt：默认模式。</li>
<li>VideoEditTemplate：视频编辑模板制作模式。</li>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

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
     * Get 项目 Id。 
     * @return ProjectId 项目 Id。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目 Id。
     * @param ProjectId 项目 Id。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
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
     * Get 项目归属者。 
     * @return Owner 项目归属者。
     */
    public Entity getOwner() {
        return this.Owner;
    }

    /**
     * Set 项目归属者。
     * @param Owner 项目归属者。
     */
    public void setOwner(Entity Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 项目模式，一个项目可以有多种模式并相互切换。
当 Category 为 VIDEO_EDIT 时，可选模式有：
<li>Defualt：默认模式。</li>
<li>VideoEditTemplate：视频编辑模板制作模式。</li> 
     * @return Mode 项目模式，一个项目可以有多种模式并相互切换。
当 Category 为 VIDEO_EDIT 时，可选模式有：
<li>Defualt：默认模式。</li>
<li>VideoEditTemplate：视频编辑模板制作模式。</li>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 项目模式，一个项目可以有多种模式并相互切换。
当 Category 为 VIDEO_EDIT 时，可选模式有：
<li>Defualt：默认模式。</li>
<li>VideoEditTemplate：视频编辑模板制作模式。</li>
     * @param Mode 项目模式，一个项目可以有多种模式并相互切换。
当 Category 为 VIDEO_EDIT 时，可选模式有：
<li>Defualt：默认模式。</li>
<li>VideoEditTemplate：视频编辑模板制作模式。</li>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    public ModifyProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyProjectRequest(ModifyProjectRequest source) {
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AspectRatio != null) {
            this.AspectRatio = new String(source.AspectRatio);
        }
        if (source.Owner != null) {
            this.Owner = new Entity(source.Owner);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AspectRatio", this.AspectRatio);
        this.setParamObj(map, prefix + "Owner.", this.Owner);
        this.setParamSimple(map, prefix + "Mode", this.Mode);

    }
}

