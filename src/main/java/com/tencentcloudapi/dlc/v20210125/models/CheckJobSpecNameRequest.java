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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckJobSpecNameRequest extends AbstractModel {

    /**
    * <p>训练作业配置名</p>
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * <p>排除的配置 ID（编辑场景排除自己；创建场景不传）</p>
    */
    @SerializedName("SpecId")
    @Expose
    private String SpecId;

    /**
     * Get <p>训练作业配置名</p> 
     * @return SpecName <p>训练作业配置名</p>
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set <p>训练作业配置名</p>
     * @param SpecName <p>训练作业配置名</p>
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get <p>排除的配置 ID（编辑场景排除自己；创建场景不传）</p> 
     * @return SpecId <p>排除的配置 ID（编辑场景排除自己；创建场景不传）</p>
     */
    public String getSpecId() {
        return this.SpecId;
    }

    /**
     * Set <p>排除的配置 ID（编辑场景排除自己；创建场景不传）</p>
     * @param SpecId <p>排除的配置 ID（编辑场景排除自己；创建场景不传）</p>
     */
    public void setSpecId(String SpecId) {
        this.SpecId = SpecId;
    }

    public CheckJobSpecNameRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckJobSpecNameRequest(CheckJobSpecNameRequest source) {
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
        if (source.SpecId != null) {
            this.SpecId = new String(source.SpecId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamSimple(map, prefix + "SpecId", this.SpecId);

    }
}

