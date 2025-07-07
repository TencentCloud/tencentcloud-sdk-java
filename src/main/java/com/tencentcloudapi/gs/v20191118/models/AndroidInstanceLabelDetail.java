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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AndroidInstanceLabelDetail extends AbstractModel {

    /**
    * 标签
    */
    @SerializedName("Label")
    @Expose
    private AndroidInstanceLabel Label;

    /**
    * 标签描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 标签创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 标签 
     * @return Label 标签
     */
    public AndroidInstanceLabel getLabel() {
        return this.Label;
    }

    /**
     * Set 标签
     * @param Label 标签
     */
    public void setLabel(AndroidInstanceLabel Label) {
        this.Label = Label;
    }

    /**
     * Get 标签描述 
     * @return Description 标签描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 标签描述
     * @param Description 标签描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 标签创建时间 
     * @return CreateTime 标签创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 标签创建时间
     * @param CreateTime 标签创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public AndroidInstanceLabelDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AndroidInstanceLabelDetail(AndroidInstanceLabelDetail source) {
        if (source.Label != null) {
            this.Label = new AndroidInstanceLabel(source.Label);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Label.", this.Label);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

