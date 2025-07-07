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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckMigrateResult extends AbstractModel {

    /**
    * 校验名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 校验结果，通过为pass，失败为fail
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 校验结果描述
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
     * Get 校验名称 
     * @return Name 校验名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 校验名称
     * @param Name 校验名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 校验结果，通过为pass，失败为fail 
     * @return Status 校验结果，通过为pass，失败为fail
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 校验结果，通过为pass，失败为fail
     * @param Status 校验结果，通过为pass，失败为fail
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 校验结果描述 
     * @return Desc 校验结果描述
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 校验结果描述
     * @param Desc 校验结果描述
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public CheckMigrateResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckMigrateResult(CheckMigrateResult source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Desc", this.Desc);

    }
}

