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

public class ConnectorResourceRef extends AbstractModel {

    /**
    * <p>连接器侧资源 ID</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>资源类型：1-空间（乐享知识库），2-文件夹，3-文档或文件，4-团队；0 无效。</p><table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>CONNECTOR_RESOURCE_TYPE_UNSPECIFIED</td><td>0</td><td>未指定，不允许用于资源引用</td></tr><tr><td>CONNECTOR_RESOURCE_TYPE_WORKSPACE</td><td>1</td><td>空间；乐享个人知识库和团队知识库均为此类型</td></tr><tr><td>CONNECTOR_RESOURCE_TYPE_FOLDER</td><td>2</td><td>文件夹</td></tr><tr><td>CONNECTOR_RESOURCE_TYPE_DOC</td><td>3</td><td>文档或文件</td></tr><tr><td>CONNECTOR_RESOURCE_TYPE_GROUP</td><td>4</td><td>团队或群组</td></tr></tbody></table>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>资源名称；请求中选填，不参与资源定位。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

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
     * Get <p>资源类型：1-空间（乐享知识库），2-文件夹，3-文档或文件，4-团队；0 无效。</p><table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>CONNECTOR_RESOURCE_TYPE_UNSPECIFIED</td><td>0</td><td>未指定，不允许用于资源引用</td></tr><tr><td>CONNECTOR_RESOURCE_TYPE_WORKSPACE</td><td>1</td><td>空间；乐享个人知识库和团队知识库均为此类型</td></tr><tr><td>CONNECTOR_RESOURCE_TYPE_FOLDER</td><td>2</td><td>文件夹</td></tr><tr><td>CONNECTOR_RESOURCE_TYPE_DOC</td><td>3</td><td>文档或文件</td></tr><tr><td>CONNECTOR_RESOURCE_TYPE_GROUP</td><td>4</td><td>团队或群组</td></tr></tbody></table> 
     * @return Type <p>资源类型：1-空间（乐享知识库），2-文件夹，3-文档或文件，4-团队；0 无效。</p><table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>CONNECTOR_RESOURCE_TYPE_UNSPECIFIED</td><td>0</td><td>未指定，不允许用于资源引用</td></tr><tr><td>CONNECTOR_RESOURCE_TYPE_WORKSPACE</td><td>1</td><td>空间；乐享个人知识库和团队知识库均为此类型</td></tr><tr><td>CONNECTOR_RESOURCE_TYPE_FOLDER</td><td>2</td><td>文件夹</td></tr><tr><td>CONNECTOR_RESOURCE_TYPE_DOC</td><td>3</td><td>文档或文件</td></tr><tr><td>CONNECTOR_RESOURCE_TYPE_GROUP</td><td>4</td><td>团队或群组</td></tr></tbody></table>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>资源类型：1-空间（乐享知识库），2-文件夹，3-文档或文件，4-团队；0 无效。</p><table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>CONNECTOR_RESOURCE_TYPE_UNSPECIFIED</td><td>0</td><td>未指定，不允许用于资源引用</td></tr><tr><td>CONNECTOR_RESOURCE_TYPE_WORKSPACE</td><td>1</td><td>空间；乐享个人知识库和团队知识库均为此类型</td></tr><tr><td>CONNECTOR_RESOURCE_TYPE_FOLDER</td><td>2</td><td>文件夹</td></tr><tr><td>CONNECTOR_RESOURCE_TYPE_DOC</td><td>3</td><td>文档或文件</td></tr><tr><td>CONNECTOR_RESOURCE_TYPE_GROUP</td><td>4</td><td>团队或群组</td></tr></tbody></table>
     * @param Type <p>资源类型：1-空间（乐享知识库），2-文件夹，3-文档或文件，4-团队；0 无效。</p><table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>CONNECTOR_RESOURCE_TYPE_UNSPECIFIED</td><td>0</td><td>未指定，不允许用于资源引用</td></tr><tr><td>CONNECTOR_RESOURCE_TYPE_WORKSPACE</td><td>1</td><td>空间；乐享个人知识库和团队知识库均为此类型</td></tr><tr><td>CONNECTOR_RESOURCE_TYPE_FOLDER</td><td>2</td><td>文件夹</td></tr><tr><td>CONNECTOR_RESOURCE_TYPE_DOC</td><td>3</td><td>文档或文件</td></tr><tr><td>CONNECTOR_RESOURCE_TYPE_GROUP</td><td>4</td><td>团队或群组</td></tr></tbody></table>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>资源名称；请求中选填，不参与资源定位。</p> 
     * @return Name <p>资源名称；请求中选填，不参与资源定位。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>资源名称；请求中选填，不参与资源定位。</p>
     * @param Name <p>资源名称；请求中选填，不参与资源定位。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public ConnectorResourceRef() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConnectorResourceRef(ConnectorResourceRef source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

