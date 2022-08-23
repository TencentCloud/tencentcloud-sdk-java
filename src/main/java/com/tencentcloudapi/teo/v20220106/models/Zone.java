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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Zone extends AbstractModel{

    /**
    * 站点ID。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 站点名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 站点当前使用的 NS 列表。
    */
    @SerializedName("OriginalNameServers")
    @Expose
    private String [] OriginalNameServers;

    /**
    * 腾讯云分配的 NS 列表。
    */
    @SerializedName("NameServers")
    @Expose
    private String [] NameServers;

    /**
    * 站点状态，取值有：
<li> active：NS 已切换； </li>
<li> pending：NS 未切换；</li>
<li> moved：NS 已切走；</li>
<li> deactivated：被封禁。 </li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 站点接入方式，取值有
<li> full：NS 接入； </li>
<li> partial：CNAME 接入。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 站点是否关闭。
    */
    @SerializedName("Paused")
    @Expose
    private Boolean Paused;

    /**
    * 是否开启cname加速，取值有：
<li> enabled：开启；</li>
<li> disabled：关闭。</li>
    */
    @SerializedName("CnameSpeedUp")
    @Expose
    private String CnameSpeedUp;

    /**
    * cname 接入状态，取值有：
<li> finished：站点已验证；</li>
<li> pending：站点验证中。</li>
    */
    @SerializedName("CnameStatus")
    @Expose
    private String CnameStatus;

    /**
    * 资源标签列表。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 计费资源列表。
    */
    @SerializedName("Resources")
    @Expose
    private Resource [] Resources;

    /**
    * 站点创建时间。
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * 站点修改时间。
    */
    @SerializedName("ModifiedOn")
    @Expose
    private String ModifiedOn;

    /**
    * 站点接入地域，取值为：
<li> global：全球；</li>
<li> mainland：中国大陆；</li>
<li> overseas：境外区域。</li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get 站点ID。 
     * @return Id 站点ID。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 站点ID。
     * @param Id 站点ID。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 站点名称。 
     * @return Name 站点名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 站点名称。
     * @param Name 站点名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 站点当前使用的 NS 列表。 
     * @return OriginalNameServers 站点当前使用的 NS 列表。
     */
    public String [] getOriginalNameServers() {
        return this.OriginalNameServers;
    }

    /**
     * Set 站点当前使用的 NS 列表。
     * @param OriginalNameServers 站点当前使用的 NS 列表。
     */
    public void setOriginalNameServers(String [] OriginalNameServers) {
        this.OriginalNameServers = OriginalNameServers;
    }

    /**
     * Get 腾讯云分配的 NS 列表。 
     * @return NameServers 腾讯云分配的 NS 列表。
     */
    public String [] getNameServers() {
        return this.NameServers;
    }

    /**
     * Set 腾讯云分配的 NS 列表。
     * @param NameServers 腾讯云分配的 NS 列表。
     */
    public void setNameServers(String [] NameServers) {
        this.NameServers = NameServers;
    }

    /**
     * Get 站点状态，取值有：
<li> active：NS 已切换； </li>
<li> pending：NS 未切换；</li>
<li> moved：NS 已切走；</li>
<li> deactivated：被封禁。 </li> 
     * @return Status 站点状态，取值有：
<li> active：NS 已切换； </li>
<li> pending：NS 未切换；</li>
<li> moved：NS 已切走；</li>
<li> deactivated：被封禁。 </li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 站点状态，取值有：
<li> active：NS 已切换； </li>
<li> pending：NS 未切换；</li>
<li> moved：NS 已切走；</li>
<li> deactivated：被封禁。 </li>
     * @param Status 站点状态，取值有：
<li> active：NS 已切换； </li>
<li> pending：NS 未切换；</li>
<li> moved：NS 已切走；</li>
<li> deactivated：被封禁。 </li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 站点接入方式，取值有
<li> full：NS 接入； </li>
<li> partial：CNAME 接入。</li> 
     * @return Type 站点接入方式，取值有
<li> full：NS 接入； </li>
<li> partial：CNAME 接入。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 站点接入方式，取值有
<li> full：NS 接入； </li>
<li> partial：CNAME 接入。</li>
     * @param Type 站点接入方式，取值有
<li> full：NS 接入； </li>
<li> partial：CNAME 接入。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 站点是否关闭。 
     * @return Paused 站点是否关闭。
     */
    public Boolean getPaused() {
        return this.Paused;
    }

    /**
     * Set 站点是否关闭。
     * @param Paused 站点是否关闭。
     */
    public void setPaused(Boolean Paused) {
        this.Paused = Paused;
    }

    /**
     * Get 是否开启cname加速，取值有：
<li> enabled：开启；</li>
<li> disabled：关闭。</li> 
     * @return CnameSpeedUp 是否开启cname加速，取值有：
<li> enabled：开启；</li>
<li> disabled：关闭。</li>
     */
    public String getCnameSpeedUp() {
        return this.CnameSpeedUp;
    }

    /**
     * Set 是否开启cname加速，取值有：
<li> enabled：开启；</li>
<li> disabled：关闭。</li>
     * @param CnameSpeedUp 是否开启cname加速，取值有：
<li> enabled：开启；</li>
<li> disabled：关闭。</li>
     */
    public void setCnameSpeedUp(String CnameSpeedUp) {
        this.CnameSpeedUp = CnameSpeedUp;
    }

    /**
     * Get cname 接入状态，取值有：
<li> finished：站点已验证；</li>
<li> pending：站点验证中。</li> 
     * @return CnameStatus cname 接入状态，取值有：
<li> finished：站点已验证；</li>
<li> pending：站点验证中。</li>
     */
    public String getCnameStatus() {
        return this.CnameStatus;
    }

    /**
     * Set cname 接入状态，取值有：
<li> finished：站点已验证；</li>
<li> pending：站点验证中。</li>
     * @param CnameStatus cname 接入状态，取值有：
<li> finished：站点已验证；</li>
<li> pending：站点验证中。</li>
     */
    public void setCnameStatus(String CnameStatus) {
        this.CnameStatus = CnameStatus;
    }

    /**
     * Get 资源标签列表。 
     * @return Tags 资源标签列表。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 资源标签列表。
     * @param Tags 资源标签列表。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 计费资源列表。 
     * @return Resources 计费资源列表。
     */
    public Resource [] getResources() {
        return this.Resources;
    }

    /**
     * Set 计费资源列表。
     * @param Resources 计费资源列表。
     */
    public void setResources(Resource [] Resources) {
        this.Resources = Resources;
    }

    /**
     * Get 站点创建时间。 
     * @return CreatedOn 站点创建时间。
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set 站点创建时间。
     * @param CreatedOn 站点创建时间。
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get 站点修改时间。 
     * @return ModifiedOn 站点修改时间。
     */
    public String getModifiedOn() {
        return this.ModifiedOn;
    }

    /**
     * Set 站点修改时间。
     * @param ModifiedOn 站点修改时间。
     */
    public void setModifiedOn(String ModifiedOn) {
        this.ModifiedOn = ModifiedOn;
    }

    /**
     * Get 站点接入地域，取值为：
<li> global：全球；</li>
<li> mainland：中国大陆；</li>
<li> overseas：境外区域。</li> 
     * @return Area 站点接入地域，取值为：
<li> global：全球；</li>
<li> mainland：中国大陆；</li>
<li> overseas：境外区域。</li>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 站点接入地域，取值为：
<li> global：全球；</li>
<li> mainland：中国大陆；</li>
<li> overseas：境外区域。</li>
     * @param Area 站点接入地域，取值为：
<li> global：全球；</li>
<li> mainland：中国大陆；</li>
<li> overseas：境外区域。</li>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public Zone() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Zone(Zone source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.OriginalNameServers != null) {
            this.OriginalNameServers = new String[source.OriginalNameServers.length];
            for (int i = 0; i < source.OriginalNameServers.length; i++) {
                this.OriginalNameServers[i] = new String(source.OriginalNameServers[i]);
            }
        }
        if (source.NameServers != null) {
            this.NameServers = new String[source.NameServers.length];
            for (int i = 0; i < source.NameServers.length; i++) {
                this.NameServers[i] = new String(source.NameServers[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Paused != null) {
            this.Paused = new Boolean(source.Paused);
        }
        if (source.CnameSpeedUp != null) {
            this.CnameSpeedUp = new String(source.CnameSpeedUp);
        }
        if (source.CnameStatus != null) {
            this.CnameStatus = new String(source.CnameStatus);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Resources != null) {
            this.Resources = new Resource[source.Resources.length];
            for (int i = 0; i < source.Resources.length; i++) {
                this.Resources[i] = new Resource(source.Resources[i]);
            }
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.ModifiedOn != null) {
            this.ModifiedOn = new String(source.ModifiedOn);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "OriginalNameServers.", this.OriginalNameServers);
        this.setParamArraySimple(map, prefix + "NameServers.", this.NameServers);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Paused", this.Paused);
        this.setParamSimple(map, prefix + "CnameSpeedUp", this.CnameSpeedUp);
        this.setParamSimple(map, prefix + "CnameStatus", this.CnameStatus);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArrayObj(map, prefix + "Resources.", this.Resources);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "ModifiedOn", this.ModifiedOn);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

