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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateDataKeyDescriptionRequest extends AbstractModel {

    /**
    * 数据密钥的唯一标志符
    */
    @SerializedName("DataKeyId")
    @Expose
    private String DataKeyId;

    /**
    * 数据密钥 的描述，最大100字节
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 数据密钥的唯一标志符 
     * @return DataKeyId 数据密钥的唯一标志符
     */
    public String getDataKeyId() {
        return this.DataKeyId;
    }

    /**
     * Set 数据密钥的唯一标志符
     * @param DataKeyId 数据密钥的唯一标志符
     */
    public void setDataKeyId(String DataKeyId) {
        this.DataKeyId = DataKeyId;
    }

    /**
     * Get 数据密钥 的描述，最大100字节 
     * @return Description 数据密钥 的描述，最大100字节
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 数据密钥 的描述，最大100字节
     * @param Description 数据密钥 的描述，最大100字节
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public UpdateDataKeyDescriptionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateDataKeyDescriptionRequest(UpdateDataKeyDescriptionRequest source) {
        if (source.DataKeyId != null) {
            this.DataKeyId = new String(source.DataKeyId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataKeyId", this.DataKeyId);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

