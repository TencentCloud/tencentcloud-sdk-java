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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApiSecEventChange extends AbstractModel {

    /**
    * 变更人
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 变更的状态
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 时间戳
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 变更人 
     * @return UserName 变更人
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 变更人
     * @param UserName 变更人
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 变更的状态 
     * @return Mode 变更的状态
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 变更的状态
     * @param Mode 变更的状态
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 时间戳 
     * @return Timestamp 时间戳
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 时间戳
     * @param Timestamp 时间戳
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public ApiSecEventChange() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiSecEventChange(ApiSecEventChange source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

