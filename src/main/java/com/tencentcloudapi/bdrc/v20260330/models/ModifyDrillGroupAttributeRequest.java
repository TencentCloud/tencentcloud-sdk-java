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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDrillGroupAttributeRequest extends AbstractModel {

    /**
    * 要修改属性的容灾演练组id。
    */
    @SerializedName("DrillGroupId")
    @Expose
    private String DrillGroupId;

    /**
    * 修改容灾演练组名称（长度最大支持 64 个字符）
    */
    @SerializedName("DrillGroupName")
    @Expose
    private String DrillGroupName;

    /**
     * Get 要修改属性的容灾演练组id。 
     * @return DrillGroupId 要修改属性的容灾演练组id。
     */
    public String getDrillGroupId() {
        return this.DrillGroupId;
    }

    /**
     * Set 要修改属性的容灾演练组id。
     * @param DrillGroupId 要修改属性的容灾演练组id。
     */
    public void setDrillGroupId(String DrillGroupId) {
        this.DrillGroupId = DrillGroupId;
    }

    /**
     * Get 修改容灾演练组名称（长度最大支持 64 个字符） 
     * @return DrillGroupName 修改容灾演练组名称（长度最大支持 64 个字符）
     */
    public String getDrillGroupName() {
        return this.DrillGroupName;
    }

    /**
     * Set 修改容灾演练组名称（长度最大支持 64 个字符）
     * @param DrillGroupName 修改容灾演练组名称（长度最大支持 64 个字符）
     */
    public void setDrillGroupName(String DrillGroupName) {
        this.DrillGroupName = DrillGroupName;
    }

    public ModifyDrillGroupAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDrillGroupAttributeRequest(ModifyDrillGroupAttributeRequest source) {
        if (source.DrillGroupId != null) {
            this.DrillGroupId = new String(source.DrillGroupId);
        }
        if (source.DrillGroupName != null) {
            this.DrillGroupName = new String(source.DrillGroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DrillGroupId", this.DrillGroupId);
        this.setParamSimple(map, prefix + "DrillGroupName", this.DrillGroupName);

    }
}

