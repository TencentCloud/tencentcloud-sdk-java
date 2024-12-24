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
package com.tencentcloudapi.aca.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HealthPrescriptions extends AbstractModel {

    /**
    * 标题
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 健康处方链接
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 关键信息
    */
    @SerializedName("KeyInformation")
    @Expose
    private String KeyInformation;

    /**
     * Get 标题 
     * @return Title 标题
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 标题
     * @param Title 标题
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 健康处方链接 
     * @return Url 健康处方链接
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 健康处方链接
     * @param Url 健康处方链接
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 关键信息 
     * @return KeyInformation 关键信息
     */
    public String getKeyInformation() {
        return this.KeyInformation;
    }

    /**
     * Set 关键信息
     * @param KeyInformation 关键信息
     */
    public void setKeyInformation(String KeyInformation) {
        this.KeyInformation = KeyInformation;
    }

    public HealthPrescriptions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HealthPrescriptions(HealthPrescriptions source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.KeyInformation != null) {
            this.KeyInformation = new String(source.KeyInformation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "KeyInformation", this.KeyInformation);

    }
}

