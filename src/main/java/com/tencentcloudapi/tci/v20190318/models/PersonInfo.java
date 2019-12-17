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
package com.tencentcloudapi.tci.v20190318.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PersonInfo extends AbstractModel{

    /**
    * 需要匹配的人员的ID列表。
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * 视频集锦开始封面照片。
    */
    @SerializedName("CoverBeginUrl")
    @Expose
    private String CoverBeginUrl;

    /**
    * 视频集锦结束封面照片。
    */
    @SerializedName("CoverEndUrl")
    @Expose
    private String CoverEndUrl;

    /**
     * Get 需要匹配的人员的ID列表。 
     * @return PersonId 需要匹配的人员的ID列表。
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set 需要匹配的人员的ID列表。
     * @param PersonId 需要匹配的人员的ID列表。
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get 视频集锦开始封面照片。 
     * @return CoverBeginUrl 视频集锦开始封面照片。
     */
    public String getCoverBeginUrl() {
        return this.CoverBeginUrl;
    }

    /**
     * Set 视频集锦开始封面照片。
     * @param CoverBeginUrl 视频集锦开始封面照片。
     */
    public void setCoverBeginUrl(String CoverBeginUrl) {
        this.CoverBeginUrl = CoverBeginUrl;
    }

    /**
     * Get 视频集锦结束封面照片。 
     * @return CoverEndUrl 视频集锦结束封面照片。
     */
    public String getCoverEndUrl() {
        return this.CoverEndUrl;
    }

    /**
     * Set 视频集锦结束封面照片。
     * @param CoverEndUrl 视频集锦结束封面照片。
     */
    public void setCoverEndUrl(String CoverEndUrl) {
        this.CoverEndUrl = CoverEndUrl;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "CoverBeginUrl", this.CoverBeginUrl);
        this.setParamSimple(map, prefix + "CoverEndUrl", this.CoverEndUrl);

    }
}

