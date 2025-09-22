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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SQLFolderNode extends AbstractModel {

    /**
    * 唯一标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 类型 folder，script
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 父文件夹path，/aaa/bbb/ccc
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentFolderPath")
    @Expose
    private String ParentFolderPath;

    /**
    * 是否叶子节点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsLeaf")
    @Expose
    private Boolean IsLeaf;

    /**
    * 业务参数	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Params")
    @Expose
    private String Params;

    /**
    * 权限范围: SHARED, PRIVATE
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessScope")
    @Expose
    private String AccessScope;

    /**
    * 节点路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 创建人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

    /**
    * 当前用户对节点拥有的权限	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodePermission")
    @Expose
    private String NodePermission;

    /**
    * 子节点列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Children")
    @Expose
    private SQLFolderNode [] Children;

    /**
    * 文件责任人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
     * Get 唯一标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 类型 folder，script
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 类型 folder，script
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型 folder，script
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 类型 folder，script
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 父文件夹path，/aaa/bbb/ccc
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentFolderPath 父文件夹path，/aaa/bbb/ccc
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParentFolderPath() {
        return this.ParentFolderPath;
    }

    /**
     * Set 父文件夹path，/aaa/bbb/ccc
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentFolderPath 父文件夹path，/aaa/bbb/ccc
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentFolderPath(String ParentFolderPath) {
        this.ParentFolderPath = ParentFolderPath;
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
     * Get 业务参数	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Params 业务参数	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParams() {
        return this.Params;
    }

    /**
     * Set 业务参数	
注意：此字段可能返回 null，表示取不到有效值。
     * @param Params 业务参数	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParams(String Params) {
        this.Params = Params;
    }

    /**
     * Get 权限范围: SHARED, PRIVATE
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessScope 权限范围: SHARED, PRIVATE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccessScope() {
        return this.AccessScope;
    }

    /**
     * Set 权限范围: SHARED, PRIVATE
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessScope 权限范围: SHARED, PRIVATE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessScope(String AccessScope) {
        this.AccessScope = AccessScope;
    }

    /**
     * Get 节点路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Path 节点路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 节点路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param Path 节点路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 创建人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateUserUin 创建人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateUserUin() {
        return this.CreateUserUin;
    }

    /**
     * Set 创建人
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateUserUin 创建人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateUserUin(String CreateUserUin) {
        this.CreateUserUin = CreateUserUin;
    }

    /**
     * Get 当前用户对节点拥有的权限	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodePermission 当前用户对节点拥有的权限	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodePermission() {
        return this.NodePermission;
    }

    /**
     * Set 当前用户对节点拥有的权限	
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodePermission 当前用户对节点拥有的权限	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodePermission(String NodePermission) {
        this.NodePermission = NodePermission;
    }

    /**
     * Get 子节点列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Children 子节点列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SQLFolderNode [] getChildren() {
        return this.Children;
    }

    /**
     * Set 子节点列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Children 子节点列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChildren(SQLFolderNode [] Children) {
        this.Children = Children;
    }

    /**
     * Get 文件责任人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerUin 文件责任人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 文件责任人
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerUin 文件责任人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    public SQLFolderNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SQLFolderNode(SQLFolderNode source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ParentFolderPath != null) {
            this.ParentFolderPath = new String(source.ParentFolderPath);
        }
        if (source.IsLeaf != null) {
            this.IsLeaf = new Boolean(source.IsLeaf);
        }
        if (source.Params != null) {
            this.Params = new String(source.Params);
        }
        if (source.AccessScope != null) {
            this.AccessScope = new String(source.AccessScope);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.CreateUserUin != null) {
            this.CreateUserUin = new String(source.CreateUserUin);
        }
        if (source.NodePermission != null) {
            this.NodePermission = new String(source.NodePermission);
        }
        if (source.Children != null) {
            this.Children = new SQLFolderNode[source.Children.length];
            for (int i = 0; i < source.Children.length; i++) {
                this.Children[i] = new SQLFolderNode(source.Children[i]);
            }
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ParentFolderPath", this.ParentFolderPath);
        this.setParamSimple(map, prefix + "IsLeaf", this.IsLeaf);
        this.setParamSimple(map, prefix + "Params", this.Params);
        this.setParamSimple(map, prefix + "AccessScope", this.AccessScope);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "CreateUserUin", this.CreateUserUin);
        this.setParamSimple(map, prefix + "NodePermission", this.NodePermission);
        this.setParamArrayObj(map, prefix + "Children.", this.Children);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);

    }
}

