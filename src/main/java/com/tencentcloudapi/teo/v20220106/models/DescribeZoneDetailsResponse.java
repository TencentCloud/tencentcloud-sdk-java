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

public class DescribeZoneDetailsResponse extends AbstractModel{

    /**
    * 站点 ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 站点名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 用户当前使用的 NS 列表
    */
    @SerializedName("OriginalNameServers")
    @Expose
    private String [] OriginalNameServers;

    /**
    * 腾讯云分配给用户的 NS 列表
    */
    @SerializedName("NameServers")
    @Expose
    private String [] NameServers;

    /**
    * 站点状态
- active：NS 已切换
- pending：NS 未切换
- moved：NS 已切走
- deactivated：被封禁
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 站点接入方式
- full：NS 接入
- partial：CNAME 接入
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 站点是否关闭
    */
    @SerializedName("Paused")
    @Expose
    private Boolean Paused;

    /**
    * 是否开启 CNAME 加速
- enabled：开启
- disabled：关闭
    */
    @SerializedName("CnameSpeedUp")
    @Expose
    private String CnameSpeedUp;

    /**
    * cname切换验证状态
- finished 切换完成
- pending 切换验证中
    */
    @SerializedName("CnameStatus")
    @Expose
    private String CnameStatus;

    /**
    * 资源标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

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
    * 计费资源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Resources")
    @Expose
    private Resource [] Resources;

    /**
    * 站点修改时间
    */
    @SerializedName("ModifiedOn")
    @Expose
    private String ModifiedOn;

    /**
    * 站点创建时间
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * 用户自定义 NS 信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VanityNameServers")
    @Expose
    private VanityNameServers VanityNameServers;

    /**
    * 用户自定义 NS IP 信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VanityNameServersIps")
    @Expose
    private VanityNameServersIps [] VanityNameServersIps;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 站点 ID 
     * @return Id 站点 ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 站点 ID
     * @param Id 站点 ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 站点名称 
     * @return Name 站点名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 站点名称
     * @param Name 站点名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 用户当前使用的 NS 列表 
     * @return OriginalNameServers 用户当前使用的 NS 列表
     */
    public String [] getOriginalNameServers() {
        return this.OriginalNameServers;
    }

    /**
     * Set 用户当前使用的 NS 列表
     * @param OriginalNameServers 用户当前使用的 NS 列表
     */
    public void setOriginalNameServers(String [] OriginalNameServers) {
        this.OriginalNameServers = OriginalNameServers;
    }

    /**
     * Get 腾讯云分配给用户的 NS 列表 
     * @return NameServers 腾讯云分配给用户的 NS 列表
     */
    public String [] getNameServers() {
        return this.NameServers;
    }

    /**
     * Set 腾讯云分配给用户的 NS 列表
     * @param NameServers 腾讯云分配给用户的 NS 列表
     */
    public void setNameServers(String [] NameServers) {
        this.NameServers = NameServers;
    }

    /**
     * Get 站点状态
- active：NS 已切换
- pending：NS 未切换
- moved：NS 已切走
- deactivated：被封禁 
     * @return Status 站点状态
- active：NS 已切换
- pending：NS 未切换
- moved：NS 已切走
- deactivated：被封禁
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 站点状态
- active：NS 已切换
- pending：NS 未切换
- moved：NS 已切走
- deactivated：被封禁
     * @param Status 站点状态
- active：NS 已切换
- pending：NS 未切换
- moved：NS 已切走
- deactivated：被封禁
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 站点接入方式
- full：NS 接入
- partial：CNAME 接入 
     * @return Type 站点接入方式
- full：NS 接入
- partial：CNAME 接入
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 站点接入方式
- full：NS 接入
- partial：CNAME 接入
     * @param Type 站点接入方式
- full：NS 接入
- partial：CNAME 接入
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 站点是否关闭 
     * @return Paused 站点是否关闭
     */
    public Boolean getPaused() {
        return this.Paused;
    }

    /**
     * Set 站点是否关闭
     * @param Paused 站点是否关闭
     */
    public void setPaused(Boolean Paused) {
        this.Paused = Paused;
    }

    /**
     * Get 是否开启 CNAME 加速
- enabled：开启
- disabled：关闭 
     * @return CnameSpeedUp 是否开启 CNAME 加速
- enabled：开启
- disabled：关闭
     */
    public String getCnameSpeedUp() {
        return this.CnameSpeedUp;
    }

    /**
     * Set 是否开启 CNAME 加速
- enabled：开启
- disabled：关闭
     * @param CnameSpeedUp 是否开启 CNAME 加速
- enabled：开启
- disabled：关闭
     */
    public void setCnameSpeedUp(String CnameSpeedUp) {
        this.CnameSpeedUp = CnameSpeedUp;
    }

    /**
     * Get cname切换验证状态
- finished 切换完成
- pending 切换验证中 
     * @return CnameStatus cname切换验证状态
- finished 切换完成
- pending 切换验证中
     */
    public String getCnameStatus() {
        return this.CnameStatus;
    }

    /**
     * Set cname切换验证状态
- finished 切换完成
- pending 切换验证中
     * @param CnameStatus cname切换验证状态
- finished 切换完成
- pending 切换验证中
     */
    public void setCnameStatus(String CnameStatus) {
        this.CnameStatus = CnameStatus;
    }

    /**
     * Get 资源标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 资源标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 资源标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 资源标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
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

    /**
     * Get 计费资源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Resources 计费资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Resource [] getResources() {
        return this.Resources;
    }

    /**
     * Set 计费资源
注意：此字段可能返回 null，表示取不到有效值。
     * @param Resources 计费资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResources(Resource [] Resources) {
        this.Resources = Resources;
    }

    /**
     * Get 站点修改时间 
     * @return ModifiedOn 站点修改时间
     */
    public String getModifiedOn() {
        return this.ModifiedOn;
    }

    /**
     * Set 站点修改时间
     * @param ModifiedOn 站点修改时间
     */
    public void setModifiedOn(String ModifiedOn) {
        this.ModifiedOn = ModifiedOn;
    }

    /**
     * Get 站点创建时间 
     * @return CreatedOn 站点创建时间
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set 站点创建时间
     * @param CreatedOn 站点创建时间
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get 用户自定义 NS 信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VanityNameServers 用户自定义 NS 信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VanityNameServers getVanityNameServers() {
        return this.VanityNameServers;
    }

    /**
     * Set 用户自定义 NS 信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param VanityNameServers 用户自定义 NS 信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVanityNameServers(VanityNameServers VanityNameServers) {
        this.VanityNameServers = VanityNameServers;
    }

    /**
     * Get 用户自定义 NS IP 信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VanityNameServersIps 用户自定义 NS IP 信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VanityNameServersIps [] getVanityNameServersIps() {
        return this.VanityNameServersIps;
    }

    /**
     * Set 用户自定义 NS IP 信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param VanityNameServersIps 用户自定义 NS IP 信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVanityNameServersIps(VanityNameServersIps [] VanityNameServersIps) {
        this.VanityNameServersIps = VanityNameServersIps;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeZoneDetailsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeZoneDetailsResponse(DescribeZoneDetailsResponse source) {
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
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Resources != null) {
            this.Resources = new Resource[source.Resources.length];
            for (int i = 0; i < source.Resources.length; i++) {
                this.Resources[i] = new Resource(source.Resources[i]);
            }
        }
        if (source.ModifiedOn != null) {
            this.ModifiedOn = new String(source.ModifiedOn);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.VanityNameServers != null) {
            this.VanityNameServers = new VanityNameServers(source.VanityNameServers);
        }
        if (source.VanityNameServersIps != null) {
            this.VanityNameServersIps = new VanityNameServersIps[source.VanityNameServersIps.length];
            for (int i = 0; i < source.VanityNameServersIps.length; i++) {
                this.VanityNameServersIps[i] = new VanityNameServersIps(source.VanityNameServersIps[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
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
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamArrayObj(map, prefix + "Resources.", this.Resources);
        this.setParamSimple(map, prefix + "ModifiedOn", this.ModifiedOn);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamObj(map, prefix + "VanityNameServers.", this.VanityNameServers);
        this.setParamArrayObj(map, prefix + "VanityNameServersIps.", this.VanityNameServersIps);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

