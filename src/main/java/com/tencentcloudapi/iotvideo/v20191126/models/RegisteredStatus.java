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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegisteredStatus extends AbstractModel{

    /**
    * 终端用户的唯一ID
    */
    @SerializedName("CunionId")
    @Expose
    private String CunionId;

    /**
    * 注册状态
    */
    @SerializedName("IsRegisted")
    @Expose
    private Boolean IsRegisted;

    /**
     * Get 终端用户的唯一ID 
     * @return CunionId 终端用户的唯一ID
     */
    public String getCunionId() {
        return this.CunionId;
    }

    /**
     * Set 终端用户的唯一ID
     * @param CunionId 终端用户的唯一ID
     */
    public void setCunionId(String CunionId) {
        this.CunionId = CunionId;
    }

    /**
     * Get 注册状态 
     * @return IsRegisted 注册状态
     */
    public Boolean getIsRegisted() {
        return this.IsRegisted;
    }

    /**
     * Set 注册状态
     * @param IsRegisted 注册状态
     */
    public void setIsRegisted(Boolean IsRegisted) {
        this.IsRegisted = IsRegisted;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CunionId", this.CunionId);
        this.setParamSimple(map, prefix + "IsRegisted", this.IsRegisted);

    }
}

