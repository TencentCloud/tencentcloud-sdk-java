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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DsKettleServerFolderTreeNodeDto extends AbstractModel {

    /**
    * 节点编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 带后缀名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 类型  file 或者 folder
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 是否叶子节点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsLeaf")
    @Expose
    private Boolean IsLeaf;

    /**
    * 路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 子节点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Children")
    @Expose
    private DsKettleServerFolderTreeNodeDto [] Children;

    /**
    * 执行命令
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecuteCommand")
    @Expose
    private String ExecuteCommand;

    /**
     * Get 节点编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 节点编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 节点编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 节点编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Title 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Title 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 带后缀名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 带后缀名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 带后缀名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 带后缀名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 类型  file 或者 folder
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 类型  file 或者 folder
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型  file 或者 folder
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 类型  file 或者 folder
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 是否叶子节点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsLeaf 是否叶子节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsLeaf() {
        return this.IsLeaf;
    }

    /**
     * Set 是否叶子节点
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsLeaf 是否叶子节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsLeaf(Boolean IsLeaf) {
        this.IsLeaf = IsLeaf;
    }

    /**
     * Get 路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Path 路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param Path 路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 子节点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Children 子节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DsKettleServerFolderTreeNodeDto [] getChildren() {
        return this.Children;
    }

    /**
     * Set 子节点
注意：此字段可能返回 null，表示取不到有效值。
     * @param Children 子节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChildren(DsKettleServerFolderTreeNodeDto [] Children) {
        this.Children = Children;
    }

    /**
     * Get 执行命令
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecuteCommand 执行命令
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecuteCommand() {
        return this.ExecuteCommand;
    }

    /**
     * Set 执行命令
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecuteCommand 执行命令
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecuteCommand(String ExecuteCommand) {
        this.ExecuteCommand = ExecuteCommand;
    }

    public DsKettleServerFolderTreeNodeDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DsKettleServerFolderTreeNodeDto(DsKettleServerFolderTreeNodeDto source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.IsLeaf != null) {
            this.IsLeaf = new Boolean(source.IsLeaf);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Children != null) {
            this.Children = new DsKettleServerFolderTreeNodeDto[source.Children.length];
            for (int i = 0; i < source.Children.length; i++) {
                this.Children[i] = new DsKettleServerFolderTreeNodeDto(source.Children[i]);
            }
        }
        if (source.ExecuteCommand != null) {
            this.ExecuteCommand = new String(source.ExecuteCommand);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "IsLeaf", this.IsLeaf);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamArrayObj(map, prefix + "Children.", this.Children);
        this.setParamSimple(map, prefix + "ExecuteCommand", this.ExecuteCommand);

    }
}

