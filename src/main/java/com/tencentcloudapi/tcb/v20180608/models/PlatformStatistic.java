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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PlatformStatistic extends AbstractModel {

    /**
    * 终端用户从属平台
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 平台终端用户数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 终端用户从属平台 
     * @return Platform 终端用户从属平台
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 终端用户从属平台
     * @param Platform 终端用户从属平台
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 平台终端用户数 
     * @return Count 平台终端用户数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 平台终端用户数
     * @param Count 平台终端用户数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public PlatformStatistic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PlatformStatistic(PlatformStatistic source) {
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

