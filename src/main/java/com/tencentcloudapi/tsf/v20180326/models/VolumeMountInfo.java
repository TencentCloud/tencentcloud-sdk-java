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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VolumeMountInfo extends AbstractModel{

    /**
    * 挂载数据卷名称
    */
    @SerializedName("VolumeMountName")
    @Expose
    private String VolumeMountName;

    /**
    * 挂载路径
    */
    @SerializedName("VolumeMountPath")
    @Expose
    private String VolumeMountPath;

    /**
    * 挂载子路径
    */
    @SerializedName("VolumeMountSubPath")
    @Expose
    private String VolumeMountSubPath;

    /**
    * 读写，1：读 2：读写
    */
    @SerializedName("ReadOrWrite")
    @Expose
    private String ReadOrWrite;

    /**
     * Get 挂载数据卷名称 
     * @return VolumeMountName 挂载数据卷名称
     */
    public String getVolumeMountName() {
        return this.VolumeMountName;
    }

    /**
     * Set 挂载数据卷名称
     * @param VolumeMountName 挂载数据卷名称
     */
    public void setVolumeMountName(String VolumeMountName) {
        this.VolumeMountName = VolumeMountName;
    }

    /**
     * Get 挂载路径 
     * @return VolumeMountPath 挂载路径
     */
    public String getVolumeMountPath() {
        return this.VolumeMountPath;
    }

    /**
     * Set 挂载路径
     * @param VolumeMountPath 挂载路径
     */
    public void setVolumeMountPath(String VolumeMountPath) {
        this.VolumeMountPath = VolumeMountPath;
    }

    /**
     * Get 挂载子路径 
     * @return VolumeMountSubPath 挂载子路径
     */
    public String getVolumeMountSubPath() {
        return this.VolumeMountSubPath;
    }

    /**
     * Set 挂载子路径
     * @param VolumeMountSubPath 挂载子路径
     */
    public void setVolumeMountSubPath(String VolumeMountSubPath) {
        this.VolumeMountSubPath = VolumeMountSubPath;
    }

    /**
     * Get 读写，1：读 2：读写 
     * @return ReadOrWrite 读写，1：读 2：读写
     */
    public String getReadOrWrite() {
        return this.ReadOrWrite;
    }

    /**
     * Set 读写，1：读 2：读写
     * @param ReadOrWrite 读写，1：读 2：读写
     */
    public void setReadOrWrite(String ReadOrWrite) {
        this.ReadOrWrite = ReadOrWrite;
    }

    public VolumeMountInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VolumeMountInfo(VolumeMountInfo source) {
        if (source.VolumeMountName != null) {
            this.VolumeMountName = new String(source.VolumeMountName);
        }
        if (source.VolumeMountPath != null) {
            this.VolumeMountPath = new String(source.VolumeMountPath);
        }
        if (source.VolumeMountSubPath != null) {
            this.VolumeMountSubPath = new String(source.VolumeMountSubPath);
        }
        if (source.ReadOrWrite != null) {
            this.ReadOrWrite = new String(source.ReadOrWrite);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VolumeMountName", this.VolumeMountName);
        this.setParamSimple(map, prefix + "VolumeMountPath", this.VolumeMountPath);
        this.setParamSimple(map, prefix + "VolumeMountSubPath", this.VolumeMountSubPath);
        this.setParamSimple(map, prefix + "ReadOrWrite", this.ReadOrWrite);

    }
}

