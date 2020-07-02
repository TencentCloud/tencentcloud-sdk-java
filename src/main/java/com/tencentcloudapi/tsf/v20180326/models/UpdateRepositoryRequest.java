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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateRepositoryRequest extends AbstractModel{

    /**
    * 仓库ID
    */
    @SerializedName("RepositoryId")
    @Expose
    private String RepositoryId;

    /**
    * 仓库描述
    */
    @SerializedName("RepositoryDesc")
    @Expose
    private String RepositoryDesc;

    /**
     * Get 仓库ID 
     * @return RepositoryId 仓库ID
     */
    public String getRepositoryId() {
        return this.RepositoryId;
    }

    /**
     * Set 仓库ID
     * @param RepositoryId 仓库ID
     */
    public void setRepositoryId(String RepositoryId) {
        this.RepositoryId = RepositoryId;
    }

    /**
     * Get 仓库描述 
     * @return RepositoryDesc 仓库描述
     */
    public String getRepositoryDesc() {
        return this.RepositoryDesc;
    }

    /**
     * Set 仓库描述
     * @param RepositoryDesc 仓库描述
     */
    public void setRepositoryDesc(String RepositoryDesc) {
        this.RepositoryDesc = RepositoryDesc;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RepositoryId", this.RepositoryId);
        this.setParamSimple(map, prefix + "RepositoryDesc", this.RepositoryDesc);

    }
}

