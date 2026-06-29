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

public class LogRuleKeyValueInfo extends AbstractModel {

    /**
    * <p>大小写敏感</p>
    */
    @SerializedName("CaseSensitive")
    @Expose
    private Boolean CaseSensitive;

    /**
    * <p>键值索引信息</p>
    */
    @SerializedName("KeyValues")
    @Expose
    private LogKeyValueInfo [] KeyValues;

    /**
     * Get <p>大小写敏感</p> 
     * @return CaseSensitive <p>大小写敏感</p>
     */
    public Boolean getCaseSensitive() {
        return this.CaseSensitive;
    }

    /**
     * Set <p>大小写敏感</p>
     * @param CaseSensitive <p>大小写敏感</p>
     */
    public void setCaseSensitive(Boolean CaseSensitive) {
        this.CaseSensitive = CaseSensitive;
    }

    /**
     * Get <p>键值索引信息</p> 
     * @return KeyValues <p>键值索引信息</p>
     */
    public LogKeyValueInfo [] getKeyValues() {
        return this.KeyValues;
    }

    /**
     * Set <p>键值索引信息</p>
     * @param KeyValues <p>键值索引信息</p>
     */
    public void setKeyValues(LogKeyValueInfo [] KeyValues) {
        this.KeyValues = KeyValues;
    }

    public LogRuleKeyValueInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogRuleKeyValueInfo(LogRuleKeyValueInfo source) {
        if (source.CaseSensitive != null) {
            this.CaseSensitive = new Boolean(source.CaseSensitive);
        }
        if (source.KeyValues != null) {
            this.KeyValues = new LogKeyValueInfo[source.KeyValues.length];
            for (int i = 0; i < source.KeyValues.length; i++) {
                this.KeyValues[i] = new LogKeyValueInfo(source.KeyValues[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CaseSensitive", this.CaseSensitive);
        this.setParamArrayObj(map, prefix + "KeyValues.", this.KeyValues);

    }
}

