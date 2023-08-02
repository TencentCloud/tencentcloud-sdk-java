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
package com.tencentcloudapi.goosefs.v20220519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateFileSystemRequest extends AbstractModel{

    /**
    * 文件系统类型, 可填goosefs和goosefsx
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 文件系统名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 文件系统备注描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * vpc网络ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 子网所在的可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 文件系统关联的tag
    */
    @SerializedName("Tag")
    @Expose
    private Tag [] Tag;

    /**
    * GooseFSx构建时要传递的参数
    */
    @SerializedName("GooseFSxBuildElements")
    @Expose
    private GooseFSxBuildElement GooseFSxBuildElements;

    /**
     * Get 文件系统类型, 可填goosefs和goosefsx 
     * @return Type 文件系统类型, 可填goosefs和goosefsx
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 文件系统类型, 可填goosefs和goosefsx
     * @param Type 文件系统类型, 可填goosefs和goosefsx
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 文件系统名 
     * @return Name 文件系统名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 文件系统名
     * @param Name 文件系统名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 文件系统备注描述 
     * @return Description 文件系统备注描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 文件系统备注描述
     * @param Description 文件系统备注描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get vpc网络ID 
     * @return VpcId vpc网络ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc网络ID
     * @param VpcId vpc网络ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网ID 
     * @return SubnetId 子网ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID
     * @param SubnetId 子网ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 子网所在的可用区 
     * @return Zone 子网所在的可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 子网所在的可用区
     * @param Zone 子网所在的可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 文件系统关联的tag 
     * @return Tag 文件系统关联的tag
     */
    public Tag [] getTag() {
        return this.Tag;
    }

    /**
     * Set 文件系统关联的tag
     * @param Tag 文件系统关联的tag
     */
    public void setTag(Tag [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get GooseFSx构建时要传递的参数 
     * @return GooseFSxBuildElements GooseFSx构建时要传递的参数
     */
    public GooseFSxBuildElement getGooseFSxBuildElements() {
        return this.GooseFSxBuildElements;
    }

    /**
     * Set GooseFSx构建时要传递的参数
     * @param GooseFSxBuildElements GooseFSx构建时要传递的参数
     */
    public void setGooseFSxBuildElements(GooseFSxBuildElement GooseFSxBuildElements) {
        this.GooseFSxBuildElements = GooseFSxBuildElements;
    }

    public CreateFileSystemRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFileSystemRequest(CreateFileSystemRequest source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Tag != null) {
            this.Tag = new Tag[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new Tag(source.Tag[i]);
            }
        }
        if (source.GooseFSxBuildElements != null) {
            this.GooseFSxBuildElements = new GooseFSxBuildElement(source.GooseFSxBuildElements);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);
        this.setParamObj(map, prefix + "GooseFSxBuildElements.", this.GooseFSxBuildElements);

    }
}

