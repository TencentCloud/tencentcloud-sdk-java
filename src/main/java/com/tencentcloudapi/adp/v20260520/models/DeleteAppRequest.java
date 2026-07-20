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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteAppRequest extends AbstractModel {

    /**
    * <p>app_id</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>删除原因(非必填,审批时展示)</p>
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get <p>app_id</p> 
     * @return AppId <p>app_id</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>app_id</p>
     * @param AppId <p>app_id</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>删除原因(非必填,审批时展示)</p> 
     * @return Reason <p>删除原因(非必填,审批时展示)</p>
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set <p>删除原因(非必填,审批时展示)</p>
     * @param Reason <p>删除原因(非必填,审批时展示)</p>
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public DeleteAppRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAppRequest(DeleteAppRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

