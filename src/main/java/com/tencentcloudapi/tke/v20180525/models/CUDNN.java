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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CUDNN extends AbstractModel{

    /**
    * cuDNN的版本
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * cuDNN的名字
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * cuDNN的Doc名字
    */
    @SerializedName("DocName")
    @Expose
    private String DocName;

    /**
    * cuDNN的Dev名字
    */
    @SerializedName("DevName")
    @Expose
    private String DevName;

    /**
     * Get cuDNN的版本 
     * @return Version cuDNN的版本
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set cuDNN的版本
     * @param Version cuDNN的版本
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get cuDNN的名字 
     * @return Name cuDNN的名字
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set cuDNN的名字
     * @param Name cuDNN的名字
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get cuDNN的Doc名字 
     * @return DocName cuDNN的Doc名字
     */
    public String getDocName() {
        return this.DocName;
    }

    /**
     * Set cuDNN的Doc名字
     * @param DocName cuDNN的Doc名字
     */
    public void setDocName(String DocName) {
        this.DocName = DocName;
    }

    /**
     * Get cuDNN的Dev名字 
     * @return DevName cuDNN的Dev名字
     */
    public String getDevName() {
        return this.DevName;
    }

    /**
     * Set cuDNN的Dev名字
     * @param DevName cuDNN的Dev名字
     */
    public void setDevName(String DevName) {
        this.DevName = DevName;
    }

    public CUDNN() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CUDNN(CUDNN source) {
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DocName != null) {
            this.DocName = new String(source.DocName);
        }
        if (source.DevName != null) {
            this.DevName = new String(source.DevName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DocName", this.DocName);
        this.setParamSimple(map, prefix + "DevName", this.DevName);

    }
}

