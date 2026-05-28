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

public class CosOption extends AbstractModel {

    /**
    * <p>文件系统本地挂载路径。</p>
    */
    @SerializedName("LocalPath")
    @Expose
    private String LocalPath;

    /**
    * <p>COS桶地址，可以在COS桶详情页查看。</p>
    */
    @SerializedName("RemotePath")
    @Expose
    private String RemotePath;

    /**
    * <p>cosfs2挂载工具支持的参数。</p>
    */
    @SerializedName("MountParamsOption")
    @Expose
    private String MountParamsOption;

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
     * Get <p>COS桶地址，可以在COS桶详情页查看。</p> 
     * @return RemotePath <p>COS桶地址，可以在COS桶详情页查看。</p>
     */
    public String getRemotePath() {
        return this.RemotePath;
    }

    /**
     * Set <p>COS桶地址，可以在COS桶详情页查看。</p>
     * @param RemotePath <p>COS桶地址，可以在COS桶详情页查看。</p>
     */
    public void setRemotePath(String RemotePath) {
        this.RemotePath = RemotePath;
    }

    /**
     * Get <p>cosfs2挂载工具支持的参数。</p> 
     * @return MountParamsOption <p>cosfs2挂载工具支持的参数。</p>
     */
    public String getMountParamsOption() {
        return this.MountParamsOption;
    }

    /**
     * Set <p>cosfs2挂载工具支持的参数。</p>
     * @param MountParamsOption <p>cosfs2挂载工具支持的参数。</p>
     */
    public void setMountParamsOption(String MountParamsOption) {
        this.MountParamsOption = MountParamsOption;
    }

    public CosOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosOption(CosOption source) {
        if (source.LocalPath != null) {
            this.LocalPath = new String(source.LocalPath);
        }
        if (source.RemotePath != null) {
            this.RemotePath = new String(source.RemotePath);
        }
        if (source.MountParamsOption != null) {
            this.MountParamsOption = new String(source.MountParamsOption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LocalPath", this.LocalPath);
        this.setParamSimple(map, prefix + "RemotePath", this.RemotePath);
        this.setParamSimple(map, prefix + "MountParamsOption", this.MountParamsOption);

    }
}

