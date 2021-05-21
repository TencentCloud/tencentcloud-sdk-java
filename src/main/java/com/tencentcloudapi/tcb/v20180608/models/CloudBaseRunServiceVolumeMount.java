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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudBaseRunServiceVolumeMount extends AbstractModel{

    /**
    * Volume 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 挂载路径
    */
    @SerializedName("MountPath")
    @Expose
    private String MountPath;

    /**
    * 是否只读
    */
    @SerializedName("ReadOnly")
    @Expose
    private Boolean ReadOnly;

    /**
    * 子路径
    */
    @SerializedName("SubPath")
    @Expose
    private String SubPath;

    /**
    * 传播挂载方式
    */
    @SerializedName("MountPropagation")
    @Expose
    private String MountPropagation;

    /**
     * Get Volume 名称 
     * @return Name Volume 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Volume 名称
     * @param Name Volume 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 挂载路径 
     * @return MountPath 挂载路径
     */
    public String getMountPath() {
        return this.MountPath;
    }

    /**
     * Set 挂载路径
     * @param MountPath 挂载路径
     */
    public void setMountPath(String MountPath) {
        this.MountPath = MountPath;
    }

    /**
     * Get 是否只读 
     * @return ReadOnly 是否只读
     */
    public Boolean getReadOnly() {
        return this.ReadOnly;
    }

    /**
     * Set 是否只读
     * @param ReadOnly 是否只读
     */
    public void setReadOnly(Boolean ReadOnly) {
        this.ReadOnly = ReadOnly;
    }

    /**
     * Get 子路径 
     * @return SubPath 子路径
     */
    public String getSubPath() {
        return this.SubPath;
    }

    /**
     * Set 子路径
     * @param SubPath 子路径
     */
    public void setSubPath(String SubPath) {
        this.SubPath = SubPath;
    }

    /**
     * Get 传播挂载方式 
     * @return MountPropagation 传播挂载方式
     */
    public String getMountPropagation() {
        return this.MountPropagation;
    }

    /**
     * Set 传播挂载方式
     * @param MountPropagation 传播挂载方式
     */
    public void setMountPropagation(String MountPropagation) {
        this.MountPropagation = MountPropagation;
    }

    public CloudBaseRunServiceVolumeMount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudBaseRunServiceVolumeMount(CloudBaseRunServiceVolumeMount source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.MountPath != null) {
            this.MountPath = new String(source.MountPath);
        }
        if (source.ReadOnly != null) {
            this.ReadOnly = new Boolean(source.ReadOnly);
        }
        if (source.SubPath != null) {
            this.SubPath = new String(source.SubPath);
        }
        if (source.MountPropagation != null) {
            this.MountPropagation = new String(source.MountPropagation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "MountPath", this.MountPath);
        this.setParamSimple(map, prefix + "ReadOnly", this.ReadOnly);
        this.setParamSimple(map, prefix + "SubPath", this.SubPath);
        this.setParamSimple(map, prefix + "MountPropagation", this.MountPropagation);

    }
}

