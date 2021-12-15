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
package com.tencentcloudapi.thpc.v20211109.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GooseFSOption extends AbstractModel{

    /**
    * 文件系统本地挂载路径
    */
    @SerializedName("LocalPath")
    @Expose
    private String LocalPath;

    /**
    * 文件系统远程挂载路径
    */
    @SerializedName("RemotePath")
    @Expose
    private String RemotePath;

    /**
    * 文件系统master的ip和端口
    */
    @SerializedName("Masters")
    @Expose
    private String [] Masters;

    /**
     * Get 文件系统本地挂载路径 
     * @return LocalPath 文件系统本地挂载路径
     */
    public String getLocalPath() {
        return this.LocalPath;
    }

    /**
     * Set 文件系统本地挂载路径
     * @param LocalPath 文件系统本地挂载路径
     */
    public void setLocalPath(String LocalPath) {
        this.LocalPath = LocalPath;
    }

    /**
     * Get 文件系统远程挂载路径 
     * @return RemotePath 文件系统远程挂载路径
     */
    public String getRemotePath() {
        return this.RemotePath;
    }

    /**
     * Set 文件系统远程挂载路径
     * @param RemotePath 文件系统远程挂载路径
     */
    public void setRemotePath(String RemotePath) {
        this.RemotePath = RemotePath;
    }

    /**
     * Get 文件系统master的ip和端口 
     * @return Masters 文件系统master的ip和端口
     */
    public String [] getMasters() {
        return this.Masters;
    }

    /**
     * Set 文件系统master的ip和端口
     * @param Masters 文件系统master的ip和端口
     */
    public void setMasters(String [] Masters) {
        this.Masters = Masters;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LocalPath", this.LocalPath);
        this.setParamSimple(map, prefix + "RemotePath", this.RemotePath);
        this.setParamArraySimple(map, prefix + "Masters.", this.Masters);

    }
}

