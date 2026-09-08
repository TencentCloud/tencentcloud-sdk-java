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

public class RelationLogset extends AbstractModel {

    /**
    * <p>日志集id</p>
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * <p>日志集名称</p>
    */
    @SerializedName("LogsetName")
    @Expose
    private String LogsetName;

    /**
     * Get <p>日志集id</p> 
     * @return LogsetId <p>日志集id</p>
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set <p>日志集id</p>
     * @param LogsetId <p>日志集id</p>
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get <p>日志集名称</p> 
     * @return LogsetName <p>日志集名称</p>
     */
    public String getLogsetName() {
        return this.LogsetName;
    }

    /**
     * Set <p>日志集名称</p>
     * @param LogsetName <p>日志集名称</p>
     */
    public void setLogsetName(String LogsetName) {
        this.LogsetName = LogsetName;
    }

    public RelationLogset() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RelationLogset(RelationLogset source) {
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.LogsetName != null) {
            this.LogsetName = new String(source.LogsetName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "LogsetName", this.LogsetName);

    }
}

