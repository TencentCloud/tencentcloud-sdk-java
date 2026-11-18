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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAutoDeletePolicyRequest extends AbstractModel {

    /**
    * <p>文件系统 ID</p>
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * <p>自动清理策略名称</p>
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * <p>自动清理策略路径列表</p>
    */
    @SerializedName("Paths")
    @Expose
    private String [] Paths;

    /**
     * Get <p>文件系统 ID</p> 
     * @return FileSystemId <p>文件系统 ID</p>
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set <p>文件系统 ID</p>
     * @param FileSystemId <p>文件系统 ID</p>
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get <p>自动清理策略名称</p> 
     * @return PolicyName <p>自动清理策略名称</p>
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set <p>自动清理策略名称</p>
     * @param PolicyName <p>自动清理策略名称</p>
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get <p>自动清理策略路径列表</p> 
     * @return Paths <p>自动清理策略路径列表</p>
     */
    public String [] getPaths() {
        return this.Paths;
    }

    /**
     * Set <p>自动清理策略路径列表</p>
     * @param Paths <p>自动清理策略路径列表</p>
     */
    public void setPaths(String [] Paths) {
        this.Paths = Paths;
    }

    public CreateAutoDeletePolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAutoDeletePolicyRequest(CreateAutoDeletePolicyRequest source) {
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.Paths != null) {
            this.Paths = new String[source.Paths.length];
            for (int i = 0; i < source.Paths.length; i++) {
                this.Paths[i] = new String(source.Paths[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamArraySimple(map, prefix + "Paths.", this.Paths);

    }
}

