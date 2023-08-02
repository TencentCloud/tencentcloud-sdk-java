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

public class BatchDeleteClientNodesRequest extends AbstractModel{

    /**
    * 文件系统id
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * 删除的客户端节点列表
    */
    @SerializedName("ClientNodes")
    @Expose
    private LinuxNodeAttribute [] ClientNodes;

    /**
    * 是否单集群，默认是false
    */
    @SerializedName("SingleClusterFlag")
    @Expose
    private Boolean SingleClusterFlag;

    /**
     * Get 文件系统id 
     * @return FileSystemId 文件系统id
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set 文件系统id
     * @param FileSystemId 文件系统id
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get 删除的客户端节点列表 
     * @return ClientNodes 删除的客户端节点列表
     */
    public LinuxNodeAttribute [] getClientNodes() {
        return this.ClientNodes;
    }

    /**
     * Set 删除的客户端节点列表
     * @param ClientNodes 删除的客户端节点列表
     */
    public void setClientNodes(LinuxNodeAttribute [] ClientNodes) {
        this.ClientNodes = ClientNodes;
    }

    /**
     * Get 是否单集群，默认是false 
     * @return SingleClusterFlag 是否单集群，默认是false
     */
    public Boolean getSingleClusterFlag() {
        return this.SingleClusterFlag;
    }

    /**
     * Set 是否单集群，默认是false
     * @param SingleClusterFlag 是否单集群，默认是false
     */
    public void setSingleClusterFlag(Boolean SingleClusterFlag) {
        this.SingleClusterFlag = SingleClusterFlag;
    }

    public BatchDeleteClientNodesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchDeleteClientNodesRequest(BatchDeleteClientNodesRequest source) {
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.ClientNodes != null) {
            this.ClientNodes = new LinuxNodeAttribute[source.ClientNodes.length];
            for (int i = 0; i < source.ClientNodes.length; i++) {
                this.ClientNodes[i] = new LinuxNodeAttribute(source.ClientNodes[i]);
            }
        }
        if (source.SingleClusterFlag != null) {
            this.SingleClusterFlag = new Boolean(source.SingleClusterFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamArrayObj(map, prefix + "ClientNodes.", this.ClientNodes);
        this.setParamSimple(map, prefix + "SingleClusterFlag", this.SingleClusterFlag);

    }
}

