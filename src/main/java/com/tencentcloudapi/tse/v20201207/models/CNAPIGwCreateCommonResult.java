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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CNAPIGwCreateCommonResult extends AbstractModel {

    /**
    * 是否成功
    */
    @SerializedName("Success")
    @Expose
    private Boolean Success;

    /**
    * 对应的id 值
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
     * Get 是否成功 
     * @return Success 是否成功
     */
    public Boolean getSuccess() {
        return this.Success;
    }

    /**
     * Set 是否成功
     * @param Success 是否成功
     */
    public void setSuccess(Boolean Success) {
        this.Success = Success;
    }

    /**
     * Get 对应的id 值 
     * @return ID 对应的id 值
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set 对应的id 值
     * @param ID 对应的id 值
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    public CNAPIGwCreateCommonResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CNAPIGwCreateCommonResult(CNAPIGwCreateCommonResult source) {
        if (source.Success != null) {
            this.Success = new Boolean(source.Success);
        }
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Success", this.Success);
        this.setParamSimple(map, prefix + "ID", this.ID);

    }
}

