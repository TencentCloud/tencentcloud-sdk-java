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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VersionInstance extends AbstractModel {

    /**
    * 版本名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 版本信息
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Remark
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 版本名称 
     * @return Name 版本名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 版本名称
     * @param Name 版本名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 版本信息 
     * @return Version 版本信息
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 版本信息
     * @param Version 版本信息
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Remark 
     * @return Remark Remark
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remark
     * @param Remark Remark
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public VersionInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VersionInstance(VersionInstance source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

