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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAigcSubjectOutput extends AbstractModel {

    /**
    * <p>主体ID。</p>
    */
    @SerializedName("SubjectId")
    @Expose
    private String SubjectId;

    /**
    * <p>主体信息。</p>
    */
    @SerializedName("SubjectInfo")
    @Expose
    private String SubjectInfo;

    /**
     * Get <p>主体ID。</p> 
     * @return SubjectId <p>主体ID。</p>
     */
    public String getSubjectId() {
        return this.SubjectId;
    }

    /**
     * Set <p>主体ID。</p>
     * @param SubjectId <p>主体ID。</p>
     */
    public void setSubjectId(String SubjectId) {
        this.SubjectId = SubjectId;
    }

    /**
     * Get <p>主体信息。</p> 
     * @return SubjectInfo <p>主体信息。</p>
     */
    public String getSubjectInfo() {
        return this.SubjectInfo;
    }

    /**
     * Set <p>主体信息。</p>
     * @param SubjectInfo <p>主体信息。</p>
     */
    public void setSubjectInfo(String SubjectInfo) {
        this.SubjectInfo = SubjectInfo;
    }

    public CreateAigcSubjectOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAigcSubjectOutput(CreateAigcSubjectOutput source) {
        if (source.SubjectId != null) {
            this.SubjectId = new String(source.SubjectId);
        }
        if (source.SubjectInfo != null) {
            this.SubjectInfo = new String(source.SubjectInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubjectId", this.SubjectId);
        this.setParamSimple(map, prefix + "SubjectInfo", this.SubjectInfo);

    }
}

