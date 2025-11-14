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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserKafkaMeta extends AbstractModel {

    /**
    * 用户kafka version
支持如下版本：
  - 0.10.2.0
  - 1.0.0
  - 2.0.0
  - 2.2.0
  - 2.4.0
  - 2.6.0
  - 2.7.0
  - 2.8.0
  - 3.0.0
  - 3.2.0
    */
    @SerializedName("KafkaVersion")
    @Expose
    private String KafkaVersion;

    /**
     * Get 用户kafka version
支持如下版本：
  - 0.10.2.0
  - 1.0.0
  - 2.0.0
  - 2.2.0
  - 2.4.0
  - 2.6.0
  - 2.7.0
  - 2.8.0
  - 3.0.0
  - 3.2.0 
     * @return KafkaVersion 用户kafka version
支持如下版本：
  - 0.10.2.0
  - 1.0.0
  - 2.0.0
  - 2.2.0
  - 2.4.0
  - 2.6.0
  - 2.7.0
  - 2.8.0
  - 3.0.0
  - 3.2.0
     */
    public String getKafkaVersion() {
        return this.KafkaVersion;
    }

    /**
     * Set 用户kafka version
支持如下版本：
  - 0.10.2.0
  - 1.0.0
  - 2.0.0
  - 2.2.0
  - 2.4.0
  - 2.6.0
  - 2.7.0
  - 2.8.0
  - 3.0.0
  - 3.2.0
     * @param KafkaVersion 用户kafka version
支持如下版本：
  - 0.10.2.0
  - 1.0.0
  - 2.0.0
  - 2.2.0
  - 2.4.0
  - 2.6.0
  - 2.7.0
  - 2.8.0
  - 3.0.0
  - 3.2.0
     */
    public void setKafkaVersion(String KafkaVersion) {
        this.KafkaVersion = KafkaVersion;
    }

    public UserKafkaMeta() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserKafkaMeta(UserKafkaMeta source) {
        if (source.KafkaVersion != null) {
            this.KafkaVersion = new String(source.KafkaVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KafkaVersion", this.KafkaVersion);

    }
}

