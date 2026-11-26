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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConnectorResource extends AbstractModel {

    /**
    * <p>资源类型</p><p>枚举值：</p><ul><li>1： 空间（乐享知识库）</li><li>2： 文件夹</li><li>3： 文档或文件</li><li>4： 团队</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>连接器侧资源 ID</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>资源名称快照</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>祖先链快照，自顶向下且不含自身，最多 100 项；顶层资源为空。</p>
    */
    @SerializedName("AncestorList")
    @Expose
    private ConnectorResourceRef [] AncestorList;

    /**
     * Get <p>资源类型</p><p>枚举值：</p><ul><li>1： 空间（乐享知识库）</li><li>2： 文件夹</li><li>3： 文档或文件</li><li>4： 团队</li></ul> 
     * @return Type <p>资源类型</p><p>枚举值：</p><ul><li>1： 空间（乐享知识库）</li><li>2： 文件夹</li><li>3： 文档或文件</li><li>4： 团队</li></ul>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>资源类型</p><p>枚举值：</p><ul><li>1： 空间（乐享知识库）</li><li>2： 文件夹</li><li>3： 文档或文件</li><li>4： 团队</li></ul>
     * @param Type <p>资源类型</p><p>枚举值：</p><ul><li>1： 空间（乐享知识库）</li><li>2： 文件夹</li><li>3： 文档或文件</li><li>4： 团队</li></ul>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>连接器侧资源 ID</p> 
     * @return ResourceId <p>连接器侧资源 ID</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>连接器侧资源 ID</p>
     * @param ResourceId <p>连接器侧资源 ID</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>资源名称快照</p> 
     * @return Name <p>资源名称快照</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>资源名称快照</p>
     * @param Name <p>资源名称快照</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>祖先链快照，自顶向下且不含自身，最多 100 项；顶层资源为空。</p> 
     * @return AncestorList <p>祖先链快照，自顶向下且不含自身，最多 100 项；顶层资源为空。</p>
     */
    public ConnectorResourceRef [] getAncestorList() {
        return this.AncestorList;
    }

    /**
     * Set <p>祖先链快照，自顶向下且不含自身，最多 100 项；顶层资源为空。</p>
     * @param AncestorList <p>祖先链快照，自顶向下且不含自身，最多 100 项；顶层资源为空。</p>
     */
    public void setAncestorList(ConnectorResourceRef [] AncestorList) {
        this.AncestorList = AncestorList;
    }

    public ConnectorResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConnectorResource(ConnectorResource source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AncestorList != null) {
            this.AncestorList = new ConnectorResourceRef[source.AncestorList.length];
            for (int i = 0; i < source.AncestorList.length; i++) {
                this.AncestorList[i] = new ConnectorResourceRef(source.AncestorList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "AncestorList.", this.AncestorList);

    }
}

