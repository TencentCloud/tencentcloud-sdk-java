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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifiableInfo extends AbstractModel {

    /**
    * 参数是否可被修改, 1:可以 0:不可以
    */
    @SerializedName("IsModifiable")
    @Expose
    private Long IsModifiable;

    /**
     * Get 参数是否可被修改, 1:可以 0:不可以 
     * @return IsModifiable 参数是否可被修改, 1:可以 0:不可以
     */
    public Long getIsModifiable() {
        return this.IsModifiable;
    }

    /**
     * Set 参数是否可被修改, 1:可以 0:不可以
     * @param IsModifiable 参数是否可被修改, 1:可以 0:不可以
     */
    public void setIsModifiable(Long IsModifiable) {
        this.IsModifiable = IsModifiable;
    }

    public ModifiableInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifiableInfo(ModifiableInfo source) {
        if (source.IsModifiable != null) {
            this.IsModifiable = new Long(source.IsModifiable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsModifiable", this.IsModifiable);

    }
}

