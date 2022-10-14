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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetAppCustomContentRequest extends AbstractModel{

    /**
    * 自定义内容。
    */
    @SerializedName("CustomContent")
    @Expose
    private AppCustomContent [] CustomContent;

    /**
    * 应用ID。
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
     * Get 自定义内容。 
     * @return CustomContent 自定义内容。
     */
    public AppCustomContent [] getCustomContent() {
        return this.CustomContent;
    }

    /**
     * Set 自定义内容。
     * @param CustomContent 自定义内容。
     */
    public void setCustomContent(AppCustomContent [] CustomContent) {
        this.CustomContent = CustomContent;
    }

    /**
     * Get 应用ID。 
     * @return SdkAppId 应用ID。
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 应用ID。
     * @param SdkAppId 应用ID。
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    public SetAppCustomContentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetAppCustomContentRequest(SetAppCustomContentRequest source) {
        if (source.CustomContent != null) {
            this.CustomContent = new AppCustomContent[source.CustomContent.length];
            for (int i = 0; i < source.CustomContent.length; i++) {
                this.CustomContent[i] = new AppCustomContent(source.CustomContent[i]);
            }
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "CustomContent.", this.CustomContent);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);

    }
}

