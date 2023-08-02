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

public class FSAttribute extends AbstractModel{

    /**
    * 文件系统类型, 可填goosefs和goosefsx
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 文件系统ID
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * GooseFSx文件系统属性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GooseFSxAttribute")
    @Expose
    private GooseFSxAttribute GooseFSxAttribute;

    /**
    * 文件系统状态 ACTIVE(运行中), CREATING(创建中), DESTROYING(销毁中), FAIL(创建失败),EXPANDING(扩容中),PROBING(容灾中)
    */
    @SerializedName("Status")
    @Expose
    private String Status;

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
    * vpc ID
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
    * Tag数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tag")
    @Expose
    private Tag [] Tag;

    /**
    * 更新属性时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

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
     * Get 文件系统ID 
     * @return FileSystemId 文件系统ID
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set 文件系统ID
     * @param FileSystemId 文件系统ID
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get GooseFSx文件系统属性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GooseFSxAttribute GooseFSx文件系统属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GooseFSxAttribute getGooseFSxAttribute() {
        return this.GooseFSxAttribute;
    }

    /**
     * Set GooseFSx文件系统属性
注意：此字段可能返回 null，表示取不到有效值。
     * @param GooseFSxAttribute GooseFSx文件系统属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGooseFSxAttribute(GooseFSxAttribute GooseFSxAttribute) {
        this.GooseFSxAttribute = GooseFSxAttribute;
    }

    /**
     * Get 文件系统状态 ACTIVE(运行中), CREATING(创建中), DESTROYING(销毁中), FAIL(创建失败),EXPANDING(扩容中),PROBING(容灾中) 
     * @return Status 文件系统状态 ACTIVE(运行中), CREATING(创建中), DESTROYING(销毁中), FAIL(创建失败),EXPANDING(扩容中),PROBING(容灾中)
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 文件系统状态 ACTIVE(运行中), CREATING(创建中), DESTROYING(销毁中), FAIL(创建失败),EXPANDING(扩容中),PROBING(容灾中)
     * @param Status 文件系统状态 ACTIVE(运行中), CREATING(创建中), DESTROYING(销毁中), FAIL(创建失败),EXPANDING(扩容中),PROBING(容灾中)
     */
    public void setStatus(String Status) {
        this.Status = Status;
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
     * Get vpc ID 
     * @return VpcId vpc ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc ID
     * @param VpcId vpc ID
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
     * Get Tag数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tag Tag数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTag() {
        return this.Tag;
    }

    /**
     * Set Tag数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tag Tag数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTag(Tag [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 更新属性时间 
     * @return ModifyTime 更新属性时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 更新属性时间
     * @param ModifyTime 更新属性时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    public FSAttribute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FSAttribute(FSAttribute source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.GooseFSxAttribute != null) {
            this.GooseFSxAttribute = new GooseFSxAttribute(source.GooseFSxAttribute);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
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
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamObj(map, prefix + "GooseFSxAttribute.", this.GooseFSxAttribute);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

