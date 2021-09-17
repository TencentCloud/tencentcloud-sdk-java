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

public class CbsVolume extends AbstractModel{

    /**
    * cbs volume 数据卷名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 腾讯云cbs盘Id
    */
    @SerializedName("CbsDiskId")
    @Expose
    private String CbsDiskId;

    /**
     * Get cbs volume 数据卷名称 
     * @return Name cbs volume 数据卷名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set cbs volume 数据卷名称
     * @param Name cbs volume 数据卷名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 腾讯云cbs盘Id 
     * @return CbsDiskId 腾讯云cbs盘Id
     */
    public String getCbsDiskId() {
        return this.CbsDiskId;
    }

    /**
     * Set 腾讯云cbs盘Id
     * @param CbsDiskId 腾讯云cbs盘Id
     */
    public void setCbsDiskId(String CbsDiskId) {
        this.CbsDiskId = CbsDiskId;
    }

    public CbsVolume() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CbsVolume(CbsVolume source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CbsDiskId != null) {
            this.CbsDiskId = new String(source.CbsDiskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CbsDiskId", this.CbsDiskId);

    }
}

