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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImportMaterialResponse extends AbstractModel{

    /**
    * 素材 Id。
    */
    @SerializedName("MaterialId")
    @Expose
    private String MaterialId;

    /**
    * 素材预处理任务 ID，如果未指定发起预处理任务则为空。
    */
    @SerializedName("PreProcessTaskId")
    @Expose
    private String PreProcessTaskId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 素材 Id。 
     * @return MaterialId 素材 Id。
     */
    public String getMaterialId() {
        return this.MaterialId;
    }

    /**
     * Set 素材 Id。
     * @param MaterialId 素材 Id。
     */
    public void setMaterialId(String MaterialId) {
        this.MaterialId = MaterialId;
    }

    /**
     * Get 素材预处理任务 ID，如果未指定发起预处理任务则为空。 
     * @return PreProcessTaskId 素材预处理任务 ID，如果未指定发起预处理任务则为空。
     */
    public String getPreProcessTaskId() {
        return this.PreProcessTaskId;
    }

    /**
     * Set 素材预处理任务 ID，如果未指定发起预处理任务则为空。
     * @param PreProcessTaskId 素材预处理任务 ID，如果未指定发起预处理任务则为空。
     */
    public void setPreProcessTaskId(String PreProcessTaskId) {
        this.PreProcessTaskId = PreProcessTaskId;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaterialId", this.MaterialId);
        this.setParamSimple(map, prefix + "PreProcessTaskId", this.PreProcessTaskId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

