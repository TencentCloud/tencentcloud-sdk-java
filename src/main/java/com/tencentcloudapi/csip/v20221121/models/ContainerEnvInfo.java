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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContainerEnvInfo extends AbstractModel {

    /**
    * <p>节点类型</p>
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * <p>docker版本</p>
    */
    @SerializedName("DockerVersion")
    @Expose
    private String DockerVersion;

    /**
    * <p>containerd版本</p>
    */
    @SerializedName("ContainerdVersion")
    @Expose
    private String ContainerdVersion;

    /**
    * <p>文件系统类型</p>
    */
    @SerializedName("FileSystemType")
    @Expose
    private String FileSystemType;

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
     * Get <p>docker版本</p> 
     * @return DockerVersion <p>docker版本</p>
     */
    public String getDockerVersion() {
        return this.DockerVersion;
    }

    /**
     * Set <p>docker版本</p>
     * @param DockerVersion <p>docker版本</p>
     */
    public void setDockerVersion(String DockerVersion) {
        this.DockerVersion = DockerVersion;
    }

    /**
     * Get <p>containerd版本</p> 
     * @return ContainerdVersion <p>containerd版本</p>
     */
    public String getContainerdVersion() {
        return this.ContainerdVersion;
    }

    /**
     * Set <p>containerd版本</p>
     * @param ContainerdVersion <p>containerd版本</p>
     */
    public void setContainerdVersion(String ContainerdVersion) {
        this.ContainerdVersion = ContainerdVersion;
    }

    /**
     * Get <p>文件系统类型</p> 
     * @return FileSystemType <p>文件系统类型</p>
     */
    public String getFileSystemType() {
        return this.FileSystemType;
    }

    /**
     * Set <p>文件系统类型</p>
     * @param FileSystemType <p>文件系统类型</p>
     */
    public void setFileSystemType(String FileSystemType) {
        this.FileSystemType = FileSystemType;
    }

    public ContainerEnvInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContainerEnvInfo(ContainerEnvInfo source) {
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.DockerVersion != null) {
            this.DockerVersion = new String(source.DockerVersion);
        }
        if (source.ContainerdVersion != null) {
            this.ContainerdVersion = new String(source.ContainerdVersion);
        }
        if (source.FileSystemType != null) {
            this.FileSystemType = new String(source.FileSystemType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "DockerVersion", this.DockerVersion);
        this.setParamSimple(map, prefix + "ContainerdVersion", this.ContainerdVersion);
        this.setParamSimple(map, prefix + "FileSystemType", this.FileSystemType);

    }
}

