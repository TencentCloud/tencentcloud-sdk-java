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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileNode extends AbstractModel {

    /**
    * <p>文件/目录名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>节点类型：file 或 directory</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>文件大小（字节），目录为 null</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * <p>子节点列表（仅目录有效）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Children")
    @Expose
    private FileNode [] Children;

    /**
    * <p>文件最后修改时间（毫秒时间戳）</p><p>单位：ms</p>
    */
    @SerializedName("LastModifyTime")
    @Expose
    private Long LastModifyTime;

    /**
     * Get <p>文件/目录名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>文件/目录名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>文件/目录名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>文件/目录名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>节点类型：file 或 directory</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type <p>节点类型：file 或 directory</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>节点类型：file 或 directory</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type <p>节点类型：file 或 directory</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>文件大小（字节），目录为 null</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Size <p>文件大小（字节），目录为 null</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set <p>文件大小（字节），目录为 null</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Size <p>文件大小（字节），目录为 null</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get <p>子节点列表（仅目录有效）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Children <p>子节点列表（仅目录有效）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FileNode [] getChildren() {
        return this.Children;
    }

    /**
     * Set <p>子节点列表（仅目录有效）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Children <p>子节点列表（仅目录有效）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChildren(FileNode [] Children) {
        this.Children = Children;
    }

    /**
     * Get <p>文件最后修改时间（毫秒时间戳）</p><p>单位：ms</p> 
     * @return LastModifyTime <p>文件最后修改时间（毫秒时间戳）</p><p>单位：ms</p>
     */
    public Long getLastModifyTime() {
        return this.LastModifyTime;
    }

    /**
     * Set <p>文件最后修改时间（毫秒时间戳）</p><p>单位：ms</p>
     * @param LastModifyTime <p>文件最后修改时间（毫秒时间戳）</p><p>单位：ms</p>
     */
    public void setLastModifyTime(Long LastModifyTime) {
        this.LastModifyTime = LastModifyTime;
    }

    public FileNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileNode(FileNode source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Children != null) {
            this.Children = new FileNode[source.Children.length];
            for (int i = 0; i < source.Children.length; i++) {
                this.Children[i] = new FileNode(source.Children[i]);
            }
        }
        if (source.LastModifyTime != null) {
            this.LastModifyTime = new Long(source.LastModifyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamArrayObj(map, prefix + "Children.", this.Children);
        this.setParamSimple(map, prefix + "LastModifyTime", this.LastModifyTime);

    }
}

