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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileNode extends AbstractModel {

    /**
    * <p>当前节点</p>
    */
    @SerializedName("Node")
    @Expose
    private FileMeta Node;

    /**
    * <p>父节点</p>
    */
    @SerializedName("Parent")
    @Expose
    private FileMeta Parent;

    /**
    * <p>创建人</p>
    */
    @SerializedName("Creator")
    @Expose
    private UserInfo Creator;

    /**
    * <p>拥有者</p>
    */
    @SerializedName("Owner")
    @Expose
    private UserInfo Owner;

    /**
    * <p>节点类型</p>
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * <p>原始路径</p>
    */
    @SerializedName("OriginPath")
    @Expose
    private String OriginPath;

    /**
    * <p>回收时间</p>
    */
    @SerializedName("DeleteTime")
    @Expose
    private String DeleteTime;

    /**
    * <p>文件git配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GitConfig")
    @Expose
    private GitRepoConfig GitConfig;

    /**
     * Get <p>当前节点</p> 
     * @return Node <p>当前节点</p>
     */
    public FileMeta getNode() {
        return this.Node;
    }

    /**
     * Set <p>当前节点</p>
     * @param Node <p>当前节点</p>
     */
    public void setNode(FileMeta Node) {
        this.Node = Node;
    }

    /**
     * Get <p>父节点</p> 
     * @return Parent <p>父节点</p>
     */
    public FileMeta getParent() {
        return this.Parent;
    }

    /**
     * Set <p>父节点</p>
     * @param Parent <p>父节点</p>
     */
    public void setParent(FileMeta Parent) {
        this.Parent = Parent;
    }

    /**
     * Get <p>创建人</p> 
     * @return Creator <p>创建人</p>
     */
    public UserInfo getCreator() {
        return this.Creator;
    }

    /**
     * Set <p>创建人</p>
     * @param Creator <p>创建人</p>
     */
    public void setCreator(UserInfo Creator) {
        this.Creator = Creator;
    }

    /**
     * Get <p>拥有者</p> 
     * @return Owner <p>拥有者</p>
     */
    public UserInfo getOwner() {
        return this.Owner;
    }

    /**
     * Set <p>拥有者</p>
     * @param Owner <p>拥有者</p>
     */
    public void setOwner(UserInfo Owner) {
        this.Owner = Owner;
    }

    /**
     * Get <p>节点类型</p> 
     * @return NodeType <p>节点类型</p>
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set <p>节点类型</p>
     * @param NodeType <p>节点类型</p>
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get <p>原始路径</p> 
     * @return OriginPath <p>原始路径</p>
     */
    public String getOriginPath() {
        return this.OriginPath;
    }

    /**
     * Set <p>原始路径</p>
     * @param OriginPath <p>原始路径</p>
     */
    public void setOriginPath(String OriginPath) {
        this.OriginPath = OriginPath;
    }

    /**
     * Get <p>回收时间</p> 
     * @return DeleteTime <p>回收时间</p>
     */
    public String getDeleteTime() {
        return this.DeleteTime;
    }

    /**
     * Set <p>回收时间</p>
     * @param DeleteTime <p>回收时间</p>
     */
    public void setDeleteTime(String DeleteTime) {
        this.DeleteTime = DeleteTime;
    }

    /**
     * Get <p>文件git配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GitConfig <p>文件git配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GitRepoConfig getGitConfig() {
        return this.GitConfig;
    }

    /**
     * Set <p>文件git配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GitConfig <p>文件git配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGitConfig(GitRepoConfig GitConfig) {
        this.GitConfig = GitConfig;
    }

    public FileNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileNode(FileNode source) {
        if (source.Node != null) {
            this.Node = new FileMeta(source.Node);
        }
        if (source.Parent != null) {
            this.Parent = new FileMeta(source.Parent);
        }
        if (source.Creator != null) {
            this.Creator = new UserInfo(source.Creator);
        }
        if (source.Owner != null) {
            this.Owner = new UserInfo(source.Owner);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.OriginPath != null) {
            this.OriginPath = new String(source.OriginPath);
        }
        if (source.DeleteTime != null) {
            this.DeleteTime = new String(source.DeleteTime);
        }
        if (source.GitConfig != null) {
            this.GitConfig = new GitRepoConfig(source.GitConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Node.", this.Node);
        this.setParamObj(map, prefix + "Parent.", this.Parent);
        this.setParamObj(map, prefix + "Creator.", this.Creator);
        this.setParamObj(map, prefix + "Owner.", this.Owner);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "OriginPath", this.OriginPath);
        this.setParamSimple(map, prefix + "DeleteTime", this.DeleteTime);
        this.setParamObj(map, prefix + "GitConfig.", this.GitConfig);

    }
}

