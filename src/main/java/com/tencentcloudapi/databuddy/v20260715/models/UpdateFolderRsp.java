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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateFolderRsp extends AbstractModel {

    /**
    * <p>更新文件夹结果，true为成功</p>
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
     * Get <p>更新文件夹结果，true为成功</p> 
     * @return Status <p>更新文件夹结果，true为成功</p>
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set <p>更新文件夹结果，true为成功</p>
     * @param Status <p>更新文件夹结果，true为成功</p>
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    public UpdateFolderRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateFolderRsp(UpdateFolderRsp source) {
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

