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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccessKeyAlarmCount extends AbstractModel {

    /**
    * 访问密钥的ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 访问密钥
    */
    @SerializedName("AccessKey")
    @Expose
    private String AccessKey;

    /**
    * 告警数量
    */
    @SerializedName("AlarmCount")
    @Expose
    private Long AlarmCount;

    /**
     * Get 访问密钥的ID 
     * @return ID 访问密钥的ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 访问密钥的ID
     * @param ID 访问密钥的ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 访问密钥 
     * @return AccessKey 访问密钥
     */
    public String getAccessKey() {
        return this.AccessKey;
    }

    /**
     * Set 访问密钥
     * @param AccessKey 访问密钥
     */
    public void setAccessKey(String AccessKey) {
        this.AccessKey = AccessKey;
    }

    /**
     * Get 告警数量 
     * @return AlarmCount 告警数量
     */
    public Long getAlarmCount() {
        return this.AlarmCount;
    }

    /**
     * Set 告警数量
     * @param AlarmCount 告警数量
     */
    public void setAlarmCount(Long AlarmCount) {
        this.AlarmCount = AlarmCount;
    }

    public AccessKeyAlarmCount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessKeyAlarmCount(AccessKeyAlarmCount source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.AccessKey != null) {
            this.AccessKey = new String(source.AccessKey);
        }
        if (source.AlarmCount != null) {
            this.AlarmCount = new Long(source.AlarmCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "AccessKey", this.AccessKey);
        this.setParamSimple(map, prefix + "AlarmCount", this.AlarmCount);

    }
}

