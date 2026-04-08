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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QuestionOption extends AbstractModel {

    /**
    * <p>选项的标签</p>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * <p>选项的描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get <p>选项的标签</p> 
     * @return Label <p>选项的标签</p>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set <p>选项的标签</p>
     * @param Label <p>选项的标签</p>
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get <p>选项的描述</p> 
     * @return Description <p>选项的描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>选项的描述</p>
     * @param Description <p>选项的描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public QuestionOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QuestionOption(QuestionOption source) {
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

