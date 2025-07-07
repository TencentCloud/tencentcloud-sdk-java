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
package com.tencentcloudapi.dbbrain.v20191016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SlowLogUser extends AbstractModel {

    /**
    * 来源用户名。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 该来源用户名的慢日志数目占总数目的比例，单位%。
    */
    @SerializedName("Ratio")
    @Expose
    private Float Ratio;

    /**
    * 该来源用户名的慢日志数目。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get 来源用户名。 
     * @return UserName 来源用户名。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 来源用户名。
     * @param UserName 来源用户名。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 该来源用户名的慢日志数目占总数目的比例，单位%。 
     * @return Ratio 该来源用户名的慢日志数目占总数目的比例，单位%。
     */
    public Float getRatio() {
        return this.Ratio;
    }

    /**
     * Set 该来源用户名的慢日志数目占总数目的比例，单位%。
     * @param Ratio 该来源用户名的慢日志数目占总数目的比例，单位%。
     */
    public void setRatio(Float Ratio) {
        this.Ratio = Ratio;
    }

    /**
     * Get 该来源用户名的慢日志数目。 
     * @return Count 该来源用户名的慢日志数目。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 该来源用户名的慢日志数目。
     * @param Count 该来源用户名的慢日志数目。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public SlowLogUser() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SlowLogUser(SlowLogUser source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Ratio != null) {
            this.Ratio = new Float(source.Ratio);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Ratio", this.Ratio);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

