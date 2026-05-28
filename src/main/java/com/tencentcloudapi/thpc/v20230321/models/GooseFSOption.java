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
package com.tencentcloudapi.thpc.v20230321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GooseFSOption extends AbstractModel {

    /**
    * <p>文件系统本地挂载路径。</p>
    */
    @SerializedName("LocalPath")
    @Expose
    private String LocalPath;

    /**
    * <p>文件系统远程挂载路径。</p>
    */
    @SerializedName("RemotePath")
    @Expose
    private String RemotePath;

    /**
    * <p>文件系统master的ip和端口，此参数和FileSystemId互斥。</p>
    */
    @SerializedName("Masters")
    @Expose
    private String [] Masters;

    /**
    * <p>GooseFS的文件ID；此参数和Masters 互斥。</p>
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
     * Get <p>文件系统本地挂载路径。</p> 
     * @return LocalPath <p>文件系统本地挂载路径。</p>
     */
    public String getLocalPath() {
        return this.LocalPath;
    }

    /**
     * Set <p>文件系统本地挂载路径。</p>
     * @param LocalPath <p>文件系统本地挂载路径。</p>
     */
    public void setLocalPath(String LocalPath) {
        this.LocalPath = LocalPath;
    }

    /**
     * Get <p>文件系统远程挂载路径。</p> 
     * @return RemotePath <p>文件系统远程挂载路径。</p>
     */
    public String getRemotePath() {
        return this.RemotePath;
    }

    /**
     * Set <p>文件系统远程挂载路径。</p>
     * @param RemotePath <p>文件系统远程挂载路径。</p>
     */
    public void setRemotePath(String RemotePath) {
        this.RemotePath = RemotePath;
    }

    /**
     * Get <p>文件系统master的ip和端口，此参数和FileSystemId互斥。</p> 
     * @return Masters <p>文件系统master的ip和端口，此参数和FileSystemId互斥。</p>
     */
    public String [] getMasters() {
        return this.Masters;
    }

    /**
     * Set <p>文件系统master的ip和端口，此参数和FileSystemId互斥。</p>
     * @param Masters <p>文件系统master的ip和端口，此参数和FileSystemId互斥。</p>
     */
    public void setMasters(String [] Masters) {
        this.Masters = Masters;
    }

    /**
     * Get <p>GooseFS的文件ID；此参数和Masters 互斥。</p> 
     * @return FileSystemId <p>GooseFS的文件ID；此参数和Masters 互斥。</p>
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set <p>GooseFS的文件ID；此参数和Masters 互斥。</p>
     * @param FileSystemId <p>GooseFS的文件ID；此参数和Masters 互斥。</p>
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    public GooseFSOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GooseFSOption(GooseFSOption source) {
        if (source.LocalPath != null) {
            this.LocalPath = new String(source.LocalPath);
        }
        if (source.RemotePath != null) {
            this.RemotePath = new String(source.RemotePath);
        }
        if (source.Masters != null) {
            this.Masters = new String[source.Masters.length];
            for (int i = 0; i < source.Masters.length; i++) {
                this.Masters[i] = new String(source.Masters[i]);
            }
        }
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LocalPath", this.LocalPath);
        this.setParamSimple(map, prefix + "RemotePath", this.RemotePath);
        this.setParamArraySimple(map, prefix + "Masters.", this.Masters);
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);

    }
}

