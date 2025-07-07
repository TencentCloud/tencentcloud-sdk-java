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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResumeInstanceRequest extends AbstractModel {

    /**
    * 需要恢复的实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 修改是否包括白名单
    */
    @SerializedName("IsModifyAll")
    @Expose
    private Boolean IsModifyAll;

    /**
     * Get 需要恢复的实例id 
     * @return InstanceId 需要恢复的实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 需要恢复的实例id
     * @param InstanceId 需要恢复的实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 修改是否包括白名单 
     * @return IsModifyAll 修改是否包括白名单
     */
    public Boolean getIsModifyAll() {
        return this.IsModifyAll;
    }

    /**
     * Set 修改是否包括白名单
     * @param IsModifyAll 修改是否包括白名单
     */
    public void setIsModifyAll(Boolean IsModifyAll) {
        this.IsModifyAll = IsModifyAll;
    }

    public ResumeInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResumeInstanceRequest(ResumeInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.IsModifyAll != null) {
            this.IsModifyAll = new Boolean(source.IsModifyAll);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "IsModifyAll", this.IsModifyAll);

    }
}

