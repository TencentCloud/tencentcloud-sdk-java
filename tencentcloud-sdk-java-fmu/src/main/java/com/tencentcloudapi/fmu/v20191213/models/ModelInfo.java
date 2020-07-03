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
package com.tencentcloudapi.fmu.v20191213.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModelInfo extends AbstractModel{

    /**
    * 唇色素材ID
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * 唇色素材 url 。 LUT 文件 url 5分钟有效。
    */
    @SerializedName("LUTFileUrl")
    @Expose
    private String LUTFileUrl;

    /**
    * 文件描述信息。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 唇色素材ID 
     * @return ModelId 唇色素材ID
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set 唇色素材ID
     * @param ModelId 唇色素材ID
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get 唇色素材 url 。 LUT 文件 url 5分钟有效。 
     * @return LUTFileUrl 唇色素材 url 。 LUT 文件 url 5分钟有效。
     */
    public String getLUTFileUrl() {
        return this.LUTFileUrl;
    }

    /**
     * Set 唇色素材 url 。 LUT 文件 url 5分钟有效。
     * @param LUTFileUrl 唇色素材 url 。 LUT 文件 url 5分钟有效。
     */
    public void setLUTFileUrl(String LUTFileUrl) {
        this.LUTFileUrl = LUTFileUrl;
    }

    /**
     * Get 文件描述信息。 
     * @return Description 文件描述信息。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 文件描述信息。
     * @param Description 文件描述信息。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "LUTFileUrl", this.LUTFileUrl);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

