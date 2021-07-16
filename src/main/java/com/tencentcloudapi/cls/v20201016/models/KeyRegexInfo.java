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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KeyRegexInfo extends AbstractModel{

    /**
    * 需要过滤日志的key
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * key对应的过滤规则regex
    */
    @SerializedName("Regex")
    @Expose
    private String Regex;

    /**
     * Get 需要过滤日志的key 
     * @return Key 需要过滤日志的key
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 需要过滤日志的key
     * @param Key 需要过滤日志的key
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get key对应的过滤规则regex 
     * @return Regex key对应的过滤规则regex
     */
    public String getRegex() {
        return this.Regex;
    }

    /**
     * Set key对应的过滤规则regex
     * @param Regex key对应的过滤规则regex
     */
    public void setRegex(String Regex) {
        this.Regex = Regex;
    }

    public KeyRegexInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KeyRegexInfo(KeyRegexInfo source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Regex != null) {
            this.Regex = new String(source.Regex);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Regex", this.Regex);

    }
}

