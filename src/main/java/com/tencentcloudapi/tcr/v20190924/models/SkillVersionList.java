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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SkillVersionList extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 
    */
    @SerializedName("PushTime")
    @Expose
    private String PushTime;

    /**
     * Get  
     * @return Version 
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 
     * @param Version 
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get  
     * @return Size 
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 
     * @param Size 
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get  
     * @return PushTime 
     */
    public String getPushTime() {
        return this.PushTime;
    }

    /**
     * Set 
     * @param PushTime 
     */
    public void setPushTime(String PushTime) {
        this.PushTime = PushTime;
    }

    public SkillVersionList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkillVersionList(SkillVersionList source) {
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.PushTime != null) {
            this.PushTime = new String(source.PushTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "PushTime", this.PushTime);

    }
}

