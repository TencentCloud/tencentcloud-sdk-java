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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ThumbnailURLInfoList extends AbstractModel {

    /**
    * 缩略图访问地址
    */
    @SerializedName("ThumbnailURL")
    @Expose
    private String ThumbnailURL;

    /**
    * 缩略图访问地址的过期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
     * Get 缩略图访问地址 
     * @return ThumbnailURL 缩略图访问地址
     */
    public String getThumbnailURL() {
        return this.ThumbnailURL;
    }

    /**
     * Set 缩略图访问地址
     * @param ThumbnailURL 缩略图访问地址
     */
    public void setThumbnailURL(String ThumbnailURL) {
        this.ThumbnailURL = ThumbnailURL;
    }

    /**
     * Get 缩略图访问地址的过期时间 
     * @return ExpireTime 缩略图访问地址的过期时间
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 缩略图访问地址的过期时间
     * @param ExpireTime 缩略图访问地址的过期时间
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    public ThumbnailURLInfoList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ThumbnailURLInfoList(ThumbnailURLInfoList source) {
        if (source.ThumbnailURL != null) {
            this.ThumbnailURL = new String(source.ThumbnailURL);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ThumbnailURL", this.ThumbnailURL);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}

