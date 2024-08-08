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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyConsoleSharingRequest extends AbstractModel {

    /**
    * 免密分享链接Id
    */
    @SerializedName("SharingId")
    @Expose
    private String SharingId;

    /**
    * 指定分享链接有效期，单位：毫秒，最长可设定有效期为30天
    */
    @SerializedName("DurationMilliseconds")
    @Expose
    private Long DurationMilliseconds;

    /**
     * Get 免密分享链接Id 
     * @return SharingId 免密分享链接Id
     */
    public String getSharingId() {
        return this.SharingId;
    }

    /**
     * Set 免密分享链接Id
     * @param SharingId 免密分享链接Id
     */
    public void setSharingId(String SharingId) {
        this.SharingId = SharingId;
    }

    /**
     * Get 指定分享链接有效期，单位：毫秒，最长可设定有效期为30天 
     * @return DurationMilliseconds 指定分享链接有效期，单位：毫秒，最长可设定有效期为30天
     */
    public Long getDurationMilliseconds() {
        return this.DurationMilliseconds;
    }

    /**
     * Set 指定分享链接有效期，单位：毫秒，最长可设定有效期为30天
     * @param DurationMilliseconds 指定分享链接有效期，单位：毫秒，最长可设定有效期为30天
     */
    public void setDurationMilliseconds(Long DurationMilliseconds) {
        this.DurationMilliseconds = DurationMilliseconds;
    }

    public ModifyConsoleSharingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyConsoleSharingRequest(ModifyConsoleSharingRequest source) {
        if (source.SharingId != null) {
            this.SharingId = new String(source.SharingId);
        }
        if (source.DurationMilliseconds != null) {
            this.DurationMilliseconds = new Long(source.DurationMilliseconds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SharingId", this.SharingId);
        this.setParamSimple(map, prefix + "DurationMilliseconds", this.DurationMilliseconds);

    }
}

