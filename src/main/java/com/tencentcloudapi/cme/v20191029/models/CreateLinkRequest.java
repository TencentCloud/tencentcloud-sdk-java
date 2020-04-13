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

public class CreateLinkRequest extends AbstractModel{

    /**
    * 平台名称，指定访问的平台。
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 链接类型，取值有:
<li>CLASS: 分类链接；</li>
<li> MATERIAL：素材链接。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 链接名称，不能超过30个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 链接归属实体。
    */
    @SerializedName("Owner")
    @Expose
    private Entity Owner;

    /**
    * 目标资源Id。取值：
<li>当 Type 为 MATERIAL 时填素材 ID；</li>
<li>当 Type 为 CLASS 时填写分类路径。</li>
    */
    @SerializedName("DestinationId")
    @Expose
    private String DestinationId;

    /**
    * 目标资源归属者。
    */
    @SerializedName("DestinationOwner")
    @Expose
    private Entity DestinationOwner;

    /**
    * 链接的分类路径，如填"/a/b"则代表链接属于该分类路径，不填则默认为根路径。
    */
    @SerializedName("ClassPath")
    @Expose
    private String ClassPath;

    /**
    * 链接标签，单个标签长度不能超过10，数组长度不能超过10。
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * 操作者。填写用户的 Id，用于标识调用者及校验操作权限。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

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
     * Get 链接类型，取值有:
<li>CLASS: 分类链接；</li>
<li> MATERIAL：素材链接。</li> 
     * @return Type 链接类型，取值有:
<li>CLASS: 分类链接；</li>
<li> MATERIAL：素材链接。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 链接类型，取值有:
<li>CLASS: 分类链接；</li>
<li> MATERIAL：素材链接。</li>
     * @param Type 链接类型，取值有:
<li>CLASS: 分类链接；</li>
<li> MATERIAL：素材链接。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 链接名称，不能超过30个字符。 
     * @return Name 链接名称，不能超过30个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 链接名称，不能超过30个字符。
     * @param Name 链接名称，不能超过30个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 链接归属实体。 
     * @return Owner 链接归属实体。
     */
    public Entity getOwner() {
        return this.Owner;
    }

    /**
     * Set 链接归属实体。
     * @param Owner 链接归属实体。
     */
    public void setOwner(Entity Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 目标资源Id。取值：
<li>当 Type 为 MATERIAL 时填素材 ID；</li>
<li>当 Type 为 CLASS 时填写分类路径。</li> 
     * @return DestinationId 目标资源Id。取值：
<li>当 Type 为 MATERIAL 时填素材 ID；</li>
<li>当 Type 为 CLASS 时填写分类路径。</li>
     */
    public String getDestinationId() {
        return this.DestinationId;
    }

    /**
     * Set 目标资源Id。取值：
<li>当 Type 为 MATERIAL 时填素材 ID；</li>
<li>当 Type 为 CLASS 时填写分类路径。</li>
     * @param DestinationId 目标资源Id。取值：
<li>当 Type 为 MATERIAL 时填素材 ID；</li>
<li>当 Type 为 CLASS 时填写分类路径。</li>
     */
    public void setDestinationId(String DestinationId) {
        this.DestinationId = DestinationId;
    }

    /**
     * Get 目标资源归属者。 
     * @return DestinationOwner 目标资源归属者。
     */
    public Entity getDestinationOwner() {
        return this.DestinationOwner;
    }

    /**
     * Set 目标资源归属者。
     * @param DestinationOwner 目标资源归属者。
     */
    public void setDestinationOwner(Entity DestinationOwner) {
        this.DestinationOwner = DestinationOwner;
    }

    /**
     * Get 链接的分类路径，如填"/a/b"则代表链接属于该分类路径，不填则默认为根路径。 
     * @return ClassPath 链接的分类路径，如填"/a/b"则代表链接属于该分类路径，不填则默认为根路径。
     */
    public String getClassPath() {
        return this.ClassPath;
    }

    /**
     * Set 链接的分类路径，如填"/a/b"则代表链接属于该分类路径，不填则默认为根路径。
     * @param ClassPath 链接的分类路径，如填"/a/b"则代表链接属于该分类路径，不填则默认为根路径。
     */
    public void setClassPath(String ClassPath) {
        this.ClassPath = ClassPath;
    }

    /**
     * Get 链接标签，单个标签长度不能超过10，数组长度不能超过10。 
     * @return Tags 链接标签，单个标签长度不能超过10，数组长度不能超过10。
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 链接标签，单个标签长度不能超过10，数组长度不能超过10。
     * @param Tags 链接标签，单个标签长度不能超过10，数组长度不能超过10。
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 操作者。填写用户的 Id，用于标识调用者及校验操作权限。 
     * @return Operator 操作者。填写用户的 Id，用于标识调用者及校验操作权限。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者。填写用户的 Id，用于标识调用者及校验操作权限。
     * @param Operator 操作者。填写用户的 Id，用于标识调用者及校验操作权限。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "Owner.", this.Owner);
        this.setParamSimple(map, prefix + "DestinationId", this.DestinationId);
        this.setParamObj(map, prefix + "DestinationOwner.", this.DestinationOwner);
        this.setParamSimple(map, prefix + "ClassPath", this.ClassPath);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

