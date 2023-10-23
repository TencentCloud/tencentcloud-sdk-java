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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateWorkSpaceRequest extends AbstractModel {

    /**
    * 工作空间名称
    */
    @SerializedName("WorkSpaceName")
    @Expose
    private String WorkSpaceName;

    /**
    * 项目空间备注
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 工作空间名称 
     * @return WorkSpaceName 工作空间名称
     */
    public String getWorkSpaceName() {
        return this.WorkSpaceName;
    }

    /**
     * Set 工作空间名称
     * @param WorkSpaceName 工作空间名称
     */
    public void setWorkSpaceName(String WorkSpaceName) {
        this.WorkSpaceName = WorkSpaceName;
    }

    /**
     * Get 项目空间备注 
     * @return Description 项目空间备注
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 项目空间备注
     * @param Description 项目空间备注
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateWorkSpaceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateWorkSpaceRequest(CreateWorkSpaceRequest source) {
        if (source.WorkSpaceName != null) {
            this.WorkSpaceName = new String(source.WorkSpaceName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkSpaceName", this.WorkSpaceName);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

