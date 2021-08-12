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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StorageMountConf extends AbstractModel{

    /**
    * 数据卷名
    */
    @SerializedName("VolumeName")
    @Expose
    private String VolumeName;

    /**
    * 数据卷绑定路径
    */
    @SerializedName("MountPath")
    @Expose
    private String MountPath;

    /**
     * Get 数据卷名 
     * @return VolumeName 数据卷名
     */
    public String getVolumeName() {
        return this.VolumeName;
    }

    /**
     * Set 数据卷名
     * @param VolumeName 数据卷名
     */
    public void setVolumeName(String VolumeName) {
        this.VolumeName = VolumeName;
    }

    /**
     * Get 数据卷绑定路径 
     * @return MountPath 数据卷绑定路径
     */
    public String getMountPath() {
        return this.MountPath;
    }

    /**
     * Set 数据卷绑定路径
     * @param MountPath 数据卷绑定路径
     */
    public void setMountPath(String MountPath) {
        this.MountPath = MountPath;
    }

    public StorageMountConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StorageMountConf(StorageMountConf source) {
        if (source.VolumeName != null) {
            this.VolumeName = new String(source.VolumeName);
        }
        if (source.MountPath != null) {
            this.MountPath = new String(source.MountPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VolumeName", this.VolumeName);
        this.setParamSimple(map, prefix + "MountPath", this.MountPath);

    }
}

