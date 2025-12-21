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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MountOption extends AbstractModel {

    /**
    * 指定沙箱工具中的存储配置名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 沙箱实例本地挂载路径（可选），默认继承工具中的存储配置
    */
    @SerializedName("MountPath")
    @Expose
    private String MountPath;

    /**
    * 沙箱实例存储挂载子路径（可选）
    */
    @SerializedName("SubPath")
    @Expose
    private String SubPath;

    /**
    * 沙箱实例存储挂载读写权限（可选），默认继承工具存储配置
    */
    @SerializedName("ReadOnly")
    @Expose
    private Boolean ReadOnly;

    /**
     * Get 指定沙箱工具中的存储配置名称 
     * @return Name 指定沙箱工具中的存储配置名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 指定沙箱工具中的存储配置名称
     * @param Name 指定沙箱工具中的存储配置名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 沙箱实例本地挂载路径（可选），默认继承工具中的存储配置 
     * @return MountPath 沙箱实例本地挂载路径（可选），默认继承工具中的存储配置
     */
    public String getMountPath() {
        return this.MountPath;
    }

    /**
     * Set 沙箱实例本地挂载路径（可选），默认继承工具中的存储配置
     * @param MountPath 沙箱实例本地挂载路径（可选），默认继承工具中的存储配置
     */
    public void setMountPath(String MountPath) {
        this.MountPath = MountPath;
    }

    /**
     * Get 沙箱实例存储挂载子路径（可选） 
     * @return SubPath 沙箱实例存储挂载子路径（可选）
     */
    public String getSubPath() {
        return this.SubPath;
    }

    /**
     * Set 沙箱实例存储挂载子路径（可选）
     * @param SubPath 沙箱实例存储挂载子路径（可选）
     */
    public void setSubPath(String SubPath) {
        this.SubPath = SubPath;
    }

    /**
     * Get 沙箱实例存储挂载读写权限（可选），默认继承工具存储配置 
     * @return ReadOnly 沙箱实例存储挂载读写权限（可选），默认继承工具存储配置
     */
    public Boolean getReadOnly() {
        return this.ReadOnly;
    }

    /**
     * Set 沙箱实例存储挂载读写权限（可选），默认继承工具存储配置
     * @param ReadOnly 沙箱实例存储挂载读写权限（可选），默认继承工具存储配置
     */
    public void setReadOnly(Boolean ReadOnly) {
        this.ReadOnly = ReadOnly;
    }

    public MountOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MountOption(MountOption source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.MountPath != null) {
            this.MountPath = new String(source.MountPath);
        }
        if (source.SubPath != null) {
            this.SubPath = new String(source.SubPath);
        }
        if (source.ReadOnly != null) {
            this.ReadOnly = new Boolean(source.ReadOnly);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "MountPath", this.MountPath);
        this.setParamSimple(map, prefix + "SubPath", this.SubPath);
        this.setParamSimple(map, prefix + "ReadOnly", this.ReadOnly);

    }
}

