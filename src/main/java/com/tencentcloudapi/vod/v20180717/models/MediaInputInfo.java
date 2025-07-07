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

public class MediaInputInfo extends AbstractModel {

    /**
    * 视频 URL。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 视频名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 视频自定义 ID。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
     * Get 视频 URL。 
     * @return Url 视频 URL。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 视频 URL。
     * @param Url 视频 URL。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 视频名称。 
     * @return Name 视频名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 视频名称。
     * @param Name 视频名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 视频自定义 ID。 
     * @return Id 视频自定义 ID。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 视频自定义 ID。
     * @param Id 视频自定义 ID。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    public MediaInputInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaInputInfo(MediaInputInfo source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

