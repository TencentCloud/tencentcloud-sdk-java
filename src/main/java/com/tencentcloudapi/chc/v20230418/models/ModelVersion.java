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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModelVersion extends AbstractModel {

    /**
    * 型号名称
    */
    @SerializedName("DevModel")
    @Expose
    private String DevModel;

    /**
    * 版本
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
     * Get 型号名称 
     * @return DevModel 型号名称
     */
    public String getDevModel() {
        return this.DevModel;
    }

    /**
     * Set 型号名称
     * @param DevModel 型号名称
     */
    public void setDevModel(String DevModel) {
        this.DevModel = DevModel;
    }

    /**
     * Get 版本 
     * @return Version 版本
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 版本
     * @param Version 版本
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    public ModelVersion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelVersion(ModelVersion source) {
        if (source.DevModel != null) {
            this.DevModel = new String(source.DevModel);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DevModel", this.DevModel);
        this.setParamSimple(map, prefix + "Version", this.Version);

    }
}

