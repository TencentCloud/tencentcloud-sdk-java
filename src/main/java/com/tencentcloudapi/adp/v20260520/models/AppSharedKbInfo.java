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

public class AppSharedKbInfo extends AbstractModel {

    /**
    * 共享知识库ID
    */
    @SerializedName("KbId")
    @Expose
    private String KbId;

    /**
    * 共享知识库名称
    */
    @SerializedName("KbName")
    @Expose
    private String KbName;

    /**
     * Get 共享知识库ID 
     * @return KbId 共享知识库ID
     */
    public String getKbId() {
        return this.KbId;
    }

    /**
     * Set 共享知识库ID
     * @param KbId 共享知识库ID
     */
    public void setKbId(String KbId) {
        this.KbId = KbId;
    }

    /**
     * Get 共享知识库名称 
     * @return KbName 共享知识库名称
     */
    public String getKbName() {
        return this.KbName;
    }

    /**
     * Set 共享知识库名称
     * @param KbName 共享知识库名称
     */
    public void setKbName(String KbName) {
        this.KbName = KbName;
    }

    public AppSharedKbInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppSharedKbInfo(AppSharedKbInfo source) {
        if (source.KbId != null) {
            this.KbId = new String(source.KbId);
        }
        if (source.KbName != null) {
            this.KbName = new String(source.KbName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KbId", this.KbId);
        this.setParamSimple(map, prefix + "KbName", this.KbName);

    }
}

