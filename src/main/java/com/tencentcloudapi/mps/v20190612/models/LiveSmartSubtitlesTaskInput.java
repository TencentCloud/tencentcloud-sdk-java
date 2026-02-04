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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LiveSmartSubtitlesTaskInput extends AbstractModel {

    /**
    * 智能字幕模板 ID 。	
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 用户扩展字段，一般场景不用填。
    */
    @SerializedName("UserExtPara")
    @Expose
    private String UserExtPara;

    /**
     * Get 智能字幕模板 ID 。	 
     * @return Definition 智能字幕模板 ID 。	
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 智能字幕模板 ID 。	
     * @param Definition 智能字幕模板 ID 。	
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 用户扩展字段，一般场景不用填。 
     * @return UserExtPara 用户扩展字段，一般场景不用填。
     */
    public String getUserExtPara() {
        return this.UserExtPara;
    }

    /**
     * Set 用户扩展字段，一般场景不用填。
     * @param UserExtPara 用户扩展字段，一般场景不用填。
     */
    public void setUserExtPara(String UserExtPara) {
        this.UserExtPara = UserExtPara;
    }

    public LiveSmartSubtitlesTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveSmartSubtitlesTaskInput(LiveSmartSubtitlesTaskInput source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.UserExtPara != null) {
            this.UserExtPara = new String(source.UserExtPara);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "UserExtPara", this.UserExtPara);

    }
}

