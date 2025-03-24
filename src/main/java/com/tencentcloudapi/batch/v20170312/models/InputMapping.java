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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InputMapping extends AbstractModel {

    /**
    * 源端路径
    */
    @SerializedName("SourcePath")
    @Expose
    private String SourcePath;

    /**
    * 目的端路径
    */
    @SerializedName("DestinationPath")
    @Expose
    private String DestinationPath;

    /**
    * 挂载配置项参数
    */
    @SerializedName("MountOptionParameter")
    @Expose
    private String MountOptionParameter;

    /**
     * Get 源端路径 
     * @return SourcePath 源端路径
     */
    public String getSourcePath() {
        return this.SourcePath;
    }

    /**
     * Set 源端路径
     * @param SourcePath 源端路径
     */
    public void setSourcePath(String SourcePath) {
        this.SourcePath = SourcePath;
    }

    /**
     * Get 目的端路径 
     * @return DestinationPath 目的端路径
     */
    public String getDestinationPath() {
        return this.DestinationPath;
    }

    /**
     * Set 目的端路径
     * @param DestinationPath 目的端路径
     */
    public void setDestinationPath(String DestinationPath) {
        this.DestinationPath = DestinationPath;
    }

    /**
     * Get 挂载配置项参数 
     * @return MountOptionParameter 挂载配置项参数
     */
    public String getMountOptionParameter() {
        return this.MountOptionParameter;
    }

    /**
     * Set 挂载配置项参数
     * @param MountOptionParameter 挂载配置项参数
     */
    public void setMountOptionParameter(String MountOptionParameter) {
        this.MountOptionParameter = MountOptionParameter;
    }

    public InputMapping() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InputMapping(InputMapping source) {
        if (source.SourcePath != null) {
            this.SourcePath = new String(source.SourcePath);
        }
        if (source.DestinationPath != null) {
            this.DestinationPath = new String(source.DestinationPath);
        }
        if (source.MountOptionParameter != null) {
            this.MountOptionParameter = new String(source.MountOptionParameter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourcePath", this.SourcePath);
        this.setParamSimple(map, prefix + "DestinationPath", this.DestinationPath);
        this.setParamSimple(map, prefix + "MountOptionParameter", this.MountOptionParameter);

    }
}

