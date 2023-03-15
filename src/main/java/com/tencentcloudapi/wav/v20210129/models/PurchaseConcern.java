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
package com.tencentcloudapi.wav.v20210129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PurchaseConcern extends AbstractModel{

    /**
    * 购车关注点code
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 购车关注点描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 购车关注点code 
     * @return Code 购车关注点code
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 购车关注点code
     * @param Code 购车关注点code
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 购车关注点描述 
     * @return Description 购车关注点描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 购车关注点描述
     * @param Description 购车关注点描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public PurchaseConcern() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PurchaseConcern(PurchaseConcern source) {
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

