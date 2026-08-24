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

public class ModifyDrillPairAttributeRequest extends AbstractModel {

    /**
    * 要修改属性的容灾演练对id
    */
    @SerializedName("DrillPairId")
    @Expose
    private String DrillPairId;

    /**
    * 修改容灾演练对名称（长度最大支持 64 个字符）
    */
    @SerializedName("DrillPairName")
    @Expose
    private String DrillPairName;

    /**
     * Get 要修改属性的容灾演练对id 
     * @return DrillPairId 要修改属性的容灾演练对id
     */
    public String getDrillPairId() {
        return this.DrillPairId;
    }

    /**
     * Set 要修改属性的容灾演练对id
     * @param DrillPairId 要修改属性的容灾演练对id
     */
    public void setDrillPairId(String DrillPairId) {
        this.DrillPairId = DrillPairId;
    }

    /**
     * Get 修改容灾演练对名称（长度最大支持 64 个字符） 
     * @return DrillPairName 修改容灾演练对名称（长度最大支持 64 个字符）
     */
    public String getDrillPairName() {
        return this.DrillPairName;
    }

    /**
     * Set 修改容灾演练对名称（长度最大支持 64 个字符）
     * @param DrillPairName 修改容灾演练对名称（长度最大支持 64 个字符）
     */
    public void setDrillPairName(String DrillPairName) {
        this.DrillPairName = DrillPairName;
    }

    public ModifyDrillPairAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDrillPairAttributeRequest(ModifyDrillPairAttributeRequest source) {
        if (source.DrillPairId != null) {
            this.DrillPairId = new String(source.DrillPairId);
        }
        if (source.DrillPairName != null) {
            this.DrillPairName = new String(source.DrillPairName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DrillPairId", this.DrillPairId);
        this.setParamSimple(map, prefix + "DrillPairName", this.DrillPairName);

    }
}

