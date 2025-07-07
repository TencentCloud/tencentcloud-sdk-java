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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IotModelData extends AbstractModel {

    /**
    * 版本号
    */
    @SerializedName("Revision")
    @Expose
    private Long Revision;

    /**
    * 发布时间
    */
    @SerializedName("ReleaseTime")
    @Expose
    private Long ReleaseTime;

    /**
     * Get 版本号 
     * @return Revision 版本号
     */
    public Long getRevision() {
        return this.Revision;
    }

    /**
     * Set 版本号
     * @param Revision 版本号
     */
    public void setRevision(Long Revision) {
        this.Revision = Revision;
    }

    /**
     * Get 发布时间 
     * @return ReleaseTime 发布时间
     */
    public Long getReleaseTime() {
        return this.ReleaseTime;
    }

    /**
     * Set 发布时间
     * @param ReleaseTime 发布时间
     */
    public void setReleaseTime(Long ReleaseTime) {
        this.ReleaseTime = ReleaseTime;
    }

    public IotModelData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IotModelData(IotModelData source) {
        if (source.Revision != null) {
            this.Revision = new Long(source.Revision);
        }
        if (source.ReleaseTime != null) {
            this.ReleaseTime = new Long(source.ReleaseTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Revision", this.Revision);
        this.setParamSimple(map, prefix + "ReleaseTime", this.ReleaseTime);

    }
}

