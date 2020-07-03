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

public class CreateAppUsrRequest extends AbstractModel{

    /**
    * 标识用户的唯一ID，防止同一个用户多次注册
    */
    @SerializedName("CunionId")
    @Expose
    private String CunionId;

    /**
     * Get 标识用户的唯一ID，防止同一个用户多次注册 
     * @return CunionId 标识用户的唯一ID，防止同一个用户多次注册
     */
    public String getCunionId() {
        return this.CunionId;
    }

    /**
     * Set 标识用户的唯一ID，防止同一个用户多次注册
     * @param CunionId 标识用户的唯一ID，防止同一个用户多次注册
     */
    public void setCunionId(String CunionId) {
        this.CunionId = CunionId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CunionId", this.CunionId);

    }
}

