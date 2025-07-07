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
package com.tencentcloudapi.hasim.v20210716.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTacticsRequest extends AbstractModel {

    /**
    * 策略ID
    */
    @SerializedName("TacticID")
    @Expose
    private Long TacticID;

    /**
    * 策略名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 策略ID 
     * @return TacticID 策略ID
     */
    public Long getTacticID() {
        return this.TacticID;
    }

    /**
     * Set 策略ID
     * @param TacticID 策略ID
     */
    public void setTacticID(Long TacticID) {
        this.TacticID = TacticID;
    }

    /**
     * Get 策略名称 
     * @return Name 策略名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 策略名称
     * @param Name 策略名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public DescribeTacticsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTacticsRequest(DescribeTacticsRequest source) {
        if (source.TacticID != null) {
            this.TacticID = new Long(source.TacticID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TacticID", this.TacticID);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

